package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class03229(
   class03195 temperature, class03195 humidity, class03195 continentalness, class03195 erosion, class03195 depth, class03195 weirdness, long offset
) {
   public static final Codec<class03229> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03195.N.fieldOf("temperature").forGetter(var0x -> var0x.temperature),
            class03195.N.fieldOf("humidity").forGetter(var0x -> var0x.humidity),
            class03195.N.fieldOf("continentalness").forGetter(var0x -> var0x.continentalness),
            class03195.N.fieldOf("erosion").forGetter(var0x -> var0x.erosion),
            class03195.N.fieldOf("depth").forGetter(var0x -> var0x.depth),
            class03195.N.fieldOf("weirdness").forGetter(var0x -> var0x.weirdness),
            Codec.floatRange(0.0F, 1.0F).fieldOf("offset").xmap(class03216::N, class03216::N).forGetter(var0x -> var0x.offset)
         )
         .apply(var0, class03229::new)
   );

   public class03195 L() {
      return this.humidity;
   }

   public class03195 M() {
      return this.weirdness;
   }

   public class03229(
      class03195 temperature, class03195 humidity, class03195 continentalness, class03195 erosion, class03195 depth, class03195 weirdness, long offset
   ) {
      this.temperature = temperature;
      this.humidity = humidity;
      this.continentalness = continentalness;
      this.erosion = erosion;
      this.depth = depth;
      this.weirdness = weirdness;
      this.offset = offset;
   }

   public long B() {
      return this.offset;
   }

   public class03195 i() {
      return this.erosion;
   }

   public class03195 u() {
      return this.continentalness;
   }

   public class03195 y() {
      return this.temperature;
   }

   long N(class03231 var1) {
      return class04995.y(this.temperature.N(var1.y()))
         + class04995.y(this.humidity.N(var1.L()))
         + class04995.y(this.continentalness.N(var1.u()))
         + class04995.y(this.erosion.N(var1.i()))
         + class04995.y(this.depth.N(var1.R()))
         + class04995.y(this.weirdness.N(var1.M()))
         + class04995.y(this.offset);
   }

   protected List<class03195> N() {
      return ImmutableList.of(
         this.temperature, this.humidity, this.continentalness, this.erosion, this.depth, this.weirdness, new class03195(this.offset, this.offset)
      );
   }

   public class03195 R() {
      return this.depth;
   }
}
