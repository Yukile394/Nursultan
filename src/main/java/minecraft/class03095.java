package minecraft;

public class class03095 extends class06078<class08268> {
   private static final String N = "ribcage";
   private static final String y = "center_head";
   private static final String L = "right_head";
   private static final String u = "left_head";
   private static final float i = 0.065F;
   private static final float R = 0.265F;
   private final class01686 M;
   private final class01686 B;
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;

   public class03095(class01686 var1) {
      super(var1);
      this.z = var1.y("ribcage");
      this.U = var1.y("tail");
      this.M = var1.y("center_head");
      this.B = var1.y("right_head");
      this.Z = var1.y("left_head");
   }

   private static void N(class08268 var0, class01686 var1, int var2) {
      var1.R = (var0.y[var2] - var0.x) * (float) (Math.PI / 180.0);
      var1.i = var0.N[var2] * (float) (Math.PI / 180.0);
   }

   public void method_2819(class08268 var1) {
      super.method_2819(var1);
      N(var1, this.B, 0);
      N(var1, this.Z, 1);
      float f = class04995.P(var1.P * 0.1F);
      this.z.i = (0.065F + 0.05F * f) * (float) Math.PI;
      this.U.N(-2.0F, 6.9F + class04995.P(this.z.i) * 10.0F, -0.5F + class04995.m(this.z.i) * 10.0F);
      this.U.i = (0.265F + 0.1F * f) * (float) Math.PI;
      this.M.R = var1.D * (float) (Math.PI / 180.0);
      this.M.i = var1.h * (float) (Math.PI / 180.0);
   }

   public static class04806 N(class04834 var0) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("shoulders", class04822.L().N(0, 16).N(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, var0), class04838.N);
      float f = 0.20420352F;
      class04839.N(
         "ribcage",
         class04822.L()
            .N(0, 22)
            .N(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, var0)
            .N(24, 22)
            .N(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, var0)
            .N(24, 22)
            .N(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, var0)
            .N(24, 22)
            .N(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, var0),
         class04838.N(-2.0F, 6.9F, -0.5F, 0.20420352F, 0.0F, 0.0F)
      );
      class04839.N(
         "tail",
         class04822.L().N(12, 22).N(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, var0),
         class04838.N(-2.0F, 6.9F + class04995.P(0.20420352F) * 10.0F, -0.5F + class04995.m(0.20420352F) * 10.0F, 0.83252203F, 0.0F, 0.0F)
      );
      class04839.N("center_head", class04822.L().N(0, 0).N(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, var0), class04838.N);
      class04822 class04822 = class04822.L().N(32, 0).N(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, var0);
      class04839.N("right_head", class04822, class04838.N(-8.0F, 4.0F, 0.0F));
      class04839.N("left_head", class04822, class04838.N(10.0F, 4.0F, 0.0F));
      return class04806.N(class04792, 64, 64);
   }
}
