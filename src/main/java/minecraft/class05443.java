package minecraft;

public class class05443 extends class06078<class08789> {
   private final class01686 N;
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class00094 B;
   private final class00094 Z;

   public class05443(class01686 var1) {
      super(var1, class06851::R);
      this.y = var1.y("body");
      this.N = var1.y("head");
      this.L = this.y.y("right_wing");
      this.i = this.L.y("right_wing_tip");
      this.u = this.y.y("left_wing");
      this.R = this.u.y("left_wing_tip");
      this.M = this.y.y("feet");
      this.B = class03123.y.N(var1);
      this.Z = class03123.N.N(var1);
   }

   private void N(float var1) {
      this.N.R = var1 * (float) (Math.PI / 180.0);
   }

   public void method_2819(class08789 var1) {
      super.method_2819(var1);
      if (var1.N) {
         this.N(var1.D);
      }

      this.B.N(var1.y, var1.P);
      this.Z.N(var1.L, var1.P);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839xx = class04792.N();
      class04839 class04839x = class04839xx.N("body", class04822.L().N(0, 0).N(-1.5F, 0.0F, -1.0F, 3.0F, 5.0F, 2.0F), class04838.N(0.0F, 17.0F, 0.0F));
      class04839 class04839xx = class04839xx.N("head", class04822.L().N(0, 7).N(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F), class04838.N(0.0F, 17.0F, 0.0F));
      class04839xx.N("right_ear", class04822.L().N(1, 15).N(-2.5F, -4.0F, 0.0F, 3.0F, 5.0F, 0.0F), class04838.N(-1.5F, -2.0F, 0.0F));
      class04839xx.N("left_ear", class04822.L().N(8, 15).N(-0.1F, -3.0F, 0.0F, 3.0F, 5.0F, 0.0F), class04838.N(1.1F, -3.0F, 0.0F));
      class04839x.N("right_wing", class04822.L().N(12, 0).N(-2.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), class04838.N(-1.5F, 0.0F, 0.0F))
         .N("right_wing_tip", class04822.L().N(16, 0).N(-6.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), class04838.N(-2.0F, 0.0F, 0.0F));
      class04839x.N("left_wing", class04822.L().N(12, 7).N(0.0F, -2.0F, 0.0F, 2.0F, 7.0F, 0.0F), class04838.N(1.5F, 0.0F, 0.0F))
         .N("left_wing_tip", class04822.L().N(16, 8).N(0.0F, -2.0F, 0.0F, 6.0F, 8.0F, 0.0F), class04838.N(2.0F, 0.0F, 0.0F));
      class04839x.N("feet", class04822.L().N(16, 16).N(-1.5F, 0.0F, 0.0F, 3.0F, 2.0F, 0.0F), class04838.N(0.0F, 5.0F, 0.0F));
      return class04806.N(class04792, 32, 32);
   }
}
