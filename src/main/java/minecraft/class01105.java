package minecraft;

import java.util.Set;

public class class01105 extends class06078<class08794> {
   public static final String N = "red_thing";
   public static final float y = 16.0F;
   public static final class02415 L = new class02441(false, 5.0F, 2.0F, 2.0F, 1.99F, 24.0F, Set.of("head", "beak", "red_thing"));
   private final class01686 u;
   private final class01686 i;
   private final class01686 R;
   private final class01686 M;
   private final class01686 B;

   protected static class04792 L() {
      class04792 class04792 = new class04792();
      class04839 class04839x = class04792.N();
      class04839 class04839x = class04839x.N("head", class04822.L().N(0, 0).N(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), class04838.N(0.0F, 15.0F, -4.0F));
      class04839x.N("beak", class04822.L().N(14, 0).N(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), class04838.N);
      class04839x.N("red_thing", class04822.L().N(14, 4).N(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), class04838.N);
      class04839x.N("body", class04822.L().N(0, 9).N(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), class04838.N(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      class04822 class04822 = class04822.L().N(26, 0).N(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      class04839x.N("right_leg", class04822, class04838.N(-2.0F, 19.0F, 1.0F));
      class04839x.N("left_leg", class04822, class04838.N(1.0F, 19.0F, 1.0F));
      class04839x.N("right_wing", class04822.L().N(24, 13).N(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), class04838.N(-4.0F, 13.0F, 0.0F));
      class04839x.N("left_wing", class04822.L().N(24, 13).N(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), class04838.N(4.0F, 13.0F, 0.0F));
      return class04792;
   }

   public class01105(class01686 var1) {
      super(var1);
      this.u = var1.y("head");
      this.i = var1.y("right_leg");
      this.R = var1.y("left_leg");
      this.M = var1.y("right_wing");
      this.B = var1.y("left_wing");
   }

   public static class04806 y() {
      return class04806.N(L(), 64, 32);
   }

   public void method_2819(class08794 var1) {
      super.method_2819(var1);
      float f = (class04995.m(var1.N) + 1.0F) * var1.y;
      this.u.i = var1.h * (float) (Math.PI / 180.0);
      this.u.R = var1.D * (float) (Math.PI / 180.0);
      float f1 = var1.Ny;
      float f2 = var1.NN;
      this.i.i = class04995.P(f2 * 0.6662F) * 1.4F * f1;
      this.R.i = class04995.P(f2 * 0.6662F + (float) Math.PI) * 1.4F * f1;
      this.M.M = f;
      this.B.M = -f;
   }
}
