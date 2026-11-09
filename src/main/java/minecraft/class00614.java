package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00614(float brightness, float factor) {
   public static final Codec<class00614> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("brightness").forGetter(class00614::N),
            Codec.floatRange(0.0F, 1.0F).fieldOf("factor").forGetter(class00614::y)
         )
         .apply(var0, class00614::new)
   );

   public class00614(float brightness, float factor) {
      super();
      this.brightness = brightness;
      this.factor = factor;
   }

   public float y() {
      return this.factor;
   }

   public float N() {
      return this.brightness;
   }
}
