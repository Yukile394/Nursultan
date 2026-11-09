package minecraft;

import java.util.Arrays;

public class class01141 extends class06078<class08476> {
   private final class01686[] N;
   private final class01686 y;

   public class01141(class01686 var1) {
      super(var1);
      this.y = var1.y("head");
      this.N = new class01686[12];
      Arrays.setAll(this.N, var1x -> var1.y(N(var1x)));
   }

   public void method_2819(class08476 var1) {
      super.method_2819(var1);
      float f = var1.P * (float) Math.PI * -0.1F;

      for (int i = 0; i < 4; i++) {
         this.N[i].L = -2.0F + class04995.P((i * 2 + var1.P) * 0.25F);
         this.N[i].y = class04995.P(f) * 9.0F;
         this.N[i].u = class04995.m(f) * 9.0F;
         f++;
      }

      f = (float) (Math.PI / 4) + var1.P * (float) Math.PI * 0.03F;

      for (int j = 4; j < 8; j++) {
         this.N[j].L = 2.0F + class04995.P((j * 2 + var1.P) * 0.25F);
         this.N[j].y = class04995.P(f) * 7.0F;
         this.N[j].u = class04995.m(f) * 7.0F;
         f++;
      }

      f = 0.47123894F + var1.P * (float) Math.PI * -0.05F;

      for (int k = 8; k < 12; k++) {
         this.N[k].L = 11.0F + class04995.P((k * 1.5F + var1.P) * 0.5F);
         this.N[k].y = class04995.P(f) * 5.0F;
         this.N[k].u = class04995.m(f) * 5.0F;
         f++;
      }

      this.y.R = var1.D * (float) (Math.PI / 180.0);
      this.y.i = var1.h * (float) (Math.PI / 180.0);
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      class04839.N("head", class04822.L().N(0, 0).N(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), class04838.N);
      float f = 0.0F;
      class04822 class04822 = class04822.L().N(0, 16).N(0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F);

      for (int i = 0; i < 4; i++) {
         float f1 = class04995.P(f) * 9.0F;
         float f2 = -2.0F + class04995.P(i * 2 * 0.25F);
         float f3 = class04995.m(f) * 9.0F;
         class04839.N(N(i), class04822, class04838.N(f1, f2, f3));
         f++;
      }

      f = (float) (Math.PI / 4);

      for (int j = 4; j < 8; j++) {
         float f4 = class04995.P(f) * 7.0F;
         float f6 = 2.0F + class04995.P(j * 2 * 0.25F);
         float f8 = class04995.m(f) * 7.0F;
         class04839.N(N(j), class04822, class04838.N(f4, f6, f8));
         f++;
      }

      f = 0.47123894F;

      for (int k = 8; k < 12; k++) {
         float f5 = class04995.P(f) * 5.0F;
         float f7 = 11.0F + class04995.P(k * 1.5F * 0.5F);
         float f9 = class04995.m(f) * 5.0F;
         class04839.N(N(k), class04822, class04838.N(f5, f7, f9));
         f++;
      }

      return class04806.N(class04792, 64, 32);
   }

   private static String N(int var0) {
      return "part" + var0;
   }
}
