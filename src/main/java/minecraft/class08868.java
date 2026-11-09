package minecraft;

import it.unimi.dsi.fastutil.ints.IntList;

record class08868(class08855 model, IntList selectors) {
   class08868(class08855 model, IntList selectors) {
      this.model = model;
      this.selectors = selectors;
   }

   public IntList y() {
      return this.selectors;
   }

   public class08855 N() {
      return this.model;
   }
}
