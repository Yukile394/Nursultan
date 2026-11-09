package minecraft;

import java.nio.file.FileSystem;
import java.nio.file.PathMatcher;
import java.util.Optional;

public record class04170(class04186 type, String pattern) {
   static class04170 L(String var0) {
      return new class04170(class04186.N, "regex:" + var0);
   }

   public class04170(class04186 type, String pattern) {
      this.type = type;
      this.pattern = pattern;
   }

   static class04170 u(String var0) {
      return new class04170(class04186.y, var0);
   }

   public String y() {
      return this.pattern;
   }

   static class04170 y(String var0) {
      return new class04170(class04186.N, "glob:" + var0);
   }

   public PathMatcher N(FileSystem var1) {
      return this.N().compile(var1, this.pattern);
   }

   public class04186 N() {
      return this.type;
   }

   static Optional<class04170> N(String var0) {
      if (var0.isBlank() || var0.startsWith("#")) {
         return Optional.empty();
      } else if (!var0.startsWith("[")) {
         return Optional.of(new class04170(class04186.y, var0));
      } else {
         int i = var0.indexOf(93, 1);
         if (i == -1) {
            throw new IllegalArgumentException("Unterminated type in line '" + var0 + "'");
         } else {
            String s = var0.substring(1, i);
            String s1 = var0.substring(i + 1);

            return switch (s) {
               case "glob", "regex" -> Optional.of(new class04170(class04186.N, s + ":" + s1));
               case "prefix" -> Optional.of(new class04170(class04186.y, s1));
               default -> throw new IllegalArgumentException("Unsupported definition type in line '" + var0 + "'");
            };
         }
      }
   }
}
