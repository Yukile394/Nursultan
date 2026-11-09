package minecraft;

import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.NoSuchElementException;

public class class02084 implements IntIterator {
   private final int N;
   private final int y;
   private final int L;
   private int u;
   private int i;

   public class02084(int var1, int var2) {
      super();
      this.N = var2;
      if (var2 > 0) {
         this.y = var1 / var2;
         this.L = var1 % var2;
      } else {
         this.y = 0;
         this.L = 0;
      }
   }

   public boolean hasNext() {
      return this.u < this.N;
   }

   public int nextInt() {
      if (!this.hasNext()) {
         throw new NoSuchElementException();
      } else {
         int ix = this.y;
         this.i = this.i + this.L;
         if (this.i >= this.N) {
            this.i = this.i - this.N;
            ix++;
         }

         this.u++;
         return ix;
      }
   }

   public static Iterable<Integer> N(int var0, int var1) {
      return () -> new class02084(var0, var1);
   }
}
