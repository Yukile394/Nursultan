package minecraft;

import io.netty.buffer.ByteBuf;

class class02364 implements class02362<ByteBuf, Integer> {
   class02364() {
      super();
   }

   public Integer decode(ByteBuf var1) {
      return class00667.z(var1);
   }

   public void encode(ByteBuf var1, Integer var2) {
      class00667.y(var1, var2);
   }
}
