package minecraft;

import com.google.common.base.MoreObjects;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import io.netty.buffer.ByteBuf;
import java.util.stream.IntStream;
import org.joml.Vector3i;

public class class00753 implements Comparable<class00753> {
   public static final Codec<class00753> field_25123 = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> class07536.N(var0, 3).map(var0x -> new class00753(var0x[0], var0x[1], var0x[2])),
         var0 -> IntStream.of(var0.method_10263(), var0.method_10264(), var0.method_10260())
      );
   public static final class02362<ByteBuf, class00753> field_56131 = class02362.N(
      class02389.B, class00753::method_10263, class02389.B, class00753::method_10264, class02389.B, class00753::method_10260, class00753::new
   );
   public static final class00753 field_11176 = new class00753(0, 0, 0);
   private int field_11175;
   private int field_11174;
   private int field_11173;

   public int method_10260() {
      return this.field_11173;
   }

   public int method_10263() {
      return this.field_11175;
   }

   public int method_10264() {
      return this.field_11174;
   }

   public class00753(int var1, int var2, int var3) {
      super();
      this.field_11175 = var1;
      this.field_11174 = var2;
      this.field_11173 = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class00753 class00753)
            ? false
            : this.method_10263() == class00753.method_10263()
               && this.method_10264() == class00753.method_10264()
               && this.method_10260() == class00753.method_10260();
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("x", this.method_10263()).add("y", this.method_10264()).add("z", this.method_10260()).toString();
   }

   @Override
   public int hashCode() {
      return (this.method_10264() + this.method_10260() * 31) * 31 + this.method_10263();
   }

   public int method_65076(class00753 var1) {
      int i = Math.abs(this.method_10263() - var1.method_10263());
      int j = Math.abs(this.method_10264() - var1.method_10264());
      int k = Math.abs(this.method_10260() - var1.method_10260());
      return Math.max(Math.max(i, j), k);
   }

   public class00753 method_35850(class07185 var1, int var2) {
      if (var2 == 0) {
         return this;
      } else {
         int i = var1 == class07185.field_11048 ? var2 : 0;
         int j = var1 == class07185.field_11052 ? var2 : 0;
         int k = var1 == class07185.field_11051 ? var2 : 0;
         return new class00753(this.method_10263() + i, this.method_10264() + j, this.method_10260() + k);
      }
   }

   public class00753 method_23227(int var1) {
      return this.method_23226(class07211.field_11033, var1);
   }

   protected class00753 method_20788(int var1) {
      this.field_11173 = var1;
      return this;
   }

   public class00753 method_35852(class00753 var1) {
      return this.method_34592(-var1.method_10263(), -var1.method_10264(), -var1.method_10260());
   }

   public class00753 method_35851(class07211 var1) {
      return this.method_23226(var1, 1);
   }

   public String method_23854() {
      return this.method_10263() + ", " + this.method_10264() + ", " + this.method_10260();
   }

   public class00753 method_35862(int var1) {
      if (var1 == 1) {
         return this;
      } else {
         return var1 == 0 ? field_11176 : new class00753(this.method_10263() * var1, this.method_10264() * var1, this.method_10260() * var1);
      }
   }

   public double method_10268(double var1, double var3, double var5) {
      double d0 = this.method_10263() + 0.5 - var1;
      double d1 = this.method_10264() + 0.5 - var3;
      double d2 = this.method_10260() + 0.5 - var5;
      return d0 * d0 + d1 * d1 + d2 * d2;
   }

   public class00753 method_35856(int var1) {
      return this.method_23226(class07211.field_11039, var1);
   }

   public double method_40081(double var1, double var3, double var5) {
      double d0 = this.method_10263() - var1;
      double d1 = this.method_10264() - var3;
      double d2 = this.method_10260() - var5;
      return d0 * d0 + d1 * d1 + d2 * d2;
   }

   public class00753 method_35859() {
      return this.method_35858(1);
   }

   public class00753 method_10259(class00753 var1) {
      return new class00753(
         this.method_10264() * var1.method_10260() - this.method_10260() * var1.method_10264(),
         this.method_10260() * var1.method_10263() - this.method_10263() * var1.method_10260(),
         this.method_10263() * var1.method_10264() - this.method_10264() * var1.method_10263()
      );
   }

   public class00753 method_23226(class07211 var1, int var2) {
      return var2 == 0
         ? this
         : new class00753(this.method_10263() + var1.P() * var2, this.method_10264() + var1.s() * var2, this.method_10260() + var1.T() * var2);
   }

   public class00753 method_34592(int var1, int var2, int var3) {
      return var1 == 0 && var2 == 0 && var3 == 0 ? this : new class00753(this.method_10263() + var1, this.method_10264() + var2, this.method_10260() + var3);
   }

   public class00753 method_35855() {
      return this.method_35854(1);
   }

   public class00753 method_35857() {
      return this.method_35856(1);
   }

   public class00753 method_35858(int var1) {
      return this.method_23226(class07211.field_11035, var1);
   }

   public class00753 method_35854(int var1) {
      return this.method_23226(class07211.field_11034, var1);
   }

   public class00753 method_30931() {
      return this.method_30930(1);
   }

   public class00753 method_23228() {
      return this.method_23227(1);
   }

   public class00753 method_35853(class00753 var1) {
      return this.method_34592(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   protected class00753 method_10099(int var1) {
      this.field_11174 = var1;
      return this;
   }

   public int method_19455(class00753 var1) {
      float f = Math.abs(var1.method_10263() - this.method_10263());
      float f1 = Math.abs(var1.method_10264() - this.method_10264());
      float f2 = Math.abs(var1.method_10260() - this.method_10260());
      return (int)(f + f1 + f2);
   }

   public int method_30558(class07185 var1) {
      return var1.N(this.field_11175, this.field_11174, this.field_11173);
   }

   public boolean method_19771(class00753 var1, double var2) {
      return this.method_10262(var1) < class04995.E(var2);
   }

   public class00753 method_35860(int var1) {
      return this.method_23226(class07211.field_11043, var1);
   }

   public static Codec<class00753> method_39677(int var0) {
      return field_25123.validate(
         var1 -> Math.abs(var1.method_10263()) < var0 && Math.abs(var1.method_10264()) < var0 && Math.abs(var1.method_10260()) < var0
            ? DataResult.success(var1)
            : DataResult.error(() -> "Position out of range, expected at most " + var0 + ": " + var1)
      );
   }

   public class00753 method_75504(int var1, int var2, int var3) {
      return new class00753(this.method_10263() * var1, this.method_10264() * var2, this.method_10260() * var3);
   }

   public Vector3i method_75505() {
      return new Vector3i(this.field_11175, this.field_11174, this.field_11173);
   }

   public class00753 method_35861() {
      return this.method_35860(1);
   }

   public class00753 method_30930(int var1) {
      return this.method_23226(class07211.field_11036, var1);
   }

   protected class00753 method_20787(int var1) {
      this.field_11175 = var1;
      return this;
   }

   public double method_10262(class00753 var1) {
      return this.method_40081(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   public boolean method_19769(class00737 var1, double var2) {
      return this.method_19770(var1) < class04995.E(var2);
   }

   public double method_19770(class00737 var1) {
      return this.method_10268(var1.N(), var1.y(), var1.L());
   }

   public int compareTo(class00753 var1) {
      if (this.method_10264() == var1.method_10264()) {
         return this.method_10260() == var1.method_10260() ? this.method_10263() - var1.method_10263() : this.method_10260() - var1.method_10260();
      } else {
         return this.method_10264() - var1.method_10264();
      }
   }
}
