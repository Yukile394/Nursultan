package minecraft;

import java.util.Optional;

record class07387(class08774 user, Optional<class08195> permissionLevel, Optional<Boolean> bypassesPlayerLimit) {
   public Optional<Boolean> L() {
      return this.bypassesPlayerLimit;
   }

   class07387(class08774 user, Optional<class08195> permissionLevel, Optional<Boolean> bypassesPlayerLimit) {
      super();
      this.user = user;
      this.permissionLevel = permissionLevel;
      this.bypassesPlayerLimit = bypassesPlayerLimit;
   }

   public Optional<class08195> y() {
      return this.permissionLevel;
   }

   public class08774 N() {
      return this.user;
   }
}
