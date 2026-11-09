package minecraft;

import it.unimi.dsi.fastutil.ints.Int2DoubleMap;

public class class04542 {
   private final Int2DoubleMap N;
   private final int y;
   private final int L;

   public class04542(int var1, int var2, Int2DoubleMap var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.N = var3;
   }

   public int y() {
      return this.L;
   }

   public double N(int var1) {
      return this.N.get(var1);
   }

   public int N() {
      return this.y;
   }
}
