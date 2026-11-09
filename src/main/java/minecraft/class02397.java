package minecraft;

import io.netty.buffer.ByteBuf;

class class02397 implements class02362<ByteBuf, byte[]> {
   class02397() {
      super();
   }

   public byte[] decode(ByteBuf var1) {
      return class00667.N(var1);
   }

   public void encode(ByteBuf var1, byte[] var2) {
      class00667.N(var1, var2);
   }
}
