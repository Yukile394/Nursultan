package minecraft;

import java.util.Set;

public class class01098 extends class04532<class08476> {
   public static final class02415 N = new class02441(false, 8.0F, 6.0F, Set.of("head"));
   private static final int B = 12;

   static class04792 L() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N(
         "head",
         class04822.L()
            .N(0, 0)
            .N(-4.0F, -4.0F, -6.0F, 8.0F, 8.0F, 6.0F)
            .N(1, 33)
            .N(-3.0F, 1.0F, -7.0F, 6.0F, 3.0F, 1.0F)
            .N(22, 0)
            .N("right_horn", -5.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F)
            .N(22, 0)
            .N("left_horn", 4.0F, -5.0F, -5.0F, 1.0F, 3.0F, 1.0F),
         class04838.N(0.0F, 4.0F, -8.0F)
      );
      class04839.N(
         "body",
         class04822.L().N(18, 4).N(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F).N(52, 0).N(-2.0F, 2.0F, -8.0F, 4.0F, 6.0F, 1.0F),
         class04838.N(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      class04822 class04822x = class04822.L().N().N(0, 16).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      class04822 class04822x = class04822.L().N(0, 16).N(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F);
      class04839.N("right_hind_leg", class04822x, class04838.N(-4.0F, 12.0F, 7.0F));
      class04839.N("left_hind_leg", class04822x, class04838.N(4.0F, 12.0F, 7.0F));
      class04839.N("right_front_leg", class04822x, class04838.N(-4.0F, 12.0F, -5.0F));
      class04839.N("left_front_leg", class04822x, class04838.N(4.0F, 12.0F, -5.0F));
      return class04792;
   }

   public class01098(class01686 var1) {
      super(var1);
   }

   public class01686 u() {
      return this.y;
   }

   public static class04806 y() {
      return class04806.N(L(), 64, 64);
   }
}
