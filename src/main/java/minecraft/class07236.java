package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.Iterator;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeEmitter;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeListener;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.common.hopper.InventoryHelper;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07236 extends class00394 implements class06237, class06695, class07061, InventoryChangeEmitter, SpecialLogicInventory {
   private class07044 N;
   @Nullable
   private class00392 y;
   private boolean u = false;
   ReferenceArraySet t = null;
   ReferenceArraySet G = null;

   protected abstract class00743<class06584> aC_();

   @Override
   public class00392 method_5476() {
      return this.method_5477();
   }

   @Nullable
   @Override
   public class00392 method_5797() {
      return this.y;
   }

   @Override
   public class00392 method_5477() {
      return this.y != null ? this.y : this.an_();
   }

   protected class07236(class00404<?> var1, class07209 var2, class00500 var3) {
      super(var1, var2, var3);
      this.N = class07044.N;
   }

   public boolean Z() {
      return !this.N.equals(class07044.N);
   }

   private void z() {
      if (this.t != null) {
         this.t.clear();
      }

      LithiumStackList lithiumstacklist = this instanceof LithiumInventory ? InventoryHelper.getLithiumStackListOrNull((LithiumInventory)this) : null;
      if (lithiumstacklist != null && this instanceof InventoryChangeTracker inventorychangetracker) {
         lithiumstacklist.removeInventoryModificationCallback(inventorychangetracker);
      }
   }

   @Override
   public void y(class08329 var1) {
      var1.L("CustomName");
      var1.L("lock");
      var1.L("Items");
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.B, this.y);
      if (this.Z()) {
         var1.N(class02484.Nw, this.N);
      }

      var1.N(class02484.NG, class02854.N(this.aC_()));
   }

   protected abstract class07482 N(int var1, class08044 var2);

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      this.y = var1.method_58694(class02484.B);
      this.N = var1.a_(class02484.Nw, class07044.N);
      var1.a_(class02484.NG, class02854.N).N(this.aC_());
   }

   public void N(class07236 var1, Operation var2) {
      if (!this.u) {
         var2.call(new Object[]{var1});
      }
   }

   @Override
   public void N(class08299 var1, CallbackInfo var2) {
      if (this instanceof InventoryChangeTracker) {
         ((InventoryChangeTracker)this).lithium$emitStackListReplaced();
      }
   }

   public boolean N(class08036 var1) {
      return this.N.N(var1);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      this.N.N(var1);
      var1.y("CustomName", class03748.N, this.y);
   }

   protected abstract void N(class00743<class06584> var1);

   public static void N(class06889 var0, class08036 var1, class00392 var2) {
      class07299 class07299 = var1.method_73183();
      var1.method_7353(class00392.N("container.isLocked", var2), true);
      if (!class07299.method_8608()) {
         class07299.method_43128(null, var0.N(), var0.y(), var0.L(), class04909.RT, class04911.field_15245, 1.0F, 1.0F);
      }
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.N = class07044.N(var1);
      this.y = N_10(var1, "CustomName");
      this.N(var1, null);
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return class06695.N(this, var1);
   }

   @Override
   public void method_5448() {
      this.aC_().clear();
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      this.aC_().set(var1, var2);
      var2.R(this.a_(var2));
      this.N(this, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_2624]");
         ((class07236)var0[0]).method_5431();
         return (Void)null;
      });
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      class06584 class06584 = class06686.N(this.aC_(), var1, var2);
      if (!class06584.R()) {
         this.method_5431();
      }

      return class06584;
   }

   @Override
   public class06584 method_5441(int var1) {
      return class06686.N(this.aC_(), var1);
   }

   @Override
   public boolean method_5442() {
      Iterator<class06584> iterator = this.aC_().iterator();

      while (iterator.hasNext()) {
         if (!iterator.next().R()) {
            return false;
         }
      }

      return true;
   }

   public void fabric_onFinalCommit(int var1, class06584 var2, class06584 var3) {
   }

   public void fabric_setSuppress(boolean var1) {
      this.u = var1;
   }

   public void lithium$emitStackListReplaced() {
      ReferenceArraySet referencearrayset = this.G;
      this.G = null;
      if (referencearrayset != null && !referencearrayset.isEmpty()) {
         ObjectIterator objectiterator = referencearrayset.iterator();

         while (objectiterator.hasNext()) {
            InventoryChangeListener var3 = (InventoryChangeListener)objectiterator.next();
            var3.handleStackListReplaced(this);
         }

         referencearrayset.clear();
      }

      if (this.G == null) {
         this.G = referencearrayset;
      }

      if (this instanceof InventoryChangeListener inventorychangelistener1) {
         inventorychangelistener1.handleStackListReplaced(this);
      }

      this.z();
   }

   public void lithium$forwardContentChangeOnce(InventoryChangeListener var1, LithiumStackList var2) {
      if (this.t == null) {
         this.t = new ReferenceArraySet(1);
      }

      var2.setNextInventoryModificationCallback((InventoryChangeTracker)this);
      this.t.add(var1);
   }

   public void lithium$emitContentModified() {
      ReferenceArraySet referencearrayset = this.t;
      if (referencearrayset != null) {
         ObjectIterator objectiterator = referencearrayset.iterator();

         while (objectiterator.hasNext()) {
            ((InventoryChangeListener)objectiterator.next()).lithium$handleInventoryContentModified(this);
         }

         referencearrayset.clear();
      }
   }

   protected abstract class00392 an_();

   public void lithium$emitFirstComparatorAdded() {
      ReferenceArraySet referencearrayset = this.t;
      if (referencearrayset != null && !referencearrayset.isEmpty()) {
         referencearrayset.removeIf(var1x -> var1x.lithium$handleComparatorAdded(this));
      }
   }

   @Nullable
   @Override
   public class07482 createMenu(int var1, class08044 var2, class08036 var3) {
      if (this.N(var3)) {
         return this.N(var1, var2);
      } else {
         N(this.d().method_46558(), var3, this.method_5476());
         return null;
      }
   }

   @Override
   public class06584 method_5438(int var1) {
      return this.aC_().get(var1);
   }

   public void lithium$stopForwardingMajorInventoryChanges(InventoryChangeListener var1) {
      if (this.G != null) {
         this.G.remove(var1);
      }
   }

   public void lithium$emitRemoved() {
      ReferenceArraySet referencearrayset = this.G;
      this.G = null;
      if (referencearrayset != null && !referencearrayset.isEmpty()) {
         ObjectIterator objectiterator = referencearrayset.iterator();

         while (objectiterator.hasNext()) {
            InventoryChangeListener var3 = (InventoryChangeListener)objectiterator.next();
            var3.lithium$handleInventoryRemoved(this);
         }

         referencearrayset.clear();
      }

      if (this.G == null) {
         this.G = referencearrayset;
      }

      if (this instanceof InventoryChangeListener inventorychangelistener1) {
         inventorychangelistener1.lithium$handleInventoryRemoved(this);
      }

      this.z();
   }

   public void lithium$forwardMajorInventoryChanges(InventoryChangeListener var1) {
      if (this.G == null) {
         this.G = new ReferenceArraySet(1);
      }

      this.G.add(var1);
   }
}
