package minecraft;

import Nursultan.class10285;

class class01836 implements class01830, class03894 {
   private final class03877 M;
   final double[] N;
   final int y;

   class01836(class01837 var1, class03877 var2, boolean var3) {
      super();
      this.L = var1;
      this.M = var2;
      this.y = var1.B + 1;
      this.N = new double[this.y * this.y];
      if (var3) {
         for (int i = 0; i <= var1.B; i++) {
            int j = class01146.L(var1.u + i);

            for (int k = 0; k <= var1.B; k++) {
               int l = class01146.L(var1.i + k);
               this.N[i + k * this.y] = var2.N(new class10285(j, 0, l));
            }
         }
      }
   }

   @Override
   public class03909 i() {
      return class03909.field_36563;
   }

   @Override
   public class03877 u() {
      return this.M;
   }

   @Override
   public double N(class03875 var1) {
      int i = class01146.N(var1.y());
      int j = class01146.N(var1.u());
      int k = i - this.L.u;
      int l = j - this.L.i;
      return k >= 0 && l >= 0 && k < this.y && l < this.y ? this.N[k + l * this.y] : this.M.N(var1);
   }

   @Override
   public void N(double[] var1, class03912 var2) {
      var2.N(var1, this);
   }
}
