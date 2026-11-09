package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

public record class00142(class02471 exact, Map<class02487<?>, class02500> partial) implements Predicate<class02666> {
   public static final class00142 N = new class00142(class02471.L, Map.of());
   public static final MapCodec<class00142> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class02471.N.optionalFieldOf("components", class02471.L).forGetter(class00142::y),
            class02500.y.optionalFieldOf("predicates", Map.of()).forGetter(class00142::L)
         )
         .apply(var0, class00142::new)
   );
   public static final class02362<class04247, class00142> L = class02362.N(class02471.y, class00142::y, class02500.u, class00142::L, class00142::new);

   public Map<class02487<?>, class02500> L() {
      return this.partial;
   }

   public class00142(class02471 exact, Map<class02487<?>, class02500> partial) {
      super();
      this.exact = exact;
      this.partial = partial;
   }

   public class02471 y() {
      return this.exact;
   }

   public boolean test(class02666 var1) {
      if (!this.exact.test(var1)) {
         return false;
      } else {
         Iterator iterator = this.partial.values().iterator();

         while (iterator.hasNext()) {
            if (!((class02500)iterator.next()).N(var1)) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean N() {
      return this.exact.y() && this.partial.isEmpty();
   }
}
