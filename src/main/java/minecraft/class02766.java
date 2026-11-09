package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;

public record class02766(int value) {
   public static final Codec<class02766> N = RecordCodecBuilder.create(
      var0 -> var0.group(class06338.b.fieldOf("value").forGetter(class02766::N)).apply(var0, class02766::new)
   );
   public static final class02362<ByteBuf, class02766> y = class02362.N(class02389.B, class02766::N, class02766::new);

   public class02766(int value) {
      if (value <= 0) {
         throw new IllegalArgumentException("Enchantment value must be positive, but was " + value);
      } else {
         this.value = value;
      }
   }

   public int N() {
      return this.value;
   }
}
