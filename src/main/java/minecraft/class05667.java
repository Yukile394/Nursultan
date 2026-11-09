package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;

public class class05667 implements class05663 {
   private final class06581 N;
   private final int y;
   private final int L;
   private final int u;

   public class05667(class06581 var1, int var2) {
      this(var1, var2, 12, 1);
   }

   public class05667(class06581 var1, int var2, int var3, int var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   private static class06559 N(class06069 var0) {
      return class06559.N(class06563.N(var0.y(16)));
   }

   @Override
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      class02680 class02680 = new class02680(class06570.Ty, this.y);
      class06584 class06584 = new class06584(this.N);
      if (class06584.N(class01226.Lz)) {
         ArrayList arraylist = Lists.newArrayList();
         arraylist.add(N(var3));
         if (var3.z() > 0.7F) {
            arraylist.add(N(var3));
         }

         if (var3.z() > 0.8F) {
            arraylist.add(N(var3));
         }

         class06584 = class02816.N(class06584, arraylist);
      }

      return new class07324(class02680, class06584, this.L, this.u, 0.2F);
   }
}
