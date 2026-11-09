package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class05657 implements class05663 {
   private final class02680 N;
   private final int y;
   private final class06584 L;
   private final int u;
   private final int i;
   private final float R;
   private final Optional<class05946<class02530>> M;

   public class05657(class02680 var1, int var2, class06584 var3, int var4, int var5, float var6, Optional<class05946<class02530>> var7) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
   }

   class05657(class07310 var1, int var2, int var3, class07310 var4, int var5, int var6, int var7, float var8, class05946<class02530> var9) {
      this(new class02680(var1, var2), var3, new class06584(var4, var5), var6, var7, var8, Optional.of(var9));
   }

   private class05657(class07310 var1, int var2, int var3, class06584 var4, int var5, int var6, int var7, float var8) {
      this(new class02680(var1, var2), var3, var4.L(var5), var6, var7, var8, Optional.empty());
   }

   public class05657(class07310 var1, int var2, int var3, class06581 var4, int var5, int var6, int var7, float var8) {
      this(var1, var2, var3, new class06584(var4), var5, var6, var7, var8);
   }

   @Nullable
   @Override
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      class06584 class06584 = this.L.t();
      this.M.ifPresent(var4x -> class07323.N(class06584, var1.method_30349(), (class05946<class02530>)var4x, var1.method_8404(var2.method_24515()), var3));
      return new class07324(new class02680(class06570.Ty, this.y), Optional.of(this.N), class06584, 0, this.u, this.i, this.R);
   }
}
