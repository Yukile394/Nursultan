package minecraft;

public class class04816 extends class06078<class08786> {
   private final class01686 N;
   private final class01686 y;
   private final class01686 L;
   private final class01686 u;
   private final class01686 i;
   private static final int R = 6;

   public class04816(class01686 var1) {
      super(var1);
      this.N = var1.y("head");
      this.L = var1.y("right_hind_leg");
      this.y = var1.y("left_hind_leg");
      this.i = var1.y("right_front_leg");
      this.u = var1.y("left_front_leg");
   }

   public void method_2819(class08786 var1) {
      super.method_2819(var1);
      this.N.R = var1.D * (float) (Math.PI / 180.0);
      this.N.i = var1.h * (float) (Math.PI / 180.0);
      float f = var1.Ny;
      float f1 = var1.NN;
      this.y.i = class04995.P(f1 * 0.6662F) * 1.4F * f;
      this.L.i = class04995.P(f1 * 0.6662F + (float) Math.PI) * 1.4F * f;
      this.u.i = class04995.P(f1 * 0.6662F + (float) Math.PI) * 1.4F * f;
      this.i.i = class04995.P(f1 * 0.6662F) * 1.4F * f;
   }

   public static class04806 N(class04834 var0) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("head", class04822.L().N(0, 0).N(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var0), class04838.N(0.0F, 6.0F, 0.0F));
      class04839.N("body", class04822.L().N(16, 16).N(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var0), class04838.N(0.0F, 6.0F, 0.0F));
      class04822 class04822 = class04822.L().N(0, 16).N(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var0);
      class04839.N("right_hind_leg", class04822, class04838.N(-2.0F, 18.0F, 4.0F));
      class04839.N("left_hind_leg", class04822, class04838.N(2.0F, 18.0F, 4.0F));
      class04839.N("right_front_leg", class04822, class04838.N(-2.0F, 18.0F, -4.0F));
      class04839.N("left_front_leg", class04822, class04838.N(2.0F, 18.0F, -4.0F));
      return class04806.N(class04792, 64, 32);
   }
}
