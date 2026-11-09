package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;

public class class01185 extends class06391<class01173> {
   public class01185(Codec<class01173> var1) {
      super(var1);
   }

   private static void N(class07284 var0, class06069 var1, class07209 var2, class01173 var3) {
      class01175.L(var0, var2);

      for (class07211 class07211 : class07221.field_11062) {
         if (!(var1.z() > var3.L)) {
            class07209 class07209xx = var2.method_10093(class07211);
            class01175.L(var0, class07209xx);
            if (!(var1.z() > var3.u)) {
               class07209 class07209x = class07209xx.method_10093(class07211.y(var1));
               class01175.L(var0, class07209x);
               if (!(var1.z() > var3.i)) {
                  class07209 class07209xx = class07209x.method_10093(class07211.y(var1));
                  class01175.L(var0, class07209xx);
               }
            }
         }
      }
   }

   private static Optional<class07211> N(class07284 var0, class07209 var1, class06069 var2) {
      boolean flag = class01175.y(var0.method_8320(var1.method_10084()));
      boolean flag1 = class01175.y(var0.method_8320(var1.method_10074()));
      if (flag && flag1) {
         return Optional.of(var2.Z() ? class07211.field_11033 : class07211.field_11036);
      } else if (flag) {
         return Optional.of(class07211.field_11033);
      } else {
         return flag1 ? Optional.of(class07211.field_11036) : Optional.empty();
      }
   }

   @Override
   public boolean N(class06058<class01173> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209x = var1.i();
      class06069 class06069 = var1.u();
      class01173 class01173 = (class01173)var1.R();
      Optional<class07211> optional = N(class05974, class07209x, class06069);
      if (optional.isEmpty()) {
         return false;
      } else {
         class07209 class07209x = class07209x.method_10093(optional.get().b());
         N(class05974, class06069, class07209x, class01173);
         int i = class06069.z() < class01173.y && class01175.L(class05974.method_8320(class07209x.method_10093(optional.get()))) ? 2 : 1;
         class01175.N(class05974, class07209x, optional.get(), i, false);
         return true;
      }
   }
}
