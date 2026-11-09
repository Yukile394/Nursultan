package minecraft;

import com.mojang.serialization.MapCodec;

public abstract class class07732 extends class06994 {
   private static boolean L(class00500 var0, class05487 var1, class07209 var2) {
      class07209 class07209 = var2.method_10084();
      return y(var0, var1, var2) && !var1.method_8316(class07209).N(class01231.N);
   }

   public class07732(class01362 var1) {
      super(var1);
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!y(var1, var2, var3)) {
         var2.method_8501(var3, class00869.z.W());
      } else {
         if (var2.U(var3.method_10084()) >= 9) {
            class00500 class00500 = this.W();

            for (int i = 0; i < 4; i++) {
               class07209 class07209 = var3.method_10069(var4.y(3) - 1, var4.y(5) - 3, var4.y(3) - 1);
               if (var2.method_8320(class07209).N(class00869.z) && L(class00500, var2, class07209)) {
                  var2.method_8501(class07209, class00500.y(L, U(var2.method_8320(class07209.method_10084()))));
               }
            }
         }
      }
   }

   private static boolean y(class00500 var0, class05487 var1, class07209 var2) {
      class07209 class07209 = var2.method_10084();
      class00500 class00500 = var1.method_8320(class07209);
      if (class00500.N(class00869.is) && class00500.L(class06999.L) == 1) {
         return true;
      } else {
         return class00500.Y().R() == 8 ? false : class05015.N(var0, class00500, class07211.field_11036, class00500.z()) < 15;
      }
   }

   @Override
   protected abstract MapCodec<? extends class07732> N();
}
