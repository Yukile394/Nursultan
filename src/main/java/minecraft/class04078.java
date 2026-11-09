package minecraft;

import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04078 extends class00394 implements class01171<class04080>, SleepingBlockEntity {
   private final class04080 N;
   private WrappedBlockEntityTickInvokerAccessor y = null;
   private class01099 L = null;

   public class04078(class07209 var1, class00500 var2) {
      super(class00404.field_37647, var1, var2);
      this.N = new class04080(var2, new class01155(var1));
      this.N(var1, var2, null);
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class04078 var3, CallbackInfo var4) {
      if (var3.B().u().Z().isEmpty()) {
         var3.lithium$startSleeping();
      }
   }

   private void N(class08299 var1, CallbackInfo var2) {
      if (!this.B().u().Z().isEmpty()) {
         this.wakeUpNow();
      }
   }

   private void N(class07209 var1, class00500 var2, CallbackInfo var3) {
      this.N.u().lithium$setGameEventCallback(this::wakeUpNow);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class04078 var3) {
      var3.N.u().N(var0, var1, var0.method_8409(), true);
      N(var0, var1, var2, var3, null);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.N.y.N(var1);
      this.N(var1, null);
   }

   public class04080 B() {
      return this.N;
   }

   @Override
   protected void N(class08329 var1) {
      this.N.y.N(var1);
      super.N(var1);
   }

   public class01099 lithium$getSleepingTicker() {
      return this.L;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.y = var1;
      this.lithium$setSleepingTicker(null);
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.L = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.y;
   }
}
