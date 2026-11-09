package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public record class02633<T, P extends Predicate<T>>(List<class02620<T, P>> entries) implements class02646<T, P> {
   public class02633(List<class02620<T, P>> entries) {
      super();
      this.entries = entries;
   }

   public List<class02620<T, P>> y() {
      return this.entries;
   }

   public boolean test(Iterable<T> var1) {
      Iterator iterator = this.entries.iterator();

      while (iterator.hasNext()) {
         if (!((class02620)iterator.next()).N(var1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public List<class02620<T, P>> N() {
      return this.entries;
   }
}
