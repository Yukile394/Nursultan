package minecraft;

import java.util.function.Consumer;

public class class01175 {
   protected static boolean L(class07284 var0, class07209 var1) {
      if (var0.method_8320(var1).N(class01210.yI)) {
         var0.method_8652(var1, class00869.vF.W(), 2);
         return true;
      } else {
         return false;
      }
   }

   public static boolean L(class00500 var0) {
      return var0.P() || var0.N(class00869.K);
   }

   public class01175() {
      super();
   }

   public static boolean i(class00500 var0) {
      return var0.P() || var0.N(class00869.K) || var0.N(class00869.V);
   }

   public static boolean u(class00500 var0) {
      return !var0.P() && !var0.N(class00869.K);
   }

   protected static boolean y(class07284 var0, class07209 var1) {
      return var0.method_16358(var1, class01175::i);
   }

   public static boolean y(class00500 var0) {
      return var0.N(class00869.vF) || var0.N(class01210.yI);
   }

   public static boolean N(class00500 var0) {
      return y(var0) || var0.N(class00869.V);
   }

   protected static double N(double var0, double var2, double var4, double var6) {
      if (var0 < var6) {
         var0 = var6;
      }

      double d0 = 0.384;
      double d1 = var0 / var2 * 0.384;
      double d2 = 0.75 * Math.pow(d1, 1.3333333333333333);
      double d3 = Math.pow(d1, 0.6666666666666666);
      double d4 = 0.3333333333333333 * Math.log(d1);
      double d5 = var4 * (d2 - d3 - d4);
      d5 = Math.max(d5, 0.0);
      return d5 / 0.384 * var2;
   }

   protected static boolean N(class07284 var0, class07209 var1) {
      return var0.method_16358(var1, class01175::L);
   }

   protected static void N(class07211 var0, int var1, boolean var2, Consumer<class00500> var3) {
      if (var1 >= 3) {
         var3.accept(N(var0, class06337.field_28068));

         for (int i = 0; i < var1 - 3; i++) {
            var3.accept(N(var0, class06337.field_28067));
         }
      }

      if (var1 >= 2) {
         var3.accept(N(var0, class06337.field_28066));
      }

      if (var1 >= 1) {
         var3.accept(N(var0, var2 ? class06337.field_28064 : class06337.field_28065));
      }
   }

   protected static void N(class07284 var0, class07209 var1, class07211 var2, int var3, boolean var4) {
      if (y(var0.method_8320(var1.method_10093(var2.b())))) {
         class07218 class07218 = var1.method_25503();
         N(var2, var3, var4, var3x -> {
            if (var3x.N(class00869.vp)) {
               var3x = var3x.y(class06342.u, var0.z(class07218));
            }

            var0.method_8652(class07218, var3x, 2);
            class07218.N(var2);
         });
      }
   }

   protected static boolean N(class05974 var0, class07209 var1, int var2) {
      if (y(var0, var1)) {
         return false;
      } else {
         float f = 6.0F;
         float f1 = 6.0F / var2;

         for (float f2 = 0.0F; f2 < (float) (Math.PI * 2); f2 += f1) {
            int i = (int)(class04995.P(f2) * var2);
            int j = (int)(class04995.m(f2) * var2);
            if (y(var0, var1.method_10069(i, 0, j))) {
               return false;
            }
         }

         return true;
      }
   }

   private static class00500 N(class07211 var0, class06337 var1) {
      return class00869.vp.W().y(class06342.y, var0).y(class06342.L, var1);
   }
}
