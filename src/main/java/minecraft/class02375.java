package minecraft;

import io.netty.buffer.ByteBuf;

class class02375 implements class02362<ByteBuf, Integer> {
   class02375() {
      super();
   }

   public Integer decode(ByteBuf var1) {
      return var1.readUnsignedShort();
   }

   public void encode(ByteBuf var1, Integer var2) {
      var1.writeShort(var2);
   }
}
