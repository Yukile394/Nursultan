package minecraft;

import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class06371 extends class00394 implements class01171<class03485>, class03502, SleepingBlockEntity {
   private static final int N = 0;
   private class03508 y;
   private final class03485 L;
   private final class03481 u;
   private int i;
   private WrappedBlockEntityTickInvokerAccessor R = null;
   private class01099 M = null;

   @Override
   public class03508 L() {
      return this.y;
   }

   public class03485 B() {
      return this.L;
   }

   protected class06371(class00404<?> var1, class07209 var2, class00500 var3) {
      super(var1, var2, var3);
      this.i = 0;
      this.u = this.N();
      this.y = new class03508();
      this.L = new class03485(this);
      this.N(var1, var2, var3, null);
   }

   public class06371(class07209 var1, class00500 var2) {
      this(class00404.field_28117, var1, var2);
   }

   @Override
   public class03481 u() {
      return this.u;
   }

   public void N(int var1) {
      this.i = var1;
   }

   private void N(class08299 var1, CallbackInfo var2) {
      if (this.y.N().N(Long.MAX_VALUE).isPresent()) {
         this.wakeUpNow();
      }
   }

   private void N(class00404 var1, class07209 var2, class00500 var3, CallbackInfo var4) {
      this.L.lithium$setGameEventCallback(this::wakeUpNow);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.i = var1.N("last_vibration_frequency", 0);
      this.y = var1.<class03508>N("listener", class03508.N).orElseGet(class03508::new);
      this.N(var1, null);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("last_vibration_frequency", this.i);
      var1.N("listener", class03508.N, this.y);
   }

   public class03481 N() {
      return new class01157(this, this.d());
   }

   public class01099 lithium$getSleepingTicker() {
      return this.M;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.R = var1;
      this.lithium$setSleepingTicker(null);
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.M = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.R;
   }

   public int R() {
      return this.i;
   }
}
