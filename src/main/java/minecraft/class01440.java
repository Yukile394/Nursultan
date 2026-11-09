package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;

public class class01440 extends class01474 {
   public static final MapCodec<class01440> N = class01471.N.fieldOf("provider").xmap(class01440::new, var0 -> var0.L);
   private final class01471 L;

   public class01440(class01471 var1) {
      super();
      this.L = var1;
   }

   private void y(class05894 var1, class07209 var2) {
      for (int i = 2; i >= -3; i--) {
         class07209 class07209 = var2.method_10086(i);
         if (class06391.u(var1.N(), class07209)) {
            var1.N(class07209, this.L.N(var1.y(), var2));
            break;
         }

         if (!var1.N(class07209) && i < 0) {
            break;
         }
      }
   }

   private void N(class05894 var1, class07209 var2) {
      for (int i = -2; i <= 2; i++) {
         for (int j = -2; j <= 2; j++) {
            if (Math.abs(i) != 2 || Math.abs(j) != 2) {
               this.y(var1, var2.method_10069(i, 0, j));
            }
         }
      }
   }

   @Override
   protected class05930<?> N() {
      return class05930.M;
   }

   @Override
   public void N(class05894 var1) {
      List<class07209> list = class03194.N(var1);
      if (!list.isEmpty()) {
         int i = list.get(0).method_10264();
         list.stream().filter(var1x -> var1x.method_10264() == i).forEach(var2x -> {
            this.N(var1, var2x.method_10067().method_10095());
            this.N(var1, var2x.method_10089(2).method_10095());
            this.N(var1, var2x.method_10067().method_10077(2));
            this.N(var1, var2x.method_10089(2).method_10077(2));

            for (int ix = 0; ix < 5; ix++) {
               int j = var1.y().y(64);
               int k = j % 8;
               int l = j / 8;
               if (k == 0 || k == 7 || l == 0 || l == 7) {
                  this.N(var1, var2x.method_10069(-3 + k, 0, -3 + l));
               }
            }
         });
      }
   }
}
