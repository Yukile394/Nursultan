package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01368(class03556<class04891> soundEvent, double tickChance) {
   public static final Codec<class01368> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04891.y.fieldOf("sound").forGetter(var0x -> var0x.soundEvent), Codec.DOUBLE.fieldOf("tick_chance").forGetter(var0x -> var0x.tickChance)
         )
         .apply(var0, class01368::new)
   );

   public class01368(class03556<class04891> soundEvent, double tickChance) {
      this.soundEvent = soundEvent;
      this.tickChance = tickChance;
   }

   public double y() {
      return this.tickChance;
   }

   public class03556<class04891> N() {
      return this.soundEvent;
   }
}
