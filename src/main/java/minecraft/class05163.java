package minecraft;

import com.google.common.base.MoreObjects;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class class05163 {
   private static final Logger L = LogUtils.getLogger();
   public static final Codec<class05163> N = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> class07536.N(var0, 6).map(var0x -> new class05163(var0x[0], var0x[1], var0x[2], var0x[3], var0x[4], var0x[5])),
         var0 -> IntStream.of(var0.u, var0.i, var0.R, var0.M, var0.B, var0.Z)
      )
      .stable();
   public static final class02362<ByteBuf, class05163> y = class02362.N(
      class07209.field_48404,
      var0 -> new class07209(var0.u, var0.i, var0.R),
      class07209.field_48404,
      var0 -> new class07209(var0.M, var0.B, var0.Z),
      (var0, var1) -> new class05163(
         var0.method_10263(), var0.method_10264(), var0.method_10260(), var1.method_10263(), var1.method_10264(), var1.method_10260()
      )
   );
   private int u;
   private int i;
   private int R;
   private int M;
   private int B;
   private int Z;

   public class00753 L() {
      return new class00753(this.M - this.u, this.B - this.i, this.Z - this.R);
   }

   public class05163 L(int var1, int var2, int var3) {
      return new class05163(this.B() - var1, this.Z() - var2, this.z() - var3, this.U() + var1, this.E() + var2, this.W() + var3);
   }

   public class07209 M() {
      return new class07209(this.u + (this.M - this.u + 1) / 2, this.i + (this.B - this.i + 1) / 2, this.R + (this.Z - this.R + 1) / 2);
   }

   public class05163(int var1, int var2, int var3, int var4, int var5, int var6) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var3;
      this.M = var4;
      this.B = var5;
      this.Z = var6;
      if (var4 < var1 || var5 < var2 || var6 < var3) {
         class07536.y("Invalid bounding box data, inverted bounds for: " + this);
         this.u = Math.min(var1, var4);
         this.i = Math.min(var2, var5);
         this.R = Math.min(var3, var6);
         this.M = Math.max(var1, var4);
         this.B = Math.max(var2, var5);
         this.Z = Math.max(var3, var6);
      }
   }

   public class05163(class07209 var1) {
      this(var1.method_10263(), var1.method_10264(), var1.method_10260(), var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class05163 class05163)
            ? false
            : this.u == class05163.u
               && this.i == class05163.i
               && this.R == class05163.R
               && this.M == class05163.M
               && this.B == class05163.B
               && this.Z == class05163.Z;
      }
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("minX", this.u)
         .add("minY", this.i)
         .add("minZ", this.R)
         .add("maxX", this.M)
         .add("maxY", this.B)
         .add("maxZ", this.Z)
         .toString();
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.u, this.i, this.R, this.M, this.B, this.Z);
   }

   public int B() {
      return this.u;
   }

   public int Z() {
      return this.i;
   }

   public int i() {
      return this.B - this.i + 1;
   }

   public int U() {
      return this.M;
   }

   public int z() {
      return this.R;
   }

   public boolean u(int var1, int var2, int var3) {
      return var1 >= this.u && var1 <= this.M && var3 >= this.R && var3 <= this.Z && var2 >= this.i && var2 <= this.B;
   }

   public int u() {
      return this.M - this.u + 1;
   }

   public class05163 y(int var1, int var2, int var3) {
      return new class05163(this.u + var1, this.i + var2, this.R + var3, this.M + var1, this.B + var2, this.Z + var3);
   }

   @Deprecated
   public class05163 y(class05163 var1) {
      this.u = Math.min(this.u, var1.u);
      this.i = Math.min(this.i, var1.i);
      this.R = Math.min(this.R, var1.R);
      this.M = Math.max(this.M, var1.M);
      this.B = Math.max(this.B, var1.B);
      this.Z = Math.max(this.Z, var1.Z);
      return this;
   }

   public static Optional<class05163> y(Iterable<class05163> var0) {
      Iterator iterator = var0.iterator();
      if (!iterator.hasNext()) {
         return Optional.empty();
      } else {
         class05163 class05163x = (class05163)iterator.next();
         class05163 class05163x = new class05163(class05163x.u, class05163x.i, class05163x.R, class05163x.M, class05163x.B, class05163x.Z);
         iterator.forEachRemaining(class05163x::y);
         return Optional.of(class05163x);
      }
   }

   public boolean y(class00753 var1) {
      return this.u(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   public Stream<class07321> y() {
      int ix = class01296.N(this.B());
      int j = class01296.N(this.z());
      int k = class01296.N(this.U());
      int l = class01296.N(this.W());
      return class07321.N(new class07321(ix, j), new class07321(k, l));
   }

   public int E() {
      return this.B;
   }

   public boolean N(int var1, int var2, int var3, int var4) {
      return this.M >= var1 && this.u <= var3 && this.Z >= var2 && this.R <= var4;
   }

   public static class05163 N(class00753 var0, class00753 var1) {
      return new class05163(
         Math.min(var0.method_10263(), var1.method_10263()),
         Math.min(var0.method_10264(), var1.method_10264()),
         Math.min(var0.method_10260(), var1.method_10260()),
         Math.max(var0.method_10263(), var1.method_10263()),
         Math.max(var0.method_10264(), var1.method_10264()),
         Math.max(var0.method_10260(), var1.method_10260())
      );
   }

   public class05163 N(int var1) {
      return this.L(var1, var1, var1);
   }

   @Deprecated
   public class05163 N(class00753 var1) {
      return this.N(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   @Deprecated
   public class05163 N(int var1, int var2, int var3) {
      this.u += var1;
      this.i += var2;
      this.R += var3;
      this.M += var1;
      this.B += var2;
      this.Z += var3;
      return this;
   }

   @Deprecated
   public class05163 N(class07209 var1) {
      this.u = Math.min(this.u, var1.method_10263());
      this.i = Math.min(this.i, var1.method_10264());
      this.R = Math.min(this.R, var1.method_10260());
      this.M = Math.max(this.M, var1.method_10263());
      this.B = Math.max(this.B, var1.method_10264());
      this.Z = Math.max(this.Z, var1.method_10260());
      return this;
   }

   public static class05163 N(class05163 var0, class05163 var1) {
      return new class05163(
         Math.min(var0.u, var1.u),
         Math.min(var0.i, var1.i),
         Math.min(var0.R, var1.R),
         Math.max(var0.M, var1.M),
         Math.max(var0.B, var1.B),
         Math.max(var0.Z, var1.Z)
      );
   }

   public static Optional<class05163> N(Iterable<class07209> var0) {
      Iterator iterator = var0.iterator();
      if (!iterator.hasNext()) {
         return Optional.empty();
      } else {
         class05163 class05163 = new class05163((class07209)iterator.next());
         iterator.forEachRemaining(class05163::N);
         return Optional.of(class05163);
      }
   }

   public static class05163 N() {
      return new class05163(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
   }

   public void N(Consumer<class07209> var1) {
      class07218 class07218 = new class07218();
      var1.accept(class07218.N(this.M, this.B, this.Z));
      var1.accept(class07218.N(this.u, this.B, this.Z));
      var1.accept(class07218.N(this.M, this.i, this.Z));
      var1.accept(class07218.N(this.u, this.i, this.Z));
      var1.accept(class07218.N(this.M, this.B, this.R));
      var1.accept(class07218.N(this.u, this.B, this.R));
      var1.accept(class07218.N(this.M, this.i, this.R));
      var1.accept(class07218.N(this.u, this.i, this.R));
   }

   public static class05163 N(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class07211 var9) {
      switch (var9) {
         case field_11035:
         default:
            return new class05163(var0 + var3, var1 + var4, var2 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var8 - 1 + var5);
         case field_11043:
            return new class05163(var0 + var3, var1 + var4, var2 - var8 + 1 + var5, var0 + var6 - 1 + var3, var1 + var7 - 1 + var4, var2 + var5);
         case field_11039:
            return new class05163(var0 - var8 + 1 + var5, var1 + var4, var2 + var3, var0 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
         case field_11034:
            return new class05163(var0 + var5, var1 + var4, var2 + var3, var0 + var8 - 1 + var5, var1 + var7 - 1 + var4, var2 + var6 - 1 + var3);
      }
   }

   public boolean N(class05163 var1) {
      return this.M >= var1.u && this.u <= var1.M && this.Z >= var1.R && this.R <= var1.Z && this.B >= var1.i && this.i <= var1.B;
   }

   public int W() {
      return this.Z;
   }

   public int R() {
      return this.Z - this.R + 1;
   }
}
