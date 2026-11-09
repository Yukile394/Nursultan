package minecraft;

import java.util.Collections;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface class06946 {
   default boolean N(class04770 var1, class03729<?> var2) {
      if (!var2.y().method_8118() && var1.method_51469().method_64395().N(class07305.n) && !var1.method_14253().y(var2.N())) {
         return false;
      } else {
         this.N(var2);
         return true;
      }
   }

   default void N(class08036 var1, List<class06584> var2) {
      class03729<?> class03729 = this.N();
      if (class03729 != null) {
         var1.method_51283(class03729, var2);
         if (!class03729.y().method_8118()) {
            var1.method_7254(Collections.singleton(class03729));
            this.N(null);
         }
      }
   }

   @Nullable
   class03729<?> N();

   void N(@Nullable class03729<?> var1);
}
