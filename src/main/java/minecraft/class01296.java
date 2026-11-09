package minecraft;

import Nursultan.class09460;
import io.netty.buffer.ByteBuf;
import it.unimi.dsi.fastutil.longs.LongConsumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class class01296 extends class00753 {
   public static final int N = 4;
   public static final int y = 16;
   public static final int L = 15;
   public static final int u = 8;
   public static final int i = 15;
   private static final int M = 22;
   private static final int B = 20;
   private static final int Z = 22;
   private static final long z = 4194303L;
   private static final long U = 1048575L;
   private static final long E = 4194303L;
   private static final int W = 0;
   private static final int m = 20;
   private static final int P = 42;
   private static final int s = 8;
   private static final int T = 0;
   private static final int b = 4;
   public static final class02362<ByteBuf, class01296> R = class02389.z.N_10(class01296::N, class01296::W);

   public static int L(int var0) {
      return var0 << 4;
   }

   public static int L(long var0) {
      return (int)(var0 << 44 >> 44);
   }

   public static int L(short var0) {
      return var0 >>> 4 & 15;
   }

   public int L() {
      return this.method_10260();
   }

   public static long L(class07209 var0) {
      return y(N(var0.method_10263()), N(var0.method_10264()), N(var0.method_10260()));
   }

   public class01296 method_34592(int var1, int var2, int var3) {
      return var1 == 0 && var2 == 0 && var3 == 0 ? this : new class01296(this.N() + var1, this.y() + var2, this.L() + var3);
   }

   public class07209 M(short var1) {
      return new class07209(this.u(var1), this.i(var1), this.R(var1));
   }

   public static long M(long var0) {
      return class07321.u(y(var0), u(var0));
   }

   public int M() {
      return N(this.N(), 15);
   }

   public class01296(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public int B() {
      return N(this.y(), 15);
   }

   public int Z() {
      return N(this.L(), 15);
   }

   public int i() {
      return L(this.y());
   }

   public static long i(long var0) {
      return y(N(class07209.method_10061(var0)), N(class07209.method_10071(var0)), N(class07209.method_10083(var0)));
   }

   public int i(short var1) {
      return this.i() + y(var1);
   }

   public Stream<class07209> m() {
      return class07209.method_17962(this.u(), this.i(), this.R(), this.M(), this.B(), this.Z());
   }

   public class07209 U() {
      byte b0 = 8;
      return this.z().method_10069(8, 8, 8);
   }

   public class07209 z() {
      return new class07209(L(this.N()), L(this.y()), L(this.L()));
   }

   public static int u(long var0) {
      return (int)(var0 << 22 >> 42);
   }

   public int u() {
      return L(this.N());
   }

   public int u(short var1) {
      return this.u() + N(var1);
   }

   public int y() {
      return this.method_10264();
   }

   public static long y(int var0, int var1) {
      return R(y(var0, 0, var1));
   }

   public static long y(int var0, int var1, int var2) {
      long ix = 0L;
      ix |= (var0 & 4194303L) << 42;
      ix |= (var1 & 1048575L) << 0;
      return ix | (var2 & 4194303L) << 20;
   }

   public static int y(short var0) {
      return var0 >>> 0 & 15;
   }

   public static short y(class07209 var0) {
      int ix = y(var0.method_10263());
      int j = y(var0.method_10264());
      int k = y(var0.method_10260());
      return (short)(ix << 8 | k << 4 | j << 0);
   }

   public static int y(int var0) {
      return var0 & 15;
   }

   public static int y(double var0) {
      return class04995.N(var0) >> 4;
   }

   public static int y(long var0) {
      return (int)(var0 << 0 >> 42);
   }

   public class07321 E() {
      return new class07321(this.N(), this.L());
   }

   public static Stream<class01296> N(class01296 var0, int var1) {
      int ix = var0.N();
      int j = var0.y();
      int k = var0.L();
      return N(ix - var1, j - var1, k - var1, ix + var1, j + var1, k + var1);
   }

   public static int N(int var0) {
      return var0 >> 4;
   }

   public static void N(class07209 var0, LongConsumer var1) {
      N(var0.method_10263(), var0.method_10264(), var0.method_10260(), var1);
   }

   public static class01296 N(int var0, int var1, int var2) {
      return new class01296(var0, var1, var2);
   }

   public static Stream<class01296> N(int var0, int var1, int var2, int var3, int var4, int var5) {
      return StreamSupport.stream(new class09460((var3 - var0 + 1) * (var4 - var1 + 1) * (var5 - var2 + 1), 64, var0, var1, var2, var3, var4, var5), false);
   }

   public static Stream<class01296> N(class07321 var0, int var1, int var2, int var3) {
      int ix = var0.B;
      int j = var0.Z;
      return N(ix - var1, var2, j - var1, ix + var1, var3, j + var1);
   }

   public static void N(long var0, LongConsumer var2) {
      N(class07209.method_10061(var0), class07209.method_10071(var0), class07209.method_10083(var0), var2);
   }

   public static void N(int var0, int var1, int var2, LongConsumer var3) {
      int ix = N(var0 - 1);
      int j = N(var0 + 1);
      int k = N(var1 - 1);
      int l = N(var1 + 1);
      int i1 = N(var2 - 1);
      int j1 = N(var2 + 1);
      if (ix == j && k == l && i1 == j1) {
         var3.accept(y(ix, k, i1));
      } else {
         for (int k1 = ix; k1 <= j; k1++) {
            for (int l1 = k; l1 <= l; l1++) {
               for (int i2 = i1; i2 <= j1; i2++) {
                  var3.accept(y(k1, l1, i2));
               }
            }
         }
      }
   }

   public static class01296 N(class07209 var0) {
      return new class01296(N(var0.method_10263()), N(var0.method_10264()), N(var0.method_10260()));
   }

   public static long N(long var0, class07211 var2) {
      return N(var0, var2.P(), var2.s(), var2.T());
   }

   public static int N(int var0, int var1) {
      return L(var0) + var1;
   }

   public static class01296 N(class08050 var0) {
      return N(var0.R(), var0.method_32891());
   }

   public int N() {
      return this.method_10263();
   }

   public static long N(long var0, int var2, int var3, int var4) {
      return y(y(var0) + var2, L(var0) + var3, u(var0) + var4);
   }

   public static int N(double var0) {
      return N(class04995.N(var0));
   }

   public static int N(short var0) {
      return var0 >>> 8 & 15;
   }

   public static class01296 N(class07321 var0, int var1) {
      return new class01296(var0.B, var1, var0.Z);
   }

   public static class01296 N(class01135 var0) {
      return N(var0.method_24515());
   }

   public static class01296 N(class00737 var0) {
      return new class01296(y(var0.N()), y(var0.y()), y(var0.L()));
   }

   public static class01296 N(long var0) {
      return new class01296(y(var0), L(var0), u(var0));
   }

   public long W() {
      return y(this.N(), this.y(), this.L());
   }

   public static long R(long var0) {
      return var0 & -1048576L;
   }

   public int R() {
      return L(this.L());
   }

   public int R(short var1) {
      return this.R() + L(var1);
   }
}
