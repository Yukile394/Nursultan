package minecraft;

import io.netty.buffer.ByteBuf;
import org.joml.Quaternionfc;

class class02378 implements class02362<ByteBuf, Quaternionfc> {
   class02378() {
      super();
   }

   public Quaternionfc decode(ByteBuf var1) {
      return class00667.R(var1);
   }

   public void encode(ByteBuf var1, Quaternionfc var2) {
      class00667.N(var1, var2);
   }
}
