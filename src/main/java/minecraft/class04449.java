package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04449(class03556<class04891> soundEvent, float useDuration, float range, class00392 description) {
   public static final Codec<class04449> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04891.y.fieldOf("sound_event").forGetter(class04449::N),
            class06338.t.fieldOf("use_duration").forGetter(class04449::y),
            class06338.t.fieldOf("range").forGetter(class04449::L),
            class03748.N.fieldOf("description").forGetter(class04449::u)
         )
         .apply(var0, class04449::new)
   );
   public static final class02362<class04247, class04449> y = class02362.N(
      class04891.u, class04449::N, class02389.E, class04449::y, class02389.E, class04449::L, class03748.y, class04449::u, class04449::new
   );
   public static final Codec<class03556<class04449>> L = class01281.N(class04227.yZ, N);
   public static final class02362<class04247, class03556<class04449>> u = class02389.N(class04227.yZ, y);

   public float L() {
      return this.range;
   }

   public class04449(class03556<class04891> soundEvent, float useDuration, float range, class00392 description) {
      this.soundEvent = soundEvent;
      this.useDuration = useDuration;
      this.range = range;
      this.description = description;
   }

   public class00392 u() {
      return this.description;
   }

   public float y() {
      return this.useDuration;
   }

   public class03556<class04891> N() {
      return this.soundEvent;
   }
}
