package minecraft;

import java.util.List;

public class class05687 implements class01857 {
   private static final int N = 160;
   private static final float y = 0.64F;
   private final class06202 L;

   public class05687(class06202 var1) {
      super();
      this.L = var1;
   }

   private static void N(String var0, class07209 var1, int var2) {
      class06724.N(var0, class06889.N(var1, 0.5, 1.3, 0.5), class06715.y(var2).N(0.64F)).N();
   }

   private class05363 N() {
      return ((class03386)this.L.i_5).s();
   }

   private static void N(class07209 var0) {
      class06724.N(var0, class06747.y(class02566.N(0.15F, 1.0F, 0.0F, 0.0F)));
      N("Raid center", var0, -65536);
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class07209 class07209 = this.N().u();
      var7.N(class00429.E, (var1x, var2) -> {
         for (class07209 class07209x : var2) {
            if (class07209.method_19771(class07209x, 160.0)) {
               N(class07209x);
            }
         }
      });
   }
}
