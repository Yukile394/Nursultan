package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;

public class class00789 {
   private final Builder<class03659<class03689>> N = ImmutableList.builder();
   private Optional<class00821> y = Optional.empty();
   private Optional<class00821> L = Optional.empty();
   private Optional<Boolean> u = Optional.empty();

   public class00789() {
      super();
   }

   public class00789 y(class00810 var1) {
      this.L = Optional.of(var1.y());
      return this;
   }

   public class00759 y() {
      return new class00759(this.N.build(), this.y, this.L, this.u);
   }

   public class00789 N(class00810 var1) {
      this.y = Optional.of(var1.y());
      return this;
   }

   public class00789 N(boolean var1) {
      this.u = Optional.of(var1);
      return this;
   }

   public static class00789 N() {
      return new class00789();
   }

   public class00789 N(class03659<class03689> var1) {
      this.N.add(var1);
      return this;
   }
}
