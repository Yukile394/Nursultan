package minecraft;

import Nursultan.class10168;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class03253 implements class03276 {
   class03253(class02897 var1, class03242 var2, Function var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   @Override
   public void N(class00381<?> var1, Consumer<class00381<?>> var2) {
      if (var1.method_65080() == this.y) {
         class03260 class03260 = (class03260)var1;
         var2.accept(this.L);
         class03260.N().forEach(var2);
         var2.accept(this.L);
      } else {
         var2.accept(var1);
      }
   }

   @Nullable
   @Override
   public class03257 N(class00381<?> var1) {
      return var1 == this.L ? new class10168(this) : null;
   }
}
