# Python 3, tools/fix_decompile.py, repo root'tan calistir: python3 tools/fix_decompile.py
# Vineflower artefaktlari: bos generic cast, bolunmus new/<init>, non-sealed record,
# sabitsiz enum, javac hata limiti. Tekrar calistirmak guvenli (idempotent).
import re, sys
from pathlib import Path

REPO = Path(__file__).resolve().parent.parent
ROOT = REPO / "src" / "main" / "java"

CAST_START = re.compile(r"\(\s*([A-Za-z_][\w.$]*)\s*<")
BAD_GENERIC = re.compile(r"<\s*>|<\s*,|,\s*>|,\s*,")
BROKEN_NEW = re.compile(r"\bnew\s+([A-Za-z_][\w.$]*)\s*;")
RESUGAR = re.compile(r"([A-Za-z_][\w.$]*)\s*\.\s*/\*\s*\$VF: Unable to resugar constructor\s*\*/\s*<init>\s*\(")
NON_SEALED_RECORD = re.compile(r"\bnon-sealed\s+(?=record\b)")
ENUM_HEAD = re.compile(
    r"^(?P<pre>[ \t]*(?:(?:public|protected|private|static|final|abstract)\s+)*)enum(?P<mid>\s+[A-Za-z_]\w*[^{;]*\{)(?P<body>\s*(?://[^\n]*\n\s*|/\*.*?\*/\s*)*)(?P<first>@|(?:public|private|protected|static|final|abstract|synchronized|transient|volatile|void|int|long|boolean|byte|short|char|float|double|String|Object)\b)",
    re.M | re.S)

def fix_generic_casts(text):
    out, pos, n, count = [], 0, len(text), 0
    while True:
        m = CAST_START.search(text, pos)
        if not m:
            out.append(text[pos:])
            break
        j, depth, ok = m.end(), 1, False
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
            out.append(text[pos:m.end()]); pos = m.end(); continue
        k = j + 1
        while k < n and text[k] in " \t":
            k += 1
        if k >= n or text[k] != ")":
            out.append(text[pos:m.end()]); pos = m.end(); continue
        if BAD_GENERIC.search(text[m.end() - 1:j + 1]):
            out.append(text[pos:m.start()]); out.append("(" + m.group(1) + ")")
            pos = k + 1; count += 1
        else:
            out.append(text[pos:k + 1]); pos = k + 1
    return "".join(out), count

def balanced_args(text, open_idx):
    """open_idx '(' konumu; (args, '(' ile eslesen ')' sonrasi indeks) dondurur."""
    depth, i, n, in_str, q = 0, open_idx, len(text), False, ""
    while i < n:
        c = text[i]
        if in_str:
            if c == "\\":
                i += 1
            elif c == q:
                in_str = False
        elif c in "\"'":
            in_str, q = True, c
        elif c == "(":
            depth += 1
        elif c == ")":
            depth -= 1
            if depth == 0:
                return text[open_idx + 1:i], i + 1
        i += 1
    return None, None

def merge_split_new(text):
    """'T v = new T;' + (sonraki) 'T.<init>(args);' veya 'new T(args);' -> 'T v = new T(args);'"""
    count, search_from = 0, 0
    while True:
        m = BROKEN_NEW.search(text, search_from)
        if not m:
            break
        t = m.group(1)
        tt = re.escape(t)
        call1 = re.compile(r"(?m)^[ \t]*new\s+" + tt + r"\s*\(")
        call2 = re.compile(r"(?m)^[ \t]*" + tt + r"\s*\.\s*/\*\s*\$VF: Unable to resugar constructor\s*\*/\s*<init>\s*\(")
        window_end = m.end() + 3000
        cands = []
        for rx in (call1, call2):
            c = rx.search(text, m.end(), window_end)
            if c:
                cands.append(c)
        if not cands:
            search_from = m.end()
            continue
        c = min(cands, key=lambda x: x.start())
        args, after = balanced_args(text, c.end() - 1)
        if args is None:
            search_from = m.end(); continue
        k = after
        while k < len(text) and text[k] in " \t":
            k += 1
        if k >= len(text) or text[k] != ";":
            search_from = m.end(); continue
        k += 1
        if k < len(text) and text[k] == "\r":
            k += 1
        if k < len(text) and text[k] == "\n":
            k += 1
        text = text[:c.start()] + text[k:]
        text = text[:m.start()] + f"new {t}({args.strip()});" + text[m.end():]
        count += 1
        search_from = m.start() + 1
    return text, count

def fix_enums(text):
    m = ENUM_HEAD.search(text)
    if not m:
        return text, 0
    new = text[:m.start()] + m.group("pre") + "class" + m.group("mid") + m.group("body") + m.group("first") + text[m.end():]
    return new, 1

def patch_build_gradle():
    p = REPO / "build.gradle"
    if not p.exists():
        return False
    s = p.read_text(encoding="utf-8")
    if "-Xmaxerrs" in s:
        return False
    needle = "it.options.release = targetJavaVersion"
    if needle not in s:
        return False
    s = s.replace(needle, needle + '\n    it.options.compilerArgs += ["-Xmaxerrs", "100000"]', 1)
    p.write_text(s, encoding="utf-8")
    return True

def main():
    files = changed = 0
    tot = dict(cast=0, new=0, resugar=0, nsrec=0, enum=0)
    unknown_hits = []
    for p in sorted(ROOT.rglob("*.java")):
        files += 1
        s = p.read_text(encoding="utf-8", errors="surrogateescape")
        orig = s
        s, a = fix_generic_casts(s)
        s, b = merge_split_new(s)
        s, r = RESUGAR.subn(r"new \1(", s)
        s, c = NON_SEALED_RECORD.subn("", s)
        s, e = fix_enums(s)
        tot["cast"] += a; tot["new"] += b; tot["resugar"] += r; tot["nsrec"] += c; tot["enum"] += e
        if s != orig:
            p.write_text(s, encoding="utf-8", errors="surrogateescape")
            changed += 1
        if "<unknown>" in s:
            lines = s.split("\n")
            for i, ln in enumerate(lines):
                if "<unknown>" in ln:
                    unknown_hits.append((p.relative_to(ROOT), i + 1, lines[max(0, i - 8):i + 4]))
    gr = patch_build_gradle()
    print(f"taranan: {files}, degisen dosya: {changed}, {tot}, build.gradle yamandi: {gr}")
    print(f"<unknown> kalan: {len(unknown_hits)}")
    for path, ln, ctx in unknown_hits[:25]:
        print(f"\n=== {path}:{ln} ===")
        print("\n".join(ctx))
    return 0

if __name__ == "__main__":
    sys.exit(main())
    
