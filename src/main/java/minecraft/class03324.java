package minecraft;

import com.mojang.serialization.Codec;

public class class03324 extends class03560 {
   public class03324(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   protected boolean N(class07284 var1, class06069 var2, class07209 var3, class00500 var4) {
      class07218 class07218 = var3.method_25503();
      int i = var2.y(3) + 1;

      for (int j = 0; j < i; j++) {
         if (!this.y(var1, var2, class07218, var4)) {
            return true;
         }

         class07218.N(class07211.field_11036);
      }

      class07209 class07209 = class07218.method_10062();
      int k = var2.y(3) + 2;

      for (class07211 class07211 : class07221.field_11062.L(var2).subList(0, k)) {
         class07218.N(class07209);
         class07218.N(class07211);
         int l = var2.y(5) + 2;
         int i1 = 0;

         for (int j1 = 0; j1 < l && this.y(var1, var2, class07218, var4); j1++) {
            i1++;
            class07218.N(class07211.field_11036);
            if (j1 == 0 || i1 >= 2 && var2.z() < 0.25F) {
               class07218.N(class07211);
               i1 = 0;
            }
         }
      }

      return true;
   }
}
