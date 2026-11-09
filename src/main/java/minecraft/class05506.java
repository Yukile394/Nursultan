package minecraft;

public abstract class class05506<M extends class02721, S> extends class06249<class08468, M> {
   private final class06271<S> N;
   private final S y;
   private final class01894 L;
   private final class05522 u;

   public class05506(class02294<?, class08468, M> var1, class06271<S> var2, S var3, class01894 var4, class05522 var5) {
      super(var1);
      this.N = var2;
      this.y = (S)var3;
      this.L = var4;
      this.u = var5;
   }

   public void N(class01421 var1, class01237 var2, int var3, class08468 var4, float var5, float var6) {
      int i = this.N(var4);
      if (i > 0) {
         class06069 class06069 = class06069.y((long)var4.NO);

         for (int j = 0; j < i; j++) {
            var1.N();
            class01686 class01686 = this.u().N(class06069);
            class01687 class01687 = class01686.N(class06069);
            class01686.N(var1);
            float f = class06069.z();
            float f1 = class06069.z();
            float f2 = class06069.z();
            if (this.u == class05522.field_53233) {
               switch (class06069.y(3)) {
                  case 0:
                     f = N(f);
                     break;
                  case 1:
                     f1 = N(f1);
                     break;
                  default:
                     f2 = N(f2);
               }
            }

            var1.N(
               class04995.B(f, class01687.y, class01687.i) / 16.0F,
               class04995.B(f1, class01687.L, class01687.R) / 16.0F,
               class04995.B(f2, class01687.u, class01687.M) / 16.0F
            );
            this.N(var1, var2, var3, -(f * 2.0F - 1.0F), -(f1 * 2.0F - 1.0F), -(f2 * 2.0F - 1.0F), var4.l);
            var1.y();
         }
      }
   }

   private static float N(float var0) {
      return var0 > 0.5F ? 1.0F : 0.5F;
   }

   private void N(class01421 var1, class01237 var2, int var3, float var4, float var5, float var6, int var7) {
      float f = class04995.N(var4 * var4 + var6 * var6);
      float f1 = (float)(Math.atan2(var4, var6) * 180.0F / (float)Math.PI);
      float f2 = (float)(Math.atan2(var5, f) * 180.0F / (float)Math.PI);
      var1.N(class02058.u.N(f1 - 90.0F));
      var1.N(class02058.R.N(f2));
      var2.N(this.N, this.y, var1, this.N.method_23500(this.L), var3, class01384.u, var7, null);
   }

   protected abstract int N(class08468 var1);
}
