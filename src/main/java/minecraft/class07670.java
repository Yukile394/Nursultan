package minecraft;

import java.util.Optional;

public class class07670 implements class05952 {
   private final class03556<class00891> N;
   private Optional<class01400> y = Optional.empty();

   public class07670(class00891 var1) {
      super();
      this.N = var1.s();
   }

   @Override
   public class05957 build() {
      return new class00851(this.N, this.y);
   }

   public class07670 N(class01408 var1) {
      this.y = var1.y();
      return this;
   }
}
