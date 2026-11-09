package minecraft;

import java.util.Optional;

public class class08619 extends class00471<class08619> {
   private final class06378 N;
   private Optional<class03543<class07304>> y = Optional.empty();

   public class08619(class06378 var1) {
      super();
      this.N = var1;
   }

   @Override
   public class08122 y() {
      return new class08611(this.R(), this.N, this.y);
   }

   protected class08619 L() {
      return this;
   }

   public class08619 N(class03543<class07304> var1) {
      this.y = Optional.of(var1);
      return this;
   }
}
