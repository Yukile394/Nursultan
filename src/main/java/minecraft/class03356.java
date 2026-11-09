package minecraft;

import org.jspecify.annotations.Nullable;

public class class03356<T extends class00394 & class08597> implements class03358<T, class00974> {
   public static final int N = class02566.N(0.2F, 0.75F, 0.75F, 1.0F);

   public class03356() {
      super();
   }

   private void y(class00974 var1, class07209 var2, class00753 var3) {
      if (var1.i != null) {
         class06890 class06890 = new class06890(var3.method_10263(), var3.method_10264(), var3.method_10260());

         for (int i = 0; i < var3.method_10263(); i++) {
            for (int j = 0; j < var3.method_10264(); j++) {
               for (int k = 0; k < var3.method_10260(); k++) {
                  int l = k * var3.method_10263() * var3.method_10264() + j * var3.method_10263() + i;
                  if (var1.i[l]) {
                     class06890.method_1049(i, j, k);
                  }
               }
            }
         }

         class06890.method_1046((var1x, var2x, var3x, var4x) -> {
            float f = 0.48F;
            float f1 = var2x + var2.method_10263() + 0.5F - 0.48F;
            float f2 = var3x + var2.method_10264() + 0.5F - 0.48F;
            float f3 = var4x + var2.method_10260() + 0.5F - 0.48F;
            float f4 = var2x + var2.method_10263() + 0.5F + 0.48F;
            float f5 = var3x + var2.method_10264() + 0.5F + 0.48F;
            float f6 = var4x + var2.method_10260() + 0.5F + 0.48F;
            class06724.N(new class06889(f1, f2, f3), new class06889(f4, f5, f6), var1x, class06747.y(N));
         });
      }
   }

   public void N(T var1, class00974 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N((T)var1, var2, var3, var4, var5);
      N((T)var1, var2);
   }

   public static <T extends class00394 & class08597> void N(T var0, class00974 var1) {
      class04453 class04453 = (class04453)class06202.Nq().T_4;
      var1.N = class04453.method_7338() || class04453.method_7325();
      var1.L = ((class08597)var0).L();
      var1.y = ((class08597)var0).y();
      class07209 class07209x = var1.L.N();
      class00753 class00753 = var1.L.y();
      class07209 class07209x = var1.R.method_10081(class07209x);
      if (var1.N && var0.G() != null && var1.y == class08592.field_55996) {
         var1.u = new class00966[class00753.method_10263() * class00753.method_10264() * class00753.method_10260()];

         for (int i = 0; i < class00753.method_10263(); i++) {
            for (int j = 0; j < class00753.method_10264(); j++) {
               for (int k = 0; k < class00753.method_10260(); k++) {
                  int l = k * class00753.method_10263() * class00753.method_10264() + j * class00753.method_10263() + i;
                  class00500 class00500 = var0.G().method_8320(class07209x.method_10069(i, j, k));
                  if (class00500.P()) {
                     var1.u[l] = class00966.field_62683;
                  } else if (class00500.N(class00869.EK)) {
                     var1.u[l] = class00966.field_62686;
                  } else if (class00500.N(class00869.ZX)) {
                     var1.u[l] = class00966.field_62684;
                  } else if (class00500.N(class00869.Za)) {
                     var1.u[l] = class00966.field_62685;
                  }
               }
            }
         }
      } else {
         var1.u = null;
      }

      if (var1.N) {
      }

      var1.i = null;
   }

   public void N(class00974 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.N) {
         if (var1.y != class08592.field_55994) {
            class08623 class08623 = var1.L;
            class07209 class07209x = class08623.N();
            class00753 class00753 = class08623.y();
            if (class00753.method_10263() >= 1 && class00753.method_10264() >= 1 && class00753.method_10260() >= 1) {
               float f = 1.0F;
               float f1 = 0.9F;
               class07209 class07209x = class07209x.method_10081(class00753);
               class06724.N(
                  new class00734(
                        class07209x.method_10263(),
                        class07209x.method_10264(),
                        class07209x.method_10260(),
                        class07209x.method_10263(),
                        class07209x.method_10264(),
                        class07209x.method_10260()
                     )
                     .N(var1.R),
                  class06747.N(class02566.N(1.0F, 0.9F, 0.9F, 0.9F)),
                  true
               );
               this.N(var1, class07209x, class00753);
            }
         }
      }
   }

   private void N(class00974 var1, class07209 var2, class00753 var3) {
      if (var1.u != null) {
         class07209 class07209 = var1.R.method_10081(var2);

         for (int i = 0; i < var3.method_10263(); i++) {
            for (int j = 0; j < var3.method_10264(); j++) {
               for (int k = 0; k < var3.method_10260(); k++) {
                  int l = k * var3.method_10263() * var3.method_10264() + j * var3.method_10263() + i;
                  class00966 class00966 = var1.u[l];
                  if (class00966 != null) {
                     float f = class00966 == class00966.field_62683 ? 0.05F : 0.0F;
                     double d0 = class07209.method_10263() + i + 0.45F - f;
                     double d1 = class07209.method_10264() + j + 0.45F - f;
                     double d2 = class07209.method_10260() + k + 0.45F - f;
                     double d3 = class07209.method_10263() + i + 0.55F + f;
                     double d4 = class07209.method_10264() + j + 0.55F + f;
                     double d5 = class07209.method_10260() + k + 0.55F + f;
                     class00734 class00734 = new class00734(d0, d1, d2, d3, d4, d5);
                     if (class00966 == class00966.field_62683) {
                        class06724.N(class00734, class06747.N(class02566.N(1.0F, 0.5F, 0.5F, 1.0F)));
                     } else if (class00966 == class00966.field_62686) {
                        class06724.N(class00734, class06747.N(class02566.N(1.0F, 1.0F, 0.75F, 0.75F)));
                     } else if (class00966 == class00966.field_62684) {
                        class06724.N(class00734, class06747.N(-65536));
                     } else if (class00966 == class00966.field_62685) {
                        class06724.N(class00734, class06747.N(-256));
                     }
                  }
               }
            }
         }
      }
   }

   public class00974 i() {
      return new class00974();
   }

   @Override
   public int u_() {
      return 96;
   }

   @Override
   public boolean t_() {
      return true;
   }
}
