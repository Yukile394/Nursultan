package minecraft;

import Nursultan.class10484;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.util.function.LongPredicate;

public abstract class class05010 {
   public static final long i = Long.MAX_VALUE;
   private static final int N = 255;
   protected final int R;
   private final class03340 y;
   private final Long2ByteMap L;
   private volatile boolean u;

   protected abstract int L(long var1);

   public int L() {
      return this.L.size();
   }

   protected class05010(int var1, int var2, int var3) {
      super();
      if (var1 >= 254) {
         throw new IllegalArgumentException("Level count must be < 254.");
      } else {
         this.R = var1;
         this.y = new class03340(var1, var2);
         this.L = new class10484(this, var3, 0.5F, var3);
         this.L.defaultReturnValue((byte)-1);
      }
   }

   protected void i(long var1) {
      this.N(var1, var1, this.R - 1, false);
   }

   protected void u(long var1) {
      int ix = this.L.remove(var1) & 255;
      if (ix != 255) {
         int j = this.L(var1);
         int k = this.N(j, ix);
         this.y.N(var1, k, this.R);
         this.u = !this.y.y();
      }
   }

   protected final boolean y() {
      return this.u;
   }

   protected final int y(int var1) {
      if (this.y.y()) {
         return var1;
      } else {
         while (!this.y.y() && var1 > 0) {
            var1--;
            long ix = this.y.N();
            int j = class04995.N(this.L(ix), 0, this.R - 1);
            int k = this.L.remove(ix) & 255;
            if (k < j) {
               this.N(ix, k);
               this.N(ix, k, true);
            } else if (k > j) {
               this.N(ix, this.R - 1);
               if (k != this.R - 1) {
                  this.y.N(ix, this.N(this.R - 1, k));
                  this.L.put(ix, (byte)k);
               }

               this.N(ix, j, false);
            }
         }

         this.u = !this.y.y();
         return var1;
      }
   }

   protected abstract int y(long var1, long var3, int var5);

   protected final void y(long var1, long var3, int var5, boolean var6) {
      int ix = this.L.get(var3) & 255;
      int j = class04995.N(this.y(var1, var3, var5), 0, this.R - 1);
      if (var6) {
         this.N(var1, var3, j, this.L(var3), ix, var6);
      } else {
         boolean flag = ix == 255;
         int k;
         if (flag) {
            k = class04995.N(this.L(var3), 0, this.R - 1);
         } else {
            k = ix;
         }

         if (j == k) {
            this.N(var1, var3, this.R - 1, flag ? k : this.L(var3), ix, var6);
         }
      }
   }

   protected abstract void N(long var1, int var3);

   private int N(int var1, int var2) {
      return Math.min(Math.min(var1, var2), this.R - 1);
   }

   protected abstract void N(long var1, int var3, boolean var4);

   public void N(LongPredicate var1) {
      LongArrayList longarraylist = new LongArrayList();
      this.L.keySet().forEach(var2x -> {
         if (var1.test(var2x)) {
            longarraylist.add(var2x);
         }
      });
      longarraylist.forEach(this::u);
   }

   private void N(long var1, long var3, int var5, int var6, int var7, boolean var8) {
      if (!this.N(var3)) {
         var5 = class04995.N(var5, 0, this.R - 1);
         var6 = class04995.N(var6, 0, this.R - 1);
         boolean flag = var7 == 255;
         if (flag) {
            var7 = var6;
         }

         int ix;
         if (var8) {
            ix = Math.min(var7, var5);
         } else {
            ix = class04995.N(this.N(var3, var1, var5), 0, this.R - 1);
         }

         int j = this.N(var6, var7);
         if (var6 != ix) {
            int k = this.N(var6, ix);
            if (j != k && !flag) {
               this.y.N(var3, j, k);
            }

            this.y.N(var3, k);
            this.L.put(var3, (byte)ix);
         } else if (!flag) {
            this.y.N(var3, j, this.R);
            this.L.remove(var3);
         }
      }
   }

   protected void N(long var1, long var3, int var5, boolean var6) {
      this.N(var1, var3, var5, this.L(var3), this.L.get(var3) & 255, var6);
      this.u = !this.y.y();
   }

   protected boolean N(long var1) {
      return var1 == Long.MAX_VALUE;
   }

   protected abstract int N(long var1, long var3, int var5);
}
