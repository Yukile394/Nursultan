package minecraft;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;

class class04204 implements class04205 {
   class04204(class04203 var1, Map var2) {
      super();
      this.N = var2;
   }

   @Override
   public void N(class01894 var1, class04214 var2) {
      class04214 class04214 = this.N.put(var1, var2);
      if (class04214 != null) {
         class04214.N();
      }
   }

   @Override
   public void N(Predicate<class01894> var1) {
      Iterator iterator = this.N.entrySet().iterator();

      while (iterator.hasNext()) {
         Entry entry = (Entry)iterator.next();
         if (var1.test((class01894)entry.getKey())) {
            ((class04214)entry.getValue()).N();
            iterator.remove();
         }
      }
   }
}
