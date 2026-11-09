package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

interface class07773 {
   int N(class07709 var1);

   default List<class07709> N(List<class07709> var1) {
      return this.N(var1, this::N);
   }

   default List<class07709> N_84(List<class07709> var1, Supplier<class07709> var2) {
      return this.N(var1, (var2x, var3) -> this.N(var2x, var2, var3));
   }

   default List<class07709> N(List<class07709> var1, BiConsumer<class07709, List<class07709>> var2) {
      ArrayList arraylist = Lists.newArrayList();

      for (class07709 class07709 : var1) {
         var2.accept(class07709, arraylist);
      }

      return arraylist;
   }

   void N(class07709 var1, List<class07709> var2);

   void N(class07709 var1, Supplier<class07709> var2, List<class07709> var3);

   class07709 N();

   int N(class07709 var1, Supplier<class07709> var2);
}
