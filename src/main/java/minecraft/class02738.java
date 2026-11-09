package minecraft;

import com.google.common.collect.Sets;
import java.util.HashSet;
import net.caffeinemc.mods.lithium.common.block.redstone.RedstoneWirePowerCalculations;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02738 extends class02761 {
   private int L(class07299 var1, class07209 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueI();
      } else {
         int i = this.N(var1, var2);
         return i == 15 ? i : Math.max(i, this.y(var1, var2));
      }
   }

   public class02738(class06884 var1) {
      super(var1);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class02733 var4, boolean var5) {
      int i = this.L(var1, var2);
      if (var3.L(class06884.R) != i) {
         if (var1.method_8320(var2) == var3) {
            var1.method_8652(var2, var3.y(class06884.R, i), 2);
         }

         HashSet hashset = Sets.newHashSet();
         hashset.add(var2);

         for (class07211 class07211 : class07211.values()) {
            hashset.add(var2.method_10093(class07211));
         }

         for (class07209 class07209 : hashset) {
            var1.method_8408(class07209, this.N);
         }
      }
   }

   private void N(class07299 var1, class07209 var2, CallbackInfoReturnable var3) {
      var3.setReturnValue(RedstoneWirePowerCalculations.getNeighborSignal(this.N, this, var1, var2, false, false));
   }
}
