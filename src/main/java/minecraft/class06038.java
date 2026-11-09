package minecraft;

import java.util.Locale;

public class class06038 {
   public class06038() {
      super();
   }

   public static void N(StringBuilder var0, double var1, double var3, double var5, int[] var7) {
      var0.append(String.format(Locale.ROOT, "xo=%.3f, yo=%.3f, zo=%.3f, p0=%d, p255=%d", (float)var1, (float)var3, (float)var5, var7[0], var7[255]));
   }

   public static void N(StringBuilder var0, double var1, double var3, double var5, byte[] var7) {
      var0.append(String.format(Locale.ROOT, "xo=%.3f, yo=%.3f, zo=%.3f, p0=%d, p255=%d", (float)var1, (float)var3, (float)var5, var7[0], var7[255]));
   }

   public static double N(double var0, double var2) {
      return var0 + Math.sin(Math.PI * var0) * var2 / Math.PI;
   }
}
