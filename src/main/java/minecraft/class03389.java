package minecraft;

import java.util.UUID;

record class03389(UUID sender, class03404 entry) {
   class03389(UUID sender, class03404 entry) {
      super();
      this.sender = sender;
      this.entry = entry;
   }

   public class03404 y() {
      return this.entry;
   }

   public UUID N() {
      return this.sender;
   }

   public boolean N(class03389 var1) {
      return var1.sender.equals(this.sender);
   }
}
