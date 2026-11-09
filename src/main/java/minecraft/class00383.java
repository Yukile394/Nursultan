package minecraft;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class class00383 extends AbstractDoubleList implements class00630 {
   private final DoubleList N;
   private final DoubleList y;
   private final boolean L;

   public class00383(DoubleList var1, DoubleList var2, boolean var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public int size() {
      return this.N.size() + this.y.size();
   }

   public double getDouble(int var1) {
      return var1 < this.N.size() ? this.N.getDouble(var1) : this.y.getDouble(var1 - this.N.size());
   }

   private boolean N(class00631 var1) {
      int i = this.N.size();

      for (int j = 0; j < i; j++) {
         if (!var1.merge(j, -1, j)) {
            return false;
         }
      }

      int l = this.y.size() - 1;

      for (int k = 0; k < l; k++) {
         if (!var1.merge(i - 1, k, i + k)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean method_1065(class00631 var1) {
      return this.L ? this.N((var1x, var2, var3) -> var1.merge(var2, var1x, var3)) : this.N(var1);
   }

   @Override
   public DoubleList method_1066() {
      return this;
   }
}
