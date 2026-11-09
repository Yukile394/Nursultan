package minecraft;

import com.mojang.serialization.Codec;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;

class class02371<T> implements class02362<class04247, T> {
   class02371(class02362 var1, Codec var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public T decode(class04247 var1) {
      class07709 class07709 = (class07709)this.N.decode(var1);
      class03519 class03519 = var1.J().N(class07713.N);
      return (T)this.y.parse(class03519, class07709).getOrThrow(var1x -> new DecoderException("Failed to decode: " + var1x + " " + class07709));
   }

   public void encode(class04247 var1, T var2) {
      class03519 class03519 = var1.J().N(class07713.N);
      class07709 class07709 = (class07709)this.y
         .encodeStart(class03519, var2)
         .getOrThrow(var1x -> new EncoderException("Failed to encode: " + var1x + " " + var2));
      this.N.encode(var1, class07709);
   }
}
