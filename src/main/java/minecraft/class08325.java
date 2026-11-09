package minecraft;

import com.google.common.collect.AbstractIterator;
import java.util.Iterator;
import org.jspecify.annotations.Nullable;

class class08325 extends AbstractIterator<class08299> {
   private int L;

   class08325(class08295 var1, Iterator var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Nullable
   protected class08299 computeNext() {
      while (this.N.hasNext()) {
         class07709 class07709 = (class07709)this.N.next();
         int i = this.L++;
         if (class07709 instanceof class07001 class07001) {
            return class08308.N(this.y.N(i), this.y.N, class07001);
         }

         this.y.N(i, class07709);
      }

      return (class08299)this.endOfData();
   }
}
