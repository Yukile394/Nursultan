package minecraft;

import java.util.List;
import java.util.function.Function;

public enum class01090 {
   field_14280,
   field_14281;

   private class01090() {
   }

   public class01090 N() {
      return this == field_14280 ? field_14281 : field_14280;
   }

   public <T> int N(List<T> var1, T var2, Function<T, class02268> var3, boolean var4) {
      if ((var4 ? this.N() : this) == field_14281) {
         int j;
         for (j = 0; j < var1.size(); j++) {
            class02268 class02268 = (class02268)var3.apply(var1.get(j));
            if (!class02268.L() || class02268.y() != this) {
               break;
            }
         }

         var1.add(j, var2);
         return j;
      } else {
         int i;
         for (i = var1.size() - 1; i >= 0; i--) {
            class02268 class02268x = (class02268)var3.apply(var1.get(i));
            if (!class02268x.L() || class02268x.y() != this) {
               break;
            }
         }

         var1.add(i + 1, var2);
         return i + 1;
      }
   }
}
