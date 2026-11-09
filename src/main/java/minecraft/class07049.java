package minecraft;

import Nursultan.class09348;
import Nursultan.class09956;
import Nursultan.class10711;
import Nursultan.class10713;
import Nursultan.class11370;
import Nursultan.class11384;
import Nursultan.class11401;
import Nursultan.class11781;
import Nursultan.class11783;
import Nursultan.class11812;
import Nursultan.class11938;
import baritone.api.BaritoneAPI;
import baritone.api.event.events.RotationMoveEvent;
import baritone.api.event.events.RotationMoveEvent.Type;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalBooleanRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.viaversion.viafabricplus.features.entity.riding_offset.EntityRidingOffsetsPre1_20_2;
import com.viaversion.viafabricplus.injection.access.world.always_tick_entities.IEntity;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
import it.unimi.dsi.fastutil.floats.FloatArraySet;
import it.unimi.dsi.fastutil.floats.FloatArrays;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;
import net.caffeinemc.mods.lithium.common.entity.FluidCachingEntity;
import net.caffeinemc.mods.lithium.common.entity.LithiumEntityCollisions;
import net.caffeinemc.mods.lithium.common.entity.movement.ChunkAwareBlockCollisionSweeperVoxelShape;
import net.caffeinemc.mods.lithium.common.entity.pushable.FeetBlockCachingEntity;
import net.caffeinemc.mods.lithium.common.util.Pos.SectionYIndex;
import net.caffeinemc.mods.lithium.common.util.collections.LazyList;
import net.caffeinemc.mods.lithium.common.world.in_world_tracking.MaybeInLevelObject;
import net.caffeinemc.mods.lithium.mixin.block.hopper.EntityAccessor;
import net.fabricmc.fabric.api.attachment.v1.AttachmentSyncPredicate;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget.OnAttachedSet;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents.AfterEntityChange;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.impl.attachment.AttachmentSerializingImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSync;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo.EntityTarget;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerAuthInputPacket_InputData;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07049
   implements class01135,
   class01766,
   class02273,
   class02666,
   class06843,
   class06960,
   class07061,
   class08961,
   class11783,
   IEntity,
   FluidCachingEntity,
   FeetBlockCachingEntity,
   MaybeInLevelObject,
   EntityAccessor,
   AttachmentTargetImpl {
   private static final Logger field_60355 = LogUtils.getLogger();
   public static final String field_29985 = "id";
   public static final String field_29994 = "UUID";
   public static final String field_29986 = "Passengers";
   public static final String field_58050 = "data";
   public static final String field_60535 = "Pos";
   public static final String field_60524 = "Motion";
   public static final String field_60525 = "Rotation";
   public static final String field_60526 = "PortalCooldown";
   public static final String field_60527 = "NoGravity";
   public static final String field_60528 = "Air";
   public static final String field_60529 = "OnGround";
   public static final String field_60530 = "fall_distance";
   public static final String field_60531 = "Fire";
   public static final String field_60532 = "Silent";
   public static final String field_60533 = "Glowing";
   public static final String field_60534 = "Invulnerable";
   public static final String field_61220 = "CustomName";
   private static final AtomicInteger field_5978 = new AtomicInteger();
   public static final int field_49791 = 0;
   public static final int field_29987 = 60;
   public static final int field_29988 = 300;
   public static final int field_29989 = 1024;
   private static final Codec<List<String>> field_56631 = Codec.STRING.sizeLimitedListOf(1024);
   public static final float field_44870 = 0.2F;
   public static final double field_44871 = 0.500001;
   public static final double field_44872 = 0.999999;
   public static final int field_29992 = 140;
   public static final int field_29993 = 40;
   public static final int field_49073 = 3;
   private static final class00734 field_6025 = new class00734(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double field_29984 = 0.014;
   private static final double field_29982 = 0.007;
   private static final double field_29983 = 0.0023333333333333335;
   private static final int field_61895 = 16;
   private static final double field_61894 = 8.0;
   private static double field_5999 = 1.0;
   private final class07078<?> field_5961;
   private boolean field_59667;
   private int field_5986;
   public boolean field_23807;
   private ImmutableList<class07049> field_5979;
   protected int field_5951;
   @Nullable
   private class07049 field_6034;
   private class07299 field_6002;
   public double field_6014;
   public double field_6036;
   public double field_5969;
   private class06889 field_22467;
   private class07209 field_22468;
   private class07321 field_35101;
   private class06889 field_18276;
   private float field_6031;
   private float field_5965;
   public float field_5982;
   public float field_6004;
   private class00734 field_6005;
   private boolean field_5952;
   public boolean field_5976;
   public boolean field_5992;
   public boolean field_36331;
   public boolean field_34927;
   public boolean field_6037;
   public class06889 field_17046;
   @Nullable
   private class07062 field_26995;
   public static final float field_29973 = 0.6F;
   public static final float field_29974 = 1.8F;
   public float field_5994;
   public float field_28627;
   public double field_6017;
   private float field_6003;
   public double field_6038;
   public double field_5971;
   public double field_5989;
   public boolean field_5960;
   protected final class06069 field_5974;
   public int field_6012;
   private int field_5956;
   public boolean field_5957;
   protected Object2DoubleMap<class03530<class04651>> field_5964;
   protected boolean field_6000;
   private Set<class03530<class04651>> field_25599;
   public int field_6008;
   protected boolean field_5953;
   protected final class03289 field_6011;
   protected static final class02131<Byte> field_5990 = class03289.N(class07049.class, class02154.N);
   protected static final int field_29979 = 0;
   private static final int field_29975 = 1;
   private static final int field_29976 = 3;
   private static final int field_29977 = 4;
   private static final int field_29978 = 5;
   protected static final int field_29980 = 6;
   protected static final int field_29981 = 7;
   private static final class02131<Integer> field_6032 = class03289.N(class07049.class, class02154.y);
   private static final class02131<Optional<class00392>> field_6027 = class03289.N(class07049.class, class02154.M);
   private static final class02131<Boolean> field_5975 = class03289.N(class07049.class, class02154.U);
   private static final class02131<Boolean> field_5962 = class03289.N(class07049.class, class02154.U);
   private static final class02131<Boolean> field_5995 = class03289.N(class07049.class, class02154.U);
   protected static final class02131<class01312> field_18064 = class03289.N(class07049.class, class02154.t);
   private static final class02131<Integer> field_27858 = class03289.N(class07049.class, class02154.y);
   private class01113 field_26996;
   private final class04465 field_38931;
   public boolean field_64356;
   @Nullable
   public class02224 field_51994;
   private int field_6018;
   private boolean field_6009;
   protected UUID field_6021;
   protected String field_5981;
   private boolean field_5958;
   private final Set<String> field_6029;
   private final double[] field_5993;
   private long field_5996;
   private class01325 field_18065;
   private float field_18066;
   public boolean field_27857;
   public boolean field_28628;
   public Optional<class07209> field_44784;
   private boolean field_44873;
   private float field_26997;
   private int field_26994;
   private boolean field_33758;
   private class06889 field_64357;
   @Nullable
   private class06889 field_64358;
   @Nullable
   private class00500 field_47742;
   public static final int field_60858 = 100;
   private final ArrayDeque<class10713> field_54947;
   private final List<class10713> field_57579;
   private final LongSet field_54948;
   private final class08418 field_56630;
   private class02837 field_58051;
   private RotationMoveEvent motionUpdateRotationEvent;
   @Nullable
   private IdentityHashMap dataAttachments = null;
   @Nullable
   private IdentityHashMap syncedAttachments = null;
   @Nullable
   private IdentityHashMap attachedChangedListeners = null;
   private final class11812 nursultan$dataManager = new class11812();
   private class11384 turnRotationEvent;
   private boolean viaFabricPlus$isInLoadedChunkAndShouldTick;

   public boolean viaFabricPlus$isInLoadedChunkAndShouldTick() {
      return this.viaFabricPlus$isInLoadedChunkAndShouldTick || DebugSettings.INSTANCE.alwaysTickClientPlayer.isEnabled();
   }

   private void handler$dml000$viafabricplus$expandHitBox(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var1.setReturnValue(0.1F);
      }
   }

   private void handler$cfa000$nursultan$injectMove(class07451 var1, class06889 var2, CallbackInfo var3, LocalRef var4) {
      if (this.method_73183().method_8608() && this instanceof class11781) {
         class11370 class11370 = class11370.y(var2);
         var4.set(class11370);
         class11938.L().L(class11370);
         if (class11370.y()) {
            var3.cancel();
         }
      }
   }

   @Override
   public boolean method_16914() {
      return this.field_6011.N(field_6027).isPresent();
   }

   public boolean method_48105(class04782 var1, double var2, double var4, double var6, Set<class06681> var8, float var9, float var10, boolean var11) {
      return this.method_5731(new class01032(var1, new class06889(var2, var4, var6), class06889.L, var9, var10, var8, class01032.N)) != null;
   }

   public boolean method_5853(class07307 var1, class07290 var2, class07209 var3, class00500 var4, float var5) {
      return true;
   }

   public boolean method_5862() {
      return this.method_5809() && !this.method_7325();
   }

   @Override
   public class00392 method_5476() {
      return class00502.N(this.method_5781(), this.method_5477()).N(var1 -> var1.N(this.method_5769()).N(this.method_5845()));
   }

   public float method_5774(class07307 var1, class07290 var2, class07209 var3, class00500 var4, class04688 var5, float var6) {
      return var6;
   }

   public void method_33567(double var1, double var3, double var5) {
      this.method_5859(var1, var3, var5);
   }

   public void method_5859(double var1, double var3, double var5) {
      if (this.method_73183() instanceof class04782) {
         this.method_5808(var1, var3, var5, this.method_36454(), this.method_36455());
         this.method_49792();
      }
   }

   public String method_5845() {
      return this.field_5981;
   }

   public static double method_5824() {
      return field_5999;
   }

   public class01325 method_18377(class01312 var1) {
      return this.field_5961.E();
   }

   public boolean method_5696() {
      return false;
   }

   public static void method_5840(double var0) {
      field_5999 = var0;
   }

   public boolean method_5675() {
      return true;
   }

   private void method_49792() {
      this.method_24204().forEach(var0 -> {
         UnmodifiableIterator<class07049> unmodifiableiterator = var0.field_5979.iterator();

         while (unmodifiableiterator.hasNext()) {
            class07049 class07049 = (class07049)unmodifiableiterator.next();
            var0.method_5865(class07049, class07049::method_24203);
         }
      });
   }

   @Override
   public Stream method_24204() {
      if (this.field_5979.isEmpty()) {
         return Stream.of(this);
      } else {
         ArrayList arraylist = new ArrayList();
         arraylist.add(this);
         this.addPassengersDeep(arraylist);
         return arraylist.stream();
      }
   }

   public class06889 method_30633(class07185 var1, class01009 var2) {
      return class07121.N(var2, var1, this.method_73189(), this.method_18377(this.method_18376()));
   }

   public int method_5850() {
      return 3;
   }

   public void method_60950(class07209 var1) {
      class07299 class07299 = this.method_73183();
      if (class07299 instanceof class04782) {
         ((class04782)class07299).method_14178().y(class01624.W, new class07321(var1), 3);
      }
   }

   public void method_64578(float var1, boolean var2, float var3, boolean var4) {
      Set<class06681> set = class06681.N(var2, var4);
      class08716 class08716xx = class08716.N(this);
      class08716 class08716x = class08716xx.N(var1, var3);
      class08716 class08716xx = class08716.N(class08716xx, class08716x, set);
      this.method_36456(class08716xx.L());
      this.method_5847(class08716xx.L());
      this.method_36457(class08716xx.u());
      this.method_63614();
   }

   public void method_5826(UUID var1) {
      this.field_6021 = var1;
      this.field_5981 = this.field_6021.toString();
   }

   public Iterable method_5736() {
      if (this.field_5979.isEmpty()) {
         return Collections.emptyList();
      } else {
         ArrayList arraylist = new ArrayList();
         this.addPassengersDeep(arraylist);
         return arraylist;
      }
   }

   public int method_54757() {
      return (int)this.method_31484().filter(var0 -> var0 instanceof class08036).count();
   }

   public boolean method_65038() {
      class07438 class07438 = this.method_5642();
      return class07438 != null && class07438.method_65038();
   }

   public void method_18382() {
      class01325 class01325x = this.field_18065;
      class01312 class01312 = this.method_18376();
      class01325 class01325x = this.method_18377(class01312);
      this.field_18065 = class01325x;
      this.field_18066 = class01325x.L();
      this.method_23311();
      boolean flag = class01325x.N() <= 4.0F && class01325x.y() <= 4.0F;
      if (!this.field_6002.method_8608()
         && !this.field_5953
         && !this.field_5960
         && flag
         && (class01325x.N() > class01325x.N() || class01325x.y() > class01325x.y())
         && !(this instanceof class08036)) {
         this.method_60490(class01325x);
      }
   }

   public boolean method_6034() {
      return this.method_66247();
   }

   public class06889 method_24829(class07438 var1) {
      return new class06889(this.method_23317(), this.method_5829().i, this.method_23321());
   }

   protected static class06889 method_24826(double var0, double var2, float var4) {
      double d0 = (var0 + var2 + 1.0E-5F) / 2.0;
      float f = -class04995.m(var4 * (float) (Math.PI / 180.0));
      float f1 = class04995.P(var4 * (float) (Math.PI / 180.0));
      float f2 = Math.max(Math.abs(f), Math.abs(f1));
      return new class06889(f * d0 / f2, 0.0, f1 * d0 / f2);
   }

   public boolean method_5733() {
      return this.method_5807();
   }

   public void method_5837(class04770 var1) {
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float method_5832(class06993 var1) {
      float f = class04995.R(this.method_36454());

      return switch (var1) {
         case field_11464 -> f + 180.0F;
         case field_11465 -> f + 270.0F;
         case field_11463 -> f + 90.0F;
         default -> f;
      };
   }

   public boolean method_5659(class07307 var1) {
      return false;
   }

   @Deprecated
   protected void method_46396() {
      class01312 class01312 = this.method_18376();
      class01325 class01325 = this.method_18377(class01312);
      this.field_18065 = class01325;
      this.field_18066 = class01325.L();
   }

   public class07211 method_5735() {
      return class07211.N((double)this.method_36454());
   }

   public void method_5742(class04770 var1) {
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public float method_5763(class07111 var1) {
      float f = class04995.R(this.method_36454());

      return switch (var1) {
         case field_11301 -> -f;
         case field_11300 -> 180.0F - f;
         default -> f;
      };
   }

   public class04252 method_56071(class08005 var1) {
      return this.method_5864().N(class01217.j) ? class04252.y : class04252.N;
   }

   public boolean method_5703(Predicate<class07049> var1) {
      UnmodifiableIterator<class07049> unmodifiableiterator = this.field_5979.iterator();

      while (unmodifiableiterator.hasNext()) {
         class07049 class07049 = (class07049)unmodifiableiterator.next();
         if (var1.test(class07049)) {
            return true;
         }
      }

      return false;
   }

   public final float method_18381(class01312 var1) {
      return this.method_18377(var1).L();
   }

   public class04641 method_5657() {
      return class04641.field_15974;
   }

   public class07211 method_5755() {
      return this.method_5735();
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      return null;
   }

   public boolean method_5680(class04770 var1) {
      return true;
   }

   public boolean method_60490(class01325 var1) {
      class01325 class01325 = this.method_18377(this.method_18376());
      class06889 class06889 = this.method_73189().y(0.0, var1.y() / 2.0, 0.0);
      double d0 = Math.max(0.0F, class01325.N() - var1.N()) + 1.0E-6;
      double d1 = Math.max(0.0F, class01325.y() - var1.y()) + 1.0E-6;
      class00494 class00494x = class00389.N(class00734.N(class06889, d0, d1, d0));
      Optional optional = this.field_6002.method_33594(this, class00494x, class06889, class01325.N(), class01325.y(), class01325.N());
      if (optional.isPresent()) {
         this.method_33574(((class06889)optional.get()).y(0.0, -class01325.y() / 2.0, 0.0));
         return true;
      } else {
         if (class01325.N() > var1.N() && class01325.y() > var1.y()) {
            class00494 class00494x = class00389.N(class00734.N(class06889, d0, 1.0E-6, d0));
            Optional optional1 = this.field_6002.method_33594(this, class00494x, class06889, class01325.N(), var1.y(), class01325.N());
            if (optional1.isPresent()) {
               this.method_33574(((class06889)optional1.get()).y(0.0, -var1.y() / 2.0 + 1.0E-6, 0.0));
               return true;
            }
         }

         return false;
      }
   }

   public boolean method_5821(class07049 var1) {
      if (!var1.method_5765()) {
         return false;
      } else {
         class07049 class07049 = var1.method_5854();
         return class07049 == this ? true : this.method_5821(class07049);
      }
   }

   public class07049 method_5668() {
      class07049 class07049 = this;

      while (class07049.method_5765()) {
         class07049 = class07049.method_5854();
      }

      return class07049;
   }

   @Nullable
   public class07049 method_49694() {
      return this.field_6034 != null && this.field_6034.method_5642() == this ? this.field_6034 : null;
   }

   public class07701 method_5671(class04782 var1) {
      return new class07701(
         class07703.j_, this.method_73189(), this.method_5802(), var1, class08152.M, this.method_74861(), this.method_5476(), var1.method_8503(), this
      );
   }

   public class07082 method_5664(class08036 var1, class06889 var2, class07050 var3) {
      return class07082.i;
   }

   public final boolean method_42148() {
      return this.method_5642() != null;
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (field_18064.equals(var1)) {
         this.method_18382();
      }
   }

   public void method_45166(double var1, double var3, double var5) {
      this.method_5859(this.method_23317() + var1, this.method_23318() + var3, this.method_23321() + var5);
   }

   protected class00395 method_5769() {
      return new class00391(new class00398(this.method_5864(), this.method_5667(), this.method_5477()));
   }

   public boolean method_5817() {
      return this.method_54757() == 1;
   }

   @Override
   public void method_48850(List<class02998<?>> var1) {
   }

   protected boolean method_66248() {
      class07438 class07438 = this.method_5642();
      return class07438 != null && class07438.method_66248();
   }

   public class06889 method_76333() {
      return this.method_5642() instanceof class08036 class08036 && this.method_5805() ? class08036.method_76333() : this.field_64357;
   }

   @Nullable
   public class06584 method_59958() {
      return null;
   }

   public boolean method_32316() {
      return !this.method_5864().N(class01217.E);
   }

   public class06889 method_43390() {
      return this.method_73189();
   }

   public class07321 method_31476() {
      return this.field_35101;
   }

   public void method_31471(class07276 var1) {
      int i = var1.N();
      double d0 = var1.u();
      double d1 = var1.M();
      double d2 = var1.B();
      this.method_43391(d0, d1, d2);
      this.method_5808(d0, d1, d2, var1.U(), var1.z());
      this.method_5838(i);
      this.method_5826(var1.y());
      this.method_18799(var1.Z());
   }

   @Nullable
   public class06584 method_31480() {
      return null;
   }

   public void method_32319(boolean var1) {
      this.field_27857 = var1;
   }

   @Override
   public void method_31744(class01113 var1) {
      this.field_26996 = var1;
      this.handler$cao000$lithium$emitMaybeInLevelEvents(var1, null);
   }

   public boolean method_70986() {
      return false;
   }

   protected void method_31482() {
      this.field_26995 = null;
   }

   public void method_45319(class06889 var1) {
      if (var1.m()) {
         this.method_18799(this.method_18798().i(var1));
      }
   }

   @Override
   public boolean method_31746() {
      if (this.field_26995 != null && !this.field_26995.y()) {
         return false;
      } else {
         return this.method_5765() ? false : !this.method_5782() || !this.method_5817();
      }
   }

   protected void method_52532(int var1, double var2, double var4, double var6, double var8, double var10) {
      double d0 = 1.0 / var1;
      double d1 = class04995.u(d0, this.method_23317(), var2);
      double d2 = class04995.u(d0, this.method_23318(), var4);
      double d3 = class04995.u(d0, this.method_23321(), var6);
      float f = (float)class04995.i(d0, (double)this.method_36454(), var8);
      float f1 = (float)class04995.u(d0, (double)this.method_36455(), var10);
      this.method_5814(d1, d2, d3);
      this.method_5710(f, f1);
   }

   public class06069 method_59922() {
      return this.field_5974;
   }

   public Optional<class05946<class05074>> method_5991() {
      return this.field_5961.Z();
   }

   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.B);
      this.method_66650(var1, class02484.y);
   }

   protected <T> boolean method_66650(class02666 var1, class02477<T> var2) {
      Object object = var1.method_58694(var2);
      return object != null ? this.method_66654(var2, object) : false;
   }

   public class00500 method_55667() {
      if (this.field_47742 == null) {
         this.field_47742 = this.method_73183().method_8320(this.method_24515());
         this.handler$bob000$lithium$onBlockCached(null);
      }

      return this.field_47742;
   }

   public class00381<class07280> method_18002(class01599 var1) {
      return new class07276(this, var1);
   }

   public double method_29241() {
      return this.method_5751() < 0.4 ? 0.0 : 0.4;
   }

   public final float method_17681() {
      return this.field_18065.N();
   }

   public double method_23316(double var1) {
      return this.field_22467.M + this.method_17681() * var1;
   }

   public double method_23322(double var1) {
      return this.method_23316((2.0 * this.field_5974.U() - 1.0) * var1);
   }

   public double method_23323(double var1) {
      return this.field_22467.B + this.method_17682() * var1;
   }

   public final int method_31478() {
      return this.field_22468.method_10264();
   }

   public boolean method_36971(class04782 var1, class07209 var2) {
      return true;
   }

   public double method_23325(double var1) {
      return this.method_23324((2.0 * this.field_5974.U() - 1.0) * var1);
   }

   public double method_5861(class03530<class04651> var1) {
      return this.field_5964.getDouble(var1);
   }

   public void method_5702(class07664 var1, class06889 var2) {
      class06889 class06889 = var1.N(this);
      double d0 = var2.M - class06889.M;
      double d1 = var2.B - class06889.B;
      double d2 = var2.Z - class06889.Z;
      double d3 = Math.sqrt(d0 * d0 + d2 * d2);
      this.method_36457(class04995.R((float)(-(class04995.u(d1, d3) * 180.0F / (float)Math.PI))));
      this.method_36456(class04995.R((float)(class04995.u(d2, d0) * 180.0F / (float)Math.PI) - 90.0F));
      this.method_5847(this.method_36454());
      this.field_6004 = this.method_36455();
      this.field_5982 = this.method_36454();
   }

   public class06889[] method_70985() {
      return class02607.N(this, 0.0, 0.5, 0.5, 0.0);
   }

   public void method_70982(class02607 var1) {
   }

   public double method_23319() {
      return this.method_23323(this.field_5974.U());
   }

   public class06889 method_30951(float var1) {
      return this.method_30950(var1).y(0.0, this.field_18066 * 0.7, 0.0);
   }

   @Override
   public float method_73188() {
      return this.method_36454();
   }

   public void method_56918(@Nullable class07049 var1) {
   }

   public boolean method_48155() {
      return false;
   }

   @Override
   public boolean method_31747() {
      return false;
   }

   public double method_23324(double var1) {
      return this.field_22467.Z + this.method_17681() * var1;
   }

   public void method_70980(class02607 var1) {
   }

   public float method_60951(float var1) {
      return class04995.B(var1, this.field_5982, this.field_6031);
   }

   public boolean method_70987() {
      return false;
   }

   public void method_5982() {
   }

   protected void method_51502(class07299 var1) {
      this.field_6002 = var1;
   }

   public class06889 method_60478() {
      return this.method_5642() instanceof class08036 class08036 && this.method_5805() ? class08036.method_60478() : this.method_18798();
   }

   @Override
   public class07299 method_73183() {
      return this.field_6002;
   }

   public int method_22861() {
      class00502 class00502 = this.method_5781();
      return class00502 != null && class00502.P().i() != null ? class00502.P().i() : 16777215;
   }

   public class07078<?> method_5864() {
      return this.field_5961;
   }

   public void method_70669(boolean var1) {
      this.field_59667 = var1;
   }

   @Override
   public int method_5628() {
      return this.field_5986;
   }

   public void method_5838(int var1) {
      this.field_5986 = var1;
   }

   public boolean method_30632(class07209 var1, class00500 var2) {
      return class00389.L(var2.y(this.method_73183(), var1, class06092.N(this)).method_66507(var1), class00389.N(this.method_5829()), class07003.Z);
   }

   public class04465 method_43389() {
      return this.field_38931;
   }

   @Override
   public final class00734 method_5829() {
      return this.field_6005;
   }

   public boolean method_5782() {
      return !this.field_5979.isEmpty();
   }

   public boolean method_5805() {
      return !this.method_31481();
   }

   public void method_5772() {
      for (int i = this.field_5979.size() - 1; i >= 0; i--) {
         ((class07049)this.field_5979.get(i)).method_5848();
      }
   }

   public boolean method_5765() {
      return this.method_5854() != null;
   }

   public void method_5848() {
      this.method_29239();
   }

   @Nullable
   public class00502 method_5781() {
      return this.method_73183().method_8428().i(this.method_5820());
   }

   public boolean method_70667() {
      return this.field_59667;
   }

   public Set<String> method_5752() {
      return this.field_6029;
   }

   public boolean method_5780(String var1) {
      return this.field_6029.size() >= 1024 ? false : this.field_6029.add(var1);
   }

   public boolean method_5738(String var1) {
      return this.field_6029.remove(var1);
   }

   @Override
   public final boolean method_31481() {
      return this.field_26995 != null;
   }

   protected abstract void method_5693(class04293 var1);

   public void method_5814(double var1, double var3, double var5) {
      this.method_23327(var1, var3, var5);
      this.method_5857(this.method_33332());
   }

   public boolean method_7325() {
      return false;
   }

   public final void method_18375() {
      if (this.method_5782()) {
         this.method_5772();
      }

      if (this.method_5765()) {
         this.method_5848();
      }
   }

   public int method_5748() {
      return 300;
   }

   public boolean method_73187() {
      return this.method_5805() && !this.method_31481() && !this.method_7325();
   }

   public void method_43391(double var1, double var3, double var5) {
      this.field_38931.i(new class06889(var1, var3, var5));
   }

   public void method_5872(double var1, double var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.handler$cfa000$nursultan$injectChangeLookDirection(var1, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         var1 = this.localvar$cfa000$nursultan$modifyArgsChangeLookDirectionX(var1);
         var3 = this.localvar$cfa000$nursultan$modifyArgsChangeLookDirectionY(var3);
         float f = (float)var3 * 0.15F;
         float f1 = (float)var1 * 0.15F;
         this.method_36457(this.method_36455() + f);
         this.method_36456(this.method_36454() + f1);
         this.method_36457(class04995.N(this.method_36455(), -90.0F, 90.0F));
         this.field_6004 += f;
         this.field_5982 += f1;
         this.field_6004 = class04995.N(this.field_6004, -90.0F, 90.0F);
         if (this.field_6034 != null) {
            this.field_6034.method_5644(this);
         }
      }
   }

   public boolean method_5753() {
      return this.method_5864().L();
   }

   public final void method_5857(class00734 var1) {
      this.field_6005 = var1;
   }

   public void method_75725() {
   }

   public final double method_23317() {
      return this.field_22467.M;
   }

   public void method_5768(class04782 var1) {
      this.method_5650(class07062.field_26998);
      this.method_32876(class01194.s);
   }

   public boolean method_41328(class01312 var1) {
      return this.method_18376() == var1;
   }

   public void method_36209() {
   }

   @Override
   public class06889 method_73189() {
      return this.field_22467;
   }

   protected void method_23311() {
      this.field_64358 = null;
      this.method_5814(this.field_22467.M, this.field_22467.B, this.field_22467.Z);
   }

   public boolean method_43259(class07049 var1, double var2, double var4) {
      double d0 = var1.method_23317() - this.method_23317();
      double d1 = var1.method_23318() - this.method_23318();
      double d2 = var1.method_23321() - this.method_23321();
      return class04995.i(d0, d2) < class04995.E(var2) && class04995.E(d1) < class04995.E(var4);
   }

   public float method_36455() {
      return this.field_5965;
   }

   protected final class00734 method_33332() {
      return this.method_65341(this.field_22467);
   }

   public final double method_23318() {
      return this.field_22467.B;
   }

   public float method_36454() {
      return this.field_6031;
   }

   public void method_5670() {
      class04643 class04643 = class08700.N();
      class04643.N("entityBaseTick");
      this.method_76440();
      this.field_47742 = null;
      this.handler$bob000$lithium$onBaseTick(null);
      if (this.method_5765() && this.method_5854().method_31481()) {
         this.method_5848();
      }

      if (this.field_5951 > 0) {
         this.field_5951--;
      }

      this.method_60698();
      if (this.redirect$bpj000$lithium$skipParticlesOnServerSide(this)) {
         this.method_5839();
      }

      this.field_28628 = this.field_27857;
      this.field_27857 = false;
      this.method_5876();
      this.method_5630();
      this.method_5790();
      if (this.method_73183() instanceof class04782 class04782x) {
         if (this.field_5956 > 0) {
            if (this.method_5753()) {
               this.method_5646();
            } else {
               if (this.field_5956 % 20 == 0 && !this.method_5771()) {
                  this.method_64397(class04782x, this.method_48923().u(), 1.0F);
               }

               this.method_20803(this.field_5956 - 1);
            }
         }
      } else {
         this.method_5646();
      }

      if (this.method_5771()) {
         this.field_6017 *= 0.5;
      }

      this.method_31473();
      if (!this.method_73183().method_8608()) {
         this.method_33572(this.field_5956 > 0);
      }

      this.field_5953 = false;
      if (this.method_73183() instanceof class04782 class04782x && this instanceof class02607) {
         class02607.N(class04782x, (class07049 & class02607)this);
      }

      class04643.L();
   }

   public void method_18380(class01312 var1) {
      this.field_6011.N(field_18064, var1);
   }

   @Override
   public final void method_31745(class07062 var1) {
      if (this.field_26995 == null) {
         this.field_26995 = var1;
      }

      if (this.field_26995.N()) {
         this.method_5848();
      }

      this.method_5685().forEach(class07049::method_5848);
      this.field_26996.N(var1);
      this.method_64615(var1);
   }

   protected class00734 method_65341(class06889 var1) {
      return this.field_18065.N(var1);
   }

   public void method_36456(float var1) {
      if (!this.redirect$dnh000$viafabricplus$allowInfiniteValues(var1)) {
         class07536.y("Invalid entity rotation: " + var1 + ", discarding.");
      } else {
         this.field_6031 = var1;
      }
   }

   public class03289 method_5841() {
      return this.field_6011;
   }

   public void method_64615(class07062 var1) {
   }

   public final void method_31472() {
      this.method_5650(class07062.field_26999);
   }

   public final void method_23327(double var1, double var3, double var5) {
      if (this.field_22467.M != var1 || this.field_22467.B != var3 || this.field_22467.Z != var5) {
         this.field_22467 = new class06889(var1, var3, var5);
         int i = class04995.N(var1);
         int j = class04995.N(var3);
         int k = class04995.N(var5);
         if (i != this.field_22468.method_10263() || j != this.field_22468.method_10264() || k != this.field_22468.method_10260()) {
            this.field_22468 = new class07209(i, j, k);
            this.field_47742 = null;
            this.handler$bob000$lithium$onPositionChanged(var1, var3, var5, null);
            if (class01296.N(i) != this.field_35101.B || class01296.N(k) != this.field_35101.Z) {
               this.field_35101 = new class07321(this.field_22468);
            }
         }

         this.field_26996.N();
         if (!this.field_5953 && this.field_6002 instanceof class04782 class04782 && !this.method_31481()) {
            if (this instanceof class00042 class00042 && class00042.method_70674()) {
               class04782.method_70636().y(class00042);
            }

            if (this instanceof class04770 class04770 && class04770.method_70637() && class04770.field_13987 != null) {
               class04782.method_70636().y(class04770);
            }
         }
      }
   }

   public void method_32876(class03556<class01194> var1) {
      this.method_32875(var1, this);
   }

   public void method_5773() {
      this.method_5670();
   }

   protected void method_76440() {
      if (this.field_64358 == null) {
         this.field_64358 = this.method_73189();
      }

      this.field_64357 = this.method_73189().u(this.field_64358);
      this.field_64358 = this.method_73189();
   }

   @Nullable
   public class07049 method_5854() {
      return this.field_6034;
   }

   public void method_5710(float var1, float var2) {
      this.method_36456(var1 % 360.0F);
      this.method_36457(var2 % 360.0F);
   }

   public boolean method_24516(class07049 var1, double var2) {
      return this.method_73189().N((class00737)var1.method_73189(), var2);
   }

   public void method_36457(float var1) {
      if (!this.redirect$dnh000$viafabricplus$allowInfiniteValues(var1)) {
         class07536.y("Invalid entity rotation: " + var1 + ", discarding.");
      } else {
         float f3 = var1 % 360.0F;
         float f2 = 90.0F;
         float f1 = -90.0F;
         float f = f3;
         this.field_5965 = this.redirect$dnh000$viafabricplus$dontClampPitch(f, f1, f2);
      }
   }

   public void method_5650(class07062 var1) {
      this.method_31745(var1);
   }

   public class01312 method_18376() {
      return this.field_6011.N(field_18064);
   }

   public final void method_33574(class06889 var1) {
      this.method_5814(var1.N(), var1.y(), var1.L());
   }

   protected void method_60698() {
      if (this.method_73183() instanceof class04782 class04782x) {
         this.method_5760();
         if (this.field_51994 != null) {
            if (this.field_51994.N(class04782x, this, this.method_5822(false))) {
               class04643 class04643 = class08700.N();
               class04643.N("portal");
               this.method_30229();
               class01032 class01032 = this.field_51994.N(class04782x, this);
               if (class01032 != null) {
                  class04782 class04782x = class01032.y();
                  if (class04782x.method_75002(class04782x)
                     && (class04782x.method_27983() == class04782x.method_27983() || this.method_61113(class04782x, class04782x))) {
                     this.method_5731(class01032);
                  }
               }

               class04643.L();
            } else if (this.field_51994.y()) {
               this.field_51994 = null;
            }
         }
      }
   }

   protected void method_5839() {
      class07209 class07209x = this.method_43260();
      class00500 class00500 = this.method_73183().method_8320(class07209x);
      if (class00500.b() != class06898.field_11455) {
         class06889 class06889 = this.method_18798();
         class07209 class07209x = this.method_24515();
         double d0 = this.method_23317() + (this.field_5974.U() - 0.5) * this.field_18065.N();
         double d1 = this.method_23321() + (this.field_5974.U() - 0.5) * this.field_18065.N();
         if (class07209x.method_10263() != class07209x.method_10263()) {
            d0 = class04995.N(d0, (double)class07209x.method_10263(), class07209x.method_10263() + 1.0);
         }

         if (class07209x.method_10260() != class07209x.method_10260()) {
            d1 = class04995.N(d1, (double)class07209x.method_10260(), class07209x.method_10260() + 1.0);
         }

         this.method_73183()
            .method_8406(
               this.m_modifyExpressionValue$zkp000$fabric_particles_v1$modifyBlockStateParticleEffect_71(new class07105(class07107.y, class00500), class07209x),
               d0,
               this.method_23318() + 0.1,
               d1,
               class06889.M * -4.0,
               1.5,
               class06889.Z * -4.0
            );
      }
   }

   public void method_5644(class07049 var1) {
   }

   public final double method_23321() {
      return this.field_22467.Z;
   }

   public final void method_5630() {
      this.field_6000 = this.method_5777(class01231.N);
      Set<class03530<class04651>> set = this.field_25599;
      this.redirect$bnk000$lithium$clearIfNotEmpty(set);
      double d0 = this.redirect$dnj000$viafabricplus$subtractMagicOffset(this);
      if (!(
         this.method_5854() instanceof class00250 class00250
            && !class00250.method_5869()
            && class00250.method_5829().i >= d0
            && class00250.method_5829().y <= d0
      )) {
         class07209 class07209 = class07209.method_49637(this.method_23317(), d0, this.method_23321());
         class04688 class04688 = this.method_73183().method_8316(class07209);
         float f = class07209.method_10264();
         class07299 class07299 = this.method_73183();
         if (f + this.redirect$dnj000$viafabricplus$addMagicOffset(class04688, class07299, class07209) > d0) {
            class04688.E().forEach(this.field_25599::add);
         }
      }
   }

   protected boolean method_5876() {
      this.field_5964.clear();
      this.method_5713();
      double d0 = this.field_6002.method_75728().N(class00608.I) ? 0.007 : 0.0023333333333333335;
      boolean flag = this.method_5692(class01231.y, d0);
      return this.method_5799() || flag;
   }

   public void method_5790() {
      if (this.method_5681()) {
         this.method_5796(this.method_5624() && this.method_5799() && !this.method_5765());
      } else {
         this.method_5796(this.method_5624() && this.method_5869() && !this.method_5765() && this.method_73183().method_8316(this.field_22468).N(class01231.N));
      }
   }

   public void method_18799(class06889 var1) {
      if (var1.m()) {
         this.field_18276 = var1;
      }
   }

   public class06889 method_18796(class06889 var1, class07451 var2) {
      return var1;
   }

   public class04911 method_5634() {
      return class04911.field_15254;
   }

   public boolean method_5701() {
      return this.field_6011.N(field_5962);
   }

   private boolean method_5629(class00734 var1) {
      return this.method_73183().method_8587(this, var1) && !this.method_73183().u(var1);
   }

   public boolean method_51849(class07209 var1) {
      return this.field_44784.isPresent() && this.field_44784.get().equals(var1);
   }

   public void method_5646() {
      this.method_20803(Math.min(0, this.method_20802()));
   }

   protected void method_5760() {
      if (this.method_30230()) {
         this.field_6018--;
      }
   }

   public boolean method_5654(double var1, double var3, double var5) {
      return this.method_5629(this.method_5829().u(var1, var3, var5));
   }

   public void method_65342(boolean var1, class06889 var2) {
      this.method_60607(var1, this.field_5976, var2);
   }

   public final class06889 method_17835(class06889 var1) {
      LocalBooleanRefImpl localbooleanrefimpl = new LocalBooleanRefImpl();
      localbooleanrefimpl.init(false);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dme000$viafabricplus$use1_20_6StepCollisionCalculation(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class06889)callbackinforeturnable.getReturnValue();
      } else {
         class00734 class00734xxx = this.method_5829();
         class07299 class07299xxx = this.method_73183();
         class00734 class00734x = class00734xxx.y(var1);
         class07299 class07299x = class07299xxx;
         List list = this.redirect$bnp000$lithium$postponeGetEntities(class07299x, this, class00734x, localbooleanrefimpl);
         class06889 class06889;
         if (var1.B() == 0.0) {
            class06889 = var1;
         } else {
            class07299 class07299xx = this.method_73183();
            class06889 = this.redirect$bnp000$lithium$collideMovementWithPostponedGetEntities(
               this, var1, class00734xxx, class07299xx, list, localbooleanrefimpl
            );
         }

         class06889 class06889x = class06889;
         boolean flag = var1.M != class06889x.M;
         boolean flag1 = var1.B != class06889x.B;
         boolean flag2 = var1.Z != class06889x.Z;
         boolean flag3 = flag1 && var1.B < 0.0;
         if (this.method_49476() > 0.0F && (flag3 || this.method_24828()) && (flag || flag2)) {
            class00734 class00734xx = flag3 ? class00734xxx.u(0.0, class06889x.B, 0.0) : class00734xxx;
            class00734 class00734xxx = class00734xx.y(var1.M, this.method_49476(), var1.Z);
            if (!flag3) {
               class00734xxx = class00734xxx.y(0.0, -1.0E-5F, 0.0);
            }

            class07299 class07299xx = this.field_6002;
            List list2 = this.localvar$bnp000$lithium$collectEntities(list, localbooleanrefimpl);
            List<class00494> list1 = method_59920(this, class07299xx, list, class00734xxx);
            float f = (float)class06889x.B;

            for (float f1 : method_59921(class00734xx, list1, this.method_49476(), f)) {
               class06889 class06889xx = method_20737(new class06889(var1.M, f1, var1.Z), class00734xx, list1);
               if (class06889xx.z() > class06889x.z()) {
                  double d0 = class00734xxx.y - class00734xx.y;
                  return class06889xx.N(0.0, d0, 0.0);
               }
            }
         }

         return class06889x;
      }
   }

   public int method_51848() {
      return this.field_6018;
   }

   public void method_5784(class07451 var1, class06889 var2) {
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(null);
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.handler$cfa000$nursultan$injectMove(var1, var2, callbackinfo, localrefimpl);
      if (!callbackinfo.isCancelled()) {
         var2 = this.localvar$cfa000$nursultan$ModifyVariableMove(var2, localrefimpl);
         if (this.field_5960) {
            this.method_5814(this.method_23317() + var2.M, this.method_23318() + var2.B, this.method_23321() + var2.Z);
            this.field_5976 = false;
            this.field_5992 = false;
            this.field_36331 = false;
            this.field_34927 = false;
         } else {
            if (var1 == class07451.field_6310) {
               var2 = this.method_18794(var2);
               if (var2.equals(class06889.L)) {
                  return;
               }
            }

            class04643 class04643 = class08700.N();
            class04643.N("move");
            if (this.field_17046.B() > 1.0E-7) {
               if (var1 != class07451.field_6310) {
                  var2 = var2.B(this.field_17046);
               }

               this.field_17046 = class06889.L;
               this.method_18799(class06889.L);
            }

            var2 = this.method_18796(var2, var1);
            class06889 class06889xxxx = this.method_17835(var2);
            double d0 = class06889xxxx.B();
            if (d0 > 1.0E-7 || this.redirect$dme000$viafabricplus$allowSmallValues(var2) - d0 < 1.0E-7) {
               if (this.field_6017 != 0.0 && d0 >= 1.0) {
                  double d1 = Math.min(class06889xxxx.M(), 8.0);
                  class06889 class06889x = this.method_73189().i(class06889xxxx.u().L(d1));
                  class06183 class06183 = this.method_73183()
                     .N(new class05862(this.method_73189(), class06889x, class05849.field_36337, class05835.field_36338, this));
                  if (class06183.N() != class07113.field_1333) {
                     this.method_38785();
                  }
               }

               class06889 class06889x = this.method_73189();
               class06889 class06889xx = class06889x.i(class06889xxxx);
               class10713 class10713 = new class10713(class06889x, class06889xx, var2);
               if (this.wrapWithCondition$dme000$viafabricplus$removeExtraCollisionChecks(this, class10713)) {
                  this.method_71966(class10713);
               }

               this.method_33574(class06889xx);
            }

            class04643.L();
            class04643.N("rest");
            double d3 = class06889xxxx.M;
            double d2 = var2.M;
            boolean flag = !redirect$dme000$viafabricplus$horizontalExactCollisionEqualness(d2, d3);
            d3 = class06889xxxx.Z;
            d2 = var2.Z;
            boolean flag1 = !redirect$dme000$viafabricplus$horizontalExactCollisionEqualness(d2, d3);
            this.field_5976 = flag || flag1;
            if (Math.abs(var2.B) > 0.0 || this.method_66247()) {
               this.field_5992 = var2.B != class06889xxxx.B;
               this.field_36331 = this.field_5992 && var2.B < 0.0;
               this.method_60607(this.field_36331, this.field_5976, class06889xxxx);
            }

            if (this.field_5976) {
               this.field_34927 = this.method_39759(class06889xxxx);
            } else {
               this.field_34927 = false;
            }

            class07209 class07209 = this.method_43260();
            class00500 class00500 = this.method_73183().method_8320(class07209);
            if (this.method_66247()) {
               this.method_5623(class06889xxxx.B, this.method_24828(), class00500, class07209);
            }

            if (this.method_31481()) {
               class04643.L();
            } else {
               if (this.field_5976) {
                  class06889 class06889x = this.method_18798();
                  this.method_18800(flag ? 0.0 : class06889x.M, class06889x.B, flag1 ? 0.0 : class06889x.Z);
               }

               if (this.method_66249()) {
                  class00891 class00891 = class00500.i();
                  if (var2.B != class06889xxxx.B) {
                     class00891.N(this.method_73183(), this);
                  }
               }

               if (!this.method_73183().method_8608() || this.method_66247()) {
                  class07065 class07065 = this.method_33570();
                  if (class07065.N() && !this.method_5765()) {
                     this.method_61407(class07065, class06889xxxx, class07209, class00500);
                  }
               }

               float f = this.method_23326();
               this.method_18799(this.method_18798().u(f, 1.0, f));
               class04643.L();
            }
         }
      }
   }

   public void method_20803(int var1) {
      this.field_5956 = var1;
   }

   public void method_31473() {
      if (this.method_23318() < this.method_73183().method_31607() - 64) {
         this.method_5825();
      }
   }

   protected void method_51703(boolean var1, @Nullable class06889 var2) {
      if (var1) {
         class00734 class00734xx = this.method_5829();
         class00734 class00734x = new class00734(class00734xx.N, class00734xx.y - 1.0E-6, class00734xx.L, class00734xx.u, class00734xx.y, class00734xx.R);
         Optional optional = this.field_6002.method_51718(this, class00734x);
         if (optional.isPresent() || this.field_44873) {
            this.field_44784 = optional;
         } else if (var2 != null) {
            class00734 class00734xx = class00734x.u(-var2.M, 0.0, -var2.Z);
            optional = this.field_6002.method_51718(this, class00734xx);
            this.field_44784 = optional;
         }

         this.field_44873 = optional.isEmpty();
      } else {
         this.field_44873 = false;
         if (this.field_44784.isPresent()) {
            this.field_44784 = Optional.empty();
         }
      }
   }

   public boolean method_24828() {
      return this.field_5952;
   }

   public abstract boolean method_64397(class04782 var1, class07072 var2, float var3);

   public void method_5730() {
      if (!this.method_5753()) {
         if (this.method_73183() instanceof class04782 class04782
            && this.method_64397(class04782, this.method_48923().i(), 4.0F)
            && this.method_64270()
            && !this.method_5701()) {
            class04782.method_43128(
               null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.EX, this.method_5634(), 0.4F, 2.0F + this.field_5974.z() * 0.4F
            );
         }
      }
   }

   public void method_30229() {
      this.field_6018 = this.method_5806();
   }

   public boolean method_30230() {
      return this.field_6018 > 0;
   }

   public class03697 method_48923() {
      return this.method_73183().method_48963();
   }

   public void method_51850(int var1) {
      this.field_6018 = var1;
   }

   public void method_56073(int var1) {
      if (this.field_5956 < var1) {
         this.method_20803(var1);
      }

      this.method_67635();
   }

   public int method_20802() {
      return this.field_5956;
   }

   public void method_24830(boolean var1) {
      this.field_5952 = var1;
      this.method_51703(var1, null);
   }

   protected boolean method_64270() {
      return true;
   }

   public void method_33572(boolean var1) {
      this.method_5729(0, var1 || this.field_33758);
   }

   protected void method_5825() {
      this.method_31472();
   }

   protected void method_5729(int var1, boolean var2) {
      byte b0 = this.field_6011.N(field_5990);
      if (var2) {
         this.field_6011.N(field_5990, (byte)(b0 | 1 << var1));
      } else {
         this.field_6011.N(field_5990, (byte)(b0 & ~(1 << var1)));
      }
   }

   public final void method_5639(float var1) {
      this.method_56073(class04995.y(var1 * 20.0F));
   }

   public void method_67635() {
      this.method_32317(0);
   }

   public boolean method_5771() {
      boolean flag;
      boolean flag1 = flag = !this.field_5953 && this.field_5964.getDouble(class01231.y) > 0.0;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag);
      this.handler$dnj000$viafabricplus$replaceLavaCheck1_13_2(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : flag1;
   }

   public void method_67633() {
      if (!this.method_5753()) {
         this.method_5639(15.0F);
      }
   }

   public void method_60607(boolean var1, boolean var2, class06889 var3) {
      this.field_5952 = var1;
      this.field_5976 = var2;
      this.method_51703(var1, var3);
   }

   public int method_5806() {
      class07049 class07049 = this.method_31483();
      return class07049 instanceof class04770 ? class07049.method_5806() : 300;
   }

   protected class06889 method_18794(class06889 var1) {
      if (var1.B() <= 1.0E-7) {
         return var1;
      } else {
         long i = this.method_73183().N();
         if (i != this.field_5996) {
            Arrays.fill(this.field_5993, 0.0);
            this.field_5996 = i;
         }

         if (var1.M != 0.0) {
            double d2 = this.method_18797(class07185.field_11048, var1.M);
            return Math.abs(d2) <= 1.0E-5F ? class06889.L : new class06889(d2, 0.0, 0.0);
         } else if (var1.B != 0.0) {
            double d1 = this.method_18797(class07185.field_11052, var1.B);
            return Math.abs(d1) <= 1.0E-5F ? class06889.L : new class06889(0.0, d1, 0.0);
         } else if (var1.Z != 0.0) {
            double d0 = this.method_18797(class07185.field_11051, var1.Z);
            return Math.abs(d0) <= 1.0E-5F ? class06889.L : new class06889(0.0, 0.0, d0);
         } else {
            return class06889.L;
         }
      }
   }

   public boolean method_40071() {
      return this.method_32312() > 0;
   }

   private void method_61407(class07065 var1, class06889 var2, class07209 var3, class00500 var4) {
      float f = 0.6F;
      float f1 = (float)(var2.M() * 0.6F);
      float f2 = (float)(var2.Z() * 0.6F);
      class07209 class07209 = this.method_23312();
      class00500 class00500 = this.method_73183().method_8320(class07209);
      boolean flag = this.method_51702(class00500);
      this.field_5994 += flag ? f1 : f2;
      this.field_28627 += f1;
      if (this.field_5994 > this.field_6003 && !class00500.P()) {
         boolean flag1 = class07209.equals(var3);
         boolean flag2 = this.method_51701(var3, var4, var1.L(), flag1, var2);
         if (!flag1) {
            flag2 |= this.method_51701(class07209, class00500, false, var1.y(), var2);
         }

         if (flag2) {
            this.field_6003 = this.method_5867();
         } else if (this.method_5799()) {
            this.field_6003 = this.method_5867();
            if (var1.L()) {
               this.method_51295();
            }

            if (var1.y()) {
               this.method_32876(class01194.p);
            }
         }
      } else if (class00500.P()) {
         this.method_33573();
      }
   }

   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
      if (!this.method_5799() && var1 < 0.0) {
         this.field_6017 -= (float)var1;
      }

      if (var3) {
         if (this.field_6017 > 0.0) {
            var4.i().N(this.method_73183(), var4, var5, this, this.field_6017);
            this.method_73183()
               .method_32888(
                  class01194.k,
                  this.field_22467,
                  class01164.N(this, this.field_44784.<class00500>map(var1x -> this.method_73183().method_8320(var1x)).orElse(var4))
               );
         }

         this.method_38785();
      }
   }

   protected boolean method_61410() {
      return !this.method_31481() && !this.field_5960;
   }

   private void method_65037(List<class10713> var1, class08418 var2) {
      if (this.method_61410()) {
         LongSet longset = this.field_54948;

         for (class10713 class10713 : var1) {
            class06889 class06889xx = class10713.N();
            class06889 class06889x = class10713.y().u(class10713.N());
            int i = 16;
            if (class10713.L().isPresent() && class06889x.B() > 0.0) {
               UnmodifiableIterator unmodifiableiterator = redirect$dme000$viafabricplus$alwaysSortYXZ(class10713.L().get()).iterator();

               while (unmodifiableiterator.hasNext()) {
                  class07185 class07185 = (class07185)unmodifiableiterator.next();
                  double d0 = class06889x.N(class07185);
                  if (d0 != 0.0) {
                     class06889 class06889xx = class06889xx.N(class07185.u(), d0);
                     i -= this.method_72084(class06889xx, class06889xx, var2, longset, i);
                     class06889xx = class06889xx;
                  }
               }
            } else {
               i -= this.method_72084(class10713.N(), class10713.y(), var2, longset, 16);
            }

            if (i <= 0) {
               this.method_72084(class10713.y(), class10713.y(), var2, longset, 1);
            }
         }

         longset.clear();
      }
   }

   public boolean method_5681() {
      return this.method_5795(4);
   }

   private void method_51297(class07209 var1, class00500 var2) {
      this.method_5712(var1, var2);
      if (this.method_49790(var2)) {
         this.method_37215();
      }
   }

   public void method_46395() {
      if (this.method_5809()) {
         this.method_36975();
      }

      this.method_5646();
   }

   protected void method_5801() {
   }

   protected boolean method_39759(class06889 var1) {
      return false;
   }

   protected float method_23326() {
      class00500 class00500 = this.method_73183().method_8320(this.method_24515());
      float f = class00500.i().z();
      if (!class00500.N(class00869.K) && !class00500.N(class00869.PN)) {
         return f == 1.0 ? this.method_73183().method_8320(this.method_23314()).i().z() : f;
      } else {
         return f;
      }
   }

   protected void method_33573() {
      if (this.method_5776()) {
         this.method_5801();
         if (this.method_33570().y()) {
            this.method_32876(class01194.l);
         }
      }
   }

   public boolean method_5778() {
      class07209 class07209 = this.method_24515();
      return this.method_73183().method_8520(class07209)
         || this.method_73183().method_8520(class07209.method_49637(class07209.method_10263(), this.method_5829().i, class07209.method_10260()));
   }

   @Deprecated
   public class07209 method_43260() {
      return this.method_43258(0.2F);
   }

   protected float method_5867() {
      return (int)this.field_5994 + 1;
   }

   public boolean method_52172() {
      return false;
   }

   protected boolean method_5776() {
      return false;
   }

   private void method_71966(class10713 var1) {
      if (this.field_54947.size() >= 100) {
         class10713 class10713xx = this.field_54947.removeFirst();
         class10713 class10713x = this.field_54947.removeFirst();
         class10713 class10713xx = new class10713(class10713xx.N(), class10713x.y());
         this.field_54947.addFirst(class10713xx);
      }

      this.field_54947.add(var1);
   }

   public void method_38785() {
      this.field_6017 = 0.0;
   }

   public void method_18800(double var1, double var3, double var5) {
      this.method_18799(new class06889(var1, var3, var5));
   }

   private boolean method_51702(class00500 var1) {
      return var1.N(class01210.yu) || var1.N(class00869.ba);
   }

   protected void method_51295() {
      class07049 class07049 = Objects.requireNonNullElse(this.method_5642(), this);
      float f = class07049 == this ? 0.35F : 0.4F;
      class06889 class06889 = class07049.method_18798();
      float f1 = Math.min(1.0F, (float)Math.sqrt(class06889.M * class06889.M * 0.2F + class06889.B * class06889.B + class06889.Z * class06889.Z * 0.2F) * f);
      this.method_5734(f1);
   }

   protected void method_61409() {
      this.field_57579.clear();
      this.field_57579.addAll(this.field_54947);
      this.field_54947.clear();
      if (this.field_57579.isEmpty()) {
         this.field_57579.add(new class10713(this.method_61411(), this.method_73189()));
      } else if (this.field_57579.getLast().y().M(this.method_73189()) > 9.9999994E-11F) {
         this.field_57579.add(new class10713(this.field_57579.getLast().y(), this.method_73189()));
      }

      this.method_68260(this.field_57579);
   }

   public boolean method_5809() {
      boolean flag = this.method_73183() != null && this.method_73183().method_8608();
      return !this.method_5753() && (this.field_5956 > 0 || flag && this.method_5795(0));
   }

   protected void method_36975() {
      if (!this.field_6002.method_8608()) {
         this.method_73183()
            .method_43128(
               null,
               this.method_23317(),
               this.method_23318(),
               this.method_23321(),
               class04909.Ef,
               this.method_5634(),
               0.7F,
               1.6F + (this.field_5974.z() - this.field_5974.z()) * 0.4F
            );
      }
   }

   protected int method_5676() {
      return 0;
   }

   public boolean method_66249() {
      return this.method_66247();
   }

   public void method_68259() {
      if (!this.field_54947.isEmpty()) {
         this.field_54947.removeLast();
      }
   }

   private boolean method_51701(class07209 var1, class00500 var2, boolean var3, boolean var4, class06889 var5) {
      if (var2.P()) {
         return false;
      } else {
         boolean flag = this.method_51702(var2);
         if ((this.method_24828() || flag || this.method_18276() && var5.B == 0.0 || this.method_52172()) && !this.method_5681()) {
            if (var3) {
               this.method_51297(var1, var2);
            }

            if (var4) {
               this.method_73183().method_32888(class01194.a, this.method_73189(), class01164.N(this, var2));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public boolean method_76798() {
      return Math.abs(this.field_64357.Z()) > 1.0E-5F;
   }

   public boolean method_18276() {
      return this.method_41328(class01312.field_18081);
   }

   protected class07065 method_33570() {
      return class07065.field_28633;
   }

   public final boolean method_66247() {
      return this.field_6002.method_8608() ? this.method_66248() : !this.method_65038();
   }

   public class06889 method_18798() {
      return this.field_18276;
   }

   public class07209 method_23312() {
      return this.method_43258(1.0E-5F);
   }

   public final class06889 method_61411() {
      return new class06889(this.field_6038, this.field_5971, this.field_5989);
   }

   protected void method_71965() {
      this.field_54947.clear();
   }

   public void method_64166(class06889 var1, class06889 var2) {
      this.method_68260(List.of(new class10713(var1, var2)));
   }

   private void method_68260(List<class10713> var1) {
      if (this.method_61410()) {
         if (this.method_24828()) {
            class07209 class07209 = this.method_43260();
            class00500 class00500 = this.method_73183().method_8320(class07209);
            class00500.i().N(this.method_73183(), class07209, class00500, this);
         }

         boolean flag1 = this.method_5809();
         boolean flag2 = this.method_40071();
         int i = this.method_20802();
         this.method_65037(var1, this.field_56630);
         this.field_56630.N(this);
         if (this.method_5778()) {
            this.method_5646();
         }

         if (flag1 && !this.method_5809() || flag2 && !this.method_40071()) {
            this.method_36975();
         }

         boolean flag = this.method_20802() > i;
         if (!this.method_73183().method_8608() && !this.method_5809() && !flag) {
            this.method_20803(-this.method_5676());
         }
      }
   }

   public boolean method_5799() {
      return this.field_5957;
   }

   @Override
   public class07209 method_24515() {
      return this.field_22468;
   }

   protected class07209 method_43258(float var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dme000$viafabricplus$modifyPosWithYOffset(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07209)callbackinforeturnable.getReturnValue();
      } else if (this.field_44784.isPresent()) {
         class07209 class07209 = this.field_44784.get();
         if (!(var1 > 1.0E-5F)) {
            return class07209;
         } else {
            class00500 class00500 = this.method_73183().method_8320(class07209);
            return (!(var1 <= 0.5) || !class00500.N(class01210.A)) && !class00500.N(class01210.q) && !(class00500.i() instanceof class07188)
               ? class07209.method_33096(class04995.N(this.field_22467.B - var1))
               : class07209;
         }
      } else {
         int i = class04995.N(this.field_22467.M);
         int j = class04995.N(this.field_22467.B - var1);
         int k = class04995.N(this.field_22467.Z);
         return new class07209(i, j, k);
      }
   }

   public class07209 method_23314() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dme000$viafabricplus$modifyVelocityAffectingPos(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class07209)callbackinforeturnable.getReturnValue() : this.method_43258(0.500001F);
   }

   protected class04891 method_5737() {
      return class04909.ED;
   }

   protected class04891 method_5625() {
      return class04909.Ex;
   }

   private void method_72085(class04782 var1, class07209 var2, boolean var3, boolean var4) {
      class00466 class00466;
      if (var4) {
         class00466 = class00466.field_62848;
      } else if (var3) {
         class00466 = class00466.field_62847;
      } else {
         class00466 = class00466.field_62849;
      }

      var1.method_74535().N(var2, class00429.M, class00466);
   }

   public boolean method_66648(class04688 var1, class07209 var2, class06889 var3, class06889 var4) {
      class00734 class00734 = var1.i(this.method_73183(), var2);
      return class00734 != null && this.method_63612(var3, var4, List.of(class00734));
   }

   public boolean method_63612(class06889 var1, class06889 var2, List<class00734> var3) {
      class00734 class00734 = this.method_65341(var1);
      class06889 class06889 = var2.u(var1);
      return class00734.N(class06889, var3);
   }

   public float method_49476() {
      return 0.0F;
   }

   protected void method_5622(class00500 var1) {
   }

   private int method_72084(class06889 var1, class06889 var2, class08418 var3, LongSet var4, int var5) {
      class00734 class00734 = this.method_65341(var2).B(this.constant$dml000$viafabricplus$fixBlockCollisionMargin(1.0E-5F));
      boolean flag = var1.M(var2) > class04995.E(0.9999900000002526);
      boolean flag1 = this.field_6002 instanceof class04782 class04782 && class04782.method_8503().yV().N(class00429.M);
      AtomicInteger atomicinteger = new AtomicInteger();
      class07290.N(var1, var2, class00734, (var10, var11x) -> {
         if (!this.method_5805()) {
            return false;
         } else if (var11x >= var5) {
            return false;
         } else {
            atomicinteger.set(var11x);
            class00500 class00500 = this.method_73183().method_8320(var10);
            if (class00500.P()) {
               if (flag1) {
                  this.method_72085((class04782)this.method_73183(), var10.method_10062(), false, false);
               }

               return true;
            } else {
               class00494 class00494 = class00500.N(this.method_73183(), var10, this);
               boolean flag2 = class00494 == class00389.y() || this.method_63612(var1, var2, class00494.method_64034(new class06889(var10)).method_1090());
               boolean flag3 = this.method_66648(class00500.Y(), var10, var1, var2);
               if ((flag2 || flag3) && var4.add(var10.method_10063())) {
                  if (flag2) {
                     try {
                        boolean flag4 = flag || class00734.y(var10);
                        var3.N(var11x);
                        class00500.N(this.method_73183(), var10, this, var3, flag4);
                        this.method_5622(class00500);
                     } catch (Throwable throwable) {
                        class07080 class07080 = class07080.N(throwable, "Colliding entity with block");
                        class07074.N(class07080.N("Block being collided with"), this.method_73183(), var10, class00500);
                        class07074 class07074 = class07080.N("Entity being checked for collision");
                        this.method_5819(class07074);
                        throw new class07878(class07080);
                     }
                  }

                  if (flag3) {
                     var3.N(var11x);
                     class00500.Y().N(this.method_73183(), var10, this, var3);
                  }

                  if (flag1) {
                     this.method_72085((class04782)this.method_73183(), var10.method_10062(), flag2, flag3);
                  }

                  return true;
               } else {
                  return true;
               }
            }
         }
      });
      return atomicinteger.get() + 1;
   }

   public double method_74657(double var1) {
      class00734 class00734x = this.method_5829();
      class00734 class00734x = class00734x.y(class00734x.y - var1).i(class00734x.y);
      List<class00494> list = method_74656(this, this.field_6002, class00734x);
      return list.isEmpty() ? var1 : -class00389.N(class07185.field_11052, class00734x, list, -var1);
   }

   public static List<class00494> method_74656(@Nullable class07049 var0, class07299 var1, class00734 var2) {
      List<class00494> list = var1.method_20743(var0, var2);
      return method_59920(var0, var1, list, var2);
   }

   private static float[] method_59921(class00734 var0, List<class00494> var1, float var2, float var3) {
      FloatArraySet floatarrayset = new FloatArraySet(4);
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         DoubleListIterator doublelistiterator = ((class00494)iterator.next()).method_1109(class07185.field_11052).iterator();

         while (doublelistiterator.hasNext()) {
            float f = (float)((Double)doublelistiterator.next() - var0.y);
            if (!(f < 0.0F) && f != var3) {
               if (f > var2) {
                  break;
               }

               floatarrayset.add(f);
            }
         }
      }

      float[] afloat = floatarrayset.toFloatArray();
      FloatArrays.unstableSort(afloat);
      return afloat;
   }

   private static class06889 method_20737(class06889 var0, class00734 var1, List<class00494> var2) {
      if (var2.isEmpty()) {
         return var0;
      } else {
         class06889 class06889 = class06889.L;
         UnmodifiableIterator unmodifiableiterator = redirect$dme000$viafabricplus$alwaysSortYXZ(var0).iterator();

         while (unmodifiableiterator.hasNext()) {
            class07185 class07185 = (class07185)unmodifiableiterator.next();
            double d0 = var0.N(class07185);
            if (d0 != 0.0) {
               double d1 = class00389.N(class07185, var1.L(class06889), var2, d0);
               class06889 = class06889.N(class07185, d1);
            }
         }

         return class06889;
      }
   }

   protected class04891 method_5672() {
      return class04909.Ex;
   }

   protected float method_23313() {
      float f = this.method_73183().method_8320(this.method_24515()).i().U();
      float f1 = this.method_73183().method_8320(this.method_23314()).i().U();
      return f == 1.0 ? f1 : f;
   }

   private double method_18797(class07185 var1, double var2) {
      int i = var1.ordinal();
      double d0 = class04995.N(var2 + this.field_5993[i], -0.51, 0.51);
      var2 = d0 - this.field_5993[i];
      this.field_5993[i] = d0;
      return var2;
   }

   private static List<class00494> method_59920(@Nullable class07049 var0, class07299 var1, List<class00494> var2, class00734 var3) {
      Builder builder = ImmutableList.builderWithExpectedSize(var2.size() + 1);
      if (!var2.isEmpty()) {
         builder.addAll(var2);
      }

      class08057 class08057 = var1.method_8621();
      if (var0 != null && class08057.N(var0, var3)) {
         builder.add(class08057.N());
      }

      builder.addAll(var1.method_20812(var0, var3));
      return builder.build();
   }

   public boolean method_5747(double var1, float var3, class07072 var4) {
      if (this.field_5961.N(class01217.s)) {
         return false;
      } else {
         this.method_67345(var1, var3, var4);
         return false;
      }
   }

   protected void method_51296(class00500 var1) {
      class07752 class07752 = var1.O();
      this.method_5783(class07752.u(), class07752.N() * 0.05F, class07752.y() * 0.8F);
   }

   public class07209 method_14245(class04782 var1, class07209 var2) {
      class07209 class07209 = var1.method_74854().y();
      class06889 class06889 = class07209.method_46558();
      int i = var1.method_8500(class07209).N(class07830.field_13203, class07209.method_10263(), class07209.method_10260()) + 1;
      return class07209.method_49637(class06889.M, i, class06889.Z);
   }

   public boolean method_33724() {
      class00734 class00734 = this.method_5829().M(1.0);
      int i = class04995.N(class00734.N);
      int j = class04995.L(class00734.u);
      int k = class04995.N(class00734.L);
      int l = class04995.L(class00734.R);
      return !this.method_73183().N(i, k, j, l);
   }

   @Nullable
   public class07438 method_5642() {
      return null;
   }

   public void method_32875(class03556<class01194> var1, @Nullable class07049 var2) {
      this.method_73183().N(var2, var1, this.field_22467);
   }

   protected void method_56990() {
      double d0 = this.method_56989();
      if (d0 != 0.0) {
         this.method_18799(this.method_18798().y(0.0, -d0, 0.0));
      }
   }

   public boolean method_5721() {
      return this.method_5799() || this.method_5778();
   }

   public boolean method_52535() {
      return this.method_5799() || this.method_5771();
   }

   public boolean method_5869() {
      return this.field_6000 && this.method_5799();
   }

   protected class07209 method_49788(class07209 var1) {
      class07209 class07209 = var1.method_10084();
      class00500 class00500 = this.method_73183().method_8320(class07209);
      return !class00500.N(class01210.yk) && !class00500.N(class01210.yY) ? var1 : class07209;
   }

   protected double method_7490() {
      return 0.0;
   }

   public boolean method_70668() {
      if (class02566.y(this.field_6002.method_75728().N(class00608.U, this.method_73189())) == 0) {
         return false;
      } else {
         float f = this.field_6002.method_75728().N(class00608.E, this.method_73189());
         if (this.method_23318() + this.method_17682() < f) {
            return false;
         } else {
            float f1 = f + 4.0F;
            return this.method_23318() <= f1;
         }
      }
   }

   public final float method_17682() {
      return this.field_18065.y();
   }

   protected void method_49787(class00500 var1, class00500 var2) {
      class07752 class07752 = var1.O();
      this.method_5783(class07752.u(), class07752.N() * 0.15F, class07752.y());
      this.method_51296(var2);
   }

   public boolean method_5624() {
      return this.method_5795(3);
   }

   public boolean method_74016() {
      return this.method_5799() && !this.method_5869();
   }

   public boolean method_33189() {
      return false;
   }

   public void method_5803(boolean var1) {
      this.field_6011.N(field_5962, var1);
   }

   public void method_43077(class04891 var1) {
      if (!this.method_5701()) {
         this.method_5783(var1, 1.0F, 1.0F);
      }
   }

   protected void method_5734(float var1) {
      this.method_5783(this.method_5737(), var1, 1.0F + (this.field_5974.z() - this.field_5974.z()) * 0.4F);
   }

   public void method_5875(boolean var1) {
      this.field_6011.N(field_5995, var1);
   }

   public final double method_56989() {
      return this.method_5740() ? 0.0 : this.method_7490();
   }

   protected void method_67345(double var1, float var3, class07072 var4) {
      if (this.method_5782()) {
         Iterator<class07049> iterator = this.method_5685().iterator();

         while (iterator.hasNext()) {
            iterator.next().method_5747(var1, var3, var4);
         }
      }
   }

   public final List<class07049> method_5685() {
      return this.field_5979;
   }

   public final void method_65942(double var1, double var3, double var5, boolean var7) {
      if (!this.method_33724()) {
         this.method_51703(var7, new class06889(var1, var3, var5));
         class07209 class07209 = this.method_43260();
         class00500 class00500 = this.method_73183().method_8320(class07209);
         this.method_5623(var3, var7, class00500, class07209);
      }
   }

   protected void method_5712(class07209 var1, class00500 var2) {
      class07752 class07752 = var2.O();
      this.method_5783(class07752.u(), class07752.N() * 0.15F, class07752.y());
   }

   private void method_37215() {
      this.field_26997 = this.field_26997 * (float)Math.pow(0.997, this.field_6012 - this.field_26994);
      this.field_26997 = Math.min(1.0F, this.field_26997 + 0.07F);
      float f = 0.5F + this.field_26997 * this.field_5974.z() * 1.2F;
      float f1 = 0.1F + this.field_26997 * 1.2F;
      this.method_5783(class04909.g, f1, f);
      this.field_26994 = this.field_6012;
   }

   private boolean method_49790(class00500 var1) {
      return var1.N(class01210.yw) && this.field_6012 >= this.field_26994 + 20;
   }

   public void method_5783(class04891 var1, float var2, float var3) {
      if (!this.method_5701()) {
         this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), var1, this.method_5634(), var2, var3);
      }
   }

   public boolean method_5740() {
      return this.field_6011.N(field_5995);
   }

   public void method_5725(class07209 var1, float var2, float var3) {
      this.method_60949(var1.method_61082(), var2, var3);
   }

   public final void method_22862() {
      this.method_63613();
      this.method_63614();
   }

   protected void method_5746() {
      class07049 class07049 = Objects.requireNonNullElse(this.method_5642(), this);
      float f = class07049 == this ? 0.2F : 0.9F;
      class06889 class06889 = class07049.method_18798();
      float f1 = Math.min(1.0F, (float)Math.sqrt(class06889.M * class06889.M * 0.2F + class06889.B * class06889.B + class06889.Z * class06889.Z * 0.2F) * f);
      if (f1 < 0.25F) {
         this.method_5783(this.method_5625(), f1, 1.0F + (this.field_5974.z() - this.field_5974.z()) * 0.4F);
      } else {
         this.method_5783(this.method_5672(), f1, 1.0F + (this.field_5974.z() - this.field_5974.z()) * 0.4F);
      }

      float f2 = class04995.N(this.method_23318());

      for (int i = 0; i < 1.0F + this.field_18065.N() * 20.0F; i++) {
         double d0 = (this.field_5974.U() * 2.0 - 1.0) * this.field_18065.N();
         double d1 = (this.field_5974.U() * 2.0 - 1.0) * this.field_18065.N();
         this.method_73183()
            .method_8406(
               class07107.u,
               this.method_23317() + d0,
               f2 + 1.0F,
               this.method_23321() + d1,
               class06889.M,
               class06889.B - this.field_5974.U() * 0.2F,
               class06889.Z
            );
      }

      for (int j = 0; j < 1.0F + this.field_18065.N() * 20.0F; j++) {
         double d2 = (this.field_5974.U() * 2.0 - 1.0) * this.field_18065.N();
         double d3 = (this.field_5974.U() * 2.0 - 1.0) * this.field_18065.N();
         this.method_73183()
            .method_8406(class07107.NT, this.method_23317() + d2, f2 + 1.0F, this.method_23321() + d3, class06889.M, class06889.B, class06889.Z);
      }

      this.method_32876(class01194.X);
   }

   public void method_29495(class06889 var1) {
      this.method_24203(var1.M, var1.B, var1.Z);
   }

   public void method_63614() {
      this.method_63617(this.method_36454(), this.method_36455());
   }

   public float method_5739(class07049 var1) {
      float f = (float)(this.method_23317() - var1.method_23317());
      float f1 = (float)(this.method_23318() - var1.method_23318());
      float f2 = (float)(this.method_23321() - var1.method_23321());
      return class04995.N(f * f + f1 * f1 + f2 * f2);
   }

   public void method_5697(class07049 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.handler$cfa000$nursultan$injectPushAwayFrom(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (!this.method_5794(var1)) {
            if (!var1.field_5960 && !this.field_5960) {
               double d0 = var1.method_23317() - this.method_23317();
               double d1 = var1.method_23321() - this.method_23321();
               double d2 = class04995.N(d0, d1);
               if (d2 >= 0.01F) {
                  d2 = Math.sqrt(d2);
                  d0 /= d2;
                  d1 /= d2;
                  double d3 = 1.0 / d2;
                  if (d3 > 1.0) {
                     d3 = 1.0;
                  }

                  d0 *= d3;
                  d1 *= d3;
                  d0 *= 0.05F;
                  d1 *= 0.05F;
                  if (!this.method_5782() && this.method_5810()) {
                     this.method_5762(-d0, 0.0, -d1);
                  }

                  if (!var1.method_5782() && var1.method_5810()) {
                     var1.method_5762(d0, 0.0, d1);
                  }
               }
            }
         }
      }
   }

   public void method_30634(double var1, double var3, double var5) {
      double d0 = class04995.N(var1, -3.0E7, 3.0E7);
      double d1 = class04995.N(var5, -3.0E7, 3.0E7);
      this.field_6014 = d0;
      this.field_6036 = var3;
      this.field_5969 = d1;
      this.method_5814(d0, var3, d1);
   }

   public boolean method_5794(class07049 var1) {
      return this.method_5668() == var1.method_5668();
   }

   @class09956(
      N = "isPushable"
   )
   public boolean method_5810() {
      return false;
   }

   @Deprecated
   public float method_5718() {
      return this.method_73183().y(this.method_31477(), this.method_31479())
         ? this.method_73183().Z(class07209.method_49637(this.method_23317(), this.method_23320(), this.method_23321()))
         : 0.0F;
   }

   private void method_63618(class06889 var1) {
      this.field_6014 = this.field_6038 = var1.M;
      this.field_6036 = this.field_5971 = var1.B;
      this.field_5969 = this.field_5989 = var1.Z;
   }

   public void method_5713() {
      class07049 class07049 = this.method_5854();
      if (class07049 instanceof class00250 && !((class00250)class07049).method_5869()) {
         this.field_5957 = false;
      } else if (this.method_5692(class01231.N, 0.014)) {
         if (!this.field_5957 && !this.field_5953) {
            this.method_5746();
         }

         this.method_38785();
         this.field_5957 = true;
      } else {
         this.field_5957 = false;
      }
   }

   public boolean method_5692(class03530<class04651> var1, double var2) {
      CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
      this.handler$dnj000$viafabricplus$modifyFluidMovementBoundingBox(var1, var2, callbackinforeturnable1);
      if (callbackinforeturnable1.isCancelled()) {
         return callbackinforeturnable1.getReturnValueZ();
      } else if (this.method_33724()) {
         return false;
      } else {
         class00734 class00734 = this.method_5829().B(0.001);
         int i = class04995.N(class00734.N);
         int j = class04995.L(class00734.u);
         int k = class04995.N(class00734.y);
         int l = class04995.L(class00734.i);
         int i1 = class04995.N(class00734.L);
         int j1 = class04995.L(class00734.R);
         double d0 = 0.0;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         this.handler$cec000$lithium$tryShortcutFluidPushing(var1, var2, callbackinforeturnable, i, j, k, l, i1, j1);
         if (callbackinforeturnable.isCancelled()) {
            return callbackinforeturnable.getReturnValueZ();
         } else {
            boolean flag = this.method_5675();
            boolean flag1 = false;
            class06889 class06889 = class06889.L;
            int k1 = 0;
            class07218 class07218 = new class07218();

            for (int l1 = i; l1 < j; l1++) {
               for (int i2 = k; i2 < l; i2++) {
                  for (int j2 = i1; j2 < j1; j2++) {
                     class07218.N(l1, i2, j2);
                     class04688 class04688 = this.method_73183().method_8316(class07218);
                     if (class04688.N(var1)) {
                        double d1 = i2 + class04688.N(this.method_73183(), class07218);
                        if (d1 >= class00734.y) {
                           flag1 = true;
                           d0 = Math.max(d1 - class00734.y, d0);
                           if (flag) {
                              class06889 class06889x = class04688.L(this.method_73183(), class07218);
                              if (d0 < 0.4) {
                                 class06889x = class06889x.L(d0);
                              }

                              class06889 = class06889.i(class06889x);
                              k1++;
                           }
                        }
                     }
                  }
               }
            }

            if (class06889.M() > 0.0) {
               if (k1 > 0) {
                  class06889 = class06889.L(1.0 / k1);
               }

               if (!(this instanceof class08036)) {
                  class06889 = class06889.u();
               }

               class06889 class06889x = this.method_18798();
               class06889 = class06889.L(var2);
               double d2 = 0.003;
               if (Math.abs(class06889x.M) < 0.003 && Math.abs(class06889x.Z) < 0.003 && class06889.M() < 0.0045000000000000005) {
                  class06889 = class06889.u().L(0.0045000000000000005);
               }

               this.method_18799(this.method_18798().i(class06889));
            }

            this.field_5964.put(var1, d0);
            return flag1;
         }
      }
   }

   public boolean method_5777(class03530<class04651> var1) {
      return this.field_25599.contains(var1);
   }

   public void method_5724(float var1, class06889 var2) {
      this.handler$zzj000$baritone$moveRelativeHead(null);
      class06889 class06889 = method_18795(var2, var1, this.method_36454());
      this.method_18799(this.method_18798().i(class06889));
      this.handler$zzj000$baritone$moveRelativeReturn(null);
      this.handler$cfa000$nursultan$injectUpdateVelocity(var1, var2, null);
   }

   public void method_60949(class06889 var1, float var2, float var3) {
      this.method_5808(var1.M, var1.B, var1.Z, var2, var3);
   }

   public double method_5858(class07049 var1) {
      return this.method_5707(var1.method_73189());
   }

   public void method_5762(double var1, double var3, double var5) {
      if (Double.isFinite(var1) && Double.isFinite(var3) && Double.isFinite(var5)) {
         this.method_18799(this.method_18798().y(var1, var3, var5));
         this.field_64356 = true;
      }
   }

   public class00500 method_25936() {
      return this.method_73183().method_8320(this.method_23312());
   }

   public void method_60491(class06889 var1) {
      if (var1.m()) {
         this.method_5762(var1.M, var1.B, var1.Z);
      }
   }

   protected void method_5785() {
      this.field_6037 = true;
   }

   @Deprecated
   public final void method_64419(class07072 var1, float var2) {
      if (this.field_6002 instanceof class04782 class04782) {
         this.method_64397(class04782, var1, var2);
      }
   }

   @Deprecated
   protected class00500 method_43261() {
      return this.method_73183().method_8320(this.method_43260());
   }

   public final void method_63615(class06889 var1, float var2, float var3) {
      this.method_63618(var1);
      this.method_63617(var2, var3);
   }

   private void method_63617(float var1, float var2) {
      this.field_5982 = var1;
      this.field_6004 = var2;
   }

   public double method_23320() {
      return this.field_22467.B + this.field_18066;
   }

   public void method_60608(float var1, float var2) {
      this.method_36456(var1 % 360.0F);
      this.method_36457(class04995.N(var2, -90.0F, 90.0F) % 360.0F);
      this.field_5982 = this.method_36454();
      this.field_6004 = this.method_36455();
   }

   public void method_24203(double var1, double var3, double var5) {
      this.method_5808(var1, var3, var5, this.method_36454(), this.method_36455());
   }

   public double method_5649(double var1, double var3, double var5) {
      double d0 = this.method_23317() - var1;
      double d1 = this.method_23318() - var3;
      double d2 = this.method_23321() - var5;
      return d0 * d0 + d1 * d1 + d2 * d2;
   }

   public final int method_31479() {
      return this.field_22468.method_10260();
   }

   protected void method_63613() {
      this.method_63618(this.field_22467);
   }

   public void method_5808(double var1, double var3, double var5, float var7, float var8) {
      this.method_23327(var1, var3, var5);
      this.method_36456(var7);
      this.method_36457(var8);
      this.method_22862();
      this.method_23311();
   }

   public double method_5707(class06889 var1) {
      double d0 = this.method_23317() - var1.M;
      double d1 = this.method_23318() - var1.B;
      double d2 = this.method_23321() - var1.Z;
      return d0 * d0 + d1 * d1 + d2 * d2;
   }

   public void method_5694(class08036 var1) {
   }

   public boolean method_27298() {
      return this.method_5624() && !this.method_5799() && !this.method_7325() && !this.method_18276() && !this.method_5771() && this.method_5805();
   }

   protected static class06889 method_18795(class06889 var0, float var1, float var2) {
      double d0 = var0.B();
      if (d0 < constant$dml000$viafabricplus$fixVelocityEpsilon(1.0E-7)) {
         return class06889.L;
      } else {
         class06889 class06889 = (d0 > 1.0 ? var0.u() : var0).L((double)var1);
         float f = class04995.m(var2 * (float) (Math.PI / 180.0));
         float f1 = class04995.P(var2 * (float) (Math.PI / 180.0));
         return new class06889(class06889.M * f1 - class06889.Z * f, class06889.B, class06889.Z * f1 + class06889.M * f);
      }
   }

   public void method_5641(double var1, double var3, double var5, float var7, float var8) {
      this.method_30634(var1, var3, var5);
      this.method_60608(var7, var8);
   }

   public final int method_31477() {
      return this.field_22468.method_10263();
   }

   public void method_5796(boolean var1) {
      this.handler$dcg000$viafabricplus$cancelSwimming(var1, null);
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.handler$dnj001$viafabricplus$cancelSwimming(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.method_5729(4, var1);
      }
   }

   protected abstract void method_5652(class08329 var1);

   public void method_5855(int var1) {
      this.field_6011.N(field_6032, var1);
   }

   public float method_61415(float var1) {
      return var1 == 1.0F ? this.method_36454() : class04995.Z(var1, this.field_5982, this.method_36454());
   }

   public class06889 method_31166(float var1) {
      return this.method_5836(var1);
   }

   public final class06889 method_33571() {
      return new class06889(this.method_23317(), this.method_23320(), this.method_23321());
   }

   public void method_5716(class07049 var1, class07072 var2) {
      if (var1 instanceof class04770) {
         class06912.u.N((class04770)var1, this, var2);
      }
   }

   public boolean method_5786(class08329 var1) {
      if (this.field_26995 != null && !this.field_26995.y()) {
         return false;
      } else {
         String s = this.method_5653();
         if (s == null) {
            return false;
         } else {
            var1.N("id", s);
            this.method_5647(var1);
            return true;
         }
      }
   }

   public void method_5647(class08329 var1) {
      try {
         if (this.field_6034 != null) {
            var1.N("Pos", class06889.N, new class06889(this.field_6034.method_23317(), this.method_23318(), this.field_6034.method_23321()));
         } else {
            var1.N("Pos", class06889.N, this.method_73189());
         }

         var1.N("Motion", class06889.N, this.method_18798());
         var1.N("Rotation", class07109.Z, new class07109(this.method_36454(), this.method_36455()));
         var1.N("fall_distance", this.field_6017);
         var1.N("Fire", (short)this.field_5956);
         var1.N("Air", (short)this.method_5669());
         var1.N("OnGround", this.method_24828());
         var1.N("Invulnerable", this.field_6009);
         var1.N("PortalCooldown", this.field_6018);
         var1.N("UUID", class01487.N, this.method_5667());
         var1.y("CustomName", class03748.N, this.method_5797());
         if (this.method_5807()) {
            var1.N("CustomNameVisible", this.method_5807());
         }

         if (this.method_5701()) {
            var1.N("Silent", this.method_5701());
         }

         if (this.method_5740()) {
            var1.N("NoGravity", this.method_5740());
         }

         if (this.field_5958) {
            var1.N("Glowing", true);
         }

         int i = this.method_32312();
         if (i > 0) {
            var1.N("TicksFrozen", this.method_32312());
         }

         if (this.field_33758) {
            var1.N("HasVisualFire", this.field_33758);
         }

         if (!this.field_6029.isEmpty()) {
            var1.N("Tags", field_56631, List.copyOf(this.field_6029));
         }

         if (!this.field_58051.N()) {
            var1.N("data", class02837.L, this.field_58051);
         }

         this.m_handler$zcn000$fabric_data_attachment_api_v1$writeEntityAttachments_72(var1, null);
         this.method_5652(var1);
         if (this.method_5782()) {
            class08289 class08289 = var1.y("Passengers");

            for (class07049 class07049 : this.method_5685()) {
               class08329 class08329 = class08289.N();
               if (!class07049.method_5786(class08329)) {
                  class08289.y();
               }
            }

            if (class08289.L()) {
               var1.L("Passengers");
            }
         }
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Saving entity NBT");
         class07074 var4 = class07080.N("Entity being saved");
         this.method_5819(var4);
         throw new class07878(class07080);
      }
   }

   @class09956(
      N = "isPickable"
   )
   public boolean method_5863() {
      return false;
   }

   public final class06889 method_30950(float var1) {
      double d0 = class04995.u((double)var1, this.field_6014, this.method_23317());
      double d1 = class04995.u((double)var1, this.field_6036, this.method_23318());
      double d2 = class04995.u((double)var1, this.field_5969, this.method_23321());
      return new class06889(d0, d1, d2);
   }

   public boolean method_5662(class08329 var1) {
      return this.method_5765() ? false : this.method_5786(var1);
   }

   public boolean method_5727(double var1, double var3, double var5) {
      double d0 = this.method_23317() - var1;
      double d1 = this.method_23318() - var3;
      double d2 = this.method_23321() - var5;
      double d3 = d0 * d0 + d1 * d1 + d2 * d2;
      return this.method_5640(d3);
   }

   public class07211 method_58149() {
      return class07211.N(this.method_5828(1.0F));
   }

   public final class06889 method_5828(float var1) {
      return this.method_5631(this.method_5695(var1), this.method_5705(var1));
   }

   public float method_5705(float var1) {
      return this.method_61415(var1);
   }

   public float method_5695(float var1) {
      return this.method_61414(var1);
   }

   protected final class06889 method_18863(float var1, float var2) {
      return this.method_5631(var1 - 90.0F, var2);
   }

   public boolean method_5640(double var1) {
      double d0 = this.method_5829().N();
      if (Double.isNaN(d0)) {
         d0 = 1.0;
      }

      d0 *= 64.0 * field_5999;
      return var1 < d0 * d0;
   }

   public int method_5669() {
      return this.field_6011.N(field_6032);
   }

   @Nullable
   @Override
   public class00392 method_5797() {
      return this.field_6011.N(field_6027).orElse(null);
   }

   public float method_61414(float var1) {
      return var1 == 1.0F ? this.method_36455() : class04995.B(var1, this.field_6004, this.method_36455());
   }

   public int method_32312() {
      return this.field_6011.N(field_27858);
   }

   public boolean method_5643(class07072 var1) {
      return false;
   }

   public class07089 method_5745(double var1, float var3, boolean var4) {
      class06889 class06889xx = this.method_5836(var3);
      class06889 class06889x = this.method_5828(var3);
      class06889 class06889xx = class06889xx.y(class06889x.M * var1, class06889x.B * var1, class06889x.Z * var1);
      return this.method_73183()
         .N(new class05862(class06889xx, class06889xx, class05849.field_17559, var4 ? class05835.field_1347 : class05835.field_1348, this));
   }

   @class09956(
      N = "canBeHitByProjectile"
   )
   public boolean method_49108() {
      return this.method_5805() && this.method_5863();
   }

   public void method_5819(class07074 var1) {
      var1.N("Entity Type", () -> class07078.N(this.method_5864()) + " (" + this.getClass().getCanonicalName() + ")");
      var1.N("Entity ID", this.field_5986);
      var1.N("Entity Name", () -> this.method_74861());
      var1.N("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.method_23317(), this.method_23318(), this.method_23321()));
      var1.N(
         "Entity's Block location",
         class07074.N(this.method_73183(), class04995.N(this.method_23317()), class04995.N(this.method_23318()), class04995.N(this.method_23321()))
      );
      class06889 class06889 = this.method_18798();
      var1.N("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", class06889.M, class06889.B, class06889.Z));
      var1.N("Entity's Passengers", () -> this.method_5685().toString());
      var1.N("Entity's Vehicle", () -> String.valueOf(this.method_5854()));
   }

   public void method_5651(class08299 var1) {
      try {
         class06889 class06889x = var1.<class06889>N("Pos", class06889.N).orElse(class06889.L);
         class06889 class06889x = var1.<class06889>N("Motion", class06889.N).orElse(class06889.L);
         class07109 class07109 = var1.<class07109>N("Rotation", class07109.Z).orElse(class07109.N);
         this.method_18800(
            Math.abs(class06889x.M) > 10.0 ? 0.0 : class06889x.M,
            Math.abs(class06889x.B) > 10.0 ? 0.0 : class06889x.B,
            Math.abs(class06889x.Z) > 10.0 ? 0.0 : class06889x.Z
         );
         this.field_64356 = true;
         double d0 = 3.0000512E7;
         this.method_23327(
            class04995.N(class06889x.M, -3.0000512E7, 3.0000512E7),
            class04995.N(class06889x.B, -2.0E7, 2.0E7),
            class04995.N(class06889x.Z, -3.0000512E7, 3.0000512E7)
         );
         this.method_36456(class07109.z);
         this.method_36457(class07109.U);
         this.method_22862();
         this.method_5847(this.method_36454());
         this.method_5636(this.method_36454());
         this.field_6017 = var1.N("fall_distance", 0.0);
         this.field_5956 = var1.N("Fire", (short)0);
         this.method_5855(var1.N("Air", this.method_5748()));
         this.field_5952 = var1.N("OnGround", false);
         this.field_6009 = var1.N("Invulnerable", false);
         this.field_6018 = var1.N("PortalCooldown", 0);
         var1.<UUID>N("UUID", class01487.N).ifPresent(var1x -> {
            this.field_6021 = var1x;
            this.field_5981 = this.field_6021.toString();
         });
         if (!Double.isFinite(this.method_23317()) || !Double.isFinite(this.method_23318()) || !Double.isFinite(this.method_23321())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite(this.method_36454()) && Double.isFinite(this.method_36455())) {
            this.method_23311();
            this.method_5710(this.method_36454(), this.method_36455());
            this.method_5665(var1.<class00392>N("CustomName", class03748.N).orElse(null));
            this.method_5880(var1.N("CustomNameVisible", false));
            this.method_5803(var1.N("Silent", false));
            this.method_5875(var1.N("NoGravity", false));
            this.method_5834(var1.N("Glowing", false));
            this.method_32317(var1.N("TicksFrozen", 0));
            this.field_33758 = var1.N("HasVisualFire", false);
            this.field_58051 = var1.<class02837>N("data", class02837.L).orElse(class02837.N);
            this.field_6029.clear();
            var1.<Collection<? extends E>>N("Tags", field_56631).ifPresent(this.field_6029::addAll);
            this.m_handler$zcn000$fabric_data_attachment_api_v1$readEntityAttachments_78(var1, null);
            this.method_5749(var1);
            if (this.method_5638()) {
               this.method_23311();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Loading entity NBT");
         class07074 class07074 = class07080.N("Entity being loaded");
         this.method_5819(class07074);
         throw new class07878(class07080);
      }
   }

   @Nullable
   protected final String method_5653() {
      class07078<?> class07078 = this.method_5864();
      class01894 class01894 = class07078.N(class07078);
      return !class07078.N() ? null : class01894.toString();
   }

   public final class06889 method_5631(float var1, float var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dnh000$viafabricplus$revertCalculation(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class06889)callbackinforeturnable.getReturnValue();
      } else {
         float f = var1 * (float) (Math.PI / 180.0);
         float f1 = -var2 * (float) (Math.PI / 180.0);
         float f2 = class04995.P(f1);
         float f3 = class04995.m(f1);
         float f4 = class04995.P(f);
         float f5 = class04995.m(f);
         return new class06889(f3 * f4, -f5, f2 * f4);
      }
   }

   public final float method_5751() {
      return this.field_18066;
   }

   @Deprecated
   public final boolean method_64420(class07072 var1, float var2) {
      return this.field_6002 instanceof class04782 class04782 ? this.method_64397(class04782, var1, var2) : this.method_5643(var1);
   }

   public boolean method_5807() {
      return this.field_6011.N(field_5975);
   }

   public final class06889 method_5836(float var1) {
      double d0 = class04995.u((double)var1, this.field_6014, this.method_23317());
      double d1 = class04995.u((double)var1, this.field_6036, this.method_23318()) + this.method_5751();
      double d2 = class04995.u((double)var1, this.field_5969, this.method_23321());
      return new class06889(d0, d1, d2);
   }

   public final class06889 method_18864(float var1) {
      return this.method_18863(this.method_5695(var1), this.method_5705(var1));
   }

   @Override
   public UUID method_5667() {
      return this.field_6021;
   }

   public void method_5636(float var1) {
   }

   public void method_5847(float var1) {
   }

   @Nullable
   public class00717 method_71764(class04782 var1, class06584 var2, class06889 var3) {
      if (var2.R()) {
         return null;
      } else {
         class00717 class00717 = new class00717(var1, this.method_23317() + var3.M, this.method_23318() + var3.B, this.method_23321() + var3.Z, var2);
         class00717.L();
         var1.method_8649(class00717);
         return class00717;
      }
   }

   private boolean method_71765(class08036 var1, class07050 var2, class06584 var3, class07079 var4) {
      for (class07085 class07085 : class07085.field_54086) {
         class06584 class06584 = var4.method_6118(class07085);
         class08725 class08725 = class06584.method_58694(class02484.o);
         if (class08725 != null && class08725.U() && (!class07323.N(class06584, class02523.I) || var1.method_68878())) {
            var3.N(1, var1, var2.N());
            class06889 class06889 = this.field_18065.u().N(class03831.field_47743);
            var4.N(class07085, class06584.E);
            this.method_32875(class01194.H, var1);
            this.method_43077(class08725.E().N());
            if (this.method_73183() instanceof class04782 class04782) {
               this.method_71764(class04782, class06584, class06889);
               class06912.S.N((class04770)var1, class06584, var4);
            }

            return true;
         }
      }

      return false;
   }

   @Nullable
   public class00717 method_5706(class04782 var1, class07310 var2) {
      return this.method_5699(var1, new class06584(var2), 0.0F);
   }

   public void method_5665(@Nullable class00392 var1) {
      this.field_6011.N(field_6027, Optional.ofNullable(var1));
   }

   @Nullable
   public class00717 method_5699(class04782 var1, class06584 var2, float var3) {
      return this.method_71764(var1, var2, new class06889(0.0, var3, 0.0));
   }

   public boolean method_70988(@Nullable class08036 var1) {
      List<class02607> list = class02607.Z(this);
      boolean flag = !list.isEmpty();
      if (this instanceof class02607 var4 && var4.g_()) {
         var4.yU();
         flag = true;
      }

      for (class02607 var5 : list) {
         var5.yU();
      }

      if (flag) {
         this.method_32875(class01194.H, var1);
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      if (var1 == class02484.B) {
         return method_66651(var1, this.method_5797());
      } else {
         return var1 == class02484.y ? method_66651(var1, this.field_58051) : null;
      }
   }

   public class07082 method_5688(class08036 var1, class07050 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dgo000$viafabricplus$removeLeashActions(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         if (!this.method_73183().method_8608()
            && var1.method_21823()
            && this instanceof class02607 class02607xx
            && class02607xx.g()
            && this.method_5805()
            && !(this instanceof class07438 class07438 && class07438.method_6109())) {
            List<class02607> list = class02607.N(this, var1x -> var1x.yW() == var1);
            if (!list.isEmpty()) {
               boolean flag = false;

               for (class02607 class02607x : list) {
                  if (class02607x.R(this)) {
                     class02607x.N(this, true);
                     flag = true;
                  }
               }

               if (flag) {
                  this.method_73183().N(class01194.n, this.method_24515(), class01164.N(var1));
                  this.method_43077(class04909.TL);
                  return class07082.y.y();
               }
            }
         }

         class06584 class06584x = var1.method_5998(var2);
         if (class06584x.N(class06570.vr) && this.method_70984(var1)) {
            class06584x.N(1, var1, var2);
            return class07082.N;
         } else if (this instanceof class07079 class07079
            && class06584x.N(class06570.vr)
            && class07079.L(var1)
            && !var1.method_21823()
            && this.method_71765(var1, var2, class06584x, class07079)) {
            return class07082.N;
         } else {
            if (this.method_5805() && this instanceof class02607 class02607xx) {
               if (class02607xx.yW() == var1) {
                  if (!this.method_73183().method_8608()) {
                     if (var1.method_56992()) {
                        class02607xx.yE();
                     } else {
                        class02607xx.yU();
                     }

                     this.method_32875(class01194.b, var1);
                     this.method_43077(class04909.Ty);
                  }

                  return class07082.N.y();
               }

               class06584 class06584x = var1.method_5998(var2);
               if (class06584x.N(class06570.Gr) && !(class02607xx.yW() instanceof class08036)) {
                  if (this.method_73183().method_8608()) {
                     return this.redirect$dgo001$viafabricplus$swingHand();
                  }

                  if (class02607xx.R(var1)) {
                     if (class02607xx.g_()) {
                        class02607xx.yU();
                     }

                     class02607xx.N(var1, true);
                     this.method_43077(class04909.TL);
                     class06584x.B(1);
                     return class07082.y;
                  }
               }
            }

            return class07082.i;
         }
      }
   }

   protected boolean method_5638() {
      return true;
   }

   public final void method_5834(boolean var1) {
      this.field_5958 = var1;
      this.method_5729(6, this.method_5851());
   }

   public boolean method_70984(@Nullable class08036 var1) {
      boolean flag = this.method_70988(var1);
      if (flag) {
         class07299 class07299 = this.method_73183();
         if (class07299 instanceof class04782) {
            ((class04782)class07299).N(null, this.method_24515(), class04909.wd, var1 != null ? var1.method_5634() : this.method_5634());
         }
      }

      return flag;
   }

   public void method_5880(boolean var1) {
      this.field_6011.N(field_5975, var1);
   }

   @Nullable
   public class00717 method_5775(class04782 var1, class06584 var2) {
      return this.method_5699(var1, var2, 0.0F);
   }

   public void method_32317(int var1) {
      this.field_6011.N(field_27858, var1);
   }

   protected abstract void method_5749(class08299 var1);

   public boolean method_5757() {
      if (this.field_5960) {
         return false;
      } else {
         float f = this.field_18065.N() * 0.8F;
         class00734 class00734 = class00734.N(this.method_33571(), f, 1.0E-6, f);
         return class07209.method_29715(class00734)
            .anyMatch(
               var2x -> {
                  class00500 class00500 = this.method_73183().method_8320(var2x);
                  return !class00500.P()
                     && class00500.z(this.method_73183(), var2x)
                     && class00389.L(class00500.M(this.method_73183(), var2x).method_66507(var2x), class00389.N(class00734), class07003.Z);
               }
            );
      }
   }

   @class09956(
      N = "canBeCollidedWith"
   )
   public boolean method_30948(@Nullable class07049 var1) {
      return false;
   }

   public final boolean method_66245() {
      return this.method_66233() != null && this.method_66233().method_66270();
   }

   protected void method_5793(class07049 var1) {
      if (var1.method_5854() == this) {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      } else {
         if (this.field_5979.size() == 1 && this.field_5979.get(0) == var1) {
            this.field_5979 = ImmutableList.of();
         } else {
            this.field_5979 = this.field_5979.stream().filter(var1x -> var1x != var1).collect(ImmutableList.toImmutableList());
         }

         var1.field_5951 = 60;
      }
   }

   public void method_66246(class06889 var1, float var2, float var3) {
      this.method_73092(Optional.of(var1), Optional.of(var2), Optional.of(var3));
   }

   @Nullable
   public class07062 method_35049() {
      return this.field_26995;
   }

   @class09956(
      N = "canCollideWith"
   )
   public boolean method_30949(class07049 var1) {
      return var1.method_30948(this) && !this.method_5794(var1);
   }

   public final void method_24201(class07049 var1) {
      if (this.method_5626(var1)) {
         this.method_5865(var1, class07049::method_5814);
      }
   }

   protected class06889 method_52533(class07049 var1, class01325 var2, float var3) {
      return method_55665(this, var1, var2.u());
   }

   protected boolean method_5860(class07049 var1) {
      return !this.method_5715() && this.field_5951 <= 0;
   }

   protected boolean method_5818(class07049 var1) {
      return this.field_5979.isEmpty();
   }

   protected void method_5865(class07049 var1, class07067 var2) {
      class06889 class06889x = this.method_52538(var1);
      class06889 class06889x = this.redirect$dhp000$viafabricplus$use1_20_1RidingOffset(var1, this);
      var2.accept(var1, class06889x.M - class06889x.M, class06889x.B - class06889x.B, class06889x.Z - class06889x.Z);
   }

   public boolean method_5715() {
      return this.method_5795(1);
   }

   public boolean method_5709() {
      return this instanceof class07438;
   }

   public final class03810 method_56072() {
      return this.field_18065.u();
   }

   private Stream method_31484() {
      if (this.field_5979.isEmpty()) {
         return Stream.empty();
      } else {
         ArrayList arraylist = new ArrayList();
         this.addPassengersDeep(arraylist);
         return arraylist.stream();
      }
   }

   public void method_29239() {
      if (this.field_6034 != null) {
         class07049 class07049 = this.field_6034;
         this.field_6034 = null;
         class07049.method_5793(this);
         class07062 class07062 = this.method_35049();
         if (class07062 == null || class07062.N()) {
            this.method_73183().N(this, class01194.T, class07049.field_22467);
         }
      }
   }

   public boolean method_5873(class07049 var1, boolean var2, boolean var3) {
      if (var1 == this.field_6034) {
         return false;
      } else if (!var1.method_48921()) {
         return false;
      } else if (!this.method_73183().method_8608() && !var1.field_5961.N()) {
         return false;
      } else {
         for (class07049 class07049 = var1; class07049.field_6034 != null; class07049 = class07049.field_6034) {
            if (class07049.field_6034 == this) {
               return false;
            }
         }

         if (var2 || this.method_5860(var1) && var1.method_5818(this)) {
            if (this.method_5765()) {
               this.method_5848();
            }

            this.method_18380(class01312.field_18076);
            this.field_6034 = var1;
            this.field_6034.method_5627(this);
            if (var3) {
               this.method_73183().N(this, class01194.j, this.field_6034.field_22467);
               var1.method_31484().filter(var0 -> var0 instanceof class04770).forEach(var0 -> class06912.x.N((class04770)var0));
            }

            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean method_48921() {
      return true;
   }

   public void method_5842() {
      this.method_18799(class06889.L);
      this.method_5773();
      if (this.method_5765()) {
         this.method_5854().method_24201(this);
      }
   }

   protected static class06889 method_55665(class07049 var0, class07049 var1, class03810 var2) {
      int i = var0.method_5685().indexOf(var1);
      return var2.L(class03831.field_47743, i, var0.field_6031);
   }

   @Nullable
   public class08382 method_66233() {
      return null;
   }

   public final boolean method_5804(class07049 var1) {
      return this.method_5873(var1, false, true);
   }

   public final void method_73092(Optional<class06889> var1, Optional<Float> var2, Optional<Float> var3) {
      class08382 class08382 = this.method_66233();
      if (class08382 != null) {
         class08382.method_66267(var1.orElse(class08382.method_66265()), var2.orElse(class08382.method_66268()), var3.orElse(class08382.method_66269()));
      } else {
         var1.ifPresent(this::method_33574);
         var2.ifPresent(var1x -> this.method_36456(var1x % 360.0F));
         var3.ifPresent(var1x -> this.method_36457(var1x % 360.0F));
      }
   }

   public final void method_73095(class06889 var1) {
      this.method_73092(Optional.of(var1), Optional.empty(), Optional.empty());
   }

   @Nullable
   public class07049 method_31483() {
      return this.field_5979.isEmpty() ? null : (class07049)this.field_5979.get(0);
   }

   public void method_5683(float var1, int var2) {
      this.method_5847(var1);
   }

   public class06889 method_55668(class07049 var1) {
      return this.method_56072().y(class03831.field_47744, 0, this.field_6031);
   }

   public class06889 method_75117() {
      return this.method_5631(this.method_36455(), this.method_5791());
   }

   protected void method_5627(class07049 var1) {
      if (var1.method_5854() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (this.field_5979.isEmpty()) {
            this.field_5979 = ImmutableList.of(var1);
         } else {
            ArrayList arraylist = Lists.newArrayList(this.field_5979);
            if (!this.method_73183().method_8608() && var1 instanceof class08036 && !(this.method_31483() instanceof class08036)) {
               arraylist.add(0, var1);
            } else {
               arraylist.add(var1);
            }

            this.field_5979 = ImmutableList.copyOf(arraylist);
         }
      }
   }

   public class06889 method_52538(class07049 var1) {
      class06889 class06889 = this.method_73189();
      float f = 1.0F;
      class01325 class01325 = this.field_18065;
      return class06889.i(this.redirect$dhp000$viafabricplus$getPassengerRidingPos1_20_1(this, var1, class01325, f));
   }

   public class06889 method_40123(class06581 var1) {
      if (!(this instanceof class08036 class08036)) {
         return class06889.L;
      } else {
         boolean flag = class08036.method_6079().N(var1) && !class08036.method_6047().N(var1);
         class07070 class07070 = flag ? class08036.method_6068().N() : class08036.method_6068();
         return this.method_5631(0.0F, this.method_36454() + (class07070 == class07070.field_6183 ? 80 : -80)).L(0.5);
      }
   }

   public class06889 method_5720() {
      return this.method_5631(this.method_36455(), this.method_36454());
   }

   public final void method_73094(float var1, float var2) {
      this.method_73092(Optional.empty(), Optional.of(var1), Optional.of(var2));
   }

   public float method_5871() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dml000$viafabricplus$expandHitBox(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueF() : 0.0F;
   }

   public boolean method_5626(class07049 var1) {
      return this.field_5979.contains(var1);
   }

   public float method_5791() {
      return 0.0F;
   }

   public void method_5800(class04782 var1, class00672 var2) {
      this.method_20803(this.field_5956 + 1);
      if (this.field_5956 == 0) {
         this.method_5639(8.0F);
      }

      this.method_64397(var1, this.method_48923().L(), 5.0F);
   }

   public void method_5711(byte var1) {
      switch (var1) {
         case 53:
            class01451.N(this);
      }
   }

   public void method_5750(class06889 var1) {
      this.method_18799(var1);
   }

   public boolean method_21750() {
      return this.method_5715();
   }

   public void method_48922(class07072 var1) {
   }

   public boolean method_5767() {
      return this.method_5795(5);
   }

   public boolean method_21749() {
      return this.method_5715();
   }

   public void method_5728(boolean var1) {
      this.method_5729(3, var1);
   }

   public void method_42147(BiConsumer<class01178<?>, class04782> var1) {
   }

   public float method_32313() {
      int i = this.method_32315();
      return (float)Math.min(this.method_32312(), i) / i;
   }

   public void method_5879(float var1) {
   }

   public boolean method_21751() {
      return this.method_5715();
   }

   public void method_5700(boolean var1, class07209 var2) {
      method_67123(this, var1, var2);
   }

   public final boolean method_5722(@Nullable class07049 var1) {
      return var1 == null ? false : this == var1 || this.method_61416(var1) || var1.method_61416(this);
   }

   protected static void method_67123(class07049 var0, boolean var1, class07209 var2) {
      class06889 class06889 = var0.method_18798();
      double d0;
      if (var1) {
         d0 = Math.max(-0.9, class06889.B - 0.03);
      } else {
         d0 = Math.min(1.8, class06889.B + 0.1);
      }

      var0.method_18800(class06889.M, d0, class06889.Z);
      method_66250(var0.field_6002, var2);
   }

   public boolean method_5874(class04782 var1, class07438 var2, class07072 var3) {
      return true;
   }

   @Override
   public String method_5820() {
      return this.field_5981;
   }

   public boolean method_21752() {
      return this.method_5715();
   }

   public void method_5764(boolean var1) {
      method_67124(this, var1);
   }

   public class06889 method_5663() {
      return class06889.N(this.method_5802());
   }

   public void method_70983() {
      if (this.method_18798().y() > -0.5 && this.field_6017 > 1.0) {
         this.field_6017 = 1.0;
      }
   }

   public void method_60697(class02234 var1, class07209 var2) {
      if (this.method_30230()) {
         this.method_30229();
      } else {
         if (this.field_51994 == null || !this.field_51994.N(var1)) {
            this.field_51994 = new class02224(var1, var2.method_10062());
         } else if (!this.field_51994.i()) {
            this.field_51994.N(var2.method_10062());
            this.field_51994.N(true);
         }
      }
   }

   public class07109 method_5802() {
      return new class07109(this.method_36455(), this.method_36454());
   }

   public boolean method_5645(@Nullable class06639 var1) {
      return this.method_5781() != null ? this.method_5781().N(var1) : false;
   }

   public void method_5660(boolean var1) {
      this.method_5729(1, var1);
   }

   public boolean method_49693() {
      return this.method_5864().N(class01217.T);
   }

   public boolean method_20448() {
      return this.method_20232() && !this.method_5799();
   }

   public boolean method_32314() {
      return this.method_32312() >= this.method_32315();
   }

   protected static void method_66250(class07299 var0, class07209 var1) {
      if (var0 instanceof class04782 class04782) {
         for (int i = 0; i < 2; i++) {
            class04782.method_65096(
               class07107.NT,
               var1.method_10263() + var0.field_9229.U(),
               var1.method_10264() + 1,
               var1.method_10260() + var0.field_9229.U(),
               1,
               0.0,
               0.0,
               0.0,
               1.0
            );
            class04782.method_65096(
               class07107.u,
               var1.method_10263() + var0.field_9229.U(),
               var1.method_10264() + 1,
               var1.method_10260() + var0.field_9229.U(),
               1,
               0.0,
               0.01,
               0.0,
               0.2
            );
         }
      }
   }

   protected static void method_67124(class07049 var0, boolean var1) {
      class06889 class06889 = var0.method_18798();
      double d0;
      if (var1) {
         d0 = Math.max(-0.3, class06889.B - 0.03);
      } else {
         d0 = Math.min(0.7, class06889.B + 0.06);
      }

      var0.method_18800(class06889.M, d0, class06889.Z);
      var0.method_38785();
   }

   protected boolean method_5795(int var1) {
      return (this.field_6011.N(field_5990) & 1 << var1) != 0;
   }

   @Nullable
   public class07049 method_5731(class01032 var1) {
      if (this.method_73183() instanceof class04782 class04782 && !this.method_31481()) {
         class04782 class04782x = var1.y();
         boolean flag = class04782x.method_27983() != class04782.method_27983();
         if (!var1.B()) {
            this.method_5848();
         }

         return flag
            ? this.m_wrapOperation$zec000$fabric_entity_events_v1$afterWorldChanged_74(
               this,
               class04782,
               class04782x,
               var1,
               var0 -> {
                  WrapOperationRuntime.checkArgumentCount(
                     var0, 4, "[net.minecraft.class_1297, net.minecraft.class_3218, net.minecraft.class_3218, net.minecraft.class_5454]"
                  );
                  return ((class07049)var0[0]).method_64614((class04782)var0[1], (class04782)var0[2], (class01032)var0[3]);
               }
            )
            : this.method_64611(class04782, var1);
      } else {
         return null;
      }
   }

   public boolean method_5822(boolean var1) {
      return (var1 || !this.method_5765()) && this.method_5805();
   }

   public boolean method_61113(class07299 var1, class07299 var2) {
      if (var1.method_27983() == class07299.field_25181 && var2.method_27983() == class07299.field_25179) {
         for (class07049 class07049 : this.method_5685()) {
            if (class07049 instanceof class04770 && !((class04770)class07049).field_13969) {
               return false;
            }
         }
      }

      return true;
   }

   public final boolean method_36361() {
      return this.field_5958;
   }

   public boolean method_52534() {
      return !this.method_5864().N(class01217.b);
   }

   public boolean method_20232() {
      return this.method_41328(class01312.field_18079);
   }

   public boolean method_5851() {
      return this.method_73183().method_8608() ? this.method_5795(6) : this.field_5958;
   }

   public boolean method_5756(class08036 var1) {
      if (var1.method_7325()) {
         return false;
      } else {
         class00502 class00502 = this.method_5781();
         return class00502 != null && var1 != null && var1.method_5781() == class00502 && class00502.z() ? false : this.method_5767();
      }
   }

   public void method_5648(boolean var1) {
      this.method_5729(5, var1);
   }

   public int method_32315() {
      return 140;
   }

   protected boolean method_61416(class07049 var1) {
      return this.method_5645(var1.method_5781());
   }

   public boolean method_5655() {
      return this.field_6009;
   }

   protected void method_30076() {
      this.method_31745(class07062.field_27002);
      if (this instanceof class02607 class02607) {
         class02607.yE();
      }

      if (this instanceof class00042 class00042 && this.field_6002 instanceof class04782 var2) {
         var2.method_70636().L(class00042);
      }
   }

   protected final boolean method_64421(class07072 var1) {
      return this.method_31481()
         || this.field_6009 && !var1.N(class03696.u) && !var1.B()
         || var1.N(class03696.Z) && this.method_5753()
         || var1.N(class03696.W) && this.method_5864().N(class01217.s);
   }

   private static class00392 method_5856(class00392 var0) {
      class05216 class05216 = var0.y().y(var0.method_10866().N(null));

      for (class00392 class00392 : var0.method_10855()) {
         class05216.y(method_5856(class00392));
      }

      return class05216;
   }

   public void method_5844(class00500 var1, class06889 var2) {
      this.method_38785();
      this.redirect$dcg000$viafabricplus$prioritySlowestMovementMultiplier(this, var2);
   }

   @Override
   public class00392 method_5477() {
      class00392 class00392 = this.method_5797();
      return class00392 != null ? method_5856(class00392) : this.method_23315();
   }

   public void method_5878(class07049 var1) {
      try (class04495 class04495 = new class04495(this.method_71370(), field_60355)) {
         class08303 class08303 = class08303.N(class04495, var1.method_56673());
         var1.method_5647(class08303);
         this.method_5651(class08308.N(class04495, this.method_56673(), class08303.y()));
      }

      this.field_6018 = var1.field_6018;
      this.field_51994 = var1.field_51994;
   }

   public void method_61412(class08716 var1, Set<class06681> var2) {
      this.method_74862(class08716.N(this), var1, var2);
   }

   protected void method_5632(double var1, double var3, double var5) {
      class07209 class07209 = class07209.method_49637(var1, var3, var5);
      class06889 class06889x = new class06889(var1 - class07209.method_10263(), var3 - class07209.method_10264(), var5 - class07209.method_10260());
      class07218 class07218 = new class07218();
      class07211 class07211x = class07211.field_11036;
      double d0 = Double.MAX_VALUE;

      for (class07211 class07211x : new class07211[]{
         class07211.field_11043, class07211.field_11035, class07211.field_11039, class07211.field_11034, class07211.field_11036
      }) {
         class07218.N(class07209, class07211x);
         if (!this.method_73183().method_8320(class07218).W(this.method_73183(), class07218)) {
            double d1 = class06889x.N(class07211x.z());
            double d2 = class07211x.i() == class07212.field_11056 ? 1.0 - d1 : d1;
            if (d2 < d0) {
               d0 = d2;
               class07211x = class07211x;
            }
         }
      }

      float f = this.field_5974.z() * 0.2F + 0.1F;
      float f1 = class07211x.i().N();
      class06889 class06889x = this.method_18798().L(0.75);
      if (class07211x.z() == class07185.field_11048) {
         this.method_18800(f1 * f, class06889x.B, class06889x.Z);
      } else if (class07211x.z() == class07185.field_11052) {
         this.method_18800(class06889x.M, f1 * f, class06889x.Z);
      } else if (class07211x.z() == class07185.field_11051) {
         this.method_18800(class06889x.M, class06889x.B, f1 * f);
      }
   }

   public void method_5719(class07049 var1) {
      this.method_5808(var1.method_23317(), var1.method_23318(), var1.method_23321(), var1.method_36454(), var1.method_36455());
   }

   private class07049 method_64611(class04782 var1, class01032 var2) {
      for (class07049 class07049 : this.method_5685()) {
         class07049.method_5731(this.method_64613(var2, class07049));
      }

      class04643 class04643 = class08700.N();
      class04643.N("teleportSameDimension");
      this.method_61412(class08716.N(var2), var2.Z());
      if (!var2.B()) {
         this.method_64612(var2);
      }

      var2.z().onTransition(this);
      class04643.L();
      return this;
   }

   private class01032 method_64613(class01032 var1, class07049 var2) {
      float f = var1.i() + (var1.Z().contains(class06681.field_12401) ? 0.0F : var2.method_36454() - this.method_36454());
      float f1 = var1.R() + (var1.Z().contains(class06681.field_12397) ? 0.0F : var2.method_36455() - this.method_36455());
      class06889 class06889x = var2.method_73189().u(this.method_73189());
      class06889 class06889x = var1.L()
         .y(
            var1.Z().contains(class06681.field_12400) ? 0.0 : class06889x.N(),
            var1.Z().contains(class06681.field_12398) ? 0.0 : class06889x.y(),
            var1.Z().contains(class06681.field_12403) ? 0.0 : class06889x.L()
         );
      return var1.N(class06889x).N(f, f1).N();
   }

   @Nullable
   private class07049 method_64614(class04782 var1, class04782 var2, class01032 var3) {
      List<class07049> list = this.method_5685();
      ArrayList arraylist = new ArrayList(list.size());
      this.method_5772();

      for (class07049 class07049xx : list) {
         class07049 class07049x = class07049xx.method_5731(this.method_64613(var3, class07049xx));
         if (class07049x != null) {
            arraylist.add(class07049x);
         }
      }

      class04643 class04643 = class08700.N();
      class04643.N("teleportCrossDimension");
      class07049 class07049x = this.method_5864().N(var2, class06113.field_52445);
      if (class07049x == null) {
         class04643.L();
         return null;
      } else {
         class07049x.method_5878(this);
         this.method_30076();
         class07049x.method_74862(class08716.N(this), class08716.N(var3), var3.Z());
         var2.method_18769(class07049x);
         Iterator iterator = arraylist.iterator();

         while (iterator.hasNext()) {
            ((class07049)iterator.next()).method_5873(class07049x, true, false);
         }

         var2.method_14197();
         var3.z().onTransition(class07049x);
         this.method_70666(var3, var1);
         class04643.L();
         return class07049x;
      }
   }

   public boolean method_5732() {
      return true;
   }

   public class01042 method_56673() {
      return this.method_73183().method_30349();
   }

   public void method_74862(class08716 var1, class08716 var2, Set<class06681> var3) {
      class08716 class08716 = class08716.N(var1, var2, var3);
      this.method_23327(class08716.N().M, class08716.N().B, class08716.N().Z);
      this.method_36456(class08716.L());
      this.method_5847(class08716.L());
      this.method_36457(class08716.u());
      this.method_23311();
      this.method_22862();
      this.method_18799(class08716.y());
      this.method_71965();
   }

   public boolean method_5779(class07049 var1) {
      return this == var1;
   }

   protected void method_70666(class01032 var1, class04782 var2) {
      for (class04770 class04770 : List.copyOf(var2.method_18456())) {
         if (class04770.method_14242() == this) {
            class04770.method_61275(var1);
            class04770.method_14224(null);
         }
      }
   }

   private void method_64612(class01032 var1) {
      class07438 class07438 = this.method_5642();

      for (class07049 class07049 : this.method_5736()) {
         if (class07049 instanceof class04770 class04770) {
            if (class07438 != null && class04770.method_5628() == class07438.method_5628()) {
               class04770.field_13987.method_14364(class08063.N(this.method_5628(), class08716.N(var1), var1.Z(), this.field_5952));
            } else {
               class04770.field_13987.method_14364(class08063.N(this.method_5628(), class08716.N(this), Set.of(), this.field_5952));
            }
         }
      }
   }

   public boolean method_5698(class07049 var1) {
      return false;
   }

   public class04489 method_71370() {
      return new class10711(this);
   }

   protected class00392 method_23315() {
      return this.field_5961.M();
   }

   public void method_5684(boolean var1) {
      this.field_6009 = var1;
   }

   private static double redirect$dbe000$viafabricplus$alwaysSortYXZ(double var0) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2) ? Double.MAX_VALUE : Math.abs(var0);
   }

   public class07049(class07078<?> var1, class07299 var2) {
      super();
      this.field_5986 = field_5978.incrementAndGet();
      this.field_5979 = ImmutableList.of();
      this.field_18276 = class06889.L;
      this.field_6005 = field_6025;
      this.field_17046 = class06889.L;
      this.field_6003 = 1.0F;
      this.field_5974 = class06069.u();
      this.field_5964 = new Object2DoubleArrayMap(2);
      this.field_25599 = new HashSet<>();
      this.field_5953 = true;
      this.field_26996 = class01113.N;
      this.field_38931 = new class04465();
      this.field_6021 = class04995.N(this.field_5974);
      this.field_5981 = this.field_6021.toString();
      this.field_6029 = Sets.newHashSet();
      this.field_5993 = new double[]{0.0, 0.0, 0.0};
      this.field_44784 = Optional.empty();
      this.field_44873 = false;
      this.field_64357 = class06889.L;
      this.field_47742 = null;
      this.field_54947 = new ArrayDeque<>(100);
      this.field_57579 = new ObjectArrayList();
      this.field_54948 = new LongOpenHashSet();
      this.field_56630 = new class08418();
      this.field_58051 = class02837.N;
      this.field_5961 = var1;
      this.field_6002 = var2;
      this.field_18065 = var1.E();
      this.field_22467 = class06889.L;
      this.field_22468 = class07209.field_10980;
      this.field_35101 = class07321.i;
      class04293 class04293 = new class04293(this);
      class04293.N(field_5990, (byte)0);
      class04293.N(field_6032, this.method_5748());
      class04293.N(field_5975, false);
      class04293.N(field_6027, Optional.empty());
      class04293.N(field_5962, false);
      class04293.N(field_5995, false);
      class04293.N(field_18064, class01312.field_18076);
      class04293.N(field_27858, 0);
      this.method_5693(class04293);
      this.field_6011 = class04293.N();
      this.method_5814(0.0, 0.0, 0.0);
      this.field_18066 = this.field_18065.L();
      this.handler$bnk000$lithium$useReferenceArraySet(null);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class07049 ? ((class07049)var1).field_5986 == this.field_5986 : false;
   }

   @Override
   public String toString() {
      String s = this.method_73183() == null ? "~NULL~" : this.method_73183().toString();
      return this.field_26995 != null
         ? String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f, removed=%s]",
            this.getClass().getSimpleName(),
            this.method_74861(),
            this.field_5986,
            s,
            this.method_23317(),
            this.method_23318(),
            this.method_23321(),
            this.field_26995
         )
         : String.format(
            Locale.ROOT,
            "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
            this.getClass().getSimpleName(),
            this.method_74861(),
            this.field_5986,
            s,
            this.method_23317(),
            this.method_23318(),
            this.method_23321()
         );
   }

   @Override
   public int hashCode() {
      return this.field_5986;
   }

   private void handler$zzj000$baritone$moveRelativeHead(CallbackInfo var1) {
      if (class04453.class.isInstance(this) && BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)this) != null) {
         this.motionUpdateRotationEvent = new RotationMoveEvent(Type.MOTION_UPDATE, this.field_6031, this.field_5965);
         BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)this).getGameEventHandler().onPlayerRotationMove(this.motionUpdateRotationEvent);
         this.field_6031 = this.motionUpdateRotationEvent.getYaw();
         this.field_5965 = this.motionUpdateRotationEvent.getPitch();
      }
   }

   private class07041 redirect$dgo001$viafabricplus$swingHand() {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_9) ? class07082.N : class07082.L;
   }

   private List localvar$bnp000$lithium$collectEntities(List var1, LocalBooleanRef var2) {
      if (var2.get()) {
         var2.set(false);
         ArrayList arraylist = var1 instanceof ArrayList ? (ArrayList)var1 : new ArrayList(var1);
         LithiumEntityCollisions.appendEntityCollisions(arraylist, this.method_73183(), this, this.method_5829());
         return arraylist;
      } else {
         return var1;
      }
   }

   public void viaFabricPlus$setInLoadedChunkAndShouldTick(boolean var1) {
      this.viaFabricPlus$isInLoadedChunkAndShouldTick = var1;
   }

   private class07105 m_modifyExpressionValue$zkp000$fabric_particles_v1$modifyBlockStateParticleEffect_71(class07105 var1, class07209 var2) {
      var1.fabric_setBlockPos(var2);
      return var1;
   }

   private void m_handler$zcn000$fabric_data_attachment_api_v1$writeEntityAttachments_72(class08329 var1, CallbackInfo var2) {
      this.fabric_writeAttachmentsToNbt(var1);
   }

   private void handler$bob000$lithium$onPositionChanged(double var1, double var3, double var5, CallbackInfo var7) {
      this.lithium$OnFeetBlockCacheDeleted();
   }

   private void handler$bob000$lithium$onBlockCached(CallbackInfoReturnable var1) {
      this.lithium$OnFeetBlockCacheSet(this.field_47742);
   }

   private void redirect$bnk000$lithium$clearIfNotEmpty(Set var1) {
      if (!var1.isEmpty()) {
         var1.clear();
      }
   }

   private float redirect$dnj000$viafabricplus$addMagicOffset(class04688 var1, class07290 var2, class07209 var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2) ? var1.N(var2, var3) + 0.11111111F : var1.N(var2, var3);
   }

   private static double constant$dml000$viafabricplus$fixVelocityEpsilon(double var0) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2) ? 1.0E-4 : var0;
   }

   private void handler$dme000$viafabricplus$modifyPosWithYOffset(float var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_4)) {
         int i = class04995.N(this.field_22467.M);
         int j = class04995.N(
            this.field_22467.B - (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18_2) && var1 == 1.0E-5F ? 0.2F : var1)
         );
         int k = class04995.N(this.field_22467.Z);
         class07209 class07209x = new class07209(i, j, k);
         if (this.field_6002.method_8320(class07209x).P()) {
            class07209 class07209x = class07209x.method_10074();
            class00500 class00500 = this.field_6002.method_8320(class07209x);
            if (class00500.N(class01210.A) || class00500.N(class01210.q) || class00500.i() instanceof class07188) {
               var2.setReturnValue(class07209x);
               return;
            }
         }

         var2.setReturnValue(class07209x);
      }
   }

   private void handler$dgo000$viafabricplus$removeLeashActions(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5)) {
         class06584 class06584 = var1.method_5998(var2);
         if (this.method_5805() && this instanceof class02607 class02607) {
            if (class02607.yW() == var1) {
               var3.setReturnValue(class07082.N.y());
               return;
            }

            if (class06584.N(class06570.Gr) && class02607.R(var1)) {
               class06584.B(1);
               var3.setReturnValue(class07082.N);
               return;
            }
         }

         var3.setReturnValue(class07082.i);
      }
   }

   private void handler$dnh000$viafabricplus$revertCalculation(float var1, float var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var3.setReturnValue(class06889.N(var1, var2));
      }
   }

   private void handler$dnj001$viafabricplus$cancelSwimming(boolean var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) && var1) {
         var2.cancel();
      }
   }

   private boolean redirect$bpj000$lithium$skipParticlesOnServerSide(class07049 var1) {
      return var1.method_73183().method_8608() ? var1.method_27298() : false;
   }

   private class06889 localvar$cfa000$nursultan$ModifyVariableMove(class06889 var1, LocalRef var2) {
      return this.method_73183().method_8608() && this instanceof class11781 ? ((class11370)var2.get()).L() : var1;
   }

   private double redirect$dme000$viafabricplus$allowSmallValues(class06889 var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) ? Double.MAX_VALUE : var1.B();
   }

   private void handler$cfa000$nursultan$injectUpdateVelocity(float var1, class06889 var2, CallbackInfo var3) {
      if (this.method_73183().method_8608() && this instanceof class11781) {
         class11938.L().L(class11401.N(var1, var2));
      }
   }

   private double redirect$dnj000$viafabricplus$subtractMagicOffset(class07049 var1) {
      return ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_16, ProtocolVersion.v1_20_3)
         ? var1.method_23320() - 0.11111111F
         : var1.method_23320();
   }

   private void handler$dcg000$viafabricplus$cancelSwimming(boolean var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         UserConnection userconnection = ProtocolTranslator.getPlayNetworkUserConnection();
         if (userconnection != null && var1 != this.method_5681()) {
            ((EntityTracker)userconnection.get(EntityTracker.class))
               .getClientPlayer()
               .addAuthInputData(var1 ? PlayerAuthInputPacket_InputData.StartSwimming : PlayerAuthInputPacket_InputData.StopSwimming);
         }
      }
   }

   public void handler$cec000$lithium$tryShortcutFluidPushing(
      class03530 var1, double var2, CallbackInfoReturnable var4, int var5, int var6, int var7, int var8, int var9, int var10
   ) {
      TrackedBlockStatePredicate trackedblockstatepredicate;
      if (var1 == class01231.N) {
         trackedblockstatepredicate = BlockStateFlags.WATER;
      } else {
         if (var1 != class01231.y) {
            return;
         }

         trackedblockstatepredicate = BlockStateFlags.LAVA;
      }

      int i = var5 >> 4;
      int j = var9 >> 4;
      int k = var6 - 1 >> 4;
      int l = var10 - 1 >> 4;
      int i1 = Math.max(SectionYIndex.fromBlockCoord(this.field_6002, var7), SectionYIndex.getMinYSectionIndex(this.field_6002));
      int j1 = Math.min(SectionYIndex.fromBlockCoord(this.field_6002, var8 - 1), SectionYIndex.getMaxYSectionIndexInclusive(this.field_6002));

      for (int k1 = i; k1 <= k; k1++) {
         for (int l1 = j; l1 <= l; l1++) {
            class00570 class00570 = this.field_6002.method_8497(k1, l1);

            for (int i2 = i1; i2 <= j1; i2++) {
               if (class00570.u()[i2].lithium$mayContainAny(trackedblockstatepredicate)) {
                  return;
               }
            }
         }
      }

      this.field_5964.put(var1, 0.0);
      var4.setReturnValue(false);
   }

   private boolean redirect$dnh000$viafabricplus$allowInfiniteValues(float var1) {
      return Float.isFinite(var1) || this instanceof class04453 && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4);
   }

   private float redirect$dnh000$viafabricplus$dontClampPitch(float var1, float var2, float var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) ? var1 : Math.clamp(var1, var2, var3);
   }

   private List redirect$bnp000$lithium$postponeGetEntities(class07299 var1, class07049 var2, class00734 var3, LocalBooleanRef var4) {
      var4.set(true);
      return new ArrayList();
   }

   private void handler$cfa000$nursultan$injectPushAwayFrom(class07049 var1, CallbackInfo var2) {
      if (this instanceof class11781 || var1 instanceof class11781) {
         class09348 class09348 = class09348.L();
         class11938.L().L(class09348);
         if (class09348.y()) {
            var2.cancel();
         }
      }
   }

   private static ImmutableList redirect$dme000$viafabricplus$alwaysSortYXZ(class06889 var0) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2) ? class07211.field_61964 : class07211.y(var0);
   }

   private void handler$bnk000$lithium$useReferenceArraySet(CallbackInfo var1) {
      this.field_25599 = new ReferenceArraySet(this.field_25599);
   }

   private void handler$cfa000$nursultan$injectChangeLookDirection(double var1, double var3, CallbackInfo var5) {
      this.turnRotationEvent = class11384.N(var1, var3);
      class11938.L().L(this.turnRotationEvent);
      if (this.turnRotationEvent.y()) {
         var5.cancel();
      }
   }

   private void handler$dnj000$viafabricplus$modifyFluidMovementBoundingBox(class03530 var1, double var2, CallbackInfoReturnable var4) {
      if (!ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_12_2)
         || ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         class00734 class00734 = this.method_5829().L(0.0, -0.4, 0.0).B(0.001);
         int i = class04995.N(class00734.N);
         int j = class04995.L(class00734.u);
         int k = class04995.N(class00734.y);
         int l = class04995.L(class00734.i);
         int i1 = class04995.N(class00734.L);
         int j1 = class04995.L(class00734.R);
         if (!this.field_6002.N(i, k, i1, j, l, j1)) {
            var4.setReturnValue(false);
         } else {
            double d0 = 0.0;
            boolean flag = false;
            class06889 class06889 = class06889.L;
            class07218 class07218 = new class07218();

            for (int k1 = i; k1 < j; k1++) {
               for (int l1 = k - 1; l1 < l; l1++) {
                  for (int i2 = i1; i2 < j1; i2++) {
                     class07218.N(k1, l1, i2);
                     class04688 class04688 = this.field_6002.method_8316(class07218);
                     if (class04688.N(var1)) {
                        double d1 = l1 + class04688.N(this.field_6002, class07218);
                        if (d1 >= class00734.y - 0.4) {
                           d0 = Math.max(d1 - class00734.y + 0.4, d0);
                        }

                        if (l1 >= k && l >= d1) {
                           flag = true;
                           class06889 = class06889.i(class04688.L(this.field_6002, class07218));
                        }
                     }
                  }
               }
            }

            if (class06889.M() > 0.0) {
               class06889 = class06889.u().L(0.014);
               this.method_18799(this.method_18798().i(class06889));
            }

            this.field_5964.put(var1, d0);
            var4.setReturnValue(flag);
         }
      }
   }

   private static boolean redirect$dme000$viafabricplus$horizontalExactCollisionEqualness(double var0, double var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) ? var0 == var2 : class04995.y(var0, var2);
   }

   private class07049 m_wrapOperation$zec000$fabric_entity_events_v1$afterWorldChanged_74(
      class07049 var1, class04782 var2, class04782 var3, class01032 var4, Operation var5
   ) {
      class07049 class07049 = (class07049)var5.call(new Object[]{var1, var2, var3, var4});
      if (class07049 != null) {
         ((AfterEntityChange)ServerEntityWorldChangeEvents.AFTER_ENTITY_CHANGE_WORLD.invoker())
            .afterChangeWorld(this, class07049, (class04782)this.field_6002, (class04782)class07049.method_73183());
      }

      return class07049;
   }

   private void redirect$dcg000$viafabricplus$prioritySlowestMovementMultiplier(class07049 var1, class06889 var2) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) && this.field_17046 != class06889.L) {
         this.field_17046 = new class06889(Math.min(this.field_17046.M, var2.M), Math.min(this.field_17046.B, var2.B), Math.min(this.field_17046.Z, var2.Z));
      } else {
         this.field_17046 = var2;
      }
   }

   private boolean wrapWithCondition$dme000$viafabricplus$removeExtraCollisionChecks(class07049 var1, class10713 var2) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_5);
   }

   private class06889 redirect$bnp000$lithium$collideMovementWithPostponedGetEntities(
      class07049 var1, class06889 var2, class00734 var3, class07299 var4, List var5, LocalBooleanRef var6
   ) {
      return lithium$CollideMovement(var1, var2, var3, var4, var5, var6);
   }

   private void m_handler$zcn000$fabric_data_attachment_api_v1$readEntityAttachments_78(class08299 var1, CallbackInfo var2) {
      this.fabric_readAttachmentsFromNbt(var1);
   }

   private void handler$dme000$viafabricplus$use1_20_6StepCollisionCalculation(class06889 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
         class00734 class00734 = this.method_5829();
         List<class00494> list = this.method_73183().method_20743(this, class00734.y(var1));
         class06889 class06889xxx = var1.B() == 0.0 ? var1 : method_20736(this, var1, class00734, this.method_73183(), list);
         boolean flag = var1.M != class06889xxx.M;
         boolean flag1 = var1.B != class06889xxx.B;
         boolean flag2 = var1.Z != class06889xxx.Z;
         boolean flag3 = this.method_24828() || flag1 && var1.B < 0.0;
         if (this.method_49476() > 0.0F && flag3 && (flag || flag2)) {
            class06889 class06889x = method_20736(this, new class06889(var1.M, this.method_49476(), var1.Z), class00734, this.method_73183(), list);
            class06889 class06889xx = method_20736(
               this, new class06889(0.0, this.method_49476(), 0.0), class00734.y(var1.M, 0.0, var1.Z), this.method_73183(), list
            );
            if (class06889xx.B < this.method_49476()) {
               class06889 class06889xxx = method_20736(this, new class06889(var1.M, 0.0, var1.Z), class00734.L(class06889xx), this.method_73183(), list)
                  .i(class06889xx);
               if (class06889xxx.z() > class06889x.z()) {
                  class06889x = class06889xxx;
               }
            }

            if (class06889x.z() > class06889xxx.z()) {
               class06889xxx = class06889x.i(
                  method_20736(
                     this,
                     new class06889(
                        0.0, -class06889x.B + (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2) ? 0.0 : var1.B), 0.0
                     ),
                     class00734.L(class06889x),
                     this.method_73183(),
                     list
                  )
               );
            }
         }

         var2.setReturnValue(class06889xxx);
      }
   }

   public final void method_66652(class06584 var1) {
      this.method_66649(var1.y());
   }

   private void addPassengersDeepFirst(ArrayList var1) {
      ImmutableList<class07049> immutablelist = this.field_5979;
      int i = 0;

      for (int j = immutablelist.size(); i < j; i++) {
         class07049 class07049 = (class07049)immutablelist.get(i);
         class07049.addPassengersDeep(var1);
         var1.add(class07049);
      }
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

   public AttachmentTargetInfo fabric_getSyncTargetInfo() {
      return new EntityTarget(this.field_5986);
   }

   public Map fabric_getAttachments() {
      return this.dataAttachments;
   }

   private static class06889 lithium$CollideMovement(class07049 var0, class06889 var1, class00734 var2, class07299 var3, List var4, LocalBooleanRef var5) {
      double d0 = var1.M;
      double d1 = var1.B;
      double d2 = var1.Z;
      boolean flag = (d0 == 0.0 ? 0 : 1) + (d1 == 0.0 ? 0 : 1) + (d2 == 0.0 ? 0 : 1) == 1;
      if (d1 < 0.0) {
         class00494 class00494 = LithiumEntityCollisions.getSupportingCollisionForEntity(var3, var0, var2);
         if (class00494 != null) {
            double d3 = class00494.method_1108(class07185.field_11052, var2, d1);
            if (d3 == 0.0) {
               if (flag) {
                  return class06889.L;
               }

               d1 = 0.0;
               flag = (d0 == 0.0 ? 0 : 1) + (d2 == 0.0 ? 0 : 1) == 1;
            }
         }
      }

      class00734 class00734;
      if (flag) {
         class00734 = LithiumEntityCollisions.getSmallerBoxForSingleAxisMovement(var1, var2, d1, d0, d2);
      } else {
         class00734 = var2.y(var1);
      }

      boolean flag4 = var5 != null && var5.get();
      boolean flag1 = true;
      boolean flag2 = true;
      ChunkAwareBlockCollisionSweeperVoxelShape chunkawareblockcollisionsweepervoxelshape = new ChunkAwareBlockCollisionSweeperVoxelShape(
         var3, var0, class00734, true
      );
      LazyList lazylist = new LazyList(new ArrayList(), chunkawareblockcollisionsweepervoxelshape);
      ArrayList arraylist = new ArrayList(2);
      if (d1 != 0.0) {
         d1 = class00389.N(class07185.field_11052, var2, lazylist, d1);
         if (d1 != 0.0) {
            flag4 = LithiumEntityCollisions.addEntityCollisionsIfRequired(flag4, var0, var3, var4, class00734);
            flag1 = LithiumEntityCollisions.addWorldBorderCollisionIfRequired(flag1, var0, arraylist, class00734);
            flag2 = LithiumEntityCollisions.addLastBlockCollisionIfRequired(flag2, chunkawareblockcollisionsweepervoxelshape, arraylist);
            if (!var4.isEmpty()) {
               d1 = class00389.N(class07185.field_11052, var2, var4, d1);
            }

            if (!arraylist.isEmpty()) {
               d1 = class00389.N(class07185.field_11052, var2, arraylist, d1);
            }

            if (d1 != 0.0) {
               var2 = var2.u(0.0, d1, 0.0);
            }
         }
      }

      boolean flag3 = redirect$dbe000$viafabricplus$alwaysSortYXZ(d0) < Math.abs(d2);
      if (flag3) {
         d2 = class00389.N(class07185.field_11051, var2, lazylist, d2);
         if (d2 != 0.0) {
            flag4 = LithiumEntityCollisions.addEntityCollisionsIfRequired(flag4, var0, var3, var4, class00734);
            flag1 = LithiumEntityCollisions.addWorldBorderCollisionIfRequired(flag1, var0, arraylist, class00734);
            flag2 = LithiumEntityCollisions.addLastBlockCollisionIfRequired(flag2, chunkawareblockcollisionsweepervoxelshape, arraylist);
            if (!var4.isEmpty()) {
               d2 = class00389.N(class07185.field_11051, var2, var4, d2);
            }

            if (!arraylist.isEmpty()) {
               d2 = class00389.N(class07185.field_11051, var2, arraylist, d2);
            }

            if (d2 != 0.0) {
               var2 = var2.u(0.0, 0.0, d2);
            }
         }
      }

      if (d0 != 0.0) {
         d0 = class00389.N(class07185.field_11048, var2, lazylist, d0);
         if (d0 != 0.0) {
            flag4 = LithiumEntityCollisions.addEntityCollisionsIfRequired(flag4, var0, var3, var4, class00734);
            flag1 = LithiumEntityCollisions.addWorldBorderCollisionIfRequired(flag1, var0, arraylist, class00734);
            flag2 = LithiumEntityCollisions.addLastBlockCollisionIfRequired(flag2, chunkawareblockcollisionsweepervoxelshape, arraylist);
            if (!var4.isEmpty()) {
               d0 = class00389.N(class07185.field_11048, var2, var4, d0);
            }

            if (!arraylist.isEmpty()) {
               d0 = class00389.N(class07185.field_11048, var2, arraylist, d0);
            }

            if (d0 != 0.0) {
               var2 = var2.u(d0, 0.0, 0.0);
            }
         }
      }

      if (!flag3 && d2 != 0.0) {
         d2 = class00389.N(class07185.field_11051, var2, lazylist, d2);
         if (d2 != 0.0) {
            flag4 = LithiumEntityCollisions.addEntityCollisionsIfRequired(flag4, var0, var3, var4, class00734);
            flag1 = LithiumEntityCollisions.addWorldBorderCollisionIfRequired(flag1, var0, arraylist, class00734);
            flag2 = LithiumEntityCollisions.addLastBlockCollisionIfRequired(flag2, chunkawareblockcollisionsweepervoxelshape, arraylist);
            if (!var4.isEmpty()) {
               d2 = class00389.N(class07185.field_11051, var2, var4, d2);
            }

            if (!arraylist.isEmpty()) {
               d2 = class00389.N(class07185.field_11051, var2, arraylist, d2);
            }
         }
      }

      if (var5 != null && !flag4) {
         var5.set(false);
      }

      return new class06889(d0, d1, d2);
   }

   public boolean fabric_shouldTryToSync() {
      return !this.method_73183().method_8608();
   }

   @Override
   public Stream method_31748() {
      if (this.field_5979.isEmpty()) {
         return Stream.of(this);
      } else {
         ArrayList arraylist = new ArrayList();
         this.addPassengersDeepFirst(arraylist);
         arraylist.add(this);
         return arraylist.stream();
      }
   }

   private void acknowledgeSynced(AttachmentType var1, Object var2, class01929 var3) {
      class01042 class01042 = var3 instanceof class01042 ? (class01042)var3 : this.fabric_getDynamicRegistryManager();
      this.acknowledgeSyncedEntry(var1, AttachmentChange.create(this.fabric_getSyncTargetInfo(), var1, var2, class01042));
   }

   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.B) {
         this.method_5665(method_66651(class02484.B, var2));
         return true;
      } else if (var1 == class02484.y) {
         this.field_58051 = method_66651(class02484.y, var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_74589(class04782 var1, class06990 var2) {
   }

   public boolean hasAttached(AttachmentType var1) {
      return this.dataAttachments != null && this.dataAttachments.containsKey(var1);
   }

   private void addPassengersDeep(ArrayList var1) {
      ImmutableList<class07049> immutablelist = this.field_5979;
      int i = 0;

      for (int j = immutablelist.size(); i < j; i++) {
         class07049 class07049 = (class07049)immutablelist.get(i);
         var1.add(class07049);
         class07049.addPassengersDeep(var1);
      }
   }

   public boolean lithium$isInLevel() {
      return this.field_26996 != class01113.N;
   }

   @Nullable
   protected static <T> T method_66651(class02477<T> var0, @Nullable Object var1) {
      return (T)var1;
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

   public static class06889 method_20736(class07049 var0, class06889 var1, class00734 var2, class07299 var3, List var4) {
      return lithium$CollideMovement(var0, var1, var2, var3, var4, null);
   }

   public class11812 dataManager() {
      return this.nursultan$dataManager;
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

   public <T> void method_66653(class02477<T> var1, T var2) {
      this.method_66654(var1, var2);
   }

   public void fabric_syncChange(AttachmentType var1, AttachmentChange var2) {
      if (!this.method_73183().method_8608()) {
         AttachmentSyncPredicate attachmentsyncpredicate = ((AttachmentTypeImpl)var1).syncPredicate();
         if (this instanceof class04770 class04770 && attachmentsyncpredicate.test(this, class04770)) {
            AttachmentSync.trySync(var2, class04770);
         }

         PlayerLookup.tracking(this).forEach(var3x -> {
            if (attachmentsyncpredicate.test(this, var3x)) {
               AttachmentSync.trySync(var2, var3x);
            }
         });
      }
   }

   @Nullable
   public Object getAttached(AttachmentType var1) {
      return this.dataAttachments == null ? null : this.dataAttachments.get(var1);
   }

   private void handler$cao000$lithium$emitMaybeInLevelEvents(class01113 var1, CallbackInfo var2) {
      if (this.field_26996 == class01113.N) {
         this.lithium$handleRemovedFromLevel(this.method_73183());
      } else {
         this.lithium$handleAddedToLevel(this.method_73183());
      }
   }

   private double localvar$cfa000$nursultan$modifyArgsChangeLookDirectionY(double var1) {
      return this.turnRotationEvent.L();
   }

   private void handler$dme000$viafabricplus$modifyVelocityAffectingPos(CallbackInfoReturnable var1) {
      ProtocolVersion protocolversion = ProtocolTranslator.getTargetVersion();
      if (protocolversion.olderThanOrEqualTo(ProtocolVersion.v1_19_4)) {
         var1.setReturnValue(
            class07209.method_49637(
               this.field_22467.M, this.method_5829().y - (protocolversion.olderThanOrEqualTo(ProtocolVersion.v1_14_4) ? 1.0 : 0.5000001), this.field_22467.Z
            )
         );
      }
   }

   private double localvar$cfa000$nursultan$modifyArgsChangeLookDirectionX(double var1) {
      return this.turnRotationEvent.u();
   }

   private double constant$dml000$viafabricplus$fixBlockCollisionMargin(double var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_1)) {
         return 0.001;
      } else {
         return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) ? 1.0E-7 : var1;
      }
   }

   private void handler$dnj000$viafabricplus$replaceLavaCheck1_13_2(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
         class00734 class00734 = this.method_5829().R(0.1F, 0.4F, 0.1F);
         var1.setReturnValue(this.field_6002.L(class00734).anyMatch(var0 -> var0.Y().N(class01231.y)));
      }
   }

   private class06889 redirect$dhp000$viafabricplus$use1_20_1RidingOffset(class07049 var1, class07049 var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20)
         ? new class06889(0.0, -EntityRidingOffsetsPre1_20_2.getHeightOffset(var1), 0.0)
         : var1.method_55668(var2);
   }

   private class06889 redirect$dhp000$viafabricplus$getPassengerRidingPos1_20_1(class07049 var1, class07049 var2, class01325 var3, float var4) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20)
         ? EntityRidingOffsetsPre1_20_2.getMountedHeightOffset(var1, var2).y(-var1.method_36454() * (float) (Math.PI / 180.0))
         : this.method_52533(var2, var3, var4);
   }

   private void handler$zzj000$baritone$moveRelativeReturn(CallbackInfo var1) {
      if (this.motionUpdateRotationEvent != null) {
         this.field_6031 = this.motionUpdateRotationEvent.getOriginal().getYaw();
         this.field_5965 = this.motionUpdateRotationEvent.getOriginal().getPitch();
         this.motionUpdateRotationEvent = null;
      }
   }

   public boolean fabric_hasPersistentAttachments() {
      return AttachmentSerializingImpl.hasPersistentAttachments(this.dataAttachments);
   }

   public class01042 fabric_getDynamicRegistryManager() {
      return this.method_73183().method_30349();
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

   public class00500 lithium$getCachedFeetBlockState() {
      return this.field_47742;
   }

   private void handler$bob000$lithium$onBaseTick(CallbackInfo var1) {
      this.lithium$OnFeetBlockCacheDeleted();
   }
}
