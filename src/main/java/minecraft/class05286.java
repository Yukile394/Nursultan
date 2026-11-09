package minecraft;

import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public class class05286 extends class06391<class01041> {
   public class05286(Codec<class01041> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class01041> var1) {
      class01041 class01041 = (class01041)var1.R();
      class05974 class05974 = var1.y();
      class06069 class06069 = var1.u();
      class00891 class00891 = class01041.y.i();
      class07209 class07209x = N(
         class05974, var1.i().method_25503().N(class07185.field_11052, class05974.method_31607() + 1, class05974.method_31600()), class00891
      );
      if (class07209x == null) {
         return false;
      } else {
         int i = class01041.N().N(class06069);
         int j = class01041.N().N(class06069);
         int k = class01041.N().N(class06069);
         int l = Math.max(i, Math.max(j, k));
         boolean flag = false;

         for (class07209 class07209x : class07209.method_25996(class07209x, i, j, k)) {
            if (class07209x.method_19455(class07209x) > l) {
               break;
            }

            if (class05974.method_8320(class07209x).N(class00891)) {
               this.N(class05974, class07209x, class01041.L);
               flag = true;
            }
         }

         return flag;
      }
   }

   @Nullable
   private static class07209 N(class07284 var0, class07218 var1, class00891 var2) {
      while (var1.method_10264() > var0.method_31607() + 1) {
         if (var0.method_8320(var1).N(var2)) {
            return var1;
         }

         var1.N(class07211.field_11033);
      }

      return null;
   }
}
