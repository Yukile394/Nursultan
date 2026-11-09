package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.Iterator;
import java.util.List;

public class class04145 {
   public class04145() {
      super();
   }

   public static <E extends class07438> class04119<E> N(List<Pair<? extends class04118<? super E>, Integer>> var0, class05753 var1, class05769 var2) {
      class02150 class02150 = new class02150();
      var0.forEach(var1x -> class02150.N((class04118)var1x.getFirst(), (Integer)var1x.getSecond()));
      return class04137.N_42(var3x -> var3x.point((var3xx, var4, var5) -> {
         if (var1 == class05753.field_18349) {
            class02150.N();
         }

         Iterator iterator = class02150.iterator();

         while (iterator.hasNext() && (!((class04118)iterator.next()).trigger(var3xx, var4, var5) || var2 != class05769.field_18855)) {
         }

         return true;
      }));
   }

   public static <E extends class07438> class04119<E> N(List<Pair<? extends class04118<? super E>, Integer>> var0) {
      return N(var0, class05753.field_18349, class05769.field_18855);
   }
}
