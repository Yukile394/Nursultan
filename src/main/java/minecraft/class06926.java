package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class06926 extends class06581 {
   private static final class00392 N = class00392.L("item.minecraft.lodestone_compass");

   @Override
   public boolean L(class06584 var1) {
      return var1.L(class02484.NP) || super.L(var1);
   }

   public class06926(class06573 var1) {
      super(var1);
   }

   @Override
   public void N(class06584 var1, class04782 var2, class07049 var3, @Nullable class07085 var4) {
      class02687 class02687x = var1.method_58694(class02484.NP);
      if (class02687x != null) {
         class02687 class02687x = class02687x.N(var2);
         if (class02687x != class02687x) {
            var1.N(class02484.NP, class02687x);
         }
      }
   }

   @Override
   public class00392 N(class06584 var1) {
      return var1.L(class02484.NP) ? N : super.N(var1);
   }

   @Override
   public class07082 N(class06501 var1) {
      class07209 class07209 = var1.method_8037();
      class07299 class07299 = var1.method_8045();
      if (!class07299.method_8320(class07209).N(class00869.TT)) {
         return super.N(var1);
      } else {
         class07299.method_8396(null, class07209, class04909.Td, class04911.field_15248, 1.0F, 1.0F);
         class08036 class08036 = var1.method_8036();
         class06584 class06584x = var1.method_8041();
         boolean flag = !class08036.method_56992() && class06584x.c() == 1;
         class02687 class02687 = new class02687(Optional.of(class06289.N(class07299.method_27983(), class07209)), true);
         if (flag) {
            class06584x.N(class02484.NP, class02687);
         } else {
            class06584 class06584x = class06584x.N(class06570.jJ, 1);
            class06584x.N(1, class08036);
            class06584x.N(class02484.NP, class02687);
            if (!class08036.method_31548().M(class06584x)) {
               class08036.method_7328(class06584x, false);
            }
         }

         return class07082.N;
      }
   }
}
