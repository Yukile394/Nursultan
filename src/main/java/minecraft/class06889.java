package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.EnumSet;
import java.util.List;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class class06889 implements class00737 {
   public static final Codec<class06889> N = Codec.DOUBLE
      .listOf()
      .comapFlatMap(
         var0 -> class07536.N(var0, 3).map(var0x -> new class06889((Double)var0x.get(0), (Double)var0x.get(1), (Double)var0x.get(2))),
         var0 -> List.of(var0.N(), var0.y(), var0.L())
      );
   public static final class02362<ByteBuf, class06889> y = new class06873();
   public static final class06889 L = new class06889(0.0, 0.0, 0.0);
   public static final class06889 u = new class06889(1.0, 0.0, 0.0);
   public static final class06889 i = new class06889(0.0, 1.0, 0.0);
   public static final class06889 R = new class06889(0.0, 0.0, 1.0);
   public final double M;
   public final double B;
   public final double Z;

   public class06889 L(double var1) {
      return this.u(var1, var1, var1);
   }

   public double L(double var1, double var3, double var5) {
      double d0 = var1 - this.M;
      double d1 = var3 - this.B;
      double d2 = var5 - this.Z;
      return d0 * d0 + d1 * d1 + d2 * d2;
   }

   public static class06889 L(class00753 var0) {
      return N(var0, 0.5, 0.0, 0.5);
   }

   public class06889 L(class06889 var1) {
      return new class06889(this.B * var1.Z - this.Z * var1.B, this.Z * var1.M - this.M * var1.Z, this.M * var1.B - this.B * var1.M);
   }

   @Override
   public final double L() {
      return this.Z;
   }

   public class06889 L(float var1) {
      float f = class04995.P(var1);
      float f1 = class04995.m(var1);
      double d0 = this.M * f + this.B * f1;
      double d1 = this.B * f - this.M * f1;
      double d2 = this.Z;
      return new class06889(d0, d1, d2);
   }

   public double M(class06889 var1) {
      double d0 = var1.M - this.M;
      double d1 = var1.B - this.B;
      double d2 = var1.Z - this.Z;
      return d0 * d0 + d1 * d1 + d2 * d2;
   }

   public double M() {
      return Math.sqrt(this.M * this.M + this.B * this.B + this.Z * this.Z);
   }

   public class06889(Vector3fc var1) {
      this(var1.x(), var1.y(), var1.z());
   }

   public class06889(double var1, double var3, double var5) {
      super();
      this.M = var1;
      this.B = var3;
      this.Z = var5;
   }

   public class06889(class00753 var1) {
      this(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof class06889 class06889)) {
         return false;
      } else if (Double.compare(class06889.M, this.M) != 0) {
         return false;
      } else {
         return Double.compare(class06889.B, this.B) != 0 ? false : Double.compare(class06889.Z, this.Z) == 0;
      }
   }

   @Override
   public String toString() {
      return "(" + this.M + ", " + this.B + ", " + this.Z + ")";
   }

   @Override
   public int hashCode() {
      long j = Double.doubleToLongBits(this.M);
      int ix = (int)(j ^ j >>> 32);
      j = Double.doubleToLongBits(this.B);
      ix = 31 * ix + (int)(j ^ j >>> 32);
      j = Double.doubleToLongBits(this.Z);
      return 31 * ix + (int)(j ^ j >>> 32);
   }

   public class06889 B(class06889 var1) {
      return this.u(var1.M, var1.B, var1.Z);
   }

   public double B() {
      return this.M * this.M + this.B * this.B + this.Z * this.Z;
   }

   public double Z() {
      return Math.sqrt(this.M * this.M + this.Z * this.Z);
   }

   public class06889 Z(class06889 var1) {
      return var1.B() == 0.0 ? var1 : var1.L(this.y(var1)).L(1.0 / var1.B());
   }

   public class06889 i() {
      return this.L(-1.0);
   }

   public class06889 i(class06889 var1) {
      return this.y(var1.M, var1.B, var1.Z);
   }

   public boolean m() {
      return Double.isFinite(this.M) && Double.isFinite(this.B) && Double.isFinite(this.Z);
   }

   public class06889 U() {
      return new class06889(-this.Z, this.B, this.M);
   }

   public double z() {
      return this.M * this.M + this.Z * this.Z;
   }

   public class06889 z(class06889 var1) {
      return N(this.E(), var1);
   }

   public class06889 u(class06889 var1) {
      return this.N(var1.M, var1.B, var1.Z);
   }

   public class06889 u(double var1, double var3, double var5) {
      return new class06889(this.M * var1, this.B * var3, this.Z * var5);
   }

   public class06889 u() {
      double d0 = Math.sqrt(this.M * this.M + this.B * this.B + this.Z * this.Z);
      return d0 < 1.0E-5F ? L : new class06889(this.M / d0, this.B / d0, this.Z / d0);
   }

   public class06889 y(double var1) {
      return this.y(var1, var1, var1);
   }

   public double y(class06889 var1) {
      return this.M * var1.M + this.B * var1.B + this.Z * var1.Z;
   }

   @Override
   public final double y() {
      return this.B;
   }

   public static class06889 y(class00753 var0) {
      return N(var0, 0.5, 0.5, 0.5);
   }

   public class06889 y(double var1, double var3, double var5) {
      return new class06889(this.M + var1, this.B + var3, this.Z + var5);
   }

   public class06889 y(float var1) {
      float f = class04995.P(var1);
      float f1 = class04995.m(var1);
      double d0 = this.M * f + this.Z * f1;
      double d1 = this.B;
      double d2 = this.Z * f - this.M * f1;
      return new class06889(d0, d1, d2);
   }

   public class06889 y(class06069 var1, float var2) {
      return this.y((var1.z() - 0.5F) * var2, 0.0, (var1.z() - 0.5F) * var2);
   }

   public class07109 E() {
      float f = (float)Math.atan2(-this.M, this.Z) * (180.0F / (float)Math.PI);
      float f1 = (float)Math.asin(-this.B / Math.sqrt(this.M * this.M + this.B * this.B + this.Z * this.Z)) * (180.0F / (float)Math.PI);
      return new class07109(f1, f);
   }

   public class06889 N(class07211 var1, double var2) {
      class00753 class00753 = var1.E();
      return new class06889(this.M + var2 * class00753.method_10263(), this.B + var2 * class00753.method_10264(), this.Z + var2 * class00753.method_10260());
   }

   public double N(class07185 var1) {
      return var1.N(this.M, this.B, this.Z);
   }

   @Override
   public final double N() {
      return this.M;
   }

   public class06889 N(class07185 var1, double var2) {
      double d0 = var1 == class07185.field_11048 ? var2 : this.M;
      double d1 = var1 == class07185.field_11052 ? var2 : this.B;
      double d2 = var1 == class07185.field_11051 ? var2 : this.Z;
      return new class06889(d0, d1, d2);
   }

   public class06889 N(double var1) {
      return this.N(var1, var1, var1);
   }

   public class06889 N(double var1, double var3, double var5) {
      return this.y(-var1, -var3, -var5);
   }

   public static class06889 N(class07109 var0, class06889 var1) {
      float f = class04995.P((var0.U + 90.0F) * (float) (Math.PI / 180.0));
      float f1 = class04995.m((var0.U + 90.0F) * (float) (Math.PI / 180.0));
      float f2 = class04995.P(-var0.z * (float) (Math.PI / 180.0));
      float f3 = class04995.m(-var0.z * (float) (Math.PI / 180.0));
      float f4 = class04995.P((-var0.z + 90.0F) * (float) (Math.PI / 180.0));
      float f5 = class04995.m((-var0.z + 90.0F) * (float) (Math.PI / 180.0));
      class06889 class06889xx = new class06889(f * f2, f3, f1 * f2);
      class06889 class06889x = new class06889(f * f4, f5, f1 * f4);
      class06889 class06889xx = class06889xx.L(class06889x).L(-1.0);
      double d0 = class06889xx.M * var1.Z + class06889x.M * var1.B + class06889xx.M * var1.M;
      double d1 = class06889xx.B * var1.Z + class06889x.B * var1.B + class06889xx.B * var1.M;
      double d2 = class06889xx.Z * var1.Z + class06889x.Z * var1.B + class06889xx.Z * var1.M;
      return new class06889(d0, d1, d2);
   }

   public static class06889 N(class00753 var0, double var1, double var3, double var5) {
      return new class06889(var0.method_10263() + var1, var0.method_10264() + var3, var0.method_10260() + var5);
   }

   public class06889 N(float var1) {
      float f = class04995.P(var1);
      float f1 = class04995.m(var1);
      double d0 = this.M;
      double d1 = this.B * f + this.Z * f1;
      double d2 = this.Z * f - this.B * f1;
      return new class06889(d0, d1, d2);
   }

   public class06889 N(class06889 var1, double var2) {
      return new class06889(class04995.u(var2, this.M, var1.M), class04995.u(var2, this.B, var1.B), class04995.u(var2, this.Z, var1.Z));
   }

   public boolean N(class06889 var1, double var2, double var4) {
      double d0 = var1.N() - this.M;
      double d1 = var1.y() - this.B;
      double d2 = var1.L() - this.Z;
      return class04995.i(d0, d2) < class04995.E(var2) && Math.abs(d1) < var4;
   }

   public class06889 N(class06889 var1) {
      return new class06889(var1.M - this.M, var1.B - this.B, var1.Z - this.Z);
   }

   public static class06889 N(class00753 var0, double var1) {
      return N(var0, 0.5, var1, 0.5);
   }

   public class06889 N(class06069 var1, float var2) {
      return this.y((var1.z() - 0.5F) * var2, (var1.z() - 0.5F) * var2, (var1.z() - 0.5F) * var2);
   }

   public static class06889 N(class00753 var0) {
      return new class06889(var0.method_10263(), var0.method_10264(), var0.method_10260());
   }

   public static class06889 N(class07109 var0) {
      return N(var0.z, var0.U);
   }

   public class06889 N(EnumSet<class07185> var1) {
      double d0 = var1.contains(class07185.field_11048) ? class04995.N(this.M) : this.M;
      double d1 = var1.contains(class07185.field_11052) ? class04995.N(this.B) : this.B;
      double d2 = var1.contains(class07185.field_11051) ? class04995.N(this.Z) : this.Z;
      return new class06889(d0, d1, d2);
   }

   public boolean N(class00737 var1, double var2) {
      return this.L(var1.N(), var1.y(), var1.L()) < var2 * var2;
   }

   public static class06889 N(float var0, float var1) {
      float f = class04995.P(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float f1 = class04995.m(-var1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float f2 = -class04995.P(-var0 * (float) (Math.PI / 180.0));
      float f3 = class04995.m(-var0 * (float) (Math.PI / 180.0));
      return new class06889(f1 * f2, f3, f * f2);
   }

   public Vector3f W() {
      return new Vector3f((float)this.M, (float)this.B, (float)this.Z);
   }

   public double R(class06889 var1) {
      double d0 = var1.M - this.M;
      double d1 = var1.B - this.B;
      double d2 = var1.Z - this.Z;
      return Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
   }

   public class06889 R() {
      return new class06889(this.M, 0.0, this.Z);
   }
}
