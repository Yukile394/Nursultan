package minecraft;

import java.util.Locale;

public class class01645 implements class01857 {
   private static final float N = 80.0F;
   private static final int y = 8;
   private static final boolean L = false;
   private static final boolean u = true;
   private static final boolean i = false;
   private static final boolean R = false;
   private static final boolean M = true;
   private static final boolean B = true;
   private static final float Z = 0.32F;

   public class01645() {
      super();
   }

   public static void N(class00143 var0, double var1, double var3, double var5) {
      if (var0.i() >= 2) {
         class06889 class06889 = var0.N(0).i();

         for (int ix = 1; ix < var0.i(); ix++) {
            class01763 class01763 = var0.N(ix);
            if (N(class01763.u(), var1, var3, var5) > 80.0F) {
               class06889 = class01763.i();
            } else {
               int j = class02566.M(class04995.M((float)ix / var0.i() * 0.33F, 0.9F, 0.9F));
               class06724.y(class06889.y(0.5, 0.5, 0.5), class01763.i().y(0.5, 0.5, 0.5), j);
               class06889 = class01763.i();
            }
         }
      }
   }

   private static float N(class07209 var0, double var1, double var3, double var5) {
      return (float)(Math.abs(var0.method_10263() - var1) + Math.abs(var0.method_10264() - var3) + Math.abs(var0.method_10260() - var5));
   }

   public static void N(class00143 var0, float var1, boolean var2, boolean var3, double var4, double var6, double var8) {
      N(var0, var4, var6, var8);
      class07209 class07209 = var0.E();
      if (N(class07209, var4, var6, var8) <= 80.0F) {
         class06724.N(
            new class00734(
               class07209.method_10263() + 0.25F,
               class07209.method_10264() + 0.25F,
               class07209.method_10260() + 0.25,
               class07209.method_10263() + 0.75F,
               class07209.method_10264() + 0.75F,
               class07209.method_10260() + 0.75F
            ),
            class06747.y(class02566.N(0.5F, 0.0F, 1.0F, 0.0F))
         );

         for (int ix = 0; ix < var0.i(); ix++) {
            class01763 class01763xxx = var0.N(ix);
            if (N(class01763xxx.u(), var4, var6, var8) <= 80.0F) {
               float f = ix == var0.R() ? 1.0F : 0.0F;
               float f1 = ix == var0.R() ? 0.0F : 1.0F;
               class00734 class00734 = new class00734(
                  class01763xxx.N + 0.5F - var1,
                  class01763xxx.y + 0.01F * ix,
                  class01763xxx.L + 0.5F - var1,
                  class01763xxx.N + 0.5F + var1,
                  class01763xxx.y + 0.25F + 0.01F * ix,
                  class01763xxx.L + 0.5F + var1
               );
               class06724.N(class00734, class06747.y(class02566.N(0.5F, f, 0.0F, f1)));
            }
         }
      }

      class00138 class00138 = var0.U();
      if (var2 && class00138 != null) {
         for (class01763 class01763x : class00138.y()) {
            if (N(class01763x.u(), var4, var6, var8) <= 80.0F) {
               class06724.N(
                  new class00734(
                     class01763x.N + 0.5F - var1 / 2.0F,
                     class01763x.y + 0.01F,
                     class01763x.L + 0.5F - var1 / 2.0F,
                     class01763x.N + 0.5F + var1 / 2.0F,
                     class01763x.y + 0.1,
                     class01763x.L + 0.5F + var1 / 2.0F
                  ),
                  class06747.y(class02566.N(0.5F, 1.0F, 0.8F, 0.8F))
               );
            }
         }

         for (class01763 class01763x : class00138.N()) {
            if (N(class01763x.u(), var4, var6, var8) <= 80.0F) {
               class06724.N(
                  new class00734(
                     class01763x.N + 0.5F - var1 / 2.0F,
                     class01763x.y + 0.01F,
                     class01763x.L + 0.5F - var1 / 2.0F,
                     class01763x.N + 0.5F + var1 / 2.0F,
                     class01763x.y + 0.1,
                     class01763x.L + 0.5F + var1 / 2.0F
                  ),
                  class06747.y(class02566.N(0.5F, 0.8F, 1.0F, 1.0F))
               );
            }
         }
      }

      if (var3) {
         for (int j = 0; j < var0.i(); j++) {
            class01763 class01763xx = var0.N(j);
            if (N(class01763xx.u(), var4, var6, var8) <= 80.0F) {
               class06724.N(
                     String.valueOf(class01763xx.E), new class06889(class01763xx.N + 0.5, class01763xx.y + 0.75, class01763xx.L + 0.5), class06715.N().N(0.32F)
                  )
                  .N();
               class06724.N(
                     String.format(Locale.ROOT, "%.2f", class01763xx.U),
                     new class06889(class01763xx.N + 0.5, class01763xx.y + 0.25, class01763xx.L + 0.5),
                     class06715.N().N(0.32F)
                  )
                  .N();
            }
         }
      }
   }

   private static void N(double var0, double var2, double var4, class00143 var6, float var7) {
      N(var6, var7, true, true, var0, var2, var4);
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      var7.L(class00429.R, (var6, var7x) -> N(var1, var3, var5, var7x.N(), var7x.y()));
   }
}
