package minecraft;

public class class06074 extends class06078<class08461> {
   private static final String N = "tail_base";
   private static final String y = "tail_tip";
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;

   public class06074(class01686 var1) {
      super(var1);
      class01686 class01686 = var1.y("body");
      this.M = class01686.y("tail_base");
      this.B = this.M.y("tail_tip");
      this.L = class01686.y("left_wing_base");
      this.u = this.L.y("left_wing_tip");
      this.i = class01686.y("right_wing_base");
      this.R = this.i.y("right_wing_tip");
   }

   public void method_2819(class08461 var1) {
      super.method_2819(var1);
      float f = var1.N * 7.448451F * (float) (Math.PI / 180.0);
      float f1 = 16.0F;
      this.L.M = class04995.P(f) * 16.0F * (float) (Math.PI / 180.0);
      this.u.M = class04995.P(f) * 16.0F * (float) (Math.PI / 180.0);
      this.i.M = -this.L.M;
      this.R.M = -this.u.M;
      this.M.i = -(5.0F + class04995.P(f * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.B.i = -(5.0F + class04995.P(f * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N().N("body", class04822.L().N(0, 8).N(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F), class04838.y(-0.1F, 0.0F, 0.0F));
      class04839.N("tail_base", class04822.L().N(3, 20).N(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F), class04838.N(0.0F, -2.0F, 1.0F))
         .N("tail_tip", class04822.L().N(4, 29).N(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F), class04838.N(0.0F, 0.5F, 6.0F));
      class04839.N("left_wing_base", class04822.L().N(23, 12).N(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), class04838.N(2.0F, -2.0F, -8.0F, 0.0F, 0.0F, 0.1F))
         .N("left_wing_tip", class04822.L().N(16, 24).N(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), class04838.N(6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F));
      class04839.N("right_wing_base", class04822.L().N(23, 12).N().N(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F), class04838.N(-3.0F, -2.0F, -8.0F, 0.0F, 0.0F, -0.1F))
         .N("right_wing_tip", class04822.L().N(16, 24).N().N(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F), class04838.N(-6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F));
      class04839.N("head", class04822.L().N(0, 0).N(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F), class04838.N(0.0F, 1.0F, -7.0F, 0.2F, 0.0F, 0.0F));
      return class04806.N(class04792, 64, 64);
   }
}
