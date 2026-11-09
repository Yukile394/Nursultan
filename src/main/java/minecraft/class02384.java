package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.function.BiFunction;

class class02384<B, V> implements class02362<B, V> {
   class02384(int var1, BiFunction var2, class02362 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public V decode(B var1) {
      int i = class01657.N(var1);
      if (i > this.N) {
         throw new DecoderException("Buffer size " + i + " is larger than allowed limit of " + this.N);
      } else {
         int j = var1.readerIndex();
         ByteBuf bytebuf = (ByteBuf)this.y.apply(var1, var1.slice(j, i));
         var1.readerIndex(j + i);
         return this.L.decode((B)bytebuf);
      }
   }

   public void encode(B var1, V var2) {
      ByteBuf bytebuf = (ByteBuf)this.y.apply(var1, var1.alloc().buffer());

      try {
         this.L.encode((B)bytebuf, (V)var2);
         int i = bytebuf.readableBytes();
         if (i > this.N) {
            throw new EncoderException("Buffer size " + i + " is  larger than allowed limit of " + this.N);
         }

         class01657.N(var1, i);
         var1.writeBytes(bytebuf);
      } finally {
         bytebuf.release();
      }
   }
}
