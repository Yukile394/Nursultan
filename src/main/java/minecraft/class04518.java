package minecraft;

import java.util.Map;

public class class04518 extends class05765<class04508> {
   public class04518() {
      super(
         Map.of(
            class05378.s,
            class05367.field_18456,
            class05378.m,
            class05367.field_18457,
            class05378.yR,
            class05367.field_18457,
            class05378.yM,
            class05367.field_18457
         )
      );
   }

   private static class06889 N(class04508 var0, class07438 var1) {
      class06889 class06889x = var1.method_73189().u(var0.method_73189());
      double d0 = class06889x.M() - class04995.u(var0.method_59922().U(), 8.0, 4.0);
      class06889 class06889x = class06889x.u().u(d0, d0, d0);
      return var0.method_73189().i(class06889x);
   }

   protected boolean N(class04782 var1, class04508 var2) {
      return var2.method_24828() && !var2.method_5799() && var2.method_18376() == class01312.field_18076;
   }

   protected void u(class04782 var1, class04508 var2, long var3) {
      class07438 class07438 = var2.method_18868().L(class05378.s).orElse(null);
      if (class07438 != null) {
         boolean flag = var2.y(class07438.method_73189());
         class06889 class06889x = null;
         if (flag) {
            class06889 class06889x = class05475.N(var2, 5, 5, class07438.method_73189());
            if (class06889x != null
               && class03847.N(var2, class06889x)
               && class07438.method_5649(class06889x.M, class06889x.B, class06889x.Z) > class07438.method_5858(var2)) {
               class06889x = class06889x;
            }
         }

         if (class06889x == null) {
            class06889x = var2.method_59922().Z() ? class03847.N(class07438, var2.method_59922()) : N(var2, class07438);
         }

         var2.method_18868().N(class05378.m, new class05352(class07209.method_49638(class06889x), 0.6F, 1));
      }
   }
}
