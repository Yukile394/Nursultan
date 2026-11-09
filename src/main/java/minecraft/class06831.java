package minecraft;

import java.util.stream.Stream;

public record class06831(class06838 slots, int limit) implements class06838 {
   public class06831(class06838 slots, int limit) {
      super();
      this.slots = slots;
      this.limit = limit;
   }

   public int y() {
      return this.limit;
   }

   @Override
   public class06838 N(int var1) {
      return new class06831(this.slots, Math.min(this.limit, var1));
   }

   public class06838 N() {
      return this.slots;
   }

   @Override
   public Stream<class06584> itemCopies() {
      return this.slots.itemCopies().limit(this.limit);
   }
}
