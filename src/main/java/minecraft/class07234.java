package minecraft;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeListener;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracker;
import net.caffeinemc.mods.lithium.common.hopper.BlockStateOnlyInventory;
import net.caffeinemc.mods.lithium.common.hopper.HopperHelper;
import net.caffeinemc.mods.lithium.common.hopper.InventoryHelper;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;
import net.caffeinemc.mods.lithium.common.hopper.UpdateReceiver;
import net.caffeinemc.mods.lithium.common.hopper.HopperCachingState.BlockInventory;
import net.caffeinemc.mods.lithium.common.services.PlatformModCompat;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementListener;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedInventoryEntityMovementTracker;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedItemEntityMovementTracker;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageUtil;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07234
   extends class07277
   implements class07252,
   LithiumInventory,
   SleepingBlockEntity,
   InventoryChangeListener,
   InventoryChangeTracker,
   UpdateReceiver,
   SectionedEntityMovementListener {
   public static final int N = 8;
   public static final int y = 5;
   private static final int[][] M = new int[54][];
   private static final int B = -1;
   private static final class00392 Z = class00392.L("container.hopper");
   private class00743<class06584> m;
   private int P;
   private long s;
   private class07211 T;
   private long b;
   private long j;
   private long v;
   private BlockInventory n = BlockInventory.UNKNOWN;
   private BlockInventory l = BlockInventory.UNKNOWN;
   private class06695 d;
   private class06695 w;
   private LithiumInventory k;
   private LithiumInventory Y;
   private LithiumStackList Q;
   private LithiumStackList O;
   private long g;
   private long I;
   private SectionedItemEntityMovementTracker J;
   private boolean o;
   private class00734 q;
   private long K;
   private SectionedInventoryEntityMovementTracker V;
   private class00734 e;
   private long H;
   private SectionedInventoryEntityMovementTracker c;
   private class00734 X;
   private long a;
   private boolean p;
   private WrappedBlockEntityTickInvokerAccessor F = null;
   private class01099 A = null;

   public class06695 L(class07299 var1) {
      class06695 class06695x = this.y(var1);
      if (class06695x != null) {
         return class06695x;
      } else {
         if (this.c == null) {
            this.R(var1);
         }

         if (this.c.isUnchangedSince(this.a)) {
            this.a = this.s;
            return null;
         } else {
            this.a = Long.MIN_VALUE;
            this.p = false;
            List list = this.c.getEntities(this.X);
            if (list.isEmpty()) {
               this.a = this.s;
               return null;
            } else {
               class06695 class06695x = (class06695)list.get(var1.field_9229.y(list.size()));
               if (class06695x instanceof LithiumInventory lithiuminventory) {
                  LithiumStackList lithiumstacklist = InventoryHelper.getLithiumStackList(lithiuminventory);
                  if (class06695x != this.k || this.Q != lithiumstacklist) {
                     this.N(lithiuminventory);
                  }
               }

               return class06695x;
            }
         }
      }
   }

   @Override
   public void L(class00500 var1) {
      this.N(var1, null);
      super.L(var1);
      this.T = var1.L(class00739.y);
   }

   @Nullable
   private static class06695 L(class07299 var0, class07209 var1, class00500 var2) {
      class00891 class00891 = var2.i();
      if (class00891 instanceof class05854) {
         return ((class05854)class00891).N(var2, var0, var1);
      } else if (var2.k() && var0.method_8321(var1) instanceof class06695 class06695) {
         if (class06695 instanceof class00379 && class00891 instanceof class00860) {
            class06695 = class00860.N((class00860)class00891, var2, var0, var1, true);
         }

         return class06695;
      } else {
         return null;
      }
   }

   private static class06695 L(class07299 var0, class07209 var1, class07234 var2) {
      return var2.L(var0);
   }

   @Override
   protected class00743<class06584> aC_() {
      return this.m;
   }

   private static List L(class07299 var0, class07252 var1) {
      if (var1 instanceof class07234 class07234) {
         if (class07234.J == null) {
            class07234.E();
         }

         long i = InventoryHelper.getLithiumStackList(class07234).getModCount();
         if ((class07234.o || class07234.v == i) && class07234.J.isUnchangedSince(class07234.K)) {
            class07234.K = class07234.s;
            return Collections.emptyList();
         } else {
            class07234.v = i;
            class07234.p = false;
            List list = class07234.J.getEntities(class07234.q);
            class07234.K = class07234.s;
            class07234.o = list.isEmpty();
            return list;
         }
      } else {
         return y(var0, var1);
      }
   }

   private void P() {
      if (this.n == BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
         assert this.d != null;

         ((InventoryChangeTracker)this.d).stopListenForMajorInventoryChanges(this);
      }

      this.n = BlockInventory.UNKNOWN;
      this.d = null;
      this.k = null;
      this.Q = null;
      this.g = 0L;
      if (this instanceof SleepingBlockEntity) {
         this.wakeUpNow();
      }
   }

   @Override
   public double T() {
      return this.U.method_10263() + 0.5;
   }

   public class07234(class07209 var1, class00500 var2) {
      super(class00404.field_11888, var1, var2);
      this.m = class00743.method_10213(5, class06584.E);
      this.P = -1;
      this.T = var2.L(class00739.y);
   }

   private void i(class07299 var1) {
      assert var1 instanceof class04782;

      class07209 class07209 = this.U.method_10093(class07211.field_11036);
      this.e = new class00734(
         class07209.method_10263(),
         class07209.method_10264(),
         class07209.method_10260(),
         class07209.method_10263() + 1,
         class07209.method_10264() + 1,
         class07209.method_10260() + 1
      );
      this.V = SectionedInventoryEntityMovementTracker.registerAt((class04782)this.z, this.e, class06695.class);
      this.H = Long.MIN_VALUE;
   }

   @Override
   public double b() {
      return this.U.method_10264() + 0.5;
   }

   private void s() {
      if (this.z instanceof class04782 class04782) {
         if (this.V != null) {
            this.V.unRegister(class04782);
            this.V = null;
            this.e = null;
            this.H = 0L;
         }

         if (this.J != null) {
            this.J.unRegister(class04782);
            this.J = null;
            this.q = null;
            this.o = false;
         }
      }

      this.n();
   }

   private void n() {
      if (this.l == BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
         assert this.w != null;

         ((InventoryChangeTracker)this.w).stopListenForMajorInventoryChanges(this);
      }

      this.l = BlockInventory.UNKNOWN;
      this.w = null;
      this.Y = null;
      this.O = null;
      this.I = 0L;
      if (this instanceof SleepingBlockEntity) {
         this.wakeUpNow();
      }
   }

   private void m() {
      if (this.z instanceof class04782 class04782 && this.c != null) {
         this.c.unRegister(class04782);
         this.c = null;
         this.X = null;
         this.a = 0L;
      }

      this.P();
   }

   private void t() {
      if (!this.z() && this.G() != null) {
         if (this instanceof SleepingBlockEntity sleepingblockentity) {
            if (sleepingblockentity.isSleeping()) {
               return;
            }

            if (!this.p) {
               this.p = true;
               return;
            }

            if (this instanceof InventoryChangeTracker inventorychangetracker) {
               boolean flag = false;
               boolean flag1 = false;
               boolean flag2 = false;
               boolean flag3 = false;
               boolean flag4 = false;
               LithiumStackList lithiumstacklist = InventoryHelper.getLithiumStackList(this);
               if (this.l != BlockInventory.BLOCK_STATE && lithiumstacklist.getFullSlots() != lithiumstacklist.size()) {
                  if (this.l == BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
                     class06695 class06695x = this.w;
                     if (this.O == null || !(class06695x instanceof InventoryChangeTracker)) {
                        return;
                     }

                     if (this.O.maybeSendsComparatorUpdatesOnFailedExtract() && this.O.getOccupiedSlots() != 0) {
                        if (!(class06695x instanceof ComparatorTracker comparatortracker) || comparatortracker.lithium$hasAnyComparatorNearby()) {
                           return;
                        }

                        flag = true;
                     } else {
                        flag = true;
                     }
                  } else {
                     if (this.l != BlockInventory.NO_BLOCK_INVENTORY) {
                        return;
                     }

                     class00500 class00500xx = this.w();
                     if (PlatformModCompat.INSTANCE.canHopperInteractWithApiBlockInventory(this, class00500xx, true)) {
                        return;
                     }

                     flag2 = true;
                     class07209 class07209 = this.d().method_10084();
                     class00500 class00500x = this.G().method_8320(class07209);
                     if (!class00500x.W(this.G(), class07209) || class00500x.N(class01210.LF)) {
                        flag3 = true;
                     }
                  }
               }

               if (this.n != BlockInventory.BLOCK_STATE && 0 < lithiumstacklist.getOccupiedSlots()) {
                  if (this.n == BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
                     class06695 class06695x = this.d;
                     if (this.Q == null || !(class06695x instanceof InventoryChangeTracker)) {
                        return;
                     }

                     flag1 = true;
                  } else {
                     if (this.n != BlockInventory.NO_BLOCK_INVENTORY) {
                        return;
                     }

                     class00500 class00500x = this.w();
                     if (PlatformModCompat.INSTANCE.canHopperInteractWithApiBlockInventory(this, class00500x, false)) {
                        return;
                     }

                     flag4 = true;
                  }
               }

               if (flag) {
                  ((InventoryChangeTracker)this.w).listenForContentChangesOnce(this.O, this);
               }

               if (flag1) {
                  ((InventoryChangeTracker)this.d).listenForContentChangesOnce(this.Q, this);
               }

               if (flag4) {
                  if (this.c == null) {
                     return;
                  }

                  this.c.listenToEntityMovementOnce(this);
               }

               if (flag2) {
                  if (this.V == null) {
                     return;
                  }

                  this.V.listenToEntityMovementOnce(this);
               }

               if (flag3) {
                  if (this.J == null) {
                     return;
                  }

                  this.J.listenToEntityMovementOnce(this);
               }

               inventorychangetracker.listenForContentChangesOnce(lithiumstacklist, this);
               sleepingblockentity.lithium$startSleeping();
            }
         }
      }
   }

   @Override
   public boolean v() {
      return true;
   }

   @Override
   public double j() {
      return this.U.method_10260() + 0.5;
   }

   private boolean U() {
      return this.P > 8;
   }

   private boolean z() {
      return this.P > 0;
   }

   private class06695 u(class07299 var1) {
      if (this.V == null) {
         this.i(var1);
      }

      if (this.V.isUnchangedSince(this.H)) {
         this.H = this.s;
         return null;
      } else {
         this.H = Long.MIN_VALUE;
         this.p = false;
         List list = this.V.getEntities(this.e);
         if (list.isEmpty()) {
            this.H = this.s;
            return null;
         } else {
            class06695 class06695 = (class06695)list.get(var1.field_9229.y(list.size()));
            if (class06695 instanceof LithiumInventory lithiuminventory) {
               LithiumStackList lithiumstacklist = InventoryHelper.getLithiumStackList(lithiuminventory);
               if (class06695 != this.Y || this.O != lithiumstacklist) {
                  this.y(lithiuminventory);
               }
            }

            return class06695;
         }
      }
   }

   private boolean u() {
      for (class06584 class06584 : this.m) {
         if (class06584.R() || class06584.c() != class06584.U()) {
            return false;
         }
      }

      return true;
   }

   private void y(LithiumInventory var1) {
      LithiumStackList lithiumstacklist = InventoryHelper.getLithiumStackList(var1);
      this.Y = var1;
      this.O = lithiumstacklist;
      this.I = lithiumstacklist.getModCount() - 1L;
   }

   private static class06695 y(class07299 var0, class07252 var1, class07209 var2, class00500 var3) {
      if (var1 instanceof class07234 class07234) {
         class06695 class06695 = class07234.y(var0, var2, var3);
         return class06695 != null ? class06695 : class07234.u(var0);
      } else {
         return N(var0, var1, var2, var3);
      }
   }

   private static boolean y(class07234 var0) {
      return InventoryHelper.getLithiumStackList(var0).getOccupiedSlots() == 0;
   }

   public class06695 y(class07299 var1) {
      class06695 class06695 = this.d;
      if (this.n == BlockInventory.NO_BLOCK_INVENTORY) {
         return null;
      } else if (this.n == BlockInventory.BLOCK_STATE) {
         return class06695;
      } else if (this.n == BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
         return class06695;
      } else {
         if (this.n == BlockInventory.BLOCK_ENTITY) {
            class00394 class00394 = Objects.requireNonNull(class06695);
            class07209 class07209xx = class00394.d();
            class07211 class07211x = this.T;
            class07209 class07209x = this.d().method_10093(class07211x);
            if (!class00394.k() && class07209xx.equals(class07209x)) {
               LithiumInventory lithiuminventory = this.k;
               if (this.k == null) {
                  return class06695;
               }

               if (InventoryHelper.getLithiumStackList(lithiuminventory) == this.Q) {
                  return lithiuminventory;
               }

               this.P();
            }
         }

         class07211 class07211 = this.T;
         class07209 class07209 = this.d().method_10093(class07211);
         class00500 class00500 = var1.method_8320(class07209);
         class06695 = L(var1, class07209, class00500);
         class06695 = HopperHelper.replaceDoubleInventory(class06695);
         this.N(class06695);
         return class06695;
      }
   }

   private void y(int var1) {
      this.N(var1, null);
      this.P = var1;
   }

   private static boolean y(class06695 var0, class07211 var1) {
      for (int i : N(var0, var1)) {
         class06584 class06584 = var0.method_5438(i);
         if (class06584.c() < class06584.U()) {
            return false;
         }
      }

      return true;
   }

   @Nullable
   private static class06695 y(class07299 var0, class07209 var1, class07234 var2) {
      return N(var0, var1.method_10093(var2.T));
   }

   private static class06584 y(@Nullable class06695 var0, class06695 var1, class06584 var2, int var3, @Nullable class07211 var4) {
      class06584 class06584 = var1.method_5438(var3);
      if (N(var1, var2, var3, var4)) {
         boolean flag = false;
         boolean flag1 = var1.method_5442();
         if (class06584.R()) {
            var1.method_5447(var3, var2);
            var2 = class06584.E;
            flag = true;
         } else if (N(class06584, var2)) {
            int i = var2.U() - class06584.c();
            int jx = Math.min(var2.c(), i);
            var2.B(jx);
            class06584.M(jx);
            flag = jx > 0;
         }

         if (flag) {
            if (flag1 && var1 instanceof class07234 class07234 && !class07234.U()) {
               byte b0 = 0;
               if (var0 instanceof class07234 class07234x && class07234.s >= class07234x.s) {
                  b0 = 1;
               }

               class07234.y(8 - b0);
            }

            var1.method_5431();
         }
      }

      return var2;
   }

   private static void y(class07299 var0, class07252 var1, CallbackInfoReturnable var2, class06695 var3) {
      if (var3 == null) {
         class07209 class07209 = class07209.method_49637(var1.T(), var1.b() + 1.0, var1.j());
         Storage<ItemVariant> storage = (Storage<ItemVariant>)ItemStorage.SIDED.find(var0, class07209, class07211.field_11033);
         if (storage != null) {
            long i = StorageUtil.move(storage, InventoryStorage.of(var1, class07211.field_11036), var0x -> true, 1L, null);
            var2.setReturnValue(i == 1L);
         }
      }
   }

   private static void y(class07299 var0, class07209 var1, class07234 var2, CallbackInfoReturnable var3, class06695 var4) {
      if (var4 == null) {
         class07211 class07211 = var2.T;
         class07209 class07209 = var1.method_10093(class07211);
         Storage<ItemVariant> storage = (Storage<ItemVariant>)ItemStorage.SIDED.find(var0, class07209, class07211.b());
         if (storage != null) {
            long i = StorageUtil.move(InventoryStorage.of(var2, class07211), storage, var0x -> true, 1L, null);
            var3.setReturnValue(i == 1L);
         }
      }
   }

   private void y(class06695 var1) {
      assert !(var1 instanceof class07049);

      if (var1 instanceof LithiumInventory lithiuminventory) {
         this.y(lithiuminventory);
      } else {
         this.Y = null;
         this.O = null;
         this.I = 0L;
      }

      if (var1 instanceof class00394 || var1 instanceof class06710) {
         this.w = var1;
         if (var1 instanceof InventoryChangeTracker) {
            this.l = BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY;
            ((InventoryChangeTracker)var1).listenForMajorInventoryChanges(this);
         } else {
            this.l = BlockInventory.BLOCK_ENTITY;
         }
      } else if (var1 == null) {
         this.w = null;
         this.l = BlockInventory.NO_BLOCK_INVENTORY;
      } else {
         this.w = var1;
         this.l = var1 instanceof BlockStateOnlyInventory ? BlockInventory.BLOCK_STATE : BlockInventory.UNKNOWN;
      }
   }

   public class06695 y(class07299 var1, class07209 var2, class00500 var3) {
      class06695 class06695 = this.w;
      if (this.l == BlockInventory.NO_BLOCK_INVENTORY) {
         return null;
      } else if (this.l == BlockInventory.BLOCK_STATE) {
         return class06695;
      } else if (this.l == BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
         return class06695;
      } else {
         if (this.l == BlockInventory.BLOCK_ENTITY) {
            class00394 class00394 = Objects.requireNonNull(class06695);
            class07209 class07209 = class00394.d();
            if (!class00394.k() && class07209.equals(var2)) {
               LithiumInventory lithiuminventory = this.Y;
               if (this.Y == null) {
                  return class06695;
               }

               if (InventoryHelper.getLithiumStackList(lithiuminventory) == this.O) {
                  return lithiuminventory;
               }

               this.n();
            }
         }

         class06695 = L(var1, var2, var3);
         class06695 = HopperHelper.replaceDoubleInventory(class06695);
         this.y(class06695);
         return class06695;
      }
   }

   public static List<class00717> y(class07299 var0, class07252 var1) {
      class00734 class00734 = var1.ae_().u(var1.T() - 0.5, var1.b() - 0.5, var1.j() - 0.5);
      return var0.N(class00717.class, class00734, class07042.N);
   }

   private void E() {
      assert this.z instanceof class04782;

      class00734 class00734 = this.ae_().u(this.U.method_10263(), this.U.method_10264(), this.U.method_10260());
      this.q = class00734;
      this.J = SectionedItemEntityMovementTracker.registerAt((class04782)this.z, class00734, class00717.class);
      this.K = Long.MIN_VALUE;
   }

   private static void N(class07299 var0, class07252 var1, CallbackInfoReturnable var2, class06695 var3) {
      if (var1 instanceof class07234 class07234) {
         if (var3 == class07234.Y && class07234.O != null) {
            LithiumStackList lithiumstacklist = InventoryHelper.getLithiumStackList(class07234);
            LithiumStackList lithiumstacklist1 = class07234.O;
            if (lithiumstacklist.getModCount() == class07234.j && lithiumstacklist1.getModCount() == class07234.I) {
               if (!(var3 instanceof ComparatorTracker comparatortracker && !comparatortracker.lithium$hasAnyComparatorNearby())) {
                  lithiumstacklist1.runComparatorUpdatePatternOnFailedExtract(lithiumstacklist1, var3);
               }

               var2.setReturnValue(false);
            } else {
               int[] aint = var3 instanceof class07054 ? ((class07054)var3).N(class07211.field_11033) : null;
               int i = aint != null ? aint.length : var3.method_5439();

               for (int jx = 0; jx < i; jx++) {
                  int kx = aint != null ? aint[jx] : jx;
                  class06584 class06584xx = (class06584)lithiumstacklist1.get(kx);
                  if (!class06584xx.R() && N(var1, var3, class06584xx, kx, class07211.field_11033)) {
                     class06584 class06584x = var3.method_5434(kx, 1);

                     assert !class06584x.R();

                     if (HopperHelper.tryMoveSingleItem(var1, class06584x, null)) {
                        var1.method_5431();
                        var3.method_5431();
                        var2.setReturnValue(true);
                        return;
                     }

                     class06584 class06584xx = (class06584)lithiumstacklist1.get(kx);
                     if (class06584xx.R()) {
                        class06584xx = class06584x;
                     } else {
                        class06584xx.M(1);
                     }

                     var3.method_5447(kx, class06584xx);
                  }
               }

               class07234.j = lithiumstacklist.getModCount();
               if (lithiumstacklist1 != null) {
                  class07234.I = lithiumstacklist1.getModCount();
               }

               var2.setReturnValue(false);
            }
         }
      }
   }

   private void N(class00500 var1, CallbackInfo var2) {
      if (this.z != null && !this.z.method_8608() && var1.L(class00739.y) != this.w().L(class00739.y)) {
         this.W();
      }
   }

   private static boolean N(class07234 var0) {
      LithiumStackList lithiumstacklist = InventoryHelper.getLithiumStackList(var0);
      return lithiumstacklist.getFullSlots() == lithiumstacklist.size();
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class07234 var3, CallbackInfo var4) {
      var3.t();
   }

   private void N(LithiumInventory var1) {
      LithiumStackList lithiumstacklist = InventoryHelper.getLithiumStackList(var1);
      this.k = var1;
      this.Q = lithiumstacklist;
      this.g = lithiumstacklist.getModCount() - 1L;
   }

   public void N(class00743 var1, CallbackInfo var2) {
      this.lithium$emitStackListReplaced();
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class07234 var3, BooleanSupplier var4, CallbackInfoReturnable var5) {
      if (!var3.z() && !var3.isSleeping() && !var2.L(class00739.L)) {
         var3.lithium$startSleeping();
      }
   }

   private void N(class06695 var1) {
      assert !(var1 instanceof class07049);

      if (var1 instanceof LithiumInventory lithiuminventory) {
         this.N(lithiuminventory);
      } else {
         this.k = null;
         this.Q = null;
         this.g = 0L;
      }

      if (var1 instanceof class00394 || var1 instanceof class06710) {
         this.d = var1;
         if (var1 instanceof InventoryChangeTracker) {
            this.n = BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY;
            ((InventoryChangeTracker)var1).listenForMajorInventoryChanges(this);
         } else {
            this.n = BlockInventory.BLOCK_ENTITY;
         }
      } else if (var1 == null) {
         this.d = null;
         this.n = BlockInventory.NO_BLOCK_INVENTORY;
      } else {
         this.d = var1;
         this.n = var1 instanceof BlockStateOnlyInventory ? BlockInventory.BLOCK_STATE : BlockInventory.UNKNOWN;
      }
   }

   private void N(int var1, CallbackInfo var2) {
      if (var1 == 7) {
         if (this.s == Long.MAX_VALUE) {
            this.sleepOnlyCurrentTick();
         } else {
            this.wakeUpNow();
         }
      } else if (var1 > 0 && this.A != null) {
         this.wakeUpNow();
      }
   }

   public static class06584 N(@Nullable class06695 var0, class06695 var1, class06584 var2, @Nullable class07211 var3) {
      if (var1 instanceof class07054 class07054 && var3 != null) {
         int[] aint = class07054.N(var3);

         for (int kx = 0; kx < aint.length && !var2.R(); kx++) {
            var2 = y(var0, var1, var2, aint[kx], var3);
         }
      } else {
         int i = var1.method_5439();

         for (int jx = 0; jx < i && !var2.R(); jx++) {
            var2 = y(var0, var1, var2, jx, var3);
         }
      }

      return var2;
   }

   public static boolean N(class06695 var0, class00717 var1) {
      boolean flag = false;
      class06584 class06584x = var1.N().t();
      class06584 class06584x = N(null, var0, class06584x, null);
      if (class06584x.R()) {
         flag = true;
         var1.N(class06584.E);
         var1.method_31472();
      } else {
         var1.N(class06584x);
      }

      return flag;
   }

   private static boolean N(class07252 var0, class06695 var1, int var2, class07211 var3) {
      class06584 class06584 = var1.method_5438(var2);
      if (!class06584.R() && N(var0, var1, class06584, var2, var3)) {
         int i = class06584.c();
         if (N(var1, var0, var1.method_5434(var2, 1), null).R()) {
            var1.method_5431();
            return true;
         }

         class06584.i(i);
         if (i == 1) {
            var1.method_5447(var2, class06584);
         }
      }

      return false;
   }

   public static boolean N(class07299 var0, class07252 var1) {
      class07209 class07209 = class07209.method_49637(var1.T(), var1.b() + 1.0, var1.j());
      class00500 class00500 = var0.method_8320(class07209);
      class06695 class06695 = y(var0, var1, class07209, class00500);
      CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
      y(var0, var1, callbackinforeturnable1, class06695);
      if (callbackinforeturnable1.isCancelled()) {
         return callbackinforeturnable1.getReturnValueZ();
      } else if (class06695 != null) {
         class07211 class07211x = class07211.field_11033;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         N(var0, var1, callbackinforeturnable, class06695);
         if (callbackinforeturnable.isCancelled()) {
            return callbackinforeturnable.getReturnValueZ();
         } else {
            class07211 class07211x = class07211x;

            for (int i : N(class06695, class07211x)) {
               if (N(var1, class06695, i, class07211x)) {
                  return true;
               }
            }

            return false;
         }
      } else {
         boolean flag = var1.v() && class00500.W(var0, class07209) && !class00500.N(class01210.LF);
         if (!flag) {
            for (class00717 class00717 : L(var0, var1)) {
               if (N(var1, class00717)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static boolean N(class06695 var0, class06584 var1, int var2, @Nullable class07211 var3) {
      return !var0.method_5437(var2, var1) ? false : !(var0 instanceof class07054) || ((class07054)var0).N(var2, var1, var3);
   }

   private static boolean N(class06695 var0, class06695 var1, class06584 var2, int var3, class07211 var4) {
      return !var1.N(var0, var3, var2) ? false : !(var1 instanceof class07054) || ((class07054)var1).y(var3, var2, var4);
   }

   @Nullable
   private static class06695 N(class07299 var0, class07252 var1, class07209 var2, class00500 var3) {
      return N(var0, var2, var3, var1.T(), var1.b() + 1.0, var1.j());
   }

   private static boolean N(class07299 var0, class07209 var1, class00500 var2, class07234 var3, BooleanSupplier var4) {
      if (var0.method_8608()) {
         return false;
      } else {
         if (!var3.z() && var2.L(class00739.L)) {
            boolean flag = false;
            if (!y(var3)) {
               flag = N(var0, var1, var3);
            }

            if (!N(var3)) {
               flag |= var4.getAsBoolean();
            }

            if (flag) {
               var3.y(8);
               N(var0, var1, var2);
               return true;
            }
         }

         N(var0, var1, var2, var3, var4, null);
         return false;
      }
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class07234 var3) {
      var3.P--;
      var3.s = var0.N();
      if (!var3.z()) {
         var3.y(0);
         N(var0, var1, var2, var3, (BooleanSupplier)(() -> N(var0, (class07252)var3)));
         N(var0, var1, var2, var3, null);
      }
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (!this.a_(var1)) {
         class06686.N(var1, this.m);
      }

      var1.N("TransferCooldown", this.P);
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.m = class00743.method_10213(this.method_5439(), class06584.E);
      if (!this.c_(var1)) {
         class06686.N(var1, this.m);
      }

      this.P = var1.N("TransferCooldown", -1);
   }

   private static boolean N(class07299 var0, class07209 var1, class07234 var2) {
      class06695 class06695 = L(var0, var1, var2);
      CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
      y(var0, var1, var2, callbackinforeturnable1, class06695);
      if (callbackinforeturnable1.isCancelled()) {
         return callbackinforeturnable1.getReturnValueZ();
      } else if (class06695 == null) {
         return false;
      } else {
         class07211 class07211 = var2.T.b();
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         N(var0, var1, var2, callbackinforeturnable, class06695);
         if (callbackinforeturnable.isCancelled()) {
            return callbackinforeturnable.getReturnValueZ();
         } else if (y(class06695, class07211)) {
            return false;
         } else {
            for (int i = 0; i < var2.method_5439(); i++) {
               class06584 class06584 = var2.method_5438(i);
               if (!class06584.R()) {
                  int jx = class06584.c();
                  if (N(var2, class06695, var2.method_5434(i, 1), class07211).R()) {
                     class06695.method_5431();
                     return true;
                  }

                  class06584.i(jx);
                  if (jx == 1) {
                     var2.method_5447(i, class06584);
                  }
               }
            }

            return false;
         }
      }
   }

   private static int[] N(class06695 var0, class07211 var1) {
      if (var0 instanceof class07054 class07054) {
         return class07054.N(var1);
      } else {
         int i = var0.method_5439();
         if (i < M.length) {
            int[] aint = M[i];
            if (aint != null) {
               return aint;
            } else {
               int[] aint1 = N(i);
               M[i] = aint1;
               return aint1;
            }
         } else {
            return N(i);
         }
      }
   }

   private static int[] N(int var0) {
      int[] aint = new int[var0];
      int i = 0;

      while (i < aint.length) {
         aint[i] = i++;
      }

      return aint;
   }

   @Override
   protected void N(class00743<class06584> var1) {
      this.m = var1;
      this.N(var1, null);
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class07049 var3, class07234 var4) {
      if (var3 instanceof class00717 class00717
         && !class00717.N().R()
         && var3.method_5829().u(-var1.method_10263(), -var1.method_10264(), -var1.method_10260()).L(var4.ae_())) {
         N(var0, var1, var2, var4, (BooleanSupplier)(() -> N((class06695)var4, class00717)));
      }
   }

   @Override
   protected class07482 N(int var1, class08044 var2) {
      return new class07478(var1, var2, this);
   }

   @Nullable
   public static class06695 N(class07299 var0, class07209 var1) {
      return N(var0, var1, var0.method_8320(var1), var1.method_10263() + 0.5, var1.method_10264() + 0.5, var1.method_10260() + 0.5);
   }

   @Nullable
   private static class06695 N(class07299 var0, class07209 var1, class00500 var2, double var3, double var5, double var7) {
      class06695 class06695 = L(var0, var1, var2);
      if (class06695 == null) {
         class06695 = N(var0, var3, var5, var7);
      }

      return class06695;
   }

   @Nullable
   private static class06695 N(class07299 var0, double var1, double var3, double var5) {
      List<class07049> list = var0.method_8333(
         (class07049)null, new class00734(var1 - 0.5, var3 - 0.5, var5 - 0.5, var1 + 0.5, var3 + 0.5, var5 + 0.5), class07042.u
      );
      return !list.isEmpty() ? (class06695)list.get(var0.field_9229.y(list.size())) : null;
   }

   private static void N(class07299 var0, class07209 var1, class07234 var2, CallbackInfoReturnable var3, class06695 var4) {
      if (var4 != null && var2 instanceof class07234 && !(var2 instanceof class07054)) {
         class07234 class07234x = var2;
         LithiumStackList lithiumstacklist = InventoryHelper.getLithiumStackList(class07234x);
         if (class07234x.k == var4 && lithiumstacklist.getModCount() == class07234x.b && class07234x.Q != null && class07234x.Q.getModCount() == class07234x.g) {
            var3.setReturnValue(false);
         } else {
            boolean flag = var4 instanceof class07234 && !((class07234)var4).U() && class07234x.Q != null && class07234x.Q.getOccupiedSlots() == 0;
            boolean flag1 = var4.canReceiveTransferCooldown() && class07234x.Q != null ? class07234x.Q.getOccupiedSlots() == 0 : var4.method_5442();
            if (class07234x.k != var4 || class07234x.Q.getFullSlots() != class07234x.Q.size()) {
               class07211 class07211 = class07234x.T.b();
               int i = lithiumstacklist.size();

               for (int jx = 0; jx < i; jx++) {
                  class06584 class06584 = (class06584)lithiumstacklist.get(jx);
                  if (!class06584.R() && HopperHelper.tryMoveSingleItem(var4, class06584, class07211)) {
                     if (flag) {
                        class07234 class07234x = (class07234)var4;
                        byte b0 = 8;
                        if (class07234x.s >= class07234x.s) {
                           b0 = 7;
                        }

                        class07234x.y(b0);
                     }

                     if (flag1) {
                        var4.setTransferCooldown(class07234x.s);
                     }

                     var4.method_5431();
                     var3.setReturnValue(true);
                     return;
                  }
               }
            }

            class07234x.b = lithiumstacklist.getModCount();
            if (class07234x.Q != null) {
               class07234x.g = class07234x.Q.getModCount();
            }

            var3.setReturnValue(false);
         }
      }
   }

   private static boolean N(class06584 var0, class06584 var1) {
      return var0.c() <= var0.U() && class06584.L(var0, var1);
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      this.y(null);
      this.aC_().set(var1, var2);
      var2.R(this.a_(var2));
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      this.y(null);
      return class06686.N(this.aC_(), var1, var2);
   }

   public class01099 lithium$getSleepingTicker() {
      return this.A;
   }

   public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor var1) {
      this.F = var1;
      this.lithium$setSleepingTicker(null);
   }

   public void lithium$setSleepingTicker(class01099 var1) {
      this.A = var1;
   }

   public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
      return this.F;
   }

   public void lithium$handleInventoryRemoved(class06695 var1) {
      if (this instanceof SleepingBlockEntity) {
         this.wakeUpNow();
      }

      if (var1 == this.d) {
         this.P();
      }

      if (var1 == this.w) {
         this.n();
      }

      if (var1 == this) {
         this.W();
      }
   }

   public boolean lithium$handleComparatorAdded(class06695 var1) {
      if (var1 == this.w && this instanceof SleepingBlockEntity) {
         this.wakeUpNow();
         return true;
      } else {
         return false;
      }
   }

   public void lithium$handleEntityMovement(Object var1) {
      if (this instanceof SleepingBlockEntity) {
         this.wakeUpNow();
      }
   }

   @Override
   protected class00392 an_() {
      return Z;
   }

   public void lithium$invalidateCacheOnUndirectedNeighborUpdate() {
      if (this.l == BlockInventory.NO_BLOCK_INVENTORY || this.l == BlockInventory.BLOCK_STATE) {
         this.n();
      }

      if (this.n == BlockInventory.NO_BLOCK_INVENTORY || this.n == BlockInventory.BLOCK_STATE) {
         this.P();
      }
   }

   public boolean lithium$startSleeping() {
      if (this.isSleeping()) {
         return false;
      } else {
         WrappedBlockEntityTickInvokerAccessor wrappedblockentitytickinvokeraccessor = this.lithium$getTickWrapper();
         if (wrappedblockentitytickinvokeraccessor != null) {
            this.lithium$setSleepingTicker(wrappedblockentitytickinvokeraccessor.getWrapped());
            wrappedblockentitytickinvokeraccessor.callSetWrapped(SleepingBlockEntity.SLEEPING_BLOCK_ENTITY_TICKER);
            this.s = Long.MAX_VALUE;
            return true;
         } else {
            return false;
         }
      }
   }

   public void lithium$invalidateCacheOnNeighborUpdate(class07211 var1) {
      boolean flag = var1 == class07211.field_11036;
      if (flag || this.w().L(class00739.y) == var1) {
         this.lithium$invalidateCacheOnNeighborUpdate(flag);
      }
   }

   public void lithium$invalidateCacheOnNeighborUpdate(boolean var1) {
      if (var1) {
         if (this.l == BlockInventory.NO_BLOCK_INVENTORY || this.l == BlockInventory.BLOCK_STATE) {
            this.n();
         }
      } else if (this.n == BlockInventory.NO_BLOCK_INVENTORY || this.n == BlockInventory.BLOCK_STATE) {
         this.P();
      }
   }

   private void W() {
      this.p = false;
      this.m();
      this.s();
   }

   private void R(class07299 var1) {
      assert var1 instanceof class04782;

      class07211 class07211 = this.T;
      class07209 class07209 = this.U.method_10093(class07211);
      this.X = new class00734(
         class07209.method_10263(),
         class07209.method_10264(),
         class07209.method_10260(),
         class07209.method_10263() + 1,
         class07209.method_10264() + 1,
         class07209.method_10260() + 1
      );
      this.c = SectionedInventoryEntityMovementTracker.registerAt((class04782)this.z, this.X, class06695.class);
      this.a = Long.MIN_VALUE;
   }

   @Override
   public int method_5439() {
      return this.m.size();
   }

   public void lithium$handleInventoryContentModified(class06695 var1) {
      if (this instanceof SleepingBlockEntity) {
         this.wakeUpNow();
      }
   }
}
