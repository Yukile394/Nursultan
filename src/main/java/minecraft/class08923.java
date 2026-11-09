package minecraft;

public final class class08923 {
   private static final int N = 16;
   private static final int y = 16;
   private static final String L = "missingno";
   private static final class01894 u = class01894.y("missingno");

   public static class01894 L() {
      return u;
   }

   public class08923() {
      super();
   }

   public static class01991 y() {
      class08280 class08280 = N(16, 16);
      return new class01991(u, new class02002(16, 16), class08280);
   }

   public static class08280 N() {
      return N(16, 16);
   }

   public static class08280 N(int var0, int var1) {
      class08280 class08280 = new class08280(var0, var1, false);
      int i = -524040;

      for (int j = 0; j < var1; j++) {
         for (int k = 0; k < var0; k++) {
            if (j < var1 / 2 ^ k < var0 / 2) {
               class08280.y(k, j, -524040);
            } else {
               class08280.y(k, j, -16777216);
            }
         }
      }

      return class08280;
   }
}
