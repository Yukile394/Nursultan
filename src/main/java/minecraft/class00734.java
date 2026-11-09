package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class class00734 {
   private static final double B = 1.0E-7;
   public final double N;
   public final double y;
   public final double L;
   public final double u;
   public final double i;
   public final double R;

   public class00734 L(class06889 var1) {
      return this.u(var1.M, var1.B, var1.Z);
   }

   public double L() {
      return this.i - this.y;
   }

   public boolean L(class00734 var1) {
      return this.N(var1.N, var1.y, var1.L, var1.u, var1.i, var1.R);
   }

   public class00734 L(double var1, double var3, double var5) {
      double d0 = this.N - var1;
      double d1 = this.y - var3;
      double d2 = this.L - var5;
      double d3 = this.u + var1;
      double d4 = this.i + var3;
      double d5 = this.R + var5;
      return new class00734(d0, d1, d2, d3, d4, d5);
   }

   public class00734 L(double var1) {
      return new class00734(this.N, this.y, var1, this.u, this.i, this.R);
   }

   public class00734 M(double var1) {
      return this.L(var1, var1, var1);
   }

   public class06889 M() {
      return new class06889(class04995.u(0.5, this.N, this.u), this.y, class04995.u(0.5, this.L, this.R));
   }

   public class00734(class07209 var1) {
      this(var1.method_10263(), var1.method_10264(), var1.method_10260(), var1.method_10263() + 1, var1.method_10264() + 1, var1.method_10260() + 1);
   }

   public class00734(class06889 var1, class06889 var2) {
      this(var1.M, var1.B, var1.Z, var2.M, var2.B, var2.Z);
   }

   public class00734(double var1, double var3, double var5, double var7, double var9, double var11) {
      super();
      this.N = Math.min(var1, var7);
      this.y = Math.min(var3, var9);
      this.L = Math.min(var5, var11);
      this.u = Math.max(var1, var7);
      this.i = Math.max(var3, var9);
      this.R = Math.max(var5, var11);
   }

   static {
      assert class07185.field_11048.ordinal() == 0;

      assert class07185.field_11052.ordinal() == 1;

      assert class07185.field_11051.ordinal() == 2;

      assert class07185.values().length == 3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof class00734 class00734)) {
         return false;
      } else if (Double.compare(class00734.N, this.N) != 0) {
         return false;
      } else if (Double.compare(class00734.y, this.y) != 0) {
         return false;
      } else if (Double.compare(class00734.L, this.L) != 0) {
         return false;
      } else if (Double.compare(class00734.u, this.u) != 0) {
         return false;
      } else {
         return Double.compare(class00734.i, this.i) != 0 ? false : Double.compare(class00734.R, this.R) == 0;
      }
   }

   @Override
   public String toString() {
      return "AABB[" + this.N + ", " + this.y + ", " + this.L + "] -> [" + this.u + ", " + this.i + ", " + this.R + "]";
   }

   @Override
   public int hashCode() {
      long ix = Double.doubleToLongBits(this.N);
      int j = (int)(ix ^ ix >>> 32);
      ix = Double.doubleToLongBits(this.y);
      j = 31 * j + (int)(ix ^ ix >>> 32);
      ix = Double.doubleToLongBits(this.L);
      j = 31 * j + (int)(ix ^ ix >>> 32);
      ix = Double.doubleToLongBits(this.u);
      j = 31 * j + (int)(ix ^ ix >>> 32);
      ix = Double.doubleToLongBits(this.i);
      j = 31 * j + (int)(ix ^ ix >>> 32);
      ix = Double.doubleToLongBits(this.R);
      return 31 * j + (int)(ix ^ ix >>> 32);
   }

   public class06889 B() {
      return new class06889(this.N, this.y, this.L);
   }

   public class00734 B(double var1) {
      return this.M(-var1);
   }

   public class06889 Z() {
      return new class06889(this.u, this.i, this.R);
   }

   public double i(class06889 var1) {
      double d0 = Math.max(Math.max(this.N - var1.M, var1.M - this.u), 0.0);
      double d1 = Math.max(Math.max(this.y - var1.B, var1.B - this.i), 0.0);
      double d2 = Math.max(Math.max(this.L - var1.Z, var1.Z - this.R), 0.0);
      return class04995.R(d0, d1, d2);
   }

   public boolean i(double var1, double var3, double var5) {
      return var1 >= this.N && var1 < this.u && var3 >= this.y && var3 < this.i && var5 >= this.L && var5 < this.R;
   }

   public boolean i() {
      return Double.isNaN(this.N) || Double.isNaN(this.y) || Double.isNaN(this.L) || Double.isNaN(this.u) || Double.isNaN(this.i) || Double.isNaN(this.R);
   }

   public class00734 i(double var1) {
      return new class00734(this.N, this.y, this.L, this.u, var1, this.R);
   }

   public boolean u(class06889 var1) {
      return this.i(var1.M, var1.B, var1.Z);
   }

   public double u(class00734 var1) {
      double d0 = Math.max(Math.max(this.N - var1.u, var1.N - this.u), 0.0);
      double d1 = Math.max(Math.max(this.y - var1.i, var1.y - this.i), 0.0);
      double d2 = Math.max(Math.max(this.L - var1.R, var1.L - this.R), 0.0);
      return class04995.R(d0, d1, d2);
   }

   public class00734 u(double var1) {
      return new class00734(this.N, this.y, this.L, var1, this.i, this.R);
   }

   public double u() {
      return this.R - this.L;
   }

   public class00734 u(double var1, double var3, double var5) {
      return new class00734(this.N + var1, this.y + var3, this.L + var5, this.u + var1, this.i + var3, this.R + var5);
   }

   public boolean y(class07209 var1) {
      return this.N(var1.method_10263(), var1.method_10264(), var1.method_10260(), var1.method_10263() + 1, var1.method_10264() + 1, var1.method_10260() + 1);
   }

   public Optional<class06889> y(class06889 var1, class06889 var2) {
      return N(this.N, this.y, this.L, this.u, this.i, this.R, var1, var2);
   }

   public double y() {
      return this.u - this.N;
   }

   public class00734 y(class06889 var1) {
      return this.y(var1.M, var1.B, var1.Z);
   }

   public class00734 y(double var1, double var3, double var5) {
      double d0 = this.N;
      double d1 = this.y;
      double d2 = this.L;
      double d3 = this.u;
      double d4 = this.i;
      double d5 = this.R;
      if (var1 < 0.0) {
         d0 += var1;
      } else if (var1 > 0.0) {
         d3 += var1;
      }

      if (var3 < 0.0) {
         d1 += var3;
      } else if (var3 > 0.0) {
         d4 += var3;
      }

      if (var5 < 0.0) {
         d2 += var5;
      } else if (var5 > 0.0) {
         d5 += var5;
      }

      return new class00734(d0, d1, d2, d3, d4, d5);
   }

   public class00734 y(double var1) {
      return new class00734(this.N, var1, this.L, this.u, this.i, this.R);
   }

   public class00734 y(class00734 var1) {
      double d0 = Math.min(this.N, var1.N);
      double d1 = Math.min(this.y, var1.y);
      double d2 = Math.min(this.L, var1.L);
      double d3 = Math.max(this.u, var1.u);
      double d4 = Math.max(this.i, var1.i);
      double d5 = Math.max(this.R, var1.R);
      return new class00734(d0, d1, d2, d3, d4, d5);
   }

   public double y(class07185 var1) {
      switch (var1) {
         case field_11048:
            return this.u;
         case field_11052:
            return this.i;
         case field_11051:
            return this.R;
         default:
            throw new IllegalArgumentException();
      }
   }

   @Nullable
   private static class07211 N(
      double[] var0,
      @Nullable class07211 var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      class07211 var18,
      double var19,
      double var21,
      double var23
   ) {
      double d0 = (var8 - var19) / var2;
      double d1 = var21 + d0 * var4;
      double d2 = var23 + d0 * var6;
      if (0.0 < d0 && d0 < var0[0] && var10 - 1.0E-7 < d1 && d1 < var12 + 1.0E-7 && var14 - 1.0E-7 < d2 && d2 < var16 + 1.0E-7) {
         var0[0] = d0;
         return var18;
      } else {
         return var1;
      }
   }

   @Nullable
   private static class07211 N(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      class06889 var12,
      double[] var13,
      @Nullable class07211 var14,
      double var15,
      double var17,
      double var19
   ) {
      if (var15 > 1.0E-7) {
         var14 = N(var13, var14, var15, var17, var19, var0, var2, var8, var4, var10, class07211.field_11039, var12.M, var12.B, var12.Z);
      } else if (var15 < -1.0E-7) {
         var14 = N(var13, var14, var15, var17, var19, var6, var2, var8, var4, var10, class07211.field_11034, var12.M, var12.B, var12.Z);
      }

      if (var17 > 1.0E-7) {
         var14 = N(var13, var14, var17, var19, var15, var2, var4, var10, var0, var6, class07211.field_11033, var12.B, var12.Z, var12.M);
      } else if (var17 < -1.0E-7) {
         var14 = N(var13, var14, var17, var19, var15, var8, var4, var10, var0, var6, class07211.field_11036, var12.B, var12.Z, var12.M);
      }

      if (var19 > 1.0E-7) {
         var14 = N(var13, var14, var19, var15, var17, var4, var0, var6, var2, var8, class07211.field_11043, var12.Z, var12.M, var12.B);
      } else if (var19 < -1.0E-7) {
         var14 = N(var13, var14, var19, var15, var17, var10, var0, var6, var2, var8, class07211.field_11035, var12.Z, var12.M, var12.B);
      }

      return var14;
   }

   @Nullable
   private static class07211 N(class00734 var0, class06889 var1, double[] var2, @Nullable class07211 var3, double var4, double var6, double var8) {
      return N(var0.N, var0.y, var0.L, var0.u, var0.i, var0.R, var1, var2, var3, var4, var6, var8);
   }

   public double N(class07185 var1) {
      switch (var1) {
         case field_11048:
            return this.N;
         case field_11052:
            return this.y;
         case field_11051:
            return this.L;
         default:
            throw new IllegalArgumentException();
      }
   }

   public static class00734 N(class06889 var0, double var1, double var3, double var5) {
      return new class00734(var0.M - var1 / 2.0, var0.B - var3 / 2.0, var0.Z - var5 / 2.0, var0.M + var1 / 2.0, var0.B + var3 / 2.0, var0.Z + var5 / 2.0);
   }

   public static class00734 N(class05163 var0) {
      return new class00734(var0.B(), var0.Z(), var0.z(), var0.U() + 1, var0.E() + 1, var0.W() + 1);
   }

   public boolean N(class06889 var1, List<class00734> var2) {
      class06889 class06889x = this.R();
      class06889 class06889x = class06889x.i(var1);
      Iterator iterator = var2.iterator();

      while (iterator.hasNext()) {
         class00734 class00734 = ((class00734)iterator.next()).L(this.y() * 0.5 - 1.0E-7, this.L() * 0.5 - 1.0E-7, this.u() * 0.5 - 1.0E-7);
         if (class00734.u(class06889x) || class00734.u(class06889x)) {
            return true;
         }

         if (class00734.y(class06889x, class06889x).isPresent()) {
            return true;
         }
      }

      return false;
   }

   public class00734 N(double var1) {
      return new class00734(var1, this.y, this.L, this.u, this.i, this.R);
   }

   public boolean N(double var1, double var3, double var5, double var7, double var9, double var11) {
      return this.N < var7 && this.u > var1 && this.y < var9 && this.i > var3 && this.L < var11 && this.R > var5;
   }

   public class00734 N(double var1, double var3, double var5) {
      double d0 = this.N;
      double d1 = this.y;
      double d2 = this.L;
      double d3 = this.u;
      double d4 = this.i;
      double d5 = this.R;
      if (var1 < 0.0) {
         d0 -= var1;
      } else if (var1 > 0.0) {
         d3 -= var1;
      }

      if (var3 < 0.0) {
         d1 -= var3;
      } else if (var3 > 0.0) {
         d4 -= var3;
      }

      if (var5 < 0.0) {
         d2 -= var5;
      } else if (var5 > 0.0) {
         d5 -= var5;
      }

      return new class00734(d0, d1, d2, d3, d4, d5);
   }

   public boolean N(class06889 var1, class06889 var2) {
      return this.N(
         Math.min(var1.M, var2.M),
         Math.min(var1.B, var2.B),
         Math.min(var1.Z, var2.Z),
         Math.max(var1.M, var2.M),
         Math.max(var1.B, var2.B),
         Math.max(var1.Z, var2.Z)
      );
   }

   public class00734 N(Vector3f var1) {
      return this.u(var1.x, var1.y, var1.z);
   }

   public class00734 N(class07209 var1) {
      return new class00734(
         this.N + var1.method_10263(),
         this.y + var1.method_10264(),
         this.L + var1.method_10260(),
         this.u + var1.method_10263(),
         this.i + var1.method_10264(),
         this.R + var1.method_10260()
      );
   }

   public class00734 N(class00734 var1) {
      double d0 = Math.max(this.N, var1.N);
      double d1 = Math.max(this.y, var1.y);
      double d2 = Math.max(this.L, var1.L);
      double d3 = Math.min(this.u, var1.u);
      double d4 = Math.min(this.i, var1.i);
      double d5 = Math.min(this.R, var1.R);
      return new class00734(d0, d1, d2, d3, d4, d5);
   }

   public static Optional<class06889> N(double var0, double var2, double var4, double var6, double var8, double var10, class06889 var12, class06889 var13) {
      double[] adouble = new double[]{1.0};
      double d0 = var13.M - var12.M;
      double d1 = var13.B - var12.B;
      double d2 = var13.Z - var12.Z;
      if (N(var0, var2, var4, var6, var8, var10, var12, adouble, null, d0, d1, d2) == null) {
         return Optional.empty();
      } else {
         double d3 = adouble[0];
         return Optional.of(var12.y(d3 * d0, d3 * d1, d3 * d2));
      }
   }

   @Nullable
   public static class06183 N(Iterable<class00734> var0, class06889 var1, class06889 var2, class07209 var3) {
      double[] adouble = new double[]{1.0};
      class07211 class07211 = null;
      double d0 = var2.M - var1.M;
      double d1 = var2.B - var1.B;
      double d2 = var2.Z - var1.Z;
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         class07211 = N(((class00734)iterator.next()).N(var3), var1, adouble, class07211, d0, d1, d2);
      }

      if (class07211 == null) {
         return null;
      } else {
         double d3 = adouble[0];
         return new class06183(var1.y(d3 * d0, d3 * d1, d3 * d2), class07211, var3, false);
      }
   }

   public static class00734 N(class06889 var0) {
      return new class00734(var0.M, var0.B, var0.Z, var0.M + 1.0, var0.B + 1.0, var0.Z + 1.0);
   }

   public double N() {
      double d0 = this.y();
      double d1 = this.L();
      double d2 = this.u();
      return (d0 + d1 + d2) / 3.0;
   }

   public static class00734 N(class07209 var0, class07209 var1) {
      return new class00734(
         Math.min(var0.method_10263(), var1.method_10263()),
         Math.min(var0.method_10264(), var1.method_10264()),
         Math.min(var0.method_10260(), var1.method_10260()),
         Math.max(var0.method_10263(), var1.method_10263()) + 1,
         Math.max(var0.method_10264(), var1.method_10264()) + 1,
         Math.max(var0.method_10260(), var1.method_10260()) + 1
      );
   }

   public class00734 R(double var1) {
      return new class00734(this.N, this.y, this.L, this.u, this.i, var1);
   }

   public class06889 R() {
      return new class06889(class04995.u(0.5, this.N, this.u), class04995.u(0.5, this.y, this.i), class04995.u(0.5, this.L, this.R));
   }

   public class00734 R(double var1, double var3, double var5) {
      return this.L(-var1, -var3, -var5);
   }
}
