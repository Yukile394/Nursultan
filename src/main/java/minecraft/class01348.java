package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;
import net.fabricmc.fabric.mixin.content.registry.WorkAtComposterAccessor;

public class class01348 extends class05735 implements WorkAtComposterAccessor {
   private static List<class06581> N = ImmutableList.of(class06570.by, class06570.lk);

   private void L(class04782 var1, class08041 var2) {
      class07075 class07075 = var2.n();
      if (class07075.N_61(class06570.bu) <= 36) {
         int i = class07075.N_61(class06570.bL);
         byte b0 = 3;
         byte b1 = 3;
         int j = Math.min(3, i / 3);
         if (j != 0) {
            int k = j * 3;
            class07075.N(class06570.bL, k);
            class06584 class06584 = class07075.N(new class06584(class06570.bu, j));
            if (!class06584.R()) {
               var2.method_5699(var1, class06584, 0.5F);
            }
         }
      }
   }

   public class01348() {
      super();
   }

   @Override
   protected void y(class04782 var1, class08041 var2) {
      Optional<class06289> optional = var2.method_18868().L(class05378.L);
      if (!optional.isEmpty()) {
         class06289 class06289 = optional.get();
         class00500 class00500 = var1.method_8320(class06289.y());
         if (class00500.N(class00869.TL)) {
            this.L(var1, var2);
            this.N(var1, var2, class06289, class00500);
         }
      }
   }

   private void N(class04782 var1, class08041 var2, class06289 var3, class00500 var4) {
      class07209 class07209 = var3.y();
      if (var4.L(class05836.i) == 8) {
         var4 = class05836.N(var2, var4, (class07299)var1, class07209);
      }

      int i = 20;
      byte b0 = 10;
      int[] aint = new int[N.size()];
      class07075 class07075 = var2.n();
      int j = class07075.method_5439();
      class00500 class00500 = var4;

      for (int k = j - 1; k >= 0 && i > 0; k--) {
         class06584 class06584 = class07075.method_5438(k);
         int l = N.indexOf(class06584.B());
         if (l != -1) {
            int i1 = class06584.c();
            int j1 = aint[l] + i1;
            aint[l] = j1;
            int k1 = Math.min(Math.min(j1 - 10, i), i1);
            if (k1 > 0) {
               i -= k1;

               for (int l1 = 0; l1 < k1; l1++) {
                  class00500 = class05836.N(var2, class00500, var1, class06584, class07209);
                  if (class00500.L(class05836.i) == 7) {
                     this.N(var1, var4, class07209, class00500);
                     return;
                  }
               }
            }
         }
      }

      this.N(var1, var4, class07209, class00500);
   }

   private void N(class04782 var1, class00500 var2, class07209 var3, class00500 var4) {
      var1.N(1500, var3, var4 != var2 ? 1 : 0);
   }
}
