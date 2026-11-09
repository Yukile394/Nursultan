package minecraft;

public class class01970 extends class06078<class08483> {
   public static final class02415 N = class02415.N(0.5F);
   private static final float y = 9.0F;
   private static final float L = 100.0F;
   private final class01686 u;
   private final class00094 i;
   private final class00094 R;
   private final class00094 M;
   private final class00094 B;
   private final class00094 Z;
   private final class00094 z;
   private final class00094 U;
   private final class00094 E;

   public class01970(class01686 var1) {
      super(var1);
      this.u = var1.y("bone").y("body").y("head");
      this.i = class01940.i.N(var1);
      this.R = class01940.u.N(var1);
      this.M = class01940.R.N(var1);
      this.B = class01940.L.N(var1);
      this.Z = class01940.M.N(var1);
      this.z = class01940.Z.N(var1);
      this.U = class01940.y.N(var1);
      this.E = class01940.N.N(var1);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839xx = class04792.N().N("bone", class04822.L(), class04838.N(0.0F, 5.0F, 0.0F));
      class04839 class04839x = class04839xx.N(
         "body",
         class04822.L()
            .N(62, 68)
            .N(-12.5F, -14.0F, -20.0F, 25.0F, 29.0F, 40.0F, new class04834(0.0F))
            .N(62, 0)
            .N(-12.5F, -14.0F, -20.0F, 25.0F, 24.0F, 40.0F, new class04834(0.5F))
            .N(87, 68)
            .N(-12.5F, 12.0F, -20.0F, 25.0F, 0.0F, 40.0F, new class04834(0.0F)),
         class04838.N(0.0F, 0.0F, 0.0F)
      );
      class04839xx.N(
         "right_front_leg", class04822.L().N(32, 87).N(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new class04834(0.0F)), class04838.N(-7.5F, 10.0F, -15.0F)
      );
      class04839xx.N(
         "right_mid_leg", class04822.L().N(32, 105).N(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new class04834(0.0F)), class04838.N(-7.5F, 10.0F, 0.0F)
      );
      class04839xx.N(
         "right_hind_leg", class04822.L().N(32, 123).N(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new class04834(0.0F)), class04838.N(-7.5F, 10.0F, 15.0F)
      );
      class04839xx.N(
         "left_front_leg", class04822.L().N(0, 87).N(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new class04834(0.0F)), class04838.N(7.5F, 10.0F, -15.0F)
      );
      class04839xx.N("left_mid_leg", class04822.L().N(0, 105).N(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new class04834(0.0F)), class04838.N(7.5F, 10.0F, 0.0F));
      class04839xx.N(
         "left_hind_leg", class04822.L().N(0, 123).N(-3.5F, -1.0F, -4.0F, 7.0F, 10.0F, 8.0F, new class04834(0.0F)), class04838.N(7.5F, 10.0F, 15.0F)
      );
      class04839 class04839xx = class04839x.N(
         "head",
         class04822.L()
            .N(8, 15)
            .N(-6.5F, -7.5F, -11.5F, 13.0F, 18.0F, 11.0F, new class04834(0.0F))
            .N(8, 4)
            .N(-6.5F, 7.5F, -11.5F, 13.0F, 0.0F, 11.0F, new class04834(0.0F)),
         class04838.N(0.0F, 6.5F, -19.48F)
      );
      class04839xx.N("left_ear", class04822.L().N(2, 0).N(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new class04834(0.0F)), class04838.N(6.51F, -7.5F, -4.51F));
      class04839xx.N("right_ear", class04822.L().N(48, 0).N(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F, new class04834(0.0F)), class04838.N(-6.51F, -7.5F, -4.51F));
      class04839xx.N("nose", class04822.L().N(10, 45).N(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F, new class04834(0.0F)), class04838.N(0.0F, -4.5F, -11.5F));
      class04839xx.N("lower_beak", class04822.L().N(10, 57).N(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F, new class04834(0.0F)), class04838.N(0.0F, 2.5F, -12.5F));
      return class04806.N(class04792, 192, 192);
   }

   public void method_2819(class08483 var1) {
      super.method_2819(var1);
      this.u.i = var1.h * (float) (Math.PI / 180.0);
      this.u.R = var1.D * (float) (Math.PI / 180.0);
      if (var1.N) {
         this.i.N(var1.NN, var1.Ny, 9.0F, 100.0F);
      } else {
         this.R.N(var1.NN, var1.Ny, 9.0F, 100.0F);
      }

      this.M.N(var1.y, var1.P);
      this.B.N(var1.L, var1.P);
      this.Z.N(var1.u, var1.P);
      this.z.N(var1.i, var1.P);
      this.U.N(var1.R, var1.P);
      if (var1.NB) {
         this.E.N();
      }
   }
}
