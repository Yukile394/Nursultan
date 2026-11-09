package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;

class class02385<B, V> implements class02362<B, V> {
   class02385(class02362 var1, Codec var2, DynamicOps var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public void encode(B var1, V var2) {
      Object object = this.y.encodeStart(this.L, var2).getOrThrow(var1x -> new EncoderException("Failed to encode: " + var1x + " " + var2));
      this.N.encode((B)var1, (V)object);
   }

   public V decode(B var1) {
      Object object = this.N.decode((B)var1);
      return (V)this.y.parse(this.L, object).getOrThrow(var1x -> new DecoderException("Failed to decode: " + var1x + " " + object));
   }
}
