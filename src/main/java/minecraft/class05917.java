package minecraft;

import Nursultan.class10546;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.ToIntFunction;

public class class05917 {
   private static final int N = 256;
   private final ThreadLocal<class10546> y = ThreadLocal.withInitial(class10546::new);
   private final Long2ObjectLinkedOpenHashMap<class05928> L = new Long2ObjectLinkedOpenHashMap(256, 0.25F);
   private final ReentrantReadWriteLock u = new ReentrantReadWriteLock();
   private final ToIntFunction<class07209> i;

   public class05917(ToIntFunction<class07209> var1) {
      super();
      this.i = var1;
   }

   private class05928 y(int var1, int var2) {
      long ix = class07321.u(var1, var2);
      this.u.readLock().lock();

      try {
         class05928 class05928xxx = (class05928)this.L.get(ix);
         if (class05928xxx != null) {
            return class05928xxx;
         }
      } finally {
         this.u.readLock().unlock();
      }

      this.u.writeLock().lock();

      class05928 class05928xx;
      try {
         class05928 class05928x = (class05928)this.L.get(ix);
         if (class05928x == null) {
            class05928xx = new class05928();
            if (this.L.size() >= 256) {
               class05928 class05928xx = (class05928)this.L.removeFirst();
               if (class05928xx != null) {
                  class05928xx.y();
               }
            }

            this.L.put(ix, class05928xx);
            return class05928xx;
         }

         class05928xx = class05928x;
      } finally {
         this.u.writeLock().unlock();
      }

      return class05928xx;
   }

   public int N(class07209 var1) {
      int ix = class01296.N(var1.method_10263());
      int j = class01296.N(var1.method_10260());
      class10546 class10546 = this.y.get();
      if (class10546.N != ix || class10546.y != j || class10546.L == null || class10546.L.N()) {
         class10546.N = ix;
         class10546.y = j;
         class10546.L = this.y(ix, j);
      }

      int[] aint = class10546.L.N(var1.method_10264());
      int k = var1.method_10263() & 15;
      int l = (var1.method_10260() & 15) << 4 | k;
      int i1 = aint[l];
      if (i1 != -1) {
         return i1;
      } else {
         int j1 = this.i.applyAsInt(var1);
         aint[l] = j1;
         return j1;
      }
   }

   public void N() {
      try {
         this.u.writeLock().lock();
         this.L.values().forEach(class05928::y);
         this.L.clear();
      } finally {
         this.u.writeLock().unlock();
      }
   }

   public void N(int var1, int var2) {
      try {
         this.u.writeLock().lock();

         for (int ix = -1; ix <= 1; ix++) {
            for (int j = -1; j <= 1; j++) {
               long k = class07321.u(var1 + ix, var2 + j);
               class05928 class05928 = (class05928)this.L.remove(k);
               if (class05928 != null) {
                  class05928.y();
               }
            }
         }
      } finally {
         this.u.writeLock().unlock();
      }
   }
}
