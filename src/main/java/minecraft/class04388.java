package minecraft;

import java.util.Arrays;

public class class04388 extends class06078<class08255> {
   public static final class02415 N = class02415.N(0.5F);
   private final class01686[] y = new class01686[8];

   public class04388(class01686 var1) {
      super(var1);
      Arrays.setAll(this.y, var1x -> var1.y(N(var1x)));
   }

   public void method_2819(class08255 var1) {
      super.method_2819(var1);
      class01686[] aclass01686 = this.y;
      int i = aclass01686.length;

      for (int j = 0; j < i; j++) {
         aclass01686[j].i = var1.N;
      }
   }

   private static String N(int var0) {
      return "tentacle" + var0;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04834 class04834 = new class04834(0.02F);
      byte b0 = -16;
      class04839.N("body", class04822.L().N(0, 0).N(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F, class04834), class04838.N(0.0F, 8.0F, 0.0F));
      byte b1 = 8;
      class04822 class04822 = class04822.L().N(48, 0).N(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);

      for (int i = 0; i < 8; i++) {
         double d0 = i * Math.PI * 2.0 / 8.0;
         float f = (float)Math.cos(d0) * 5.0F;
         float f1 = 15.0F;
         float f2 = (float)Math.sin(d0) * 5.0F;
         d0 = i * Math.PI * -2.0 / 8.0 + (Math.PI / 2);
         float f3 = (float)d0;
         class04839.N(N(i), class04822, class04838.N(f, 15.0F, f2, 0.0F, f3, 0.0F));
      }

      return class04806.N(class04792, 64, 32);
   }
}
