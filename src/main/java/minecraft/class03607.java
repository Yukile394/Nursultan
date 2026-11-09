package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.Predicate;

public record class03607(Optional<class01975> condition, class08880 variant) {
   public static final Codec<class03607> N = RecordCodecBuilder.create(
      var0 -> var0.group(class01975.N.optionalFieldOf("when").forGetter(class03607::N), class08880.L.fieldOf("apply").forGetter(class03607::y))
         .apply(var0, class03607::new)
   );

   public class03607(Optional<class01975> condition, class08880 variant) {
      super();
      this.condition = condition;
      this.variant = variant;
   }

   public class08880 y() {
      return this.variant;
   }

   public Optional<class01975> N() {
      return this.condition;
   }

   public <O, S extends class00522<O, S>> Predicate<S> N(class00507<O, S> var1) {
      return this.condition.<Predicate<S>>map(var1x -> var1x.N(var1)).orElse(var0 -> true);
   }
}
