package minecraft;

import java.util.Set;

public class class04535 extends class04532<class08442> {
   public static final class02415 N = new class02441(false, 8.0F, 4.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));

   public class04535(class01686 var1) {
      super(var1);
   }

   public static class04806 N() {
      class04792 class04792 = class04532.N(12, false, true, class04834.N);
      class04839 class04839 = class04792.N();
      class04839.N("head", class04822.L().N(0, 0).N(-3.0F, -4.0F, -6.0F, 6.0F, 6.0F, 8.0F), class04838.N(0.0F, 6.0F, -8.0F));
      class04839.N(
         "body", class04822.L().N(28, 8).N(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F), class04838.N(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      return class04806.N(class04792, 64, 32);
   }

   public void method_2819(class08442 var1) {
      super.method_2819(var1);
      this.y.L = this.y.L + var1.N * 9.0F * var1.Nu;
      this.y.i = var1.y;
   }
}
