package minecraft;

public class class01149 implements class01857 {
   private static final float N = 1.0F;

   public class01149() {
      super();
   }

   private void N(class00457 var1, class01144 var2) {
      var1.y(class00429.m, (var1x, var2x) -> var2.accept(var1x.method_46558(), var2x.N()));
      var1.L(class00429.m, (var1x, var2x) -> var2.accept(var1x.method_73189(), var2x.N()));
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      this.N(var7, (var0, var1x) -> {
         double d0 = var1x * 2.0;
         class06724.N(class00734.N(var0, d0, d0, d0), class06747.y(class02566.N(0.35F, 1.0F, 1.0F, 0.0F)));
      });
      this.N(var7, (var0, var1x) -> class06724.N(class00734.N(var0, 0.5, 1.0, 0.5).u(0.0, 0.5, 0.0), class06747.y(class02566.N(0.35F, 1.0F, 1.0F, 0.0F))));
      this.N(var7, (var0, var1x) -> {
         class06724.N("Listener Origin", var0.y(0.0, 1.8, 0.0), class06715.N().N(0.4F));
         class06724.N(class07209.method_49638(var0).toString(), var0.y(0.0, 1.5, 0.0), class06715.N(-6959665).N(0.4F));
      });
      var7.N(class00429.s, (var0, var1x, var2) -> {
         class06889 class06889 = var0.y();
         double d0 = 0.4;
         class06724.N(class00734.N(class06889.y(0.0, 0.5, 0.0), 0.4, 0.9, 0.4), class06747.y(class02566.N(0.2F, 1.0F, 1.0F, 1.0F)));
         class06724.N(var0.N().M(), class06889.y(0.0, 0.85, 0.0), class06715.N(-7564911).N(0.12F));
      });
   }
}
