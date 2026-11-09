package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.UUID;

class class01516 implements class02362<ByteBuf, UUID> {
   class01516() {
      super();
   }

   public UUID decode(ByteBuf var1) {
      return class00667.B(var1);
   }

   public void encode(ByteBuf var1, UUID var2) {
      class00667.N(var1, var2);
   }
}
