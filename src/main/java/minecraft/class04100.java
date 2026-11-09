package minecraft;

import com.mojang.serialization.Codec;

public class class04100 extends class06391<class04059> {
   public class04100(Codec<class04059> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class04059> var1) {
      class05974 class05974 = var1.y();
      class07209 class07209xx = var1.i();
      if (!this.N(class05974, class07209xx)) {
         return false;
      } else {
         class04059 class04059 = (class04059)var1.R();
         class06069 class06069 = var1.u();
         class04076 class04076 = class04076.y();
         int i = class04059.R() + class04059.i();

         for (int j = 0; j < i; j++) {
            for (int k = 0; k < class04059.N(); k++) {
               class04076.N(class07209xx, class04059.y());
            }

            boolean flag = j < class04059.R();

            for (int l = 0; l < class04059.L(); l++) {
               class04076.N(class05974, class07209xx, class06069, flag);
            }

            class04076.z();
         }

         class07209 class07209x = class07209xx.method_10074();
         if (class06069.z() <= class04059.B() && class05974.method_8320(class07209x).W(class05974, class07209x)) {
            class05974.method_8652(class07209xx, class00869.bC.W(), 3);
         }

         int i1 = class04059.M().N(class06069);

         for (int j1 = 0; j1 < i1; j1++) {
            class07209 class07209xx = class07209xx.method_10069(class06069.y(5) - 2, 0, class06069.y(5) - 2);
            if (class05974.method_8320(class07209xx).P()
               && class05974.method_8320(class07209xx.method_10074()).L(class05974, class07209xx.method_10074(), class07211.field_11036)) {
               class05974.method_8652(class07209xx, class00869.bS.W().y(class04007.u, true), 3);
            }
         }

         return true;
      }
   }

   private boolean N(class07284 var1, class07209 var2) {
      class00500 class00500 = var1.method_8320(var2);
      if (class00500.i() instanceof class04065) {
         return true;
      } else {
         return !class00500.P() && (!class00500.N(class00869.K) || !class00500.Y().u())
            ? false
            : class07211.N().map(var2::method_10093).anyMatch(var1x -> var1.method_8320(var1x).W(var1, var1x));
      }
   }
}
