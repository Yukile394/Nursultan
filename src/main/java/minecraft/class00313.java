package minecraft;

import java.util.Set;

public class class00313 extends class06078<class00292> {
   private final class01686 N;
   private final class00094 y;
   private final class00094 L;
   private final class00094 u;
   private final class00094 i;

   private static class04792 L() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N().N("root", class04822.L(), class04838.N(0.0F, 24.0F, 0.0F));
      class04839 class04839x = class04839x.N("upper_body", class04822.L(), class04838.N(-1.0F, -19.0F, 0.0F));
      class04839x.N(
         "head",
         class04822.L()
            .N(0, 0)
            .N(-3.0F, -10.0F, -3.0F, 6.0F, 10.0F, 6.0F)
            .N(28, 31)
            .N(-3.0F, -13.0F, -3.0F, 6.0F, 3.0F, 6.0F)
            .N(12, 40)
            .N(3.0F, -13.0F, 0.0F, 9.0F, 14.0F, 0.0F)
            .N(34, 12)
            .N(-12.0F, -14.0F, 0.0F, 9.0F, 14.0F, 0.0F),
         class04838.N(-3.0F, -11.0F, 0.0F)
      );
      class04839x.N(
         "body",
         class04822.L().N(0, 16).N(0.0F, -3.0F, -3.0F, 6.0F, 13.0F, 5.0F).N(24, 0).N(-6.0F, -4.0F, -3.0F, 6.0F, 7.0F, 5.0F),
         class04838.N(0.0F, -7.0F, 1.0F)
      );
      class04839x.N(
         "right_arm",
         class04822.L().N(22, 13).N(-2.0F, -1.5F, -1.5F, 3.0F, 21.0F, 3.0F).N(46, 0).N(-2.0F, 19.5F, -1.5F, 3.0F, 4.0F, 3.0F),
         class04838.N(-7.0F, -9.5F, 1.5F)
      );
      class04839x.N(
         "left_arm",
         class04822.L()
            .N(30, 40)
            .N(0.0F, -1.0F, -1.5F, 3.0F, 16.0F, 3.0F)
            .N(52, 12)
            .N(0.0F, -5.0F, -1.5F, 3.0F, 4.0F, 3.0F)
            .N(52, 19)
            .N(0.0F, 15.0F, -1.5F, 3.0F, 4.0F, 3.0F),
         class04838.N(6.0F, -9.0F, 0.5F)
      );
      class04839x.N(
         "left_leg",
         class04822.L().N(42, 40).N(-1.5F, 0.0F, -1.5F, 3.0F, 16.0F, 3.0F).N(45, 55).N(-1.5F, 15.7F, -4.5F, 5.0F, 0.0F, 9.0F),
         class04838.N(1.5F, -16.0F, 0.5F)
      );
      class04839x.N(
         "right_leg",
         class04822.L()
            .N(0, 34)
            .N(-3.0F, -1.5F, -1.5F, 3.0F, 19.0F, 3.0F)
            .N(45, 46)
            .N(-5.0F, 17.2F, -4.5F, 5.0F, 0.0F, 9.0F)
            .N(12, 34)
            .N(-3.0F, -4.5F, -1.5F, 3.0F, 3.0F, 3.0F),
         class04838.N(-1.0F, -17.5F, 0.5F)
      );
      return class04792;
   }

   public class00313(class01686 var1) {
      super(var1);
      class01686 class01686x = var1.y("root");
      class01686 class01686x = class01686x.y("upper_body");
      this.N = class01686x.y("head");
      this.y = class00298.N.N(class01686x);
      this.L = class00298.y.N(class01686x);
      this.u = class00298.L.N(class01686x);
      this.i = class00298.u.N(class01686x);
   }

   public static class04806 y() {
      class04792 class04792 = L();
      class04792.N().y(Set.of("head"));
      return class04806.N(class04792, 64, 64);
   }

   public static class04806 N() {
      return class04806.N(L(), 64, 64);
   }

   public void method_2819(class00292 var1) {
      super.method_2819(var1);
      this.N.i = var1.h * (float) (Math.PI / 180.0);
      this.N.R = var1.D * (float) (Math.PI / 180.0);
      if (var1.i) {
         this.y.N(var1.NN, var1.Ny, 1.0F, 1.0F);
      }

      this.L.N(var1.y, var1.P);
      this.u.N(var1.N, var1.P);
      this.i.N(var1.L, var1.P);
   }
}
