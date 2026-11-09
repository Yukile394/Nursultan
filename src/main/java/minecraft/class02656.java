package minecraft;

import java.util.List;
import java.util.function.Predicate;

public record class02656<T, P extends Predicate<T>>(P test) implements class02638<T, P> {
   public class02656(P test) {
      this.test = (P)test;
   }

   public P y() {
      return this.test;
   }

   public boolean test(Iterable<T> var1) {
      for (Object object : var1) {
         if (this.test.test((T)object)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public List<P> N() {
      return List.of(this.test);
   }
}
