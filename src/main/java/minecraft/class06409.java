package minecraft;

import org.jspecify.annotations.Nullable;

record class06409(class07209 pos, class00500 state, class06404 blockEntityInfo, class00500 previousStateAtDestination) {

   @Nullable
   public class06404 L() {
      return this.blockEntityInfo;
   }

   class06409(class07209 pos, class00500 state, @Nullable class06404 blockEntityInfo, class00500 previousStateAtDestination) {
      this.pos = pos;
      this.state = state;
      this.blockEntityInfo = blockEntityInfo;
      this.previousStateAtDestination = previousStateAtDestination;
   }

   public class00500 u() {
      return this.previousStateAtDestination;
   }

   public class00500 y() {
      return this.state;
   }

   public class07209 N() {
      return this.pos;
   }
}
