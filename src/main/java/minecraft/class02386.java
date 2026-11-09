package minecraft;

import io.netty.buffer.ByteBuf;

class class02386 implements class02362<ByteBuf, Integer> {
   class02386() {
      super();
   }

   public Integer decode(ByteBuf var1) {
      return class02566.N(var1.readByte() & 0xFF, var1.readByte() & 0xFF, var1.readByte() & 0xFF);
   }

   public void encode(ByteBuf var1, Integer var2) {
      var1.writeByte(class02566.L(var2));
      var1.writeByte(class02566.u(var2));
      var1.writeByte(class02566.i(var2));
   }
}
