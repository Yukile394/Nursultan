package minecraft;

import java.util.Objects;

public class class02959 {
   protected final class03063 N;
   protected final class07299 y;
   protected int L;
   protected int u;
   protected int i;
   private int M;
   private class01296 B;
   public class03345[] R;

   private boolean L(int var1, int var2, int var3) {
      if (var2 >= this.y.method_32891() && var2 <= this.y.method_31597()) {
         return var1 < this.B.N() - this.M || var1 > this.B.N() + this.M ? false : var3 >= this.B.L() - this.M && var3 <= this.B.L() + this.M;
      } else {
         return false;
      }
   }

   public class05474 L() {
      return this.y;
   }

   public class02959(class03365 var1, class07299 var2, int var3, class03063 var4) {
      super();
      this.N = var4;
      this.y = var2;
      this.N(var3);
      this.N(var1);
      this.B = class01296.N(this.M + 1, 0, this.M + 1);
   }

   public class01296 u() {
      return this.B;
   }

   private class03345 y(int var1, int var2, int var3) {
      if (!this.L(var1, var2, var3)) {
         return null;
      } else {
         int ix = var2 - this.y.method_32891();
         int j = Math.floorMod(var1, this.u);
         int k = Math.floorMod(var3, this.i);
         return this.R[this.N(j, ix, k)];
      }
   }

   public int y() {
      return this.M;
   }

   public void N(int var1, int var2, int var3, boolean var4) {
      class03345 class03345 = this.y(var1, var2, var3);
      if (class03345 != null) {
         class03345.y(var4);
      }
   }

   public class03345 N(class07209 var1) {
      return this.N(class01296.L(var1));
   }

   public class03345 N(long var1) {
      int ix = class01296.y(var1);
      int j = class01296.L(var1);
      int k = class01296.u(var1);
      return this.y(ix, j, k);
   }

   public void N(class01296 var1) {
      for (int ix = 0; ix < this.u; ix++) {
         int j = var1.N() - this.M;
         int k = j + Math.floorMod(ix - j, this.u);

         for (int l = 0; l < this.i; l++) {
            int i1 = var1.L() - this.M;
            int j1 = i1 + Math.floorMod(l - i1, this.i);

            for (int k1 = 0; k1 < this.L; k1++) {
               int l1 = this.y.method_32891() + k1;
               class03345 class03345 = this.R[this.N(ix, k1, l)];
               if (class03345.M() != class01296.y(k, l1, j1)) {
                  class03345.L(class01296.y(k, l1, j1));
               }
            }
         }
      }

      this.B = var1;
      this.N.n().N();
   }

   protected void N(int var1) {
      int ix = var1 * 2 + 1;
      this.u = ix;
      this.L = this.y.method_32890();
      this.i = ix;
      this.M = var1;
   }

   public void N() {
      class03345[] aclass03345 = this.R;
      int ix = aclass03345.length;

      for (int j = 0; j < ix; j++) {
         aclass03345[j].i();
      }
   }

   protected void N(class03365 var1) {
      if (!class06202.Nq().E_()) {
         throw new IllegalStateException("createSections called from wrong thread: " + Thread.currentThread().getName());
      } else {
         int ix = this.u * this.L * this.i;
         this.R = new class03345[ix];

         for (int j = 0; j < this.u; j++) {
            for (int k = 0; k < this.L; k++) {
               for (int l = 0; l < this.i; l++) {
                  int i1 = this.N(j, k, l);
                  class03345[] aclass03345 = this.R;
                  Objects.requireNonNull(var1);
                  aclass03345[i1] = new class03345(var1, i1, class01296.y(j, k + this.y.method_32891(), l));
               }
            }
         }
      }
   }

   private int N(int var1, int var2, int var3) {
      return (var3 * this.L + var2) * this.u + var1;
   }
}
