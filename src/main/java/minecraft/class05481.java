package minecraft;

import com.mojang.serialization.MapCodec;

public class class05481 extends class05439 {
   public static final MapCodec<class05481> y = y(class05481::new);
   public static final int L = 5;
   private static final class07211[] u = class07211.values();

   public class05481(class01362 var1) {
      super(var1);
   }

   public static boolean U(class00500 var0) {
      return var0.P() || var0.N(class00869.K) && var0.Y().R() == 8;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var4.y(5) == 0) {
         class07211 class07211 = u[var4.y(u.length)];
         class07209 class07209 = var3.method_10093(class07211);
         class00500 class00500x = var2.method_8320(class07209);
         class00891 class00891 = null;
         if (U(class00500x)) {
            class00891 = class00869.bd;
         } else if (class00500x.N(class00869.bd) && class00500x.L(class05453.u) == class07211) {
            class00891 = class00869.bl;
         } else if (class00500x.N(class00869.bl) && class00500x.L(class05453.u) == class07211) {
            class00891 = class00869.bG;
         } else if (class00500x.N(class00869.bG) && class00500x.L(class05453.u) == class07211) {
            class00891 = class00869.bt;
         }

         if (class00891 != null) {
            class00500 class00500x = class00891.W().y(class05453.u, class07211).y(class05453.L, class00500x.Y().N() == class04684.L);
            var2.method_8501(class07209, class00500x);
         }
      }
   }

   @Override
   public MapCodec<class05481> N() {
      return y;
   }
}
