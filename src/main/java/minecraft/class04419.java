package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04419(class03556<class04748> structure, int weight) {
   public static final Codec<class04419> N = RecordCodecBuilder.create(
      var0 -> var0.group(class04748.u.fieldOf("structure").forGetter(class04419::N), class06338.b.fieldOf("weight").forGetter(class04419::y))
         .apply(var0, class04419::new)
   );

   public class04419(class03556<class04748> structure, int weight) {
      super();
      this.structure = structure;
      this.weight = weight;
   }

   public int y() {
      return this.weight;
   }

   public class03556<class04748> N() {
      return this.structure;
   }
}
