package minecraft;

import java.util.Iterator;

public class class01642 implements class01857 {
   private final class06202 N;

   public class01642(class06202 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class07299 class07299 = ((class04453)this.N.T_4).method_73183();
      class07209 class07209x = class07209.method_49637(var1, var3, var5);

      for (class07209 class07209x : class07209.method_10097(class07209x.method_10069(-6, -6, -6), class07209x.method_10069(6, 6, 6))) {
         class00500 class00500 = class07299.method_8320(class07209x);
         if (!class00500.N(class00869.N)) {
            Iterator<class00734> iterator = class00500.R(class07299, class07209x).method_1090().iterator();

            while (iterator.hasNext()) {
               class00734 class00734 = iterator.next().N(class07209x).M(0.002);
               int i = -2130771968;
               class06889 class06889x = class00734.B();
               class06889 class06889x = class00734.Z();
               N(class07209x, class00500, class07299, class07211.field_11039, class06889x, class06889x, -2130771968);
               N(class07209x, class00500, class07299, class07211.field_11035, class06889x, class06889x, -2130771968);
               N(class07209x, class00500, class07299, class07211.field_11034, class06889x, class06889x, -2130771968);
               N(class07209x, class00500, class07299, class07211.field_11043, class06889x, class06889x, -2130771968);
               N(class07209x, class00500, class07299, class07211.field_11033, class06889x, class06889x, -2130771968);
               N(class07209x, class00500, class07299, class07211.field_11036, class06889x, class06889x, -2130771968);
            }
         }
      }
   }

   private static void N(class07209 var0, class00500 var1, class07290 var2, class07211 var3, class06889 var4, class06889 var5, int var6) {
      if (var1.L(var2, var0, var3)) {
         class06724.N(var4, var5, var3, class06747.y(var6));
      }
   }
}
