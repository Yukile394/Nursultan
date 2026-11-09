package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public record class05086(class01894 id) {
   private static final List<class05086> Z = new ArrayList<>();
   public static final class05086 N = N("player");
   public static final class05086 y = N("mobs");
   public static final class05086 L = N("spawning");
   public static final class05086 u = N("drops");
   public static final class05086 i = N("updates");
   public static final class05086 R = N("chat");
   public static final class05086 M = N("misc");

   public class01894 L() {
      return this.id;
   }

   public class05086(class01894 id) {
      this.id = id;
   }

   public class05216 y() {
      return class00392.L(this.id.B("gamerule.category"));
   }

   public static class05086 N(class01894 var0) {
      class05086 class05086 = new class05086(var0);
      if (Z.contains(class05086)) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Category '%s' is already registered.", var0));
      } else {
         Z.add(class05086);
         return class05086;
      }
   }

   public class01894 N() {
      return this.id;
   }

   private static class05086 N(String var0) {
      return N(class01894.y(var0));
   }
}
