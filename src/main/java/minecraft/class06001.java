package minecraft;

import com.mojang.serialization.MapCodec;

public class class06001 extends class05989 {
   public static final MapCodec<class06001> N = y(class06001::new);

   public static boolean T(class00500 var0) {
      return var0.N(class01210.f);
   }

   public class06001(class01362 var1) {
      super(var1, 2.0F);
   }

   @Override
   protected boolean U(class00500 var1) {
      return true;
   }

   @Override
   public MapCodec<class06001> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return this.a_(var1, var2, var4) ? this.W() : class00869.N.W();
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return T(var2.method_8320(var3.method_10074()));
   }
}
