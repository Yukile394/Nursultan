package minecraft;

import java.util.Iterator;
import java.util.List;

class class00732 extends class01989 {
   class00732() {
      super();
   }

   @Override
   protected class06584 N(class07210 var1, class06584 var2) {
      class04782 class04782 = var1.y();
      class07209 class07209 = var1.L().method_10093(var1.u().L(class06758.y));
      List<class03811> list = class04782.N(class03811.class, new class00734(class07209), class07042.R);
      if (list.isEmpty()) {
         this.N(false);
         return var2;
      } else {
         Iterator<class03811> iterator = list.iterator();

         while (iterator.hasNext()) {
            if (iterator.next().N(null, var2)) {
               var2.N(16, class04782, null, var0 -> {});
               return var2;
            }
         }

         this.N(false);
         return var2;
      }
   }
}
