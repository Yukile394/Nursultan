package minecraft;

public class class03797 extends class06078<class08787> {
   private static final float L = 2.0F;
   private static final float u = 2.5F;
   public static final class02415 N = class02415.N(0.45F);
   protected final class01686 y;
   private final class00094 i;
   private final class00094 R;
   private final class00094 M;
   private final class00094 B;
   private final class00094 Z;
   private final class00094 z;

   protected static class04792 L() {
      class04792 class04792 = new class04792();
      class04839 class04839xx = class04792.N();
      class04839 class04839x = class04839xx.N("body", class04822.L().N(0, 25).N(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F), class04838.N(0.0F, 4.0F, 9.5F));
      class04839x.N("hump", class04822.L().N(74, 0).N(-4.5F, -5.0F, -5.5F, 9.0F, 5.0F, 11.0F), class04838.N(0.0F, -12.0F, -10.0F));
      class04839x.N("tail", class04822.L().N(122, 0).N(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 0.0F), class04838.N(0.0F, -9.0F, 3.5F));
      class04839 class04839xx = class04839x.N(
         "head",
         class04822.L()
            .N(60, 24)
            .N(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F)
            .N(21, 0)
            .N(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F)
            .N(50, 0)
            .N(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F),
         class04838.N(0.0F, -3.0F, -19.5F)
      );
      class04839xx.N("left_ear", class04822.L().N(45, 0).N(-0.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), class04838.N(2.5F, -21.0F, -9.5F));
      class04839xx.N("right_ear", class04822.L().N(67, 0).N(-2.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), class04838.N(-2.5F, -21.0F, -9.5F));
      class04839xx.N("left_hind_leg", class04822.L().N(58, 16).N(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), class04838.N(4.9F, 1.0F, 9.5F));
      class04839xx.N("right_hind_leg", class04822.L().N(94, 16).N(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), class04838.N(-4.9F, 1.0F, 9.5F));
      class04839xx.N("left_front_leg", class04822.L().N(0, 0).N(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), class04838.N(4.9F, 1.0F, -10.5F));
      class04839xx.N("right_front_leg", class04822.L().N(0, 26).N(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), class04838.N(-4.9F, 1.0F, -10.5F));
      return class04792;
   }

   public class03797(class01686 var1) {
      super(var1);
      class01686 class01686 = var1.y("body");
      this.y = class01686.y("head");
      this.i = class03768.N.N(var1);
      this.R = class03768.y.N(var1);
      this.M = class03768.L.N(var1);
      this.B = class03768.u.N(var1);
      this.Z = class03768.R.N(var1);
      this.z = class03768.i.N(var1);
   }

   public static class04806 y() {
      return class04806.N(L(), 128, 128);
   }

   public void method_2819(class08787 var1) {
      super.method_2819(var1);
      this.N(var1, var1.D, var1.h);
      this.i.N(var1.NN, var1.Ny, 2.0F, 2.5F);
      this.R.N(var1.u, var1.P);
      this.M.N(var1.i, var1.P);
      this.B.N(var1.R, var1.P);
      this.Z.N(var1.M, var1.P);
      this.z.N(var1.B, var1.P);
   }

   private void N(class08787 var1, float var2, float var3) {
      var2 = class04995.N(var2, -30.0F, 30.0F);
      var3 = class04995.N(var3, -25.0F, 45.0F);
      if (var1.L > 0.0F) {
         float f = 45.0F * var1.L / 55.0F;
         var3 = class04995.N(var3 + f, -25.0F, 70.0F);
      }

      this.y.R = var2 * (float) (Math.PI / 180.0);
      this.y.i = var3 * (float) (Math.PI / 180.0);
   }
}
