package minecraft;

public class class02434 extends class06078<class02789> {
   public class02434(class01686 var1) {
      super(var1, class06851::R);
   }

   public void method_2819(class02789 var1) {
      super.method_2819(var1);
      if (var1.u > 0.0F) {
         float f = -class04995.m(var1.u * 3.0F) * var1.u;
         this.field_54014.M += f * (float) (Math.PI / 180.0);
      }
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N(
         "back", class04822.L().N(0, 0).N(0.0F, -2.5F, -2.5F, 0.0F, 5.0F, 5.0F), class04838.N(-11.0F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F, 0.0F).N(0.8F)
      );
      class04822 class04822 = class04822.L().N(0, 0).N(-12.0F, -2.0F, 0.0F, 16.0F, 4.0F, 0.0F, class04834.N, 1.0F, 0.8F);
      class04839.N("cross_1", class04822, class04838.y((float) (Math.PI / 4), 0.0F, 0.0F));
      class04839.N("cross_2", class04822, class04838.y((float) (Math.PI * 3.0 / 4.0), 0.0F, 0.0F));
      return class04806.N(class04792.N_50(var0x -> var0x.y(0.9F)), 32, 32);
   }
}
