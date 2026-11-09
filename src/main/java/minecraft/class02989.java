package minecraft;

import java.util.LinkedHashMap;
import java.util.Map;

public class class02989 {
   private final class03766 N;
   private int y;
   private final Map<class01894, class02957> L = new LinkedHashMap<>();

   public class02989(String var1) {
      super();
      this.N = new class03766(var1);
   }

   public class02981 N() {
      class03767 class03767 = class03767.N(this.N, this.L.values());
      return new class02981(this.N, class03767, Map.copyOf(this.L));
   }

   public class02957 N(class01894 var1) {
      if (this.y >= 64) {
         throw new IllegalStateException("Too many feature flags");
      } else {
         class02957 class02957 = new class02957(this.N, this.y++);
         if (this.L.put(var1, class02957) != null) {
            throw new IllegalStateException("Duplicate feature flag " + var1);
         } else {
            return class02957;
         }
      }
   }

   public class02957 N(String var1) {
      return this.N(class01894.y(var1));
   }
}
