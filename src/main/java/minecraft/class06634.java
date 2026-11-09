package minecraft;

import Nursultan.class09415;
import com.google.common.cache.CacheLoader;
import java.util.function.Supplier;

class class06634 extends CacheLoader<class09415, class08985> {
   class06634(class06615 var1) {
      super();
      this.N = var1;
   }

   public class08985 load(class09415 var1) {
      Supplier<class07923> supplier = this.N.y.y(var1.N());
      boolean flag = var1.y();
      return new class00910(new class06610(this, supplier, flag));
   }
}
