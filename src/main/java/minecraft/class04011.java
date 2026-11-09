package minecraft;

import java.util.Optional;

public class class04011 {
   public class04011() {
      super();
   }

   public static <T extends class07079> Optional<T> N(
      class07078<T> var0, class06113 var1, class04782 var2, class07209 var3, int var4, int var5, int var6, class04000 var7, boolean var8
   ) {
      class07218 class07218 = var3.method_25503();

      for (int i = 0; i < var4; i++) {
         int j = class04995.y(var2.field_9229, -var5, var5);
         int k = class04995.y(var2.field_9229, -var5, var5);
         class07218.N(var3, j, var6, k);
         if (var2.method_8621().N(class07218)
            && N(var2, var6, class07218, var7)
            && (!var8 || var2.y(var0.N(class07218.method_10263() + 0.5, class07218.method_10264(), class07218.method_10260() + 0.5)))) {
            class07079 class07079 = (class07079)var0.y(var2, null, class07218, var1, false, false);
            if (class07079 != null) {
               if (class07079.N(var2, var1) && class07079.N((class05487)var2)) {
                  var2.y(class07079);
                  class07079.D();
                  return Optional.of((T)class07079);
               }

               class07079.method_31472();
            }
         }
      }

      return Optional.empty();
   }

   private static boolean N(class04782 var0, int var1, class07218 var2, class04000 var3) {
      class07218 class07218 = new class07218().N(var2);
      class00500 class00500x = var0.method_8320(class07218);

      for (int i = var1; i >= -var1; i--) {
         var2.N(class07211.field_11033);
         class07218.N(var2, class07211.field_11036);
         class00500 class00500x = var0.method_8320(var2);
         if (var3.canSpawnOn(var0, var2, class00500x, class07218, class00500x)) {
            var2.N(class07211.field_11036);
            return true;
         }

         class00500x = class00500x;
      }

      return false;
   }
}
