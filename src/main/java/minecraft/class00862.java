package minecraft;

import java.util.Set;
import org.jspecify.annotations.Nullable;

class class00862 implements class00880 {
   private final class00500 N;
   private final Set<class08092<?>> y;
   @Nullable
   private final class07001 L;

   public class00862(class00500 var1, Set<class08092<?>> var2, @Nullable class07001 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public boolean test(class06646 var1) {
      class00500 class00500 = var1.N();
      if (!class00500.N(this.N.i())) {
         return false;
      } else {
         for (class08092<?> class08092 : this.y) {
            if (class00500.L(class08092) != this.N.L(class08092)) {
               return false;
            }
         }

         if (this.L == null) {
            return true;
         } else {
            class00394 class00394 = var1.y();
            return class00394 != null && class07717.N(this.L, class00394.y_2(var1.L().method_30349()), true);
         }
      }
   }

   @Override
   public boolean N() {
      return this.L != null;
   }
}
