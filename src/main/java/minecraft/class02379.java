package minecraft;

import io.netty.buffer.ByteBuf;

class class02379 implements class02362<ByteBuf, String> {
   class02379(int var1) {
      super();
      this.N = var1;
   }

   public String decode(ByteBuf var1) {
      return class01663.N(var1, this.N);
   }

   public void encode(ByteBuf var1, String var2) {
      class01663.N(var1, var2, this.N);
   }
}
