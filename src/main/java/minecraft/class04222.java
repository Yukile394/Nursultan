package minecraft;

import java.util.OptionalInt;

record class04222(class00392 message, int maxWidth, OptionalInt maxRows) {

   public OptionalInt L() {
      return this.maxRows;
   }

   class04222(class00392 message, int maxWidth, OptionalInt maxRows) {
      super();
      this.message = message;
      this.maxWidth = maxWidth;
      this.maxRows = maxRows;
   }

   public int y() {
      return this.maxWidth;
   }

   public class00392 N() {
      return this.message;
   }
}
