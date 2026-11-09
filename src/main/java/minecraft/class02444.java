package minecraft;

import java.util.List;

record class02444(List<class06584> items, boolean isResultSlot) {

   class02444(List<class06584> items, boolean isResultSlot) {
      this.items = items;
      this.isResultSlot = isResultSlot;
   }

   public boolean y() {
      return this.isResultSlot;
   }

   public List<class06584> N() {
      return this.items;
   }

   public class06584 N(int var1) {
      int i = this.items.size();
      return i == 0 ? class06584.E : this.items.get(var1 % i);
   }
}
