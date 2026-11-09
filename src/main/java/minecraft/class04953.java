package minecraft;

import com.mojang.serialization.MapCodec;

public class class04953 extends class00891 {
   public static final MapCodec<class04953> N = y(class04953::new);

   public class04953(class01362 var1) {
      super(var1);
   }

   @Override
   public MapCodec<class04953> N() {
      return N;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var4.y(5) == 0) {
         class07211 class07211 = class07211.y(var4);
         if (class07211 != class07211.field_11036) {
            class07209 class07209 = var3.method_10093(class07211);
            class00500 class00500 = var2.method_8320(class07209);
            if (!var1.G() || !class00500.L(var2, class07209, class07211.b())) {
               double d0 = class07211.P() == 0 ? var4.U() : 0.5 + class07211.P() * 0.6;
               double d1 = class07211.s() == 0 ? var4.U() : 0.5 + class07211.s() * 0.6;
               double d2 = class07211.T() == 0 ? var4.U() : 0.5 + class07211.T() * 0.6;
               var2.method_8406(class07107.Nq, var3.method_10263() + d0, var3.method_10264() + d1, var3.method_10260() + d2, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
