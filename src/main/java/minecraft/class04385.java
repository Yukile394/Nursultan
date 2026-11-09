package minecraft;

public class class04385 extends class06078<class08476> {
   private static final String N = "body0";
   private static final String y = "body1";
   private static final String L = "right_middle_front_leg";
   private static final String u = "left_middle_front_leg";
   private static final String i = "right_middle_hind_leg";
   private static final String R = "left_middle_hind_leg";
   private final class01686 M;
   private final class01686 B;
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;
   private final class01686 W;
   private final class01686 m;
   private final class01686 P;

   public class04385(class01686 var1) {
      super(var1);
      this.M = var1.y("head");
      this.B = var1.y("right_hind_leg");
      this.Z = var1.y("left_hind_leg");
      this.z = var1.y("right_middle_hind_leg");
      this.U = var1.y("left_middle_hind_leg");
      this.E = var1.y("right_middle_front_leg");
      this.W = var1.y("left_middle_front_leg");
      this.m = var1.y("right_front_leg");
      this.P = var1.y("left_front_leg");
   }

   public void method_2819(class08476 var1) {
      super.method_2819(var1);
      this.M.R = var1.D * (float) (Math.PI / 180.0);
      this.M.i = var1.h * (float) (Math.PI / 180.0);
      float f = var1.NN * 0.6662F;
      float f1 = var1.Ny;
      float f2 = -(class04995.P(f * 2.0F + 0.0F) * 0.4F) * f1;
      float f3 = -(class04995.P(f * 2.0F + (float) Math.PI) * 0.4F) * f1;
      float f4 = -(class04995.P(f * 2.0F + (float) (Math.PI / 2)) * 0.4F) * f1;
      float f5 = -(class04995.P(f * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * f1;
      float f6 = Math.abs(class04995.m(f + 0.0F) * 0.4F) * f1;
      float f7 = Math.abs(class04995.m(f + (float) Math.PI) * 0.4F) * f1;
      float f8 = Math.abs(class04995.m(f + (float) (Math.PI / 2)) * 0.4F) * f1;
      float f9 = Math.abs(class04995.m(f + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * f1;
      this.B.R += f2;
      this.Z.R -= f2;
      this.z.R += f3;
      this.U.R -= f3;
      this.E.R += f4;
      this.W.R -= f4;
      this.m.R += f5;
      this.P.R -= f5;
      this.B.M += f6;
      this.Z.M -= f6;
      this.z.M += f7;
      this.U.M -= f7;
      this.E.M += f8;
      this.W.M -= f8;
      this.m.M += f9;
      this.P.M -= f9;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      byte b0 = 15;
      class04839.N("head", class04822.L().N(32, 4).N(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F), class04838.N(0.0F, 15.0F, -3.0F));
      class04839.N("body0", class04822.L().N(0, 0).N(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), class04838.N(0.0F, 15.0F, 0.0F));
      class04839.N("body1", class04822.L().N(0, 12).N(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F), class04838.N(0.0F, 15.0F, 9.0F));
      class04822 class04822x = class04822.L().N(18, 0).N(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
      class04822 class04822x = class04822.L().N(18, 0).N().N(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
      float f = (float) (Math.PI / 4);
      float f1 = (float) (Math.PI / 8);
      class04839.N("right_hind_leg", class04822x, class04838.N(-4.0F, 15.0F, 2.0F, 0.0F, (float) (Math.PI / 4), (float) (-Math.PI / 4)));
      class04839.N("left_hind_leg", class04822x, class04838.N(4.0F, 15.0F, 2.0F, 0.0F, (float) (-Math.PI / 4), (float) (Math.PI / 4)));
      class04839.N("right_middle_hind_leg", class04822x, class04838.N(-4.0F, 15.0F, 1.0F, 0.0F, (float) (Math.PI / 8), -0.58119464F));
      class04839.N("left_middle_hind_leg", class04822x, class04838.N(4.0F, 15.0F, 1.0F, 0.0F, (float) (-Math.PI / 8), 0.58119464F));
      class04839.N("right_middle_front_leg", class04822x, class04838.N(-4.0F, 15.0F, 0.0F, 0.0F, (float) (-Math.PI / 8), -0.58119464F));
      class04839.N("left_middle_front_leg", class04822x, class04838.N(4.0F, 15.0F, 0.0F, 0.0F, (float) (Math.PI / 8), 0.58119464F));
      class04839.N("right_front_leg", class04822x, class04838.N(-4.0F, 15.0F, -1.0F, 0.0F, (float) (-Math.PI / 4), (float) (-Math.PI / 4)));
      class04839.N("left_front_leg", class04822x, class04838.N(4.0F, 15.0F, -1.0F, 0.0F, (float) (Math.PI / 4), (float) (Math.PI / 4)));
      return class04806.N(class04792, 64, 32);
   }
}
