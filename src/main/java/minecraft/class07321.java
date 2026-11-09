package minecraft;

import Nursultan.class10736;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class class07321 {
   public static final Codec<class07321> N = Codec.INT_STREAM
      .comapFlatMap(var0 -> class07536.N(var0, 2).map(var0x -> new class07321(var0x[0], var0x[1])), var0 -> IntStream.of(var0.B, var0.Z))
      .stable();
   public static final class02362<ByteBuf, class07321> y = new class07291();
   private static final int z = 1056;
   public static final long L = u(1875066, 1875066);
   private static final int U = (32 + class02238.N.N(class00549.m).L().y() + 1) * 2;
   public static final int u = class01296.N(class07209.field_54979) - U;
   public static final class07321 i = new class07321(0, 0);
   private static final long E = 32L;
   private static final long W = 4294967295L;
   private static final int m = 5;
   public static final int R = 32;
   private static final int P = 31;
   public static final int M = 31;
   public final int B;
   public final int Z;
   private static final int s = 1664525;
   private static final int T = 1013904223;
   private static final int b = -559038737;

   public int L() {
      return this.N(8);
   }

   public static boolean L(int var0, int var1) {
      return class04995.N(var0, var1) <= u;
   }

   public class07209 L(int var1) {
      return new class07209(this.L(), var1, this.u());
   }

   public int L(long var1) {
      return this.M(N(var1), y(var1));
   }

   public int M() {
      return this.N(15);
   }

   private int M(int var1, int var2) {
      int ix = var1 - this.B;
      int j = var2 - this.Z;
      return ix * ix + j * j;
   }

   public class07321(int var1, int var2) {
      super();
      this.B = var1;
      this.Z = var2;
   }

   public class07321(long var1) {
      super();
      this.B = (int)var1;
      this.Z = (int)(var1 >> 32);
   }

   public class07321(class07209 var1) {
      super();
      this.B = class01296.N(var1.method_10263());
      this.Z = class01296.N(var1.method_10260());
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class07321 class07321) ? false : this.B == class07321.B && this.Z == class07321.Z;
      }
   }

   @Override
   public String toString() {
      return "[" + this.B + ", " + this.Z + "]";
   }

   @Override
   public int hashCode() {
      return i(this.B, this.Z);
   }

   public int B() {
      return this.y(15);
   }

   public int Z() {
      return this.B >> 5;
   }

   public static int i(int var0, int var1) {
      int ix = 1664525 * var0 + 1013904223;
      int j = 1664525 * (var1 ^ -559038737) + 1013904223;
      return ix ^ j;
   }

   public int i() {
      return class01296.L(this.B);
   }

   public int U() {
      return this.B & 31;
   }

   public int z() {
      return this.Z >> 5;
   }

   public static long u(int var0, int var1) {
      return var0 & 4294967295L | (var1 & 4294967295L) << 32;
   }

   public int u() {
      return this.y(8);
   }

   public long y() {
      return u(this.B, this.Z);
   }

   public int y(int var1) {
      return class01296.N(this.Z, var1);
   }

   public boolean y(class07209 var1) {
      return var1.method_10263() >= this.i() && var1.method_10260() >= this.R() && var1.method_10263() <= this.M() && var1.method_10260() <= this.B();
   }

   public int y(class07321 var1) {
      return this.M(var1.B, var1.Z);
   }

   public static class07321 y(int var0, int var1) {
      return new class07321((var0 << 5) + 31, (var1 << 5) + 31);
   }

   public static int y(long var0) {
      return (int)(var0 >>> 32 & 4294967295L);
   }

   public int E() {
      return this.Z & 31;
   }

   public static class07321 N(int var0, int var1) {
      return new class07321(var0 << 5, var1 << 5);
   }

   public static Stream<class07321> N(class07321 var0, class07321 var1) {
      int ix = Math.abs(var0.B - var1.B) + 1;
      int j = Math.abs(var0.Z - var1.Z) + 1;
      int k = var0.B < var1.B ? 1 : -1;
      int l = var0.Z < var1.Z ? 1 : -1;
      return StreamSupport.stream(new class10736(ix * j, 64, var0, var1, l, k), false);
   }

   public boolean N() {
      return L(this.B, this.Z);
   }

   public static Stream<class07321> N(class07321 var0, int var1) {
      return N(new class07321(var0.B - var1, var0.Z - var1), new class07321(var0.B + var1, var0.Z + var1));
   }

   public static int N(long var0) {
      return (int)(var0 & 4294967295L);
   }

   public class07209 N(int var1, int var2, int var3) {
      return new class07209(this.N(var1), var2, this.y(var3));
   }

   public int N(int var1) {
      return class01296.N(this.B, var1);
   }

   public int N(class07321 var1) {
      return this.R(var1.B, var1.Z);
   }

   public static long N(class07209 var0) {
      return u(class01296.N(var0.method_10263()), class01296.N(var0.method_10260()));
   }

   public class07209 W() {
      return new class07209(this.i(), 0, this.R());
   }

   public int R() {
      return class01296.L(this.Z);
   }

   public int R(int var1, int var2) {
      return class04995.N(var1, var2, this.B, this.Z);
   }
}
