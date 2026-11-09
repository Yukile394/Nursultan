package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class class04546 extends class04111<class04546> {
   private final Builder<class04129> N = ImmutableList.builder();

   public class04546(class04111<?>... var1) {
      super();

      for (class04111 class04111 : var1) {
         this.N.add(class04111.y());
      }
   }

   @Override
   public class04129 y() {
      return new class04559(this.N.build(), this.i());
   }

   protected class04546 L() {
      return this;
   }

   @Override
   public class04546 N(class04111<?> var1) {
      this.N.add(var1.y());
      return this;
   }
}
