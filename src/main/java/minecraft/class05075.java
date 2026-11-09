package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class05075(class03556<class04891> sound, int minDelay, int maxDelay, boolean replaceCurrentMusic) {
   public static final Codec<class05075> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04891.y.fieldOf("sound").forGetter(class05075::N),
            class06338.T.fieldOf("min_delay").forGetter(class05075::y),
            class06338.T.fieldOf("max_delay").forGetter(class05075::L),
            Codec.BOOL.optionalFieldOf("replace_current_music", false).forGetter(class05075::u)
         )
         .apply(var0, class05075::new)
   );

   public int L() {
      return this.maxDelay;
   }

   public class05075(class03556<class04891> sound, int minDelay, int maxDelay, boolean replaceCurrentMusic) {
      super();
      this.sound = sound;
      this.minDelay = minDelay;
      this.maxDelay = maxDelay;
      this.replaceCurrentMusic = replaceCurrentMusic;
   }

   public boolean u() {
      return this.replaceCurrentMusic;
   }

   public int y() {
      return this.minDelay;
   }

   public class03556<class04891> N() {
      return this.sound;
   }
}
