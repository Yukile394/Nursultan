package minecraft;

public class class06373 extends class06078<class08486> {
   private static final String N = "base";
   private static final String y = "upper_jaw";
   private static final String L = "lower_jaw";
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;

   public class06373(class01686 var1) {
      super(var1);
      this.u = var1.y("base");
      this.i = this.u.y("upper_jaw");
      this.R = this.u.y("lower_jaw");
   }

   public void method_2819(class08486 var1) {
      super.method_2819(var1);
      float f = var1.y;
      float f1 = Math.min(f * 2.0F, 1.0F);
      f1 = 1.0F - f1 * f1 * f1;
      this.i.M = (float) Math.PI - f1 * 0.35F * (float) Math.PI;
      this.R.M = (float) Math.PI + f1 * 0.35F * (float) Math.PI;
      this.u.L = this.u.L - (f + class04995.m(f * 2.7F)) * 7.2F;
      float f2 = 1.0F;
      if (f > 0.9F) {
         f2 *= (1.0F - f) / 0.1F;
      }

      this.field_54014.L = 24.0F - 20.0F * f2;
      this.field_54014.B = f2;
      this.field_54014.Z = f2;
      this.field_54014.z = f2;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N().N("base", class04822.L().N(0, 0).N(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F), class04838.N(-5.0F, 24.0F, -5.0F));
      class04822 class04822 = class04822.L().N(40, 0).N(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
      class04839.N("upper_jaw", class04822, class04838.N(6.5F, 0.0F, 1.0F, 0.0F, 0.0F, 2.042035F));
      class04839.N("lower_jaw", class04822, class04838.N(3.5F, 0.0F, 9.0F, 0.0F, (float) Math.PI, 4.2411504F));
      return class04806.N(class04792, 64, 32);
   }
}
