package minecraft;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class class07255 extends AbstractDoubleList {
   private final DoubleList N;
   private final double y;

   public class07255(DoubleList var1, double var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public int size() {
      return this.N.size();
   }

   public double getDouble(int var1) {
      return this.N.getDouble(var1) + this.y;
   }
}
