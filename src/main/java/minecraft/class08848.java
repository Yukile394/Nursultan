package minecraft;

import java.util.Optional;

public class class08848 extends class00471<class08848> {
   private Optional<class03543<class07304>> N = Optional.empty();
   private boolean y = true;

   public class08848() {
      super();
   }

   public class08848 u() {
      this.y = false;
      return this;
   }

   @Override
   public class08122 y() {
      return new class08853(this.R(), this.N, this.y);
   }

   public class08848 N(class03543<class07304> var1) {
      this.N = Optional.of(var1);
      return this;
   }

   public class08848 N(class03556<class07304> var1) {
      this.N = Optional.of(class03543.N(var1));
      return this;
   }

   protected class08848 L() {
      return this;
   }
}
