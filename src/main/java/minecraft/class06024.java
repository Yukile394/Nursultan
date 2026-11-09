package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class06024(class07126 particle, float probability) {
   public static final Codec<class06024> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class07107.yE.fieldOf("particle").forGetter(var0x -> var0x.particle),
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.probability)
         )
         .apply(var0, class06024::new)
   );

   public class06024(class07126 particle, float probability) {
      this.particle = particle;
      this.probability = probability;
   }

   public float y() {
      return this.probability;
   }

   public class07126 N() {
      return this.particle;
   }

   public static List<class06024> N(class07126 var0, float var1) {
      return List.of(new class06024(var0, var1));
   }

   public boolean N(class06069 var1) {
      return var1.z() <= this.probability;
   }
}
