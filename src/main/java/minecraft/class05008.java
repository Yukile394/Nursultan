package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntBidirectionalIterator;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.IntStream;
import org.jspecify.annotations.Nullable;

public class class05008 {
   private static final int N = 33554432;
   private final class04860[] y;
   private final int L;
   private final DoubleList u;
   private final double i;
   private final double R;
   private final double M;

   protected DoubleList L() {
      return this.u;
   }

   private double L(double var1) {
      double d0 = 0.0;
      double d1 = this.i;

      for (int ix = 0; ix < this.y.length; ix++) {
         if (this.y[ix] != null) {
            d0 += this.u.getDouble(ix) * var1 * d1;
         }

         d1 /= 2.0;
      }

      return d0;
   }

   protected class05008(class06069 var1, Pair<Integer, DoubleList> var2, boolean var3) {
      super();
      this.L = (Integer)var2.getFirst();
      this.u = (DoubleList)var2.getSecond();
      int ix = this.u.size();
      int j = -this.L;
      this.y = new class04860[ix];
      if (var3) {
         class01818 class01818 = var1.L();

         for (int k = 0; k < ix; k++) {
            if (this.u.getDouble(k) != 0.0) {
               int l = this.L + k;
               this.y[k] = new class04860(class01818.N("octave_" + l));
            }
         }
      } else {
         class04860 class04860 = new class04860(var1);
         if (j >= 0 && j < ix) {
            double d0 = this.u.getDouble(j);
            if (d0 != 0.0) {
               this.y[j] = class04860;
            }
         }

         for (int i1 = j - 1; i1 >= 0; i1--) {
            if (i1 < ix) {
               double d1 = this.u.getDouble(i1);
               if (d1 != 0.0) {
                  this.y[i1] = new class04860(var1);
               } else {
                  N(var1);
               }
            } else {
               N(var1);
            }
         }

         if (Arrays.stream(this.y).filter(Objects::nonNull).count() != this.u.stream().filter(var0 -> var0 != 0.0).count()) {
            throw new IllegalStateException("Failed to create correct number of noise levels for given non-zero amplitudes");
         }

         if (j < ix - 1) {
            throw new IllegalArgumentException("Positive octaves are temporarily disabled");
         }
      }

      this.R = Math.pow(2.0, -j);
      this.i = Math.pow(2.0, ix - 1) / (Math.pow(2.0, ix) - 1.0);
      this.M = this.L(2.0);
   }

   protected int y() {
      return this.L;
   }

   public static double y(double var0) {
      return var0 - class04995.y(var0 / 3.3554432E7 + 0.5) * 3.3554432E7;
   }

   public static class05008 y(class06069 var0, IntStream var1) {
      return N(var0, var1.boxed().collect(ImmutableList.toImmutableList()));
   }

   public static class05008 y(class06069 var0, int var1, DoubleList var2) {
      return new class05008(var0, Pair.of(var1, var2), true);
   }

   @Nullable
   public class04860 N(int var1) {
      return this.y[this.y.length - 1 - var1];
   }

   public double N(double var1) {
      return this.L(var1 + 2.0);
   }

   @Deprecated
   public static class05008 N(class06069 var0, IntStream var1) {
      return new class05008(var0, N(new IntRBTreeSet(var1.boxed().collect(ImmutableList.toImmutableList()))), false);
   }

   public void N(StringBuilder var1) {
      var1.append("PerlinNoise{");
      List list = this.u.stream().map(var0 -> String.format(Locale.ROOT, "%.2f", var0)).toList();
      var1.append("first octave: ").append(this.L).append(", amplitudes: ").append(list).append(", noise levels: [");

      for (int ix = 0; ix < this.y.length; ix++) {
         var1.append(ix).append(": ");
         class04860 class04860 = this.y[ix];
         if (class04860 == null) {
            var1.append("null");
         } else {
            class04860.N(var1);
         }

         var1.append(", ");
      }

      var1.append("]");
      var1.append("}");
   }

   private static Pair<Integer, DoubleList> N(IntSortedSet var0) {
      if (var0.isEmpty()) {
         throw new IllegalArgumentException("Need some octaves!");
      } else {
         int ix = -var0.firstInt();
         int j = var0.lastInt();
         int k = ix + j + 1;
         if (k < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
         } else {
            DoubleArrayList doublearraylist = new DoubleArrayList(new double[k]);
            IntBidirectionalIterator intbidirectionaliterator = var0.iterator();

            while (intbidirectionaliterator.hasNext()) {
               int l = intbidirectionaliterator.nextInt();
               doublearraylist.set(l + ix, 1.0);
            }

            return Pair.of(-ix, doublearraylist);
         }
      }
   }

   public static class05008 N(class06069 var0, int var1, double var2, double... var4) {
      DoubleArrayList doublearraylist = new DoubleArrayList(var4);
      doublearraylist.add(0, var2);
      return new class05008(var0, Pair.of(var1, doublearraylist), true);
   }

   public static class05008 N(class06069 var0, List<Integer> var1) {
      return new class05008(var0, N(new IntRBTreeSet(var1)), true);
   }

   @Deprecated
   public static class05008 N(class06069 var0, int var1, DoubleList var2) {
      return new class05008(var0, Pair.of(var1, var2), false);
   }

   @Deprecated
   public double N(double var1, double var3, double var5, double var7, double var9, boolean var11) {
      double d0 = 0.0;
      double d1 = this.R;
      double d2 = this.i;

      for (int ix = 0; ix < this.y.length; ix++) {
         class04860 class04860 = this.y[ix];
         if (class04860 != null) {
            double d3 = class04860.N(y(var1 * d1), var11 ? -class04860.y : y(var3 * d1), y(var5 * d1), var7 * d1, var9 * d1);
            d0 += this.u.getDouble(ix) * d3 * d2;
         }

         d1 *= 2.0;
         d2 /= 2.0;
      }

      return d0;
   }

   public double N(double var1, double var3, double var5) {
      return this.N(var1, var3, var5, 0.0, 0.0, false);
   }

   private static void N(class06069 var0) {
      var0.L(262);
   }

   protected double N() {
      return this.M;
   }
}
