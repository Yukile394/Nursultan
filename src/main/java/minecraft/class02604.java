package minecraft;

import java.util.Iterator;

public interface class02604 {
   static <T> void N(int var0, int var1, class06521<?> var2, Iterable<T> var3, class02605<T> var4) {
      if (var2 instanceof class07329 class07329) {
         N(var0, var1, class07329.M(), class07329.B(), var3, var4);
      } else {
         N(var0, var1, var0, var1, var3, var4);
      }
   }

   static <T> void N(int var0, int var1, int var2, int var3, Iterable<T> var4, class02605<T> var5) {
      Iterator iterator = var4.iterator();
      int i = 0;

      for (int j = 0; j < var1; j++) {
         boolean flag = var3 < var1 / 2.0F;
         int k = class04995.y(var1 / 2.0F - var3 / 2.0F);
         if (flag && k > j) {
            i += var0;
            j++;
         }

         for (int l = 0; l < var0; l++) {
            if (!iterator.hasNext()) {
               return;
            }

            flag = var2 < var0 / 2.0F;
            k = class04995.y(var0 / 2.0F - var2 / 2.0F);
            int i1 = var2;
            boolean flag1 = l < var2;
            if (flag) {
               i1 = k + var2;
               flag1 = k <= l && l < k + var2;
            }

            if (flag1) {
               var5.addItemToSlot(iterator.next(), i, l, j);
            } else if (i1 == l) {
               i += var0 - l;
               break;
            }

            i++;
         }
      }
   }
}
