package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.function.Supplier;

class class02367 implements class02362<ByteBuf, class07709> {
   class02367(Supplier var1) {
      super();
      this.N = var1;
   }

   public class07709 decode(ByteBuf var1) {
      class07709 class07709 = class00667.N(var1, (class07726)this.N.get());
      if (class07709 == null) {
         throw new DecoderException("Expected non-null compound tag");
      } else {
         return class07709;
      }
   }

   public void encode(ByteBuf var1, class07709 var2) {
      if (var2 == class06997.y) {
         throw new EncoderException("Expected non-null compound tag");
      } else {
         class00667.N(var1, var2);
      }
   }
}
