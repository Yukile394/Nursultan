package minecraft;

import java.util.Collection;
import java.util.function.IntFunction;

class class02393<B, C> implements class02362<B, C> {
   class02393(int var1, IntFunction var2, class02362 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public C decode(B var1) {
      int i = class02389.N(var1, this.N);
      Collection collection = (Collection)this.y.apply(Math.min(i, 65536));

      for (int j = 0; j < i; j++) {
         collection.add(this.L.decode((B)var1));
      }

      return (C)collection;
   }

   public void encode(B var1, C var2) {
      class02389.N(var1, var2.size(), this.N);

      for (Object object : var2) {
         this.L.encode((B)var1, object);
      }
   }
}
