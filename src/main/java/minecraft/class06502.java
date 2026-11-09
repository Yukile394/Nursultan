package minecraft;

import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class06502 extends class06918 {
   protected final class00891 N;
   private final class07211 y;

   public class06502(class00891 var1, class00891 var2, class07211 var3, class06573 var4) {
      super(var1, var4);
      this.N = var2;
      this.y = var3;
   }

   @Nullable
   @Override
   public class00500 u(class06942 var1) {
      class00500 class00500xx = this.N.N(var1);
      class00500 class00500x = null;
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();

      for (class07211 class07211 : var1.i()) {
         if (class07211 != this.y.b()) {
            class00500 class00500xx = class07211 == this.y ? this.L().N(var1) : class00500xx;
            if (class00500xx != null && this.N(class07299, class00500xx, class07209)) {
               class00500x = class00500xx;
               break;
            }
         }
      }

      return class00500x != null && class07299.method_8628(class00500x, class07209, class06092.N()) ? class00500x : null;
   }

   protected boolean N(class05487 var1, class00500 var2, class07209 var3) {
      return var2.N(var1, var3);
   }

   @Override
   public void N(Map<class00891, class06581> var1, class06581 var2) {
      super.N(var1, var2);
      var1.put(this.N, var2);
   }
}
