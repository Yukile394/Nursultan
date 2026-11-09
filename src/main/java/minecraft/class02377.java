package minecraft;

import io.netty.buffer.ByteBuf;

class class02377 implements class02362<ByteBuf, Double> {
   class02377() {
      super();
   }

   public Double decode(ByteBuf var1) {
      return var1.readDouble();
   }

   public void encode(ByteBuf var1, Double var2) {
      var1.writeDouble(var2);
   }
}
