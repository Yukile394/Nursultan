package minecraft;

import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Arrays;
import org.jspecify.annotations.Nullable;

public abstract class class05015<M extends class05017<M>, S extends class04991<M>> implements class05035 {
   public static final int N = 15;
   protected static final int y = 1;
   protected static final long L = class05027.N(1);
   private static final int M = 512;
   protected static final class07211[] u = class07211.values();
   protected final class00538 i;
   protected final S R;
   private final LongOpenHashSet B = new LongOpenHashSet(512, 0.5F);
   private final LongArrayFIFOQueue Z = new LongArrayFIFOQueue();
   private final LongArrayFIFOQueue z = new LongArrayFIFOQueue();
   private static final int U = 2;
   private final long[] E = new long[2];
   private final class03482[] W = new class03482[2];

   private void L() {
      Arrays.fill(this.E, class07321.L);
      Arrays.fill(this.W, null);
   }

   @Override
   public int L(class07209 var1) {
      return this.R.N(var1.method_10063());
   }

   public class04993 L(long var1) {
      return this.R.E(var1);
   }

   protected void L(long var1, long var3) {
      this.z.enqueue(var1);
      this.z.enqueue(var3);
   }

   protected class05015(class00538 var1, S var2) {
      super();
      this.i = var1;
      this.R = (S)var2;
      this.L();
   }

   private int i() {
      int ix;
      for (ix = 0; !this.Z.isEmpty(); ix++) {
         long j = this.Z.dequeueLong();
         long k = this.Z.dequeueLong();
         this.N(j, k);
      }

      return ix;
   }

   private int u() {
      int ix;
      for (ix = 0; !this.z.isEmpty(); ix++) {
         long j = this.z.dequeueLong();
         long k = this.z.dequeueLong();
         int l = this.R.i(j);
         int i1 = class05027.N(k);
         if (class05027.L(k) && l < i1) {
            this.R.N(j, i1);
            l = i1;
         }

         if (l == i1) {
            this.N(j, k, l);
         }
      }

      return ix;
   }

   public void y(class07321 var1, boolean var2) {
      this.R.L(class01296.y(var1.B, var1.Z), var2);
   }

   protected int y(class00500 var1) {
      return Math.max(1, var1.z());
   }

   protected void y(long var1, long var3) {
      this.Z.enqueue(var1);
      this.Z.enqueue(var3);
   }

   public String y(long var1) {
      return this.L(var1).N();
   }

   protected class00500 y(class07209 var1) {
      int ix = class01296.N(var1.method_10263());
      int j = class01296.N(var1.method_10260());
      class03482 class03482 = this.N(ix, j);
      return class03482 == null ? class00869.q.W() : class03482.method_8320(var1);
   }

   protected boolean N(class00500 var1, class00500 var2, class07211 var3) {
      class00494 class00494x = N(var1, var3);
      class00494 class00494x = N(var2, var3.b());
      return class00389.y(class00494x, class00494x);
   }

   public static int N(class00500 var0, class00500 var1, class07211 var2, int var3) {
      boolean flag = N(var0);
      boolean flag1 = N(var1);
      if (flag && flag1) {
         return var3;
      } else {
         class00494 class00494x = flag ? class00389.N() : var0.U();
         class00494 class00494x = flag1 ? class00389.N() : var1.U();
         return class00389.y(class00494x, class00494x, var2) ? 16 : var3;
      }
   }

   @Nullable
   @Override
   public class00536 N(class01296 var1) {
      return this.R.u(var1.W());
   }

   @Override
   public void N(class07321 var1, boolean var2) {
      this.R.y(class01296.y(var1.B, var1.Z), var2);
   }

   protected abstract void N(long var1, long var3);

   protected abstract void N(long var1, long var3, int var5);

   protected abstract void N(long var1);

   public static boolean N(class00500 var0, class00500 var1) {
      return var1 == var0 ? false : var1.z() != var0.z() || var1.m() != var0.m() || var1.W() || var0.W();
   }

   @Override
   public int N() {
      LongIterator longiterator = this.B.iterator();

      while (longiterator.hasNext()) {
         this.N(longiterator.nextLong());
      }

      this.B.clear();
      this.B.trim(512);
      int ix = 0;
      ix += this.i();
      ix += this.u();
      this.L();
      this.R.N(this);
      this.R.y();
      return ix;
   }

   protected static boolean N(class00500 var0) {
      return !var0.G() || !var0.W();
   }

   @Override
   public void N(class01296 var1, boolean var2) {
      this.R.u(var1.W(), var2);
   }

   public void N(long var1, @Nullable class00536 var3) {
      this.R.N(var1, var3);
   }

   public static class00494 N(class00500 var0, class07211 var1) {
      return N(var0) ? class00389.N() : var0.N(var1);
   }

   @Nullable
   protected class03482 N(int var1, int var2) {
      long ix = class07321.u(var1, var2);

      for (int j = 0; j < 2; j++) {
         if (ix == this.E[j]) {
            return this.W[j];
         }
      }

      class03482 class03482 = this.i.y(var1, var2);

      for (int k = 1; k > 0; k--) {
         this.E[k] = this.E[k - 1];
         this.W[k] = this.W[k - 1];
      }

      this.E[0] = ix;
      this.W[0] = class03482;
      return class03482;
   }

   @Override
   public void N(class07209 var1) {
      this.B.add(var1.method_10063());
   }

   @Override
   public boolean au_() {
      return this.R.N() || !this.B.isEmpty() || !this.Z.isEmpty() || !this.z.isEmpty();
   }
}
