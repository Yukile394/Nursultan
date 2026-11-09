package minecraft;

import Nursultan.class10465;
import com.google.common.collect.Lists;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;
import net.caffeinemc.mods.lithium.common.world.ServerWorldExtended;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.ServerLevelAccessor;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.EndWorldTick;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents.StartWorldTick;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.impl.attachment.AttachmentPersistentState;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSync;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo.WorldTarget;
import net.fabricmc.fabric.impl.lookup.block.BlockApiCacheImpl;
import net.fabricmc.fabric.impl.lookup.block.ServerWorldCache;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04782
   extends class07299
   implements class00281,
   class05974,
   ServerWorldExtended,
   ServerLevelAccessor,
   net.caffeinemc.mods.lithium.mixin.util.accessors.ServerLevelAccessor,
   net.caffeinemc.mods.lithium.mixin.util.entity_movement_tracking.ServerLevelAccessor,
   AttachmentTargetImpl,
   ServerWorldCache {
   public static final class07209 field_25144 = new class07209(100, 50, 0);
   public static final class02142 field_41749 = class02135.y(12000, 180000);
   public static final class02142 field_41750 = class02135.y(12000, 24000);
   private static final class02142 field_41748 = class02135.y(12000, 180000);
   public static final class02142 field_41751 = class02135.y(3600, 15600);
   private static final Logger field_13952 = LogUtils.getLogger();
   private static final int field_29768 = 300;
   private static final int field_35441 = 65536;
   public final List<class04770> field_18261;
   private final class04751 field_24624;
   private final class02796 field_13959;
   private final class05212 field_24456;
   public final class01139 field_26934;
   private final class00031 field_59630;
   private final class00616 field_64261;
   private final class01104<class07049> field_26935;
   private final class03788 field_39984;
   public boolean field_13957;
   private final class06060 field_28859;
   private int field_13948;
   private final class00770 field_13956;
   private final class04312<class00891> field_13949;
   private final class04312<class04651> field_13951;
   private final class02703 field_49172;
   public Set<class07079> field_26932;
   public volatile boolean field_36317;
   protected final class04868 field_18811;
   private final ObjectLinkedOpenHashSet<class07303> field_13950;
   private final List<class07303> field_35565;
   private boolean field_13953;
   private final List<class05975> field_25141;
   @Nullable
   private class07856 field_25142;
   public final Int2ObjectMap<class00695> field_26933;
   private final class05324 field_23787;
   private final class03179 field_36208;
   private final boolean field_25143;
   private final class03470 field_44857;
   public final class06987 field_62841;
   private final Map apiLookupCaches = new Object2ReferenceOpenHashMap();
   private int apiLookupAccessesWithoutCleanup = 0;
   private final class07218 randomPosInChunkCachedPos = new class07218();
   private static final int MAX_COUNT_FOR_BLOCK_SEARCH_AFTER_RANDOM_CHANCE = 384;

   public class04751 method_14178() {
      return this.field_24624;
   }

   public class00031 method_70636() {
      return this.field_59630;
   }

   @Override
   public void method_32888(class03556<class01194> var1, class06889 var2, class01164 var3) {
      this.field_39984.N(var1, var2, var3);
   }

   public class06987 method_74535() {
      return this.field_62841;
   }

   @Override
   public class02796 method_8503() {
      return this.field_13959;
   }

   @Override
   public class08057 method_8621() {
      class08057 class08057 = this.method_17983().N(class08057.u);
      class08057.N(this.field_9232.y());
      return class08057;
   }

   @Override
   public class05042 method_74854() {
      return this.method_8503().yR();
   }

   @Override
   public class00616 method_75728() {
      return this.field_64261;
   }

   @Override
   public boolean method_8649(class07049 var1) {
      return this.method_14175(var1);
   }

   public <T extends class07126> int method_65096(
      T var1, double var2, double var4, double var6, int var8, double var9, double var11, double var13, double var15
   ) {
      return this.method_14199(var1, false, false, var2, var4, var6, var8, var9, var11, var13, var15);
   }

   public boolean method_75002(class07299 var1) {
      return var1.method_27983() == class07299.field_25180 ? this.method_64395().N(class07305.L) : true;
   }

   public void method_18769(class07049 var1) {
      if (var1 instanceof class04770 class04770) {
         this.method_18771(class04770);
      } else {
         this.method_14175(var1);
      }
   }

   public void method_14197() {
      this.field_13948 = 0;
   }

   @Override
   public List<class04770> method_18456() {
      return this.field_18261;
   }

   public class04782(
      class02796 var1,
      Executor var2,
      class04785 var3,
      class05212 var4,
      class05946<class07299> var5,
      class01255 var6,
      boolean var7,
      long var8,
      List<class05975> var10,
      boolean var11,
      @Nullable class03470 var12
   ) {
      super(var4, var5, var1.yt(), var6.N(), false, var7, var8, var1.Nu());
      this.field_18261 = Lists.newArrayList();
      this.field_26934 = new class01139();
      this.field_13949 = new class04312<>(this::method_37117);
      this.field_13951 = new class04312<>(this::method_37117);
      this.field_49172 = new class02703();
      this.field_26932 = new ObjectOpenHashSet();
      this.field_13950 = new ObjectLinkedOpenHashSet();
      this.field_35565 = new ArrayList<>(64);
      this.field_26933 = new Int2ObjectOpenHashMap();
      this.field_62841 = new class06987(this);
      this.field_25143 = var11;
      this.field_13959 = var1;
      this.field_25141 = var10;
      this.field_24456 = var4;
      class08088 class08088 = var6.y();
      boolean flag = var1.j();
      DataFixer datafixer = var1.ND();
      class01116 class01116 = new class01116(
         new class06172(new class02277(var3.R(), var5, "entities"), var3.N(var5).resolve("entities"), datafixer, flag, class05715.field_26990), this, var1
      );
      this.field_26935 = new class01104<>(class07049.class, new class10465(this), class01116);
      this.field_24624 = new class04751(
         this, var3, datafixer, var1.yv(), var2, class08088, var1.Nm().T(), var1.Nm().b(), flag, this.field_26935::N, () -> var1.NY().method_17983()
      );
      this.field_24624.E().y();
      this.field_13956 = new class00770(this);
      if (this.method_63020()) {
         this.method_8543();
      }

      this.field_18811 = this.method_17983().N(class04868.N(this.method_40134()));
      if (!var1.No()) {
         var4.N(var1.NT());
      }

      long i = var1.yn().l().L();
      this.field_36208 = new class03179(
         this.field_24624.T(), this.method_30349(), var1.yv(), var5, class08088, this.field_24624.W(), this, class08088.u(), i, datafixer
      );
      this.field_23787 = new class05324(this, var1.yn().l(), this.field_36208);
      if (this.method_27983() == class07299.field_25181 && this.method_40134().N(class04057.L)) {
         this.field_25142 = new class07856(this, i, var1.yn().Y());
      } else {
         this.field_25142 = null;
      }

      this.field_28859 = new class06060();
      this.field_39984 = new class03788(this);
      this.field_44857 = Objects.requireNonNullElseGet(var12, () -> this.method_17983().N(class03470.y));
      this.field_59630 = new class00031();
      this.field_64261 = class00616.N().N(this).N();
      this.method_8533();
      this.m_handler$zcp000$fabric_data_attachment_api_v1$createAttachmentsPersistentState_44(null);
      this.handler$bpd000$lithium$init(var1, var2, var3, var4, var5, var6, var7, var8, var10, var11, var12, null);
   }

   @Override
   public String toString() {
      return "ServerLevel[" + this.field_24456.u() + "]";
   }

   @Override
   public void close() throws IOException {
      super.close();
      this.field_26935.close();
   }

   private void m_handler$zhg000$fabric_lifecycle_events_v1$endWorldTick_35(BooleanSupplier var1, CallbackInfo var2) {
      ((EndWorldTick)ServerTickEvents.END_WORLD_TICK.invoker()).onEndTick(this);
   }

   private class07209 redirect$blf000$lithium$redirectTickGetRandomPosInChunk(class04782 var1, int var2, int var3, int var4, int var5) {
      var1.lithium$getRandomPosInChunk(var2, var3, var4, var5, this.randomPosInChunkCachedPos);
      return this.randomPosInChunkCachedPos;
   }

   private void m_handler$zhg000$fabric_lifecycle_events_v1$startWorldTick_36(BooleanSupplier var1, CallbackInfo var2) {
      ((StartWorldTick)ServerTickEvents.START_WORLD_TICK.invoker()).onStartTick(this);
   }

   private Iterator redirect$bpd000$lithium$getActiveListeners(Set var1) {
      return Collections.emptyIterator();
   }

   private class07209 modify$blf000$lithium$immutablePos2(class07209 var1) {
      return var1.method_10062();
   }

   private class07209 redirect$cca000$lithium$getPosOrOrigin(class01099 var1) {
      class07209 class07209 = var1.method_31705();
      return class07209 == null ? class07209.field_10980 : class07209;
   }

   private void handler$cdd000$lithium$skipIfAllBiomesDoNotCreateIceOrSnowAtPos(class07209 var1, CallbackInfo var2, class07209 var3) {
      class00500 class00500 = this.method_8320(var3);
      if (class00500.Y().N() != class04684.L || !(class00500.i() instanceof class07117)) {
         if (!this.method_8419()) {
            var2.cancel();
         }
      }
   }

   public AttachmentTargetInfo fabric_getSyncTargetInfo() {
      return WorldTarget.INSTANCE;
   }

   public void fabric_registerCache(class07209 var1, BlockApiCacheImpl var2) {
      List list = this.apiLookupCaches.computeIfAbsent(var1.method_10062(), var0 -> new ArrayList());
      list.removeIf(var0 -> var0.get() == null);
      list.add(new WeakReference<>(var2));
      this.apiLookupAccessesWithoutCleanup++;
   }

   public void fabric_invalidateCache(class07209 var1) {
      List list = (List)this.apiLookupCaches.get(var1);
      if (list != null) {
         list.removeIf(var0 -> var0.get() == null);
         if (list.size() == 0) {
            this.apiLookupCaches.remove(var1);
         } else {
            list.forEach(var0 -> {
               BlockApiCacheImpl blockapicacheimpl = (BlockApiCacheImpl)var0.get();
               if (blockapicacheimpl != null) {
                  blockapicacheimpl.invalidate();
               }
            });
         }
      }

      this.apiLookupAccessesWithoutCleanup++;
      if (this.apiLookupAccessesWithoutCleanup > 2 * this.apiLookupCaches.size()) {
         this.apiLookupCaches.entrySet().removeIf(var0 -> {
            ((List)var0.getValue()).removeIf(var0x -> var0x.get() == null);
            return ((List)var0.getValue()).isEmpty();
         });
         this.apiLookupAccessesWithoutCleanup = 0;
      }
   }

   public void fabric_syncChange(AttachmentType var1, AttachmentChange var2) {
      if (this instanceof class04782) {
         PlayerLookup.world(this).forEach(var3 -> {
            if (((AttachmentTypeImpl)var1).syncPredicate().test(this, var3)) {
               AttachmentSync.trySync(var2, var3);
            }
         });
      }
   }

   @Deprecated
   public void method_51837(@Nullable class07856 var1) {
      this.field_25142 = var1;
   }

   public class00408 method_17983() {
      return this.method_14178().P();
   }

   public boolean method_37117(long var1) {
      return this.method_37116(var1) && this.field_24624.N(var1);
   }

   @Override
   public class03106 method_54719() {
      return this.field_13959.yW();
   }

   public class05324 method_27056() {
      return this.field_23787;
   }

   public void method_29199(long var1) {
      this.field_24456.y(var1);
   }

   protected void method_29203() {
      if (this.field_25143) {
         long i = this.field_9232.y() + 1L;
         this.field_24456.N(i);
         class08700.N().N("scheduledFunctions");
         this.field_24456.b().N(this.field_13959, i);
         class08700.N().L();
         if (this.method_64395().N(class07305.N)) {
            this.method_29199(this.field_9232.L() + 1L);
         }
      }
   }

   public long method_75003() {
      return this.method_8532() / 24000L;
   }

   private void method_23660() {
      this.field_28859.N();
      this.field_18261.stream().filter(class07438::method_6113).collect(Collectors.toList()).forEach(var0 -> var0.method_7358(false, false));
   }

   @Override
   public boolean method_39425(long var1) {
      return this.field_24624.L.Z().u(var1);
   }

   private void method_14192() {
      this.field_35565.clear();

      while (!this.field_13950.isEmpty()) {
         class07303 class07303 = (class07303)this.field_13950.removeFirst();
         if (this.method_41411(class07303.N())) {
            if (this.method_14174(class07303)) {
               this.field_13959
                  .Nm()
                  .N(
                     null,
                     class07303.N().method_10263(),
                     class07303.N().method_10264(),
                     class07303.N().method_10260(),
                     64.0,
                     this.method_27983(),
                     new class07275(class07303.N(), class07303.y(), class07303.L(), class07303.u())
                  );
            }
         } else {
            this.field_35565.add(class07303);
         }
      }

      this.field_13950.addAll(this.field_35565);
   }

   private void method_14171(class07209 var1, class04651 var2) {
      class00500 class00500 = this.method_8320(var1);
      class04688 class04688 = class00500.Y();
      if (class04688.y(var2)) {
         class04688.N(this, var1, class00500);
      }
   }

   private void method_39501() {
      boolean flag = this.method_8419();
      if (this.method_63020()) {
         if (this.method_64395().N(class07305.y)) {
            int i = this.field_24456.i();
            int j = this.field_24456.M();
            int k = this.field_24456.Z();
            boolean flag1 = this.field_9232.R();
            boolean flag2 = this.field_9232.B();
            if (i > 0) {
               i--;
               j = flag1 ? 0 : 1;
               k = flag2 ? 0 : 1;
               flag1 = false;
               flag2 = false;
            } else {
               if (j > 0) {
                  if (--j == 0) {
                     flag1 = !flag1;
                  }
               } else if (flag1) {
                  j = field_41751.N(this.field_9229);
               } else {
                  j = field_41748.N(this.field_9229);
               }

               if (k > 0) {
                  if (--k == 0) {
                     flag2 = !flag2;
                  }
               } else if (flag2) {
                  k = field_41750.N(this.field_9229);
               } else {
                  k = field_41749.N(this.field_9229);
               }
            }

            this.field_24456.y(j);
            this.field_24456.L(k);
            this.field_24456.N(i);
            this.field_24456.N(flag1);
            this.field_24456.y(flag2);
         }

         this.field_9251 = this.field_9234;
         if (this.field_9232.R()) {
            this.field_9234 += 0.01F;
         } else {
            this.field_9234 -= 0.01F;
         }

         this.field_9234 = class04995.N(this.field_9234, 0.0F, 1.0F);
         this.field_9253 = this.field_9235;
         if (this.field_9232.B()) {
            this.field_9235 += 0.01F;
         } else {
            this.field_9235 -= 0.01F;
         }

         this.field_9235 = class04995.N(this.field_9235, 0.0F, 1.0F);
      }

      if (this.field_9253 != this.field_9235) {
         this.field_13959.Nm().N(new class00503(class00503.Z, this.field_9235), this.method_27983());
      }

      if (this.field_9251 != this.field_9234) {
         this.field_13959.Nm().N(new class00503(class00503.z, this.field_9234), this.method_27983());
      }

      if (flag != this.method_8419()) {
         if (flag) {
            this.field_13959.Nm().N(new class00503(class00503.u, 0.0F));
         } else {
            this.field_13959.Nm().N(new class00503(class00503.L, 0.0F));
         }

         this.field_13959.Nm().N(new class00503(class00503.Z, this.field_9235));
         this.field_13959.Nm().N(new class00503(class00503.z, this.field_9234));
      }
   }

   public void method_29202(boolean var1) {
      Iterator<class05975> iterator = this.field_25141.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(this, var1);
      }
   }

   public void method_27910(int var1, int var2, boolean var3, boolean var4) {
      this.field_24456.N(var1);
      this.field_24456.L(var2);
      this.field_24456.y(var2);
      this.field_24456.y(var3);
      this.field_24456.N(var4);
   }

   public void method_52370(class07209 var1) {
      class07209 class07209x = this.N(class07830.field_13197, var1);
      class07209 class07209x = class07209x.method_10074();
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.handler$cdd000$lithium$skipIfAllBiomesDoNotCreateIceOrSnowAtPos(var1, callbackinfo, class07209x);
      if (!callbackinfo.isCancelled()) {
         class00780 class00780 = this.i(class07209x).N();
         if (class00780.N(this, class07209x)) {
            this.method_8501(class07209x, class00869.iT.W());
         }

         if (this.method_8419()) {
            int i = this.method_64395().N(class07305.Q);
            if (i > 0 && class00780.y(this, class07209x)) {
               class00500 class00500xx = this.method_8320(class07209x);
               if (class00500xx.N(class00869.is)) {
                  int j = class00500xx.L(class06999.L);
                  if (j < Math.min(i, 8)) {
                     class00500 class00500x = class00500xx.y(class06999.L, j + 1);
                     class00891.N_19(class00500xx, class00500x, this, class07209x);
                     this.method_8501(class07209x, class00500x);
                  }
               } else {
                  this.method_8501(class07209x, class00869.is.W());
               }
            }

            class00801 class00801 = class00780.N(class07209x, this.method_8615());
            if (class00801 != class00801.field_9384) {
               class00500 class00500 = this.method_8320(class07209x);
               class00500.i().N_4(class00500, this, class07209x, class00801);
            }
         }
      }
   }

   @Override
   public class03556<class00780> method_22387(int var1, int var2, int var3) {
      return this.method_14178().U().u().method_38109(var1, var2, var3, this.method_14178().W().y());
   }

   public void method_18203(class00570 var1, int var2) {
      class07321 class07321 = var1.R();
      int i = class07321.i();
      int j = class07321.R();
      class04643 class04643 = class08700.N();
      class04643.N("iceandsnow");

      for (int k = 0; k < var2; k++) {
         if (this.field_9229.y(48) == 0) {
            byte b1 = 15;
            byte b0 = 0;
            this.method_52370(this.redirect$blf000$lithium$redirectTickGetRandomPosInChunk(this, i, b0, j, b1));
         }
      }

      class04643.y("tickBlocks");
      if (var2 > 0) {
         class00554[] aclass00554 = var1.u();

         for (int l = 0; l < aclass00554.length; l++) {
            class00554 class00554 = aclass00554[l];
            if (class00554.u()) {
               int i1 = class01296.L(var1.method_31604(l));

               for (int j1 = this.modifyExpressionValue$cdg000$lithium$lithiumRandomTick(0, class00554, var2, i, i1, j); j1 < var2; j1++) {
                  byte b2 = 15;
                  class07209 class07209 = this.redirect$blf000$lithium$redirectTickGetRandomPosInChunk(this, i, i1, j, b2);
                  class04643.N("randomTick");
                  class00500 class00500 = class00554.N(class07209.method_10263() - i, class07209.method_10264() - i1, class07209.method_10260() - j);
                  if (class00500.Q()) {
                     class06069 class06069x = this.field_9229;
                     class00500.y(this, this.modify$blf000$lithium$immutablePos(class07209), class06069x);
                  }

                  class04688 class04688 = class00500.Y();
                  if (class04688.M()) {
                     class06069 class06069 = this.field_9229;
                     class04688.N(this, this.modify$blf000$lithium$immutablePos2(class07209), class06069);
                  }

                  class04643.L();
               }
            }
         }
      }

      class04643.L();
   }

   private void method_14189(class07209 var1, class00891 var2) {
      class00500 class00500 = this.method_8320(var1);
      if (class00500.N(var2)) {
         class00500.N(this, var1, this.field_9229);
      }
   }

   public void method_14195() {
      this.field_24456.L(0);
      this.field_24456.y(false);
      this.field_24456.y(0);
      this.field_24456.N(false);
   }

   public void method_18765(BooleanSupplier var1) {
      class04643 class04643 = class08700.N();
      this.field_13953 = true;
      this.m_handler$zhg000$fabric_lifecycle_events_v1$startWorldTick_36(var1, null);
      class03106 class03106 = this.method_54719();
      boolean flag = class03106.Z();
      if (flag) {
         class04643.N("world border");
         this.method_8621().j();
         class04643.y("weather");
         this.method_39501();
         class04643.L();
      }

      int i = this.method_64395().N(class07305.V);
      if (this.field_28859.N(i) && this.field_28859.N(i, this.field_18261)) {
         if (this.method_64395().N(class07305.N)) {
            long j = this.field_9232.L() + 24000L;
            this.method_29199(j - j % 24000L);
         }

         this.method_23660();
         if (this.method_64395().N(class07305.y) && this.method_8419()) {
            this.method_14195();
         }
      }

      this.method_8533();
      if (flag) {
         this.method_29203();
      }

      class04643.N("tickPending");
      if (!this.method_27982() && flag) {
         long k = this.N();
         class04643.N("blockTicks");
         this.field_13949.N(k, 65536, this::method_14189);
         class04643.y("fluidTicks");
         this.field_13951.N(k, 65536, this::method_14171);
         class04643.L();
      }

      class04643.y("raid");
      if (flag) {
         this.field_18811.N(this);
      }

      class04643.y("chunkSource");
      this.method_14178().N(var1, true);
      class04643.y("blockEvents");
      if (flag) {
         this.method_14192();
      }

      this.field_13953 = false;
      class04643.L();
      boolean flag1 = this.field_24624.m();
      if (flag1) {
         this.method_14197();
      }

      if (flag) {
         this.field_13948++;
      }

      if (this.field_13948 < 300) {
         class04643.N("entities");
         if (this.field_25142 != null && flag) {
            class04643.N("dragonFight");
            this.field_25142.L();
            class04643.L();
         }

         this.field_26934.N(var3x -> {
            if (!var3x.method_31481()) {
               if (!class03106.N(var3x)) {
                  class04643.N("checkDespawn");
                  var3x.method_5982();
                  class04643.L();
                  if (var3x instanceof class04770 || this.field_24624.L.Z().L(var3x.method_31476().y())) {
                     class07049 class07049 = var3x.method_5854();
                     if (class07049 != null) {
                        if (!class07049.method_31481() && class07049.method_5626(var3x)) {
                           return;
                        }

                        var3x.method_5848();
                     }

                     class04643.N("tick");
                     this.method_18472(this::method_18762, var3x);
                     class04643.L();
                  }
               }
            }
         });
         class04643.y("blockEntities");
         this.method_18471();
         class04643.L();
      }

      class04643.N("entityManagement");
      this.field_26935.y();
      class04643.L();
      class04643.N("debugSynchronizers");
      if (this.field_62841.y(class00429.P)) {
         this.field_38226.N(var1x -> this.field_62841.y(var1x, class00429.P, var1x));
      } else {
         this.field_38226.N(null);
      }

      this.field_62841.N(this.field_13959.yV());
      class04643.L();
      this.method_75728().y();
      this.m_handler$zhg000$fabric_lifecycle_events_v1$endWorldTick_35(var1, null);
   }

   public class07305 method_64395() {
      return this.field_24456.m();
   }

   public float method_76332(class07209 var1) {
      class08165 class08165 = this.field_64261.N(class00608.s, var1);
      return class07376.U[class08165.N()];
   }

   public void method_18762(class07049 var1) {
      var1.method_22862();
      class04643 class04643 = class08700.N();
      var1.field_6012++;
      class04643.N(() -> class04206.M.y(var1.method_5864()).toString());
      class04643.R("tickNonPassenger");
      var1.method_5773();
      class04643.L();

      for (class07049 class07049 : var1.method_5685()) {
         this.method_18763(var1, class07049);
      }
   }

   @Override
   public class07052 method_8404(class07209 var1) {
      long i = 0L;
      float f = 0.0F;
      class08050 class08050 = this.method_8402(class01296.N(var1.method_10263()), class01296.N(var1.method_10260()), class00549.m, false);
      if (class08050 != null) {
         i = class08050.n();
         f = this.method_76332(var1);
      }

      return new class07052(this.y(), this.method_8532(), i, f);
   }

   private void method_18763(class07049 var1, class07049 var2) {
      if (var2.method_31481() || var2.method_5854() != var1) {
         var2.method_5848();
      } else if (var2 instanceof class08036 || this.field_26934.L(var2)) {
         var2.method_22862();
         var2.field_6012++;
         class04643 class04643 = class08700.N();
         class04643.N(() -> class04206.M.y(var2.method_5864()).toString());
         class04643.R("tickPassenger");
         var2.method_5842();
         class04643.L();

         for (class07049 class07049 : var2.method_5685()) {
            this.method_18763(var2, class07049);
         }
      }
   }

   protected class07209 method_18210(class07209 var1) {
      class07209 class07209 = this.N(class07830.field_13197, var1);
      Optional<class07209> optional = this.method_31418(class07209);
      if (optional.isPresent()) {
         return optional.get();
      } else {
         class00734 class00734 = class00734.N(class07209, class07209.method_33096(this.method_31600() + 1)).M(3.0);
         List<class07438> list = this.N(class07438.class, class00734, var1x -> var1x.method_5805() && this.N_17(var1x.method_24515()));
         if (!list.isEmpty()) {
            return list.get(this.field_9229.y(list.size())).method_24515();
         } else {
            if (class07209.method_10264() == this.method_31607() - 1) {
               class07209 = class07209.method_10086(2);
            }

            return class07209;
         }
      }
   }

   private void method_33143() {
      if (this.method_33144()) {
         if (!this.method_8503().No() || this.method_8503().P()) {
            int i = this.method_64395().N(class07305.V);
            class05216 class05216;
            if (this.field_28859.N(i)) {
               class05216 = class00392.L("sleep.skipping_night");
            } else {
               class05216 = class00392.N("sleep.players_sleeping", this.field_28859.y(), this.field_28859.y(i));
            }

            Iterator<class04770> iterator = this.field_18261.iterator();

            while (iterator.hasNext()) {
               iterator.next().method_7353(class05216, true);
            }
         }
      }
   }

   public boolean method_14177() {
      return this.field_13953;
   }

   @Override
   public void method_8408(class07209 var1, class00891 var2) {
      this.method_8452(var1, var2, class02752.N(this, null, null));
   }

   public void method_67503(class00570 var1) {
      class07321 class07321 = var1.R();
      boolean flag = this.method_8419();
      int i = class07321.i();
      int j = class07321.R();
      class04643 class04643 = class08700.N();
      class04643.N("thunder");
      if (flag && this.method_8546() && this.field_9229.y(100000) == 0) {
         class07209 class07209 = this.method_18210(this.method_8536(i, 0, j, 15));
         if (this.method_8520(class07209)) {
            class07052 class07052 = this.method_8404(class07209);
            boolean flag1 = this.method_64395().N(class07305.S)
               && this.field_9229.U() < class07052.y() * 0.01
               && !this.method_8320(class07209.method_10074()).N(class01210.Nz);
            if (flag1) {
               class00682 class00682 = class07078.yP.N(this, class06113.field_16467);
               if (class00682 != null) {
                  class00682.N(true);
                  class00682.u(0);
                  class00682.method_5814(class07209.method_10263(), class07209.method_10264(), class07209.method_10260());
                  this.method_8649(class00682);
               }
            }

            class00672 class00672 = class07078.NY.N(this, class06113.field_16467);
            if (class00672 != null) {
               class00672.method_29495(class06889.L(class07209));
               class00672.N(flag1);
               this.method_8649(class00672);
            }
         }
      }

      class04643.L();
   }

   private Optional<class07209> method_31418(class07209 var1) {
      return this.method_19494()
         .i(
            var0 -> var0.N(class03927.v),
            var1x -> var1x.method_10264() == this.method_8624(class07830.field_13202, var1x.method_10263(), var1x.method_10260()) - 1,
            var1,
            128,
            class05372.field_18489
         )
         .map(var0 -> var0.method_10086(1));
   }

   public class06394 method_14170() {
      return this.field_13959.yB();
   }

   public class05368 method_19494() {
      return this.method_14178().s();
   }

   @Override
   public int method_8615() {
      return this.field_24624.U().R();
   }

   public void method_70635(class07209 var1, class00500 var2) {
      class00500 class00500 = this.method_8320(var1);
      class00891 class00891 = class00500.i();
      if (!var2.N(class00891)) {
         var2.N(this, var1, false);
      }

      this.method_8408(var1, class00500.i());
      if (class00500.v()) {
         this.method_8455(var1, class00891);
      }
   }

   public boolean method_33144() {
      return this.method_64395().N(class07305.V) <= 100;
   }

   public void method_8448() {
      if (!this.field_18261.isEmpty() && this.field_28859.N(this.field_18261)) {
         this.method_33143();
      }
   }

   @Override
   public void method_8465(
      @Nullable class07049 var1, double var2, double var4, double var6, class03556<class04891> var8, class04911 var9, float var10, float var11, long var12
   ) {
      this.field_13959
         .Nm()
         .N(
            var1 instanceof class08036 ? (class08036)var1 : null,
            var2,
            var4,
            var6,
            ((class04891)var8.N()).N(var10),
            this.method_27983(),
            new class08073(var8, var9, var2, var4, var6, var10, var11, var12)
         );
   }

   public void method_18770(class04770 var1, class07062 var2) {
      var1.method_5650(var2);
   }

   private void method_14188(boolean var1) {
      if (this.field_25142 != null) {
         this.field_13959.yn().N(this.field_25142.y());
      }

      class00408 class00408 = this.method_14178().P();
      if (var1) {
         class00408.y();
      } else {
         class00408.N();
      }
   }

   @Override
   public void method_8517(int var1, class07209 var2, int var3) {
      for (class04770 class04770 : this.field_13959.Nm().v()) {
         if (class04770.method_51469() == this && class04770.method_5628() != var1) {
            double d0 = var2.method_10263() - class04770.method_23317();
            double d1 = var2.method_10264() - class04770.method_23318();
            double d2 = var2.method_10260() - class04770.method_23321();
            if (d0 * d0 + d1 * d1 + d2 * d2 < 1024.0) {
               class04770.field_13987.method_14364(new class07265(var1, var2, var3));
            }
         }
      }
   }

   @Nullable
   public class04770 method_18779() {
      List<class04770> list = this.method_18766(class07438::method_5805);
      return list.isEmpty() ? null : list.get(this.field_9229.y(list.size()));
   }

   @Override
   public void method_8508(class07209 var1, class00891 var2, class07211 var3, @Nullable class02733 var4) {
      this.field_38226.N(var1, var2, var3, var4);
   }

   @Override
   public boolean method_8505(class07049 var1, class07209 var2) {
      return !(var1 instanceof class08036 class08036 && (this.field_13959.N(this, var2, class08036) || !this.method_8621().N(var2)));
   }

   public void method_14176(@Nullable class05030 var1, boolean var2, boolean var3) {
      class04751 class04751 = this.method_14178();
      if (!var3) {
         if (var1 != null) {
            var1.N(class00392.L("menu.savingLevel"));
         }

         this.method_14188(var2);
         if (var1 != null) {
            var1.L(class00392.L("menu.savingChunks"));
         }

         class04751.y(var2);
         if (var2) {
            this.field_26935.u();
         } else {
            this.field_26935.L();
         }
      }
   }

   @Override
   public void method_8492(class07209 var1, class00891 var2, @Nullable class02733 var3) {
      this.field_38226.N(var1, var2, var3);
   }

   public List<? extends class00690> method_18776() {
      return this.method_18198(class07078.f, class07438::method_5805);
   }

   public boolean method_18768(class07049 var1) {
      return this.method_14175(var1);
   }

   public int method_32819() {
      return this.method_8597().z();
   }

   @Override
   public void method_41410(class00500 var1, class07209 var2, class00891 var3, @Nullable class02733 var4, boolean var5) {
      this.field_38226.N(var1, var2, var3, var4, var5);
   }

   @Override
   public void method_8413(class07209 var1, class00500 var2, class00500 var3, int var4) {
      if (this.field_36317) {
         String s = "recursive call to sendBlockUpdated";
         class07536.N("recursive call to sendBlockUpdated", new IllegalStateException("recursive call to sendBlockUpdated"));
      }

      this.method_14178().N(var1);
      this.field_49172.N(var1);
      class00494 class00494 = var2.M(this, var1);
      class00494 class00494x = var3.M(this, var1);
      if (class00389.L(class00494, class00494x, class07003.M)) {
         ObjectArrayList objectarraylist = new ObjectArrayList();
         Set set1 = this.field_26932;
         this.handler$bpd000$lithium$updateActiveListeners(var1, var2, var3, var4, null, class00494, class00494x, objectarraylist);
         Set<class07079> set = set1;
         Iterator iterator = this.redirect$bpd000$lithium$getActiveListeners(set);

         while (iterator.hasNext()) {
            class07079 class07079 = (class07079)iterator.next();
            class07623 class07623x = class07079.f();
            if (class07623x.y(var1)) {
               objectarraylist.add(class07623x);
            }
         }

         try {
            this.field_36317 = true;

            for (class07623 class07623 : objectarraylist) {
               class07623.B();
            }
         } finally {
            this.field_36317 = false;
         }
      }
   }

   public List<class04770> method_18766(Predicate<? super class04770> var1) {
      return this.method_47540(var1, Integer.MAX_VALUE);
   }

   private boolean method_14175(class07049 var1) {
      if (var1.method_31481()) {
         field_13952.warn("Tried to add entity {} but it was marked as removed already", class07078.N(var1.method_5864()));
         return false;
      } else {
         return this.field_26935.N(var1);
      }
   }

   public List<class04770> method_47540(Predicate<? super class04770> var1, int var2) {
      ArrayList arraylist = Lists.newArrayList();

      for (class04770 class04770 : this.field_18261) {
         if (var1.test(class04770)) {
            arraylist.add(class04770);
            if (arraylist.size() >= var2) {
               return arraylist;
            }
         }
      }

      return arraylist;
   }

   @Override
   protected class01124<class07049> method_31592() {
      return this.field_26935.i();
   }

   @Override
   public void method_8449(@Nullable class07049 var1, class07049 var2, class03556<class04891> var3, class04911 var4, float var5, float var6, long var7) {
      this.field_13959
         .Nm()
         .N(
            var1 instanceof class08036 ? (class08036)var1 : null,
            var2.method_23317(),
            var2.method_23318(),
            var2.method_23321(),
            ((class04891)var3.N()).N(var5),
            this.method_27983(),
            new class08062(var3, var4, var2, var5, var6, var7)
         );
   }

   @Override
   public void method_8444(@Nullable class07049 var1, int var2, class07209 var3, int var4) {
      this.field_13959
         .Nm()
         .N(
            var1 instanceof class08036 ? (class08036)var1 : null,
            var3.method_10263(),
            var3.method_10264(),
            var3.method_10260(),
            64.0,
            this.method_27983(),
            new class00516(var2, var3, var4, false)
         );
   }

   @Override
   public void method_8452(class07209 var1, class00891 var2, @Nullable class02733 var3) {
      this.field_38226.N(var1, var2, null, var3);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_8454(
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
   ) {
      class07302 class07302 = switch (var12) {
         case field_40888 -> class07302.field_40878;
         case field_40889 -> this.method_61270(class07305.i);
         case field_40890 -> this.method_64395().N(class07305.I) ? this.method_61270(class07305.g) : class07302.field_40878;
         case field_40891 -> this.method_61270(class07305.Ni);
         case field_51779 -> class07302.field_47331;
      };
      class06889 class06889 = new class06889(var4, var6, var8);
      class02756 class02756 = new class02756(this, var1, var2, var3, class06889, var10, var11, class07302);
      int i = class02756.Z();
      class07126 class07126 = class02756.E() ? var13 : var14;

      for (class04770 class04770 : this.field_18261) {
         if (class04770.method_5707(class06889) < 4096.0) {
            Optional optional = Optional.ofNullable(class02756.z().get(class04770));
            class04770.field_13987.method_14364(new class00520(class06889, var10, i, optional, class07126, var16, var15));
         }
      }
   }

   private void method_18771(class04770 var1) {
      class07049 class07049 = this.method_66347(var1.method_5667());
      if (class07049 != null) {
         field_13952.warn("Force-added player with duplicate UUID {}", var1.method_5667());
         class07049.method_18375();
         this.method_18770((class04770)class07049, class07062.field_26999);
      }

      this.field_26935.N(var1);
   }

   public boolean method_30736(class07049 var1) {
      if (var1.method_24204().map(class07049::method_5667).anyMatch(this.field_26935::N)) {
         return false;
      } else {
         this.y(var1);
         return true;
      }
   }

   public void method_18215(class04770 var1) {
      this.method_18771(var1);
   }

   public <T extends class07049> void method_47538(class01128<class07049, T> var1, Predicate<? super T> var2, List<? super T> var3) {
      this.method_47539(var1, var2, var3, Integer.MAX_VALUE);
   }

   public void method_18764(class00570 var1) {
      var1.q();
      var1.L(this);
      this.field_62841.N(var1.R());
   }

   public <T extends class07049> List<? extends T> method_18198(class01128<class07049, T> var1, Predicate<? super T> var2) {
      ArrayList arraylist = Lists.newArrayList();
      this.method_47538(var1, var2, arraylist);
      return arraylist;
   }

   public <T extends class07049> void method_47539(class01128<class07049, T> var1, Predicate<? super T> var2, List<? super T> var3, int var4) {
      this.method_31592().N(var1, var3x -> {
         if (var2.test(var3x)) {
            var3.add(var3x);
            if (var3.size() >= var4) {
               return class04218.field_41284;
            }
         }

         return class04218.field_41283;
      });
   }

   @Override
   public void method_8474(int var1, class07209 var2, int var3) {
      if (this.method_64395().N(class07305.T)) {
         this.field_13959.Nm().v().forEach(var4 -> {
            class06889 class06889xx;
            if (var4.method_51469() == this) {
               class06889 class06889x = class06889.y(var2);
               if (var4.method_5707(class06889x) < class04995.Z(32)) {
                  class06889xx = class06889x;
               } else {
                  class06889 class06889xx = class06889x.u(var4.method_73189()).u();
                  class06889xx = var4.method_73189().i(class06889xx.L(32.0));
               }
            } else {
               class06889xx = var4.method_73189();
            }

            var4.field_13987.method_14364(new class00516(var1, class07209.method_49638(class06889xx), var3, true));
         });
      } else {
         this.method_8444(null, var1, var2, var3);
      }
   }

   public void method_18213(class04770 var1) {
      this.method_18771(var1);
   }

   @Override
   public void method_8421(class07049 var1, byte var2) {
      this.method_14178().N(var1, new class00509(var1, var2));
   }

   @Override
   public void method_48760(class07049 var1, class07072 var2) {
      this.method_14178().N(var1, new class01938(var1, var2));
   }

   @Override
   public Collection<class00695> method_65097() {
      return this.field_26933.values();
   }

   @Override
   public void method_66016(class07209 var1, class00500 var2, class00500 var3) {
      Optional<class03556<class05369>> optional = class03927.N(var2);
      Optional<class03556<class05369>> optional1 = class03927.N(var3);
      if (!Objects.equals(optional, optional1)) {
         class07209 class07209 = var1.method_10062();
         optional.ifPresent(var2x -> this.method_8503().execute(() -> {
            this.method_19494().N(class07209);
            this.field_62841.L(class07209);
         }));
         optional1.ifPresent(var2x -> this.method_8503().execute(() -> {
            class05377 class05377 = this.method_19494().N(class07209, (class03556<class05369>)var2x);
            if (class05377 != null) {
               this.field_62841.N(class05377);
            }
         }));
      }
   }

   @Deprecated
   @Nullable
   public class07049 method_31424(int var1) {
      class07049 class07049 = this.method_31592().N(var1);
      return class07049 != null ? class07049 : (class07049)this.field_26933.get(var1);
   }

   public class04312<class04651> method_14179() {
      return this.field_13951;
   }

   @Override
   public boolean method_8458() {
      return this.field_13957;
   }

   public class04312<class00891> method_14196() {
      return this.field_13949;
   }

   @Nullable
   @Override
   public class07769 method_17891(class02265 var1) {
      return this.method_8503().NY().method_17983().y(class07769.N(var1));
   }

   public void method_17890(class02265 var1, class07769 var2) {
      this.method_8503().NY().method_17983().N(class07769.N(var1), var2);
   }

   public class02265 method_17889() {
      return this.method_8503().NY().method_17983().N(class06149.y).N();
   }

   public LongSet method_17984() {
      return this.field_24624.u();
   }

   public class06482 method_64577() {
      return this.field_13959.yM();
   }

   public <T extends class07126> int method_14199(
      T var1, boolean var2, boolean var3, double var4, double var6, double var8, int var10, double var11, double var13, double var15, double var17
   ) {
      class00495 class00495 = new class00495(var1, var2, var3, var4, var6, var8, (float)var11, (float)var13, (float)var15, (float)var17, var10);
      int i = 0;

      for (int j = 0; j < this.field_18261.size(); j++) {
         class04770 class04770 = this.field_18261.get(j);
         if (this.method_14191(class04770, var2, var4, var6, var8, class00495)) {
            i++;
         }
      }

      return i;
   }

   @Override
   public void method_8427(class07209 var1, class00891 var2, int var3, int var4) {
      this.field_13950.add(new class07303(var1, var2, var3, var4));
   }

   @Nullable
   @Override
   public class08036 method_73285(UUID var1) {
      return this.method_8503().Nm().y(var1);
   }

   @Nullable
   public Pair<class07209, class03556<class00780>> method_42108(Predicate<class03556<class00780>> var1, class07209 var2, int var3, int var4, int var5) {
      return this.method_14178().U().u().N(var2, var3, var4, var5, var1, this.method_14178().W().y(), this);
   }

   public boolean method_17988(int var1, int var2, boolean var3) {
      boolean flag = this.field_24624.N(new class07321(var1, var2), var3);
      if (var3 && flag) {
         this.method_8497(var1, var2);
      }

      return flag;
   }

   public boolean method_19500(class07209 var1) {
      return this.method_19497(var1, 1);
   }

   @Nullable
   @Override
   public class07049 method_8469(int var1) {
      return this.method_31592().N(var1);
   }

   @Nullable
   @Override
   public class07049 method_73284(UUID var1) {
      class07049 class07049x = this.method_66347(var1);
      if (class07049x != null) {
         return class07049x;
      } else {
         for (class04782 class04782 : this.method_8503().NO()) {
            if (class04782 != this) {
               class07049 class07049x = class04782.method_66347(var1);
               if (class07049x != null) {
                  return class07049x;
               }
            }
         }

         return null;
      }
   }

   private boolean method_14174(class07303 var1) {
      class00500 class00500 = this.method_8320(var1.N());
      return class00500.N(var1.y()) ? class00500.N(this, var1.N(), var1.L(), var1.u()) : false;
   }

   public boolean method_20588(class01296 var1) {
      return this.method_19500(var1.U());
   }

   public int method_19498(class01296 var1) {
      return this.method_19494().N(var1);
   }

   public boolean method_19497(class07209 var1, int var2) {
      return var2 > 6 ? false : this.method_19498(class01296.N(var1)) <= var2;
   }

   public class00770 method_14173() {
      return this.field_13956;
   }

   public <T extends class07126> boolean method_14166(
      class04770 var1,
      T var2,
      boolean var3,
      boolean var4,
      double var5,
      double var7,
      double var9,
      int var11,
      double var12,
      double var14,
      double var16,
      double var18
   ) {
      class00495 class00495 = new class00495(var2, var3, var4, var5, var7, var9, (float)var12, (float)var14, (float)var16, (float)var18, var11);
      return this.method_14191(var1, var3, var5, var7, var9, class00495);
   }

   @Override
   public void method_27873(class05042 var1) {
      this.method_8503().N(var1);
   }

   public class01224 method_14183() {
      return this.field_13959.yv();
   }

   @Nullable
   public class07209 method_8487(class03530<class04748> var1, class07209 var2, int var3, boolean var4) {
      if (!this.field_13959.yn().l().u()) {
         return null;
      } else {
         Optional optional = this.method_30349().L(class04227.yj).N(var1);
         if (optional.isEmpty()) {
            return null;
         } else {
            Pair<class07209, class03556<class04748>> pair = this.method_14178().U().N(this, (class03543<class04748>)optional.get(), var2, var3, var4);
            return pair != null ? (class07209)pair.getFirst() : null;
         }
      }
   }

   private class07302 method_61270(class06839<Boolean> var1) {
      return this.method_64395().<Boolean>N(var1) ? class07302.field_40879 : class07302.field_18687;
   }

   public final boolean method_14191(class04770 var1, boolean var2, double var3, double var5, double var7, class00381<?> var9) {
      if (var1.method_51469() != this) {
         return false;
      } else if (var1.method_24515().method_19769(new class06889(var3, var5, var7), var2 ? 512.0 : 32.0)) {
         var1.field_13987.method_14364(var9);
         return true;
      } else {
         return false;
      }
   }

   public class04868 method_19495() {
      return this.field_18811;
   }

   @Override
   public class07074 method_8538(class07080 var1) {
      class07074 class07074 = super.method_8538(var1);
      class07074.N("Loaded entity count", () -> String.valueOf(this.field_26935.M()));
      return class07074;
   }

   @Nullable
   public class04877 method_19502(class07209 var1) {
      return this.field_18811.N(var1, 9216);
   }

   public void method_19496(class05354 var1, class07049 var2, class01329 var3) {
      var3.N(var1, var2);
   }

   public boolean method_19503(class07209 var1) {
      return this.method_19502(var1) != null;
   }

   private void method_21626(Writer var1) throws IOException {
      class04594 class04594 = class04594.N().N("x").N("y").N("z").N("type").N(var1);

      for (class01099 class01099 : this.field_27082) {
         class07209 class07209 = this.redirect$cca000$lithium$getPosOrOrigin(class01099);
         class04594.N(class07209.method_10263(), class07209.method_10264(), class07209.method_10260(), class01099.method_31706());
      }
   }

   @Override
   public float method_24852(class07211 var1, boolean var2) {
      return 1.0F;
   }

   public boolean method_28125() {
      return this.field_13959.yn().d();
   }

   public void method_39778(class08050 var1) {
      this.field_13959.execute(() -> this.field_36208.N(var1.R(), var1.M()));
   }

   public void method_39223(class00570 var1) {
      var1.u(this.N());
   }

   public void method_23658(class05163 var1) {
      this.field_13950.removeIf(var1x -> var1.y(var1x.N()));
   }

   @Override
   public class04782 method_8410() {
      return this;
   }

   public String method_31268() {
      return String.format(
         Locale.ROOT,
         "players: %s, entities: %s [%s], block_entities: %d [%s], block_ticks: %d, fluid_ticks: %d, chunk_source: %s",
         this.field_18261.size(),
         this.field_26935.R(),
         method_31270(this.field_26935.i().N(), var0 -> class04206.M.y(var0.method_5864()).toString()),
         this.field_27082.size(),
         method_31270(this.field_27082, class01099::method_31706),
         this.method_14196().N(),
         this.method_14179().N(),
         this.method_31419()
      );
   }

   private static <T> String method_31270(Iterable<T> var0, Function<T, String> var1) {
      try {
         Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();

         for (Object object : var0) {
            String s = (String)var1.apply(object);
            object2intopenhashmap.addTo(s, 1);
         }

         return object2intopenhashmap.object2IntEntrySet()
            .stream()
            .sorted(Comparator.comparing(Entry::getIntValue).reversed())
            .limit(5L)
            .map(var0x -> (String)var0x.getKey() + ":" + var0x.getIntValue())
            .collect(Collectors.joining(","));
      } catch (Exception exception) {
         return "";
      }
   }

   @Override
   public String method_31419() {
      return "Chunks[S] W: " + this.field_24624.N() + " E: " + this.field_26935.R();
   }

   public void method_21625(Path var1) throws IOException {
      class06265 class06265 = this.method_14178().L;

      try (BufferedWriter bufferedwriter = Files.newBufferedWriter(var1.resolve("stats.txt"))) {
         bufferedwriter.write(String.format(Locale.ROOT, "spawning_chunks: %d\n", class06265.Z().N()));
         class00760 class00760 = this.method_14178().b();
         if (class00760 != null) {
            ObjectIterator<Entry<class07428>> objectiterator = class00760.y().object2IntEntrySet().iterator();

            while (objectiterator.hasNext()) {
               Entry entry = (Entry)objectiterator.next();
               bufferedwriter.write(String.format(Locale.ROOT, "spawn_count.%s: %d\n", ((class07428)entry.getKey()).N(), entry.getIntValue()));
            }
         }

         bufferedwriter.write(String.format(Locale.ROOT, "entities: %s\n", this.field_26935.R()));
         bufferedwriter.write(String.format(Locale.ROOT, "block_entity_tickers: %d\n", this.field_27082.size()));
         bufferedwriter.write(String.format(Locale.ROOT, "block_ticks: %d\n", this.method_14196().N()));
         bufferedwriter.write(String.format(Locale.ROOT, "fluid_ticks: %d\n", this.method_14179().N()));
         bufferedwriter.write("distance_manager: " + class06265.Z().L() + "\n");
         bufferedwriter.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.method_14178().z()));
      }

      class07080 class07080 = new class07080("Level dump", new Exception("dummy"));
      this.method_8538(class07080);

      try (BufferedWriter bufferedwriter3 = Files.newBufferedWriter(var1.resolve("example_crash.txt"))) {
         bufferedwriter3.write(class07080.N(class02587.L));
      }

      Path path = var1.resolve("chunks.csv");

      try (BufferedWriter bufferedwriter4 = Files.newBufferedWriter(path)) {
         class06265.N(bufferedwriter4);
      }

      Path path1 = var1.resolve("entity_chunks.csv");

      try (BufferedWriter bufferedwriter5 = Files.newBufferedWriter(path1)) {
         this.field_26935.N(bufferedwriter5);
      }

      Path path2 = var1.resolve("entities.csv");

      try (BufferedWriter bufferedwriter1 = Files.newBufferedWriter(path2)) {
         method_21624(bufferedwriter1, this.method_31592().N());
      }

      Path path3 = var1.resolve("block_entities.csv");

      try (BufferedWriter bufferedwriter2 = Files.newBufferedWriter(path3)) {
         this.method_21626(bufferedwriter2);
      }
   }

   public void method_31423(Stream<class07049> var1) {
      this.field_26935.N(var1);
   }

   public void method_31426(Stream<class07049> var1) {
      this.field_26935.y(var1);
   }

   @Override
   public long method_8412() {
      return this.field_13959.yn().l().L();
   }

   @Nullable
   public class07856 method_29198() {
      return this.field_25142;
   }

   private static void method_21624(Writer var0, Iterable<class07049> var1) throws IOException {
      class04594 class04594 = class04594.N().N("x").N("y").N("z").N("uuid").N("type").N("alive").N("display_name").N("custom_name").N(var0);

      for (class07049 class07049 : var1) {
         class00392 class00392x = class07049.method_5797();
         class00392 class00392x = class07049.method_5476();
         class04594.N(
            class07049.method_23317(),
            class07049.method_23318(),
            class07049.method_23321(),
            class07049.method_5667(),
            class04206.M.y(class07049.method_5864()),
            class07049.method_5805(),
            class00392x.getString(),
            class00392x != null ? class00392x.getString() : null
         );
      }
   }

   public void method_72270(class07321 var1, int var2) {
      List<class07321> list = class07321.N(var1, var2).toList();
      this.field_13959.y(() -> {
         this.field_26935.N();

         for (class07321 class07321 : list) {
            if (!this.method_37116(class07321.y())) {
               return false;
            }
         }

         return true;
      });
   }

   public Iterable<class07049> method_27909() {
      return this.method_31592().N();
   }

   public class02703 method_57133() {
      return this.field_49172;
   }

   public boolean method_74999() {
      return this.method_64395().N(class07305.H);
   }

   public boolean method_37116(long var1) {
      return this.field_26935.N(var1);
   }

   public boolean method_37118(class07209 var1) {
      return this.field_26935.N(var1) && this.field_24624.L.Z().L(class07321.N(var1));
   }

   @Override
   public class06511 method_59547() {
      return this.field_13959.yo();
   }

   public boolean method_67504(class07321 var1) {
      return this.field_24624.L.y(var1);
   }

   public boolean method_74962() {
      return this.method_8401().s() != class07086.field_5801 && this.method_64395().N(class07305.S) && this.method_64395().N(class07305.x);
   }

   public boolean method_66588(class07321 var1) {
      return this.field_26935.N(var1) && this.field_26935.N(var1.y());
   }

   @Override
   public class03767 method_45162() {
      return this.field_13959.yn().K();
   }

   public class06069 method_51836(class01894 var1) {
      return this.field_44857.N(var1, this.method_8412());
   }

   public boolean method_75001() {
      return this.method_64395().N(class07305.C);
   }

   @Override
   public void method_71970(class00394 var1) {
      super.method_71970(var1);
      this.field_62841.N(var1);
   }

   @Override
   public class02755 method_61269() {
      return this.field_13959.yq();
   }

   public boolean method_67505(class07321 var1) {
      return this.field_26935.y(var1) && this.method_8621().N(var1);
   }

   public boolean method_76058(class07209 var1) {
      int i = this.method_64395().N(class07305.m);
      return i == -1 || this.field_24624.L.N(var1, i);
   }

   public class03470 method_52168() {
      return this.field_44857;
   }

   public boolean method_67506(class07209 var1) {
      return this.method_67504(new class07321(var1));
   }

   public boolean method_75000() {
      return this.method_64395().N(class07305.R);
   }

   private void handler$bpd000$lithium$updateActiveListeners(
      class07209 var1, class00500 var2, class00500 var3, int var4, CallbackInfo var5, class00494 var6, class00494 var7, List var8
   ) {
      ObjectIterator<class07623> objectiterator = this.lithium$getData().activeNavigations().iterator();

      while (objectiterator.hasNext()) {
         class07623 class07623 = (class07623)objectiterator.next();
         if (class07623.y(var1)) {
            var8.add(class07623);
         }
      }
   }

   private void m_handler$zcp000$fabric_data_attachment_api_v1$createAttachmentsPersistentState_44(CallbackInfo var1) {
      class08413 class08413 = new class08413("fabric_attachments", () -> new AttachmentPersistentState(this), AttachmentPersistentState.codec(this), null);
      this.method_17983().N(class08413);
   }

   private int modifyExpressionValue$cdg000$lithium$lithiumRandomTick(int var1, class00554 var2, int var3, int var4, int var5, int var6) {
      short short1 = var2.lithium$getCount(BlockStateFlags.RANDOM_TICKING);
      if (short1 <= 384) {
         for (int i = 0; i < var3; i++) {
            int j = this.getRandomBlockIndexForRandomTick();
            if (j < short1) {
               RandomTickingSectionDataHelper.randomTickNthBlock(
                  var2, j, var2.lithium$getSectionData().getRandomTickableBlocksByY(), this, var4, var5, var6, this.field_9229
               );
               short1 = var2.lithium$getCount(BlockStateFlags.RANDOM_TICKING);
            }
         }

         return var3;
      } else {
         return var1;
      }
   }

   @Override
   public class01042 fabric_getDynamicRegistryManager() {
      return this.method_30349();
   }

   private void handler$bpd000$lithium$init(
      class02796 var1,
      Executor var2,
      class04785 var3,
      class05212 var4,
      class05946 var5,
      class01255 var6,
      boolean var7,
      long var8,
      List var10,
      boolean var11,
      class03470 var12,
      CallbackInfo var13
   ) {
      this.field_26932 = new ReferenceOpenHashSet(this.field_26932);
   }

   private class07209 modify$blf000$lithium$immutablePos(class07209 var1) {
      return var1.method_10062();
   }

   public void lithium$setNavigationInactive(class07079 var1) {
      this.lithium$getData().activeNavigations().remove(var1.lithium$getRegisteredNavigation());
   }

   public boolean areEntityNavigationsConsistent() {
      ReferenceOpenHashSet<class07623> referenceopenhashset = this.lithium$getData().activeNavigations();
      int i = 0;

      for (class07079 class07079 : this.field_26932) {
         class07623 class07623 = class07079.f();
         if ((class07623.Z() != null && class07079.lithium$isRegisteredToWorld()) != referenceopenhashset.contains(class07623)) {
            return false;
         }

         if (class07623.Z() != null) {
            i++;
         }
      }

      return referenceopenhashset.size() == i;
   }

   private int getRandomBlockIndexForRandomTick() {
      this.field_9256 = this.field_9256 * 3 + 1013904223;
      int i = this.field_9256 >> 2;
      return i & 15 | i >> 8 & 3840 | i >> 4 & 240;
   }

   public void lithium$setNavigationActive(class07079 var1) {
      this.lithium$getData().activeNavigations().add(var1.lithium$getRegisteredNavigation());
   }
}
