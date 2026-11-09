package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class class03560 extends class06391<class06225> {
   public class03560(Codec<class06225> var1) {
      super(var1);
   }

   protected boolean y(class07284 var1, class06069 var2, class07209 var3, class00500 var4) {
      class07209 class07209x = var3.method_10084();
      class00500 class00500 = var1.method_8320(var3);
      if ((class00500.N(class00869.K) || class00500.N(class01210.NK)) && var1.method_8320(class07209x).N(class00869.K)) {
         var1.method_8652(var3, var4, 3);
         if (var2.z() < 0.25F) {
            class04206.i.N(class01210.NK, var2).map(class03556::N).ifPresent(var2x -> var1.method_8652(class07209x, var2x.W(), 2));
         } else if (var2.z() < 0.05F) {
            var1.method_8652(class07209x, class00869.mA.W().y(class06996.L, var2.y(4) + 1), 2);
         }

         for (class07211 class07211 : class07221.field_11062) {
            if (var2.z() < 0.2F) {
               class07209 class07209x = var3.method_10093(class07211);
               if (var1.method_8320(class07209x).N(class00869.K)) {
                  class04206.i.N(class01210.No, var2).map(class03556::N).ifPresent(var3x -> {
                     class00500 class00500x = var3x.W();
                     if (class00500x.y(class07774.L)) {
                        class00500x = class00500x.y(class07774.L, class07211);
                     }

                     var1.method_8652(class07209, class00500x, 2);
                  });
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean N(class06058<class06225> var1) {
      class06069 class06069 = var1.u();
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      Optional optional = class04206.i.N(class01210.NJ, class06069).map(class03556::N);
      return optional.isEmpty() ? false : this.N(class05974, class06069, class07209, ((class00891)optional.get()).W());
   }

   protected abstract boolean N(class07284 var1, class06069 var2, class07209 var3, class00500 var4);
}
