package minecraft;

import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;

class class06557 implements class02362<class04247, class06584> {
   class06557() {
      super();
   }

   public class06584 decode(class04247 var1) {
      class06584 class06584 = class06584.B.decode(var1);
      if (class06584.R()) {
         throw new DecoderException("Empty ItemStack not allowed");
      } else {
         return class06584;
      }
   }

   public void encode(class04247 var1, class06584 var2) {
      if (var2.R()) {
         throw new EncoderException("Empty ItemStack not allowed");
      } else {
         class06584.B.encode(var1, var2);
      }
   }
}
