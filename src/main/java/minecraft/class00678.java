package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class00678(class03556<class07084> effect, class06378 duration) {
   public static final Codec<class00678> N = RecordCodecBuilder.create(
      var0 -> var0.group(class07084.N.fieldOf("type").forGetter(class00678::N), class06339.N.fieldOf("duration").forGetter(class00678::y))
         .apply(var0, class00678::new)
   );

   class00678(class03556<class07084> effect, class06378 duration) {
      this.effect = effect;
      this.duration = duration;
   }

   public class06378 y() {
      return this.duration;
   }

   public class03556<class07084> N() {
      return this.effect;
   }
}
