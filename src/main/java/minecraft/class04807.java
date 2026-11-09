package minecraft;

public class class04807 extends class06078<class08800> {
   private static final int N = 4;
   private static final int[][] y = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] L = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private final class01686[] u = new class01686[4];

   public class04807(class01686 var1) {
      super(var1);

      for (int i = 0; i < 4; i++) {
         this.u[i] = var1.y(N(i));
      }
   }

   public void method_2819(class08800 var1) {
      super.method_2819(var1);

      for (int i = 0; i < this.u.length; i++) {
         this.u[i].R = class04995.P(var1.P * 0.9F + i * 0.15F * (float) Math.PI) * (float) Math.PI * 0.01F * (1 + Math.abs(i - 2));
         this.u[i].y = class04995.m(var1.P * 0.9F + i * 0.15F * (float) Math.PI) * (float) Math.PI * 0.1F * Math.abs(i - 2);
      }
   }

   private static String N(int var0) {
      return "segment" + var0;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      float f = -3.5F;

      for (int i = 0; i < 4; i++) {
         class04839.N(
            N(i), class04822.L().N(L[i][0], L[i][1]).N(y[i][0] * -0.5F, 0.0F, y[i][2] * -0.5F, y[i][0], y[i][1], y[i][2]), class04838.N(0.0F, 24 - y[i][1], f)
         );
         if (i < 3) {
            f += (y[i][2] + y[i + 1][2]) * 0.5F;
         }
      }

      return class04806.N(class04792, 64, 32);
   }
}
