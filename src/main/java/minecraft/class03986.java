package minecraft;

import Nursultan.class10993;
import Nursultan.class11938;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class03986 extends class09005 {
   public abstract class03556<class07084> L();

   public class03986() {
      super();
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   public boolean N() {
      return false;
   }

   @Override
   public boolean N(@Nullable class04798 var1, class07049 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(var1, var2, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : var2 instanceof class07438 && ((class07438)var2).method_6059(this.L());
   }

   private static void N(class04798 var0, class07049 var1, CallbackInfoReturnable var2) {
      class10993 class10993 = class10993.L();
      class11938.L().L(class10993);
      if (class10993.y()) {
         var2.setReturnValue(false);
      }
   }
}
