package minecraft;

import com.mojang.serialization.Codec;

public class class06011 extends class06391<class06225> {
   private static final class07211[] NE = class07211.values();

   public class06011(Codec<class06225> var1) {
      super(var1);
   }

   private void y(class07284 var1, class06069 var2, class07209 var3) {
      class07218 class07218 = new class07218();

      for (int i = 0; i < 100; i++) {
         class07218.N(var3, var2.y(8) - var2.y(8), var2.y(2) - var2.y(7), var2.y(8) - var2.y(8));
         if (var1.R(class07218)) {
            class00500 class00500 = var1.method_8320(class07218.method_10084());
            if (class00500.N(class00869.id) || class00500.N(class00869.EJ)) {
               int j = class04995.N(var2, 1, 8);
               if (var2.y(6) == 0) {
                  j *= 2;
               }

               if (var2.y(5) == 0) {
                  j = 1;
               }

               byte b0 = 17;
               byte b1 = 25;
               N(var1, var2, class07218, j, 17, 25);
            }
         }
      }
   }

   private void N(class07284 var1, class06069 var2, class07209 var3) {
      var1.method_8652(var3, class00869.EJ.W(), 2);
      class07218 class07218x = new class07218();
      class07218 class07218x = new class07218();

      for (int i = 0; i < 200; i++) {
         class07218x.N(var3, var2.y(6) - var2.y(6), var2.y(2) - var2.y(5), var2.y(6) - var2.y(6));
         if (var1.R(class07218x)) {
            int j = 0;
            int k = NE.length;

            for (int l = 0; l < k; l++) {
               class07211 class07211 = NE[l];
               class00500 class00500 = var1.method_8320(class07218x.N(class07218x, class07211));
               if (class00500.N(class00869.id) || class00500.N(class00869.EJ)) {
                  j++;
               }

               if (j > 1) {
                  break;
               }
            }

            if (j == 1) {
               var1.method_8652(class07218x, class00869.EJ.W(), 2);
            }
         }
      }
   }

   public static void N(class07284 var0, class06069 var1, class07218 var2, int var3, int var4, int var5) {
      for (int i = 0; i <= var3; i++) {
         if (var0.R(var2)) {
            if (i == var3 || !var0.R(var2.method_10074())) {
               var0.method_8652(var2, class00869.sl.W().y(class04983.i, class04995.N(var1, var4, var5)), 2);
               break;
            }

            var0.method_8652(var2, class00869.sd.W(), 2);
         }

         var2.N(class07211.field_11033);
      }
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      class06069 class06069 = var1.u();
      if (!class05974.R(class07209)) {
         return false;
      } else {
         class00500 class00500 = class05974.method_8320(class07209.method_10084());
         if (!class00500.N(class00869.id) && !class00500.N(class00869.EJ)) {
            return false;
         } else {
            this.N(class05974, class06069, class07209);
            this.y(class05974, class06069, class07209);
            return true;
         }
      }
   }
}
