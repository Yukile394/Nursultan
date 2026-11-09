package minecraft;

import com.viaversion.viafabricplus.visuals.settings.VisualSettings;

public class class06586 extends class06581 {
   @Override
   public boolean L(class06584 var1) {
      return VisualSettings.INSTANCE.potionEnchantmentGlint.isEnabled() ? var1.a_(class02484.h, class06517.N).L() : super.L(var1);
   }

   public class06586(class06573 var1) {
      super(var1);
   }

   @Override
   public class06584 E() {
      class06584 class06584 = super.E();
      class06584.N(class02484.h, new class06517(class06506.N));
      return class06584;
   }

   @Override
   public class00392 N(class06584 var1) {
      class06517 class06517 = var1.method_58694(class02484.h);
      return class06517 != null ? class06517.N(this.W + ".effect.") : super.N(var1);
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      class08036 class08036 = var1.method_8036();
      class06584 class06584 = var1.method_8041();
      class06517 class06517 = class06584.a_(class02484.h, class06517.N);
      class00500 class00500 = class07299.method_8320(class07209);
      if (var1.method_8038() != class07211.field_11033 && class00500.N(class01210.Lw) && class06517.N(class06506.N)) {
         class07299.method_8396(null, class07209, class04909.Ex, class04911.field_15245, 1.0F, 1.0F);
         class08036.method_6122(var1.method_20287(), class05970.N(class06584, class08036, new class06584(class06570.nP)));
         if (!class07299.method_8608()) {
            class04782 class04782 = (class04782)class07299;

            for (int i = 0; i < 5; i++) {
               class04782.method_65096(
                  class07107.NT,
                  class07209.method_10263() + class07299.field_9229.U(),
                  class07209.method_10264() + 1,
                  class07209.method_10260() + class07299.field_9229.U(),
                  1,
                  0.0,
                  0.0,
                  0.0,
                  1.0
               );
            }
         }

         class07299.method_8396(null, class07209, class04909.Lc, class04911.field_15245, 1.0F, 1.0F);
         class07299.N(null, class01194.w, class07209);
         class07299.method_8501(class07209, class00869.nB.W());
         return class07082.N;
      } else {
         return class07082.i;
      }
   }
}
