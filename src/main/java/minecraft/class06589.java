package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class06589(Optional<class03556<class04891>> start, Optional<class03556<class04891>> mid, Optional<class03556<class04891>> end) {
   public static final Codec<class06589> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04891.y.optionalFieldOf("start").forGetter(class06589::N),
            class04891.y.optionalFieldOf("mid").forGetter(class06589::y),
            class04891.y.optionalFieldOf("end").forGetter(class06589::L)
         )
         .apply(var0, class06589::new)
   );

   public Optional<class03556<class04891>> L() {
      return this.end;
   }

   public class06589(Optional<class03556<class04891>> start, Optional<class03556<class04891>> mid, Optional<class03556<class04891>> end) {
      this.start = start;
      this.mid = mid;
      this.end = end;
   }

   public Optional<class03556<class04891>> y() {
      return this.mid;
   }

   public Optional<class03556<class04891>> N() {
      return this.start;
   }
}
