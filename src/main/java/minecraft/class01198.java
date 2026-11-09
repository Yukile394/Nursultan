package minecraft;

import Nursultan.class09447;
import java.util.Objects;
import java.util.function.IntConsumer;
import net.caffeinemc.mods.lithium.common.world.chunk.CompactingPackedIntegerArray;
import net.caffeinemc.mods.sodium.client.world.BitStorageExtension;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;

public class class01198 implements class04552, CompactingPackedIntegerArray, BitStorageExtension {
   private static final int[] N = new int[]{
      -1,
      -1,
      0,
      Integer.MIN_VALUE,
      0,
      0,
      1431655765,
      1431655765,
      0,
      Integer.MIN_VALUE,
      0,
      1,
      858993459,
      858993459,
      0,
      715827882,
      715827882,
      0,
      613566756,
      613566756,
      0,
      Integer.MIN_VALUE,
      0,
      2,
      477218588,
      477218588,
      0,
      429496729,
      429496729,
      0,
      390451572,
      390451572,
      0,
      357913941,
      357913941,
      0,
      330382099,
      330382099,
      0,
      306783378,
      306783378,
      0,
      286331153,
      286331153,
      0,
      Integer.MIN_VALUE,
      0,
      3,
      252645135,
      252645135,
      0,
      238609294,
      238609294,
      0,
      226050910,
      226050910,
      0,
      214748364,
      214748364,
      0,
      204522252,
      204522252,
      0,
      195225786,
      195225786,
      0,
      186737708,
      186737708,
      0,
      178956970,
      178956970,
      0,
      171798691,
      171798691,
      0,
      165191049,
      165191049,
      0,
      159072862,
      159072862,
      0,
      153391689,
      153391689,
      0,
      148102320,
      148102320,
      0,
      143165576,
      143165576,
      0,
      138547332,
      138547332,
      0,
      Integer.MIN_VALUE,
      0,
      4,
      130150524,
      130150524,
      0,
      126322567,
      126322567,
      0,
      122713351,
      122713351,
      0,
      119304647,
      119304647,
      0,
      116080197,
      116080197,
      0,
      113025455,
      113025455,
      0,
      110127366,
      110127366,
      0,
      107374182,
      107374182,
      0,
      104755299,
      104755299,
      0,
      102261126,
      102261126,
      0,
      99882960,
      99882960,
      0,
      97612893,
      97612893,
      0,
      95443717,
      95443717,
      0,
      93368854,
      93368854,
      0,
      91382282,
      91382282,
      0,
      89478485,
      89478485,
      0,
      87652393,
      87652393,
      0,
      85899345,
      85899345,
      0,
      84215045,
      84215045,
      0,
      82595524,
      82595524,
      0,
      81037118,
      81037118,
      0,
      79536431,
      79536431,
      0,
      78090314,
      78090314,
      0,
      76695844,
      76695844,
      0,
      75350303,
      75350303,
      0,
      74051160,
      74051160,
      0,
      72796055,
      72796055,
      0,
      71582788,
      71582788,
      0,
      70409299,
      70409299,
      0,
      69273666,
      69273666,
      0,
      68174084,
      68174084,
      0,
      Integer.MIN_VALUE,
      0,
      5
   };
   private final long[] y;
   private final int L;
   private final long u;
   private final int i;
   private final int R;
   private final int M;
   private final int B;
   private final int Z;

   @Override
   public int L() {
      return this.L;
   }

   public class01198(int var1, int var2, int[] var3) {
      this(var1, var2);
      int j = 0;

      int ix;
      for (ix = 0; ix <= var2 - this.R; ix += this.R) {
         long k = 0L;

         for (int i1 = this.R - 1; i1 >= 0; i1--) {
            k <<= var1;
            k |= var3[ix + i1] & this.u;
         }

         this.y[j++] = k;
      }

      int k1 = var2 - ix;
      if (k1 > 0) {
         long l = 0L;

         for (int j1 = k1 - 1; j1 >= 0; j1--) {
            l <<= var1;
            l |= var3[ix + j1] & this.u;
         }

         this.y[j] = l;
      }
   }

   public class01198(int var1, int var2, @Nullable long[] var3) {
      super();
      Validate.inclusiveBetween(1L, 32L, var1);
      this.i = var2;
      this.L = var1;
      this.u = (1L << var1) - 1L;
      this.R = (char)(64 / var1);
      int ix = 3 * (this.R - 1);
      this.M = N[ix + 0];
      this.B = N[ix + 1];
      this.Z = N[ix + 2];
      int j = (var2 + this.R - 1) / this.R;
      if (var3 != null) {
         if (var3.length != j) {
            throw new class09447("Invalid length given for storage, got: " + var3.length + " but expected: " + j);
         }

         this.y = var3;
      } else {
         this.y = new long[j];
      }
   }

   public class01198(int var1, int var2) {
      this(var1, var2, (long[])null);
   }

   @Override
   public class04552 u() {
      return new class01198(this.L, this.i, (long[])this.y.clone());
   }

   @Override
   public int y() {
      return this.i;
   }

   @Override
   public void y(int var1, int var2) {
      long k1 = this.i - 1;
      long j1 = var1;
      long i1 = k1;
      long l = 0L;
      this.N(l, i1, j1);
      j1 = var2;
      i1 = this.u;
      l = 0L;
      this.N(l, i1, j1);
      int ix = this.y(var1);
      long j = this.y[ix];
      int k = (var1 - ix * this.R) * this.L;
      this.y[ix] = j & ~(this.u << k) | (var2 & this.u) << k;
   }

   private int y(int var1) {
      long ix = Integer.toUnsignedLong(this.M);
      long j = Integer.toUnsignedLong(this.B);
      return (int)(var1 * ix + j >> 32 >> this.Z);
   }

   @Override
   public int N(int var1, int var2) {
      long l1 = this.i - 1;
      long k1 = var1;
      long j1 = l1;
      long i1 = 0L;
      this.N(i1, j1, k1);
      k1 = var2;
      j1 = this.u;
      i1 = 0L;
      this.N(i1, j1, k1);
      int ix = this.y(var1);
      long j = this.y[ix];
      int k = (var1 - ix * this.R) * this.L;
      int l = (int)(j >> k & this.u);
      this.y[ix] = j & ~(this.u << k) | (var2 & this.u) << k;
      return l;
   }

   @Override
   public void N(int[] var1) {
      int ix = this.y.length;
      int j = 0;

      for (int k = 0; k < ix - 1; k++) {
         long l = this.y[k];

         for (int i1 = 0; i1 < this.R; i1++) {
            var1[j + i1] = (int)(l & this.u);
            l >>= this.L;
         }

         j += this.R;
      }

      int j1 = this.i - j;
      if (j1 > 0) {
         long k1 = this.y[ix - 1];

         for (int l1 = 0; l1 < j1; l1++) {
            var1[j + l1] = (int)(k1 & this.u);
            k1 >>= this.L;
         }
      }
   }

   public void N(long var1, long var3, long var5) {
   }

   @Override
   public long[] N() {
      return this.y;
   }

   @Override
   public int N(int var1) {
      long k1 = this.i - 1;
      long j1 = var1;
      long i1 = k1;
      long l = 0L;
      this.N(l, i1, j1);
      int ix = this.y(var1);
      long j = this.y[ix];
      int k = (var1 - ix * this.R) * this.L;
      return (int)(j >> k & this.u);
   }

   @Override
   public void N(IntConsumer var1) {
      int ix = 0;

      for (long j : this.y) {
         for (int k = 0; k < this.R; k++) {
            var1.accept((int)(j & this.u));
            j >>= this.L;
            if (++ix >= this.i) {
               return;
            }
         }
      }
   }

   public void lithium$compact(class07340 var1, class07340 var2, short[] var3) {
      if (this.i >= 32767) {
         throw new IllegalStateException("Array too large");
      } else if (this.i != var3.length) {
         throw new IllegalStateException("Array size mismatch");
      } else {
         class07342 class07342 = class07342.N();
         short[] ashort = new short[(int)(this.u + 1L)];
         int ix = 0;

         for (long j : this.y) {
            for (int k = 0; k < this.R; k++) {
               int l = (int)(j & this.u);
               int i1 = ashort[l];
               if (i1 == 0) {
                  i1 = var2.method_12291(var1.method_12288(l), class07342) + 1;
                  ashort[l] = (short)i1;
               }

               var3[ix] = (short)(i1 - 1);
               j >>= this.L;
               if (++ix >= this.i) {
                  return;
               }
            }
         }
      }
   }

   public void sodium$unpack(Object[] var1, class07340 var2) {
      int ix = 0;

      for (long j : this.y) {
         for (int k = 0; k < this.R; k++) {
            var1[ix] = Objects.requireNonNull(var2.method_12288((int)(j & this.u)), "Palette does not contain entry for value in storage");
            j >>= this.L;
            if (++ix >= this.i) {
               return;
            }
         }
      }
   }
}
