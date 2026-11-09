package minecraft;

import java.util.Set;

public class class06013 extends class06078<class08484> {
   public static final class02415 N = new class02441(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F, Set.of("head"));
   private static final float y = 0.87266463F;
   private static final float L = (float) (-Math.PI / 9);
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;

   private static class04792 L() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      class04839x.N("body", class04822.L().N(1, 1).N(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F), class04838.N(0.0F, 7.0F, 0.0F))
         .N("mane", class04822.L().N(90, 33).N(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new class04834(0.001F)), class04838.N(0.0F, -14.0F, -7.0F));
      class04839 class04839x = class04839x.N(
         "head", class04822.L().N(61, 1).N(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F), class04838.N(0.0F, 2.0F, -12.0F, 0.87266463F, 0.0F, 0.0F)
      );
      class04839x.N(
         "right_ear",
         class04822.L().N(1, 1).N(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F),
         class04838.N(-6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (-Math.PI * 2.0 / 9.0))
      );
      class04839x.N(
         "left_ear",
         class04822.L().N(1, 6).N(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F),
         class04838.N(6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (Math.PI * 2.0 / 9.0))
      );
      class04839x.N("right_horn", class04822.L().N(10, 13).N(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), class04838.N(-7.0F, 2.0F, -12.0F));
      class04839x.N("left_horn", class04822.L().N(1, 13).N(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), class04838.N(7.0F, 2.0F, -12.0F));
      byte b0 = 14;
      byte b1 = 11;
      class04839x.N("right_front_leg", class04822.L().N(66, 42).N(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), class04838.N(-4.0F, 10.0F, -8.5F));
      class04839x.N("left_front_leg", class04822.L().N(41, 42).N(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), class04838.N(4.0F, 10.0F, -8.5F));
      class04839x.N("right_hind_leg", class04822.L().N(21, 45).N(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), class04838.N(-5.0F, 13.0F, 10.0F));
      class04839x.N("left_hind_leg", class04822.L().N(0, 45).N(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), class04838.N(5.0F, 13.0F, 10.0F));
      return class04792;
   }

   public class06013(class01686 var1) {
      super(var1);
      this.M = var1.y("body");
      this.E = this.M.y("mane");
      this.u = var1.y("head");
      this.i = this.u.y("right_ear");
      this.R = this.u.y("left_ear");
      this.B = var1.y("right_front_leg");
      this.Z = var1.y("left_front_leg");
      this.z = var1.y("right_hind_leg");
      this.U = var1.y("left_hind_leg");
   }

   public static class04806 y() {
      class04792 class04792 = L();
      class04792.N()
         .y("body")
         .N("mane", class04822.L().N(90, 33).N(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new class04834(0.001F)), class04838.N(0.0F, -14.0F, -3.0F));
      return class04806.N(class04792, 128, 64).N(N);
   }

   public static class04806 N() {
      return class04806.N(L(), 128, 64);
   }

   public void method_2819(class08484 var1) {
      super.method_2819(var1);
      float f = var1.Ny;
      float f1 = var1.NN;
      this.i.M = (float) (-Math.PI * 2.0 / 9.0) - f * class04995.m(f1);
      this.R.M = (float) (Math.PI * 2.0 / 9.0) + f * class04995.m(f1);
      this.u.R = var1.D * (float) (Math.PI / 180.0);
      float f2 = 1.0F - class04995.N(10 - 2 * var1.N) / 10.0F;
      this.u.i = class04995.B(f2, 0.87266463F, (float) (-Math.PI / 9));
      if (var1.NB) {
         this.u.L += f2 * 2.5F;
      }

      float f3 = 1.2F;
      this.B.i = class04995.P(f1) * 1.2F * f;
      this.Z.i = class04995.P(f1 + (float) Math.PI) * 1.2F * f;
      this.z.i = this.Z.i;
      this.U.i = this.B.i;
   }
}
