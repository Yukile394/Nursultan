package minecraft;

import com.mojang.serialization.Codec;

public class class01936 extends class03560 {
   public class01936(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   protected boolean N(class07284 var1, class06069 var2, class07209 var3, class00500 var4) {
      int i = var2.y(3) + 3;
      int j = var2.y(3) + 3;
      int k = var2.y(3) + 3;
      int l = var2.y(3) + 1;
      class07218 class07218 = var3.method_25503();

      for (int i1 = 0; i1 <= j; i1++) {
         for (int j1 = 0; j1 <= i; j1++) {
            for (int k1 = 0; k1 <= k; k1++) {
               class07218.N(i1 + var3.method_10263(), j1 + var3.method_10264(), k1 + var3.method_10260());
               class07218.N(class07211.field_11033, l);
               if ((i1 != 0 && i1 != j || j1 != 0 && j1 != i)
                  && (k1 != 0 && k1 != k || j1 != 0 && j1 != i)
                  && (i1 != 0 && i1 != j || k1 != 0 && k1 != k)
                  && (i1 == 0 || i1 == j || j1 == 0 || j1 == i || k1 == 0 || k1 == k)
                  && !(var2.z() < 0.1F)
                  && !this.y(var1, var2, class07218, var4)) {
               }
            }
         }
      }

      return true;
   }
}
