package minecraft;

import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.function.ToIntFunction;

public class class02185 extends class07084 {
   private final ToIntFunction<class06069> L;

   public class02185(class01286 var1, int var2, ToIntFunction<class06069> var3) {
      super(var1, var2, class07107.r);
      this.L = var3;
   }

   @Override
   public void N(class04782 var1, class07438 var2, int var3, class07062 var4) {
      if (var4 == class07062.field_26998 && (var2 instanceof class08036 || var1.method_64395().N(class07305.I))) {
         this.N(var1, var2.method_59922(), var2.method_24515());
      }
   }

   private void N(class04782 var1, class06069 var2, class07209 var3) {
      HashSet hashset = Sets.newHashSet();
      int i = this.L.applyAsInt(var2);

      for (class07209 class07209xx : class07209.method_34848(var2, 15, var3, 1)) {
         class07209 class07209x = class07209xx.method_10074();
         if (!hashset.contains(class07209xx)
            && var1.method_8320(class07209xx).d()
            && var1.method_8320(class07209x).L(var1, class07209x, class07211.field_11036)) {
            hashset.add(class07209xx.method_10062());
            if (hashset.size() >= i) {
               break;
            }
         }
      }

      for (class07209 class07209x : hashset) {
         var1.method_8652(class07209x, class00869.yw.W(), 3);
         var1.N(3018, class07209x, 0);
      }
   }
}
