package minecraft;

import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class class04103 extends class03560 {
   public class04103(Codec<class06225> var1) {
      super(var1);
   }

   @Override
   protected boolean N(class07284 var1, class06069 var2, class07209 var3, class00500 var4) {
      if (!this.y(var1, var2, var3, var4)) {
         return false;
      } else {
         class07211 class07211xx = class07221.field_11062.N(var2);
         int i = var2.y(2) + 2;

         for (class07211 class07211x : class07536.N(Stream.of(class07211xx, class07211xx.R(), class07211xx.M()), var2).subList(0, i)) {
            class07218 class07218 = var3.method_25503();
            int j = var2.y(2) + 1;
            class07218.N(class07211x);
            int k;
            class07211 class07211xx;
            if (class07211x == class07211xx) {
               class07211xx = class07211xx;
               k = var2.y(3) + 2;
            } else {
               class07218.N(class07211.field_11036);
               class07211[] aclass07211 = new class07211[]{class07211x, class07211.field_11036};
               class07211xx = class07536.N((class07211[])aclass07211, var2);
               k = var2.y(3) + 3;
            }

            for (int l = 0; l < j && this.y(var1, var2, class07218, var4); l++) {
               class07218.N(class07211xx);
            }

            class07218.N(class07211xx.b());
            class07218.N(class07211.field_11036);

            for (int i1 = 0; i1 < k; i1++) {
               class07218.N(class07211xx);
               if (!this.y(var1, var2, class07218, var4)) {
                  break;
               }

               if (var2.z() < 0.25F) {
                  class07218.N(class07211.field_11036);
               }
            }
         }

         return true;
      }
   }
}
