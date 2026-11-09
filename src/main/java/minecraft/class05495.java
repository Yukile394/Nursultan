package minecraft;

import it.unimi.dsi.fastutil.ints.IntArraySet;
import it.unimi.dsi.fastutil.ints.IntCollection;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.BitSet;

public class class05495 {
   private final BitSet N = new BitSet();

   public class05495() {
      super();
   }

   public void y(int var1, int var2) {
      this.N.clear(var1, var1 + var2);
   }

   public void N(int var1, int var2) {
      this.N.set(var1, var1 + var2);
   }

   public int N(int var1) {
      int i = 0;

      while (true) {
         int j = this.N.nextClearBit(i);
         int k = this.N.nextSetBit(j);
         if (k == -1 || k - j >= var1) {
            this.N(j, var1);
            return j;
         }

         i = k;
      }
   }

   public IntSet N() {
      return this.N.stream().collect(IntArraySet::new, IntCollection::add, IntCollection::addAll);
   }
}
