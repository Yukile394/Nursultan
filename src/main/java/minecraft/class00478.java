package minecraft;

import java.util.Map.Entry;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

class class00478 implements Function<Entry<class08092<?>, Comparable<?>>, String> {
   class00478() {
      super();
   }

   public String apply(@Nullable Entry<class08092<?>, Comparable<?>> var1) {
      if (var1 == null) {
         return "<NULL>";
      } else {
         class08092 class08092 = (class08092)var1.getKey();
         return class08092.R() + "=" + this.N(class08092, (Comparable<?>)var1.getValue());
      }
   }

   private <T extends Comparable<T>> String N(class08092<T> var1, Comparable<?> var2) {
      return var1.y((T)var2);
   }
}
