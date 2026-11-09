package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.Predicate;

public record class00845(Optional<class03543<class06581>> items, class00836 count, class00142 components) implements Predicate<class06584> {
   public static final Codec<class00845> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03541.N(class04227.F).optionalFieldOf("items").forGetter(class00845::N),
            class00836.u.optionalFieldOf("count", class00836.L).forGetter(class00845::y),
            class00142.y.forGetter(class00845::L)
         )
         .apply(var0, class00845::new)
   );

   public class00142 L() {
      return this.components;
   }

   public class00845(Optional<class03543<class06581>> items, class00836 count, class00142 components) {
      super();
      this.items = items;
      this.count = count;
      this.components = components;
   }

   public class00836 y() {
      return this.count;
   }

   public Optional<class03543<class06581>> N() {
      return this.items;
   }

   public boolean test(class06584 var1) {
      if (this.items.isPresent() && !var1.N(this.items.get())) {
         return false;
      } else {
         return !this.count.u(var1.c()) ? false : this.components.test((class02666)var1);
      }
   }
}
