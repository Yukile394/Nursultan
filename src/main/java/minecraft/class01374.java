package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class01374(class03556<class04891> soundEvent, int tickDelay, int blockSearchExtent, double soundPositionOffset) {
   public static final Codec<class01374> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04891.y.fieldOf("sound").forGetter(var0x -> var0x.soundEvent),
            Codec.INT.fieldOf("tick_delay").forGetter(var0x -> var0x.tickDelay),
            Codec.INT.fieldOf("block_search_extent").forGetter(var0x -> var0x.blockSearchExtent),
            Codec.DOUBLE.fieldOf("offset").forGetter(var0x -> var0x.soundPositionOffset)
         )
         .apply(var0, class01374::new)
   );
   public static final class01374 y = new class01374(class04909.B, 6000, 8, 2.0);

   public int L() {
      return this.blockSearchExtent;
   }

   public class01374(class03556<class04891> soundEvent, int tickDelay, int blockSearchExtent, double soundPositionOffset) {
      super();
      this.soundEvent = soundEvent;
      this.tickDelay = tickDelay;
      this.blockSearchExtent = blockSearchExtent;
      this.soundPositionOffset = soundPositionOffset;
   }

   public double u() {
      return this.soundPositionOffset;
   }

   public int y() {
      return this.tickDelay;
   }

   public class03556<class04891> N() {
      return this.soundEvent;
   }
}
