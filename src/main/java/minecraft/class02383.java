package minecraft;

import io.netty.buffer.ByteBuf;

class class02383 implements class02362<ByteBuf, Byte> {
   class02383() {
      super();
   }

   public Byte decode(ByteBuf var1) {
      return var1.readByte();
   }

   public void encode(ByteBuf var1, Byte var2) {
      var1.writeByte(var2);
   }
}
