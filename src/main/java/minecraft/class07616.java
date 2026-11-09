package minecraft;

import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

class class07616 implements Predicate<class07079> {
   class07616() {
      super();
   }

   public boolean test(@Nullable class07079 var1) {
      return var1 != null && class07654.N.containsKey(var1.method_5864());
   }
}
