package minecraft;

import com.mojang.serialization.Codec;

public class class01347 extends class06391<class04329> {
   public class01347(Codec<class04329> var1) {
      super(var1);
   }

   private static boolean N(class07284 var0, class07209 var1) {
      if (!var0.R(var1)) {
         return true;
      } else {
         class00500 class00500 = var0.method_8320(var1.method_10074());
         return !class00500.N(class00869.id) && !class00500.N(class00869.sE) && !class00500.N(class00869.sm);
      }
   }

   public static void N(class07284 var0, class06069 var1, class07218 var2, int var3, int var4, int var5) {
      for (int i = 1; i <= var3; i++) {
         if (var0.R(var2)) {
            if (i == var3 || !var0.R(var2.method_10084())) {
               var0.method_8652(var2, class00869.sw.W().y(class04983.i, class04995.N(var1, var4, var5)), 2);
               break;
            }

            var0.method_8652(var2, class00869.sk.W(), 2);
         }

         var2.N(class07211.field_11036);
      }
   }

   private static boolean N(class07284 var0, class07218 var1) {
      do {
         var1.y(0, -1, 0);
         if (var0.method_31606(var1)) {
            return false;
         }
      } while (var0.method_8320(var1).P());

      var1.y(0, 1, 0);
      return true;
   }

   @Override
   public boolean N(class06058<class04329> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      if (N(class05974, class07209)) {
         return false;
      } else {
         class06069 class06069 = var1.u();
         class04329 class04329 = (class04329)var1.R();
         int i = class04329.N();
         int j = class04329.y();
         int k = class04329.L();
         class07218 class07218 = new class07218();

         for (int l = 0; l < i * i; l++) {
            class07218.N(class07209).y(class04995.N(class06069, -i, i), class04995.N(class06069, -j, j), class04995.N(class06069, -i, i));
            if (N(class05974, class07218) && !N(class05974, (class07209)class07218)) {
               int i1 = class04995.N(class06069, 1, k);
               if (class06069.y(6) == 0) {
                  i1 *= 2;
               }

               if (class06069.y(5) == 0) {
                  i1 = 1;
               }

               byte b0 = 17;
               byte b1 = 25;
               N(class05974, class06069, class07218, i1, 17, 25);
            }
         }

         return true;
      }
   }
}
