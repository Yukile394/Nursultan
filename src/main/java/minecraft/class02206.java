package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02206(class03556<class04891> soundEvent, class00392 description, float lengthInSeconds, int comparatorOutput) {
   public static final Codec<class02206> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04891.y.fieldOf("sound_event").forGetter(class02206::y),
            class03748.N.fieldOf("description").forGetter(class02206::L),
            class06338.t.fieldOf("length_in_seconds").forGetter(class02206::u),
            class06338.N(0, 15).fieldOf("comparator_output").forGetter(class02206::i)
         )
         .apply(var0, class02206::new)
   );
   public static final class02362<class04247, class02206> y = class02362.N(
      class04891.u, class02206::y, class03748.y, class02206::L, class02389.E, class02206::u, class02389.B, class02206::i, class02206::new
   );
   public static final Codec<class03556<class02206>> L = class03539.N(class04227.yz);
   public static final class02362<class04247, class03556<class02206>> u = class02389.N(class04227.yz, y);
   private static final int Z = 20;

   public class00392 L() {
      return this.description;
   }

   public class02206(class03556<class04891> soundEvent, class00392 description, float lengthInSeconds, int comparatorOutput) {
      this.soundEvent = soundEvent;
      this.description = description;
      this.lengthInSeconds = lengthInSeconds;
      this.comparatorOutput = comparatorOutput;
   }

   public int i() {
      return this.comparatorOutput;
   }

   public float u() {
      return this.lengthInSeconds;
   }

   public class03556<class04891> y() {
      return this.soundEvent;
   }

   public static Optional<class03556<class02206>> N(class01929 var0, class06584 var1) {
      class02232 class02232 = var1.method_58694(class02484.NE);
      return class02232 != null ? class02232.N().N(var0) : Optional.empty();
   }

   public int N() {
      return class04995.u(this.lengthInSeconds * 20.0F);
   }

   public boolean N(long var1) {
      return var1 >= this.N() + 20;
   }
}
