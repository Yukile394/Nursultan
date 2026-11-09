package minecraft;

import io.netty.buffer.ByteBuf;

class class02394 implements class02362<ByteBuf, Short> {
   class02394() {
      super();
   }

   public Short decode(ByteBuf var1) {
      return var1.readShort();
   }

   public void encode(ByteBuf var1, Short var2) {
      var1.writeShort(var2);
   }
}
