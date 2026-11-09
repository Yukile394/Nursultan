package minecraft;

import java.util.Map;
import java.util.function.IntFunction;

class class02374<B, M> implements class02362<B, M> {
   class02374(int var1, class02362 var2, class02362 var3, IntFunction var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public M decode(B var1) {
      int i = class02389.N(var1, this.N);
      Map map = (Map)this.u.apply(Math.min(i, 65536));

      for (int j = 0; j < i; j++) {
         Object object = this.y.decode((B)var1);
         Object object1 = this.L.decode((B)var1);
         map.put(object, object1);
      }

      return (M)map;
   }

   public void encode(B var1, M var2) {
      class02389.N(var1, var2.size(), this.N);
      var2.forEach((var3, var4) -> {
         var0.encode((B)var1, var3);
         var2x.encode((B)var1, var4);
      });
   }
}
