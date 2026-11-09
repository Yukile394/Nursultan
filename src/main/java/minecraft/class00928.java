package minecraft;

import io.netty.buffer.ByteBuf;

public class class00928 {
   private static final int L = 15;
   private static final int u = 32767;
   private static final double i = 32766.0;
   private static final int R = 2;
   private static final int M = 3;
   private static final int B = 4;
   private static final int Z = 3;
   private static final int z = 18;
   private static final int U = 33;
   public static final double N = 1.7179869183E10;
   public static final double y = 3.051944088384301E-5;

   public class00928() {
      super();
   }

   private static long y(double var0) {
      return Math.round((var0 * 0.5 + 0.5) * 32766.0);
   }

   private static double N(long var0) {
      return Math.min((double)(var0 & 32767L), 32766.0) * 2.0 / 32766.0 - 1.0;
   }

   private static double N(double var0) {
      return Double.isNaN(var0) ? 0.0 : Math.clamp(var0, -1.7179869183E10, 1.7179869183E10);
   }

   public static void N(ByteBuf var0, class06889 var1) {
      double d0 = N(var1.M);
      double d1 = N(var1.B);
      double d2 = N(var1.Z);
      double d3 = class04995.N(d0, class04995.N(d1, d2));
      if (d3 < 3.051944088384301E-5) {
         var0.writeByte(0);
      } else {
         long ix = class04995.u(d3);
         boolean flag = (ix & 3L) != ix;
         long j = flag ? ix & 3L | 4L : ix;
         long k = y(d0 / ix) << 3;
         long l = y(d1 / ix) << 18;
         long i1 = y(d2 / ix) << 33;
         long j1 = j | k | l | i1;
         var0.writeByte((byte)j1);
         var0.writeByte((byte)(j1 >> 8));
         var0.writeInt((int)(j1 >> 16));
         if (flag) {
            class01657.N(var0, (int)(ix >> 2));
         }
      }
   }

   public static class06889 N(ByteBuf var0) {
      short short1 = var0.readUnsignedByte();
      if (short1 == 0) {
         return class06889.L;
      } else {
         short short2 = var0.readUnsignedByte();
         long ix = var0.readUnsignedInt() << 16 | short2 << 8 | short1;
         long j = short1 & 3;
         if (N((int)short1)) {
            j |= (class01657.N(var0) & 4294967295L) << 2;
         }

         return new class06889(N(ix >> 3) * j, N(ix >> 18) * j, N(ix >> 33) * j);
      }
   }

   public static boolean N(int var0) {
      return (var0 & 4) == 4;
   }
}
