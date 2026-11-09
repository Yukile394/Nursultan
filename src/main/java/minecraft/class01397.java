package minecraft;

import java.util.Optional;

public class class01397 implements class05952 {
   private Optional<Long> N = Optional.empty();
   private final class05338 y;

   public class01397(class05338 var1) {
      super();
      this.y = var1;
   }

   public class01397 N(long var1) {
      this.N = Optional.of(var1);
      return this;
   }

   public class01405 build() {
      return new class01405(this.N, this.y);
   }
}
