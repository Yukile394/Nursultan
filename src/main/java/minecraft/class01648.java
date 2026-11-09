package minecraft;

import java.util.HashMap;
import java.util.Map.Entry;

public class class01648 implements class01857 {
   public class01648() {
      super();
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      int i = class00429.P.L();
      double d0 = 1.0 / (i * 2);
      HashMap hashmap = new HashMap();
      var7.N(class00429.P, (var1x, var2, var3x) -> {
         long j = var3x - var2;
         class01634 class01634xx = hashmap.getOrDefault(var1x, class01634.L);
         hashmap.put(var1x, class01634xx.N((int)j));
      });

      for (Entry entry : hashmap.entrySet()) {
         class07209 class07209x = (class07209)entry.getKey();
         class01634 class01634x = (class01634)entry.getValue();
         class06724.N(new class00734(class07209x).M(0.002).B(d0 * class01634x.y()), class06747.N(-1));
      }

      for (Entry entry1 : hashmap.entrySet()) {
         class07209 class07209 = (class07209)entry1.getKey();
         class01634 class01634 = (class01634)entry1.getValue();
         class06724.N(String.valueOf(class01634.N()), class06889.y(class07209), class06715.N());
      }
   }
}
