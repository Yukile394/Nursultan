package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

public class class05496 extends class00471<class05496> {
   private final class03556<class00891> N;
   private final Builder<class08092<?>> y = ImmutableSet.builder();

   class05496(class00891 var1) {
      super();
      this.N = var1.s();
   }

   @Override
   public class08122 y() {
      return new class05501(this.R(), this.N, this.y.build());
   }

   public class05496 N(class08092<?> var1) {
      if (!this.N.N().E().u().contains(var1)) {
         throw new IllegalStateException("Property " + var1 + " is not present on block " + this.N);
      } else {
         this.y.add(var1);
         return this;
      }
   }

   protected class05496 L() {
      return this;
   }
}
