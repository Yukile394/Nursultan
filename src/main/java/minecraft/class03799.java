package minecraft;

import it.unimi.dsi.fastutil.Hash.Strategy;
import org.jspecify.annotations.Nullable;

class class03799 implements Strategy<class06584> {
   class03799() {
      super();
   }

   public int hashCode(@Nullable class06584 var1) {
      return class06584.y(var1);
   }

   public boolean equals(@Nullable class06584 var1, @Nullable class06584 var2) {
      return var1 == var2 || var1 != null && var2 != null && var1.R() == var2.R() && class06584.L(var1, var2);
   }
}
