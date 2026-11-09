package minecraft;

public class class04532<T extends class08476> extends class06078<T> {
   protected final class01686 y;
   protected final class01686 L;
   protected final class01686 u;
   protected final class01686 i;
   protected final class01686 R;
   protected final class01686 M;

   public class04532(class01686 var1) {
      super(var1);
      this.y = var1.y("head");
      this.L = var1.y("body");
      this.u = var1.y("right_hind_leg");
      this.i = var1.y("left_hind_leg");
      this.R = var1.y("right_front_leg");
      this.M = var1.y("left_front_leg");
   }

   public void method_2819(T var1) {
      super.method_2819((T)var1);
      this.y.i = var1.h * (float) (Math.PI / 180.0);
      this.y.R = var1.D * (float) (Math.PI / 180.0);
      float f = var1.NN;
      float f1 = var1.Ny;
      this.u.i = class04995.P(f * 0.6662F) * 1.4F * f1;
      this.i.i = class04995.P(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
      this.R.i = class04995.P(f * 0.6662F + (float) Math.PI) * 1.4F * f1;
      this.M.i = class04995.P(f * 0.6662F) * 1.4F * f1;
   }

   static void N(class04839 var0, boolean var1, boolean var2, int var3, class04834 var4) {
      class04822 class04822x = class04822.L().N(var2).N(0, 16).N(-2.0F, 0.0F, -2.0F, 4.0F, (float)var3, 4.0F, var4);
      class04822 class04822x = class04822.L().N(var1).N(0, 16).N(-2.0F, 0.0F, -2.0F, 4.0F, (float)var3, 4.0F, var4);
      var0.N("right_hind_leg", class04822x, class04838.N(-3.0F, 24 - var3, 7.0F));
      var0.N("left_hind_leg", class04822x, class04838.N(3.0F, 24 - var3, 7.0F));
      var0.N("right_front_leg", class04822x, class04838.N(-3.0F, 24 - var3, -5.0F));
      var0.N("left_front_leg", class04822x, class04838.N(3.0F, 24 - var3, -5.0F));
   }

   public static class04792 N(int var0, boolean var1, boolean var2, class04834 var3) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("head", class04822.L().N(0, 0).N(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, var3), class04838.N(0.0F, 18 - var0, -6.0F));
      class04839.N(
         "body",
         class04822.L().N(28, 8).N(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, var3),
         class04838.N(0.0F, 17 - var0, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      N(class04839, var1, var2, var0, var3);
      return class04792;
   }
}
