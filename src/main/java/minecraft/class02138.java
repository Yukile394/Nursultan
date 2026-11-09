package minecraft;

import java.util.Arrays;

public class class02138 extends class06078<class08800> {
   private static final int N = 7;
   private final class01686[] y = new class01686[7];
   private final class01686[] L = new class01686[3];
   private static final int[][] u = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] i = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public class02138(class01686 var1) {
      super(var1);
      Arrays.setAll(this.y, var1x -> var1.y(y(var1x)));
      Arrays.setAll(this.L, var1x -> var1.y(N(var1x)));
   }

   private static String y(int var0) {
      return "segment" + var0;
   }

   public void method_2819(class08800 var1) {
      super.method_2819(var1);

      for (int ix = 0; ix < this.y.length; ix++) {
         this.y[ix].R = class04995.P(var1.P * 0.9F + ix * 0.15F * (float) Math.PI) * (float) Math.PI * 0.05F * (1 + Math.abs(ix - 2));
         this.y[ix].y = class04995.m(var1.P * 0.9F + ix * 0.15F * (float) Math.PI) * (float) Math.PI * 0.2F * Math.abs(ix - 2);
      }

      this.L[0].R = this.y[2].R;
      this.L[1].R = this.y[4].R;
      this.L[1].y = this.y[4].y;
      this.L[2].R = this.y[1].R;
      this.L[2].y = this.y[1].y;
   }

   private static String N(int var0) {
      return "layer" + var0;
   }

   public static class04806 N() {
      class04792 class04792 = new class04792();
      class04839 class04839 = class04792.N();
      float[] afloat = new float[7];
      float f = -3.5F;

      for (int ix = 0; ix < 7; ix++) {
         class04839.N(
            y(ix),
            class04822.L().N(i[ix][0], i[ix][1]).N(u[ix][0] * -0.5F, 0.0F, u[ix][2] * -0.5F, u[ix][0], u[ix][1], u[ix][2]),
            class04838.N(0.0F, 24 - u[ix][1], f)
         );
         afloat[ix] = f;
         if (ix < 6) {
            f += (u[ix][2] + u[ix + 1][2]) * 0.5F;
         }
      }

      class04839.N(N(0), class04822.L().N(20, 0).N(-5.0F, 0.0F, u[2][2] * -0.5F, 10.0F, 8.0F, u[2][2]), class04838.N(0.0F, 16.0F, afloat[2]));
      class04839.N(N(1), class04822.L().N(20, 11).N(-3.0F, 0.0F, u[4][2] * -0.5F, 6.0F, 4.0F, u[4][2]), class04838.N(0.0F, 20.0F, afloat[4]));
      class04839.N(N(2), class04822.L().N(20, 18).N(-3.0F, 0.0F, u[4][2] * -0.5F, 6.0F, 5.0F, u[1][2]), class04838.N(0.0F, 19.0F, afloat[1]));
      return class04806.N(class04792, 64, 32);
   }
}
