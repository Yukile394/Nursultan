package minecraft;

import java.util.List;
import java.util.function.Function;

final class class00460 extends class00471<class00460> {
   private final Function<List<class05957>, class08122> N;

   public class00460(Function<List<class05957>, class08122> var1) {
      super();
      this.N = var1;
   }

   @Override
   public class08122 y() {
      return this.N.apply(this.R());
   }

   protected class00460 L() {
      return this;
   }
}
