package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public class class02722 extends class06391<class02673> {
   public class02722(Codec<class02673> var1) {
      super(var1);
   }

   private static void N(class07209 var0, int var1, class05974 var2, class02673 var3, class06069 var4) {
      int i = var0.method_10263();
      int j = var0.method_10260();
      class07218 class07218 = var0.method_25503();

      for (int k = var0.method_10264(); k < var1; k++) {
         N(var2, var3, var4, i, j, class07218.N(i, k, j));
      }
   }

   private static void N(class05974 var0, class02673 var1, class06069 var2, int var3, int var4, class07218 var5) {
      int i = var1.u;
      Predicate predicate = var1x -> var1x.N(var1.i);

      for (int j = 0; j < var1.B; j++) {
         var5.N(var5, var2.y(i) - var2.y(i), 0, var2.y(i) - var2.y(i));
         if (predicate.test(var0.method_8320(var5))) {
            var0.method_8652(var5, var1.M.N(var2, var5), 2);
         }

         var5.method_20787(var3);
         var5.method_20788(var4);
      }
   }

   private static void N(class05974 var0, class02673 var1, class06069 var2, class07209 var3, class07218 var4) {
      int i = var1.z;
      int j = var1.U;

      for (int k = 0; k < var1.W; k++) {
         var4.N(var3, var2.y(i) - var2.y(i), var2.y(j) - var2.y(j), var2.y(i) - var2.y(i));
         if (var0.R(var4)) {
            class00500 class00500 = var1.E.N(var2, var4);
            if (class00500.N(var0, var4) && var0.method_8320(var4.method_10084()).L(var0, var4, class07211.field_11033)) {
               var0.method_8652(var4, class00500, 2);
            }
         }
      }
   }

   @Override
   public boolean N(class06058<class02673> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209x = var1.i();
      if (!class05974.method_8320(class07209x).P()) {
         return false;
      } else {
         class06069 class06069 = var1.u();
         class07209 class07209x = var1.i();
         class02673 class02673 = (class02673)var1.R();
         class07218 class07218 = class07209x.method_25503();
         if (N(class05974, var1.L(), class02673, class06069, class07218, class07209x)) {
            N(class05974, class02673, class06069, class07209x, class07218);
         }

         return true;
      }
   }

   private static boolean N(class05974 var0, class02673 var1, class07209 var2) {
      class07218 class07218 = var2.method_25503();

      for (int i = 1; i <= var1.L; i++) {
         class07218.N(class07211.field_11036);
         if (!N(var0.method_8320(class07218), i, var1.m)) {
            return false;
         }
      }

      return true;
   }

   private static boolean N(class00500 var0, int var1, int var2) {
      return var0.P() ? true : var1 + 1 <= var2 && var0.Y().N(class01231.N);
   }

   private static boolean N(class05974 var0, class08088 var1, class02673 var2, class06069 var3, class07218 var4, class07209 var5) {
      for (int i = 0; i < var2.Z; i++) {
         var4.N(class07211.field_11036);
         if (var2.P.test(var0, var4) && N(var0, var2, var4)) {
            class07209 class07209 = var4.method_10074();
            if (var0.method_8316(class07209).N(class01231.y) || !var0.method_8320(class07209).B()) {
               return false;
            }

            if (var2.y.N().N(var0, var1, var3, var4)) {
               N(var5, var5.method_10264() + i, var0, var2, var3);
               return true;
            }
         }
      }

      return false;
   }
}
