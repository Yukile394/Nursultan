package minecraft;

import io.netty.buffer.ByteBuf;

class class02369 implements class02362<ByteBuf, Long> {
   class02369() {
      super();
   }

   public Long decode(ByteBuf var1) {
      return class01674.N(var1);
   }

   public void encode(ByteBuf var1, Long var2) {
      class01674.N(var1, var2);
   }
}
