package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00777(boolean hasPrecipitation, float temperature, class00785 temperatureModifier, float downfall) {
   public static final MapCodec<class00777> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.BOOL.fieldOf("has_precipitation").forGetter(var0x -> var0x.hasPrecipitation),
            Codec.FLOAT.fieldOf("temperature").forGetter(var0x -> var0x.temperature),
            class00785.field_26409.optionalFieldOf("temperature_modifier", class00785.field_26407).forGetter(var0x -> var0x.temperatureModifier),
            Codec.FLOAT.fieldOf("downfall").forGetter(var0x -> var0x.downfall)
         )
         .apply(var0, class00777::new)
   );

   public class00785 L() {
      return this.temperatureModifier;
   }

   public class00777(boolean hasPrecipitation, float temperature, class00785 temperatureModifier, float downfall) {
      super();
      this.hasPrecipitation = hasPrecipitation;
      this.temperature = temperature;
      this.temperatureModifier = temperatureModifier;
      this.downfall = downfall;
   }

   public float u() {
      return this.downfall;
   }

   public float y() {
      return this.temperature;
   }

   public boolean N() {
      return this.hasPrecipitation;
   }
}
