package minecraft;

import java.util.Collection;
import org.jspecify.annotations.Nullable;

class class04092 implements class04065 {
   class04092() {
      super();
   }

   @Override
   public int N(class04083 var1, class07284 var2, class07209 var3, class06069 var4, class04076 var5, boolean var6) {
      return var1.L() > 0 ? var1.y() : 0;
   }

   @Override
   public boolean N(class07284 var1, class07209 var2, class00500 var3, @Nullable Collection<class07211> var4, boolean var5) {
      if (var4 == null) {
         return ((class04063)class00869.bf).i().N(var1.method_8320(var2), var1, var2, var5) > 0L;
      } else if (!var4.isEmpty()) {
         return !var3.P() && !var3.Y().y(class04684.L) ? false : class04063.N(var1, var2, var3, var4);
      } else {
         return class04065.super.N(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int f_(int var1) {
      return Math.max(var1 - 1, 0);
   }
}
