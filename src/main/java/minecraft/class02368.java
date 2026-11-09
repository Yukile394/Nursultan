package minecraft;

import io.netty.buffer.ByteBuf;

class class02368 implements class02362<ByteBuf, Long> {
   class02368() {
      super();
   }

   public Long decode(ByteBuf var1) {
      return var1.readLong();
   }

   public void encode(ByteBuf var1, Long var2) {
      var1.writeLong(var2);
   }
}
