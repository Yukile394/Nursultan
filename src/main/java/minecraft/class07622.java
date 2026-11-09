package minecraft;

import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07622 implements class05975 {
   private static final Logger N = LogUtils.getLogger();
   private boolean y;
   private class07614 L = class07614.field_18482;
   private int u;
   private int i;
   private int R;
   private int M;
   private int B;

   public class07622() {
      super();
   }

   private void y(class04782 var1) {
      class06889 class06889 = this.N(var1, new class07209(this.R, this.M, this.B));
      if (class06889 != null) {
         class08004 class08004;
         try {
            class08004 = new class08004(var1);
            class08004.N(var1, var1.method_8404(class08004.method_24515()), class06113.field_16467, null);
         } catch (Exception exception) {
            N.warn("Failed to create zombie for village siege at {}", class06889, exception);
            return;
         }

         class08004.method_5808(class06889.M, class06889.B, class06889.Z, var1.field_9229.z() * 360.0F, 0.0F);
         var1.y(class08004);
      }
   }

   private boolean N(class04782 var1) {
      for (class08036 class08036 : var1.method_18456()) {
         if (!class08036.method_7325()) {
            class07209 class07209 = class08036.method_24515();
            if (var1.method_19500(class07209) && !var1.i(class07209).N(class03557.Ny)) {
               for (int ix = 0; ix < 10; ix++) {
                  float f = var1.field_9229.z() * (float) (Math.PI * 2);
                  this.R = class07209.method_10263() + class04995.y(class04995.P(f) * 32.0F);
                  this.M = class07209.method_10264();
                  this.B = class07209.method_10260() + class04995.y(class04995.m(f) * 32.0F);
                  if (this.N(var1, new class07209(this.R, this.M, this.B)) != null) {
                     this.i = 0;
                     this.u = 20;
                     break;
                  }
               }

               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   private class06889 N(class04782 var1, class07209 var2) {
      for (int ix = 0; ix < 10; ix++) {
         int j = var2.method_10263() + var1.field_9229.y(16) - 8;
         int k = var2.method_10260() + var1.field_9229.y(16) - 8;
         int l = var1.method_8624(class07830.field_13202, j, k);
         class07209 class07209 = new class07209(j, l, k);
         if (var1.method_19500(class07209) && class07150.y(class07078.yx, var1, class06113.field_16467, class07209, var1.field_9229)) {
            return class06889.L(class07209);
         }
      }

      return null;
   }

   @Override
   public void N(class04782 var1, boolean var2) {
      if (!var1.method_8530() && var2) {
         if (var1.method_8532() % 24000L == 18000L) {
            this.L = var1.field_9229.y(10) == 0 ? class07614.field_18481 : class07614.field_18482;
         }

         if (this.L != class07614.field_18482) {
            if (!this.y) {
               if (!this.N(var1)) {
                  return;
               }

               this.y = true;
            }

            if (this.i > 0) {
               this.i--;
            } else {
               this.i = 2;
               if (this.u > 0) {
                  this.y(var1);
                  this.u--;
               } else {
                  this.L = class07614.field_18482;
               }
            }
         }
      } else {
         this.L = class07614.field_18482;
         this.y = false;
      }
   }
}
