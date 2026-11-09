package minecraft;

import java.util.Set;

public class class03857 extends class04532<class08288> {
   private static final String B = "egg_belly";
   public static final class02415 N = new class02441(true, 120.0F, 0.0F, 9.0F, 6.0F, 120.0F, Set.of("head"));
   private final class01686 Z;

   public class03857(class01686 var1) {
      super(var1);
      this.Z = var1.y("egg_belly");
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("head", class04822.L().N(3, 0).N(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F), class04838.N(0.0F, 19.0F, -10.0F));
      class04839.N(
         "body",
         class04822.L().N(7, 37).N("shell", -9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F).N(31, 1).N("belly", -5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F),
         class04838.N(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      class04839.N(
         "egg_belly", class04822.L().N(70, 33).N(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F), class04838.N(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      boolean flag = true;
      class04839.N("right_hind_leg", class04822.L().N(1, 23).N(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), class04838.N(-3.5F, 22.0F, 11.0F));
      class04839.N("left_hind_leg", class04822.L().N(1, 12).N(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), class04838.N(3.5F, 22.0F, 11.0F));
      class04839.N("right_front_leg", class04822.L().N(27, 30).N(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), class04838.N(-5.0F, 21.0F, -4.0F));
      class04839.N("left_front_leg", class04822.L().N(27, 24).N(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), class04838.N(5.0F, 21.0F, -4.0F));
      return class04806.N(class04792, 128, 64);
   }

   public void method_2819(class08288 var1) {
      super.method_2819(var1);
      float f = var1.NN;
      float f1 = var1.Ny;
      if (var1.N) {
         float f2 = var1.y ? 4.0F : 1.0F;
         float f3 = var1.y ? 2.0F : 1.0F;
         float f4 = f * 5.0F;
         float f5 = class04995.P(f2 * f4);
         float f6 = class04995.P(f4);
         this.R.R = -f5 * 8.0F * f1 * f3;
         this.M.R = f5 * 8.0F * f1 * f3;
         this.u.R = -f6 * 3.0F * f1;
         this.i.R = f6 * 3.0F * f1;
      } else {
         float f7 = 0.5F * f1;
         float f8 = class04995.P(f * 0.6662F * 0.6F) * f7;
         this.u.i = f8;
         this.i.i = -f8;
         this.R.M = -f8;
         this.M.M = f8;
      }

      this.Z.U = var1.L;
      if (this.Z.U) {
         this.field_54014.L--;
      }
   }
}
