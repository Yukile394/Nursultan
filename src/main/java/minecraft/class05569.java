package minecraft;

import java.util.Arrays;

public class class05569 extends class06078<class08473> {
   private static final int N = 8;
   private final class01686[] y = new class01686[8];

   public class05569(class01686 var1) {
      super(var1);
      Arrays.setAll(this.y, var1x -> var1.y(N(var1x)));
   }

   public void method_2819(class08473 var1) {
      super.method_2819(var1);
      float f = Math.max(0.0F, var1.N);

      for (int i = 0; i < this.y.length; i++) {
         this.y[i].L = -(4 - i) * f * 1.7F;
      }
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();

      for (int i = 0; i < 8; i++) {
         byte b0 = 0;
         int j = 0;
         if (i > 0 && i < 4) {
            j += 9 * i;
         } else if (i > 3) {
            b0 = 32;
            j += 9 * i - 36;
         }

         class04839.N(N(i), class04822.L().N(b0, j).N(-4.0F, 16 + i, -4.0F, 8.0F, 1.0F, 8.0F), class04838.N);
      }

      class04839.N("inside_cube", class04822.L().N(24, 40).N(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F), class04838.N);
      return class04806.N(class04792, 64, 64);
   }

   private static String N(int var0) {
      return "cube" + var0;
   }
}
