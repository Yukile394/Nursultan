package minecraft;

import java.util.List;
import org.apache.commons.lang3.mutable.MutableLong;

public class class06295 {
   public class06295() {
      super();
   }

   public static class04142<class08041> N(class05378<List<class06289>> var0, float var1, int var2, int var3, class05378<class06289> var4) {
      MutableLong mutablelong = new MutableLong(0L);
      return class04137.N_42(var6 -> var6.group(var6.N(class05378.m), var6.y(var0), var6.y(var4)).apply(var6, (var5xx, var6x, var7) -> (var8, var9, var10) -> {
         List list = var6.y(var6x);
         class06289 class06289x = var6.y(var7);
         if (list.isEmpty()) {
            return false;
         } else {
            class06289 class06289x = (class06289)list.get(var8.method_8409().y(list.size()));
            if (class06289x != null && var8.method_27983() == class06289x.N() && class06289x.y().method_19769(var9.method_73189(), var3)) {
               if (var10 > mutablelong.longValue()) {
                  var5xx.N(new class05352(class06289x.y(), var1, var2));
                  mutablelong.setValue(var10 + 100L);
               }

               return true;
            } else {
               return false;
            }
         }
      }));
   }
}
