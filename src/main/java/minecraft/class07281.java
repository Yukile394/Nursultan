package minecraft;

import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07281 extends class00394 implements class07274, SleepingBlockEntity {
   private final class01142 N;
   private final class01114 y;
   private WrappedBlockEntityTickInvokerAccessor L = null;
   private class01099 u = null;

   private void L() {
      if (this.N(0.0F) == this.N(1.0F)) {
         this.lithium$startSleeping();
      }
   }

   public class07281(class07209 var1, class00500 var2) {
      super(class00404.field_11901, var1, var2);
      this.N = new class01142();
      this.y = new class07250(this);
   }

   public void y(class08978 var1) {
      if (!this.E && !var1.aB_().method_7325()) {
         this.y.N(var1.aB_(), this.G(), this.d(), this.w());
      }
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class07281 var3) {
      var3.N.N();
      N(var0, var1, var2, var3, null);
   }

   @Override
   public float N(float var1) {
      return this.N.N(var1);
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class07281 var3, CallbackInfo var4) {
      var3.L();
   }

   private void N(int var1, int var2, CallbackInfoReturnable var3) {
      if (this.u != null) {
         this.wakeUpNow();
      }
   }

   @Override
   public boolean N(int var1, int var2) {
      if (var1 == 1) {
         class01142 class01142 = this.N;
         boolean flag = var2 > 0;
         this.N(var1, var2, null);
         class01142.N(flag);
         return true;
      } else {
         return super.N(var1, var2);
      }
   }

   public void N(class08978 var1) {
      if (!this.E && !var1.aB_().method_7325()) {
         this.y.N(var1.aB_(), this.G(), this.d(), this.w(), var1.method_72381());
      }
   }

   public void N() {
      if (!this.E) {
         this.y.L(this.G(), this.d(), this.w());
      }
   }

   public boolean N(class08036 var1) {
      return class06695.N(this, var1);
   }

   public class01099 lithium$getSleepingTicker() {
      return this.u;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.L = var1;
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.u = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.L;
   }
}
