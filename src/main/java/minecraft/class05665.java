package minecraft;

import java.util.Optional;

public class class05665 implements class05663 {
   private final class06584 N;
   private final int y;
   private final int L;
   private final int u;
   private final float i;

   public class05665(class06581 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 0.05F);
   }

   public class05665(class06581 var1, int var2, int var3, int var4, float var5) {
      super();
      this.N = new class06584(var1);
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }

   @Override
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      int ix = 5 + var3.y(15);
      class01042 class01042 = var1.method_30349();
      Optional optional = class01042.L(class04227.yR).N(class02625.W);
      class06584 class06584 = class07323.N(var3, new class06584(this.N.B()), ix, class01042, optional);
      int j = Math.min(this.y + ix, 64);
      class02680 class02680 = new class02680(class06570.Ty, j);
      return new class07324(class02680, class06584, this.L, this.u, this.i);
   }
}
