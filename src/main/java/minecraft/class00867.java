package minecraft;

import java.util.Optional;

public class class00867 implements class05952 {
   private Optional<Boolean> N = Optional.empty();
   private Optional<Boolean> y = Optional.empty();

   public class00867() {
      super();
   }

   public class00867 y(boolean var1) {
      this.y = Optional.of(var1);
      return this;
   }

   public class00866 build() {
      return new class00866(this.N, this.y);
   }

   public class00867 N(boolean var1) {
      this.N = Optional.of(var1);
      return this;
   }
}
