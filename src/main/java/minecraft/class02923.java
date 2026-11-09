package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02923(Optional<class03543<class03252>> material, Optional<class03543<class03246>> pattern) implements class02465<class03254> {
   public static final Codec<class02923> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03541.N(class04227.yw).optionalFieldOf("material").forGetter(class02923::N),
            class03541.N(class04227.yk).optionalFieldOf("pattern").forGetter(class02923::L)
         )
         .apply(var0, class02923::new)
   );

   public Optional<class03543<class03246>> L() {
      return this.pattern;
   }

   public class02923(Optional<class03543<class03252>> material, Optional<class03543<class03246>> pattern) {
      super();
      this.material = material;
      this.pattern = pattern;
   }

   @Override
   public class02477<class03254> y() {
      return class02484.Nu;
   }

   public boolean N(class03254 var1) {
      return this.material.isPresent() && !this.material.get().N(var1.N()) ? false : !this.pattern.isPresent() || this.pattern.get().N(var1.y());
   }

   public Optional<class03543<class03252>> N() {
      return this.material;
   }
}
