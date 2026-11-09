package minecraft;

import com.mojang.serialization.MapCodec;

public class class08425 extends class00864 {
   public static final MapCodec<class08425> N = y(class08425::new);
   private static final class00494 y = class00891.y(14.0, 0.0, 12.0);

   public class08425(class01362 var1) {
      super(var1);
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      class00500 class00500 = var2.method_8320(var3);
      return class00500.N(class00869.ij) || class00500.N(class00869.Lr) || class00500.N(var2, var3, class07211.field_11036, class01020.field_25823);
   }

   @Override
   public MapCodec<? extends class08425> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }
}
