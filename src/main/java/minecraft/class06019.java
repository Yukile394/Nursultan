package minecraft;

import com.mojang.serialization.MapCodec;

public class class06019 extends class00864 {
   public static final MapCodec<class06019> N = y(class06019::new);
   private static final class00494 y = class00891.y(12.0, 0.0, 3.0);

   public class06019(class01362 var1) {
      super(var1);
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class01210.Nr) || var1.N(class00869.ik) || super.N(var1, var2, var3);
   }

   @Override
   public MapCodec<class06019> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }
}
