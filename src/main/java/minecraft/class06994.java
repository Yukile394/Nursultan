package minecraft;

import com.mojang.serialization.MapCodec;

public class class06994 extends class00891 {
   public static final MapCodec<class06994> y = y(class06994::new);
   public static final class06667 L = class06665.g;

   public class06994(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, false));
   }

   protected static boolean U(class00500 var0) {
      return var0.N(class01210.yH);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   protected MapCodec<? extends class06994> N() {
      return y;
   }

   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = var1.method_8045().method_8320(var1.method_8037().method_10084());
      return this.W().y(L, U(class00500));
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == class07211.field_11036 ? var1.y(L, U(var7)) : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
