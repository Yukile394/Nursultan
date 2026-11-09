package minecraft;

import Nursultan.class10331;
import Nursultan.class10333;
import Nursultan.class10338;
import it.unimi.dsi.fastutil.doubles.DoubleArrays;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class03032 {
   private static final double R = 0.1;
   protected static final int N = 4;
   protected static final int y = 8;
   protected static final int L = 2;
   private static final double M = 1.0;
   private static final double B = -1.0;
   private static final int Z = 2;
   private static final int z = class01146.N(16);
   private static final int U = z - 1;
   private static final int E = z;
   private static final int W = 2 * U + 1;
   private static final int m = 2 * E + 1;
   static final int u = W + m;
   private final class05474 P;
   private static final List<class00891> s = List.of(
      class00869.E,
      class00869.X,
      class00869.Z,
      class00869.y,
      class00869.U,
      class00869.e,
      class00869.c,
      class00869.RC,
      class00869.ib,
      class00869.zj,
      class00869.z
   );
   protected static final double i = Double.MAX_VALUE;
   private boolean T;
   private final double[] b;
   private final List<List<class03556<class00780>>> j;
   private final transient double[][] v;

   private static int L(int var0) {
      if (var0 < W) {
         return u(var0 - U);
      } else {
         int ix = var0 - W;
         return E - u(ix - E);
      }
   }

   private int L() {
      return this.P.method_32890() * 2;
   }

   private class03032(int var1, int var2, Optional<double[]> var3) {
      super();
      this.b = var3.orElseGet(() -> class07536.N(new double[u], var0 -> Arrays.fill(var0, Double.MAX_VALUE)));
      this.v = new double[u][];
      ObjectArrayList objectarraylist = new ObjectArrayList(u);
      objectarraylist.size(u);
      this.j = objectarraylist;
      int ix = class01296.L(var1);
      int jx = class01296.L(var2) - ix;
      this.P = class05474.L(ix, jx);
   }

   private int i() {
      return this.R() + 1;
   }

   private static int u(int var0) {
      return var0 & ~(var0 >> 31);
   }

   private int u() {
      return class01146.u(this.P.method_32890());
   }

   private List<class03556<class00780>> y(class08050 var1, int var2, int var3) {
      ObjectArrayList objectarraylist = new ObjectArrayList(this.u());
      objectarraylist.size(this.u());

      for (int ix = 0; ix < objectarraylist.size(); ix++) {
         int jx = ix + class01146.N(this.P.method_31607());
         objectarraylist.set(ix, var1.method_16359(class01146.N(var2), jx, class01146.N(var3)));
      }

      return objectarraylist;
   }

   private static int y(int var0) {
      if (var0 < W) {
         return u(U - var0);
      } else {
         int ix = var0 - W;
         return E - u(E - ix);
      }
   }

   private static int y(int var0, int var1) {
      return W + var0 + E - var1;
   }

   protected double y(int var1, int var2, int var3) {
      if (var2 == this.R()) {
         return 0.1;
      } else if (var1 == E || var3 == E) {
         return this.N(this.v[y(var1, var3)], var2);
      } else {
         return var1 != 0 && var3 != 0 ? Double.MAX_VALUE : this.N(this.v[N(var1, var3)], var2);
      }
   }

   public class05474 y() {
      return this.P;
   }

   private static double y(class08050 var0, class07218 var1) {
      double d0 = 0.0;

      for (int ix = 0; ix < 7; ix++) {
         d0 += N(var0, var1);
      }

      return d0;
   }

   protected void N(int var1, int var2, int var3, class10331 var4) {
      if (var2 >= class01146.N(this.P.method_31607()) && var2 <= class01146.N(this.P.method_31600())) {
         int ix = var2 - class01146.N(this.P.method_31607());

         for (int jx = 0; jx < this.j.size(); jx++) {
            List<class03556<class00780>> list = this.j.get(jx);
            if (list != null) {
               class03556<class00780> class03556 = list.get(ix);
               if (class03556 != null) {
                  var4.consume(var1 + y(jx), var3 + L(jx), class03556);
               }
            }
         }
      }
   }

   private static int N(int var0, int var1) {
      return U - var0 + var1;
   }

   private int N(int var1) {
      return var1 - this.i();
   }

   public class04333 N() {
      boolean flag = false;
      double[] adouble = this.b;
      int ix = adouble.length;

      for (int jx = 0; jx < ix; jx++) {
         if (adouble[jx] != Double.MAX_VALUE) {
            flag = true;
            break;
         }
      }

      return new class04333(this.P.method_32891(), this.P.method_31597() + 1, flag ? Optional.of(DoubleArrays.copy(this.b)) : Optional.empty());
   }

   @Nullable
   public static class03032 N(@Nullable class04333 var0) {
      return var0 == null ? null : new class03032(var0.N(), var0.y(), var0.L());
   }

   private static double N(class08050 var0, class07218 var1) {
      return N(var0, (class07209)var1.N(class07211.field_11033)) ? 1.0 : -1.0;
   }

   private double[] N(class08050 var1, int var2, int var3, int var4) {
      double[] adouble = new double[this.L()];
      Arrays.fill(adouble, -1.0);
      class07218 class07218 = new class07218(var2, this.P.method_31600() + 1, var3);
      double d0 = y(var1, class07218);

      for (int ix = adouble.length - 2; ix >= 0; ix--) {
         double d1 = N(var1, class07218);
         double d2 = y(var1, class07218);
         adouble[ix] = (d0 + d1 + d2) / 15.0;
         d0 = d2;
      }

      int jx = this.N(class04995.y(var4, 8));
      if (jx >= 0 && jx < adouble.length - 1) {
         double d4 = (var4 + 0.5) % 8.0 / 8.0;
         double d5 = (1.0 - d4) / d4;
         double d3 = Math.max(d5, 1.0) * 0.25;
         adouble[jx + 1] = -d5 / d3;
         adouble[jx] = 1.0 / d3;
      }

      return adouble;
   }

   private static boolean N(class08050 var0, class07209 var1) {
      class00500 class00500 = var0.method_8320(var1);
      if (class00500.P()) {
         return false;
      } else if (class00500.N(class01210.H)) {
         return false;
      } else if (class00500.N(class01210.g)) {
         return false;
      } else {
         return class00500.N(class00869.Rw) || class00500.N(class00869.Rk) ? false : !class00500.M(var0, var1).method_1110();
      }
   }

   protected double N(int var1, int var2, int var3) {
      if (var1 == E || var3 == E) {
         return this.b[y(var1, var3)];
      } else {
         return var1 != 0 && var3 != 0 ? Double.MAX_VALUE : this.b[N(var1, var3)];
      }
   }

   private int N(class08050 var1, int var2, int var3) {
      int ix;
      if (var1.y(class07830.field_13194)) {
         ix = Math.min(var1.N(class07830.field_13194, var2, var3), this.P.method_31600());
      } else {
         ix = this.P.method_31600();
      }

      int jx = this.P.method_31607();
      class07218 class07218 = new class07218(var2, ix, var3);

      while (class07218.method_10264() > jx) {
         if (s.contains(var1.method_8320(class07218).i())) {
            return class07218.method_10264();
         }

         class07218.N(class07211.field_11033);
      }

      return jx;
   }

   private void N(int var1, class08050 var2, int var3, int var4) {
      if (this.b[var1] == Double.MAX_VALUE) {
         this.b[var1] = this.N(var2, var3, var4);
      }

      this.v[var1] = this.N(var2, var3, var4, class04995.N(this.b[var1]));
      this.j.set(var1, this.y(var2, var3, var4));
   }

   private void N(class08050 var1, Set<class00758> var2) {
      if (!this.T) {
         if (var2.contains(class00758.field_11069) || var2.contains(class00758.field_11072) || var2.contains(class00758.field_11076)) {
            this.N(N(0, 0), var1, 0, 0);
         }

         if (var2.contains(class00758.field_11069)) {
            for (int ix = 1; ix < z; ix++) {
               this.N(N(ix, 0), var1, 4 * ix, 0);
            }
         }

         if (var2.contains(class00758.field_11072)) {
            for (int jx = 1; jx < z; jx++) {
               this.N(N(0, jx), var1, 0, 4 * jx);
            }
         }

         if (var2.contains(class00758.field_11075)) {
            for (int k = 1; k < z; k++) {
               this.N(y(E, k), var1, 15, 4 * k);
            }
         }

         if (var2.contains(class00758.field_11073)) {
            for (int l = 0; l < z; l++) {
               this.N(y(l, E), var1, 4 * l, 15);
            }
         }

         if (var2.contains(class00758.field_11075) && var2.contains(class00758.field_11074)) {
            this.N(y(E, 0), var1, 15, 0);
         }

         if (var2.contains(class00758.field_11075) && var2.contains(class00758.field_11073) && var2.contains(class00758.field_11070)) {
            this.N(y(E, E), var1, 15, 15);
         }

         this.T = true;
      }
   }

   protected void N(int var1, int var2, int var3, int var4, class10333 var5) {
      int ix = this.i();
      int jx = Math.max(0, var3 - ix);
      int k = Math.min(this.L(), var4 - ix);

      for (int l = 0; l < this.v.length; l++) {
         double[] adouble = this.v[l];
         if (adouble != null) {
            int i1 = var1 + y(l);
            int j1 = var2 + L(l);

            for (int k1 = jx; k1 < k; k1++) {
               var5.consume(i1, k1 + ix, j1, adouble[k1] * 0.1);
            }
         }
      }
   }

   @Nullable
   public static class03032 N(class01607 var0, int var1, int var2) {
      class08050 class08050 = var0.method_8392(var1, var2);
      class03032 class03032 = class08050.v();
      if (class03032 != null && !class08050.W().u(class00549.R)) {
         class03032.N(class08050, N(var0, var1, var2, false));
         return class03032;
      } else {
         return null;
      }
   }

   protected void N(int var1, int var2, class10338 var3) {
      for (int ix = 0; ix < this.b.length; ix++) {
         double d0 = this.b[ix];
         if (d0 != Double.MAX_VALUE) {
            var3.consume(var1 + y(ix), var2 + L(ix), d0);
         }
      }
   }

   public static Set<class00758> N(class05974 var0, int var1, int var2, boolean var3) {
      EnumSet<class00758> enumset = EnumSet.noneOf(class00758.class);

      for (class00758 class00758 : class00758.values()) {
         int ix = var1 + class00758.y();
         int jx = var2 + class00758.L();
         if (var0.method_8392(ix, jx).j() == var3) {
            enumset.add(class00758);
         }
      }

      return enumset;
   }

   private double N(@Nullable double[] var1, int var2) {
      if (var1 == null) {
         return Double.MAX_VALUE;
      } else {
         int ix = this.N(var2);
         return ix >= 0 && ix < var1.length ? var1[ix] * 0.1 : Double.MAX_VALUE;
      }
   }

   private int R() {
      return this.P.method_32891() * 2;
   }
}
