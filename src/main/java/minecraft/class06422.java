package minecraft;

import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class class06422 extends class06391<class02670> {
   public class06422(Codec<class02670> var1) {
      super(var1);
   }

   private static int N(class05974 var0, class05163 var1) {
      MutableInt mutableint = new MutableInt(0);
      var1.N(var2x -> {
         class00500 class00500 = var0.method_8320(var2x);
         if (class00500.P() || class00500.N(class00869.V) || class00500.N(class00869.K)) {
            mutableint.add(1);
         }
      });
      return mutableint.intValue();
   }

   @Override
   public boolean N(class06058<class02670> var1) {
      class06069 class06069 = var1.u();
      class05974 class05974 = var1.y();
      class07209 class07209xx = var1.i();
      class06993 class06993 = class06993.N(class06069);
      class02670 class02670 = (class02670)var1.R();
      int i = class06069.y(class02670.y.size());
      class01224 class01224 = class05974.method_8410().method_8503().yv();
      class01207 class01207x = class01224.N(class02670.y.get(i));
      class01207 class01207x = class01224.N(class02670.L.get(i));
      class07321 class07321 = new class07321(class07209xx);
      class05163 class05163 = new class05163(
         class07321.i() - 16, class05974.method_31607(), class07321.R() - 16, class07321.M() + 16, class05974.method_31600(), class07321.B() + 16
      );
      class01233 class01233 = new class01233().N(class06993).N(class05163).N(class06069);
      class00753 class00753 = class01207x.N(class06993);
      class07209 class07209x = class07209xx.method_10069(-class00753.method_10263() / 2, 0, -class00753.method_10260() / 2);
      int j = class07209xx.method_10264();

      for (int k = 0; k < class00753.method_10263(); k++) {
         for (int l = 0; l < class00753.method_10260(); l++) {
            j = Math.min(j, class05974.method_8624(class07830.field_13195, class07209x.method_10263() + k, class07209x.method_10260() + l));
         }
      }

      int i1 = Math.max(j - 15 - class06069.y(10), class05974.method_31607() + 10);
      class07209 class07209xx = class01207x.N(class07209x.method_33096(i1), class07111.field_11302, class06993);
      if (N(class05974, class01207x.y(class01233, class07209xx)) > class02670.M) {
         return false;
      } else {
         class01233.y();
         class02670.u.N().N().forEach(class01233::N);
         class01207x.N(class05974, class07209xx, class07209xx, class01233, class06069, 260);
         class01233.y();
         class02670.i.N().N().forEach(class01233::N);
         class01207x.N(class05974, class07209xx, class07209xx, class01233, class06069, 260);
         return true;
      }
   }
}
