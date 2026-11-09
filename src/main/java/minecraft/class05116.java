package minecraft;

import java.util.Locale;

public record class05116(String message) implements class05108 {
   public static final int L = 401;

   @Override
   public String L() {
      return String.format(Locale.ROOT, "Realms authentication error with message '%s'", this.message);
   }

   public class05116(String message) {
      super();
      this.message = message;
   }

   public String u() {
      return this.message;
   }

   @Override
   public class00392 y() {
      return class00392.y(this.message);
   }

   @Override
   public int N() {
      return 401;
   }
}
