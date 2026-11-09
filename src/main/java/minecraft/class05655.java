package minecraft;

import java.util.Optional;

public class class05655 implements class05663 {
   private final int N;
   private final class03530<class07304> y;
   private final int L;
   private final int u;

   public class05655(int var1, class03530<class07304> var2) {
      this(var1, 0, Integer.MAX_VALUE, var2);
   }

   public class05655(int var1, int var2, int var3, class03530<class07304> var4) {
      super();
      this.L = var2;
      this.u = var3;
      this.N = var1;
      this.y = var4;
   }

   @Override
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      Optional optional = var1.method_30349().L(class04227.yR).N(this.y, var3);
      int i;
      class06584 class06584;
      if (!optional.isEmpty()) {
         class03556 class03556 = (class03556)optional.get();
         class07304 class07304 = (class07304)class03556.N();
         int j = Math.max(class07304.u(), this.L);
         int k = Math.min(class07304.i(), this.u);
         int l = class04995.N(var3, j, k);
         class06584 = class07323.N(new class07317(class03556, l));
         i = 2 + var3.y(5 + l * 10) + 3 * l;
         if (class03556.N(class02625.z)) {
            i *= 2;
         }

         if (i > 64) {
            i = 64;
         }
      } else {
         i = 1;
         class06584 = new class06584(class06570.jY);
      }

      return new class07324(new class02680(class06570.Ty, i), Optional.of(new class02680(class06570.jY)), class06584, 12, this.N, 0.2F);
   }
}
