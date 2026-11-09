package minecraft;

import java.util.function.Function;
import java.util.stream.Stream;

public record class06836(class06838 slots, Function<class06584, ? extends class06838> mapper) implements class06838 {
   public class06836(class06838 slots, Function<class06584, ? extends class06838> mapper) {
      super();
      this.slots = slots;
      this.mapper = mapper;
   }

   public Function<class06584, ? extends class06838> y() {
      return this.mapper;
   }

   public class06838 N() {
      return this.slots;
   }

   @Override
   public Stream<class06584> itemCopies() {
      return this.slots.itemCopies().map(this.mapper).flatMap(class06838::itemCopies);
   }
}
