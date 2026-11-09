package minecraft;

import java.util.function.Consumer;

record class03708(class00392 message, Consumer<class03723> action) {
   class03708(class00392 message, Consumer<class03723> action) {
      this.message = message;
      this.action = action;
   }

   public Consumer<class03723> y() {
      return this.action;
   }

   public class00392 N() {
      return this.message;
   }
}
