package minecraft;

public class class08232 extends class06078<class08468> {
   private static final int N = 2;
   private final class01686[] y = new class01686[2];

   public class08232(class01686 var1) {
      super(var1);

      for (int i = 0; i < 2; i++) {
         this.y[i] = var1.y(N(i));
      }
   }

   public void method_2819(class08468 var1) {
      super.method_2819(var1);

      for (int i = 0; i < this.y.length; i++) {
         float f = var1.P * -(45 + (i + 1) * 5);
         this.y[i].R = class04995.R(f) * (float) (Math.PI / 180.0);
      }
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();

      for (int i = 0; i < 2; i++) {
         float f = -3.2F + 9.6F * (i + 1);
         float f1 = 0.75F * (i + 1);
         class04839.N(N(i), class04822.L().N(0, 0).N(-8.0F, -16.0F + f, -8.0F, 16.0F, 32.0F, 16.0F), class04838.N.N(f1));
      }

      return class04806.N(class04792, 64, 64);
   }

   private static String N(int var0) {
      return "box" + var0;
   }
}
