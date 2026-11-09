package minecraft;

public class class06379 extends class06078<class08462> {
   private final class01686[] N = new class01686[9];

   public class06379(class01686 var1) {
      super(var1);

      for (int i = 0; i < this.N.length; i++) {
         this.N[i] = var1.y(class03088.N(i));
      }
   }

   public static void N(class08800 var0, class01686[] var1) {
      for (int i = 0; i < var1.length; i++) {
         var1[i].i = 0.2F * class04995.m(var0.P * 0.3F + i) + 0.4F;
      }
   }

   public void method_2819(class08462 var1) {
      super.method_2819(var1);
      N(var1, this.N);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("body", class04822.L().N(0, 0).N(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), class04838.N(0.0F, 17.6F, 0.0F));
      class06069 class06069 = class06069.y(1660L);

      for (int i = 0; i < 9; i++) {
         float f = ((i % 3 - i / 3 % 2 * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float f1 = (i / 3 / 2.0F * 2.0F - 1.0F) * 5.0F;
         int j = class06069.y(7) + 8;
         class04839.N(class03088.N(i), class04822.L().N(0, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, j, 2.0F), class04838.N(f, 24.6F, f1));
      }

      return class04806.N(class04792, 64, 32).N(class02415.N(4.5F));
   }
}
