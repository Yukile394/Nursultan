package minecraft;

import net.caffeinemc.mods.lithium.common.block.redstone.RedstoneWirePowerCalculations;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class02761 {
   protected final class06884 N;

   protected class02761(class06884 var1) {
      super();
      this.N = var1;
   }

   protected int y(class07299 var1, class07209 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueI();
      } else {
         int i = 0;

         for (class07211 class07211 : class07221.field_11062) {
            class07209 class07209xxx = var2.method_10093(class07211);
            class00500 class00500 = var1.method_8320(class07209xxx);
            i = Math.max(i, this.N(class07209xxx, class00500));
            class07209 class07209x = var2.method_10084();
            if (class00500.u(var1, class07209xxx) && !var1.method_8320(class07209x).u(var1, class07209x)) {
               class07209 class07209xx = class07209xxx.method_10084();
               i = Math.max(i, this.N(class07209xx, var1.method_8320(class07209xx)));
            } else if (!class00500.u(var1, class07209xxx)) {
               class07209 class07209xx = class07209xxx.method_10074();
               i = Math.max(i, this.N(class07209xx, var1.method_8320(class07209xx)));
            }
         }

         return Math.max(0, i - 1);
      }
   }

   private void N(class07299 var1, class07209 var2, CallbackInfoReturnable var3) {
      var3.setReturnValue(RedstoneWirePowerCalculations.getNeighborWireSignal(this.N, this, var1, var2));
   }

   public int N(class07209 var1, class00500 var2) {
      return var2.N(this.N) ? var2.L(class06884.R) : 0;
   }

   protected int N(class07299 var1, class07209 var2) {
      return this.N.N(var1, var2);
   }

   public abstract void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class02733 var4, boolean var5);
}
