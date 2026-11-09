package minecraft;

import com.mojang.serialization.MapCodec;

public class class08422 extends class00864 implements class00873 {
   private static final double y = 0.7;
   private static final double L = 10.0;
   private static final double u = 5.0;
   private static final int i = 13;
   private static final int R = 30;
   public static final MapCodec<class08422> N = y(class08422::new);

   public class08422(class01362 var1) {
      super(var1);
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class00873.N((class07299)var1, var3, var4).ifPresent(var2x -> var1.method_8501(var2x, this.W()));
   }

   @Override
   protected MapCodec<? extends class08422> N() {
      return N;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return class00873.a_(var1, var2, var3);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var4.y(30) == 0 && var2.method_75728().N(class00608.d, var3) && var2.y(class07830.field_13203, var3) <= var3.method_10264()) {
         var2.method_45446(var3, class04909.Ud, class04911.field_15256, 1.0F, 1.0F, false);
      }

      if (var2.U(var3) <= 13 && var4.U() <= 0.7) {
         double d0 = var3.method_10263() + var4.U() * 10.0 - 5.0;
         double d1 = var3.method_10264() + var4.U() * 5.0;
         double d2 = var3.method_10260() + var4.U() * 10.0 - 5.0;
         var2.method_8406(class07107.yU, d0, d1, d2, 0.0, 0.0, 0.0);
      }
   }
}
