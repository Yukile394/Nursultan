package minecraft;

import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class class06998 implements class00630 {
   private final class06857 N;
   private final int y;
   private final int L;

   class06998(int var1, int var2) {
      super();
      this.N = new class06857((int)class00389.N(var1, var2));
      int i = IntMath.gcd(var1, var2);
      this.y = var1 / i;
      this.L = var2 / i;
   }

   @Override
   public int size() {
      return this.N.size();
   }

   @Override
   public boolean method_1065(class00631 var1) {
      int i = this.N.size() - 1;

      for (int j = 0; j < i; j++) {
         if (!var1.merge(j / this.L, j / this.y, j)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public DoubleList method_1066() {
      return this.N;
   }
}
