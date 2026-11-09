package minecraft;

public class class01778 implements class01857 {
   private static final int N = class02566.y(255, 255, 100, 255);
   private static final int y = class02566.y(255, 100, 255, 255);
   private static final int L = class02566.y(255, 0, 255, 0);
   private static final int u = class02566.y(255, 255, 165, 0);
   private static final int i = class02566.y(255, 255, 0, 0);
   private final class06202 R;

   public class01778(class06202 var1) {
      super();
      this.R = var1;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class03448 class03448 = (class03448)this.R.T_3;
      var7.L(class00429.u, (var2, var3x) -> {
         var3x.N().map(class03448::method_8469).map(var1xx -> var1xx.method_30950(this.R.NK().N(true))).ifPresent(var1xx -> {
            class06724.y(var2.method_73189(), var1xx, y);
            class06889 class06889 = var1xx.y(0.0, 0.01F, 0.0);
            class06724.N(class06889, 4.0F, class06747.N(L));
            class06724.N(class06889, 8.0F, class06747.N(u));
            class06724.N(class06889, 24.0F, class06747.N(i));
         });
         var3x.y().ifPresent(var1xx -> {
            class06724.y(var2.method_73189(), var1xx.method_46558(), N);
            class06724.N(class00734.N(class06889.N(var1xx)), class06747.y(class02566.N(1.0F, 1.0F, 0.0F, 0.0F)));
         });
      });
   }
}
