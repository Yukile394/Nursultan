package minecraft;

import Nursultan.class09376;
import Nursultan.class09377;

public class class00618 {
   private static final int N = 2;
   private static final int y = 6;
   private static final double[] L = new double[]{0.0, 1.0, 4.0, 6.0, 4.0, 1.0, 0.0};

   public class00618() {
      super();
   }

   public static <V> void N(class06889 var0, class09377<V> var1, class09376<V> var2) {
      var0 = var0.N(0.5, 0.5, 0.5);
      int i = class04995.N(var0.N());
      int j = class04995.N(var0.y());
      int k = class04995.N(var0.L());
      double d0 = var0.N() - i;
      double d1 = var0.y() - j;
      double d2 = var0.L() - k;

      for (int l = 0; l < 6; l++) {
         double d3 = class04995.u(d2, L[l + 1], L[l]);
         int i1 = k - 2 + l;

         for (int j1 = 0; j1 < 6; j1++) {
            double d4 = class04995.u(d0, L[j1 + 1], L[j1]);
            int k1 = i - 2 + j1;

            for (int l1 = 0; l1 < 6; l1++) {
               double d5 = class04995.u(d1, L[l1 + 1], L[l1]);
               int i2 = j - 2 + l1;
               double d6 = d4 * d5 * d3;
               Object object = var1.get(k1, i2, i1);
               var2.accumulate(d6, object);
            }
         }
      }
   }
}
