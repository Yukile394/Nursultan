package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02679(class03556<class07084> effect, int duration) {
   public static final Codec<class02679> N = RecordCodecBuilder.create(
      var0 -> var0.group(class07084.N.fieldOf("id").forGetter(class02679::y), Codec.INT.lenientOptionalFieldOf("duration", 160).forGetter(class02679::L))
         .apply(var0, class02679::new)
   );
   public static final class02362<class04247, class02679> y = class02362.N(class07084.y, class02679::y, class02389.B, class02679::L, class02679::new);

   public int L() {
      return this.duration;
   }

   public class02679(class03556<class07084> effect, int duration) {
      this.effect = effect;
      this.duration = duration;
   }

   public class03556<class07084> y() {
      return this.effect;
   }

   public class07055 N() {
      return new class07055(this.effect, this.duration);
   }
}
