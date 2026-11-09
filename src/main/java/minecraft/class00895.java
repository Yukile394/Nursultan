package minecraft;

import java.util.Map;
import java.util.Map.Entry;
import org.jspecify.annotations.Nullable;

class class00895 implements class00880 {
   private final class03543<class00891> N;
   @Nullable
   private final class07001 y;
   private final Map<String, String> L;

   class00895(class03543<class00891> var1, Map<String, String> var2, @Nullable class07001 var3) {
      super();
      this.N = var1;
      this.L = var2;
      this.y = var3;
   }

   public boolean test(class06646 var1) {
      class00500 class00500 = var1.N();
      if (!class00500.N(this.N)) {
         return false;
      } else {
         for (Entry entry : this.L.entrySet()) {
            class08092<?> class08092 = class00500.i().E().N((String)entry.getKey());
            if (class08092 == null) {
               return false;
            }

            Comparable comparable = (Comparable)class08092.y((String)entry.getValue()).orElse(null);
            if (comparable == null) {
               return false;
            }

            if (class00500.L(class08092) != comparable) {
               return false;
            }
         }

         if (this.y == null) {
            return true;
         } else {
            class00394 class00394 = var1.y();
            return class00394 != null && class07717.N(this.y, class00394.y_2(var1.L().method_30349()), true);
         }
      }
   }

   @Override
   public boolean N() {
      return this.y != null;
   }
}
