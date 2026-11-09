package minecraft;

import java.util.Collection;
import org.jspecify.annotations.Nullable;

public interface class04065 {
   class04065 y_ = new class04092();

   default byte L() {
      return 1;
   }

   default boolean u() {
      return true;
   }

   int N(class04083 var1, class07284 var2, class07209 var3, class06069 var4, class04076 var5, boolean var6);

   default boolean N(class07284 var1, class07209 var2, class06069 var3) {
      return false;
   }

   default void N(class07284 var1, class00500 var2, class07209 var3, class06069 var4) {
   }

   default boolean N(class07284 var1, class07209 var2, class00500 var3, @Nullable Collection<class07211> var4, boolean var5) {
      return ((class08815)class00869.bf).y().N(var3, var1, var2, var5) > 0L;
   }

   default int f_(int var1) {
      return 1;
   }
}
