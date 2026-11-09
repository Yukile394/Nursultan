package minecraft;

import Nursultan.class10189;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;

public class class03340 {
   private final int N;
   private final LongLinkedOpenHashSet[] y;
   private int L;

   public class03340(int var1, int var2) {
      super();
      this.N = var1;
      this.y = new LongLinkedOpenHashSet[var1];

      for (int i = 0; i < var1; i++) {
         this.y[i] = new class10189(this, var2, 0.5F, var2);
      }

      this.L = var1;
   }

   public boolean y() {
      return this.L >= this.N;
   }

   private void N(int var1) {
      int i = this.L;
      this.L = var1;

      for (int j = i + 1; j < var1; j++) {
         if (!this.y[j].isEmpty()) {
            this.L = j;
            break;
         }
      }
   }

   public void N(long var1, int var3) {
      this.y[var3].add(var1);
      if (this.L > var3) {
         this.L = var3;
      }
   }

   public void N(long var1, int var3, int var4) {
      LongLinkedOpenHashSet longlinkedopenhashset = this.y[var3];
      longlinkedopenhashset.remove(var1);
      if (longlinkedopenhashset.isEmpty() && this.L == var3) {
         this.N(var4);
      }
   }

   public long N() {
      LongLinkedOpenHashSet longlinkedopenhashset = this.y[this.L];
      long i = longlinkedopenhashset.removeFirstLong();
      if (longlinkedopenhashset.isEmpty()) {
         this.N(this.N);
      }

      return i;
   }
}
