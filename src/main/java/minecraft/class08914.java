package minecraft;

import Nursultan.class11528;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public record class08914() implements class08909 {
   public static final MapCodec<class08914> N = MapCodec.unit(new class08914());

   public class08914() {
   }

   @Override
   public MapCodec<class08914> N() {
      return N;
   }

   private void N(class06584 var1, class03448 var2, class07438 var3, int var4, class03662 var5, CallbackInfoReturnable var6) {
      if (var3 != (class04453)class06202.Nq().T_4 && var3 instanceof class08036 class08036) {
         if (var1.N(class06570.lo)) {
            var6.setReturnValue(class11528.N(class08036, false));
         }
      }
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, var5, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         return var3 == null ? false : var3.method_6115() && var3.method_6030() == var1;
      }
   }
}
