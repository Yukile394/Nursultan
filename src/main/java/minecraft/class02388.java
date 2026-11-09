package minecraft;

import io.netty.buffer.ByteBuf;

class class02388 implements class02362<ByteBuf, Integer> {
   class02388() {
      super();
   }

   public Integer decode(ByteBuf var1) {
      return class01657.N(var1);
   }

   public void encode(ByteBuf var1, Integer var2) {
      class01657.N(var1, var2);
   }
}
