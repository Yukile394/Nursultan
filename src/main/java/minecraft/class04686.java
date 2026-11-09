package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;

public class class04686 extends class00471<class04686> {
   private Optional<class05919> N = Optional.empty();
   private final Builder<class00392> y = ImmutableList.builder();
   private class02489 L = class02462.y;

   public class04686() {
      super();
   }

   @Override
   public class08122 y() {
      return new class04668(this.R(), this.y.build(), this.L, this.N);
   }

   public class04686 N(class00392 var1) {
      this.y.add(var1);
      return this;
   }

   protected class04686 L() {
      return this;
   }

   public class04686 N(class02489 var1) {
      this.L = var1;
      return this;
   }

   public class04686 N(class05919 var1) {
      this.N = Optional.of(var1);
      return this;
   }
}
