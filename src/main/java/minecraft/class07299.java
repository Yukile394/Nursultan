package minecraft;

import Nursultan.class09323;
import Nursultan.class09349;
import Nursultan.class11938;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalLongRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalLongRef;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import net.caffeinemc.mods.lithium.common.entity.LithiumEntityCollisions;
import net.caffeinemc.mods.lithium.common.entity.movement.ChunkAwareBlockCollisionSweeperBlockPos;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;
import net.caffeinemc.mods.lithium.common.hopper.HopperHelper;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeHelper;
import net.caffeinemc.mods.lithium.common.world.ChunkRandomSource;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import net.caffeinemc.mods.lithium.common.world.LithiumData.Data;
import net.caffeinemc.mods.lithium.common.world.blockentity.BlockEntityGetter;
import net.caffeinemc.mods.lithium.mixin.util.accessors.LevelAccessor;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget.OnAttachedSet;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.impl.attachment.AttachmentSerializingImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07299
   implements class05474,
   class07284,
   AutoCloseable,
   ChunkRandomSource,
   LithiumData,
   BlockEntityGetter,
   LevelAccessor,
   AttachmentTargetImpl,
   LoadedChunksCache {
   public static final Codec<class05946<class07299>> field_25178 = class05946.N(class04227.yg);
   public static final class05946<class07299> field_25179 = class05946.N(class04227.yg, class01894.y("overworld"));
   public static final class05946<class07299> field_25180 = class05946.N(class04227.yg, class01894.y("the_nether"));
   public static final class05946<class07299> field_25181 = class05946.N(class04227.yg, class01894.y("the_end"));
   public static final int field_30965 = 30000000;
   public static final int field_30966 = 512;
   public static final int field_30967 = 32;
   public static final int field_30968 = 15;
   public static final int field_30970 = 20000000;
   public static final int field_30971 = -20000000;
   private static final class04540<class00931> field_61989 = class04540.<class00931>y()
      .N(new class00931(class07107.NR, 0.5F, 1.0F))
      .N(new class00931(class07107.NZ, 1.0F, 1.0F))
      .N();
   protected final List<class01099> field_27082;
   protected final class04358 field_38226;
   private final List<class01099> field_27081;
   private boolean field_9249;
   private final Thread field_17086;
   private final boolean field_24496;
   private int field_9226;
   protected int field_9256;
   protected final int field_9238;
   protected float field_9253;
   protected float field_9235;
   protected float field_9251;
   protected float field_9234;
   public final class06069 field_9229;
   @Deprecated
   private final class06069 field_38861;
   private final class03556<class07376> field_36402;
   protected final class05207 field_9232;
   private final boolean field_9236;
   private final class05517 field_20639;
   private final class05946<class07299> field_25176;
   private final class01042 field_42475;
   private final class03697 field_42476;
   private final class06614 field_62535;
   private long field_35455;
   @Nullable
   private IdentityHashMap dataAttachments = null;
   @Nullable
   private IdentityHashMap syncedAttachments = null;
   @Nullable
   private IdentityHashMap attachedChangedListeners = null;
   private final Set loadedChunks = new HashSet();
   private Data storage;
   private static final class00500 OUTSIDE_WORLD_BLOCK = class00869.mh.W();
   private static final class00500 INSIDE_WORLD_DEFAULT_BLOCK = class00869.N.W();
   private int bottomY;
   private int height;
   private int topYInclusive;

   private void handler$ceb000$lithium$updateHopperOnUpdateSuppression(
      class07209 var1, class00500 var2, int var3, int var4, CallbackInfoReturnable var5, class00570 var6, class00891 var7, class00500 var8, class00500 var9
   ) {
      HopperHelper.updateHopperOnUpdateSuppression(this, var1, var3, var6, var8 != var9);
   }

   @Override
   public Optional method_33594(class07049 var1, class00494 var2, class06889 var3, double var4, double var6, double var8) {
      if (var2.method_1110()) {
         return Optional.empty();
      } else {
         class00734 class00734xx = var2.method_1107().L(var4, var6, var8);
         List<class00494> list = LithiumEntityCollisions.getBlockCollisions(this, var1, class00734xx);
         if (list.isEmpty()) {
            return var2.method_33661(var3);
         } else {
            class08057 class08057 = this.method_8621();
            if (class08057 != null) {
               double d0 = Math.max(class00734xx.y(), class00734xx.u());
               double d1 = class04995.u(0.5, class00734xx.N, class00734xx.u);
               double d2 = class04995.u(0.5, class00734xx.L, class00734xx.R);
               if (2.0 + 2.0 * d0 >= class08057.y(d1, d2)) {
                  list.removeIf(var1x -> !class08057.N(var1x.method_1107()));
               }
            }

            ArrayList arraylist = new ArrayList();

            for (class00494 class00494 : list) {
               for (class00734 class00734x : class00494.method_1090()) {
                  class00734 class00734xx = class00734x.L(var4 / 2.0, var6 / 2.0, var8 / 2.0);
                  arraylist.add(class00734xx);
               }
            }

            return VoxelShapeHelper.getClosestPointTo(var3, var2, arraylist);
         }
      }
   }

   public class03697 method_48963() {
      return this.field_42476;
   }

   @Override
   public class01042 method_30349() {
      return this.field_42475;
   }

   public void method_43128(@Nullable class07049 var1, double var2, double var4, double var6, class04891 var8, class04911 var9, float var10, float var11) {
      this.method_47967(var1, var2, var4, var6, var8, var9, var10, var11, this.field_38861.B());
   }

   @Override
   public boolean method_8608() {
      return this.field_9236;
   }

   @Override
   public int method_31607() {
      return this.bottomY;
   }

   @Override
   public boolean method_8587(class07049 var1, class00734 var2) {
      boolean flag = !LithiumEntityCollisions.doesBoxCollideWithBlocks(this, var1, var2);
      if (flag) {
         flag = !LithiumEntityCollisions.doesBoxCollideWithHardEntities(this, var1, var2);
      }

      if (flag && var1 != null) {
         flag = !LithiumEntityCollisions.doesBoxCollideWithWorldBorder(this, var1, var2);
      }

      return flag;
   }

   @Override
   public Optional method_51718(class07049 var1, class00734 var2) {
      class07209 class07209x = null;
      double d0 = Double.MAX_VALUE;
      ChunkAwareBlockCollisionSweeperBlockPos chunkawareblockcollisionsweeperblockpos = new ChunkAwareBlockCollisionSweeperBlockPos(this, var1, var2);

      while (chunkawareblockcollisionsweeperblockpos.hasNext()) {
         class07209 class07209x = (class07209)chunkawareblockcollisionsweeperblockpos.next();
         double d1 = class07209x.method_19770(var1.method_73189());
         if (d1 < d0 || d1 == d0 && (class07209x == null || class07209x.compareTo(class07209x) < 0)) {
            class07209x = class07209x.method_10062();
            d0 = d1;
         }
      }

      return Optional.ofNullable(class07209x);
   }

   @Override
   public class00500 method_8320(class07209 var1) {
      class00570 class00570 = this.method_8497(class01296.N(var1.method_10263()), class01296.N(var1.method_10260()));
      class00554[] aclass00554 = class00570.u();
      int i = var1.method_10263();
      int j = var1.method_10264();
      int k = var1.method_10260();
      int l = this.method_31602(j);
      if (l >= 0 && l < aclass00554.length && !class00570.O()) {
         class00554 class00554 = aclass00554[l];
         return class00554 != null && !class00554.L() ? class00554.N(i & 15, j & 15, k & 15) : INSIDE_WORLD_DEFAULT_BLOCK;
      } else {
         return OUTSIDE_WORLD_BLOCK;
      }
   }

   @Nullable
   @Override
   public class02796 method_8503() {
      return null;
   }

   public abstract class05042 method_74854();

   public boolean method_8520(class07209 var1) {
      return this.method_70745(var1) == class00801.field_9382;
   }

   public abstract class00616 method_75728();

   @Override
   public void method_8406(class07126 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public class04688 method_8316(class07209 var1) {
      return !this.method_76805(var1) ? class04684.N.M() : this.method_8500(var1).method_8316(var1);
   }

   public class05946<class07299> method_27983() {
      return this.field_25176;
   }

   public abstract class06683 method_8428();

   private boolean wrapOperation$cbp000$lithium$shouldTickBlockPosFilterNull(class07299 var1, class07209 var2, Operation var3) {
      return var2 == null ? false : (Boolean)var3.call(new Object[]{var1, var2});
   }

   public class07299(
      class05207 var1, class05946<class07299> var2, class01042 var3, class03556<class07376> var4, boolean var5, boolean var6, long var7, int var9
   ) {
      super();
      this.field_27082 = Lists.newArrayList();
      this.field_27081 = Lists.newArrayList();
      this.field_9256 = class06069.u().M();
      this.field_9238 = 1013904223;
      this.field_9229 = class06069.u();
      this.field_38861 = class06069.i();
      this.field_9232 = var1;
      this.field_36402 = var4;
      this.field_25176 = var2;
      this.field_9236 = var5;
      this.field_17086 = Thread.currentThread();
      this.field_20639 = new class05517(this, var7);
      this.field_24496 = var6;
      this.field_38226 = new class04358(this, var9);
      this.field_42475 = var3;
      this.field_62535 = class06614.N(var3);
      this.field_42476 = new class03697(var3);
      this.handler$cak000$lithium$initLithiumData(var1, var2, var3, var4, var5, var6, var7, var9, null);
      this.handler$cdn000$lithium$initHeightCache(var1, var2, var3, var4, var5, var6, var7, var9, null);
   }

   @Override
   public void close() throws IOException {
      this.method_8398().close();
   }

   private void handler$cak000$lithium$initLithiumData(
      class05207 var1, class05946 var2, class01042 var3, class03556 var4, boolean var5, boolean var6, long var7, int var9, CallbackInfo var10
   ) {
      this.storage = new Data(var3);
   }

   private void handler$cdn000$lithium$initHeightCache(
      class05207 var1, class05946 var2, class01042 var3, class03556 var4, boolean var5, boolean var6, long var7, int var9, CallbackInfo var10
   ) {
      this.height = ((class07376)var4.N()).Z();
      this.bottomY = ((class07376)var4.N()).B();
      this.topYInclusive = this.bottomY + this.height - 1;
   }

   public class00394 lithium$getLoadedExistingBlockEntity(class07209 var1) {
      if (!this.method_31606(var1) && (this.field_9236 || Thread.currentThread() == this.field_17086)) {
         class08050 class08050 = this.method_8402(class01296.N(var1.method_10263()), class01296.N(var1.method_10260()), class00549.m, false);
         if (class08050 != null) {
            return class08050.method_8321(var1);
         }
      }

      return null;
   }

   private void acknowledgeSyncedEntry(AttachmentType var1, @Nullable AttachmentChange var2) {
      if (var2 == null) {
         if (this.syncedAttachments == null) {
            return;
         }

         this.syncedAttachments.remove(var1);
      } else {
         if (this.syncedAttachments == null) {
            this.syncedAttachments = new IdentityHashMap();
         }

         this.syncedAttachments.put(var1, var2);
      }
   }

   public Map fabric_getAttachments() {
      return this.dataAttachments;
   }

   public boolean fabric_shouldTryToSync() {
      return !this.method_8608();
   }

   public Set fabric_getLoadedChunks() {
      return this.loadedChunks;
   }

   public void fabric_markUnloaded(class00570 var1) {
      this.loadedChunks.remove(var1);
   }

   private void acknowledgeSynced(AttachmentType var1, Object var2, class01929 var3) {
      class01042 class01042 = var3 instanceof class01042 ? (class01042)var3 : this.fabric_getDynamicRegistryManager();
      this.acknowledgeSyncedEntry(var1, AttachmentChange.create(this.fabric_getSyncTargetInfo(), var1, var2, class01042));
   }

   public boolean hasAttached(AttachmentType var1) {
      return this.dataAttachments != null && this.dataAttachments.containsKey(var1);
   }

   public Event onAttachedSet(AttachmentType var1) {
      if (this.attachedChangedListeners == null) {
         this.attachedChangedListeners = new IdentityHashMap();
      }

      return this.attachedChangedListeners.computeIfAbsent(var1, var0 -> EventFactory.createArrayBacked(OnAttachedSet.class, var0x -> (var1x, var2) -> {
         OnAttachedSet[] aonattachedset = var0x;
         int i = var0x.length;

         for (int j = 0; j < i; j++) {
            aonattachedset[j].onAttachedSet(var1x, var2);
         }
      }));
   }

   @Nullable
   public Object setAttached(AttachmentType var1, @Nullable Object var2) {
      Object object;
      if (var2 == null) {
         object = this.dataAttachments == null ? null : this.dataAttachments.remove(var1);
      } else {
         if (this.dataAttachments == null) {
            this.dataAttachments = new IdentityHashMap();
         }

         object = this.dataAttachments.put(var1, var2);
      }

      if (this.attachedChangedListeners != null) {
         Event event = (Event)this.attachedChangedListeners.get(var1);
         if (event != null) {
            ((OnAttachedSet)event.invoker()).onAttachedSet(object, var2);
         }
      }

      if (!Objects.equals(object, var2)) {
         this.fabric_markChanged(var1);
         if (this.fabric_shouldTryToSync() && var1.isSynced()) {
            AttachmentChange attachmentchange = AttachmentChange.create(this.fabric_getSyncTargetInfo(), var1, var2, this.fabric_getDynamicRegistryManager());
            this.acknowledgeSyncedEntry(var1, attachmentchange);
            this.fabric_syncChange(var1, attachmentchange);
         }
      }

      return object;
   }

   public class00570 method_8497(int var1, int var2) {
      return (class00570)this.method_8402(var1, var2, class00549.m, true);
   }

   @Nullable
   public Object getAttached(AttachmentType var1) {
      return this.dataAttachments == null ? null : this.dataAttachments.get(var1);
   }

   public void method_8533() {
      this.field_9226 = (int)(15.0F - this.method_75728().N(class00608.w));
   }

   protected void method_8543() {
      if (this.field_9232.B()) {
         this.field_9235 = 1.0F;
         if (this.field_9232.R()) {
            this.field_9234 = 1.0F;
         }
      }
   }

   public class03556<class07376> method_40134() {
      return this.field_36402;
   }

   public boolean method_63020() {
      return this.method_8597().i() && !this.method_8597().R() && this.method_27983() != field_25181;
   }

   public abstract class03106 method_54719();

   public void method_18471() {
      LocalLongRefImpl locallongrefimpl = new LocalLongRefImpl();
      locallongrefimpl.init(0L);
      this.field_9249 = true;
      if (!this.field_27081.isEmpty()) {
         this.field_27082.addAll(this.field_27081);
         this.field_27081.clear();
      }

      Iterator<class01099> iterator = this.field_27082.iterator();
      boolean flag = this.method_54719().Z();

      while (iterator.hasNext()) {
         class01099 class01099 = iterator.next();
         if (class01099.method_31704()) {
            iterator.remove();
         } else if (flag) {
            class07209 class07209 = class01099.method_31705();
            if (this.wrapOperation$cbp000$lithium$shouldTickBlockPosFilterNull(this, class07209, var2x -> {
               WrapOperationRuntime.checkArgumentCount(var2x, 2, "[net.minecraft.class_1937, net.minecraft.class_2338]");
               return this.redirect$cbm000$lithium$optimizedShouldTick((class07299)var2x[0], (class07209)var2x[1], locallongrefimpl);
            })) {
               class01099.method_31703();
            }
         }
      }

      this.field_9249 = false;
   }

   public long method_8532() {
      long i;
      long j = i = this.field_9232.L();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, i);
      this.handler$cfl000$nursultan$injectGetTimeOfDay(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueJ() : j;
   }

   public boolean method_39425(long var1) {
      return true;
   }

   public final boolean method_27982() {
      return this.field_24496;
   }

   @Override
   public int method_31604(int var1) {
      return var1 + (this.bottomY >> 4);
   }

   public boolean method_8419() {
      return this.method_63020() && this.method_8430(1.0F) > 0.2;
   }

   public class07209 method_8536(int var1, int var2, int var3, int var4) {
      this.field_9256 = this.field_9256 * 3 + 1013904223;
      int i = this.field_9256 >> 2;
      return new class07209(var1 + (i & 15), var2 + (i >> 16 & var4), var3 + (i >> 8 & 15));
   }

   public boolean method_8546() {
      return this.method_63020() && this.method_8478(1.0F) > 0.9;
   }

   @Override
   public int method_31600() {
      return this.topYInclusive;
   }

   public void method_8455(class07209 var1, class00891 var2) {
      for (class07211 class07211 : class07221.field_11062) {
         class07209 class07209 = var1.method_10093(class07211);
         if (this.E(class07209)) {
            class00500 class00500 = this.method_8320(class07209);
            if (class00500.N(class00869.Ba)) {
               this.method_41410(class00500, class07209, var2, null, false);
            } else if (class00500.u(this, class07209)) {
               class07209 = class07209.method_10093(class07211);
               class00500 = this.method_8320(class07209);
               if (class00500.N(class00869.Ba)) {
                  this.method_41410(class00500, class07209, var2, null, false);
               }
            }
         }
      }
   }

   @Nullable
   @Override
   public class08050 method_8402(int var1, int var2, class00549 var3, boolean var4) {
      class08050 class08050 = this.method_8398().N(var1, var2, var3, var4);
      if (class08050 == null && var4) {
         throw new IllegalStateException("Should always be able to create a chunk!");
      } else {
         return class08050;
      }
   }

   public boolean method_8501(class07209 var1, class00500 var2) {
      return this.method_8652(var1, var2, 3);
   }

   public abstract void method_8465(
      @Nullable class07049 var1, double var2, double var4, double var6, class03556<class04891> var8, class04911 var9, float var10, float var11, long var12
   );

   @Override
   public class07376 method_8597() {
      return this.field_36402.N();
   }

   public abstract void method_8517(int var1, class07209 var2, int var3);

   public void method_8508(class07209 var1, class00891 var2, class07211 var3, @Nullable class02733 var4) {
   }

   public boolean method_8505(class07049 var1, class07209 var2) {
      return true;
   }

   public void method_8492(class07209 var1, class00891 var2, @Nullable class02733 var3) {
   }

   public void method_41410(class00500 var1, class07209 var2, class00891 var3, @Nullable class02733 var4, boolean var5) {
   }

   public abstract void method_8413(class07209 var1, class00500 var2, class00500 var3, int var4);

   @Nullable
   public class07049 method_66347(UUID var1) {
      return this.method_31592().N(var1);
   }

   protected abstract class01124<class07049> method_31592();

   public abstract void method_8449(@Nullable class07049 var1, class07049 var2, class03556<class04891> var3, class04911 var4, float var5, float var6, long var7);

   public void method_8452(class07209 var1, class00891 var2, @Nullable class02733 var3) {
   }

   public abstract void method_8454(
      @Nullable class07049 var1,
      @Nullable class07072 var2,
      @Nullable class01284 var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      class07328 var12,
      class07126 var13,
      class07126 var14,
      class04540<class00931> var15,
      class03556<class04891> var16
   );

   public void method_8474(int var1, class07209 var2, int var3) {
   }

   public void method_8421(class07049 var1, byte var2) {
   }

   public void method_48760(class07049 var1, class07072 var2) {
   }

   public abstract Collection<class00695> method_65097();

   public void method_66016(class07209 var1, class00500 var2, class00500 var3) {
   }

   public boolean method_8458() {
      return false;
   }

   @Nullable
   public abstract class07769 method_17891(class02265 var1);

   public void method_8427(class07209 var1, class00891 var2, int var3, int var4) {
      this.method_8320(var1).N(this, var1, var3, var4);
   }

   @Nullable
   public class08036 method_73285(UUID var1) {
      return this.N(var1);
   }

   @Nullable
   public abstract class07049 method_8469(int var1);

   @Nullable
   public class07049 method_73284(UUID var1) {
      return this.method_66347(var1);
   }

   public boolean method_41411(class07209 var1) {
      return this.method_39425(class07321.N(var1));
   }

   public abstract void method_27873(class05042 var1);

   public class07074 method_8538(class07080 var1) {
      class07074 class07074 = var1.N("Affected level", 1);
      class07074.N("All players", () -> {
         List<? extends class08036> list = this.method_18456();
         return list.size() + " total; " + list.stream().map(class08036::method_68877).collect(Collectors.joining(", "));
      });
      class07074.N("Chunk stats", this.method_8398()::N);
      class07074.N("Level dimension", () -> this.method_27983().N().toString());

      try {
         this.field_9232.N(class07074, this);
      } catch (Throwable throwable) {
         class07074.N("Level Data Unobtainable", throwable);
      }

      return class07074;
   }

   public abstract String method_31419();

   public Data lithium$getData() {
      return this.storage;
   }

   public abstract class06511 method_59547();

   public abstract class00272 method_8433();

   @Override
   public int method_8624(class07830 var1, int var2, int var3) {
      int i;
      if (var2 >= -30000000 && var3 >= -30000000 && var2 < 30000000 && var3 < 30000000) {
         if (this.N(class01296.N(var2), class01296.N(var3))) {
            i = this.method_8497(class01296.N(var2), class01296.N(var3)).N(var1, var2 & 15, var3 & 15) + 1;
         } else {
            i = this.method_31607();
         }
      } else {
         i = this.method_8615() + 1;
      }

      return i;
   }

   public <T extends class07049> void method_18472(Consumer<T> var1, T var2) {
      try {
         var1.accept(var2);
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Ticking entity");
         class07074 class07074 = class07080.N("Entity being ticked");
         var2.method_5819(class07074);
         throw new class07878(class07080);
      }
   }

   @Override
   public class05087 method_8401() {
      return this.field_9232;
   }

   public void method_71970(class00394 var1) {
   }

   public abstract class02755 method_61269();

   @Override
   public boolean method_31606(class07209 var1) {
      int i = var1.method_10264();
      return i < this.bottomY || i > this.topYInclusive;
   }

   private static boolean method_76804(class07209 var0) {
      int i = class01296.N(var0.method_10263());
      int j = class01296.N(var0.method_10260());
      return class07321.L(i, j);
   }

   public boolean method_24794(class07209 var1) {
      return !this.method_31606(var1) && method_8558(var1);
   }

   @Override
   public boolean method_8652(class07209 var1, class00500 var2, int var3) {
      return this.method_30092(var1, var2, var3, 512);
   }

   public static boolean method_25953(class07209 var0) {
      return !method_25952(var0.method_10264()) && method_8558(var0);
   }

   private static boolean method_8558(class07209 var0) {
      return var0.method_10263() >= -30000000 && var0.method_10260() >= -30000000 && var0.method_10263() < 30000000 && var0.method_10260() < 30000000;
   }

   @Override
   public boolean method_30092(class07209 var1, class00500 var2, int var3, int var4) {
      if (!this.method_76805(var1)) {
         return false;
      } else if (!this.method_8608() && this.method_27982()) {
         return false;
      } else {
         class00570 class00570 = this.method_8500(var1);
         class00891 class00891 = var2.i();
         class00500 class00500x = class00570.N(var1, var2, var3);
         if (class00500x == null) {
            return false;
         } else {
            class00500 class00500x = this.method_8320(var1);
            if (class00500x == var2) {
               if (class00500x != class00500x) {
                  this.method_16109(var1, class00500x, class00500x);
               }

               if ((var3 & 2) != 0
                  && (!this.method_8608() || (var3 & 4) == 0)
                  && (this.method_8608() || class00570.g() != null && class00570.g().N(class04763.field_44856))) {
                  this.method_8413(var1, class00500x, var2, var3);
               }

               if ((var3 & 1) != 0) {
                  this.method_8408(var1, class00500x.i());
                  if (!this.method_8608() && var2.v()) {
                     this.method_8455(var1, class00891);
                  }
               }

               if ((var3 & 16) == 0 && var4 > 0) {
                  int i = var3 & -34;
                  class00500x.y(this, var1, i, var4 - 1);
                  var2.N((class07284)this, var1, i, var4 - 1);
                  var2.y(this, var1, i, var4 - 1);
               }

               this.handler$ceb000$lithium$updateHopperOnUpdateSuppression(var1, var2, var3, var4, null, class00570, class00891, class00500x, class00500x);
               this.method_66016(var1, class00500x, class00500x);
            }

            return true;
         }
      }
   }

   @Override
   public boolean method_8650(class07209 var1, boolean var2) {
      class04688 class04688 = this.method_8316(var1);
      return this.method_8652(var1, class04688.B(), 3 | (var2 ? 64 : 0));
   }

   public void method_16109(class07209 var1, class00500 var2, class00500 var3) {
   }

   private static boolean method_25952(int var0) {
      return var0 < -20000000 || var0 >= 20000000;
   }

   public boolean method_76805(class07209 var1) {
      return !this.method_31606(var1) && method_76804(var1);
   }

   public float method_8430(float var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$cfl000$nursultan$injectGetRainGradient(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueF() : class04995.B(var1, this.field_9253, this.field_9235);
   }

   public void method_8496(float var1) {
      float f = class04995.N(var1, 0.0F, 1.0F);
      this.field_9251 = f;
      this.field_9234 = f;
   }

   public boolean method_23886() {
      return !this.method_8597().u() && !this.method_8530();
   }

   public void method_67392(class04891 var1, class04911 var2, float var3, float var4) {
   }

   @Override
   public List<class07049> method_8333(@Nullable class07049 var1, class00734 var2, Predicate<? super class07049> var3) {
      class08700.N().R("getEntities");
      ArrayList arraylist = Lists.newArrayList();
      this.method_31592().N(var2, var3x -> {
         if (var3x != var1 && var3.test(var3x)) {
            arraylist.add(var3x);
         }
      });

      for (class00695 class00695 : this.method_65097()) {
         if (class00695 != var1 && class00695.N != var1 && var3.test(class00695) && var2.L(class00695.method_5829())) {
            arraylist.add(class00695);
         }
      }

      return arraylist;
   }

   public void method_8437(@Nullable class07049 var1, double var2, double var4, double var6, float var8, class07328 var9) {
      this.method_8454(var1, class07307.N(this, var1), null, var2, var4, var6, var8, false, var9, class07107.l, class07107.G, field_61989, class04909.EA);
   }

   @Override
   public boolean method_30093(class07209 var1, boolean var2, @Nullable class07049 var3, int var4) {
      class00500 class00500 = this.method_8320(var1);
      if (class00500.P()) {
         return false;
      } else {
         class04688 class04688 = this.method_8316(var1);
         if (!(class00500.i() instanceof class05989)) {
            this.N(2001, var1, class00891.W(class00500));
         }

         if (var2) {
            class00394 class00394 = class00500.k() ? this.method_8321(var1) : null;
            class00891.N(class00500, this, var1, class00394, var3, class06584.E);
         }

         boolean flag = this.method_30092(var1, class04688.B(), 3, var4);
         if (flag) {
            this.N(class01194.R, var1, class01164.N(var3, class00500));
         }

         return flag;
      }
   }

   public void method_43129(@Nullable class07049 var1, class07049 var2, class04891 var3, class04911 var4, float var5, float var6) {
      this.method_8449(var1, var2, class04206.y.i(var3), var4, var5, var6, this.field_38861.B());
   }

   @Nullable
   @Override
   public class00394 method_8321(class07209 var1) {
      if (!this.method_76805(var1)) {
         return null;
      } else {
         return !this.method_8608() && Thread.currentThread() != this.field_17086 ? null : this.method_8500(var1).N(var1, class00531.field_12860);
      }
   }

   public void method_47967(
      @Nullable class07049 var1, double var2, double var4, double var6, class04891 var8, class04911 var9, float var10, float var11, long var12
   ) {
      this.method_8465(var1, var2, var4, var6, class04206.y.i(var8), var9, var10, var11, var12);
   }

   public void method_8486(double var1, double var3, double var5, class04891 var7, class04911 var8, float var9, float var10, boolean var11) {
   }

   public void method_55116(class07049 var1, class04891 var2, class04911 var3, float var4, float var5) {
   }

   public void method_31595(class07209 var1, class00500 var2) {
   }

   public boolean method_38989(class07049 var1) {
      return true;
   }

   public void method_55117(
      @Nullable class07049 var1,
      @Nullable class07072 var2,
      @Nullable class01284 var3,
      double var4,
      double var6,
      double var8,
      float var10,
      boolean var11,
      class07328 var12
   ) {
      this.method_8454(var1, var2, var3, var4, var6, var8, var10, var11, var12, class07107.l, class07107.G, field_61989, class04909.EA);
   }

   public <T extends class07049> void method_47575(class01128<class07049, T> var1, class00734 var2, Predicate<? super T> var3, List<? super T> var4, int var5) {
      class08700.N().R("getEntities");
      this.method_31592().N(var1, var2, var4x -> {
         if (var3.test(var4x)) {
            var4.add(var4x);
            if (var4.size() >= var5) {
               return class04218.field_41284;
            }
         }

         if (var4x instanceof class00690) {
            for (class00695 class00695 : ((class00690)var4x).E()) {
               class07049 class07049 = (class07049)var1.N(class00695);
               if (class07049 != null && var3.test(class07049)) {
                  var4.add(class07049);
                  if (var4.size() >= var5) {
                     return class04218.field_41284;
                  }
               }
            }
         }

         return class04218.field_41283;
      });
   }

   public void method_8544(class07209 var1) {
      if (this.method_76805(var1)) {
         this.method_8500(var1).N(var1);
      }
   }

   public void method_46407(
      @Nullable class07049 var1, @Nullable class07072 var2, @Nullable class01284 var3, class06889 var4, float var5, boolean var6, class07328 var7
   ) {
      this.method_8454(var1, var2, var3, var4.N(), var4.y(), var4.L(), var5, var6, var7, class07107.l, class07107.G, field_61989, class04909.EA);
   }

   public List<class07049> method_66349(class07049 var1, class00734 var2) {
      Predicate<class07049> predicate = class07042.N(var1);
      return this.redirect$boe001$lithium$getOtherPushableEntities(this, var1, var2, predicate);
   }

   public void method_8466(class07126 var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
   }

   public boolean method_8530() {
      return !this.method_8597().u() && this.field_9226 < 4;
   }

   public void method_54762(@Nullable class07049 var1, double var2, double var4, double var6, class04891 var8, class04911 var9) {
      this.method_43128(var1, var2, var4, var6, var8, var9, 1.0F, 1.0F);
   }

   @Override
   public void method_8396(@Nullable class07049 var1, class07209 var2, class04891 var3, class04911 var4, float var5, float var6) {
      this.method_43128(var1, var2.method_10263() + 0.5, var2.method_10264() + 0.5, var2.method_10260() + 0.5, var3, var4, var5, var6);
   }

   public void method_17452(class07126 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
   }

   @Override
   public <T extends class07049> List<T> method_18023(class01128<class07049, T> var1, class00734 var2, Predicate<? super T> var3) {
      ArrayList arraylist = Lists.newArrayList();
      this.method_47574(var1, var2, var3, arraylist);
      return arraylist;
   }

   @Override
   public void method_42308(class07211 var1, class07209 var2, class07209 var3, class00500 var4, int var5, int var6) {
      this.field_38226.N(var1, var4, var2, var3, var5, var6);
   }

   public <T extends class07049> void method_47574(class01128<class07049, T> var1, class00734 var2, Predicate<? super T> var3, List<? super T> var4) {
      this.method_47575(var1, var2, var3, var4, Integer.MAX_VALUE);
   }

   public class05042 method_74891(class05042 var1) {
      class08057 class08057 = this.method_8621();
      if (!class08057.N(var1.y())) {
         class07209 class07209 = this.N(class07830.field_13197, class07209.method_49637(class08057.M(), 0.0, class08057.B()));
         return class05042.N(var1.N(), class07209, var1.u(), var1.i());
      } else {
         return var1;
      }
   }

   public <T extends class07049> boolean method_74143(class01128<class07049, T> var1, class00734 var2, Predicate<? super T> var3) {
      class08700.N().R("hasEntities");
      MutableBoolean mutableboolean = new MutableBoolean();
      this.method_31592().N(var1, var2, var3x -> {
         if (var3.test(var3x)) {
            mutableboolean.setTrue();
            return class04218.field_41284;
         } else {
            if (var3x instanceof class00690) {
               for (class00695 class00695 : ((class00690)var3x).E()) {
                  class07049 class07049 = (class07049)var1.N(class00695);
                  if (class07049 != null && var3.test(class07049)) {
                     mutableboolean.setTrue();
                     return class04218.field_41284;
                  }
               }
            }

            return class04218.field_41283;
         }
      });
      return mutableboolean.isTrue();
   }

   public void method_8524(class07209 var1) {
      if (this.E(var1)) {
         this.method_8500(var1).Z();
      }
   }

   public float method_8478(float var1) {
      return class04995.B(var1, this.field_9251, this.field_9234) * this.method_8430(var1);
   }

   public void method_8494(class07126 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   public void method_45446(class07209 var1, class04891 var2, class04911 var3, float var4, float var5, boolean var6) {
      this.method_8486(var1.method_10263() + 0.5, var1.method_10264() + 0.5, var1.method_10260() + 0.5, var2, var3, var4, var5, var6);
   }

   public void method_31594(class01099 var1) {
      (this.field_9249 ? this.field_27081 : this.field_27082).add(var1);
   }

   public void method_8537(@Nullable class07049 var1, double var2, double var4, double var6, float var8, boolean var9, class07328 var10) {
      this.method_8454(var1, class07307.N(this, var1), null, var2, var4, var6, var8, var9, var10, class07107.l, class07107.G, field_61989, class04909.EA);
   }

   public void method_60511(
      @Nullable class07049 var1, double var2, double var4, double var6, class03556<class04891> var8, class04911 var9, float var10, float var11
   ) {
      this.method_8465(var1, var2, var4, var6, var8, var9, var10, var11, this.field_38861.B());
   }

   public boolean method_24368(class07209 var1, class07049 var2, class07211 var3) {
      if (!this.method_76805(var1)) {
         return false;
      } else {
         class08050 class08050 = this.method_8402(class01296.N(var1.method_10263()), class01296.N(var1.method_10260()), class00549.m, false);
         return class08050 == null ? false : class08050.method_8320(var1).N(this, var1, var2, var3);
      }
   }

   public void method_8438(class00394 var1) {
      class07209 class07209 = var1.d();
      if (this.method_76805(class07209)) {
         this.method_8500(class07209).y(var1);
      }
   }

   public boolean method_8515(class07209 var1, class07049 var2) {
      return this.method_24368(var1, var2, class07211.field_11036);
   }

   public void method_8424(boolean var1) {
      this.method_8398().N(var1);
   }

   public boolean method_8477(class07209 var1) {
      return !this.method_76805(var1) ? false : this.method_8398().L(class01296.N(var1.method_10263()), class01296.N(var1.method_10260()));
   }

   @Override
   public class05795 method_22336() {
      return this.method_8398().L();
   }

   @Override
   public int method_32891() {
      return this.bottomY >> 4;
   }

   @Override
   public int method_32890() {
      return (this.topYInclusive >> 4) + 1 - (this.bottomY >> 4);
   }

   @Override
   public long method_39224() {
      return this.field_35455++;
   }

   @Override
   public int method_31597() {
      return this.topYInclusive >> 4;
   }

   public class06614 method_74142() {
      return this.field_62535;
   }

   @Override
   public class08050 method_8500(class07209 var1) {
      return this.method_8402(class01296.N(var1.method_10263()), class01296.N(var1.method_10260()), class00549.m, true);
   }

   @Override
   public boolean method_31601(int var1) {
      return var1 < this.bottomY || var1 > this.topYInclusive;
   }

   @Override
   public int method_31603(int var1) {
      return var1 - (this.bottomY >> 4);
   }

   public void fabric_markLoaded(class00570 var1) {
      this.loadedChunks.add(var1);
   }

   public void method_8547(double var1, double var3, double var5, double var7, double var9, double var11, List<class02827> var13) {
   }

   @Override
   public class05517 method_22385() {
      return this.field_20639;
   }

   public class00801 method_70745(class07209 var1) {
      if (!this.method_8419()) {
         return class00801.field_9384;
      } else if (!this.N_17(var1)) {
         return class00801.field_9384;
      } else {
         return this.N(class07830.field_13197, var1).method_10264() > var1.method_10264()
            ? class00801.field_9384
            : this.i(var1).N().N(var1, this.method_8615());
      }
   }

   @Override
   public boolean method_35237(class07209 var1, Predicate<class04688> var2) {
      return var2.test(this.method_8316(var1));
   }

   public void method_8509(int var1) {
   }

   public int method_67233(class07209 var1) {
      return 0;
   }

   public void method_8519(float var1) {
      float f = class04995.N(var1, 0.0F, 1.0F);
      this.field_9253 = f;
      this.field_9235 = f;
   }

   @Override
   public class08050 method_22342(int var1, int var2, class00549 var3) {
      return this.method_8402(var1, var2, var3, true);
   }

   @Override
   public class07290 method_22338(int var1, int var2) {
      return this.method_8402(var1, var2, class00549.m, false);
   }

   @Override
   public int method_8594() {
      return this.field_9226;
   }

   @Override
   public int method_31605() {
      return this.height;
   }

   @Override
   public class06069 method_8409() {
      return this.field_9229;
   }

   @Override
   public boolean method_16358(class07209 var1, Predicate<class00500> var2) {
      return var2.test(this.method_8320(var1));
   }

   public void method_8522(class00381<?> var1) {
      throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
   }

   @Override
   public int method_31602(int var1) {
      return (var1 >> 4) - (this.bottomY >> 4);
   }

   private void handler$cfl000$nursultan$injectGetTimeOfDay(CallbackInfoReturnable var1) {
      if (this.field_9236) {
         class09349 class09349 = class09349.y(var1.getReturnValueJ());
         class11938.L().L(class09349);
         var1.setReturnValue(class09349.N());
      }
   }

   private boolean redirect$cbm000$lithium$optimizedShouldTick(class07299 var1, class07209 var2, LocalLongRef var3) {
      if (var2 == null) {
         return false;
      } else {
         long i = class07321.N(var2);
         if (i == var3.get()) {
            return true;
         } else {
            boolean flag = var1.method_39425(i);
            if (flag) {
               var3.set(i);
            }

            return flag;
         }
      }
   }

   private void handler$cfl000$nursultan$injectGetRainGradient(float var1, CallbackInfoReturnable var2) {
      if (this.field_9236) {
         class09323 class09323 = class09323.L();
         class11938.L().L(class09323);
         if (class09323.y()) {
            var2.setReturnValue(0.0F);
         }
      }
   }

   private List redirect$boe001$lithium$getOtherPushableEntities(class07299 var1, class07049 var2, class00734 var3, Predicate var4) {
      if (var4 == Predicates.alwaysFalse()) {
         return Collections.emptyList();
      } else {
         if (var4 instanceof EntityPushablePredicate entitypushablepredicate) {
            class01129<class07049> class01129 = WorldHelper.getEntityCacheOrNull(var1);
            if (class01129 != null) {
               return WorldHelper.getPushableEntities(var1, class01129, var2, var3, entitypushablepredicate);
            }
         }

         return var1.method_8333(var2, var3, var4);
      }
   }

   public boolean fabric_hasPersistentAttachments() {
      return AttachmentSerializingImpl.hasPersistentAttachments(this.dataAttachments);
   }

   public class01042 fabric_getDynamicRegistryManager() {
      return this.method_30349();
   }

   public void fabric_writeAttachmentsToNbt(class08329 var1) {
      AttachmentSerializingImpl.serializeAttachmentData(var1, this.dataAttachments);
   }

   public void fabric_readAttachmentsFromNbt(class08299 var1) {
      IdentityHashMap<AttachmentType<?>, Object> identityhashmap = AttachmentSerializingImpl.deserializeAttachmentData(var1);
      if (identityhashmap != null) {
         this.dataAttachments = identityhashmap;
         if (this.fabric_shouldTryToSync() && this.dataAttachments != null) {
            this.dataAttachments.forEach((var2x, var3) -> {
               if (var2x.isSynced()) {
                  this.acknowledgeSynced(var2x, var3, var1.N());
               }
            });
         }
      }
   }

   public void fabric_computeInitialSyncChanges(class04770 var1, Consumer var2) {
      if (this.syncedAttachments != null) {
         for (Entry entry : this.syncedAttachments.entrySet()) {
            if (((AttachmentTypeImpl)entry.getKey()).syncPredicate().test(this, var1)) {
               var2.accept((AttachmentChange)entry.getValue());
            }
         }
      }
   }

   public void lithium$getRandomPosInChunk(int var1, int var2, int var3, int var4, class07218 var5) {
      this.field_9256 = this.field_9256 * 3 + 1013904223;
      int i = this.field_9256 >> 2;
      var5.N(var1 + (i & 15), var2 + (i >> 16 & var4), var3 + (i >> 8 & 15));
   }
}
