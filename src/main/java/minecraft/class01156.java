package minecraft;

public class class01156 extends class06078<class08440> {
   private final class01686 N;
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;

   public class01156(class01686 var1) {
      super(var1);
      this.M = var1.y("neck");
      this.N = this.M.y("head");
      this.y = this.N.y("mouth");
      this.L = var1.y("right_hind_leg");
      this.u = var1.y("left_hind_leg");
      this.i = var1.y("right_front_leg");
      this.R = var1.y("left_front_leg");
   }

   public void method_2819(class08440 var1) {
      super.method_2819(var1);
      float f = var1.N;
      float f1 = var1.y;
      byte b0 = 10;
      if (f1 > 0.0F) {
         float f2 = class04995.R(f1, 10.0F);
         float f3 = (1.0F + f2) * 0.5F;
         float f4 = f3 * f3 * f3 * 12.0F;
         float f5 = f4 * class04995.m(this.M.i);
         this.M.u = -6.5F + f4;
         this.M.L = -7.0F - f5;
         if (f1 > 5.0F) {
            this.y.i = class04995.m((-4.0F + f1) / 4.0F) * (float) Math.PI * 0.4F;
         } else {
            this.y.i = (float) (Math.PI / 20) * class04995.m((float) Math.PI * f1 / 10.0F);
         }
      } else {
         float f6 = -1.0F;
         float f8 = -1.0F * class04995.m(this.M.i);
         this.M.y = 0.0F;
         this.M.L = -7.0F - f8;
         this.M.u = 5.5F;
         boolean flag = f > 0.0F;
         this.M.i = flag ? 0.21991149F : 0.0F;
         this.y.i = (float) Math.PI * (flag ? 0.05F : 0.01F);
         if (flag) {
            double d0 = f / 40.0;
            this.M.y = (float)Math.sin(d0 * 10.0) * 3.0F;
         } else if (var1.L > 0.0) {
            float f10 = class04995.m(var1.L * (float) Math.PI * 0.25F);
            this.y.i = (float) (Math.PI / 2) * f10;
         }
      }

      this.N.i = var1.h * (float) (Math.PI / 180.0);
      this.N.R = var1.D * (float) (Math.PI / 180.0);
      float f7 = var1.NN;
      float f9 = 0.4F * var1.Ny;
      this.L.i = class04995.P(f7 * 0.6662F) * f9;
      this.u.i = class04995.P(f7 * 0.6662F + (float) Math.PI) * f9;
      this.i.i = class04995.P(f7 * 0.6662F + (float) Math.PI) * f9;
      this.R.i = class04995.P(f7 * 0.6662F) * f9;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      byte b0 = 16;
      class04839 class04839x = class04839x.N("neck", class04822.L().N(68, 73).N(-5.0F, -1.0F, -18.0F, 10.0F, 10.0F, 18.0F), class04838.N(0.0F, -7.0F, 5.5F))
         .N(
            "head",
            class04822.L().N(0, 0).N(-8.0F, -20.0F, -14.0F, 16.0F, 20.0F, 16.0F).N(0, 0).N(-2.0F, -6.0F, -18.0F, 4.0F, 8.0F, 4.0F),
            class04838.N(0.0F, 16.0F, -17.0F)
         );
      class04839x.N(
         "right_horn", class04822.L().N(74, 55).N(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), class04838.N(-10.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F)
      );
      class04839x.N(
         "left_horn", class04822.L().N(74, 55).N().N(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F), class04838.N(8.0F, -14.0F, -8.0F, 1.0995574F, 0.0F, 0.0F)
      );
      class04839x.N("mouth", class04822.L().N(0, 36).N(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F), class04838.N(0.0F, -2.0F, 2.0F));
      class04839x.N(
         "body",
         class04822.L().N(0, 55).N(-7.0F, -10.0F, -7.0F, 14.0F, 16.0F, 20.0F).N(0, 91).N(-6.0F, 6.0F, -7.0F, 12.0F, 13.0F, 18.0F),
         class04838.N(0.0F, 1.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      class04839x.N("right_hind_leg", class04822.L().N(96, 0).N(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), class04838.N(-8.0F, -13.0F, 18.0F));
      class04839x.N("left_hind_leg", class04822.L().N(96, 0).N().N(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), class04838.N(8.0F, -13.0F, 18.0F));
      class04839x.N("right_front_leg", class04822.L().N(64, 0).N(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), class04838.N(-8.0F, -13.0F, -5.0F));
      class04839x.N("left_front_leg", class04822.L().N(64, 0).N().N(-4.0F, 0.0F, -4.0F, 8.0F, 37.0F, 8.0F), class04838.N(8.0F, -13.0F, -5.0F));
      return class04806.N(class04792, 128, 128);
   }
}
