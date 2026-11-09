package minecraft;

import Nursultan.class09552;
import Nursultan.class09556;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2IntLinkedOpenHashMap;

public class class02029 {
   private boolean N;
   private final Long2IntLinkedOpenHashMap y = class07536.N(() -> {
      class09552 class09552 = new class09552(this, 100, 0.25F);
      class09552.defaultReturnValue(Integer.MAX_VALUE);
      return class09552;
   });
   private final Long2FloatLinkedOpenHashMap L = class07536.N(() -> {
      class09556 class09556 = new class09556(this, 100, 0.25F);
      class09556.defaultReturnValue(Float.NaN);
      return class09556;
   });
   private final class03082 u = (var1, var2) -> {
      long i = var2.method_10063();
      int j = this.y.get(i);
      if (j != Integer.MAX_VALUE) {
         return j;
      } else {
         int k = class03082.N.packedBrightness(var1, var2);
         if (this.y.size() == 100) {
            this.y.removeFirstInt();
         }

         this.y.put(i, k);
         return k;
      }
   };

   public class02029() {
      super();
   }

   public float y(class00500 var1, class07295 var2, class07209 var3) {
      long i = var3.method_10063();
      if (this.N) {
         float f = this.L.get(i);
         if (!Float.isNaN(f)) {
            return f;
         }
      }

      float f1 = var1.L(var2, var3);
      if (this.N) {
         if (this.L.size() == 100) {
            this.L.removeFirstFloat();
         }

         this.L.put(i, f1);
      }

      return f1;
   }

   public void y() {
      this.N = false;
      this.y.clear();
      this.L.clear();
   }

   public void N() {
      this.N = true;
   }

   public int N(class00500 var1, class07295 var2, class07209 var3) {
      return class03063.N(this.N ? this.u : class03082.N, var2, var1, var3);
   }
}
