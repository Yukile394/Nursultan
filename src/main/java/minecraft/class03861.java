package minecraft;

import it.unimi.dsi.fastutil.HashCommon;
import it.unimi.dsi.fastutil.longs.Long2LongLinkedOpenHashMap;
import java.util.NoSuchElementException;

public class class03861 extends Long2LongLinkedOpenHashMap {
   private static final int N = class04995.M(60000000);
   private static final int y = class04995.M(60000000);
   private static final int L = 64 - N - y;
   private static final int u = 0;
   private static final int i = L;
   private static final int R = L + y;
   private static final long M = 3L << R | 3L | 3L << i;
   private int B = -1;
   private long Z;
   private final int z;

   public boolean L(long var1) {
      long ix = N(var1);
      int j = y(var1);
      long k = 1L << j;
      int l;
      if (ix == 0L) {
         if (this.containsNullKey) {
            return this.N(this.n, k);
         }

         this.containsNullKey = true;
         l = this.n;
      } else {
         if (this.B != -1 && ix == this.Z) {
            return this.N(this.B, k);
         }

         l = (int)HashCommon.mix(ix) & this.mask;

         for (long i1 = this.key[l]; i1 != 0L; i1 = this.key[l]) {
            if (i1 == ix) {
               this.B = l;
               this.Z = ix;
               return this.N(l, k);
            }

            l = l + 1 & this.mask;
         }
      }

      this.key[l] = ix;
      this.value[l] = k;
      if (this.size == 0) {
         this.first = this.last = l;
         this.link[l] = -1L;
      } else {
         this.link[this.last] = this.link[this.last] ^ (this.link[this.last] ^ l & 4294967295L) & 4294967295L;
         this.link[l] = (this.last & 4294967295L) << 32 | 4294967295L;
         this.last = l;
      }

      if (this.size++ >= this.maxFill) {
         this.rehash(HashCommon.arraySize(this.size + 1, this.f));
      }

      return false;
   }

   public class03861(int var1, float var2) {
      super(var1, var2);
      this.z = var1;
   }

   private boolean i(long var1) {
      if ((this.value[this.n] & var1) == 0L) {
         return false;
      } else {
         this.value[this.n] = this.value[this.n] & ~var1;
         if (this.value[this.n] != 0L) {
            return true;
         } else {
            this.containsNullKey = false;
            this.size--;
            this.fixPointers(this.n);
            if (this.size < this.maxFill / 4 && this.n > 16) {
               this.rehash(this.n / 2);
            }

            return true;
         }
      }
   }

   protected void rehash(int var1) {
      if (var1 > this.z) {
         super.rehash(var1);
      }
   }

   public boolean u(long var1) {
      long ix = N(var1);
      int j = y(var1);
      long k = 1L << j;
      if (ix == 0L) {
         return this.containsNullKey ? this.i(k) : false;
      } else if (this.B != -1 && ix == this.Z) {
         return this.y(this.B, k);
      } else {
         int l = (int)HashCommon.mix(ix) & this.mask;

         for (long i1 = this.key[l]; i1 != 0L; i1 = this.key[l]) {
            if (ix == i1) {
               this.B = l;
               this.Z = ix;
               return this.y(l, k);
            }

            l = l + 1 & this.mask;
         }

         return false;
      }
   }

   private boolean y(int var1, long var2) {
      if ((this.value[var1] & var2) == 0L) {
         return false;
      } else {
         this.value[var1] = this.value[var1] & ~var2;
         if (this.value[var1] != 0L) {
            return true;
         } else {
            this.B = -1;
            this.size--;
            this.fixPointers(var1);
            this.shiftKeys(var1);
            if (this.size < this.maxFill / 4 && this.n > 16) {
               this.rehash(this.n / 2);
            }

            return true;
         }
      }
   }

   static int y(long var0) {
      int ix = (int)(var0 >>> R & 3L);
      int j = (int)(var0 >>> 0 & 3L);
      int k = (int)(var0 >>> i & 3L);
      return ix << 4 | k << 2 | j;
   }

   public long N() {
      if (this.size == 0) {
         throw new NoSuchElementException();
      } else {
         int ix = this.first;
         long j = this.key[ix];
         int k = Long.numberOfTrailingZeros(this.value[ix]);
         this.value[ix] = this.value[ix] & ~(1L << k);
         if (this.value[ix] == 0L) {
            this.removeFirstLong();
            this.B = -1;
         }

         return N(j, k);
      }
   }

   static long N(long var0, int var2) {
      var0 |= (long)(var2 >>> 4 & 3) << R;
      var0 |= (long)(var2 >>> 2 & 3) << i;
      return var0 | (long)(var2 >>> 0 & 3) << 0;
   }

   private boolean N(int var1, long var2) {
      boolean flag = (this.value[var1] & var2) != 0L;
      this.value[var1] = this.value[var1] | var2;
      return flag;
   }

   static long N(long var0) {
      return var0 & ~M;
   }
}
