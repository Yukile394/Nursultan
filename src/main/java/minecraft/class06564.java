package minecraft;

import java.util.Iterator;
import java.util.List;

public class class06564 extends class06581 {
   private final class07078<? extends class07504> N;

   public class06564(class07078<? extends class07504> var1, class06573 var2) {
      super(var2);
      this.N = var1;
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      class00500 class00500 = class07299.method_8320(class07209);
      if (!class00500.N(class01210.e)) {
         return class07082.u;
      } else {
         class06584 class06584 = var1.method_8041();
         class08080 class08080 = class00500.i() instanceof class07760 ? class00500.L(((class07760)class00500.i()).L()) : class08080.field_12665;
         double d0 = 0.0;
         if (class08080.y()) {
            d0 = 0.5;
         }

         class06889 class06889 = new class06889(class07209.method_10263() + 0.5, class07209.method_10264() + 0.0625 + d0, class07209.method_10260() + 0.5);
         class07504 class07504 = class07504.N(
            class07299, class06889.M, class06889.B, class06889.Z, this.N, class06113.field_16470, class06584, var1.method_8036()
         );
         if (class07504 == null) {
            return class07082.u;
         } else {
            if (class07504.N(class07299)) {
               List<class07049> list = class07299.N_70(null, class07504.method_5829());
               Iterator<class07049> iterator = list.iterator();

               while (iterator.hasNext()) {
                  if (iterator.next() instanceof class07504) {
                     return class07082.u;
                  }
               }
            }

            if (class07299 instanceof class04782 class04782) {
               class04782.method_8649(class07504);
               class04782.N(class01194.v, class07209, class01164.N(var1.method_8036(), class04782.method_8320(class07209.method_10074())));
            }

            class06584.B(1);
            return class07082.N;
         }
      }
   }
}
