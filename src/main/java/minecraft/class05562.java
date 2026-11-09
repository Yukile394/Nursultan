package minecraft;

public class class05562 extends class06078<class08788> {
   public static final float N = 1.8849558F;
   public static final class02415 y = class02415.N(0.5F);
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;

   private void L(float var1, float var2) {
      if (!(var2 <= 1.0E-5F)) {
         float f = var1 * 0.075F;
         float f1 = class04995.P(f);
         float f2 = class04995.m(f) * 0.15F;
         float f3 = (-0.15F + 0.075F * f1) * var2;
         this.B.i += f3;
         this.B.L -= f2 * var2;
         this.Z.i -= f3;
         this.z.i += 0.2F * f1 * var2;
         float f4 = (-0.3F * f1 - 0.19F) * var2;
         this.U.R += f4;
         this.E.R -= f4;
         this.u.i += ((float) (Math.PI * 3.0 / 4.0) - f1 * 0.11F) * var2;
         this.u.R += 0.47123894F * var2;
         this.u.M += 1.7278761F * var2;
         this.R.i += ((float) (Math.PI / 4) - f1 * 0.2F) * var2;
         this.R.R += 2.042035F * var2;
         this.L.R += 0.5F * f1 * var2;
      }
   }

   public class05562(class01686 var1) {
      super(var1);
      this.B = var1.y("body");
      this.Z = this.B.y("head");
      this.i = this.B.y("right_hind_leg");
      this.u = this.B.y("left_hind_leg");
      this.M = this.B.y("right_front_leg");
      this.R = this.B.y("left_front_leg");
      this.L = this.B.y("tail");
      this.z = this.Z.y("top_gills");
      this.U = this.Z.y("left_gills");
      this.E = this.Z.y("right_gills");
   }

   private void y(float var1) {
      if (!(var1 <= 1.0E-5F)) {
         this.i.i = this.i.i + this.u.i * var1;
         class01686 class01686 = this.i;
         class01686.R = class01686.R + -this.u.R * var1;
         class01686 = this.i;
         class01686.M = class01686.M + -this.u.M * var1;
         this.M.i = this.M.i + this.R.i * var1;
         class01686 = this.M;
         class01686.R = class01686.R + -this.R.R * var1;
         class01686 = this.M;
         class01686.M = class01686.M + -this.R.M * var1;
      }
   }

   private void y(float var1, float var2) {
      if (!(var2 <= 1.0E-5F)) {
         float f = var1 * 0.11F;
         float f1 = class04995.P(f);
         float f2 = (f1 * f1 - 2.0F * f1) / 5.0F;
         float f3 = 0.7F * f1;
         float f4 = 0.09F * f1 * var2;
         this.Z.R += f4;
         this.L.R += f4;
         float f5 = (0.6F - 0.08F * (f1 * f1 + 2.0F * class04995.m(f))) * var2;
         this.z.i += f5;
         this.U.R -= f5;
         this.E.R += f5;
         float f6 = 0.9424779F * var2;
         float f7 = 1.0995574F * var2;
         this.u.i += f6;
         this.u.R += (1.5F - f2) * var2;
         this.u.M += -0.1F * var2;
         this.R.i += f7;
         this.R.R += ((float) (Math.PI / 2) - f3) * var2;
         this.i.i += f6;
         this.i.R += (-1.0F - f2) * var2;
         this.M.i += f7;
         this.M.R += ((float) (-Math.PI / 2) - f3) * var2;
      }
   }

   public void method_2819(class08788 var1) {
      super.method_2819(var1);
      float f = var1.y;
      float f1 = var1.u;
      float f2 = var1.i;
      float f3 = var1.L;
      float f4 = 1.0F - f3;
      float f5 = 1.0F - Math.min(f2, f3);
      this.B.R = this.B.R + var1.D * (float) (Math.PI / 180.0);
      this.N(var1.P, var1.h, Math.min(f3, f1));
      this.L(var1.P, Math.min(f4, f1));
      this.y(var1.P, Math.min(f3, f2));
      this.N(var1.P, Math.min(f4, f2));
      this.N(f);
      this.y(f5);
   }

   private void N(float var1) {
      if (!(var1 <= 1.0E-5F)) {
         this.u.i += 1.4137167F * var1;
         this.u.R += 1.0995574F * var1;
         this.u.M += (float) (Math.PI / 4) * var1;
         this.R.i += (float) (Math.PI / 4) * var1;
         this.R.R += 2.042035F * var1;
         this.B.i += -0.15F * var1;
         this.B.M += 0.35F * var1;
      }
   }

   private void N(float var1, float var2) {
      if (!(var2 <= 1.0E-5F)) {
         float f = var1 * 0.09F;
         float f1 = class04995.m(f);
         float f2 = class04995.P(f);
         float f3 = f1 * f1 - 2.0F * f1;
         float f4 = f2 * f2 - 3.0F * f1;
         this.Z.i += -0.09F * f3 * var2;
         this.Z.M += -0.2F * var2;
         this.L.R += (-0.1F + 0.1F * f3) * var2;
         float f5 = (0.6F + 0.05F * f4) * var2;
         this.z.i += f5;
         this.U.R -= f5;
         this.E.R += f5;
         this.u.i += 1.1F * var2;
         this.u.R += 1.0F * var2;
         this.R.i += 0.8F * var2;
         this.R.R += 2.3F * var2;
         this.R.M -= 0.5F * var2;
      }
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N()
         .N(
            "body",
            class04822.L().N(0, 11).N(-4.0F, -2.0F, -9.0F, 8.0F, 4.0F, 10.0F).N(2, 17).N(0.0F, -3.0F, -8.0F, 0.0F, 5.0F, 9.0F),
            class04838.N(0.0F, 20.0F, 5.0F)
         );
      class04834 class04834 = new class04834(0.001F);
      class04839 class04839x = class04839x.N(
         "head", class04822.L().N(0, 1).N(-4.0F, -3.0F, -5.0F, 8.0F, 5.0F, 5.0F, class04834), class04838.N(0.0F, 0.0F, -9.0F)
      );
      class04822 class04822xxxx = class04822.L().N(3, 37).N(-4.0F, -3.0F, 0.0F, 8.0F, 3.0F, 0.0F, class04834);
      class04822 class04822x = class04822.L().N(0, 40).N(-3.0F, -5.0F, 0.0F, 3.0F, 7.0F, 0.0F, class04834);
      class04822 class04822xx = class04822.L().N(11, 40).N(0.0F, -5.0F, 0.0F, 3.0F, 7.0F, 0.0F, class04834);
      class04839x.N("top_gills", class04822xxxx, class04838.N(0.0F, -3.0F, -1.0F));
      class04839x.N("left_gills", class04822x, class04838.N(-4.0F, 0.0F, -1.0F));
      class04839x.N("right_gills", class04822xx, class04838.N(4.0F, 0.0F, -1.0F));
      class04822 class04822xxx = class04822.L().N(2, 13).N(-1.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, class04834);
      class04822 class04822xxxx = class04822.L().N(2, 13).N(-2.0F, 0.0F, 0.0F, 3.0F, 5.0F, 0.0F, class04834);
      class04839x.N("right_hind_leg", class04822xxxx, class04838.N(-3.5F, 1.0F, -1.0F));
      class04839x.N("left_hind_leg", class04822xxx, class04838.N(3.5F, 1.0F, -1.0F));
      class04839x.N("right_front_leg", class04822xxxx, class04838.N(-3.5F, 1.0F, -8.0F));
      class04839x.N("left_front_leg", class04822xxx, class04838.N(3.5F, 1.0F, -8.0F));
      class04839x.N("tail", class04822.L().N(2, 19).N(0.0F, -3.0F, 0.0F, 0.0F, 5.0F, 12.0F), class04838.N(0.0F, 0.0F, 1.0F));
      return class04806.N(class04792, 64, 64);
   }

   private void N(float var1, float var2, float var3) {
      if (!(var3 <= 1.0E-5F)) {
         float f = var1 * 0.33F;
         float f1 = class04995.m(f);
         float f2 = class04995.P(f);
         float f3 = 0.13F * f1;
         this.B.i += (var2 * (float) (Math.PI / 180.0) + f3) * var3;
         this.Z.i -= f3 * 1.8F * var3;
         this.B.L -= 0.45F * f2 * var3;
         this.z.i += (-0.5F * f1 - 0.8F) * var3;
         float f4 = (0.3F * f1 + 0.9F) * var3;
         this.U.R += f4;
         this.E.R -= f4;
         this.L.R = this.L.R + 0.3F * class04995.P(f * 0.9F) * var3;
         this.u.i += 1.8849558F * var3;
         this.u.R += -0.4F * f1 * var3;
         this.u.M += (float) (Math.PI / 2) * var3;
         this.R.i += 1.8849558F * var3;
         this.R.R += (-0.2F * f2 - 0.1F) * var3;
         this.R.M += (float) (Math.PI / 2) * var3;
      }
   }
}
