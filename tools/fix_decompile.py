# Python 3, tools/fix_decompile.py, repo root'tan calistir: python3 tools/fix_decompile.py
# Vineflower artefaktlari: bos generic cast ve "Unable to resugar constructor"
import re, sys
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent / "src" / "main" / "java"

CAST_START = re.compile(r"\(\s*([A-Za-z_][\w.$]*)\s*<")
BAD_GENERIC = re.compile(r"<\s*>|<\s*,|,\s*>|,\s*,")
RESUGAR = re.compile(r"([A-Za-z_][\w.$]*)\s*\.\s*/\*\s*\$VF: Unable to resugar constructor\s*\*/\s*<init>\s*\(")

def fix_generic_casts(text):
    out, i, n, count = [], 0, len(text), 0
    pos = 0
    while True:
        m = CAST_START.search(text, pos)
        if not m:
            out.append(text[pos:])
            break
        start = m.start()
        j = m.end()          # "<" den hemen sonra
        depth = 1
        ok = False
        while j < n:
            c = text[j]
            if c in "();{}&|=\n":
                break
            if c == "<":
                depth += 1
            elif c == ">":
                depth -= 1
                if depth == 0:
                    ok = True
                    break
            j += 1
        if not ok:
            out.append(text[pos:m.end()])
            pos = m.end()
            continue
        k = j + 1
        while k < n and text[k] in " \t":
            k += 1
        if k >= n or text[k] != ")":
            out.append(text[pos:m.end()])
            pos = m.end()
            continue
        region = text[m.end() - 1:j + 1]   # "<...>"
        if BAD_GENERIC.search(region):
            out.append(text[pos:start])
            out.append("(" + m.group(1) + ")")
            pos = k + 1
            count += 1
        else:
            out.append(text[pos:k + 1])
            pos = k + 1
    return "".join(out), count

def main():
    files = changed = c_cast = c_res = 0
    for p in ROOT.rglob("*.java"):
        files += 1
        s = p.read_text(encoding="utf-8", errors="surrogateescape")
        orig = s
        s, a = fix_generic_casts(s)
        s, b = RESUGAR.subn(r"new \1(", s)
        c_cast += a
        c_res += b
        if s != orig:
            p.write_text(s, encoding="utf-8", errors="surrogateescape")
            changed += 1
    print(f"taranan: {files}, degisen dosya: {changed}, generic cast: {c_cast}, resugar: {c_res}")
    return 0

if __name__ == "__main__":
    sys.exit(main())
