package minecraft;

import java.util.List;
import java.util.function.Predicate;

public record class02664<T, P extends Predicate<T>>(class02620<T, P> entry) implements class02646<T, P> {
   public class02664(class02620<T, P> entry) {
      super();
      this.entry = entry;
   }

   public class02620<T, P> y() {
      return this.entry;
   }

   public boolean test(Iterable<T> var1) {
      return this.entry.N(var1);
   }

   @Override
   public List<class02620<T, P>> N() {
      return List.of(this.entry);
   }
}
