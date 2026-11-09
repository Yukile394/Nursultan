package minecraft;

import com.google.common.collect.Iterables;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.Predicate;

public record class02648<T, P extends Predicate<T>>(Optional<class02638<T, P>> contains, Optional<class02646<T, P>> counts, Optional<class00836> size)
   implements Predicate<Iterable<T>> {
   public Optional<class00836> L() {
      return this.size;
   }

   public class02648(Optional<class02638<T, P>> contains, Optional<class02646<T, P>> counts, Optional<class00836> size) {
      this.contains = contains;
      this.counts = counts;
      this.size = size;
   }

   public Optional<class02646<T, P>> y() {
      return this.counts;
   }

   public boolean test(Iterable<T> var1) {
      if (this.contains.isPresent() && !this.contains.get().test(var1)) {
         return false;
      } else {
         return this.counts.isPresent() && !this.counts.get().test(var1) ? false : !this.size.isPresent() || this.size.get().u(Iterables.size(var1));
      }
   }

   public static <T, P extends Predicate<T>> Codec<class02648<T, P>> N(Codec<P> var0) {
      return RecordCodecBuilder.create(
         var1 -> var1.group(
               class02638.N(var0).optionalFieldOf("contains").forGetter(class02648::N),
               class02646.N(var0).optionalFieldOf("count").forGetter(class02648::y),
               class00836.u.optionalFieldOf("size").forGetter(class02648::L)
            )
            .apply(var1, class02648::new)
      );
   }

   public Optional<class02638<T, P>> N() {
      return this.contains;
   }
}
