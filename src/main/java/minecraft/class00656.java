package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleLists;

public class class00656 implements class00630 {
   private static final DoubleList N = DoubleLists.unmodifiable(DoubleArrayList.wrap(new double[]{0.0}));
   private final double[] y;
   private final int[] L;
   private final int[] u;
   private final int i;

   public class00656(DoubleList var1, DoubleList var2, boolean var3, boolean var4) {
      super();
      double d0 = Double.NaN;
      int ix = var1.size();
      int j = var2.size();
      int k = ix + j;
      this.y = new double[k];
      this.L = new int[k];
      this.u = new int[k];
      boolean flag = !var3;
      boolean flag1 = !var4;
      int l = 0;
      int i1 = 0;
      int j1 = 0;

      while (true) {
         boolean flag2 = i1 >= ix;
         boolean flag3 = j1 >= j;
         if (flag2 && flag3) {
            this.i = Math.max(1, l);
            return;
         }

         boolean flag4 = !flag2 && (flag3 || var1.getDouble(i1) < var2.getDouble(j1) + 1.0E-7);
         if (flag4) {
            i1++;
            if (flag && (j1 == 0 || flag3)) {
               continue;
            }
         } else {
            j1++;
            if (flag1 && (i1 == 0 || flag2)) {
               continue;
            }
         }

         int k1 = i1 - 1;
         int l1 = j1 - 1;
         double d1 = flag4 ? var1.getDouble(k1) : var2.getDouble(l1);
         if (!(d0 >= d1 - 1.0E-7)) {
            this.L[l] = k1;
            this.u[l] = l1;
            this.y[l] = d1;
            l++;
            d0 = d1;
         } else {
            this.L[l - 1] = k1;
            this.u[l - 1] = l1;
         }
      }
   }

   @Override
   public int size() {
      return this.i;
   }

   @Override
   public boolean method_1065(class00631 var1) {
      int ix = this.i - 1;

      for (int j = 0; j < ix; j++) {
         if (!var1.merge(this.L[j], this.u[j], j)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList method_1066() {
      return (DoubleList)(this.i <= 1 ? N : DoubleArrayList.wrap(this.y, this.i));
   }
}
