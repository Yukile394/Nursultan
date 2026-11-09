package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.lang3.mutable.MutableDouble;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class03001 {
   private static final class03001 N = new class03015(new Long2ObjectOpenHashMap(), new Long2ObjectOpenHashMap());
   private static final class05041 y = class05041.y(new class04042(42L), class03023.N);
   private static final int L = class01146.u(7) - 1;
   private static final int u = class01146.i(L + 3);
   private static final int i = 2;
   private static final int R = class01146.i(5);
   private static final double M = 8.0;
   private final Long2ObjectOpenHashMap<class03032> B;
   private final Long2ObjectOpenHashMap<class03032> Z;

   class03001(Long2ObjectOpenHashMap<class03032> var1, Long2ObjectOpenHashMap<class03032> var2) {
      super();
      this.B = var1;
      this.Z = var2;
   }

   public boolean y() {
      return this.B.isEmpty() && this.Z.isEmpty();
   }

   private static double N(double var0, double var2, double var4, double var6, double var8, double var10) {
      double d0 = Math.abs(var0) - var6;
      double d1 = Math.abs(var2) - var8;
      double d2 = Math.abs(var4) - var10;
      return class04995.M(Math.max(0.0, d0), Math.max(0.0, d1), Math.max(0.0, d2));
   }

   public static class03001 N() {
      return N;
   }

   public double N(class03875 var1, double var2) {
      int ix = class01146.N(var1.y());
      int j = var1.L() / 8;
      int k = class01146.N(var1.u());
      double d0 = this.N(ix, j, k, class03032::y);
      if (d0 != Double.MAX_VALUE) {
         return d0;
      } else {
         MutableDouble mutabledouble = new MutableDouble(0.0);
         MutableDouble mutabledouble1 = new MutableDouble(0.0);
         MutableDouble mutabledouble2 = new MutableDouble(Double.POSITIVE_INFINITY);
         this.Z
            .forEach(
               (var6x, var8) -> var8.N(class01146.u(class07321.N(var6x)), class01146.u(class07321.y(var6x)), j - 1, j + 1, (var6xx, var7x, var8x, var9x) -> {
                  double d0x = class04995.M((double)(ix - var6xx), (double)((j - var7x) * 2), (double)(k - var8x));
                  if (!(d0x > 2.0)) {
                     if (d0x < mutabledouble2.doubleValue()) {
                        mutabledouble2.setValue(d0x);
                     }

                     double d1x = 1.0 / (d0x * d0x * d0x * d0x);
                     mutabledouble1.add(var9x * d1x);
                     mutabledouble.add(d1x);
                  }
               })
            );
         if (mutabledouble2.doubleValue() == Double.POSITIVE_INFINITY) {
            return var2;
         } else {
            double d1 = mutabledouble1.doubleValue() / mutabledouble.doubleValue();
            return class04995.u(class04995.N(mutabledouble2.doubleValue() / 3.0, 0.0, 1.0), d1, var2);
         }
      }
   }

   private double N(int var1, int var2, int var3, class03036 var4) {
      int ix = class01146.i(var1);
      int j = class01146.i(var3);
      boolean flag = (var1 & 3) == 0;
      boolean flag1 = (var3 & 3) == 0;
      double d0 = this.N(var4, ix, j, var1, var2, var3);
      if (d0 == Double.MAX_VALUE) {
         if (flag && flag1) {
            d0 = this.N(var4, ix - 1, j - 1, var1, var2, var3);
         }

         if (d0 == Double.MAX_VALUE) {
            if (flag) {
               d0 = this.N(var4, ix - 1, j, var1, var2, var3);
            }

            if (d0 == Double.MAX_VALUE && flag1) {
               d0 = this.N(var4, ix, j - 1, var1, var2, var3);
            }
         }
      }

      return d0;
   }

   private double N(class03036 var1, int var2, int var3, int var4, int var5, int var6) {
      class03032 class03032 = (class03032)this.B.get(class07321.u(var2, var3));
      return class03032 != null ? var1.get(class03032, var4 - class01146.u(var2), var5, var6 - class01146.u(var3)) : Double.MAX_VALUE;
   }

   public class04330 N(class04330 var1) {
      return (var2, var3, var4, var5) -> {
         class03556 class03556 = this.N(var2, var3, var4);
         return class03556 == null ? var1.method_38109(var2, var3, var4, var5) : class03556;
      };
   }

   private static double N(double var0) {
      double d0 = 1.0;
      double d1 = var0 + 0.5;
      double d2 = class04995.L(d1, 8.0);
      return 1.0 * (32.0 * (d1 - 128.0) - 3.0 * (d1 - 120.0) * d2 + 3.0 * d2 * d2) / (128.0 * (32.0 - 3.0 * d2));
   }

   public class03027 N(int var1, int var2) {
      int ix = class01146.N(var1);
      int j = class01146.N(var2);
      double d0 = this.N(ix, 0, j, class03032::N);
      if (d0 != Double.MAX_VALUE) {
         return new class03027(0.0, N(d0));
      } else {
         MutableDouble mutabledouble = new MutableDouble(0.0);
         MutableDouble mutabledouble1 = new MutableDouble(0.0);
         MutableDouble mutabledouble2 = new MutableDouble(Double.POSITIVE_INFINITY);
         this.B.forEach((var5x, var7x) -> var7x.N(class01146.u(class07321.N(var5x)), class01146.u(class07321.y(var5x)), (var5xx, var6, var7xx) -> {
            double d0x = class04995.M(ix - var5xx, j - var6);
            if (!(d0x > L)) {
               if (d0x < mutabledouble2.doubleValue()) {
                  mutabledouble2.setValue(d0x);
               }

               double d1x = 1.0 / (d0x * d0x * d0x * d0x);
               mutabledouble1.add(var7xx * d1x);
               mutabledouble.add(d1x);
            }
         }));
         if (mutabledouble2.doubleValue() == Double.POSITIVE_INFINITY) {
            return new class03027(1.0, 0.0);
         } else {
            double d1 = mutabledouble1.doubleValue() / mutabledouble.doubleValue();
            double d2 = class04995.N(mutabledouble2.doubleValue() / (L + 1), 0.0, 1.0);
            d2 = 3.0 * d2 * d2 - 2.0 * d2 * d2 * d2;
            return new class03027(d2, N(d1));
         }
      }
   }

   public static class03001 N(@Nullable class01607 var0) {
      if (!class07529.NI && var0 != null) {
         class07321 class07321 = var0.L();
         if (!var0.N(class07321, u)) {
            return N;
         } else {
            Long2ObjectOpenHashMap long2objectopenhashmap = new Long2ObjectOpenHashMap();
            Long2ObjectOpenHashMap long2objectopenhashmap1 = new Long2ObjectOpenHashMap();
            int ix = class04995.Z(u + 1);

            for (int j = -u; j <= u; j++) {
               for (int k = -u; k <= u; k++) {
                  if (j * j + k * k <= ix) {
                     int l = class07321.B + j;
                     int i1 = class07321.Z + k;
                     class03032 class03032 = class03032.N(var0, l, i1);
                     if (class03032 != null) {
                        long2objectopenhashmap.put(class07321.u(l, i1), class03032);
                        if (j >= -R && j <= R && k >= -R && k <= R) {
                           long2objectopenhashmap1.put(class07321.u(l, i1), class03032);
                        }
                     }
                  }
               }
            }

            return long2objectopenhashmap.isEmpty() && long2objectopenhashmap1.isEmpty() ? N : new class03001(long2objectopenhashmap, long2objectopenhashmap1);
         }
      } else {
         return N;
      }
   }

   private static class03002 N(@Nullable class00758 var0, class03032 var1) {
      double d0 = 0.0;
      double d1 = 0.0;
      if (var0 != null) {
         for (class07211 class07211 : var0.N()) {
            d0 += class07211.P() * 16;
            d1 += class07211.T() * 16;
         }
      }

      double d5 = d0;
      double d2 = d1;
      double d3 = var1.y().method_31605() / 2.0;
      double d4 = var1.y().method_31607() + d3;
      return (var8x, var10x, var12x) -> N(var8x - 8.0 - d5, var10x - d4, var12x - 8.0 - d2, 8.0, d3, 8.0);
   }

   public static class03002 N(@Nullable class03032 var0, Map<class00758, class03032> var1) {
      ArrayList arraylist = Lists.newArrayList();
      if (var0 != null) {
         arraylist.add(N(null, var0));
      }

      var1.forEach((var1x, var2x) -> arraylist.add(N(var1x, var2x)));
      return (var1x, var3, var5) -> {
         double d0 = Double.POSITIVE_INFINITY;
         Iterator iterator = arraylist.iterator();

         while (iterator.hasNext()) {
            double d1 = ((class03002)iterator.next()).getDistance(var1x, var3, var5);
            if (d1 < d0) {
               d0 = d1;
            }
         }

         return d0;
      };
   }

   public static void N_37(class05974 var0, class07361 var1) {
      if (!class07529.NI) {
         class07321 class07321 = var1.R();
         Builder builder = ImmutableMap.builder();

         for (class00758 class00758 : class00758.values()) {
            int ix = class07321.B + class00758.y();
            int j = class07321.Z + class00758.L();
            class03032 class03032 = var0.method_8392(ix, j).v();
            if (class03032 != null) {
               builder.put(class00758, class03032);
            }
         }

         ImmutableMap immutablemap = builder.build();
         if (var1.j() || !immutablemap.isEmpty()) {
            class03002 class03002 = N(var1.v(), immutablemap);
            class03292 class03292 = (var1x, var2x, var3x) -> {
               double d0 = var1x + 0.5 + y.N(var1x, var2x, var3x) * 4.0;
               double d1 = var2x + 0.5 + y.N(var2x, var3x, var1x) * 4.0;
               double d2 = var3x + 0.5 + y.N(var3x, var1x, var2x) * 4.0;
               return class03002.getDistance(d0, d1, d2) < 4.0;
            };
            var1.g().N(class03292);
         }
      }
   }

   private static void N(class08050 var0, class07209 var1) {
      if (var0.method_8320(var1).N(class01210.H)) {
         var0.u(var1);
      }

      if (!var0.method_8316(var1).W()) {
         var0.u(var1);
      }
   }

   public static void N(class01607 var0, class08050 var1) {
      if (!class07529.NI) {
         class07321 class07321 = var1.R();
         boolean flag = var1.j();
         class07218 class07218 = new class07218();
         class07209 class07209 = new class07209(class07321.i(), 0, class07321.R());
         class03032 class03032 = var1.v();
         if (class03032 != null) {
            int ix = class03032.y().method_31607();
            int j = class03032.y().method_31600();
            if (flag) {
               for (int k = 0; k < 16; k++) {
                  for (int l = 0; l < 16; l++) {
                     N(var1, class07218.N(class07209, k, ix - 1, l));
                     N(var1, class07218.N(class07209, k, ix, l));
                     N(var1, class07218.N(class07209, k, j, l));
                     N(var1, class07218.N(class07209, k, j + 1, l));
                  }
               }
            }

            for (class07211 class07211 : class07221.field_11062) {
               if (var0.method_8392(class07321.B + class07211.P(), class07321.Z + class07211.T()).j() != flag) {
                  int i1 = class07211 == class07211.field_11034 ? 15 : 0;
                  int j1 = class07211 == class07211.field_11039 ? 0 : 15;
                  int k1 = class07211 == class07211.field_11035 ? 15 : 0;
                  int l1 = class07211 == class07211.field_11043 ? 0 : 15;

                  for (int i2 = i1; i2 <= j1; i2++) {
                     for (int j2 = k1; j2 <= l1; j2++) {
                        int k2 = Math.min(j, var1.N(class07830.field_13197, i2, j2)) + 1;

                        for (int l2 = ix; l2 < k2; l2++) {
                           N(var1, class07218.N(class07209, i2, l2, j2));
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Nullable
   private class03556<class00780> N(int var1, int var2, int var3) {
      MutableDouble mutabledouble = new MutableDouble(Double.POSITIVE_INFINITY);
      MutableObject mutableobject = new MutableObject();
      this.B.forEach((var5x, var7) -> var7.N(class01146.u(class07321.N(var5x)), var2, class01146.u(class07321.y(var5x)), (var4xx, var5xx, var6x) -> {
         double d0x = class04995.M(var1 - var4xx, var3 - var5xx);
         if (!(d0x > L)) {
            if (d0x < mutabledouble.doubleValue()) {
               mutableobject.setValue(var6x);
               mutabledouble.setValue(d0x);
            }
         }
      }));
      if (mutabledouble.doubleValue() == Double.POSITIVE_INFINITY) {
         return null;
      } else {
         double d0 = y.N(var1, 0.0, var3) * 12.0;
         return class04995.N((mutabledouble.doubleValue() + d0) / (L + 1), 0.0, 1.0) > 0.5 ? null : (class03556)mutableobject.get();
      }
   }
}
