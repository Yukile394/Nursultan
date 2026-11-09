package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;

public class class01152 extends class06391<class01165> {
   public class01152(Codec<class01165> var1) {
      super(var1);
   }

   private void N(class05974 var1, class07209 var2, class01168 var3, class01183 var4) {
      var1.method_8652(var4.N(var2.method_33096(var3.i() - 1)), class00869.Lx.W(), 2);
      var1.method_8652(var4.N(var2.method_33096(var3.R() + 1)), class00869.Lb.W(), 2);

      for (class07218 class07218 = var2.method_33096(var3.R() + 2).method_25503();
         class07218.method_10264() < var3.i() - 1;
         class07218.N(class07211.field_11036)
      ) {
         class07209 class07209 = var4.N(class07218);
         if (class01175.N(var1, class07209) || var1.method_8320(class07209).N(class00869.vF)) {
            var1.method_8652(class07209, class00869.BO.W(), 2);
         }
      }
   }

   private static class01153 N(class07209 var0, boolean var1, class06069 var2, int var3, class06052 var4, class06052 var5) {
      return new class01153(var0, var1, var3, var4.N(var2), var5.N(var2));
   }

   @Override
   public boolean N(class06058<class01165> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209 = var1.i();
      class01165 class01165 = (class01165)var1.R();
      class06069 class06069 = var1.u();
      if (!class01175.N(class05974, class07209)) {
         return false;
      } else {
         Optional<class01191> optional = class01191.N(class05974, class07209, class01165.y, class01175::L, class01175::N);
         if (!optional.isEmpty() && optional.get() instanceof class01168) {
            class01168 class01168 = (class01168)optional.get();
            if (class01168.M() < 4) {
               return false;
            } else {
               int i = class04995.N((int)(class01168.M() * class01165.i), class01165.L.y(), class01165.L.L());
               int j = class04995.y(class06069, class01165.L.y(), i);
               class01153 class01153x = N(class07209.method_33096(class01168.i() - 1), false, class06069, j, class01165.M, class01165.u);
               class01153 class01153x = N(class07209.method_33096(class01168.R() + 1), true, class06069, j, class01165.B, class01165.u);
               class01183 class01183;
               if (class01153x.N(class01165) && class01153x.N(class01165)) {
                  class01183 = new class01183(class07209.method_10264(), class06069, class01165.Z);
               } else {
                  class01183 = class01183.N();
               }

               boolean flag = class01153x.N(class05974, class01183);
               boolean flag1 = class01153x.N(class05974, class01183);
               if (flag) {
                  class01153x.N(class05974, class06069, class01183);
               }

               if (flag1) {
                  class01153x.N(class05974, class06069, class01183);
               }

               if (class07529.h) {
                  this.N(class05974, class07209, class01168, class01183);
               }

               return true;
            }
         } else {
            return false;
         }
      }
   }
}
