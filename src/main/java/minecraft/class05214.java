package minecraft;

import Nursultan.class10498;
import com.google.common.collect.Lists;
import java.util.List;

public class class05214 {
   private final List<class10498> N = Lists.newArrayList();

   public class05214() {
      super();
   }

   public double y(class07209 var1, double var2) {
      if (var2 == 0.0) {
         return 0.0;
      } else {
         double d0 = 0.0;

         for (class10498 class10498 : this.N) {
            d0 += class10498.N(var1);
         }

         return d0 * var2;
      }
   }

   public void N(class07209 var1, double var2) {
      if (var2 != 0.0) {
         this.N.add(new class10498(var1, var2));
      }
   }
}
