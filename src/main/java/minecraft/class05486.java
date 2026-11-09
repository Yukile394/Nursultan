package minecraft;

public class class05486 extends class06078<class08801> {
   public static final class02415 N = class02415.N(0.5F);
   private static final String y = "bone";
   private static final String L = "stinger";
   private static final String u = "left_antenna";
   private static final String i = "right_antenna";
   private static final String R = "front_legs";
   private static final String M = "middle_legs";
   private static final String B = "back_legs";
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;
   private final class01686 W;
   private final class01686 m;
   private final class01686 P;
   private final class01686 s;
   private final class01686 T;
   private float b;

   public class05486(class01686 var1) {
      super(var1);
      this.Z = var1.y("bone");
      class01686 class01686 = this.Z.y("body");
      this.P = class01686.y("stinger");
      this.s = class01686.y("left_antenna");
      this.T = class01686.y("right_antenna");
      this.z = this.Z.y("right_wing");
      this.U = this.Z.y("left_wing");
      this.E = this.Z.y("front_legs");
      this.W = this.Z.y("middle_legs");
      this.m = this.Z.y("back_legs");
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N().N("bone", class04822.L(), class04838.N(0.0F, 19.0F, 0.0F));
      class04839 class04839x = class04839x.N("body", class04822.L().N(0, 0).N(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F), class04838.N);
      class04839x.N("stinger", class04822.L().N(26, 7).N(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F), class04838.N);
      class04839x.N("left_antenna", class04822.L().N(2, 0).N(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), class04838.N(0.0F, -2.0F, -5.0F));
      class04839x.N("right_antenna", class04822.L().N(2, 3).N(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F), class04838.N(0.0F, -2.0F, -5.0F));
      class04834 class04834 = new class04834(0.001F);
      class04839x.N(
         "right_wing", class04822.L().N(0, 18).N(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, class04834), class04838.N(-1.5F, -4.0F, -3.0F, 0.0F, -0.2618F, 0.0F)
      );
      class04839x.N(
         "left_wing", class04822.L().N(0, 18).N().N(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, class04834), class04838.N(1.5F, -4.0F, -3.0F, 0.0F, 0.2618F, 0.0F)
      );
      class04839x.N("front_legs", class04822.L().N("front_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 1), class04838.N(1.5F, 3.0F, -2.0F));
      class04839x.N("middle_legs", class04822.L().N("middle_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 3), class04838.N(1.5F, 3.0F, 0.0F));
      class04839x.N("back_legs", class04822.L().N("back_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 5), class04838.N(1.5F, 3.0F, 2.0F));
      return class04806.N(class04792, 64, 64);
   }

   public void method_2819(class08801 var1) {
      super.method_2819(var1);
      this.b = var1.N;
      this.P.U = var1.y;
      if (!var1.L) {
         float f = var1.P * 120.32113F * (float) (Math.PI / 180.0);
         this.z.R = 0.0F;
         this.z.M = class04995.P(f) * (float) Math.PI * 0.15F;
         this.U.i = this.z.i;
         this.U.R = this.z.R;
         this.U.M = -this.z.M;
         this.E.i = (float) (Math.PI / 4);
         this.W.i = (float) (Math.PI / 4);
         this.m.i = (float) (Math.PI / 4);
      }

      if (!var1.u && !var1.L) {
         float f1 = class04995.P(var1.P * 0.18F);
         this.Z.i = 0.1F + f1 * (float) Math.PI * 0.025F;
         this.s.i = f1 * (float) Math.PI * 0.03F;
         this.T.i = f1 * (float) Math.PI * 0.03F;
         this.E.i = -f1 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
         this.m.i = -f1 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
         this.Z.L = this.Z.L - class04995.P(var1.P * 0.18F) * 0.9F;
      }

      if (this.b > 0.0F) {
         this.Z.i = class04995.z(this.b, this.Z.i, 3.0915928F);
      }
   }
}
