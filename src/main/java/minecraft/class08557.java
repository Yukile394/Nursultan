package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;

public record class08557(float threshold, float base, float factor) {
   public static final Codec<class08557> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06338.n.fieldOf("threshold").forGetter(class08557::N),
            Codec.FLOAT.fieldOf("base").forGetter(class08557::y),
            Codec.FLOAT.fieldOf("factor").forGetter(class08557::L)
         )
         .apply(var0, class08557::new)
   );
   public static final class02362<ByteBuf, class08557> y = class02362.N(
      class02389.E, class08557::N, class02389.E, class08557::y, class02389.E, class08557::L, class08557::new
   );
   public static final class08557 L = new class08557(1.0F, 0.0F, 1.0F);

   public float L() {
      return this.factor;
   }

   public class08557(float threshold, float base, float factor) {
      this.threshold = threshold;
      this.base = base;
      this.factor = factor;
   }

   public float y() {
      return this.base;
   }

   public int N(float var1) {
      return var1 < this.threshold ? 0 : class04995.y(this.base + this.factor * var1);
   }

   public float N() {
      return this.threshold;
   }
}
