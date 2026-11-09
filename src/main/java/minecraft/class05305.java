package minecraft;

import java.util.List;

record class05305(class00329 id, List<class06584> displayItems) {

   class05305(class00329 id, List<class06584> displayItems) {
      this.id = id;
      this.displayItems = displayItems;
   }

   public List<class06584> y() {
      return this.displayItems;
   }

   public class00329 N() {
      return this.id;
   }

   public class06584 N(int var1) {
      if (this.displayItems.isEmpty()) {
         return class06584.E;
      } else {
         int i = var1 % this.displayItems.size();
         return this.displayItems.get(i);
      }
   }
}
