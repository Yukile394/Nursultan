package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.EncoderException;

class class02382 implements class02362<ByteBuf, byte[]> {
   class02382(int var1) {
      super();
      this.N = var1;
   }

   public byte[] decode(ByteBuf var1) {
      return class00667.N(var1, this.N);
   }

   public void encode(ByteBuf var1, byte[] var2) {
      if (var2.length > this.N) {
         throw new EncoderException("ByteArray with size " + var2.length + " is bigger than allowed " + this.N);
      } else {
         class00667.N(var1, var2);
      }
   }
}
