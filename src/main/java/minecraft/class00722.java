package minecraft;

import io.netty.buffer.ByteBuf;

class class00722 implements class02362<ByteBuf, class00744> {
   class00722() {
      super();
   }

   public class00744 decode(ByteBuf var1) {
      return new class00744(var1.readFloat(), var1.readFloat(), var1.readFloat());
   }

   public void encode(ByteBuf var1, class00744 var2) {
      var1.writeFloat(var2.N());
      var1.writeFloat(var2.y());
      var1.writeFloat(var2.L());
   }
}
