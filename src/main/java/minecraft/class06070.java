package minecraft;

import com.mojang.serialization.Codec;
import java.util.OptionalInt;
import java.util.function.Predicate;

public class class06070 extends class06391<class06076> {
   private static boolean L(class00500 var0) {
      return var0.N(class00869.K) || var0.P();
   }

   public class06070(Codec<class06076> var1) {
      super(var1);
   }

   private boolean y(class05974 var1, class07209 var2) {
      if (!L(var1.method_8320(var2)) && !this.N(var1, var2.method_10074(), class07211.field_11036)) {
         for (class07211 class07211 : class07221.field_11062) {
            if (this.N(var1, var2.method_10093(class07211), class07211.b())) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean N(class07284 var1, class07209 var2, class07211 var3) {
      class00494 class00494 = var1.method_8320(var2).N(var3);
      return class00494 == class00389.N() || !class00891.N(class00494);
   }

   private static OptionalInt N(class05974 var0, class07209 var1, class06076 var2) {
      Predicate predicate = var0x -> var0x.N(class00869.K);
      Predicate predicate1 = var0x -> !var0x.N(class00869.K);
      return class01191.N(var0, var1, var2.y, predicate, predicate1).map(class01191::L).orElseGet(OptionalInt::empty);
   }

   @Override
   public boolean N(class06058<class06076> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209x = var1.i();
      class06076 class06076 = (class06076)var1.R();
      class06069 class06069 = var1.u();
      OptionalInt optionalint = N(class05974, class07209x, class06076);
      if (optionalint.isEmpty()) {
         return false;
      } else {
         class07209 class07209x = class07209x.method_33096(optionalint.getAsInt());
         class00753 class00753 = new class00753(class06076.L, class06076.L, class06076.L);
         return class07209.method_23627(class05163.N(class07209x.method_10059(class00753), class07209x.method_10081(class00753)))
               .filter(var2x -> class06069.z() < class06076.u)
               .filter(var2x -> this.y(class05974, var2x))
               .mapToInt(var1x -> {
                  class05974.method_8652(var1x, class00869.EI.W(), 2);
                  return 1;
               })
               .sum()
            > 0;
      }
   }
}
