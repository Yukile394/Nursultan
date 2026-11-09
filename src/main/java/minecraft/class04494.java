package minecraft;

import java.util.Optional;

public final class class04494 {
   public class04494() {
      super();
   }

   public static Optional<class06889> N(class07079 var0, class06889 var1, float var2, int var3, boolean var4) {
      class06889 class06889x = var0.method_73189();
      class06889 class06889x = new class06889(var1.M - class06889x.M, 0.0, var1.Z - class06889x.Z).u().L(0.5);
      class06889 class06889xx = var1.u(class06889x).u(class06889x);
      float f = var3 * (float) Math.PI / 180.0F;
      double d0 = Math.atan2(class06889xx.Z, class06889xx.M);
      double d1 = class06889xx.N(0.0, class06889xx.B, 0.0).B();
      double d2 = Math.sqrt(d1);
      double d3 = class06889xx.B;
      double d4 = var0.method_56989();
      double d5 = Math.sin(2.0F * f);
      double d6 = Math.pow(Math.cos(f), 2.0);
      double d7 = Math.sin(f);
      double d8 = Math.cos(f);
      double d9 = Math.sin(d0);
      double d10 = Math.cos(d0);
      double d11 = d1 * d4 / (d2 * d5 - 2.0 * d3 * d6);
      if (d11 < 0.0) {
         return Optional.empty();
      } else {
         double d12 = Math.sqrt(d11);
         if (d12 > var2) {
            return Optional.empty();
         } else {
            double d13 = d12 * d8;
            double d14 = d12 * d7;
            if (var4) {
               int i = class04995.L(d2 / d13) * 2;
               double d15 = 0.0;
               class06889 class06889xxx = null;
               class01325 class01325 = var0.method_18377(class01312.field_30095);

               for (int j = 0; j < i - 1; j++) {
                  d15 += d2 / i;
                  double d16 = d7 / d8 * d15 - Math.pow(d15, 2.0) * d4 / (2.0 * d11 * Math.pow(d8, 2.0));
                  double d17 = d15 * d10;
                  double d18 = d15 * d9;
                  class06889 class06889xxxx = new class06889(class06889x.M + d17, class06889x.B + d16, class06889x.Z + d18);
                  if (class06889xxx != null && !N(var0, class01325, class06889xxx, class06889xxxx)) {
                     return Optional.empty();
                  }

                  class06889xxx = class06889xxxx;
               }
            }

            return Optional.of(new class06889(d13 * d10, d14, d13 * d9).L(0.95F));
         }
      }
   }

   private static boolean N(class07079 var0, class01325 var1, class06889 var2, class06889 var3) {
      class06889 class06889xx = var3.u(var2);
      double d0 = Math.min(var1.N(), var1.y());
      int i = class04995.L(class06889xx.M() / d0);
      class06889 class06889x = class06889xx.u();
      class06889 class06889xx = var2;

      for (int j = 0; j < i; j++) {
         class06889xx = j == i - 1 ? var3 : class06889xx.i(class06889x.L(d0 * 0.9F));
         if (!var0.method_73183().method_8587(var0, var1.N(class06889xx))) {
            return false;
         }
      }

      return true;
   }
}
