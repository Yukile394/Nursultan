package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00931(class07126 particle, float scaling, float speed) {
   public static final MapCodec<class00931> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07107.yE.fieldOf("particle").forGetter(class00931::N),
            Codec.FLOAT.optionalFieldOf("scaling", 1.0F).forGetter(class00931::y),
            Codec.FLOAT.optionalFieldOf("speed", 1.0F).forGetter(class00931::L)
         )
         .apply(var0, class00931::new)
   );
   public static final class02362<class04247, class00931> y = class02362.N(
      class07107.yW, class00931::N, class02389.E, class00931::y, class02389.E, class00931::L, class00931::new
   );

   public float L() {
      return this.speed;
   }

   public class00931(class07126 particle, float scaling, float speed) {
      super();
      this.particle = particle;
      this.scaling = scaling;
      this.speed = speed;
   }

   public float y() {
      return this.scaling;
   }

   public class07126 N() {
      return this.particle;
   }
}
