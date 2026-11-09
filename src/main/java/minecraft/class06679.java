package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class06679(String owner, String objective, class00488 score) {
   public static final Codec<class06679> u = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.fieldOf("Name").forGetter(class06679::N),
            Codec.STRING.fieldOf("Objective").forGetter(class06679::y),
            class00488.i.forGetter(class06679::L)
         )
         .apply(var0, class06679::new)
   );

   public class00488 L() {
      return this.score;
   }

   public class06679(String owner, String objective, class00488 score) {
      this.owner = owner;
      this.objective = objective;
      this.score = score;
   }

   public String y() {
      return this.objective;
   }

   public String N() {
      return this.owner;
   }
}
