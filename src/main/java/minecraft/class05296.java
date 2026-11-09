package minecraft;

public class class05296 extends class06078<class08253> {
   public static final class02415 N = class02415.N(0.5F);
   private static final String y = "right_bottom_bristle";
   private static final String L = "right_middle_bristle";
   private static final String u = "right_top_bristle";
   private static final String i = "left_top_bristle";
   private static final String R = "left_middle_bristle";
   private static final String M = "left_bottom_bristle";
   private final class01686 B;
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;
   private final class01686 W;
   private final class01686 m;
   private final class01686 P;
   private final class01686 s;

   public class05296(class01686 var1) {
      super(var1);
      this.B = var1.y("right_leg");
      this.Z = var1.y("left_leg");
      this.z = var1.y("body");
      this.U = this.z.y("right_bottom_bristle");
      this.E = this.z.y("right_middle_bristle");
      this.W = this.z.y("right_top_bristle");
      this.m = this.z.y("left_top_bristle");
      this.P = this.z.y("left_middle_bristle");
      this.s = this.z.y("left_bottom_bristle");
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      class04839x.N("right_leg", class04822.L().N(0, 32).N(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F), class04838.N(-4.0F, 8.0F, 0.0F));
      class04839x.N("left_leg", class04822.L().N(0, 55).N(-2.0F, 0.0F, -2.0F, 4.0F, 16.0F, 4.0F), class04838.N(4.0F, 8.0F, 0.0F));
      class04839 class04839x = class04839x.N("body", class04822.L().N(0, 0).N(-8.0F, -6.0F, -8.0F, 16.0F, 14.0F, 16.0F), class04838.N(0.0F, 1.0F, 0.0F));
      class04839x.N(
         "right_bottom_bristle",
         class04822.L().N(16, 65).N(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true),
         class04838.N(-8.0F, 4.0F, -8.0F, 0.0F, 0.0F, -1.2217305F)
      );
      class04839x.N(
         "right_middle_bristle",
         class04822.L().N(16, 49).N(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true),
         class04838.N(-8.0F, -1.0F, -8.0F, 0.0F, 0.0F, -1.134464F)
      );
      class04839x.N(
         "right_top_bristle",
         class04822.L().N(16, 33).N(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true),
         class04838.N(-8.0F, -5.0F, -8.0F, 0.0F, 0.0F, -0.87266463F)
      );
      class04839x.N(
         "left_top_bristle", class04822.L().N(16, 33).N(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), class04838.N(8.0F, -6.0F, -8.0F, 0.0F, 0.0F, 0.87266463F)
      );
      class04839x.N(
         "left_middle_bristle", class04822.L().N(16, 49).N(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), class04838.N(8.0F, -2.0F, -8.0F, 0.0F, 0.0F, 1.134464F)
      );
      class04839x.N(
         "left_bottom_bristle", class04822.L().N(16, 65).N(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F), class04838.N(8.0F, 3.0F, -8.0F, 0.0F, 0.0F, 1.2217305F)
      );
      return class04806.N(class04792, 64, 128);
   }

   public void method_2819(class08253 var1) {
      super.method_2819(var1);
      float f = var1.NN;
      float f1 = Math.min(var1.Ny, 0.25F);
      if (!var1.L) {
         this.z.i = var1.h * (float) (Math.PI / 180.0);
         this.z.R = var1.D * (float) (Math.PI / 180.0);
      } else {
         this.z.i = 0.0F;
         this.z.R = 0.0F;
      }

      float f2 = 1.5F;
      this.z.M = 0.1F * class04995.m(f * 1.5F) * 4.0F * f1;
      this.z.L = 2.0F;
      this.z.L = this.z.L - 2.0F * class04995.P(f * 1.5F) * 2.0F * f1;
      this.Z.i = class04995.m(f * 1.5F * 0.5F) * 2.0F * f1;
      this.B.i = class04995.m(f * 1.5F * 0.5F + (float) Math.PI) * 2.0F * f1;
      this.Z.M = (float) (Math.PI / 18) * class04995.P(f * 1.5F * 0.5F) * f1;
      this.B.M = (float) (Math.PI / 18) * class04995.P(f * 1.5F * 0.5F + (float) Math.PI) * f1;
      this.Z.L = 8.0F + 2.0F * class04995.m(f * 1.5F * 0.5F + (float) Math.PI) * 2.0F * f1;
      this.B.L = 8.0F + 2.0F * class04995.m(f * 1.5F * 0.5F) * 2.0F * f1;
      this.U.M = -1.2217305F;
      this.E.M = -1.134464F;
      this.W.M = -0.87266463F;
      this.m.M = 0.87266463F;
      this.P.M = 1.134464F;
      this.s.M = 1.2217305F;
      float f3 = class04995.P(f * 1.5F + (float) Math.PI) * f1;
      this.U.M += f3 * 1.3F;
      this.E.M += f3 * 1.2F;
      this.W.M += f3 * 0.6F;
      this.m.M += f3 * 0.6F;
      this.P.M += f3 * 1.2F;
      this.s.M += f3 * 1.3F;
      float f4 = 1.0F;
      float f5 = 1.0F;
      this.U.M = this.U.M + 0.05F * class04995.m(var1.P * 1.0F * -0.4F);
      this.E.M = this.E.M + 0.1F * class04995.m(var1.P * 1.0F * 0.2F);
      this.W.M = this.W.M + 0.1F * class04995.m(var1.P * 1.0F * 0.4F);
      this.m.M = this.m.M + 0.1F * class04995.m(var1.P * 1.0F * 0.4F);
      this.P.M = this.P.M + 0.1F * class04995.m(var1.P * 1.0F * 0.2F);
      this.s.M = this.s.M + 0.05F * class04995.m(var1.P * 1.0F * -0.4F);
   }
}
