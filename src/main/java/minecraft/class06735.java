package minecraft;

import org.jspecify.annotations.Nullable;

public class class06735 implements class01857 {
   final class06202 N;

   public class06735(class06202 var1) {
      super();
      this.N = var1;
   }

   private void N(class07049 var1, float var2, boolean var3) {
      class06889 class06889xxxxxxxx = var1.method_73189();
      class06889 class06889x = var1.method_30950(var2);
      class06889 class06889xx = class06889x.u(class06889xxxxxxxx);
      int i = var3 ? -16711936 : -1;
      class06724.N(var1.method_5829().L(class06889xx), class06747.N(i));
      class06724.N(class06889x, i, 2.0F);
      class07049 class07049 = var1.method_5854();
      if (class07049 != null) {
         float f = Math.min(class07049.method_17681(), var1.method_17681()) / 2.0F;
         float f1 = 0.0625F;
         class06889 class06889xxx = class07049.method_52538(var1).i(class06889xx);
         class06724.N(
            new class00734(class06889xxx.M - f, class06889xxx.B, class06889xxx.Z - f, class06889xxx.M + f, class06889xxx.B + 0.0625, class06889xxx.Z + f),
            class06747.N(-256)
         );
      }

      if (var1 instanceof class07438) {
         class00734 class00734 = var1.method_5829().L(class06889xx);
         float f2 = 0.01F;
         class06724.N(
            new class00734(
               class00734.N, class00734.y + var1.method_5751() - 0.01F, class00734.L, class00734.u, class00734.y + var1.method_5751() + 0.01F, class00734.R
            ),
            class06747.N(-65536)
         );
      }

      if (var1 instanceof class00690 class00690) {
         for (class00695 class00695 : class00690.E()) {
            class06889 class06889xxx = class00695.method_73189();
            class06889 class06889xxxx = class00695.method_30950(var2).u(class06889xxx);
            class06724.N(class00695.method_5829().L(class06889xxxx), class06747.N(class02566.N(1.0F, 0.25F, 1.0F, 0.0F)));
         }
      }

      class06889 class06889xxx = class06889x.y(0.0, var1.method_5751(), 0.0);
      class06889 class06889xxxx = var1.method_5828(var2);
      class06724.y(class06889xxx, class06889xxx.i(class06889xxxx.L(2.0)), -16776961);
      if (var3) {
         class06889 class06889xxxxx = var1.method_18798();
         class06724.y(class06889x, class06889x.i(class06889xxxxx), -256);
      }
   }

   @Nullable
   private class07049 N(class07049 var1) {
      class08337 class08337 = this.N.Na();
      if (class08337 != null) {
         class04782 class04782 = class08337.N(var1.method_73183().method_27983());
         if (class04782 != null) {
            return class04782.method_8469(var1.method_5628());
         }
      }

      return null;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      if ((class03448)this.N.T_3 != null) {
         for (class07049 class07049 : ((class03448)this.N.T_3).M()) {
            if (!class07049.method_5767()
               && var8.method_23093(class07049.method_5829())
               && (class07049 != this.N.F() || ((class05630)this.N.i_7).NS() != class05455.field_26664)) {
               this.N(class07049, var9, false);
               if (class07529.Y) {
                  if (this.N(class07049) != null) {
                     this.N(class07049, var9, true);
                  } else {
                     class06724.N("Missing Server Entity", class07049.method_30950(var9).y(0.0, class07049.method_5829().L() + 1.5, 0.0), class06715.N(-65536));
                  }
               }
            }
         }
      }
   }
}
