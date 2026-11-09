package minecraft;

import Nursultan.class09358;
import Nursultan.class09361;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Consumer;
import net.caffeinemc.mods.lithium.common.block.entity.SetBlockStateHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracker;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracking;
import net.caffeinemc.mods.lithium.common.world.blockentity.SupportCache;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget.OnAttachedSet;
import net.fabricmc.fabric.api.blockview.v2.RenderDataBlockEntity;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.impl.attachment.AttachmentSerializingImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSync;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo.BlockEntityTarget;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class00394
   implements class06960,
   SetBlockStateHandlingBlockEntity,
   SetChangedHandlingBlockEntity,
   ComparatorTracker,
   SupportCache,
   RenderDataBlockEntity,
   AttachmentTargetImpl {
   private static final Codec<class00404<?>> N = class04206.U.T();
   private static final Logger y = LogUtils.getLogger();
   private final class00404<?> u;
   @Nullable
   protected class07299 z;
   public final class07209 U;
   protected boolean E;
   private class00500 i;
   private class02695 R;
   @Nullable
   private IdentityHashMap M = null;
   @Nullable
   private IdentityHashMap B = null;
   @Nullable
   private IdentityHashMap Z = null;
   private boolean m;
   private static final byte P = -1;
   private static final byte s = 1;
   private static final byte T = 0;
   byte W;

   public class00500 w() {
      return this.i;
   }

   public final class07001 L(class01929 var1) {
      class07001 class07001;
      try (class04495 class04495 = new class04495(this.J(), y)) {
         class08303 class08303 = class08303.N(class04495, var1);
         this.i(class08303);
         class07001 = class08303.y();
      }

      return class07001;
   }

   public final void L(class08299 var1) {
      this.N(var1);
   }

   public void L(class08329 var1) {
      this.i(var1);
      this.M(var1);
   }

   @Deprecated
   public void L(class00500 var1) {
      this.N(var1);
      this.i = var1;
      this.N(var1, null);
      this.u(null);
   }

   private void L(CallbackInfo var1) {
      this.lithium$handleSetChanged();
   }

   public final void M(class08329 var1) {
      this.B(var1);
      var1.N("x", this.U.method_10263());
      var1.N("y", this.U.method_10264());
      var1.N("z", this.U.method_10260());
   }

   public String Q() {
      return class04206.U.y(this.O()) + " // " + this.getClass().getCanonicalName();
   }

   public class00394(class00404<?> var1, class07209 var2, class00500 var3) {
      super();
      this.R = class02695.N;
      this.u = var1;
      this.U = var2.method_10062();
      this.N(var3);
      this.i = var3;
      this.N(var1, var2, var3, null);
      this.y(var1, var2, var3, null);
   }

   private void B(class08329 var1) {
      N(var1, this.O());
   }

   public class02695 I() {
      return this.R;
   }

   public class04489 J() {
      return new class09361(this);
   }

   @Nullable
   public class00381<class07280> i() {
      return null;
   }

   public void i(class08329 var1) {
      this.N(var1);
      var1.N("components", class02695.y, this.R);
      this.N(var1, null);
   }

   public boolean l() {
      return this.z != null;
   }

   public class07209 d() {
      return this.U;
   }

   public boolean k() {
      return this.E;
   }

   public final class02695 g() {
      class02676 class02676 = class02695.N();
      class02676.N(this.R);
      this.N(class02676);
      return class02676.N();
   }

   private void u(CallbackInfo var1) {
      this.lithium$handleSetBlockState();
   }

   public final class07001 u(class01929 var1) {
      class07001 class07001;
      try (class04495 class04495 = new class04495(this.J(), y)) {
         class08303 class08303 = class08303.N(class04495, var1);
         this.R(class08303);
         class07001 = class08303.y();
      }

      return class07001;
   }

   public void u(class08329 var1) {
      this.i(var1);
      this.B(var1);
   }

   public final void y(class06584 var1) {
      this.N(var1.L(), var1.u());
   }

   public boolean y(class00500 var1) {
      return this.u.method_20526(var1);
   }

   public final void y_1(class08299 var1) {
      this.N(var1);
      this.R = var1.<class02695>N("components", class02695.y).orElse(class02695.N);
      this.N(var1, null);
   }

   public final class07001 y_2(class01929 var1) {
      class07001 class07001;
      try (class04495 class04495 = new class04495(this.J(), y)) {
         class08303 class08303 = class08303.N(class04495, var1);
         this.L(class08303);
         class07001 = class08303.y();
      }

      return class07001;
   }

   @Deprecated
   public void y(class08329 var1) {
   }

   private void y(class00404 var1, class07209 var2, class00500 var3, CallbackInfo var4) {
      this.W = -1;
   }

   private void y(CallbackInfo var1) {
      this.W = -1;
   }

   private void N(AttachmentType var1, @Nullable AttachmentChange var2) {
      if (var2 == null) {
         if (this.B == null) {
            return;
         }

         this.B.remove(var1);
      } else {
         if (this.B == null) {
            this.B = new IdentityHashMap();
         }

         this.B.put(var1, var2);
      }
   }

   @Nullable
   public static class00392 N_10(class08299 var0, String var1) {
      return var0.<class00392>N(var1, class03748.N).orElse(null);
   }

   public static class07209 N(class07321 var0, class07001 var1) {
      int ix = var1.y("x", 0);
      int j = var1.y("y", 0);
      int k = var1.y("z", 0);
      int l = class01296.N(ix);
      int i1 = class01296.N(k);
      if (l != var0.B || i1 != var0.Z) {
         y.warn("Block entity {} found in a wrong chunk, expected position from chunk {}", var1, var0);
         ix = var0.N(class01296.y(ix));
         k = var0.y(class01296.y(k));
      }

      return new class07209(ix, j, k);
   }

   @Nullable
   public static class00394 N(class07209 var0, class00500 var1, class07001 var2, class01929 var3) {
      class00404<?> class00404 = var2.<class00404<?>>N_15("id", N).orElse(null);
      if (class00404 == null) {
         y.error("Skipping block entity with invalid type: {}", var2.N("id"));
         return null;
      } else {
         class00394 class00394x;
         try {
            class00394x = class00404.method_11032(var0, var1);
         } catch (Throwable throwable2) {
            y.error("Failed to create block entity {} for block {} at position {} ", new Object[]{class00404, var0, var1, throwable2});
            return null;
         }

         try {
            class00394 class00394x;
            try (class04495 class04495 = new class04495(class00394x.J(), y)) {
               class00394x.y_1(class08308.N(class04495, var3, var2));
               class00394x = class00394x;
            }

            return class00394x;
         } catch (Throwable throwable1) {
            y.error("Failed to load data for block entity {} for block {} at position {}", new Object[]{class00404, var0, var1, throwable1});
            return null;
         }
      }
   }

   private void N(AttachmentType var1, Object var2, class01929 var3) {
      class01042 class01042 = var3 instanceof class01042 ? (class01042)var3 : this.fabric_getDynamicRegistryManager();
      this.N(var1, AttachmentChange.create(this.fabric_getSyncTargetInfo(), var1, var2, class01042));
   }

   private void N(class00404 var1, class07209 var2, class00500 var3, CallbackInfo var4) {
      this.m = this.O().method_20526(var3);
   }

   private void N(class00500 var1, CallbackInfo var2) {
      this.m = this.O().method_20526(var1);
   }

   private void N(CallbackInfo var1) {
      if (this.z != null && !this.z.method_8608() && this instanceof InventoryChangeTracker) {
         ((InventoryChangeTracker)this).lithium$emitRemoved();
      }
   }

   private void N(class00500 var1) {
      if (!this.y(var1)) {
         throw new IllegalStateException("Invalid block entity " + this.Q() + " state at " + this.U + ", got " + var1);
      }
   }

   private void N(class08299 var1, CallbackInfo var2) {
      this.fabric_readAttachmentsFromNbt(var1);
   }

   private void N(class08329 var1, CallbackInfo var2) {
      this.fabric_writeAttachmentsToNbt(var1);
   }

   protected void N(class02676 var1) {
   }

   public void N(class07209 var1, class00500 var2) {
      if (this instanceof class06695 class06695 && this.z != null) {
         class06704.N(this.z, var1, class06695);
      }
   }

   public class07001 N(class01929 var1) {
      return new class07001();
   }

   public static void N(class08329 var0, class00404<?> var1) {
      var0.N("id", N, var1);
   }

   public void N(class08329 var1) {
   }

   protected void N_9(class02666 var1) {
   }

   public boolean N(int var1, int var2) {
      return false;
   }

   public final void N(class02695 var1, class02678 var2) {
      HashSet hashset = new HashSet();
      hashset.add(class02484.NB);
      hashset.add(class02484.Nl);
      class02509 class02509 = class02509.N(var1, var2);
      this.N_9(new class09358(this, hashset, class02509));
      class02678 class02678 = var2.N(hashset::contains);
      this.R = class02678.i().N();
   }

   public void N(class02695 var1) {
      this.R = var1;
   }

   public void N(class07074 var1) {
      var1.N("Name", this::Q);
      var1.N("Cached block", this.w()::toString);
      if (this.z == null) {
         var1.N("Block location", () -> this.U + " (world missing)");
      } else {
         var1.N("Actual block", this.z.method_8320(this.U)::toString);
         class07074.N(var1, this.z, this.U);
      }
   }

   protected static void N(class07299 var0, class07209 var1, class00500 var2) {
      var0.method_8524(var1);
      if (!var2.P()) {
         var0.method_8455(var1, var2.i());
      }
   }

   public void N(class08299 var1) {
   }

   public void N(class07299 var1) {
      this.z = var1;
   }

   public void r_() {
      this.y(null);
      this.E = true;
      this.N(null);
   }

   public void method_5431() {
      if (this.z != null) {
         N(this.z, this.U, this.i);
      }

      this.L(null);
   }

   public boolean lithium$hasAnyComparatorNearby() {
      if (this.W == -1) {
         this.W = (byte)(ComparatorTracking.findNearbyComparators(this.z, this.U) ? 1 : 0);
      }

      return this.W == 1;
   }

   public void R(class08329 var1) {
      this.N(var1);
   }

   public class00404<?> O() {
      return this.u;
   }

   @Nullable
   public class07299 G() {
      return this.z;
   }

   public void Y() {
      this.E = false;
   }

   public AttachmentTargetInfo fabric_getSyncTargetInfo() {
      return new BlockEntityTarget(this.U);
   }

   public Map fabric_getAttachments() {
      return this.M;
   }

   public boolean fabric_shouldTryToSync() {
      return !this.l() || !this.z.method_8608();
   }

   public void fabric_markChanged(AttachmentType var1) {
      this.method_5431();
   }

   @Override
   public void method_74589(class04782 var1, class06990 var2) {
   }

   public boolean hasAttached(AttachmentType var1) {
      return this.M != null && this.M.containsKey(var1);
   }

   public Event onAttachedSet(AttachmentType var1) {
      if (this.Z == null) {
         this.Z = new IdentityHashMap();
      }

      return this.Z.computeIfAbsent(var1, var0 -> EventFactory.createArrayBacked(OnAttachedSet.class, var0x -> (var1x, var2) -> {
         OnAttachedSet[] aonattachedset = var0x;
         int ix = var0x.length;

         for (int j = 0; j < ix; j++) {
            aonattachedset[j].onAttachedSet(var1x, var2);
         }
      }));
   }

   @Nullable
   public Object setAttached(AttachmentType var1, @Nullable Object var2) {
      Object object;
      if (var2 == null) {
         object = this.M == null ? null : this.M.remove(var1);
      } else {
         if (this.M == null) {
            this.M = new IdentityHashMap();
         }

         object = this.M.put(var1, var2);
      }

      if (this.Z != null) {
         Event event = (Event)this.Z.get(var1);
         if (event != null) {
            ((OnAttachedSet)event.invoker()).onAttachedSet(object, var2);
         }
      }

      if (!Objects.equals(object, var2)) {
         this.fabric_markChanged(var1);
         if (this.fabric_shouldTryToSync() && var1.isSynced()) {
            AttachmentChange attachmentchange = AttachmentChange.create(this.fabric_getSyncTargetInfo(), var1, var2, this.fabric_getDynamicRegistryManager());
            this.N(var1, attachmentchange);
            this.fabric_syncChange(var1, attachmentchange);
         }
      }

      return object;
   }

   public void fabric_syncChange(AttachmentType var1, AttachmentChange var2) {
      PlayerLookup.tracking(this).forEach(var3 -> {
         if (((AttachmentTypeImpl)var1).syncPredicate().test(this, var3)) {
            AttachmentSync.trySync(var2, var3);
         }
      });
   }

   @Nullable
   public Object getAttached(AttachmentType var1) {
      return this.M == null ? null : this.M.get(var1);
   }

   public boolean fabric_hasPersistentAttachments() {
      return AttachmentSerializingImpl.hasPersistentAttachments(this.M);
   }

   public class01042 fabric_getDynamicRegistryManager() {
      return this.z.method_30349();
   }

   public void fabric_writeAttachmentsToNbt(class08329 var1) {
      AttachmentSerializingImpl.serializeAttachmentData(var1, this.M);
   }

   public void fabric_readAttachmentsFromNbt(class08299 var1) {
      IdentityHashMap<AttachmentType<?>, Object> identityhashmap = AttachmentSerializingImpl.deserializeAttachmentData(var1);
      if (identityhashmap != null) {
         this.M = identityhashmap;
         if (this.fabric_shouldTryToSync() && this.M != null) {
            this.M.forEach((var2x, var3) -> {
               if (var2x.isSynced()) {
                  this.N(var2x, var3, var1.N());
               }
            });
         }
      }
   }

   public void fabric_computeInitialSyncChanges(class04770 var1, Consumer var2) {
      if (this.B != null) {
         for (Entry entry : this.B.entrySet()) {
            if (((AttachmentTypeImpl)entry.getKey()).syncPredicate().test(this, var1)) {
               var2.accept((AttachmentChange)entry.getValue());
            }
         }
      }
   }

   public boolean lithium$isSupported() {
      return this.m;
   }

   public void lithium$onComparatorAdded(class07211 var1, int var2) {
      byte b0 = this.W;
      if (var1.z() != class07185.field_11052 && b0 != 1 && var2 >= 1 && var2 <= 2) {
         this.W = 1;
         if (this instanceof InventoryChangeTracker) {
            ((InventoryChangeTracker)this).lithium$emitFirstComparatorAdded();
         }
      }
   }
}
