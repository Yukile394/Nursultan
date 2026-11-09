package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class class05928 {
   private final Int2ObjectArrayMap<int[]> N = new Int2ObjectArrayMap(16);
   private final ReentrantReadWriteLock y = new ReentrantReadWriteLock();
   private static final int L = class04995.Z(16);
   private volatile boolean u;

   private int[] L() {
      int[] aint = new int[L];
      Arrays.fill(aint, -1);
      return aint;
   }

   class05928() {
      super();
   }

   public void y() {
      this.u = true;
   }

   public boolean N() {
      return this.u;
   }

   public int[] N(int var1) {
      this.y.readLock().lock();

      try {
         int[] aint = (int[])this.N.get(var1);
         if (aint != null) {
            return aint;
         }
      } finally {
         this.y.readLock().unlock();
      }

      this.y.writeLock().lock();

      int[] aint1;
      try {
         aint1 = (int[])this.N.computeIfAbsent(var1, var1x -> this.L());
      } finally {
         this.y.writeLock().unlock();
      }

      return aint1;
   }
}
