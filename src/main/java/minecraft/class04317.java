package minecraft;

import it.unimi.dsi.fastutil.Hash.Strategy;
import org.jspecify.annotations.Nullable;

class class04317 implements Strategy<class04309<?>> {
   class04317() {
      super();
   }

   public int hashCode(class04309<?> var1) {
      return 31 * var1.y().hashCode() + var1.N().hashCode();
   }

   public boolean equals(@Nullable class04309<?> var1, @Nullable class04309<?> var2) {
      if (var1 == var2) {
         return true;
      } else {
         return var1 != null && var2 != null ? var1.N() == var2.N() && var1.y().equals(var2.y()) : false;
      }
   }
}
