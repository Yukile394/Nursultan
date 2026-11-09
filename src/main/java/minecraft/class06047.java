package minecraft;

import java.util.Set;

public class class06047<T extends class08441> extends class06078<T> {
   public static final class02415 y = new class02441(true, 10.0F, 4.0F, Set.of("head"));
   private static final float N = 0.0F;
   private static final float m = 16.0F;
   private static final float P = -9.0F;
   protected static final float L = 18.0F;
   protected static final float u = 5.0F;
   protected static final float i = 14.1F;
   private static final float s = -5.0F;
   private static final String T = "tail1";
   private static final String b = "tail2";
   protected final class01686 R;
   protected final class01686 M;
   protected final class01686 B;
   protected final class01686 Z;
   protected final class01686 z;
   protected final class01686 U;
   protected final class01686 E;
   protected final class01686 W;

   public class06047(class01686 var1) {
      super(var1);
      this.E = var1.y("head");
      this.W = var1.y("body");
      this.z = var1.y("tail1");
      this.U = var1.y("tail2");
      this.R = var1.y("left_hind_leg");
      this.M = var1.y("right_hind_leg");
      this.B = var1.y("left_front_leg");
      this.Z = var1.y("right_front_leg");
   }

   public static class04792 N(class04834 var0) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04834 class04834 = new class04834(-0.02F);
      class04839.N(
         "head",
         class04822.L()
            .N("main", -2.5F, -2.0F, -3.0F, 5.0F, 4.0F, 5.0F, var0)
            .N("nose", -1.5F, -0.001F, -4.0F, 3, 2, 2, var0, 0, 24)
            .N("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, var0, 0, 10)
            .N("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, var0, 6, 10),
         class04838.N(0.0F, 15.0F, -9.0F)
      );
      class04839.N(
         "body", class04822.L().N(20, 0).N(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, var0), class04838.N(0.0F, 12.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      class04839.N("tail1", class04822.L().N(0, 15).N(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var0), class04838.N(0.0F, 15.0F, 8.0F, 0.9F, 0.0F, 0.0F));
      class04839.N("tail2", class04822.L().N(4, 15).N(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, class04834), class04838.N(0.0F, 20.0F, 14.0F));
      class04822 class04822x = class04822.L().N(8, 13).N(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var0);
      class04839.N("left_hind_leg", class04822x, class04838.N(1.1F, 18.0F, 5.0F));
      class04839.N("right_hind_leg", class04822x, class04838.N(-1.1F, 18.0F, 5.0F));
      class04822 class04822x = class04822.L().N(40, 0).N(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var0);
      class04839.N("left_front_leg", class04822x, class04838.N(1.2F, 14.1F, -5.0F));
      class04839.N("right_front_leg", class04822x, class04838.N(-1.2F, 14.1F, -5.0F));
      return class04792;
   }

   public void method_2819(T var1) {
      super.method_2819((T)var1);
      float f = var1.Nu;
      if (var1.u) {
         this.W.L += 1.0F * f;
         this.E.L += 2.0F * f;
         this.z.L += 1.0F * f;
         this.U.L += -4.0F * f;
         this.U.u += 2.0F * f;
         this.z.i = (float) (Math.PI / 2);
         this.U.i = (float) (Math.PI / 2);
      } else if (var1.i) {
         this.U.L = this.z.L;
         this.U.u += 2.0F * f;
         this.z.i = (float) (Math.PI / 2);
         this.U.i = (float) (Math.PI / 2);
      }

      this.E.i = var1.h * (float) (Math.PI / 180.0);
      this.E.R = var1.D * (float) (Math.PI / 180.0);
      if (!var1.R) {
         this.W.i = (float) (Math.PI / 2);
         float f1 = var1.Ny;
         float f2 = var1.NN;
         if (var1.i) {
            this.R.i = class04995.P(f2 * 0.6662F) * f1;
            this.M.i = class04995.P(f2 * 0.6662F + 0.3F) * f1;
            this.B.i = class04995.P(f2 * 0.6662F + (float) Math.PI + 0.3F) * f1;
            this.Z.i = class04995.P(f2 * 0.6662F + (float) Math.PI) * f1;
            this.U.i = 1.7278761F + (float) (Math.PI / 10) * class04995.P(f2) * f1;
         } else {
            this.R.i = class04995.P(f2 * 0.6662F) * f1;
            this.M.i = class04995.P(f2 * 0.6662F + (float) Math.PI) * f1;
            this.B.i = class04995.P(f2 * 0.6662F + (float) Math.PI) * f1;
            this.Z.i = class04995.P(f2 * 0.6662F) * f1;
            if (!var1.u) {
               this.U.i = 1.7278761F + (float) (Math.PI / 4) * class04995.P(f2) * f1;
            } else {
               this.U.i = 1.7278761F + 0.47123894F * class04995.P(f2) * f1;
            }
         }
      }

      if (var1.R) {
         this.W.i = (float) (Math.PI / 4);
         this.W.L += -4.0F * f;
         this.W.u += 5.0F * f;
         this.E.L += -3.3F * f;
         this.E.u += 1.0F * f;
         this.z.L += 8.0F * f;
         this.z.u += -2.0F * f;
         this.U.L += 2.0F * f;
         this.U.u += -0.8F * f;
         this.z.i = 1.7278761F;
         this.U.i = 2.670354F;
         this.B.i = (float) (-Math.PI / 20);
         this.B.L += 2.0F * f;
         this.B.u -= 2.0F * f;
         this.Z.i = (float) (-Math.PI / 20);
         this.Z.L += 2.0F * f;
         this.Z.u -= 2.0F * f;
         this.R.i = (float) (-Math.PI / 2);
         this.R.L += 3.0F * f;
         this.R.u -= 4.0F * f;
         this.M.i = (float) (-Math.PI / 2);
         this.M.L += 3.0F * f;
         this.M.u -= 4.0F * f;
      }

      if (var1.M > 0.0F) {
         this.E.M = class04995.Z(var1.M, this.E.M, -1.2707963F);
         this.E.R = class04995.Z(var1.M, this.E.R, 1.2707963F);
         this.B.i = -1.2707963F;
         this.Z.i = -0.47079635F;
         this.Z.M = -0.2F;
         this.Z.y += f;
         this.R.i = -0.4F;
         this.M.i = 0.5F;
         this.M.M = -0.5F;
         this.M.y += 0.8F * f;
         this.M.L += 2.0F * f;
         this.z.i = class04995.Z(var1.B, this.z.i, 0.8F);
         this.U.i = class04995.Z(var1.B, this.U.i, -0.4F);
      }

      if (var1.Z > 0.0F) {
         this.E.i = class04995.Z(var1.Z, this.E.i, -0.58177644F);
      }
   }
}
