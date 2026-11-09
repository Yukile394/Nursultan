package minecraft;

import io.netty.buffer.ByteBuf;

class class02373 implements class02362<ByteBuf, Integer> {
   class02373() {
      super();
   }

   public Integer decode(ByteBuf var1) {
      return var1.readInt();
   }

   public void encode(ByteBuf var1, Integer var2) {
      var1.writeInt(var2);
   }
}
