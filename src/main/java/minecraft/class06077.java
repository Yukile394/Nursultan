package minecraft;

import com.mojang.serialization.MapCodec;

public class class06077 extends class00891 {
   public static final MapCodec<class06077> N = y(class06077::new);
   private static final class00494 y = class00891.y(12.0, 13.0, 16.0);
   private static final int L = 14;
   private static final int u = 10;
   private static final int i = 10;

   public class06077(class01362 var1) {
      super(var1);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      int ix = var3.method_10263();
      int j = var3.method_10264();
      int k = var3.method_10260();
      double d0 = ix + var4.U();
      double d1 = j + 0.7;
      double d2 = k + var4.U();
      var2.method_8406(class07107.NO, d0, d1, d2, 0.0, 0.0, 0.0);
      class07218 class07218 = new class07218();

      for (int l = 0; l < 14; l++) {
         class07218.N(ix + class04995.N(var4, -10, 10), j - var4.y(10), k + class04995.N(var4, -10, 10));
         if (!var2.method_8320(class07218).W(var2, class07218)) {
            var2.method_8406(
               class07107.No, class07218.method_10263() + var4.U(), class07218.method_10264() + var4.U(), class07218.method_10260() + var4.U(), 0.0, 0.0, 0.0
            );
         }
      }
   }

   @Override
   public MapCodec<class06077> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == class07211.field_11036 && !this.a_(var1, var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return class00891.N_6(var2, var3.method_10084(), class07211.field_11033) && !var2.z(var3);
   }
}
