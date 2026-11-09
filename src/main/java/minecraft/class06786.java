package minecraft;

import com.mojang.serialization.MapCodec;

public class class06786 extends class00864 {
   public static final MapCodec<class06786> y = y(class06786::new);
   private static final class00494 N = class00891.y(12.0, 0.0, 13.0);

   public class06786(class01362 var1) {
      super(var1);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      class08402.L(var2, var3, var4);
   }

   @Override
   public MapCodec<? extends class06786> N() {
      return y;
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class01210.LQ);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return N;
   }
}
