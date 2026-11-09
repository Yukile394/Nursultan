package minecraft;

public class class04539 extends class04532<class08442> {
   public class04539(class01686 var1) {
      super(var1);
   }

   public void method_2819(class08442 var1) {
      super.method_2819(var1);
      this.y.L = this.y.L + var1.N * 9.0F * var1.Nu;
      this.y.i = var1.y;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("head", class04822.L().N(0, 0).N(-3.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, new class04834(0.6F)), class04838.N(0.0F, 6.0F, -8.0F));
      class04839.N(
         "body",
         class04822.L().N(28, 8).N(-4.0F, -10.0F, -7.0F, 8.0F, 16.0F, 6.0F, new class04834(1.75F)),
         class04838.N(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      class04822 class04822 = class04822.L().N(0, 16).N(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new class04834(0.5F));
      class04839.N("right_hind_leg", class04822, class04838.N(-3.0F, 12.0F, 7.0F));
      class04839.N("left_hind_leg", class04822, class04838.N(3.0F, 12.0F, 7.0F));
      class04839.N("right_front_leg", class04822, class04838.N(-3.0F, 12.0F, -5.0F));
      class04839.N("left_front_leg", class04822, class04838.N(3.0F, 12.0F, -5.0F));
      return class04806.N(class04792, 64, 32);
   }
}
