package minecraft;

import java.util.BitSet;
import java.util.stream.Stream;

public class class03322 {
   private final int N;
   private final BitSet y;
   private class03292 L = (var0, var1x, var2x) -> false;

   private int L(int var1, int var2, int var3) {
      return var1 & 15 | (var3 & 15) << 4 | var2 - this.N << 8;
   }

   public class03322(int var1, int var2) {
      super();
      this.N = var2;
      this.y = new BitSet(256 * var1);
   }

   public class03322(long[] var1, int var2) {
      super();
      this.N = var2;
      this.y = BitSet.valueOf(var1);
   }

   public boolean y(int var1, int var2, int var3) {
      return this.L.test(var1, var2, var3) || this.y.get(this.L(var1, var2, var3));
   }

   public long[] N() {
      return this.y.toLongArray();
   }

   public void N(int var1, int var2, int var3) {
      this.y.set(this.L(var1, var2, var3));
   }

   public Stream<class07209> N(class07321 var1) {
      return this.y.stream().mapToObj(var2 -> {
         int i = var2 & 15;
         int j = var2 >> 4 & 15;
         int k = var2 >> 8;
         return var1.N(i, k + this.N, j);
      });
   }

   public void N(class03292 var1) {
      this.L = var1;
   }
}
