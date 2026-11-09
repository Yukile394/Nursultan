package minecraft;

import com.google.common.collect.AbstractIterator;
import java.util.ListIterator;
import org.jspecify.annotations.Nullable;

class class08323 extends AbstractIterator<class08299> {
   class08323(class08316 var1, ListIterator var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   @Nullable
   protected class08299 computeNext() {
      if (this.N.hasNext()) {
         int i = this.N.nextIndex();
         class07001 class07001 = (class07001)this.N.next();
         return this.y.N(i, class07001);
      } else {
         return (class08299)this.endOfData();
      }
   }
}
