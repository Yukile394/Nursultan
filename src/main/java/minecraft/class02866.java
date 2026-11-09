package minecraft;

import org.jspecify.annotations.Nullable;

class class02866 implements class02875 {
   class02866() {
      super();
   }

   @Override
   public class07209 N(class05487 var1, class07209 var2) {
      class07209 class07209 = var2.method_10074();
      return var1.method_8320(class07209).N(class08791.field_50) ? class07209 : var2;
   }

   private boolean N(class05487 var1, class07209 var2, class07078<?> var3) {
      class00500 class00500 = var1.method_8320(var2);
      return class00803.N(var1, var2, class00500, class00500.Y(), var3);
   }

   @Override
   public boolean isSpawnPositionOk(class05487 var1, class07209 var2, @Nullable class07078<?> var3) {
      if (var3 != null && var1.method_8621().N(var2)) {
         class07209 class07209x = var2.method_10084();
         class07209 class07209x = var2.method_10074();
         return !var1.method_8320(class07209x).N(var1, class07209x, var3) ? false : this.N(var1, var2, var3) && this.N(var1, class07209x, var3);
      } else {
         return false;
      }
   }
}
