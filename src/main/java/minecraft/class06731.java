package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class06731(Optional<class03556<class04891>> loop, Optional<class01374> mood, List<class01368> additions) {
   public static final class06731 N = new class06731(Optional.empty(), Optional.empty(), List.of());
   public static final class06731 y = new class06731(Optional.empty(), Optional.of(class01374.y), List.of());
   public static final Codec<class06731> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04891.y.optionalFieldOf("loop").forGetter(class06731::N),
            class01374.N.optionalFieldOf("mood").forGetter(class06731::y),
            class06338.N(class01368.N).optionalFieldOf("additions", List.of()).forGetter(class06731::L)
         )
         .apply(var0, class06731::new)
   );

   public List<class01368> L() {
      return this.additions;
   }

   public class06731(Optional<class03556<class04891>> loop, Optional<class01374> mood, List<class01368> additions) {
      super();
      this.loop = loop;
      this.mood = mood;
      this.additions = additions;
   }

   public Optional<class01374> y() {
      return this.mood;
   }

   public Optional<class03556<class04891>> N() {
      return this.loop;
   }
}
