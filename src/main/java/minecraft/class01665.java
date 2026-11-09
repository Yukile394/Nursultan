package minecraft;

import java.util.List;

public class class01665 implements class01857 {
   public class01665() {
      super();
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      var7.N(class00429.W, (var0, var1x) -> {
         for (class00431 class00431 : var1x) {
            class06724.N(class00734.N(class00431.N()), class06747.N(class02566.N(1.0F, 1.0F, 1.0F, 1.0F)));

            for (class00426 class00426 : class00431.y()) {
               if (class00426.y()) {
                  class06724.N(class00734.N(class00426.N()), class06747.N(class02566.N(1.0F, 0.0F, 1.0F, 0.0F)));
               } else {
                  class06724.N(class00734.N(class00426.N()), class06747.N(class02566.N(1.0F, 0.0F, 0.0F, 1.0F)));
               }
            }
         }
      });
   }
}
