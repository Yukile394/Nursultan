package minecraft;

public class class04257 extends class06078<class02787> {
   public static final class02415 N = class02415.N(0.6F);
   private static final float y = 25.0F;
   private static final float L = 22.5F;
   private static final float u = 16.5F;
   private static final float i = 2.5F;
   private static final String R = "head_cube";
   private static final String M = "right_ear_cube";
   private static final String B = "left_ear_cube";
   private final class01686 Z;
   private final class01686 z;
   private final class01686 U;
   private final class01686 E;
   private final class01686 W;
   private final class01686 m;
   private final class00094 P;
   private final class00094 s;
   private final class00094 T;
   private final class00094 b;

   public class04257(class01686 var1) {
      super(var1);
      this.Z = var1.y("body");
      this.z = var1.y("right_hind_leg");
      this.U = var1.y("left_hind_leg");
      this.W = this.Z.y("head");
      this.m = this.Z.y("tail");
      this.E = var1.y("cube");
      this.P = class03832.y.N(var1);
      this.s = class03832.u.N(var1);
      this.T = class03832.N.N(var1);
      this.b = class03832.L.N(var1);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839xx = class04792.N();
      class04839 class04839x = class04839xx.N(
         "body",
         class04822.L()
            .N(0, 20)
            .N(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new class04834(0.3F))
            .N(0, 40)
            .N(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new class04834(0.0F)),
         class04838.N(0.0F, 21.0F, 4.0F)
      );
      class04839x.N(
         "tail",
         class04822.L().N(44, 53).N(-0.5F, -0.0865F, 0.0933F, 1.0F, 6.0F, 1.0F, new class04834(0.0F)),
         class04838.N(0.0F, -3.0F, 1.0F, 0.5061F, 0.0F, 0.0F)
      );
      class04839 class04839xx = class04839x.N("head", class04822.L(), class04838.N(0.0F, -2.0F, -11.0F));
      class04839xx.N(
         "head_cube",
         class04822.L().N(43, 15).N(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new class04834(0.0F)),
         class04838.N(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F)
      );
      class04839xx.N("right_ear", class04822.L(), class04838.N(-1.0F, -1.0F, 0.0F))
         .N(
            "right_ear_cube",
            class04822.L().N(43, 10).N(-2.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new class04834(0.0F)),
            class04838.N(-0.5F, 0.0F, -0.6F, 0.1886F, -0.3864F, -0.0718F)
         );
      class04839xx.N("left_ear", class04822.L(), class04838.N(1.0F, -2.0F, 0.0F))
         .N(
            "left_ear_cube",
            class04822.L().N(47, 10).N(0.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new class04834(0.0F)),
            class04838.N(0.5F, 1.0F, -0.6F, 0.1886F, 0.3864F, 0.0718F)
         );
      class04839xx.N("right_hind_leg", class04822.L().N(51, 31).N(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new class04834(0.0F)), class04838.N(-2.0F, 21.0F, 4.0F));
      class04839xx.N("left_hind_leg", class04822.L().N(42, 31).N(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new class04834(0.0F)), class04838.N(2.0F, 21.0F, 4.0F));
      class04839xx.N(
         "right_front_leg", class04822.L().N(51, 43).N(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new class04834(0.0F)), class04838.N(-2.0F, 21.0F, -4.0F)
      );
      class04839xx.N("left_front_leg", class04822.L().N(42, 43).N(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new class04834(0.0F)), class04838.N(2.0F, 21.0F, -4.0F));
      class04839xx.N("cube", class04822.L().N(0, 0).N(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 10.0F, new class04834(0.0F)), class04838.N(0.0F, 24.0F, 0.0F));
      return class04806.N(class04792, 64, 64);
   }

   public void method_2819(class02787 var1) {
      super.method_2819(var1);
      if (var1.N) {
         this.Z.E = true;
         this.U.U = false;
         this.z.U = false;
         this.m.U = false;
         this.E.U = true;
      } else {
         this.Z.E = false;
         this.U.U = true;
         this.z.U = true;
         this.m.U = true;
         this.E.U = false;
         this.W.i = class04995.N(var1.h, -22.5F, 25.0F) * (float) (Math.PI / 180.0);
         this.W.R = class04995.N(var1.D, -32.5F, 32.5F) * (float) (Math.PI / 180.0);
      }

      this.P.N(var1.NN, var1.Ny, 16.5F, 2.5F);
      this.s.N(var1.y, var1.P);
      this.T.N(var1.L, var1.P);
      this.b.N(var1.u, var1.P);
   }
}
