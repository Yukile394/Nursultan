package minecraft;

public class class03629 extends class06078<class02805> implements class06240<class02805> {
   private final class01686 N = this.field_54014.y("head");
   private final class01686 y = this.field_54014.y("body");
   private final class01686 L = this.y.y("right_arm");
   private final class01686 u = this.y.y("left_arm");
   private final class01686 i = this.y.y("right_wing");
   private final class01686 R = this.y.y("left_wing");
   private static final float M = (float) (Math.PI / 4);
   private static final float B = -1.134464F;
   private static final float Z = (float) (-Math.PI / 3);

   public class03629(class01686 var1) {
      super(var1.y("root"), class06851::z);
   }

   public void N(class02805 var1, class07070 var2, class01421 var3) {
      float f = 1.0F;
      float f1 = 3.0F;
      this.field_54014.N(var3);
      this.y.N(var3);
      var3.N(0.0F, 0.0625F, 0.1875F);
      var3.N(class02058.y.rotation(this.L.i));
      var3.y(0.7F, 0.7F, 0.7F);
      var3.N(0.0625F, 0.0F, 0.0F);
   }

   public void method_2819(class02805 var1) {
      super.method_2819(var1);
      float f = var1.Ny;
      float f1 = var1.NN;
      float f2 = class04995.P(var1.P * 20.0F * (float) (Math.PI / 180.0) + f1) * (float) Math.PI * 0.15F + f;
      float f3 = var1.P * 9.0F * (float) (Math.PI / 180.0);
      float f4 = Math.min(f / 0.3F, 1.0F);
      float f5 = 1.0F - f4;
      float f6 = var1.u;
      if (var1.N) {
         float f7 = var1.P * 8.0F * (float) (Math.PI / 180.0) + f;
         float f8 = class04995.P(f7) * 16.0F * (float) (Math.PI / 180.0);
         float f9 = var1.L;
         float f10 = class04995.P(f7) * 14.0F * (float) (Math.PI / 180.0);
         float f11 = class04995.P(f7) * 30.0F * (float) (Math.PI / 180.0);
         this.field_54014.R = var1.y ? (float) (Math.PI * 4) * f9 : this.field_54014.R;
         this.field_54014.M = f8 * (1.0F - f9);
         this.N.R = f11 * (1.0F - f9);
         this.N.M = f10 * (1.0F - f9);
      } else {
         this.N.i = var1.h * (float) (Math.PI / 180.0);
         this.N.R = var1.D * (float) (Math.PI / 180.0);
      }

      this.i.i = 0.43633232F * (1.0F - f4);
      this.i.R = (float) (-Math.PI / 4) + f2;
      this.R.i = 0.43633232F * (1.0F - f4);
      this.R.R = (float) (Math.PI / 4) - f2;
      this.y.i = f4 * (float) (Math.PI / 4);
      float f12 = f6 * class04995.B(f4, (float) (-Math.PI / 3), -1.134464F);
      this.field_54014.L = this.field_54014.L + (float)Math.cos(f3) * 0.25F * f5;
      this.L.i = f12;
      this.u.i = f12;
      float f13 = f5 * (1.0F - f6);
      float f14 = 0.43633232F - class04995.P(f3 + (float) (Math.PI * 3.0 / 2.0)) * (float) Math.PI * 0.075F * f13;
      this.u.M = -f14;
      this.L.M = f14;
      this.L.R = 0.27925268F * f6;
      this.u.R = -0.27925268F * f6;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N().N("root", class04822.L(), class04838.N(0.0F, 23.5F, 0.0F));
      class04839x.N("head", class04822.L().N(0, 0).N(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new class04834(0.0F)), class04838.N(0.0F, -3.99F, 0.0F));
      class04839 class04839x = class04839x.N(
         "body",
         class04822.L()
            .N(0, 10)
            .N(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new class04834(0.0F))
            .N(0, 16)
            .N(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F, new class04834(-0.2F)),
         class04838.N(0.0F, -4.0F, 0.0F)
      );
      class04839x.N("right_arm", class04822.L().N(23, 0).N(-0.75F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new class04834(-0.01F)), class04838.N(-1.75F, 0.5F, 0.0F));
      class04839x.N("left_arm", class04822.L().N(23, 6).N(-0.25F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F, new class04834(-0.01F)), class04838.N(1.75F, 0.5F, 0.0F));
      class04839x.N("right_wing", class04822.L().N(16, 14).N(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new class04834(0.0F)), class04838.N(-0.5F, 0.0F, 0.6F));
      class04839x.N("left_wing", class04822.L().N(16, 14).N(0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 8.0F, new class04834(0.0F)), class04838.N(0.5F, 0.0F, 0.6F));
      return class04806.N(class04792, 32, 32);
   }
}
