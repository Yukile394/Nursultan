package minecraft;

import io.netty.buffer.ByteBuf;

class class02370 implements class02362<ByteBuf, long[]> {
   class02370() {
      super();
   }

   public long[] decode(ByteBuf var1) {
      return class00667.y(var1);
   }

   public void encode(ByteBuf var1, long[] var2) {
      class00667.N(var1, var2);
   }
}
