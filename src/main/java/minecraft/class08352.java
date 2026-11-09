package minecraft;

import org.jspecify.annotations.Nullable;

record class08352(class01894 id, class08839 clientItemInfo) {

   class08352(class01894 id, @Nullable class08839 clientItemInfo) {
      super();
      this.id = id;
      this.clientItemInfo = clientItemInfo;
   }

   @Nullable
   public class08839 y() {
      return this.clientItemInfo;
   }

   public class01894 N() {
      return this.id;
   }
}
