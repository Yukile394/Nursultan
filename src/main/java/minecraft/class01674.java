package minecraft;

import io.netty.buffer.ByteBuf;

public class class01674 {
   private static final int N = 10;
   private static final int y = 127;
   private static final int L = 128;
   private static final int u = 7;

   public class01674() {
      super();
   }

   public static ByteBuf N(ByteBuf var0, long var1) {
      while ((var1 & -128L) != 0L) {
         var0.writeByte((int)(var1 & 127L) | 128);
         var1 >>>= 7;
      }

      var0.writeByte((int)var1);
      return var0;
   }

   public static long N(ByteBuf var0) {
      long i = 0L;
      int j = 0;

      byte b0;
      do {
         b0 = var0.readByte();
         i |= (long)(b0 & 127) << j++ * 7;
         if (j > 10) {
            throw new RuntimeException("VarLong too big");
         }
      } while (N(b0));

      return i;
   }

   public static boolean N(byte var0) {
      return (var0 & 128) == 128;
   }

   public static int N(long var0) {
      for (int i = 1; i < 10; i++) {
         if ((var0 & -1L << i * 7) == 0L) {
            return i;
         }
      }

      return 10;
   }
}
