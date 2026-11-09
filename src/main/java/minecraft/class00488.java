package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class00488(int value, boolean locked, Optional<class00392> display, Optional<class01762> numberFormat) {
   public static final MapCodec<class00488> i = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.INT.optionalFieldOf("Score", 0).forGetter(class00488::N),
            Codec.BOOL.optionalFieldOf("Locked", false).forGetter(class00488::y),
            class03748.N.optionalFieldOf("display").forGetter(class00488::L),
            class01787.y.optionalFieldOf("format").forGetter(class00488::u)
         )
         .apply(var0, class00488::new)
   );

   public Optional<class00392> L() {
      return this.display;
   }

   public class00488(int value, boolean locked, Optional<class00392> display, Optional<class01762> numberFormat) {
      this.value = value;
      this.locked = locked;
      this.display = display;
      this.numberFormat = numberFormat;
   }

   public Optional<class01762> u() {
      return this.numberFormat;
   }

   public boolean y() {
      return this.locked;
   }

   public int N() {
      return this.value;
   }
}
