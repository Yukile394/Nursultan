package minecraft;

import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;

public class class03859 extends LongLinkedOpenHashSet {
   private final class03861 N;

   public class03859(int var1, float var2) {
      super(var1, var2);
      this.N = new class03861(var1 / 64, var2);
   }

   public int size() {
      throw new UnsupportedOperationException();
   }

   public boolean isEmpty() {
      return this.N.isEmpty();
   }

   public boolean add(long var1) {
      return this.N.L(var1);
   }

   public boolean rem(long var1) {
      return this.N.u(var1);
   }

   public long removeFirstLong() {
      return this.N.N();
   }
}
