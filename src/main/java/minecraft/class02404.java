package minecraft;

import io.netty.buffer.ByteBuf;
import org.joml.Vector3fc;

class class02404 implements class02362<ByteBuf, Vector3fc> {
   class02404() {
      super();
   }

   public Vector3fc decode(ByteBuf var1) {
      return class00667.i(var1);
   }

   public void encode(ByteBuf var1, Vector3fc var2) {
      class00667.N(var1, var2);
   }
}
