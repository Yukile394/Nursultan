package minecraft;

import com.mojang.serialization.MapCodec;

public class class00635 extends class00864 implements class00873 {
   public static final MapCodec<class00635> N = y(class00635::new);
   private static final class00494 y = class00891.y(12.0, 0.0, 13.0);

   public class00635(class01362 var1) {
      super(var1);
   }

   private static class06761 U(class00500 var0) {
      return (class06761)(var0.N(class00869.yY) ? class00869.zk : class00869.zw);
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class06761.N(var1, U(var4).W(), var3, 2);
   }

   @Override
   public MapCodec<class00635> N() {
      return N;
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return U(var3).W().N(var1, var2) && var1.R(var2.method_10084());
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }
}
