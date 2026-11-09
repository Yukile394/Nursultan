package minecraft;

public class class01649 implements class01857 {
   private final class06202 N;

   public class01649(class06202 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class07209 class07209xx = ((class04453)this.N.T_4).method_24515();
      class07299 class07299 = ((class04453)this.N.T_4).method_73183();

      for (class07209 class07209x : class07209.method_10097(class07209xx.method_10069(-10, -10, -10), class07209xx.method_10069(10, 10, 10))) {
         class04688 class04688x = class07299.method_8316(class07209x);
         if (class04688x.N(class01231.N)) {
            double d0 = class07209x.method_10264() + class04688x.N(class07299, class07209x);
            class06724.N(
               new class00734(
                  class07209x.method_10263() + 0.01F,
                  class07209x.method_10264() + 0.01F,
                  class07209x.method_10260() + 0.01F,
                  class07209x.method_10263() + 0.99F,
                  d0,
                  class07209x.method_10260() + 0.99F
               ),
               class06747.y(class02566.N(0.15F, 0.0F, 1.0F, 0.0F))
            );
         }
      }

      for (class07209 class07209xx : class07209.method_10097(class07209xx.method_10069(-10, -10, -10), class07209xx.method_10069(10, 10, 10))) {
         class04688 class04688 = class07299.method_8316(class07209xx);
         if (class04688.N(class01231.N)) {
            class06724.N(String.valueOf(class04688.R()), class06889.N(class07209xx, 0.5, class04688.N(class07299, class07209xx), 0.5), class06715.N(-16777216));
         }
      }
   }
}
