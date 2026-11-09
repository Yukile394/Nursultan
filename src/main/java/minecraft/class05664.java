package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05664 implements class05663 {
   private final class02692 N;
   private final int y;
   private final float L;

   public class05664(class03556<class07084> var1, int var2, int var3) {
      this(new class02692(List.of(new class02679(var1, var2))), var3, 0.05F);
   }

   public class05664(class02692 var1, int var2, float var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Nullable
   @Override
   public class07324 N(class04782 var1, class07049 var2, class06069 var3) {
      class06584 class06584 = new class06584(class06570.dk, 1);
      class06584.N(class02484.NN, this.N);
      return new class07324(new class02680(class06570.Ty), class06584, 12, this.y, this.L);
   }
}
