package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Set;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06281 extends class05355<class08041> {
   private static final int N = 40;

   public class06281() {
      super(40);
   }

   private void N(class04782 var1, class08041 var2, CallbackInfo var3) {
      if (var2.t().y().N().i().isEmpty()) {
         var2.method_18868().y(class05378.R);
         var3.cancel();
      }
   }

   @Override
   public Set<class05378<?>> N() {
      return ImmutableSet.of(class05378.R);
   }

   protected void N(class04782 var1, class08041 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class05946<class07299> class05946 = var1.method_27983();
         class07209 class07209x = var2.method_24515();
         ArrayList arraylist = Lists.newArrayList();
         byte b0 = 4;

         for (int var7 = -4; var7 <= 4; var7++) {
            for (int j = -2; j <= 2; j++) {
               for (int k = -4; k <= 4; k++) {
                  class07209 class07209x = class07209x.method_10069(var7, j, k);
                  if (var2.t().y().N().i().contains(var1.method_8320(class07209x).i())) {
                     arraylist.add(class06289.N(class05946, class07209x));
                  }
               }
            }
         }

         class01289<class08041> class01289 = var2.method_18868();
         if (!arraylist.isEmpty()) {
            class01289.N(class05378.R, arraylist);
         } else {
            class01289.y(class05378.R);
         }
      }
   }
}
