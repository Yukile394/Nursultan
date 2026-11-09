package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public record class02641<T, P extends Predicate<T>>(List<P> tests) implements class02638<T, P> {
   public class02641(List<P> tests) {
      super();
      this.tests = tests;
   }

   public List<P> y() {
      return this.tests;
   }

   @Override
   public List<P> N() {
      return this.tests;
   }

   public boolean test(Iterable<T> var1) {
      ArrayList arraylist = new ArrayList<>(this.tests);

      for (Object object : var1) {
         arraylist.removeIf(var1x -> var1x.test(object));
         if (arraylist.isEmpty()) {
            return true;
         }
      }

      return false;
   }
}
