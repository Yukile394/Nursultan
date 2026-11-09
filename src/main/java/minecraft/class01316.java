package minecraft;

import java.util.Set;

public class class01316 extends class06078<class08460> {
   public static final class02415 N = new class02441(true, 8.0F, 3.35F, Set.of("head"));
   public final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;
   private static final int Z = 6;
   private static final float z = 16.5F;
   private static final float U = 17.5F;
   private float E;

   public class01316(class01686 var1) {
      super(var1);
      this.y = var1.y("head");
      this.L = var1.y("body");
      this.u = var1.y("right_hind_leg");
      this.i = var1.y("left_hind_leg");
      this.R = var1.y("right_front_leg");
      this.M = var1.y("left_front_leg");
      this.B = this.L.y("tail");
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839xx = class04792.N();
      class04839 class04839x = class04839xx.N("head", class04822.L().N(1, 5).N(-3.0F, -2.0F, -5.0F, 8.0F, 6.0F, 6.0F), class04838.N(-1.0F, 16.5F, -3.0F));
      class04839x.N("right_ear", class04822.L().N(8, 1).N(-3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F), class04838.N);
      class04839x.N("left_ear", class04822.L().N(15, 1).N(3.0F, -4.0F, -4.0F, 2.0F, 2.0F, 1.0F), class04838.N);
      class04839x.N("nose", class04822.L().N(6, 18).N(-1.0F, 2.01F, -8.0F, 4.0F, 2.0F, 3.0F), class04838.N);
      class04839 class04839xx = class04839xx.N(
         "body", class04822.L().N(24, 15).N(-3.0F, 3.999F, -3.5F, 6.0F, 11.0F, 6.0F), class04838.N(0.0F, 16.0F, -6.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      class04834 class04834 = new class04834(0.001F);
      class04822 class04822x = class04822.L().N(4, 24).N(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, class04834);
      class04822 class04822x = class04822.L().N(13, 24).N(2.0F, 0.5F, -1.0F, 2.0F, 6.0F, 2.0F, class04834);
      class04839xx.N("right_hind_leg", class04822x, class04838.N(-5.0F, 17.5F, 7.0F));
      class04839xx.N("left_hind_leg", class04822x, class04838.N(-1.0F, 17.5F, 7.0F));
      class04839xx.N("right_front_leg", class04822x, class04838.N(-5.0F, 17.5F, 0.0F));
      class04839xx.N("left_front_leg", class04822x, class04838.N(-1.0F, 17.5F, 0.0F));
      class04839xx.N("tail", class04822.L().N(30, 0).N(2.0F, 0.0F, -1.0F, 4.0F, 9.0F, 5.0F), class04838.N(-4.0F, 15.0F, -1.0F, -0.05235988F, 0.0F, 0.0F));
      return class04806.N(class04792, 48, 32);
   }

   public void method_2819(class08460 var1) {
      super.method_2819(var1);
      float f = var1.Ny;
      float f1 = var1.NN;
      this.u.i = class04995.P(f1 * 0.6662F) * 1.4F * f;
      this.i.i = class04995.P(f1 * 0.6662F + (float) Math.PI) * 1.4F * f;
      this.R.i = class04995.P(f1 * 0.6662F + (float) Math.PI) * 1.4F * f;
      this.M.i = class04995.P(f1 * 0.6662F) * 1.4F * f;
      this.y.M = var1.N;
      this.u.U = true;
      this.i.U = true;
      this.R.U = true;
      this.M.U = true;
      float f2 = var1.Nu;
      if (var1.L) {
         this.L.i += 0.10471976F;
         float f3 = var1.y;
         this.L.L += f3 * f2;
         this.y.L += f3 * f2;
      } else if (var1.u) {
         this.L.M = (float) (-Math.PI / 2);
         this.L.L += 5.0F * f2;
         this.B.i = (float) (-Math.PI * 5.0 / 6.0);
         if (var1.NB) {
            this.B.i = -2.1816616F;
            this.L.u += 2.0F;
         }

         this.y.y += 2.0F * f2;
         this.y.L += 2.99F * f2;
         this.y.R = (float) (-Math.PI * 2.0 / 3.0);
         this.y.M = 0.0F;
         this.u.U = false;
         this.i.U = false;
         this.R.U = false;
         this.M.U = false;
      } else if (var1.i) {
         this.L.i = (float) (Math.PI / 6);
         this.L.L -= 7.0F * f2;
         this.L.u += 3.0F * f2;
         this.B.i = (float) (Math.PI / 4);
         this.B.u -= 1.0F * f2;
         this.y.i = 0.0F;
         this.y.R = 0.0F;
         if (var1.NB) {
            this.y.L--;
            this.y.u -= 0.375F;
         } else {
            this.y.L -= 6.5F;
            this.y.u += 2.75F;
         }

         this.u.i = (float) (-Math.PI * 5.0 / 12.0);
         this.u.L += 4.0F * f2;
         this.u.u -= 0.25F * f2;
         this.i.i = (float) (-Math.PI * 5.0 / 12.0);
         this.i.L += 4.0F * f2;
         this.i.u -= 0.25F * f2;
         this.R.i = (float) (-Math.PI / 12);
         this.M.i = (float) (-Math.PI / 12);
      }

      if (!var1.u && !var1.R && !var1.L) {
         this.y.i = var1.h * (float) (Math.PI / 180.0);
         this.y.R = var1.D * (float) (Math.PI / 180.0);
      }

      if (var1.u) {
         this.y.i = 0.0F;
         this.y.R = (float) (-Math.PI * 2.0 / 3.0);
         this.y.M = class04995.P(var1.P * 0.027F) / 22.0F;
      }

      if (var1.L) {
         float f4 = class04995.P(var1.P) * 0.01F;
         this.L.R = f4;
         this.u.M = f4;
         this.i.M = f4;
         this.R.M = f4 / 2.0F;
         this.M.M = f4 / 2.0F;
      }

      if (var1.R) {
         float f5 = 0.1F;
         this.E += 0.67F;
         this.u.i = class04995.P(this.E * 0.4662F) * 0.1F;
         this.i.i = class04995.P(this.E * 0.4662F + (float) Math.PI) * 0.1F;
         this.R.i = class04995.P(this.E * 0.4662F + (float) Math.PI) * 0.1F;
         this.M.i = class04995.P(this.E * 0.4662F) * 0.1F;
      }
   }
}
