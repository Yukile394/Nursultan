package minecraft;

import io.netty.buffer.ByteBuf;

class class02395 implements class02362<ByteBuf, Float> {
   class02395() {
      super();
   }

   public Float decode(ByteBuf var1) {
      return var1.readFloat();
   }

   public void encode(ByteBuf var1, Float var2) {
      var1.writeFloat(var2);
   }
}
