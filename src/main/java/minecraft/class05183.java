package minecraft;

import java.nio.charset.StandardCharsets;

public class class05183 {
   public static final int N = 1460;
   public static final char[] y = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

   public static int L(byte[] var0, int var1, int var2) {
      return 0 > var2 - var1 - 4 ? 0 : var0[var1] << 24 | (var0[var1 + 1] & 0xFF) << 16 | (var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF;
   }

   public class05183() {
      super();
   }

   public static int y(byte[] var0, int var1, int var2) {
      return 0 > var2 - var1 - 4 ? 0 : var0[var1 + 3] << 24 | (var0[var1 + 2] & 0xFF) << 16 | (var0[var1 + 1] & 0xFF) << 8 | var0[var1] & 0xFF;
   }

   public static int N(byte[] var0, int var1) {
      return y(var0, var1, var0.length);
   }

   public static String N(byte var0) {
      return "" + y[(var0 & 240) >>> 4] + y[var0 & 15];
   }

   public static String N(byte[] var0, int var1, int var2) {
      int i = var2 - 1;
      int j = var1 > i ? i : var1;

      while (0 != var0[j] && j < i) {
         j++;
      }

      return new String(var0, var1, j - var1, StandardCharsets.UTF_8);
   }
}
