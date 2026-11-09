package minecraft;

import io.netty.buffer.ByteBuf;
import net.fabricmc.fabric.mixin.attachment.VarIntAccessor;

public class class01657 implements VarIntAccessor {
   public static final int N = 5;
   private static final int y = 127;
   private static final int L = 128;
   private static final int u = 7;

   public class01657() {
      super();
   }

   public static int N(ByteBuf var0) {
      int i = 0;
      int j = 0;

      byte b0;
      do {
         b0 = var0.readByte();
         i |= (b0 & 127) << j++ * 7;
         if (j > 5) {
            throw new RuntimeException("VarInt too big");
         }
      } while (N(b0));

      return i;
   }

   public static ByteBuf N(ByteBuf var0, int var1) {
      while ((var1 & -128) != 0) {
         var0.writeByte(var1 & 127 | 128);
         var1 >>>= 7;
      }

      var0.writeByte(var1);
      return var0;
   }

   public static boolean N(byte var0) {
      return (var0 & 128) == 128;
   }

   public static int N(int var0) {
      for (int i = 1; i < 5; i++) {
         if ((var0 & -1 << i * 7) == 0) {
            return i;
         }
      }

      return 5;
   }
}
