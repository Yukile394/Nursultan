package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class class07708 implements class00630 {
   private final DoubleList N;

   public class07708(DoubleList var1) {
      super();
      this.N = var1;
   }

   @Override
   public int size() {
      return this.N.size();
   }

   @Override
   public boolean method_1065(class00631 var1) {
      int i = this.N.size() - 1;

      for (int j = 0; j < i; j++) {
         if (!var1.merge(j, j, j)) {
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
