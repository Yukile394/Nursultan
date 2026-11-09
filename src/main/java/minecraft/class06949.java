package minecraft;

import java.util.function.Consumer;

public class class06949 extends class06581 {
   public class06949(class06573 var1) {
      super(var1);
   }

   @Override
   public class07082 N(class06501 var1) {
      if (var1.method_8038() == class07211.field_11033) {
         return class07082.u;
      } else {
         class07299 class07299 = var1.method_8045();
         class07209 class07209 = new class06942(var1).method_8037();
         class06584 class06584 = var1.method_8041();
         class06889 class06889 = class06889.L(class07209);
         class00734 class00734 = class07078.B.E().N(class06889.N(), class06889.y(), class06889.L());
         if (class07299.method_8587(null, class00734) && class07299.N_70(null, class00734).isEmpty()) {
            if (class07299 instanceof class04782 class04782) {
               Consumer consumer = class07078.N(class04782, class06584, var1.method_8036());
               class00681 class00681 = class07078.B.y(class04782, consumer, class07209, class06113.field_16465, true, true);
               if (class00681 == null) {
                  return class07082.u;
               }

               float f = class04995.y((class04995.R(var1.method_8044() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               class00681.method_5808(class00681.method_23317(), class00681.method_23318(), class00681.method_23321(), f, 0.0F);
               class04782.y(class00681);
               class07299.method_43128(
                  null, class00681.method_23317(), class00681.method_23318(), class00681.method_23321(), class04909.NJ, class04911.field_15245, 0.75F, 0.8F
               );
               class00681.method_32875(class01194.v, var1.method_8036());
            }

            class06584.B(1);
            return class07082.N;
         } else {
            return class07082.u;
         }
      }
   }
}
