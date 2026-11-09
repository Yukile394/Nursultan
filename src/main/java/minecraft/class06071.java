package minecraft;

import java.util.Set;

public class class06071 extends class04532<class08482> {
   public static final class02415 N = new class02441(true, 23.0F, 4.8F, 2.7F, 3.0F, 49.0F, Set.of("head"));

   public class06071(class01686 var1) {
      super(var1);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N(
         "head",
         class04822.L()
            .N(0, 6)
            .N(-6.5F, -5.0F, -4.0F, 13.0F, 10.0F, 9.0F)
            .N(45, 16)
            .N("nose", -3.5F, 0.0F, -6.0F, 7.0F, 5.0F, 2.0F)
            .N(52, 25)
            .N("left_ear", 3.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F)
            .N(52, 25)
            .N("right_ear", -8.5F, -8.0F, -1.0F, 5.0F, 4.0F, 1.0F),
         class04838.N(0.0F, 11.5F, -17.0F)
      );
      class04839.N(
         "body", class04822.L().N(0, 25).N(-9.5F, -13.0F, -6.5F, 19.0F, 26.0F, 13.0F), class04838.N(0.0F, 10.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      byte b0 = 9;
      byte b1 = 6;
      class04822 class04822 = class04822.L().N(40, 0).N(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F);
      class04839.N("right_hind_leg", class04822, class04838.N(-5.5F, 15.0F, 9.0F));
      class04839.N("left_hind_leg", class04822, class04838.N(5.5F, 15.0F, 9.0F));
      class04839.N("right_front_leg", class04822, class04838.N(-5.5F, 15.0F, -9.0F));
      class04839.N("left_front_leg", class04822, class04838.N(5.5F, 15.0F, -9.0F));
      return class04806.N(class04792, 64, 64);
   }

   public void method_2819(class08482 var1) {
      super.method_2819(var1);
      if (var1.y) {
         this.y.R = 0.35F * class04995.m(0.6F * var1.P);
         this.y.M = 0.35F * class04995.m(0.6F * var1.P);
         this.R.i = -0.75F * class04995.m(0.3F * var1.P);
         this.M.i = 0.75F * class04995.m(0.3F * var1.P);
      } else {
         this.y.M = 0.0F;
      }

      if (var1.L) {
         if (var1.u < 15) {
            this.y.i = (float) (-Math.PI / 4) * var1.u / 14.0F;
         } else if (var1.u < 20) {
            float f = (var1.u - 15) / 5;
            this.y.i = (float) (-Math.PI / 4) + (float) (Math.PI / 4) * f;
         }
      }

      if (var1.B > 0.0F) {
         this.L.i = class04995.z(var1.B, this.L.i, 1.7407963F);
         this.y.i = class04995.z(var1.B, this.y.i, (float) (Math.PI / 2));
         this.R.M = -0.27079642F;
         this.M.M = 0.27079642F;
         this.u.M = 0.5707964F;
         this.i.M = -0.5707964F;
         if (var1.i) {
            this.y.i = (float) (Math.PI / 2) + 0.2F * class04995.m(var1.P * 0.6F);
            this.R.i = -0.4F - 0.2F * class04995.m(var1.P * 0.6F);
            this.M.i = -0.4F - 0.2F * class04995.m(var1.P * 0.6F);
         }

         if (var1.R) {
            this.y.i = 2.1707964F;
            this.R.i = -0.9F;
            this.M.i = -0.9F;
         }
      } else {
         this.u.M = 0.0F;
         this.i.M = 0.0F;
         this.R.M = 0.0F;
         this.M.M = 0.0F;
      }

      if (var1.Z > 0.0F) {
         this.u.i = -0.6F * class04995.m(var1.P * 0.15F);
         this.i.i = 0.6F * class04995.m(var1.P * 0.15F);
         this.R.i = 0.3F * class04995.m(var1.P * 0.25F);
         this.M.i = -0.3F * class04995.m(var1.P * 0.25F);
         this.y.i = class04995.z(var1.Z, this.y.i, (float) (Math.PI / 2));
      }

      if (var1.g > 0.0F) {
         this.y.i = class04995.z(var1.g, this.y.i, 2.0561945F);
         this.u.i = -0.5F * class04995.m(var1.P * 0.5F);
         this.i.i = 0.5F * class04995.m(var1.P * 0.5F);
         this.R.i = 0.5F * class04995.m(var1.P * 0.5F);
         this.M.i = -0.5F * class04995.m(var1.P * 0.5F);
      }
   }
}
