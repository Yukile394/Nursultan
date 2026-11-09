package minecraft;

import java.util.function.Predicate;
import java.util.stream.Stream;

public record class06815(class06838 slots, Predicate<class06584> filter) implements class06838 {
   public class06815(class06838 slots, Predicate<class06584> filter) {
      this.slots = slots;
      this.filter = filter;
   }

   public Predicate<class06584> y() {
      return this.filter;
   }

   @Override
   public class06838 N_65(Predicate<class06584> var1) {
      return new class06815(this.slots, this.filter.and(var1));
   }

   public class06838 N() {
      return this.slots;
   }

   @Override
   public Stream<class06584> itemCopies() {
      return this.slots.itemCopies().filter(this.filter);
   }
}
