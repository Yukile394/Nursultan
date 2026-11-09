package minecraft;

public class class04386 extends class06078<class08476> {
   private static final String N = "upper_body";
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;

   public class04386(class01686 var1) {
      super(var1);
      this.L = var1.y("head");
      this.u = var1.y("left_arm");
      this.i = var1.y("right_arm");
      this.y = var1.y("upper_body");
   }

   public class01686 y() {
      return this.L;
   }

   public void method_2819(class08476 var1) {
      super.method_2819(var1);
      this.L.R = var1.D * (float) (Math.PI / 180.0);
      this.L.i = var1.h * (float) (Math.PI / 180.0);
      this.y.R = var1.D * (float) (Math.PI / 180.0) * 0.25F;
      float f = class04995.m(this.y.R);
      float f1 = class04995.P(this.y.R);
      this.u.R = this.y.R;
      this.i.R = this.y.R + (float) Math.PI;
      this.u.y = f1 * 5.0F;
      this.u.u = -f * 5.0F;
      this.i.y = -f1 * 5.0F;
      this.i.u = f * 5.0F;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      float f = 4.0F;
      class04834 class04834 = new class04834(-0.5F);
      class04839.N("head", class04822.L().N(0, 0).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, class04834), class04838.N(0.0F, 4.0F, 0.0F));
      class04822 class04822 = class04822.L().N(32, 0).N(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, class04834);
      class04839.N("left_arm", class04822, class04838.N(5.0F, 6.0F, 1.0F, 0.0F, 0.0F, 1.0F));
      class04839.N("right_arm", class04822, class04838.N(-5.0F, 6.0F, -1.0F, 0.0F, (float) Math.PI, -1.0F));
      class04839.N("upper_body", class04822.L().N(0, 16).N(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, class04834), class04838.N(0.0F, 13.0F, 0.0F));
      class04839.N("lower_body", class04822.L().N(0, 36).N(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, class04834), class04838.N(0.0F, 24.0F, 0.0F));
      return class04806.N(class04792, 64, 64);
   }
}
