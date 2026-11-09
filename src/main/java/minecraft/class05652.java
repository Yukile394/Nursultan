package minecraft;

import java.util.Optional;
import java.util.stream.Collectors;

public class class05652 implements class05663 {
   private final class06584 N;
   private final int y;
   private final int L;
   private final int u;
   private final int i;
   private final class06581 R;
   private final int M;
   private final float B;

   public class05652(class06581 var1, int var2, class06581 var3, int var4, int var5, int var6, int var7) {
      super();
      this.N = new class06584(var3);
      this.L = var5;
      this.u = var6;
      this.i = var7;
      this.R = var1;
      this.M = var2;
      this.y = var4;
      this.B = 0.05F;
   }

   @Override
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      class02680 class02680 = new class02680(class06570.Ty, this.L);
      class03556 class03556 = class07536.N_77(
         class04206.Z.z().filter(var1x -> !var1x.N().N().isEmpty() && var1.method_59547().N(var1x)).collect(Collectors.toList()), var3
      );
      class06584 class06584 = new class06584(this.N.B(), this.y);
      class06584.N(class02484.h, new class06517(class03556));
      return new class07324(class02680, Optional.of(new class02680(this.R, this.M)), class06584, this.u, this.i, this.B);
   }
}
