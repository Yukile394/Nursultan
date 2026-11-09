package minecraft;

import java.util.ArrayList;
import java.util.Optional;

class class02366<T> implements class02362<class04247, class03543<T>> {
   private static final int y = -1;
   private final class02362<class04247, class03556<T>> L;

   class02366(class05946 var1) {
      super();
      this.N = var1;
      this.L = class02389.y(this.N);
   }

   public class03543<T> decode(class04247 var1) {
      int i = class01657.N(var1) - 1;
      if (i == -1) {
         class00751 class00751 = var1.J().L(this.N);
         return class00751.N(class03530.N(this.N, class01894.y.decode(var1))).orElseThrow();
      } else {
         ArrayList arraylist = new ArrayList(Math.min(i, 65536));

         for (int j = 0; j < i; j++) {
            arraylist.add(this.L.decode(var1));
         }

         return class03543.N(arraylist);
      }
   }

   public void encode(class04247 var1, class03543<T> var2) {
      Optional optional = var2.i();
      if (optional.isPresent()) {
         class01657.N(var1, 0);
         class01894.y.encode(var1, ((class03530)optional.get()).y());
      } else {
         class01657.N(var1, var2.y() + 1);

         for (class03556 class03556 : var2) {
            this.L.encode(var1, class03556);
         }
      }
   }
}
