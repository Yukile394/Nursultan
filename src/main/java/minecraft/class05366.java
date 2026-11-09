package minecraft;

public class class05366 implements class01857 {
   private static final int N = 160;
   private final class06202 y;

   public class05366(class06202 var1) {
      super();
      this.y = var1;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class05363 class05363 = ((class03386)this.y.i_5).s();
      class07209 class07209 = class07209.method_49637(class05363.y().M, 0.0, class05363.y().Z);
      var7.L(class00429.i, (var1x, var2) -> {
         if (class07209.method_19771(var1x.method_24515(), 160.0)) {
            for (int i = 0; i < var2.N().size(); i++) {
               class00452 class00452 = var2.N().get(i);
               double d0 = var1x.method_31477() + 0.5;
               double d1 = var1x.method_23318() + 2.0 + i * 0.25;
               double d2 = var1x.method_31479() + 0.5;
               int j = class00452.y() ? -16711936 : -3355444;
               class06724.N(class00452.L(), new class06889(d0, d1, d2), class06715.N(j));
            }
         }
      });
   }
}
