package minecraft;

public class class01174 extends class06078<class08479> {
   private final class01686 N;
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;

   public class01174(class01686 var1) {
      super(var1);
      this.N = var1.y("head");
      this.y = var1.y("right_arm");
      this.L = var1.y("left_arm");
      this.u = var1.y("right_leg");
      this.i = var1.y("left_leg");
   }

   public class01686 y() {
      return this.y;
   }

   public void method_2819(class08479 var1) {
      super.method_2819(var1);
      float f = var1.N;
      float f1 = var1.Ny;
      float f2 = var1.NN;
      if (f > 0.0F) {
         this.y.i = -2.0F + 1.5F * class04995.R(f, 10.0F);
         this.L.i = -2.0F + 1.5F * class04995.R(f, 10.0F);
      } else {
         int ix = var1.y;
         if (ix > 0) {
            this.y.i = -0.8F + 0.025F * class04995.R((float)ix, 70.0F);
            this.L.i = 0.0F;
         } else {
            this.y.i = (-0.2F + 1.5F * class04995.R(f2, 13.0F)) * f1;
            this.L.i = (-0.2F - 1.5F * class04995.R(f2, 13.0F)) * f1;
         }
      }

      this.N.R = var1.D * (float) (Math.PI / 180.0);
      this.N.i = var1.h * (float) (Math.PI / 180.0);
      this.u.i = -1.5F * class04995.R(f2, 13.0F) * f1;
      this.i.i = 1.5F * class04995.R(f2, 13.0F) * f1;
      this.u.R = 0.0F;
      this.i.R = 0.0F;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N(
         "head",
         class04822.L().N(0, 0).N(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F).N(24, 0).N(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F),
         class04838.N(0.0F, -7.0F, -2.0F)
      );
      class04839.N(
         "body",
         class04822.L().N(0, 40).N(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F).N(0, 70).N(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, new class04834(0.5F)),
         class04838.N(0.0F, -7.0F, 0.0F)
      );
      class04839.N("right_arm", class04822.L().N(60, 21).N(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), class04838.N(0.0F, -7.0F, 0.0F));
      class04839.N("left_arm", class04822.L().N(60, 58).N(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F), class04838.N(0.0F, -7.0F, 0.0F));
      class04839.N("right_leg", class04822.L().N(37, 0).N(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), class04838.N(-4.0F, 11.0F, 0.0F));
      class04839.N("left_leg", class04822.L().N(60, 0).N().N(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F), class04838.N(5.0F, 11.0F, 0.0F));
      return class04806.N(class04792, 128, 128);
   }
}
