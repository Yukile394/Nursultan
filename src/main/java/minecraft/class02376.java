package minecraft;

import io.netty.buffer.ByteBuf;

class class02376 implements class02362<ByteBuf, Boolean> {
   class02376() {
      super();
   }

   public Boolean decode(ByteBuf var1) {
      return var1.readBoolean();
   }

   public void encode(ByteBuf var1, Boolean var2) {
      var1.writeBoolean(var2);
   }
}
