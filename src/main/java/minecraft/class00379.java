package minecraft;

import java.util.List;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.SetBlockStateHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeEmitter;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00379
   extends class07277
   implements class07274,
   LithiumInventory,
   SetBlockStateHandlingBlockEntity,
   SleepingBlockEntity,
   InventoryChangeEmitter,
   InventoryChangeTracker {
   private static final int N = 1;
   private static final class00392 y = class00392.L("container.chest");
   private class00743<class06584> u;
   private final class01114 M;
   private final class01142 B;
   private WrappedBlockEntityTickInvokerAccessor Z = null;
   private class01099 m = null;

   @Override
   protected class00743<class06584> aC_() {
      return this.u;
   }

   protected class00379(class00404<?> var1, class07209 var2, class00500 var3) {
      super(var1, var2, var3);
      this.u = class00743.method_10213(27, class06584.E);
      this.M = new class00407(this);
      this.B = new class01142();
   }

   public class00379(class07209 var1, class00500 var2) {
      this(class00404.field_11914, var1, var2);
   }

   private void z() {
      if (this.N(0.0F) == this.N(1.0F)) {
         this.lithium$startSleeping();
      }
   }

   public void u() {
      if (!this.E) {
         this.M.L(this.G(), this.d(), this.w());
      }
   }

   @Override
   protected class07482 N(int var1, class08044 var2) {
      return class07490.N(var1, var2, this);
   }

   public static void N(class00379 var0, class00379 var1) {
      class00743<class06584> class00743 = var0.aC_();
      var0.N(var1.aC_());
      var1.N(class00743);
   }

   public static int N(class07290 var0, class07209 var1) {
      if (var0.method_8320(var1).k()) {
         class00394 class00394 = var0.method_8321(var1);
         if (class00394 instanceof class00379) {
            return ((class00379)class00394).M.N();
         }
      }

      return 0;
   }

   @Override
   public float N(float var1) {
      return this.B.N(var1);
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class00379 var3, CallbackInfo var4) {
      var3.z();
   }

   private void N(int var1, int var2, CallbackInfoReturnable var3) {
      if (this.m != null) {
         this.wakeUpNow();
      }
   }

   public void N(class00743 var1, CallbackInfo var2) {
      this.lithium$emitStackListReplaced();
   }

   protected void N(class07299 var1, class07209 var2, class00500 var3, int var4, int var5) {
      class00891 class00891 = var3.i();
      var1.method_8427(var2, class00891, 1, var5);
   }

   @Override
   public boolean N(int var1, int var2) {
      if (var1 == 1) {
         class01142 class01142 = this.B;
         boolean flag = var2 > 0;
         this.N(var1, var2, null);
         class01142.N(flag);
         return true;
      } else {
         return super.N(var1, var2);
      }
   }

   static void N(class07299 var0, class07209 var1, class00500 var2, class04891 var3) {
      class06638 class06638 = var2.L(class00860.i);
      if (class06638 != class06638.field_12574) {
         double d0 = var1.method_10263() + 0.5;
         double d1 = var1.method_10264() + 0.5;
         double d2 = var1.method_10260() + 0.5;
         if (class06638 == class06638.field_12571) {
            class07211 class07211 = class00860.E(var2);
            d0 += class07211.P() * 0.5;
            d2 += class07211.T() * 0.5;
         }

         var0.method_43128(null, d0, d1, d2, var3, class04911.field_15245, 0.5F, var0.field_9229.z() * 0.1F + 0.9F);
      }
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class00379 var3) {
      var3.B.N();
      N(var0, var1, var2, var3, null);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (!this.a_(var1)) {
         class06686.N(var1, this.u);
      }
   }

   @Override
   protected void N(class00743<class06584> var1) {
      this.u = var1;
      this.N(var1, null);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.u = class00743.method_10213(this.method_5439(), class06584.E);
      if (!this.c_(var1)) {
         class06686.N(var1, this.u);
      }
   }

   @Override
   public void method_5432(class08978 var1) {
      if (!this.E && !var1.aB_().method_7325()) {
         this.M.N(var1.aB_(), this.G(), this.d(), this.w());
      }
   }

   @Override
   public void method_5435(class08978 var1) {
      if (!this.E && !var1.aB_().method_7325()) {
         this.M.N(var1.aB_(), this.G(), this.d(), this.w(), var1.method_72381());
      }
   }

   public class01099 lithium$getSleepingTicker() {
      return this.m;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.Z = var1;
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.m = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.Z;
   }

   @Override
   protected class00392 an_() {
      return y;
   }

   public void lithium$handleSetBlockState() {
      this.lithium$emitRemoved();
   }

   @Override
   public List<class08978> j_() {
      return this.M.N(this.G(), this.d());
   }

   @Override
   public int method_5439() {
      return 27;
   }
}
