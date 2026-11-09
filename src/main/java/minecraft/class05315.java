package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class class05315 extends class06391<class05332> {
   private static final ImmutableList<class00891> NE = ImmutableList.of(
      class00869.q, class00869.ML, class00869.Mu, class00869.Mi, class00869.MR, class00869.LA, class00869.La
   );
   private static final class07211[] NW = class07211.values();
   private static final double Nm = 0.9;

   public class05315(Codec<class05332> var1) {
      super(var1);
   }

   @Override
   public boolean N(class06058<class05332> var1) {
      boolean flag = false;
      class06069 class06069 = var1.u();
      class05974 class05974 = var1.y();
      class05332 class05332 = (class05332)var1.R();
      class07209 class07209xx = var1.i();
      boolean flag1 = class06069.U() < 0.9;
      int i = flag1 ? class05332.i().N(class06069) : 0;
      int j = flag1 ? class05332.i().N(class06069) : 0;
      boolean flag2 = flag1 && i != 0 && j != 0;
      int k = class05332.L().N(class06069);
      int l = class05332.L().N(class06069);
      int i1 = Math.max(k, l);

      for (class07209 class07209x : class07209.method_25996(class07209xx, k, 0, l)) {
         if (class07209x.method_19455(class07209xx) > i1) {
            break;
         }

         if (N(class05974, class07209x, class05332)) {
            if (flag2) {
               flag = true;
               this.N(class05974, class07209x, class05332.y());
            }

            class07209 class07209xx = class07209x.method_10069(i, 0, j);
            if (N(class05974, class07209xx, class05332)) {
               flag = true;
               this.N(class05974, class07209xx, class05332.N());
            }
         }
      }

      return flag;
   }

   private static boolean N(class07284 var0, class07209 var1, class05332 var2) {
      class00500 class00500 = var0.method_8320(var1);
      if (class00500.N(var2.N().i())) {
         return false;
      } else if (NE.contains(class00500.i())) {
         return false;
      } else {
         int i = NW.length;

         for (int j = 0; j < i; j++) {
            class07211 class07211 = NW[j];
            boolean flag = var0.method_8320(var1.method_10093(class07211)).P();
            if (flag && class07211 != class07211.field_11036 || !flag && class07211 == class07211.field_11036) {
               return false;
            }
         }

         return true;
      }
   }
}
