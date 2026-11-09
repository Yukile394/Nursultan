package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public interface class02665 {
   class06584 method_6118(class07085 var1);

   @Nullable
   default class07085 N(class06584 var1, List<class07085> var2) {
      if (var1.R()) {
         return null;
      } else {
         class08725 class08725 = var1.method_58694(class02484.o);
         if (class08725 != null) {
            class07085 class07085 = class08725.y();
            if (!var2.contains(class07085)) {
               return class07085;
            }
         } else if (!var2.contains(class07085.field_6173)) {
            return class07085.field_6173;
         }

         return null;
      }
   }

   default void N(class05946<class05074> var1, class04162 var2, Map<class07085, Float> var3) {
      this.N(var1, var2, 0L, var3);
   }

   default void N(class05946<class05074> var1, class04162 var2, long var3, Map<class07085, Float> var5) {
      class05074 class05074 = var2.N().method_8503().yd().N(var1);
      if (class05074 != class05074.R) {
         ObjectArrayList<class06584> objectarraylist = class05074.N(var2, var3);
         ArrayList arraylist = new ArrayList();

         for (class06584 class06584x : objectarraylist) {
            class07085 class07085 = this.N(class06584x, arraylist);
            if (class07085 != null) {
               class06584 class06584x = class07085.N(class06584x);
               this.method_5673(class07085, class06584x);
               Float f = (Float)var5.get(class07085);
               if (f != null) {
                  this.N(class07085, f);
               }

               arraylist.add(class07085);
            }
         }
      }
   }

   void N(class07085 var1, float var2);

   default void N(class02947 var1, class04162 var2) {
      this.N(var1.N(), var2, var1.y());
   }

   void method_5673(class07085 var1, class06584 var2);
}
