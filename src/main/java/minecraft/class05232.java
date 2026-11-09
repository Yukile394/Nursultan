package minecraft;

import java.util.Optional;

public class class05232 {
   private static final char N = '�';
   private static final Optional<Object> y = Optional.of(class06244.field_17274);

   public static boolean L(String var0, class00405 var1, class05197 var2) {
      return N(var0, 0, var1, var2);
   }

   public class05232() {
      super();
   }

   public static boolean y(String var0, class00405 var1, class05197 var2) {
      for (int i = var0.length() - 1; i >= 0; i--) {
         char c0 = var0.charAt(i);
         if (Character.isLowSurrogate(c0)) {
            if (i - 1 < 0) {
               if (!var2.accept(0, var1, 65533)) {
                  return false;
               }
               break;
            }

            char c1 = var0.charAt(i - 1);
            if (Character.isHighSurrogate(c1)) {
               if (!var2.accept(--i, var1, Character.toCodePoint(c1, c0))) {
                  return false;
               }
            } else if (!var2.accept(i, var1, 65533)) {
               return false;
            }
         } else if (!N(var1, var2, i, c0)) {
            return false;
         }
      }

      return true;
   }

   public static String N(class05936 var0) {
      StringBuilder stringbuilder = new StringBuilder();
      N(var0, class00405.N, (var1x, var2, var3) -> {
         stringbuilder.appendCodePoint(var3);
         return true;
      });
      return stringbuilder.toString();
   }

   public static boolean N(class05936 var0, class00405 var1, class05197 var2) {
      return var0.N((var1x, var2x) -> N(var2x, 0, var1x, var2) ? Optional.empty() : y, var1).isEmpty();
   }

   public static boolean N(String var0, class00405 var1, class05197 var2) {
      int i = var0.length();

      for (int j = 0; j < i; j++) {
         char c0 = var0.charAt(j);
         if (Character.isHighSurrogate(c0)) {
            if (j + 1 >= i) {
               if (!var2.accept(j, var1, 65533)) {
                  return false;
               }
               break;
            }

            char c1 = var0.charAt(j + 1);
            if (Character.isLowSurrogate(c1)) {
               if (!var2.accept(j, var1, Character.toCodePoint(c0, c1))) {
                  return false;
               }

               j++;
            } else if (!var2.accept(j, var1, 65533)) {
               return false;
            }
         } else if (!N(var1, var2, j, c0)) {
            return false;
         }
      }

      return true;
   }

   public static boolean N(String var0, int var1, class00405 var2, class05197 var3) {
      return N(var0, var1, var2, var2, var3);
   }

   public static boolean N(String var0, int var1, class00405 var2, class00405 var3, class05197 var4) {
      int i = var0.length();
      class00405 class00405 = var2;

      for (int j = var1; j < i; j++) {
         char c0 = var0.charAt(j);
         if (c0 == 167) {
            if (j + 1 >= i) {
               break;
            }

            char c1 = var0.charAt(j + 1);
            class06541 class06541 = class06541.N(c1);
            if (class06541 != null) {
               class00405 = class06541 == class06541.field_1070 ? var3 : class00405.L(class06541);
            }

            j++;
         } else if (Character.isHighSurrogate(c0)) {
            if (j + 1 >= i) {
               if (!var4.accept(j, class00405, 65533)) {
                  return false;
               }
               break;
            }

            char c2 = var0.charAt(j + 1);
            if (Character.isLowSurrogate(c2)) {
               if (!var4.accept(j, class00405, Character.toCodePoint(c0, c2))) {
                  return false;
               }

               j++;
            } else if (!var4.accept(j, class00405, 65533)) {
               return false;
            }
         } else if (!N(class00405, var4, j, c0)) {
            return false;
         }
      }

      return true;
   }

   private static boolean N(class00405 var0, class05197 var1, int var2, char var3) {
      return Character.isSurrogate(var3) ? var1.accept(var2, var0, 65533) : var1.accept(var2, var0, var3);
   }

   public static String N(String var0) {
      StringBuilder stringbuilder = new StringBuilder();
      N(var0, class00405.N, (var1x, var2, var3) -> {
         stringbuilder.appendCodePoint(var3);
         return true;
      });
      return stringbuilder.toString();
   }
}
