package minecraft;

import io.netty.buffer.ByteBuf;

class class02360 implements class02362<ByteBuf, class02334> {
   class02360() {
      super();
   }

   public class02334 decode(ByteBuf var1) {
      return new class02334(class00667.L(var1), class00667.L(var1));
   }

   public void encode(ByteBuf var1, class02334 var2) {
      class00667.N(var1, var2.R());
      class00667.N(var1, var2.M());
   }
}
