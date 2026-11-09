package minecraft;

import Nursultan.class10976;
import Nursultan.class11938;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public enum class05455 {
   field_26664(true, false),
   field_26665(false, false),
   field_26666(false, true);

   private static final class05455[] field_26667 = values();
   private final boolean field_26668;
   private final boolean field_26669;

   public class05455 L() {
      return field_26667[(this.ordinal() + 1) % field_26667.length];
   }

   private class05455(boolean var3, boolean var4) {
      this.field_26668 = var3;
      this.field_26669 = var4;
   }

   private void y(CallbackInfoReturnable var1) {
      class10976 class10976 = class10976.N(this.field_26668, this.field_26669);
      class11938.L().L(class10976);
      var1.setReturnValue(class10976.N());
   }

   public boolean y() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : this.field_26669;
   }

   private void N(CallbackInfoReturnable var1) {
      class10976 class10976 = class10976.N(this.field_26668, this.field_26669);
      class11938.L().L(class10976);
      var1.setReturnValue(class10976.y());
   }

   public boolean N() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : this.field_26668;
   }
}
