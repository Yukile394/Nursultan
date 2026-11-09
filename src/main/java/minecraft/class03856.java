package minecraft;

public class class03856 extends class06078<class08261> implements class06240<class08261> {
   private final class01686 N = this.field_54014.y("body");
   private final class01686 y = this.N.y("right_arm");
   private final class01686 L = this.N.y("left_arm");
   private final class01686 u = this.N.y("right_wing");
   private final class01686 i = this.N.y("left_wing");
   private final class01686 R = this.field_54014.y("head");

   public class03856(class01686 var1) {
      super(var1.y("root"), class06851::z);
   }

   public void N(class08261 var1, class07070 var2, class01421 var3) {
      boolean flag = var2 == class07070.field_6183;
      class01686 class01686 = flag ? this.y : this.L;
      this.field_54014.N(var3);
      this.N.N(var3);
      class01686.N(var3);
      var3.y(0.55F, 0.55F, 0.55F);
      this.N(var3, flag);
   }

   private void N(class01421 var1, boolean var2) {
      if (var2) {
         var1.N(0.046875, -0.15625, 0.078125);
      } else {
         var1.N(-0.046875, -0.15625, 0.078125);
      }
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N().N("root", class04822.L(), class04838.N(0.0F, -2.5F, 0.0F));
      class04839x.N("head", class04822.L().N(0, 0).N(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new class04834(0.0F)), class04838.N(0.0F, 20.0F, 0.0F));
      class04839 class04839x = class04839x.N(
         "body",
         class04822.L()
            .N(0, 10)
            .N(-1.5F, 0.0F, -1.0F, 3.0F, 4.0F, 2.0F, new class04834(0.0F))
            .N(0, 16)
            .N(-1.5F, 1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new class04834(-0.2F)),
         class04838.N(0.0F, 20.0F, 0.0F)
      );
      class04839x.N("right_arm", class04822.L().N(23, 0).N(-1.25F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new class04834(-0.1F)), class04838.N(-1.75F, 0.25F, 0.0F));
      class04839x.N("left_arm", class04822.L().N(23, 6).N(-0.75F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, new class04834(-0.1F)), class04838.N(1.75F, 0.25F, 0.0F));
      class04839x.N(
         "left_wing", class04822.L().N(16, 14).N().N(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new class04834(0.0F)).N(false), class04838.N(0.5F, 1.0F, 1.0F)
      );
      class04839x.N("right_wing", class04822.L().N(16, 14).N(0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 8.0F, new class04834(0.0F)), class04838.N(-0.5F, 1.0F, 1.0F));
      return class04806.N(class04792, 32, 32);
   }

   public void method_2819(class08261 var1) {
      super.method_2819(var1);
      this.R.R = var1.D * (float) (Math.PI / 180.0);
      this.R.i = var1.h * (float) (Math.PI / 180.0);
      float f = class04995.P(var1.P * 5.5F * (float) (Math.PI / 180.0)) * 0.1F;
      this.y.M = (float) (Math.PI / 5) + f;
      this.L.M = -((float) (Math.PI / 5) + f);
      if (var1.N) {
         this.N.i = 0.0F;
         this.N(!var1.Nq.i(), !var1.Ne.i(), f);
      } else {
         this.N.i = (float) (Math.PI / 20);
      }

      this.i.R = 1.0995574F + class04995.P(var1.P * 45.836624F * (float) (Math.PI / 180.0)) * (float) (Math.PI / 180.0) * 16.2F;
      this.u.R = -this.i.R;
      this.i.i = 0.47123888F;
      this.i.M = -0.47123888F;
      this.u.i = 0.47123888F;
      this.u.M = 0.47123888F;
   }

   private void N(boolean var1, boolean var2, float var3) {
      if (!var1 && !var2) {
         this.y.i = -1.2217305F;
         this.y.R = (float) (Math.PI / 12);
         this.y.M = -0.47123888F - var3;
         this.L.i = -1.2217305F;
         this.L.R = (float) (-Math.PI / 12);
         this.L.M = 0.47123888F + var3;
      } else {
         if (var1) {
            this.y.i = (float) (Math.PI * 7.0 / 6.0);
            this.y.R = (float) (Math.PI / 12);
            this.y.M = -0.47123888F - var3;
         }

         if (var2) {
            this.L.i = (float) (Math.PI * 7.0 / 6.0);
            this.L.R = (float) (-Math.PI / 12);
            this.L.M = 0.47123888F + var3;
         }
      }
   }
}
