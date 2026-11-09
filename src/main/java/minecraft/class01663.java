package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.nio.charset.StandardCharsets;

public class class01663 {
   public class01663() {
      super();
   }

   public static String N(ByteBuf var0, int var1) {
      int i = ByteBufUtil.utf8MaxBytes(var1);
      int j = class01657.N(var0);
      if (j > i) {
         throw new DecoderException("The received encoded string buffer length is longer than maximum allowed (" + j + " > " + i + ")");
      } else if (j < 0) {
         throw new DecoderException("The received encoded string buffer length is less than zero! Weird string!");
      } else {
         int k = var0.readableBytes();
         if (j > k) {
            throw new DecoderException("Not enough bytes in buffer, expected " + j + ", but got " + k);
         } else {
            String s = var0.toString(var0.readerIndex(), j, StandardCharsets.UTF_8);
            var0.readerIndex(var0.readerIndex() + j);
            if (s.length() > var1) {
               throw new DecoderException("The received string length is longer than maximum allowed (" + s.length() + " > " + var1 + ")");
            } else {
               return s;
            }
         }
      }
   }

   public static void N(ByteBuf var0, CharSequence var1, int var2) {
      if (var1.length() > var2) {
         throw new EncoderException("String too big (was " + var1.length() + " characters, max " + var2 + ")");
      } else {
         int i = ByteBufUtil.utf8MaxBytes(var1);
         ByteBuf bytebuf = var0.alloc().buffer(i);

         try {
            int j = ByteBufUtil.writeUtf8(bytebuf, var1);
            int k = ByteBufUtil.utf8MaxBytes(var2);
            if (j > k) {
               throw new EncoderException("String too big (was " + j + " bytes encoded, max " + k + ")");
            }

            class01657.N(var0, j);
            var0.writeBytes(bytebuf);
         } finally {
            bytebuf.release();
         }
      }
   }
}
