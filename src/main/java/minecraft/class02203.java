package minecraft;

import java.util.Set;

public class class02203 extends class04532<class08463> {
   private static final float N = 2.25F;
   private static final class02415 B = new class02441(true, 16.0F, 4.0F, 2.25F, 2.0F, 24.0F, Set.of("head"));

   public class02203(class01686 var1) {
      super(var1);
   }

   public static class04806 N(boolean var0) {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N(
         "head",
         class04822.L()
            .N(0, 0)
            .N(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F)
            .N(0, 44)
            .N("mouth", -2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F)
            .N(26, 0)
            .N("right_ear", -4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F)
            .N(26, 0)
            .N()
            .N("left_ear", 2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F),
         class04838.N(0.0F, 10.0F, -16.0F)
      );
      class04839.N(
         "body",
         class04822.L().N(0, 19).N(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F).N(39, 0).N(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F),
         class04838.N(-2.0F, 9.0F, 12.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      byte b0 = 10;
      class04822 class04822x = class04822.L().N(50, 22).N(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F);
      class04839.N("right_hind_leg", class04822x, class04838.N(-4.5F, 14.0F, 6.0F));
      class04839.N("left_hind_leg", class04822x, class04838.N(4.5F, 14.0F, 6.0F));
      class04822 class04822x = class04822.L().N(50, 40).N(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F);
      class04839.N("right_front_leg", class04822x, class04838.N(-3.5F, 14.0F, -8.0F));
      class04839.N("left_front_leg", class04822x, class04838.N(3.5F, 14.0F, -8.0F));
      return class04806.N(class04792, 128, 64).N(var0 ? B : class02415.N).N(class02415.N(1.2F));
   }

   public void method_2819(class08463 var1) {
      super.method_2819(var1);
      float f = var1.N * var1.N;
      float f1 = var1.Nu;
      float f2 = var1.NB ? 0.44444445F : 1.0F;
      this.L.i -= f * (float) Math.PI * 0.35F;
      this.L.L += f * f1 * 2.0F;
      this.R.L -= f * f1 * 20.0F;
      this.R.u += f * f1 * 4.0F;
      this.R.i -= f * (float) Math.PI * 0.45F;
      this.M.L = this.R.L;
      this.M.u = this.R.u;
      this.M.i -= f * (float) Math.PI * 0.45F;
      this.y.L -= f * f2 * 24.0F;
      this.y.u += f * f2 * 13.0F;
      this.y.i += f * (float) Math.PI * 0.15F;
   }
}
