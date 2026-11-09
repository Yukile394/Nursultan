package minecraft;

import Nursultan.class09354;
import Nursultan.class09956;
import Nursultan.class10749;
import Nursultan.class10959;
import Nursultan.class10966;
import Nursultan.class10997;
import Nursultan.class11335;
import Nursultan.class11336;
import Nursultan.class11342;
import Nursultan.class11366;
import Nursultan.class11379;
import Nursultan.class11395;
import Nursultan.class11497;
import Nursultan.class11781;
import Nursultan.class11907;
import Nursultan.class11938;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.RotationMoveEvent;
import baritone.api.event.events.RotationMoveEvent.Type;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JavaOps;
import com.viaversion.viafabricplus.features.entity.attribute.EnchantmentAttributesEmulation1_20_6;
import com.viaversion.viafabricplus.features.entity.riding_offset.EntityRidingOffsetsPre1_20_2;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.entity.NavigatingEntity;
import net.caffeinemc.mods.lithium.common.entity.pushable.FeetBlockCachingEntity;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import net.caffeinemc.mods.lithium.common.world.in_world_tracking.MaybeInLevelObject;
import net.fabricmc.fabric.api.block.v1.BlockFunctionalityTags;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowBed;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.ModifySleepingDirection;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.ModifyWakeUpPosition;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.SetBedOccupationState;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.StartSleeping;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.StopSleeping;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents.AfterKilledOtherEntity;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.AfterDamage;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.AfterDeath;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.AllowDamage;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.AllowDeath;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents.AfterAdd;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents.AfterRemove;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents.AllowAdd;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents.AllowEarlyRemove;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents.BeforeAdd;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents.BeforeRemove;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents.EquipmentChange;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.impl.entity.event.effect.MobEffectUtil;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07438 extends class07049 implements class00042, class01959, FeetBlockCachingEntity, MaybeInLevelObject {
   public class06584 fields_9212a028292fd3c078969e3ee4c71d9e8_0;
   public Integer fields_9212a028292fd3c078969e3ee4c71d9e8_1;
   public Integer fields_9212a028292fd3c078969e3ee4c71d9e8_2;
   public Long fields_9212a028292fd3c078969e3ee4c71d9e8_3;
   public class07209 fields_9212a028292fd3c078969e3ee4c71d9e8_4;
   public Optional fields_9212a028292fd3c078969e3ee4c71d9e8_5;
   public class07072 fields_9212a028292fd3c078969e3ee4c71d9e8_6;
   public boolean fields_9212a028292fd3c078969e3ee4c71d9e8_init;
   public Float fields_12212a028292fd3c078969e3ee4c71d9e8_0;
   public class01289 fields_12212a028292fd3c078969e3ee4c71d9e8_1;
   public Boolean fields_12212a028292fd3c078969e3ee4c71d9e8_2;
   public boolean fields_12212a028292fd3c078969e3ee4c71d9e8_init;
   public static Integer staticFields_5212a028292fd3c078969e3ee4c71d9e8_0;
   public static Integer staticFields_5212a028292fd3c078969e3ee4c71d9e8_1;
   public class08372 fields_8212a028292fd3c078969e3ee4c71d9e8_0;
   public Integer fields_8212a028292fd3c078969e3ee4c71d9e8_1;
   public class07438 fields_8212a028292fd3c078969e3ee4c71d9e8_2;
   public Integer fields_8212a028292fd3c078969e3ee4c71d9e8_3;
   public Float fields_8212a028292fd3c078969e3ee4c71d9e8_4;
   public Integer fields_8212a028292fd3c078969e3ee4c71d9e8_5;
   public Float fields_8212a028292fd3c078969e3ee4c71d9e8_6;
   public boolean fields_8212a028292fd3c078969e3ee4c71d9e8_init;
   public static class02131 staticFields_6212a028292fd3c078969e3ee4c71d9e8_0 = class03289.N(class07438.class, class02154.N);
   public static class02131 staticFields_6212a028292fd3c078969e3ee4c71d9e8_1 = class03289.N(class07438.class, class02154.u);
   public static class02131 staticFields_6212a028292fd3c078969e3ee4c71d9e8_2 = class03289.N(class07438.class, class02154.W);
   public static class02131 staticFields_6212a028292fd3c078969e3ee4c71d9e8_3 = class03289.N(class07438.class, class02154.U);
   public static class02131 staticFields_6212a028292fd3c078969e3ee4c71d9e8_4 = class03289.N(class07438.class, class02154.y);
   public static class02131 staticFields_6212a028292fd3c078969e3ee4c71d9e8_5 = class03289.N(class07438.class, class02154.y);
   public static class02131 staticFields_6212a028292fd3c078969e3ee4c71d9e8_6 = class03289.N(class07438.class, class02154.s);
   public static Object staticFields_2212a028292fd3c078969e3ee4c71d9e8_0;
   public static Object staticFields_2212a028292fd3c078969e3ee4c71d9e8_1;
   public static class01894 staticFields_2212a028292fd3c078969e3ee4c71d9e8_2 = class01894.y("powder_snow");
   public static class01894 staticFields_2212a028292fd3c078969e3ee4c71d9e8_3 = class01894.y("sprinting");
   public static class07471 staticFields_2212a028292fd3c078969e3ee4c71d9e8_4 = new class07471(
      staticFields_2212a028292fd3c078969e3ee4c71d9e8_3, 0.3F, class07463.field_6331
   );
   public static Integer staticFields_2212a028292fd3c078969e3ee4c71d9e8_5;
   public Float fields_5212a028292fd3c078969e3ee4c71d9e8_0;
   public class02768 fields_5212a028292fd3c078969e3ee4c71d9e8_1;
   public class08372 fields_5212a028292fd3c078969e3ee4c71d9e8_2;
   public boolean fields_5212a028292fd3c078969e3ee4c71d9e8_init;
   public Float fields_4212a028292fd3c078969e3ee4c71d9e8_0;
   public Float fields_4212a028292fd3c078969e3ee4c71d9e8_1;
   public Float fields_4212a028292fd3c078969e3ee4c71d9e8_2;
   public boolean fields_4212a028292fd3c078969e3ee4c71d9e8_init;
   public Object2LongMap fields_11212a028292fd3c078969e3ee4c71d9e8_0;
   public Float fields_11212a028292fd3c078969e3ee4c71d9e8_1;
   public boolean fields_11212a028292fd3c078969e3ee4c71d9e8_init;
   public Float fields_7212a028292fd3c078969e3ee4c71d9e8_0;
   public Float fields_7212a028292fd3c078969e3ee4c71d9e8_1;
   public Float fields_7212a028292fd3c078969e3ee4c71d9e8_2;
   public class08382 fields_7212a028292fd3c078969e3ee4c71d9e8_3;
   public Double fields_7212a028292fd3c078969e3ee4c71d9e8_4;
   public Integer fields_7212a028292fd3c078969e3ee4c71d9e8_5;
   public Boolean fields_7212a028292fd3c078969e3ee4c71d9e8_6;
   public boolean fields_7212a028292fd3c078969e3ee4c71d9e8_init;
   public Float fields_3212a028292fd3c078969e3ee4c71d9e8_0;
   public Integer fields_3212a028292fd3c078969e3ee4c71d9e8_1;
   public Integer fields_3212a028292fd3c078969e3ee4c71d9e8_2;
   public class03269 fields_3212a028292fd3c078969e3ee4c71d9e8_3;
   public boolean fields_3212a028292fd3c078969e3ee4c71d9e8_init;
   public EnumMap fields_13212a028292fd3c078969e3ee4c71d9e8_0;
   public class08599 fields_13212a028292fd3c078969e3ee4c71d9e8_1;
   public class00028 fields_13212a028292fd3c078969e3ee4c71d9e8_2;
   public RotationMoveEvent fields_13212a028292fd3c078969e3ee4c71d9e8_3;
   public RotationMoveEvent fields_13212a028292fd3c078969e3ee4c71d9e8_4;
   public Boolean fields_13212a028292fd3c078969e3ee4c71d9e8_5;
   public boolean fields_13212a028292fd3c078969e3ee4c71d9e8_init;
   public static Float staticFields_4212a028292fd3c078969e3ee4c71d9e8_0;
   public static Integer staticFields_4212a028292fd3c078969e3ee4c71d9e8_1;
   public static Integer staticFields_4212a028292fd3c078969e3ee4c71d9e8_2;
   public static Float staticFields_4212a028292fd3c078969e3ee4c71d9e8_3;
   public static Float staticFields_4212a028292fd3c078969e3ee4c71d9e8_4;
   public static Integer staticFields_4212a028292fd3c078969e3ee4c71d9e8_5;
   public static Double staticFields_4212a028292fd3c078969e3ee4c71d9e8_6;
   public static Integer staticFields_4212a028292fd3c078969e3ee4c71d9e8_7;
   public static Integer staticFields_3212a028292fd3c078969e3ee4c71d9e8_0;
   public static Integer staticFields_3212a028292fd3c078969e3ee4c71d9e8_1;
   public static Integer staticFields_3212a028292fd3c078969e3ee4c71d9e8_2;
   public static Integer staticFields_3212a028292fd3c078969e3ee4c71d9e8_3;
   public static Integer staticFields_3212a028292fd3c078969e3ee4c71d9e8_4;
   public static Double staticFields_3212a028292fd3c078969e3ee4c71d9e8_5;
   public static Double staticFields_3212a028292fd3c078969e3ee4c71d9e8_6;
   public static Integer staticFields_3212a028292fd3c078969e3ee4c71d9e8_7;
   public class05320 fields_0212a028292fd3c078969e3ee4c71d9e8_0;
   public class07076 fields_0212a028292fd3c078969e3ee4c71d9e8_1;
   public Object fields_0212a028292fd3c078969e3ee4c71d9e8_2;
   public Map fields_0212a028292fd3c078969e3ee4c71d9e8_3;
   public Boolean fields_0212a028292fd3c078969e3ee4c71d9e8_4;
   public Boolean fields_0212a028292fd3c078969e3ee4c71d9e8_5;
   public class07050 fields_0212a028292fd3c078969e3ee4c71d9e8_6;
   public boolean fields_0212a028292fd3c078969e3ee4c71d9e8_init;
   public static Object staticFields_1212a028292fd3c078969e3ee4c71d9e8_0;
   public static Object staticFields_1212a028292fd3c078969e3ee4c71d9e8_1;
   public static Object staticFields_1212a028292fd3c078969e3ee4c71d9e8_2;
   public static Object staticFields_1212a028292fd3c078969e3ee4c71d9e8_3;
   public static Object staticFields_1212a028292fd3c078969e3ee4c71d9e8_4;
   public static Object staticFields_1212a028292fd3c078969e3ee4c71d9e8_5;
   public Integer fields_6212a028292fd3c078969e3ee4c71d9e8_0;
   public Boolean fields_6212a028292fd3c078969e3ee4c71d9e8_1;
   public Integer fields_6212a028292fd3c078969e3ee4c71d9e8_2;
   public Float fields_6212a028292fd3c078969e3ee4c71d9e8_3;
   public Boolean fields_6212a028292fd3c078969e3ee4c71d9e8_4;
   public boolean fields_6212a028292fd3c078969e3ee4c71d9e8_init;
   public static Integer staticFields_7212a028292fd3c078969e3ee4c71d9e8_0;
   public static class01325 staticFields_7212a028292fd3c078969e3ee4c71d9e8_1 = class01325.L(0.2F, 0.2F).y(0.2F);
   public static Float staticFields_7212a028292fd3c078969e3ee4c71d9e8_2;
   public static Float staticFields_7212a028292fd3c078969e3ee4c71d9e8_3;
   public static Float staticFields_7212a028292fd3c078969e3ee4c71d9e8_4;
   public static Predicate staticFields_7212a028292fd3c078969e3ee4c71d9e8_5 = var0 -> var0 instanceof class08036 class08036
      ? !class08036.method_6118(class07085.field_6169).N(class01226.La)
      : true;
   public static Dynamic staticFields_7212a028292fd3c078969e3ee4c71d9e8_6 = new Dynamic(JavaOps.INSTANCE, Map.of((String)"memories", Map.of()));
   public static Logger staticFields_0212a028292fd3c078969e3ee4c71d9e8_0 = LogUtils.getLogger();
   public static Object staticFields_0212a028292fd3c078969e3ee4c71d9e8_1;
   public static Object staticFields_0212a028292fd3c078969e3ee4c71d9e8_2;
   public Integer fields_1212a028292fd3c078969e3ee4c71d9e8_0;
   public Integer fields_1212a028292fd3c078969e3ee4c71d9e8_1;
   public Integer fields_1212a028292fd3c078969e3ee4c71d9e8_2;
   public boolean fields_1212a028292fd3c078969e3ee4c71d9e8_init;
   public Integer fields_2212a028292fd3c078969e3ee4c71d9e8_0;
   public Integer fields_2212a028292fd3c078969e3ee4c71d9e8_1;
   public Integer fields_2212a028292fd3c078969e3ee4c71d9e8_2;
   public Float fields_2212a028292fd3c078969e3ee4c71d9e8_3;
   public boolean fields_2212a028292fd3c078969e3ee4c71d9e8_init;
   public Long fields_10212a028292fd3c078969e3ee4c71d9e8_0;
   public Integer fields_10212a028292fd3c078969e3ee4c71d9e8_1;
   public Float fields_10212a028292fd3c078969e3ee4c71d9e8_2;
   public class06584 fields_10212a028292fd3c078969e3ee4c71d9e8_3;
   public boolean fields_10212a028292fd3c078969e3ee4c71d9e8_init;

   @Override
   public class01325 method_18377(class01312 var1) {
      return var1 == class01312.field_18078 ? staticFields_7212a028292fd3c078969e3ee4c71d9e8_1 : this.method_55694(var1).N(this.method_55693());
   }

   @Override
   public class06889 method_30633(class07185 var1, class01009 var2) {
      return method_31079(super.method_30633(var1, var2));
   }

   @Override
   public int method_5850() {
      return this.method_56993(0.0F);
   }

   @Override
   public boolean method_5733() {
      return this.method_5807();
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      class07085 class07085 = method_32322(var1);
      return class07085 != null ? method_32321(this, class07085) : super.method_32318(var1);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      super.method_5674(var1);
      if (staticFields_6212a028292fd3c078969e3ee4c71d9e8_6.equals(var1)) {
         if (this.method_73183().method_8608()) {
            this.method_18398().ifPresent(this::method_18392);
         }
      } else if (staticFields_6212a028292fd3c078969e3ee4c71d9e8_0.equals(var1) && this.method_73183().method_8608()) {
         if (this.method_6115() && this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.R()) {
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_0 = this.method_5998(this.method_6058());
            if (!this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.R()) {
               this.fields_9212a028292fd3c078969e3ee4c71d9e8_1 = this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.N(this);
            }
         } else if (!this.method_6115() && !this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.R()) {
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_0 = class06584.E;
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_1 = 0;
         }
      }
   }

   @Override
   public class06584 method_59958() {
      return this.method_6047();
   }

   @Override
   public boolean method_32316() {
      if (this.method_7325()) {
         return false;
      } else {
         for (class07085 class07085 : class02834.field_49224) {
            if (this.method_6118(class07085).N(class01226.yH)) {
               return false;
            }
         }

         return super.method_32316();
      }
   }

   @Override
   public void method_31471(class07276 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      double d0 = var1.u();
      double d1 = var1.M();
      double d2 = var1.B();
      float f = var1.U();
      float f1 = var1.z();
      this.method_43391(d0, d1, d2);
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = var1.E();
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = var1.E();
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
      this.method_5838(var1.N());
      this.method_5826(var1.y());
      this.method_5641(d0, d1, d2, f, f1);
      this.method_18799(var1.Z());
   }

   @Override
   public void method_5702(class07664 var1, class06889 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      super.method_5702(var1, var2);
      this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
   }

   @Override
   public boolean method_70674() {
      return this.method_45325(class05298.q) > 0.0;
   }

   @Override
   public float method_73188() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
   }

   @Override
   public float method_60951(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return class04995.B(var1, this.fields_4212a028292fd3c078969e3ee4c71d9e8_1, this.fields_4212a028292fd3c078969e3ee4c71d9e8_0);
   }

   @Override
   public boolean method_5805() {
      return !this.method_31481() && this.method_6032() > 0.0F;
   }

   @Override
   public void method_5848() {
      class07049 class07049 = this.method_5854();
      super.method_5848();
      if (class07049 != null && class07049 != this.method_5854() && !this.method_73183().method_8608()) {
         this.method_6038(class07049);
      }

      this.handler$bop000$lithium$handleStopRiding(null);
   }

   @Override
   public void method_5693(class04293 var1) {
      var1.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_0, (byte)0);
      var1.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_2, List.of());
      var1.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_3, false);
      var1.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_4, 0);
      var1.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_5, 0);
      var1.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_1, 1.0F);
      var1.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_6, Optional.empty());
   }

   @Override
   public void method_75725() {
      super.method_75725();
      this.method_75126();
   }

   @Override
   public void method_5768(class04782 var1) {
      this.method_64397(var1, this.method_48923().d(), Float.MAX_VALUE);
   }

   @Override
   public void method_5670() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_2212a028292fd3c078969e3ee4c71d9e8_3 = this.fields_3212a028292fd3c078969e3ee4c71d9e8_0;
      if (this.field_5953) {
         this.method_18398().ifPresent(this::method_18392);
      }

      if (this.method_73183() instanceof class04782 class04782x && this.wrapWithCondition$boh000$lithium$maybeHasAnyTickableEnchantments(class04782x, this)) {
         class07323.y(class04782x, this);
      }

      super.method_5670();
      class04643 class04643 = class08700.N();
      class04643.N("livingEntityBaseTick");
      if (this.method_5805() && this.method_73183() instanceof class04782 class04782) {
         boolean flag = this instanceof class08036;
         if (this.method_5757()) {
            this.method_64397(class04782, this.method_48923().M(), 1.0F);
         } else if (flag && !class04782.method_8621().N(this.method_5829())) {
            double d0 = class04782.method_8621().N(this) + class04782.method_8621().m();
            if (d0 < 0.0) {
               double d1 = class04782.method_8621().P();
               if (d1 > 0.0) {
                  this.method_64397(class04782, this.method_48923().l(), Math.max(1, class04995.N(-d0 * d1)));
               }
            }
         }

         if (this.method_5777(class01231.N)
            && !class04782.method_8320(class07209.method_49637(this.method_23317(), this.method_23320(), this.method_23321())).N(class00869.PN)) {
            boolean flag1 = !this.method_6094() && !class07063.L(this) && (!flag || !((class08036)this).method_31549().N);
            if (flag1) {
               this.method_5855(this.method_6130(this.method_5669()));
               if (this.method_74092()) {
                  this.method_5855(0);
                  class04782.method_8421(this, (byte)67);
                  this.method_64397(class04782, this.method_48923().Z(), 2.0F);
               }
            } else if (this.method_5669() < this.method_5748() && class07063.u(this)) {
               this.method_5855(this.method_6064(this.method_5669()));
            }

            if (this.method_5765() && this.method_5854() != null && this.method_5854().method_49693()) {
               this.method_5848();
            }
         } else if (this.method_5669() < this.method_5748()) {
            this.method_5855(this.method_6064(this.method_5669()));
         }

         class07209 class07209 = this.method_24515();
         if (!Objects.equal(this.fields_9212a028292fd3c078969e3ee4c71d9e8_4, class07209)) {
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_4 = class07209;
            this.method_6126(class04782, class07209);
         }
      }

      if (this.fields_2212a028292fd3c078969e3ee4c71d9e8_0 > 0) {
         this.fields_2212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_2212a028292fd3c078969e3ee4c71d9e8_0 - 1;
      }

      if (this.field_6008 > 0 && !(this instanceof class04770)) {
         this.field_6008--;
      }

      if (this.method_29504() && this.method_73183().method_38989(this)) {
         this.method_6108();
      }

      if (this.fields_6212a028292fd3c078969e3ee4c71d9e8_0 > 0) {
         this.fields_6212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_6212a028292fd3c078969e3ee4c71d9e8_0 - 1;
      } else {
         this.fields_5212a028292fd3c078969e3ee4c71d9e8_2 = null;
      }

      if (this.fields_8212a028292fd3c078969e3ee4c71d9e8_2 != null && !this.fields_8212a028292fd3c078969e3ee4c71d9e8_2.method_5805()) {
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_2 = null;
      }

      class07438 class07438 = this.method_6065();
      if (class07438 != null) {
         if (!class07438.method_5805()) {
            this.method_6015(null);
         } else if (this.field_6012 - this.fields_8212a028292fd3c078969e3ee4c71d9e8_1 > 100) {
            this.method_6015(null);
         }
      }

      this.method_6050();
      this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      this.field_5982 = this.method_36454();
      this.field_6004 = this.method_36455();
      class04643.L();
   }

   @Override
   public void method_64615(class07062 var1) {
      super.method_64615(var1);
      class07299 class07299 = this.method_73183();
      if (class07299 instanceof class04782) {
         ((class04782)class07299).method_70636().L((class00042)this);
      }
   }

   @Override
   public void method_5773() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      super.method_5773();
      this.method_6076();
      this.method_6072();
      if (!this.method_73183().method_8608()) {
         int i = this.method_6022();
         if (i > 0) {
            if (this.fields_1212a028292fd3c078969e3ee4c71d9e8_1 <= 0) {
               this.fields_1212a028292fd3c078969e3ee4c71d9e8_1 = 20 * (30 - i);
            }

            this.fields_1212a028292fd3c078969e3ee4c71d9e8_1 = this.fields_1212a028292fd3c078969e3ee4c71d9e8_1 - 1;
            if (this.fields_1212a028292fd3c078969e3ee4c71d9e8_1 <= 0) {
               this.method_6097(i - 1);
            }
         }

         int j = this.method_21753();
         if (j > 0) {
            if (this.fields_1212a028292fd3c078969e3ee4c71d9e8_2 <= 0) {
               this.fields_1212a028292fd3c078969e3ee4c71d9e8_2 = 20 * (30 - j);
            }

            this.fields_1212a028292fd3c078969e3ee4c71d9e8_2 = this.fields_1212a028292fd3c078969e3ee4c71d9e8_2 - 1;
            if (this.fields_1212a028292fd3c078969e3ee4c71d9e8_2 <= 0) {
               this.method_21755(j - 1);
            }
         }

         this.method_30128();
         if (this.field_6012 % 20 == 0) {
            this.method_6066().L();
         }

         if (this.method_6113() && (!this.method_73187() || !this.method_18406())) {
            this.method_18400();
         }
      }

      if (!this.method_31481()) {
         this.method_6007();
      }

      double d1 = this.method_23317() - this.field_6014;
      double d0 = this.method_23321() - this.field_5969;
      float f = (float)(d1 * d1 + d0 * d0);
      float f1 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      if (f > 0.0025000002F) {
         float f2 = (float)class04995.u(d0, d1) * (180.0F / (float)Math.PI) - 90.0F;
         float f4 = class04995.R(this.method_36454()) - f2;
         float f3 = this.m_redirect$ecp000$viafabricplus_visuals$alwaysRotateWhenWalkingBackwards_85(f4);
         if (95.0F < f3 && f3 < 265.0F) {
            f1 = f2 - 180.0F;
         } else {
            f1 = f2;
         }
      }

      if (this.fields_3212a028292fd3c078969e3ee4c71d9e8_0 > 0.0F) {
         f1 = this.method_36454();
      }

      class04643 class04643 = class08700.N();
      class04643.N("headTurn");
      this.method_6031(f1);
      class04643.L();
      class04643.N("rangeChecks");

      while (this.method_36454() - this.field_5982 < -180.0F) {
         this.field_5982 -= 360.0F;
      }

      while (this.method_36454() - this.field_5982 >= 180.0F) {
         this.field_5982 += 360.0F;
      }

      while (this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 - this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 < -180.0F) {
         this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 - 360.0F;
      }

      while (this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 - this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 >= 180.0F) {
         this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 + 360.0F;
      }

      while (this.method_36455() - this.field_6004 < -180.0F) {
         this.field_6004 -= 360.0F;
      }

      while (this.method_36455() - this.field_6004 >= 180.0F) {
         this.field_6004 += 360.0F;
      }

      while (this.fields_4212a028292fd3c078969e3ee4c71d9e8_2 - this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 < -180.0F) {
         this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 - 360.0F;
      }

      while (this.fields_4212a028292fd3c078969e3ee4c71d9e8_2 - this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 >= 180.0F) {
         this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 + 360.0F;
      }

      class04643.L();
      if (this.method_6128()) {
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_2 = this.fields_9212a028292fd3c078969e3ee4c71d9e8_2 + 1;
      } else {
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_2 = 0;
      }

      if (this.method_6113()) {
         this.method_36457(0.0F);
      }

      this.method_52543();
      this.fields_5212a028292fd3c078969e3ee4c71d9e8_1.N();
   }

   @Override
   public void method_5650(class07062 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if ((var1 == class07062.field_26998 || var1 == class07062.field_26999) && this.method_73183() instanceof class04782 class04782) {
         this.method_60699(class04782, var1);
      }

      super.method_5650(var1);
      this.fields_12212a028292fd3c078969e3ee4c71d9e8_1.y();
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.method_5679(var1, var2)) {
         return false;
      } else if (this.method_29504()) {
         return false;
      } else if (var2.N(class03696.Z) && this.method_6059(class07047.E)) {
         return false;
      } else {
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         this.m_handler$zed000$fabric_entity_events_v1$beforeDamage_107(var1, var2, var3, callbackinforeturnable);
         if (callbackinforeturnable.isCancelled()) {
            return callbackinforeturnable.getReturnValueZ();
         } else {
            if (this.method_6113()) {
               this.method_18400();
            }

            this.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
            if (var3 < 0.0F) {
               var3 = 0.0F;
            }

            class06584 class06584 = this.method_6030();
            float f = this.method_67346(var1, var2, var3);
            var3 -= f;
            boolean flag = f > 0.0F;
            if (var2.N(class03696.P) && this.method_5864().N(class01217.W)) {
               var3 *= 5.0F;
            }

            if (var2.N(class03696.N) && !this.method_6118(class07085.field_6169).R()) {
               this.method_36977(var2, var3);
               var3 *= 0.75F;
            }

            if (Float.isNaN(var3) || Float.isInfinite(var3)) {
               var3 = Float.MAX_VALUE;
            }

            boolean flag1 = true;
            if (this.field_6008 > 10.0F && !var2.N(class03696.i)) {
               if (var3 <= this.fields_6212a028292fd3c078969e3ee4c71d9e8_3) {
                  return false;
               }

               this.method_6074(var1, var2, var3 - this.fields_6212a028292fd3c078969e3ee4c71d9e8_3);
               this.fields_6212a028292fd3c078969e3ee4c71d9e8_3 = var3;
               flag1 = false;
            } else {
               this.fields_6212a028292fd3c078969e3ee4c71d9e8_3 = var3;
               this.field_6008 = 20;
               this.method_6074(var1, var2, var3);
               this.fields_2212a028292fd3c078969e3ee4c71d9e8_1 = 10;
               this.fields_2212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_2212a028292fd3c078969e3ee4c71d9e8_1;
            }

            this.method_65344(var2);
            this.method_65343(var2);
            if (flag1) {
               class08576 class08576 = class06584.method_58694(class02484.H);
               if (flag && class08576 != null) {
                  class08576.N(var1, this);
               } else {
                  var1.method_48760(this, var2);
               }

               if (!var2.N(class03696.b) && (!flag || var3 > 0.0F)) {
                  this.method_5785();
               }

               if (!var2.N(class03696.w)) {
                  double var10 = 0.0;
                  double d1 = 0.0;
                  class07049 class07049 = var2.L();
                  if (class07049 instanceof class08005) {
                     DoubleDoubleImmutablePair doubledoubleimmutablepair = ((class08005)class07049).a_(this, var2);
                     var10 = -doubledoubleimmutablepair.leftDouble();
                     d1 = -doubledoubleimmutablepair.rightDouble();
                  } else if (var2.Z() != null) {
                     var10 = var2.Z().N() - this.method_23317();
                     d1 = var2.Z().L() - this.method_23321();
                  }

                  this.method_6005(0.4F, var10, d1);
                  if (!flag) {
                     this.method_48761(var10, d1);
                  }
               }
            }

            if (this.m_redirect$zed000$fabric_entity_events_v1$beforeEntityKilled_104(this, var1, var2, var3)) {
               if (!this.method_6095(var2)) {
                  if (flag1) {
                     this.method_56078(this.method_6002());
                     this.method_66283(var2);
                  }

                  this.method_6078(var2);
               }
            } else if (flag1) {
               this.method_6013(var2);
               this.method_66283(var2);
            }

            boolean flag2 = !flag || var3 > 0.0F;
            if (flag2) {
               this.fields_9212a028292fd3c078969e3ee4c71d9e8_6 = var2;
               this.fields_10212a028292fd3c078969e3ee4c71d9e8_0 = this.method_73183().N();

               for (class07055 class07055 : this.method_6026()) {
                  class07055.N(var1, this, var2, var3);
               }
            }

            if (this instanceof class04770 class04770x) {
               class06912.Z.N(class04770x, var2, var3, var3, flag);
               if (f > 0.0F && f < 3.4028235E37F) {
                  class04770x.method_7339(class01235.H, Math.round(f * 10.0F));
               }
            }

            if (var2.u() instanceof class04770 class04770x) {
               class06912.B.N(class04770x, this, var2, var3, var3, flag);
            }

            this.m_handler$zed000$fabric_entity_events_v1$afterDamage_114(var1, var2, var3, null, var3, flag);
            return flag2;
         }
      }
   }

   @Override
   public void method_56073(int var1) {
      super.method_56073(class04995.L(var1 * this.method_45325(class05298.Z)));
   }

   @Override
   public void method_5825() {
      this.method_64419(this.method_48923().P(), 4.0F);
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.method_5799()) {
         this.method_5713();
      }

      if (this.method_73183() instanceof class04782 class04782 && var3 && this.field_6017 > 0.0) {
         this.method_6126(class04782, var5);
         double d6 = Math.max(0, class04995.N(this.method_66669(this.field_6017)));
         if (d6 > 0.0 && !var4.P()) {
            double d0 = this.method_23317();
            double d1 = this.method_23318();
            double d2 = this.method_23321();
            class07209 class07209 = this.method_24515();
            if (var5.method_10263() != class07209.method_10263() || var5.method_10260() != class07209.method_10260()) {
               double d3 = d0 - var5.method_10263() - 0.5;
               double d4 = d2 - var5.method_10260() - 0.5;
               double d5 = Math.max(Math.abs(d3), Math.abs(d4));
               d0 = var5.method_10263() + 0.5 + d3 / d5 * 0.5;
               d2 = var5.method_10260() + 0.5 + d4 / d5 * 0.5;
            }

            double d7 = Math.min(0.2F + d6 / 15.0, 2.5);
            int i = (int)(150.0 * d7);
            class04782.method_65096(
               this.m_modifyExpressionValue$zla000$fabric_particles_v1$modifyBlockStateParticleEffect_116(
                  new class07105(class07107.y, var4), var1, var3, var4, var5
               ),
               d0,
               d1,
               d2,
               i,
               0.0,
               0.0,
               0.0,
               0.15F
            );
         }
      }

      super.method_5623(var1, var3, var4, var5);
      if (var3) {
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_5 = Optional.empty();
      }
   }

   @Override
   public float method_23326() {
      this.handler$dgc000$viafabricplus$setGenericMovementEfficiencyAttribute(null);
      return class04995.B((float)this.method_45325(class05298.G), super.method_23326(), 1.0F);
   }

   @Override
   public float method_49476() {
      float f = (float)this.method_45325(class05298.O);
      return this.method_5642() instanceof class08036 ? Math.max(f, 1.0F) : f;
   }

   @Override
   public boolean method_5747(double var1, float var3, class07072 var4) {
      boolean flag = super.method_5747(var1, var3, var4);
      int i = this.method_23329(var1, var3);
      if (i > 0) {
         this.method_5783(this.method_6041(i), 1.0F, 1.0F);
         this.method_23328();
         this.method_64419(var4, i);
         return true;
      } else {
         return flag;
      }
   }

   @Override
   public double method_7490() {
      return this.method_45325(class05298.s);
   }

   @Override
   public void method_5697(class07049 var1) {
      if (!this.method_6113()) {
         super.method_5697(var1);
      }
   }

   @Override
   public boolean method_5810() {
      return this.method_5805() && !this.method_7325() && !this.method_6101();
   }

   @Override
   public void method_5652(class08329 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      var1.N("Health", this.method_6032());
      var1.N("HurtTime", (short)this.fields_2212a028292fd3c078969e3ee4c71d9e8_0.intValue());
      var1.N("HurtByTimestamp", this.fields_8212a028292fd3c078969e3ee4c71d9e8_1.intValue());
      var1.N("DeathTime", (short)this.fields_2212a028292fd3c078969e3ee4c71d9e8_2.intValue());
      var1.N("AbsorptionAmount", this.method_6067());
      var1.N("attributes", class07433.u, this.method_6127().u());
      if (!((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).isEmpty()) {
         var1.N("active_effects", class07055.u.listOf(), List.copyOf(((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).values()));
      }

      var1.N("FallFlying", this.method_6128());
      this.method_18398().ifPresent(var1x -> var1.N("sleeping_pos", class07209.field_25064, var1x));
      this.fields_12212a028292fd3c078969e3ee4c71d9e8_1
         .N(class07713.N)
         .map(var0 -> new Dynamic(class07713.N, var0))
         .resultOrPartial(staticFields_0212a028292fd3c078969e3ee4c71d9e8_0::error)
         .ifPresent(var1x -> var1.N("Brain", Codec.PASSTHROUGH, var1x));
      if (this.fields_5212a028292fd3c078969e3ee4c71d9e8_2 != null) {
         this.fields_5212a028292fd3c078969e3ee4c71d9e8_2.N(var1, "last_hurt_by_player");
         var1.N("last_hurt_by_player_memory_time", this.fields_6212a028292fd3c078969e3ee4c71d9e8_0.intValue());
      }

      if (this.fields_8212a028292fd3c078969e3ee4c71d9e8_0 != null) {
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_0.N(var1, "last_hurt_by_mob");
         var1.N("ticks_since_last_hurt_by_mob", this.field_6012 - this.fields_8212a028292fd3c078969e3ee4c71d9e8_1);
      }

      if (!this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.N()) {
         var1.N("equipment", class08599.N, this.fields_13212a028292fd3c078969e3ee4c71d9e8_1);
      }

      if (this.fields_13212a028292fd3c078969e3ee4c71d9e8_2.N()) {
         var1.N("locator_bar_icon", class00028.N, this.fields_13212a028292fd3c078969e3ee4c71d9e8_2);
      }
   }

   @Override
   public boolean method_5863() {
      return !this.method_31481();
   }

   @Override
   public float method_5705(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return var1 == 1.0F
         ? this.fields_4212a028292fd3c078969e3ee4c71d9e8_2
         : class04995.Z(var1, this.fields_5212a028292fd3c078969e3ee4c71d9e8_0, this.fields_4212a028292fd3c078969e3ee4c71d9e8_2);
   }

   @Override
   public void method_5636(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = var1;
   }

   @Override
   public void method_5847(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = var1;
   }

   public boolean method_56992() {
      return false;
   }

   public class06584 method_5998(class07050 var1) {
      if (var1 == class07050.field_5808) {
         return this.method_6118(class07085.field_6173);
      } else if (var1 == class07050.field_5810) {
         return this.method_6118(class07085.field_6171);
      } else {
         throw new IllegalArgumentException("Invalid hand " + var1);
      }
   }

   public class06584 method_6118(class07085 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.N(var1);
   }

   public boolean method_6109() {
      return false;
   }

   @Override
   public void method_5749(class08299 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.method_52544(var1.N("AbsorptionAmount", 0.0F));
      if (this.method_73183() != null && !this.method_73183().method_8608()) {
         var1.<List<class07433>>N("attributes", class07433.u).ifPresent(this.method_6127()::N);
      }

      List<class07055> list = var1.<List<class07055>>N("active_effects", class07055.u.listOf()).orElse(List.of());
      ((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).clear();

      for (class07055 class07055 : list) {
         ((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).put(class07055.L(), class07055);
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_6 = true;
      }

      this.method_6033(var1.N("Health", this.method_6063()));
      this.fields_2212a028292fd3c078969e3ee4c71d9e8_0 = var1.N("HurtTime", (short)0);
      this.fields_2212a028292fd3c078969e3ee4c71d9e8_2 = var1.N("DeathTime", (short)0);
      this.fields_8212a028292fd3c078969e3ee4c71d9e8_1 = var1.N("HurtByTimestamp", 0);
      var1.M("Team").ifPresent(var1x -> {
         class06683 class06683 = this.method_73183().method_8428();
         class00502 class00502 = class06683.y(var1x);
         if (class00502 == null || !class06683.N(this.method_5845(), class00502)) {
            staticFields_0212a028292fd3c078969e3ee4c71d9e8_0.warn("Unable to add mob to team \"{}\" (that team probably doesn't exist)", var1x);
         }
      });
      this.method_5729(7, var1.N("FallFlying", false));
      var1.<class07209>N("sleeping_pos", class07209.field_25064).ifPresentOrElse(var1x -> {
         this.method_18402(var1x);
         this.field_6011.N(field_18064, class01312.field_18078);
         if (!this.field_5953) {
            this.method_18392(var1x);
         }
      }, this::method_18399);
      var1.<Dynamic>N("Brain", Codec.PASSTHROUGH).ifPresent(var1x -> {
         this.fields212a028292fd3c078969e3ee4c71d9e8();
         this.fields_12212a028292fd3c078969e3ee4c71d9e8_1 = this.method_18867((Dynamic<?>)var1x);
      });
      this.fields_5212a028292fd3c078969e3ee4c71d9e8_2 = class08372.N(var1, "last_hurt_by_player");
      this.fields_6212a028292fd3c078969e3ee4c71d9e8_0 = var1.N("last_hurt_by_player_memory_time", 0);
      this.fields_8212a028292fd3c078969e3ee4c71d9e8_0 = class08372.N(var1, "last_hurt_by_mob");
      this.fields_8212a028292fd3c078969e3ee4c71d9e8_1 = var1.N("ticks_since_last_hurt_by_mob", 0) + this.field_6012;
      this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.N(var1.<class08599>N("equipment", class08599.N).orElseGet(class08599::new));
      this.fields_13212a028292fd3c078969e3ee4c71d9e8_2 = var1.<class00028>N("locator_bar_icon", class00028.N).orElseGet(class00028::new);
   }

   @Override
   public boolean method_5757() {
      return !this.method_6113() && super.method_5757();
   }

   public abstract class07070 method_6068();

   @Override
   public void method_5842() {
      super.method_5842();
      this.method_38785();
   }

   @Override
   public class08382 method_66233() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_7212a028292fd3c078969e3ee4c71d9e8_3;
   }

   @Override
   public void method_5683(float var1, int var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_7212a028292fd3c078969e3ee4c71d9e8_4 = (double)var1;
      this.fields_7212a028292fd3c078969e3ee4c71d9e8_5 = var2;
   }

   public class06584 method_6047() {
      return this.method_6118(class07085.field_6173);
   }

   @Override
   public class06889 method_52538(class07049 var1) {
      class06889 class06889 = this.method_73189();
      class01325 class01325 = this.method_18377(this.method_18376());
      float f = this.method_55693() * this.method_17825();
      class01325 class01325x = class01325;
      return class06889.i(this.redirect$dia000$viafabricplus$getPassengerRidingPos1_20_1(this, var1, class01325x, f));
   }

   @Override
   public float method_5791() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_4212a028292fd3c078969e3ee4c71d9e8_2;
   }

   public class06584 method_6079() {
      return this.method_6118(class07085.field_6171);
   }

   @Override
   public void method_5711(byte var1) {
      this.handler$cfe000$nursultan$injectHandleStatus(var1, null);
      switch (var1) {
         case 2:
            this.method_76773();
            break;
         case 3:
            class04891 class04891 = this.method_6002();
            if (class04891 != null) {
               this.method_5783(class04891, this.method_6107(), (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F);
            }

            if (!(this instanceof class08036)) {
               this.method_6033(0.0F);
               this.method_6078(this.method_48923().s());
            }
            break;
         case 46:
            short short1 = 128;

            for (int i = 0; i < 128; i++) {
               double d0 = i / 127.0;
               float f = (this.field_5974.z() - 0.5F) * 0.2F;
               float f1 = (this.field_5974.z() - 0.5F) * 0.2F;
               float f2 = (this.field_5974.z() - 0.5F) * 0.2F;
               double d1 = class04995.u(d0, this.field_6014, this.method_23317()) + (this.field_5974.U() - 0.5) * this.method_17681() * 2.0;
               double d2 = class04995.u(d0, this.field_6036, this.method_23318()) + this.field_5974.U() * this.method_17682();
               double d3 = class04995.u(d0, this.field_5969, this.method_23321()) + (this.field_5974.U() - 0.5) * this.method_17681() * 2.0;
               this.method_73183().method_8406(class07107.NM, d1, d2, d3, f, f1, f2);
            }
            break;
         case 47:
            this.method_6045(this.method_6118(class07085.field_6173));
            break;
         case 48:
            this.method_6045(this.method_6118(class07085.field_6171));
            break;
         case 49:
            this.method_6045(this.method_6118(class07085.field_6169));
            break;
         case 50:
            this.method_6045(this.method_6118(class07085.field_6174));
            break;
         case 51:
            this.method_6045(this.method_6118(class07085.field_6172));
            break;
         case 52:
            this.method_6045(this.method_6118(class07085.field_6166));
            break;
         case 54:
            class01451.y(this);
            break;
         case 55:
            this.method_30127();
            break;
         case 60:
            this.method_36549();
            break;
         case 65:
            this.method_6045(this.method_6118(class07085.field_48824));
            break;
         case 67:
            this.method_66276();
            break;
         case 68:
            this.method_6045(this.method_6118(class07085.field_55946));
            break;
         default:
            super.method_5711(var1);
      }
   }

   @Override
   public void method_48922(class07072 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_3212a028292fd3c078969e3ee4c71d9e8_3.N(1.5F);
      this.field_6008 = 20;
      this.fields_2212a028292fd3c078969e3ee4c71d9e8_1 = 10;
      this.fields_2212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_2212a028292fd3c078969e3ee4c71d9e8_1;
      class04891 class04891 = this.method_6011(var1);
      if (class04891 != null) {
         this.method_5783(class04891, this.method_6107(), (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F);
      }

      this.fields_9212a028292fd3c078969e3ee4c71d9e8_6 = var1;
      this.fields_10212a028292fd3c078969e3ee4c71d9e8_0 = this.method_73183().N();
   }

   @Override
   public void method_5728(boolean var1) {
      super.method_5728(var1);
      class07469 class07469 = this.method_5996(class05298.l);
      class07469.L(staticFields_2212a028292fd3c078969e3ee4c71d9e8_4.N());
      if (var1) {
         class07469.y(staticFields_2212a028292fd3c078969e3ee4c71d9e8_4);
      }
   }

   @Override
   public void method_5879(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_2212a028292fd3c078969e3ee4c71d9e8_1 = 10;
      this.fields_2212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_2212a028292fd3c078969e3ee4c71d9e8_1;
   }

   @Override
   public boolean method_5822(boolean var1) {
      return super.method_5822(var1) && !this.method_6113();
   }

   @Override
   public boolean method_20232() {
      return super.method_20232() || !this.method_6128() && this.method_41328(class01312.field_18077);
   }

   @Override
   public boolean method_5851() {
      return !this.method_73183().method_8608() && this.method_6059(class07047.l) || super.method_5851();
   }

   public class07438(class07078<? extends class07438> var1, class07299 var2) {
      super(var1, var2);
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_0212a028292fd3c078969e3ee4c71d9e8_1 = new class07076(this);
      this.fields_0212a028292fd3c078969e3ee4c71d9e8_2 = this.wrapOperation$cfe000$nursultan$wrapOperationInit(var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 0, "[]");
         return Maps.newHashMap();
      });
      this.fields_0212a028292fd3c078969e3ee4c71d9e8_3 = class07536.N_74(class07085.class, var0 -> class06584.E);
      this.fields_0212a028292fd3c078969e3ee4c71d9e8_5 = false;
      this.fields_3212a028292fd3c078969e3ee4c71d9e8_3 = new class03269();
      this.fields_5212a028292fd3c078969e3ee4c71d9e8_1 = new class02768(this);
      this.fields_7212a028292fd3c078969e3ee4c71d9e8_3 = new class08382(this);
      this.fields_7212a028292fd3c078969e3ee4c71d9e8_6 = true;
      this.fields_9212a028292fd3c078969e3ee4c71d9e8_0 = class06584.E;
      this.fields_9212a028292fd3c078969e3ee4c71d9e8_3 = -2147483648L;
      this.fields_9212a028292fd3c078969e3ee4c71d9e8_5 = Optional.empty();
      this.fields_13212a028292fd3c078969e3ee4c71d9e8_0 = new EnumMap<>(class07085.class);
      this.fields_13212a028292fd3c078969e3ee4c71d9e8_2 = new class00028();
      this.fields_0212a028292fd3c078969e3ee4c71d9e8_0 = new class05320(class05316.N(var1));
      this.method_6033(this.method_6063());
      this.fields_13212a028292fd3c078969e3ee4c71d9e8_1 = this.method_67518();
      this.field_23807 = true;
      this.method_23311();
      this.method_36456(this.field_5974.z() * (float) (Math.PI * 2));
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = this.method_36454();
      this.fields_12212a028292fd3c078969e3ee4c71d9e8_1 = this.method_18867(staticFields_7212a028292fd3c078969e3ee4c71d9e8_6);
   }

   static {
      staticFields212a028292fd3c078969e3ee4c71d9e8();
   }

   private class07438 self() {
      return this;
   }

   public void lithium$SetClimbingMobCachingSectionUpdateBehavior(boolean var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_13212a028292fd3c078969e3ee4c71d9e8_5 = var1;
   }

   private float m_redirect$ecp000$viafabricplus_visuals$changeBodyRotationInterpolation_83(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (VisualSettings.INSTANCE.changeBodyRotationInterpolation.isEnabled()) {
         var1 = class04995.N(var1, -75.0F, 75.0F);
         this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.method_36454() - var1;
         if (Math.abs(var1) > 50.0F) {
            this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 + var1 * 0.2F;
         }

         return Float.MIN_VALUE;
      } else {
         return Math.abs(var1);
      }
   }

   private void m_handler$zbk000$fabric_block_api_v1$allowTaggedBlocksForTrapdoorClimbing_84(
      class07209 var1, class00500 var2, CallbackInfoReturnable var3, class00500 var4
   ) {
      if (var4.N(BlockFunctionalityTags.CAN_CLIMB_TRAPDOOR_ABOVE)) {
         if (var4.i() instanceof class07123) {
            if (var4.L(class07123.y) == var2.L(class00624.R)) {
               var3.setReturnValue(true);
            }
         } else {
            var3.setReturnValue(true);
         }
      }
   }

   private float m_redirect$ecp000$viafabricplus_visuals$alwaysRotateWhenWalkingBackwards_85(float var1) {
      return VisualSettings.INSTANCE.sidewaysBackwardsRunning.isEnabled() ? 0.0F : class04995.L(var1);
   }

   private class07211 m_wrapOperation$zed000$fabric_entity_events_v1$onGetSleepingDirection_86(class07290 var1, class07209 var2, Operation var3) {
      class07211 class07211 = (class07211)var3.call(new Object[]{var1, var2});
      return ((ModifySleepingDirection)EntitySleepEvents.MODIFY_SLEEPING_DIRECTION.invoker()).modifySleepDirection(this, var2, class07211);
   }

   private boolean isClient() {
      return this.method_73183().method_8608();
   }

   private void handler$dii000$viafabricplus$removeShieldSlotPreference(class06584 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_9_3) && var1.N(class06570.lo)) {
         var2.setReturnValue(class07085.field_6173);
      }
   }

   private void m_handler$zek000$fabric_entity_events_v1$beforeAddEffect_103(class07055 var1, class07049 var2, CallbackInfoReturnable var3) {
      if (!this.isClient()) {
         ((BeforeAdd)ServerMobEffectEvents.BEFORE_ADD.invoker()).beforeAdd(var1, this.self(), MobEffectUtil.getCommandContext());
      }
   }

   private int modifyReturnValue$cfe000$nursultan$onGetHandSwingDuration(int var1) {
      if (this instanceof class11781) {
         class09354 class09354 = class09354.y(var1);
         class11938.L().L(class09354);
         return class09354.N();
      } else {
         return var1;
      }
   }

   private void handler$dog000$viafabricplus$moveMovementSpeedFactors(CallbackInfo var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_7212a028292fd3c078969e3ee4c71d9e8_0 * 0.98F;
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = this.fields_7212a028292fd3c078969e3ee4c71d9e8_2 * 0.98F;
      }
   }

   public boolean m_redirect$zed000$fabric_entity_events_v1$beforeEntityKilled_104(class07438 var1, class04782 var2, class07072 var3, float var4) {
      return this.method_29504() && ((AllowDeath)ServerLivingEntityEvents.ALLOW_DEATH.invoker()).allowDeath(var1, var3, var4);
   }

   private boolean m_wrapMethod$zek000$fabric_entity_events_v1$allowAddEffect_105(class07055 var1, Operation var2) {
      if (this.isClient()) {
         return (Boolean)var2.call(new Object[]{var1});
      } else {
         return !((AllowAdd)ServerMobEffectEvents.ALLOW_ADD.invoker()).allowAdd(var1, this.self(), MobEffectUtil.getCommandContext())
            ? false
            : (Boolean)var2.call(new Object[]{var1});
      }
   }

   private void m_handler$zed000$fabric_entity_events_v1$onIsSleepingInBed_106(class07209 var1, CallbackInfoReturnable var2) {
      class00500 class00500 = this.method_73183().method_8320(var1);
      class07082 class07082 = ((AllowBed)EntitySleepEvents.ALLOW_BED.invoker()).allowBed(this, var1, class00500, var2.getReturnValueZ());
      if (class07082 != class07082.i) {
         var2.setReturnValue(class07082.N());
      }
   }

   private void handler$dmf000$viafabricplus$allowGappedLadderClimb(CallbackInfoReturnable var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (ProtocolTranslator.getTargetVersion().olderThan(LegacyProtocolVersion.b1_5tob1_5_2) && !var1.getReturnValueZ() && !this.method_7325()) {
         class07209 class07209 = this.method_24515().method_10084();
         class00500 class00500 = this.method_73183().method_8320(class07209);
         if (class00500.N(class01210.yu)) {
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_5 = Optional.of(class07209);
            var1.setReturnValue(true);
         } else if (class00500.i() instanceof class00624 && this.method_6077(class07209, class00500)) {
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_5 = Optional.of(class07209);
            var1.setReturnValue(true);
         }
      }
   }

   private void m_handler$zed000$fabric_entity_events_v1$beforeDamage_107(class04782 var1, class07072 var2, float var3, CallbackInfoReturnable var4) {
      if (!((AllowDamage)ServerLivingEntityEvents.ALLOW_DAMAGE.invoker()).allowDamage(this, var2, var3)) {
         var4.setReturnValue(false);
      }
   }

   private boolean redirect$dna000$viafabricplus$dontStopGlidingWhenClimbing(class07438 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_4) && var1.method_6101();
   }

   private void handler$dci000$viafabricplus$applyLevitationVelocity(double var1, boolean var3, class06889 var4, CallbackInfoReturnable var5) {
      class07055 class07055 = this.method_6112(class07047.d);
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) && class07055 != null) {
         var5.setReturnValue(new class06889(var4.M, var4.B + ((class07055.i() + 1) * 0.05 - var4.B) * 0.2, var4.Z));
      }
   }

   private boolean m_redirect$zed000$fabric_entity_events_v1$setOccupiedState_108(class07299 var1, class07209 var2, class00500 var3, int var4) {
      class00500 class00500 = var1.method_8320(var2);
      boolean flag = var3.L(class07789.L);
      if (((SetBedOccupationState)EntitySleepEvents.SET_BED_OCCUPATION_STATE.invoker()).setBedOccupationState(this, var2, class00500, flag)) {
         return true;
      } else {
         return class00500.y(class07789.L) ? var1.method_8652(var2, class00500.y(class07789.L, flag), var4) : false;
      }
   }

   private double redirect$dnn000$viafabricplus$dontApplyLavaMovement(class07438 var1, class03530 var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2) ? Double.MAX_VALUE : var1.method_5861(var2);
   }

   private boolean redirect$dna000$viafabricplus$allowElytraWhenLevitating(class07438 var1, class03556 var2) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_15_2) && var1.method_6059(var2);
   }

   private void wrapOperation$cfe000$nursultan$wrapOperationTickMovement(class07438 var1, class06889 var2, Operation var3) {
      if (var1 instanceof class04453) {
         class11379 class11379 = class11379.L();
         class11938.L().L(class11379);
         if (!class11379.y()) {
            var3.call(new Object[]{var1, var2});
         }
      } else {
         var3.call(new Object[]{var1, var2});
      }
   }

   private boolean redirect$dnn000$viafabricplus$modifySwimSprintSpeed(class07438 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_12_2) && var1.method_5624();
   }

   private void m_handler$zek000$fabric_entity_events_v1$afterAddEffect_109(class07055 var1, class07049 var2, CallbackInfo var3) {
      if (!this.isClient()) {
         ((AfterAdd)ServerMobEffectEvents.AFTER_ADD.invoker()).afterAdd(var1, this.self(), MobEffectUtil.getCommandContext());
      }
   }

   private double redirect$dnd000$viafabricplus$dontLimitJumpVelocity(double var1, double var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) ? var1 : Math.max(var1, var3);
   }

   private void m_handler$zek000$fabric_entity_events_v1$afterRemoveEffect_110(Collection var1, CallbackInfo var2) {
      if (!this.isClient()) {
         for (class07055 class07055 : var1) {
            ((AfterRemove)ServerMobEffectEvents.AFTER_REMOVE.invoker()).afterRemove(class07055, this.self(), MobEffectUtil.getCommandContext());
         }
      }
   }

   private boolean redirect$dii000$viafabricplus$replaceItemStackEqualsCheck(class06584 var1, class06584 var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_3) ? var1 == var2 : class06584.y(var1, var2);
   }

   private boolean redirect$dci000$viafabricplus$changeFluidGravityCondition(class07438 var1) {
      return var1.method_5624() && !ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) || var1.method_5681();
   }

   private void handler$dnn000$viafabricplus$modifySwimSprintFallSpeed(double var1, boolean var3, class06889 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) && !this.method_5740()) {
         var5.setReturnValue(new class06889(var4.M, var4.B - 0.02, var4.Z));
      }
   }

   private void m_handler$zek000$fabric_entity_events_v1$beforeRemoveEffect_111(class03556 var1, CallbackInfoReturnable var2) {
      if (!this.isClient()) {
         class07055 class07055 = this.self().method_6112(var1);
         if (class07055 != null) {
            ((BeforeRemove)ServerMobEffectEvents.BEFORE_REMOVE.invoker()).beforeRemove(class07055, this, MobEffectUtil.getCommandContext());
         }
      }
   }

   private class06889 redirect$dia000$viafabricplus$getPassengerRidingPos1_20_1(class07438 var1, class07049 var2, class01325 var3, float var4) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20)
         ? EntityRidingOffsetsPre1_20_2.getMountedHeightOffset(var1, var2).y(-var1.method_36454() * (float) (Math.PI / 180.0))
         : this.method_52533(var2, var3, var4);
   }

   private boolean wrapWithCondition$ebi000$viafabricplus$dontSwingHand(class07438 var1, class07050 var2) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_15_2);
   }

   public void lithium$handleAddedToLevel(class07299 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.fields_13212a028292fd3c078969e3ee4c71d9e8_1 instanceof MaybeInLevelObject) {
         this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.lithium$handleAddedToLevel(var1);
      }
   }

   @Nullable
   @Override
   public class07438 method_72393() {
      return this;
   }

   public boolean method_6113() {
      return this.method_18398().isPresent();
   }

   private void handler$boi000$lithium$resetEquipmentChanged(CallbackInfo var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!(this instanceof class08036)) {
         this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.lithium$onEquipmentChangesSent();
      }
   }

   private boolean redirect$dmf000$viafabricplus$dontCheckLastTick(class07438 var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4) ? this.method_55667().N(class00869.ba) : var1.field_28628;
   }

   private class07469 redirect$bol000$lithium$doDelayedBlockStateAirTest(class07438 var1, class03556 var2) {
      return this.method_43261().P() ? null : this.method_5996(var2);
   }

   private double constant$dmm000$viafabricplus$modifyVelocityZero(double var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) ? 0.005 : var1;
   }

   private boolean redirect$dnf000$viafabricplus$modifyLoadedCheck(class07299 var1, class07209 var2) {
      return !ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)
         ? this.method_73183().E(var2)
         : this.method_73183().E(var2) && var1.method_8398().L(var2.method_10263() >> 4, var2.method_10260() >> 4);
   }

   private boolean redirect$dnn000$viafabricplus$disableClimbing(class07438 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_13_2) && var1.field_5976;
   }

   private HashMap wrapOperation$cfe000$nursultan$wrapOperationInit(Operation var1) {
      switch (this) {
         case class04453 class04453:
            class11938.L().L(class10997.N(null, class10966.staticFields_0cabd41f8be773279a9b5245fe31e3239_2));
            return new class10749(this);
         case null:
         default:
            return (HashMap)var1.call(new Object[0]);
      }
   }

   private void m_handler$zed000$fabric_entity_events_v1$notifyDeath_112(class07072 var1, CallbackInfo var2) {
      ((AfterDeath)ServerLivingEntityEvents.AFTER_DEATH.invoker()).afterDeath(this, var1);
   }

   private boolean localvar$dnn000$viafabricplus$modifyMovingDown(boolean var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_13_2) && var1;
   }

   private static void staticFields212a028292fd3c078969e3ee4c71d9e8() {
      staticFields_0212a028292fd3c078969e3ee4c71d9e8_0 = null;
      staticFields_0212a028292fd3c078969e3ee4c71d9e8_1 = "active_effects";
      staticFields_0212a028292fd3c078969e3ee4c71d9e8_2 = "attributes";
      staticFields_1212a028292fd3c078969e3ee4c71d9e8_0 = "sleeping_pos";
      staticFields_1212a028292fd3c078969e3ee4c71d9e8_1 = "equipment";
      staticFields_1212a028292fd3c078969e3ee4c71d9e8_2 = "Brain";
      staticFields_1212a028292fd3c078969e3ee4c71d9e8_3 = "FallFlying";
      staticFields_1212a028292fd3c078969e3ee4c71d9e8_4 = "HurtTime";
      staticFields_1212a028292fd3c078969e3ee4c71d9e8_5 = "DeathTime";
      staticFields_2212a028292fd3c078969e3ee4c71d9e8_0 = "HurtByTimestamp";
      staticFields_2212a028292fd3c078969e3ee4c71d9e8_1 = "Health";
      staticFields_2212a028292fd3c078969e3ee4c71d9e8_2 = null;
      staticFields_2212a028292fd3c078969e3ee4c71d9e8_3 = null;
      staticFields_2212a028292fd3c078969e3ee4c71d9e8_4 = null;
      staticFields_2212a028292fd3c078969e3ee4c71d9e8_5 = 98;
      staticFields_3212a028292fd3c078969e3ee4c71d9e8_0 = 100;
      staticFields_3212a028292fd3c078969e3ee4c71d9e8_1 = 105;
      staticFields_3212a028292fd3c078969e3ee4c71d9e8_2 = 106;
      staticFields_3212a028292fd3c078969e3ee4c71d9e8_3 = 100;
      staticFields_3212a028292fd3c078969e3ee4c71d9e8_4 = 40;
      staticFields_3212a028292fd3c078969e3ee4c71d9e8_5 = 0.003;
      staticFields_3212a028292fd3c078969e3ee4c71d9e8_6 = 0.08;
      staticFields_3212a028292fd3c078969e3ee4c71d9e8_7 = 20;
      staticFields_4212a028292fd3c078969e3ee4c71d9e8_0 = 0.98F;
      staticFields_4212a028292fd3c078969e3ee4c71d9e8_1 = 10;
      staticFields_4212a028292fd3c078969e3ee4c71d9e8_2 = 2;
      staticFields_4212a028292fd3c078969e3ee4c71d9e8_3 = 0.42F;
      staticFields_4212a028292fd3c078969e3ee4c71d9e8_4 = 0.4F;
      staticFields_4212a028292fd3c078969e3ee4c71d9e8_5 = 20;
      staticFields_4212a028292fd3c078969e3ee4c71d9e8_6 = 128.0;
      staticFields_4212a028292fd3c078969e3ee4c71d9e8_7 = 1;
      staticFields_5212a028292fd3c078969e3ee4c71d9e8_0 = 2;
      staticFields_5212a028292fd3c078969e3ee4c71d9e8_1 = 4;
      staticFields_6212a028292fd3c078969e3ee4c71d9e8_0 = null;
      staticFields_6212a028292fd3c078969e3ee4c71d9e8_1 = null;
      staticFields_6212a028292fd3c078969e3ee4c71d9e8_2 = null;
      staticFields_6212a028292fd3c078969e3ee4c71d9e8_3 = null;
      staticFields_6212a028292fd3c078969e3ee4c71d9e8_4 = null;
      staticFields_6212a028292fd3c078969e3ee4c71d9e8_5 = null;
      staticFields_6212a028292fd3c078969e3ee4c71d9e8_6 = null;
      staticFields_7212a028292fd3c078969e3ee4c71d9e8_0 = 15;
      staticFields_7212a028292fd3c078969e3ee4c71d9e8_1 = null;
      staticFields_7212a028292fd3c078969e3ee4c71d9e8_2 = 0.5F;
      staticFields_7212a028292fd3c078969e3ee4c71d9e8_3 = 0.5F;
      staticFields_7212a028292fd3c078969e3ee4c71d9e8_4 = 0.04F;
      staticFields_7212a028292fd3c078969e3ee4c71d9e8_5 = null;
      staticFields_7212a028292fd3c078969e3ee4c71d9e8_6 = null;
   }

   private void handler$cfe000$nursultan$injectHandleStatus(byte var1, CallbackInfo var2) {
      if (var1 == 30) {
         class11497.N(this);
      }
   }

   private void m_handler$zed000$fabric_entity_events_v1$onSleep_113(class07209 var1, CallbackInfo var2) {
      ((StartSleeping)EntitySleepEvents.START_SLEEPING.invoker()).onStartSleeping(this, var1);
   }

   private boolean redirect$dnd000$viafabricplus$disableJumpOnLadder(class07438 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_13_2) && this.fields_6212a028292fd3c078969e3ee4c71d9e8_4;
   }

   private void handler$boi000$lithium$skipSentEquipmentComparison(CallbackInfoReturnable var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.lithium$hasUnsentEquipmentChanges()) {
         var1.setReturnValue(null);
      }
   }

   private double redirect$dnn000$viafabricplus$redirectFluidHeight(class07438 var1, class03530 var2) {
      return (
               ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)
                  || ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)
            )
            && var2 == class01231.N
            && this.method_5799()
         ? 1.0
         : var1.method_5861(var2);
   }

   private void m_handler$zed000$fabric_entity_events_v1$afterDamage_114(
      class04782 var1, class07072 var2, float var3, CallbackInfoReturnable var4, float var5, boolean var6
   ) {
      if (!this.method_29504()) {
         ((AfterDamage)ServerLivingEntityEvents.AFTER_DAMAGE.invoker()).afterDamage(this, var2, var5, var3, var6);
      }
   }

   private boolean redirect$dna000$viafabricplus$allowElytraInVehicle(class07438 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_4) && var1.method_5765();
   }

   private void m_handler$zed000$fabric_entity_events_v1$onWakeUp_115(CallbackInfo var1) {
      class07209 class07209 = this.method_18398().orElse(null);
      if (class07209 != null) {
         ((StopSleeping)EntitySleepEvents.STOP_SLEEPING.invoker()).onStopSleeping(this, class07209);
      }
   }

   private void handler$dmf000$viafabricplus$disableCrawling(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var1.setReturnValue(false);
      }
   }

   private void handler$dmf000$viafabricplus$preventEntityPush(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var1.cancel();
      }
   }

   private float constant$dnn000$viafabricplus$modifySwimFriction(float var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2) ? this.method_6120() : var1;
   }

   private class07105 m_modifyExpressionValue$zla000$fabric_particles_v1$modifyBlockStateParticleEffect_116(
      class07105 var1, double var2, boolean var4, class00500 var5, class07209 var6
   ) {
      var1.fabric_setBlockPos(var6);
      return var1;
   }

   private void handler$dnd000$viafabricplus$removeJumpDelay(CallbackInfo var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (ProtocolTranslator.getTargetVersion().olderThan(LegacyProtocolVersion.r1_0_0tor1_0_1)) {
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_5 = 0;
      }
   }

   public void lithium$OnFeetBlockCacheDeleted() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.fields_13212a028292fd3c078969e3ee4c71d9e8_5) {
         this.updateClimbingMobCachingSection(null);
      }
   }

   public void lithium$OnFeetBlockCacheSet(class00500 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.fields_13212a028292fd3c078969e3ee4c71d9e8_5) {
         this.updateClimbingMobCachingSection(var1);
      }
   }

   public void lithium$handleRemovedFromLevel(class07299 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.fields_13212a028292fd3c078969e3ee4c71d9e8_1 instanceof MaybeInLevelObject) {
         this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.lithium$handleRemovedFromLevel(var1);
      }
   }

   private boolean method_6016$mixinextras$wrapped$486(class03556 var1) {
      this.m_handler$zek000$fabric_entity_events_v1$beforeRemoveEffect_111(var1, null);
      class07055 class07055 = this.method_6111(var1);
      if (class07055 != null) {
         this.method_6129(List.of(class07055));
         return true;
      } else {
         return false;
      }
   }

   private void handler$cfe000$nursultan$injectJump(CallbackInfo var1) {
      if (this instanceof class04453) {
         class11938.L().L(class10959.N());
      }
   }

   private void handler$zzl000$baritone$preMoveRelative(CallbackInfo var1) {
      this.getBaritone().ifPresent(var1x -> {
         this.fields212a028292fd3c078969e3ee4c71d9e8();
         this.fields_13212a028292fd3c078969e3ee4c71d9e8_3 = new RotationMoveEvent(Type.JUMP, this.method_36454(), this.method_36455());
         var1x.getGameEventHandler().onPlayerRotationMove(this.fields_13212a028292fd3c078969e3ee4c71d9e8_3);
      });
   }

   private float redirect$zzl000$baritone$overrideYaw(class07438 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return var1 instanceof class04453 && BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)this) != null
         ? this.fields_13212a028292fd3c078969e3ee4c71d9e8_3.getYaw()
         : var1.method_36454();
   }

   private void fields212a028292fd3c078969e3ee4c71d9e8() {
      if (!this.fields_0212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_0212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_0212a028292fd3c078969e3ee4c71d9e8_4 = false;
         this.fields_0212a028292fd3c078969e3ee4c71d9e8_5 = false;
      }

      if (!this.fields_1212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_1212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_1212a028292fd3c078969e3ee4c71d9e8_0 = 0;
         this.fields_1212a028292fd3c078969e3ee4c71d9e8_1 = 0;
         this.fields_1212a028292fd3c078969e3ee4c71d9e8_2 = 0;
      }

      if (!this.fields_2212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_2212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_2212a028292fd3c078969e3ee4c71d9e8_0 = 0;
         this.fields_2212a028292fd3c078969e3ee4c71d9e8_1 = 0;
         this.fields_2212a028292fd3c078969e3ee4c71d9e8_2 = 0;
         this.fields_2212a028292fd3c078969e3ee4c71d9e8_3 = 0.0F;
      }

      if (!this.fields_3212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_3212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_3212a028292fd3c078969e3ee4c71d9e8_0 = 0.0F;
         this.fields_3212a028292fd3c078969e3ee4c71d9e8_1 = 0;
         this.fields_3212a028292fd3c078969e3ee4c71d9e8_2 = 0;
      }

      if (!this.fields_4212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_4212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = 0.0F;
         this.fields_4212a028292fd3c078969e3ee4c71d9e8_1 = 0.0F;
         this.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = 0.0F;
      }

      if (!this.fields_5212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_5212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_5212a028292fd3c078969e3ee4c71d9e8_0 = 0.0F;
      }

      if (!this.fields_6212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_6212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_6212a028292fd3c078969e3ee4c71d9e8_0 = 0;
         this.fields_6212a028292fd3c078969e3ee4c71d9e8_1 = false;
         this.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
         this.fields_6212a028292fd3c078969e3ee4c71d9e8_3 = 0.0F;
         this.fields_6212a028292fd3c078969e3ee4c71d9e8_4 = false;
      }

      if (!this.fields_7212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_0 = 0.0F;
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_1 = 0.0F;
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = 0.0F;
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_4 = 0.0;
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_5 = 0;
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_6 = false;
      }

      if (!this.fields_8212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_1 = 0;
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_3 = 0;
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_4 = 0.0F;
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_5 = 0;
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_6 = 0.0F;
      }

      if (!this.fields_9212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_1 = 0;
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_2 = 0;
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_3 = 0L;
      }

      if (!this.fields_10212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_10212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_10212a028292fd3c078969e3ee4c71d9e8_0 = 0L;
         this.fields_10212a028292fd3c078969e3ee4c71d9e8_1 = 0;
         this.fields_10212a028292fd3c078969e3ee4c71d9e8_2 = 0.0F;
      }

      if (!this.fields_11212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_11212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_11212a028292fd3c078969e3ee4c71d9e8_1 = 0.0F;
      }

      if (!this.fields_12212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_12212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_12212a028292fd3c078969e3ee4c71d9e8_0 = 0.0F;
         this.fields_12212a028292fd3c078969e3ee4c71d9e8_2 = false;
      }

      if (!this.fields_13212a028292fd3c078969e3ee4c71d9e8_init) {
         this.fields_13212a028292fd3c078969e3ee4c71d9e8_init = true;
         this.fields_13212a028292fd3c078969e3ee4c71d9e8_5 = false;
      }
   }

   private void handler$cfe000$nursultan$injectGetHealth(CallbackInfoReturnable var1) {
      var1.setReturnValue(class11907.N(this, (Float)var1.getReturnValue()));
   }

   private int constant$cfe000$nursultan$onTickMovement(int var1) {
      if (this instanceof class11781) {
         class11395 class11395 = class11395.N(var1);
         class11938.L().L(class11395);
         return class11395.N();
      } else {
         return var1;
      }
   }

   private boolean redirect$bol000$lithium$delayAirTest(class00500 var1) {
      return false;
   }

   private void handler$boj000$lithium$skipStopFlying(CallbackInfo var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.method_6128() && this.fields_9212a028292fd3c078969e3ee4c71d9e8_2 == 0) {
         var1.cancel();
      }
   }

   private void handler$zzl000$baritone$onPreElytraMove(class06889 var1, CallbackInfoReturnable var2) {
      this.getBaritone().ifPresent(var1x -> {
         this.fields212a028292fd3c078969e3ee4c71d9e8();
         this.fields_13212a028292fd3c078969e3ee4c71d9e8_4 = new RotationMoveEvent(Type.MOTION_UPDATE, this.method_36454(), this.method_36455());
         var1x.getGameEventHandler().onPlayerRotationMove(this.fields_13212a028292fd3c078969e3ee4c71d9e8_4);
         this.method_36456(this.fields_13212a028292fd3c078969e3ee4c71d9e8_4.getYaw());
         this.method_36457(this.fields_13212a028292fd3c078969e3ee4c71d9e8_4.getPitch());
      });
   }

   public void handler$bop000$lithium$handleStopRiding(CallbackInfo var1) {
      if (this instanceof NavigatingEntity) {
         ((NavigatingEntity)this).lithium$updateNavigationRegistration();
      }
   }

   private double redirect$dna000$viafabricplus$fixCosTable(double var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18) ? class04995.P((float)var1) : Math.cos(var1);
   }

   private void handler$bok000$lithium$skipGetDuration(CallbackInfo var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.fields_0212a028292fd3c078969e3ee4c71d9e8_4 && this.fields_1212a028292fd3c078969e3ee4c71d9e8_0 == 0) {
         var1.cancel();
      }
   }

   private void handler$zzl000$baritone$onPostElytraMove(CallbackInfo var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.fields_13212a028292fd3c078969e3ee4c71d9e8_4 != null) {
         this.method_36456(this.fields_13212a028292fd3c078969e3ee4c71d9e8_4.getOriginal().getYaw());
         this.method_36457(this.fields_13212a028292fd3c078969e3ee4c71d9e8_4.getOriginal().getPitch());
         this.fields_13212a028292fd3c078969e3ee4c71d9e8_4 = null;
      }
   }

   private class00500 redirect$bol000$lithium$delayGetBlockState(class07438 var1) {
      return null;
   }

   private boolean method_6049$mixinextras$wrapped$484(class07055 var1) {
      if (this.method_5864().N(class01217.o)) {
         return !var1.N(class07047.H);
      } else if (this.method_5864().N(class01217.J)) {
         return !var1.N(class07047.e);
      } else {
         return !this.method_5864().N(class01217.l) ? true : !var1.N(class07047.z) && !var1.N(class07047.j);
      }
   }

   private void handler$cfe000$nursultan$injectCanGlide(CallbackInfoReturnable var1) {
      if (this instanceof class11781) {
         class11366 class11366 = class11366.L();
         class11938.L().L(class11366);
         if (class11366.y()) {
            var1.setReturnValue(false);
         }
      }
   }

   private void redirect$dnf000$viafabricplus$dontResetLevitationFallDistance(class07438 var1) {
      if (this.method_6059(class07047.Y) || ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_12_2)) {
         var1.method_38785();
      }
   }

   private void m_handler$zek000$fabric_entity_events_v1$beforeExpireRemoveEffect_117(CallbackInfo var1, class07055 var2) {
      if (!this.isClient()) {
         ((BeforeRemove)ServerMobEffectEvents.BEFORE_REMOVE.invoker()).beforeRemove(var2, this.self(), MobEffectUtil.getCommandContext());
      }
   }

   private void m_handler$zek000$fabric_entity_events_v1$beforeForceAddEffect_118(class07055 var1, class07049 var2, CallbackInfo var3) {
      if (!this.isClient()) {
         ((BeforeAdd)ServerMobEffectEvents.BEFORE_ADD.invoker()).beforeAdd(var1, this.self(), MobEffectUtil.getCommandContext());
      }
   }

   private boolean m_wrapOperation$zed000$fabric_entity_events_v1$onEntityKilledOther_119(
      class07049 var1, class04782 var2, @Nullable class07438 var3, class07072 var4, Operation var5
   ) {
      boolean flag = (Boolean)var5.call(new Object[]{var1, var2, var3, var4});
      ((AfterKilledOtherEntity)ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.invoker()).afterKilledOtherEntity(var2, var1, var3, var4);
      return flag;
   }

   private void m_handler$zhc000$fabric_lifecycle_events_v1$getEquipmentChanges_120(
      CallbackInfoReturnable var1, class07085 var2, class06584 var3, class06584 var4
   ) {
      ((EquipmentChange)ServerEntityEvents.EQUIPMENT_CHANGE.invoker()).onChange(this, var2, var3, var4);
   }

   private void m_handler$zge000$fabric_item_api_v1$onGetPreferredEquipmentSlot_121(class06584 var1, CallbackInfoReturnable var2) {
      EquipmentSlotProvider equipmentslotprovider = var1.B().fabric_getEquipmentSlotProvider();
      if (equipmentslotprovider != null) {
         var2.setReturnValue(equipmentslotprovider.getPreferredEquipmentSlot(this, var1));
      }
   }

   private void m_wrapOperation$zek000$fabric_entity_events_v1$allowRemoveAllEffects_122(Map var1, Operation var2) {
      if (!this.isClient()) {
         Set set = Set.copyOf(var1.entrySet());
         var2.call(new Object[]{var1});

         for (Entry entry : set) {
            class03556 class03556 = (class03556)entry.getKey();
            class07055 class07055 = (class07055)entry.getValue();
            if (!((AllowEarlyRemove)ServerMobEffectEvents.ALLOW_EARLY_REMOVE.invoker())
               .allowEarlyRemove(class07055, this.self(), MobEffectUtil.getCommandContext())) {
               var1.put(class03556, class07055);
            }
         }
      }
   }

   private void handler$dgc000$viafabricplus$setGenericMovementEfficiencyAttribute(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
         EnchantmentAttributesEmulation1_20_6.setGenericMovementEfficiencyAttribute(this);
      }
   }

   private boolean wrapWithCondition$boh000$lithium$maybeHasAnyTickableEnchantments(class04782 var1, class07438 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return var2 instanceof class08036 || this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.lithium$shouldTickEnchantments();
   }

   private class00500 m_localvar$zed000$fabric_entity_events_v1$modifyBedForOccupiedState_123(class00500 var1, class07209 var2) {
      return ((AllowBed)EntitySleepEvents.ALLOW_BED.invoker()).allowBed(this, var2, var1, var1.i() instanceof class07789).N() ? class00869.yn.W() : var1;
   }

   private int modifyExpressionValue$dmm000$viafabricplus$changeParticleDensity(int var1) {
      return ProtocolTranslator.getTargetVersion().olderThan(ProtocolVersion.v1_20_5) ? 2 : var1;
   }

   private void m_handler$zek000$fabric_entity_events_v1$beforeRemoveAllEffects_124(CallbackInfoReturnable var1) {
      if (!this.isClient()) {
         for (class07055 class07055 : this.self().method_6026()) {
            ((BeforeRemove)ServerMobEffectEvents.BEFORE_REMOVE.invoker()).beforeRemove(class07055, this.self(), MobEffectUtil.getCommandContext());
         }
      }
   }

   private Optional m_redirect$zed000$fabric_entity_events_v1$modifyWakeUpPosition_125(
      class07078 var1, class07322 var2, class07209 var3, class07211 var4, float var5
   ) {
      Optional<class06889> optional = Optional.empty();
      class00500 class00500 = var2.method_8320(var3);
      if (class00500.i() instanceof class07789) {
         optional = class07789.N(var1, var2, var3, var4, var5);
      }

      return Optional.ofNullable(
         ((ModifyWakeUpPosition)EntitySleepEvents.MODIFY_WAKE_UP_POSITION.invoker()).modifyWakeUpPosition(this, var3, class00500, optional.orElse(null))
      );
   }

   private boolean m_wrapMethod$zek000$fabric_entity_events_v1$allowRemoveEffect_126(class03556 var1, Operation var2) {
      if (this.isClient()) {
         return (Boolean)var2.call(new Object[]{var1});
      } else {
         class07055 class07055 = this.self().method_6112(var1);
         if (class07055 == null) {
            return (Boolean)var2.call(new Object[]{var1});
         } else {
            return !((AllowEarlyRemove)ServerMobEffectEvents.ALLOW_EARLY_REMOVE.invoker())
                  .allowEarlyRemove(class07055, this.self(), MobEffectUtil.getCommandContext())
               ? false
               : (Boolean)var2.call(new Object[]{var1});
         }
      }
   }

   private boolean redirect$dnf000$viafabricplus$useEuclideanDistanceCalculation(Object var1, Object var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4) && var1 instanceof class07078 ? false : var1.equals(var2);
   }

   public class05320 method_6127() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_0212a028292fd3c078969e3ee4c71d9e8_0;
   }

   @Nullable
   public class07055 method_6112(class03556<class07084> var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return (class07055)((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).get(var1);
   }

   @Nullable
   public class08036 method_66280() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return class08372.L(this.fields_5212a028292fd3c078969e3ee4c71d9e8_2, this.method_73183());
   }

   private void method_61429(class06889 var1) {
      boolean flag = this.method_18798().B <= 0.0;
      double d0 = this.method_23318();
      double d1 = this.method_61426();
      if (this.method_5799()) {
         this.method_76087(var1, d1, flag, d0);
         this.method_76086();
      } else {
         this.method_76089(var1, d1, flag, d0);
      }
   }

   public int method_6014() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_9212a028292fd3c078969e3ee4c71d9e8_1;
   }

   public float method_6132(class07072 var1, float var2) {
      if (!var1.N(class03696.y)) {
         this.method_6105(var1, var2);
         var2 = class07058.N(this, var2, var1, this.method_6096(), (float)this.method_45325(class05298.L));
      }

      return var2;
   }

   public Collection<class07055> method_6026() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return ((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).values();
   }

   public float method_75879(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_9212a028292fd3c078969e3ee4c71d9e8_3 < 0L
         ? 0.0F
         : (float)(this.method_73183().N() - this.fields_9212a028292fd3c078969e3ee4c71d9e8_3) + var1;
   }

   public boolean method_76088(class04688 var1) {
      return (this.method_5799() || this.method_5771()) && this.method_29920() && !this.method_26319(var1);
   }

   public class06543 method_76693() {
      class06543 class06543 = this.method_76694().method_58694(class02484.I);
      return class06543 != null ? class06543 : class06543.N(this);
   }

   private void method_30123(Map<class07085, class06584> var1) {
      ArrayList arraylist = Lists.newArrayListWithCapacity(var1.size());
      var1.forEach((var2x, var3) -> {
         this.fields212a028292fd3c078969e3ee4c71d9e8();
         class06584 class06584 = var3.t();
         arraylist.add(Pair.of(var2x, class06584));
         this.fields_0212a028292fd3c078969e3ee4c71d9e8_3.put(var2x, class06584);
      });
      ((class04782)this.method_73183()).method_14178().y(this, new class06682(this.method_5628(), arraylist));
   }

   public int method_63627() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_6212a028292fd3c078969e3ee4c71d9e8_0;
   }

   public void method_6119() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.handler$bok000$lithium$skipGetDuration(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         int i = this.method_6028();
         if (this.fields_0212a028292fd3c078969e3ee4c71d9e8_4) {
            this.fields_1212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_1212a028292fd3c078969e3ee4c71d9e8_0 + 1;
            if (this.fields_1212a028292fd3c078969e3ee4c71d9e8_0 >= i) {
               this.fields_1212a028292fd3c078969e3ee4c71d9e8_0 = 0;
               this.fields_0212a028292fd3c078969e3ee4c71d9e8_4 = false;
            }
         } else {
            this.fields_1212a028292fd3c078969e3ee4c71d9e8_0 = 0;
         }

         this.fields_3212a028292fd3c078969e3ee4c71d9e8_0 = (float)this.fields_1212a028292fd3c078969e3ee4c71d9e8_0.intValue() / i;
      }
   }

   public void method_6008() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_7212a028292fd3c078969e3ee4c71d9e8_6 = true;
   }

   public long method_51851() {
      return 0L;
   }

   private void method_66276() {
      class06889 class06889 = this.method_18798();

      for (int i = 0; i < 8; i++) {
         double d0 = this.field_5974.N(0.0, 1.0);
         double d1 = this.field_5974.N(0.0, 1.0);
         double d2 = this.field_5974.N(0.0, 1.0);
         this.method_73183()
            .method_8406(class07107.u, this.method_23317() + d0, this.method_23318() + d1, this.method_23321() + d2, class06889.M, class06889.B, class06889.Z);
      }
   }

   public void method_6006(class07209 var1, boolean var2) {
   }

   public class00734 method_24833(class01312 var1) {
      class01325 class01325 = this.method_18377(var1);
      return new class00734(-class01325.N() / 2.0F, 0.0, -class01325.N() / 2.0F, class01325.N() / 2.0F, class01325.y(), class01325.N() / 2.0F);
   }

   public void method_6005(double var1, double var3, double var5) {
      var1 *= 1.0 - this.method_45325(class05298.b);
      if (!(var1 <= 0.0)) {
         this.field_64356 = true;
         class06889 class06889x = this.method_18798();

         while (var3 * var3 + var5 * var5 < 1.0E-5F) {
            var3 = (this.field_5974.U() - this.field_5974.U()) * 0.01;
            var5 = (this.field_5974.U() - this.field_5974.U()) * 0.01;
         }

         class06889 class06889x = new class06889(var3, 0.0, var5).u().L(var1);
         this.method_18800(
            class06889x.M / 2.0 - class06889x.M,
            this.method_24828() ? Math.min(0.4, class06889x.B / 2.0 + var1) : class06889x.B,
            class06889x.Z / 2.0 - class06889x.Z
         );
      }
   }

   public int method_6028() {
      int i = this.method_5998(class07050.field_5808).e().y();
      if (class07063.N(this)) {
         return this.modifyReturnValue$cfe000$nursultan$onGetHandSwingDuration(i - (1 + class07063.y(this)));
      } else {
         return this.method_6059(class07047.u)
            ? this.modifyReturnValue$cfe000$nursultan$onGetHandSwingDuration(i + (1 + this.method_6112(class07047.u).i()) * 2)
            : this.modifyReturnValue$cfe000$nursultan$onGetHandSwingDuration(i);
      }
   }

   public int method_6110(class04782 var1) {
      return 0;
   }

   public float method_37416() {
      return this.method_6059(class07047.B) ? 0.1F * (this.method_6112(class07047.B).i() + 1.0F) : 0.0F;
   }

   public boolean method_74092() {
      return this.method_5669() <= -20;
   }

   public void method_16078(class04782 var1) {
   }

   public float method_6106() {
      return this.method_56994(1.0F);
   }

   private void method_52543() {
      Set<class07469> set = this.method_6127().y();

      for (class07469 class07469 : set) {
         this.method_52540(class07469.N());
      }

      set.clear();
   }

   public float method_56077(float var1) {
      return var1;
   }

   public static class05300 method_26827() {
      return class05308.N()
         .N(class05298.n)
         .N(class05298.b)
         .N(class05298.l)
         .N(class05298.y)
         .N(class05298.L)
         .N(class05298.v)
         .N(class05298.O)
         .N(class05298.k)
         .N(class05298.s)
         .N(class05298.w)
         .N(class05298.W)
         .N(class05298.T)
         .N(class05298.d)
         .N(class05298.Z)
         .N(class05298.U)
         .N(class05298.o)
         .N(class05298.G)
         .N(class05298.i)
         .N(class05298.z)
         .N(class05298.q);
   }

   private void method_29505(class08372<class08036> var1, int var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_5212a028292fd3c078969e3ee4c71d9e8_2 = var1;
      this.fields_6212a028292fd3c078969e3ee4c71d9e8_0 = var2;
   }

   public class06584 method_18808(class06584 var1) {
      return class06584.E;
   }

   public boolean method_70673() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_6212a028292fd3c078969e3ee4c71d9e8_4;
   }

   private void method_66283(class07072 var1) {
      if (var1.N(class03683.p)) {
         class04911 class04911 = this instanceof class08036 ? class04911.field_15248 : class04911.field_15251;
         this.method_73183().method_54762(null, this.method_73189().M, this.method_73189().B, this.method_73189().Z, class04909.Qa, class04911);
      }
   }

   public boolean method_6049(class07055 var1) {
      return this.m_wrapMethod$zek000$fabric_entity_events_v1$allowAddEffect_105(var1, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 1, "[net.minecraft.class_1293]");
         return this.method_6049$mixinextras$wrapped$484((class07055)var1x[0]);
      });
   }

   private static byte method_20237(class07085 var0) {
      return switch (((int[])class07470.N_0)[var0.ordinal()]) {
         case 1 -> 47;
         case 2 -> 48;
         case 3 -> 49;
         case 4 -> 50;
         case 5 -> 52;
         case 6 -> 51;
         case 7 -> 65;
         case 8 -> 68;
         default -> throw new MatchException(null, null);
      };
   }

   public void method_6087(class07049 var1) {
      var1.method_5697(this);
   }

   private void method_76086() {
      if (this.method_5864().N(class01217.f) && this.method_5782() && this.method_5861(class01231.N) > this.method_29241()) {
         this.method_18799(this.method_18798().y(0.0, 0.04F, 0.0));
      }
   }

   public boolean method_6057(class07049 var1) {
      return this.method_64618(var1, class05849.field_17558, class05835.field_1348, var1.method_23320());
   }

   public class05781<?> method_28306() {
      return class01289.N(ImmutableList.of(), ImmutableList.of());
   }

   public int method_23329(double var1, float var3) {
      return this.method_5864().N(class01217.s) ? 0 : class04995.N(this.method_66669(var1) * var3 * this.method_45325(class05298.W));
   }

   public int method_56993(float var1) {
      return class04995.y(var1 + 3.0F);
   }

   public void method_36977(class07072 var1, float var2) {
   }

   public float method_6063() {
      return (float)this.method_45325(class05298.n);
   }

   public void method_6031(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      float f = class04995.R(var1 - this.fields_4212a028292fd3c078969e3ee4c71d9e8_0);
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 + f * 0.3F;
      float f1 = class04995.R(this.method_36454() - this.fields_4212a028292fd3c078969e3ee4c71d9e8_0);
      float f2 = this.method_53964();
      if (this.m_redirect$ecp000$viafabricplus_visuals$changeBodyRotationInterpolation_83(f1) > f2) {
         this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_4212a028292fd3c078969e3ee4c71d9e8_0 + (f1 - class04995.U((double)f1) * f2);
      }
   }

   public boolean method_64619(class07438 var1, double var2, boolean var4, boolean var5, double... var6) {
      class06889 class06889x = var1.method_5828(1.0F).u();

      for (double d0 : var6) {
         class06889 class06889x = new class06889(this.method_23317() - var1.method_23317(), d0 - var1.method_23320(), this.method_23321() - var1.method_23321());
         double d1 = class06889x.M();
         class06889x = class06889x.u();
         if (class06889x.y(class06889x) > 1.0 - var2 / (var4 ? d1 : 1.0)
            && var1.method_64618(this, var5 ? class05849.field_23142 : class05849.field_17558, class05835.field_1348, d0)) {
            return true;
         }
      }

      return false;
   }

   public Map<class03556<class07084>, class07055> method_6088() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return (Map<class03556<class07084>, class07055>)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2;
   }

   public void method_23667(class07050 var1, boolean var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.fields_0212a028292fd3c078969e3ee4c71d9e8_4
         || this.fields_1212a028292fd3c078969e3ee4c71d9e8_0 >= this.method_6028() / 2
         || this.fields_1212a028292fd3c078969e3ee4c71d9e8_0 < 0) {
         this.fields_1212a028292fd3c078969e3ee4c71d9e8_0 = -1;
         this.fields_0212a028292fd3c078969e3ee4c71d9e8_4 = true;
         this.fields_0212a028292fd3c078969e3ee4c71d9e8_6 = var1;
         if (this.method_73183() instanceof class04782) {
            class07268 class07268 = new class07268(this, var1 == class07050.field_5808 ? 0 : 3);
            class04751 class04751 = ((class04782)this.method_73183()).method_14178();
            if (var2) {
               class04751.N(this, class07268);
            } else {
               class04751.y(this, class07268);
            }
         }
      }
   }

   public boolean method_64169(class04782 var1, class05946<class05074> var2, BiConsumer<class04782, class06584> var3) {
      return this.method_64170(var1, var2, var1x -> var1x.N(class06551.B, this.method_73189()).N(class06551.N, this).N(class06925.U), var3);
   }

   public void method_72396(class04782 var1, class07072 var2, boolean var3, class05946<class05074> var4, Consumer<class06584> var5) {
      class05074 class05074 = var1.method_8503().yd().N(var4);
      class04160 class04160 = new class04160(var1)
         .N(class06551.N, this)
         .N(class06551.B, this.method_73189())
         .N(class06551.i, var2)
         .y(class06551.R, var2.u())
         .y(class06551.M, var2.L());
      class08036 class08036 = this.method_66280();
      if (var3 && class08036 != null) {
         class04160 = class04160.N(class06551.u, class08036).N(class08036.method_7292());
      }

      class04162 class04162 = class04160.N(class06925.B);
      class05074.N(class04162, this.method_51851(), var5);
   }

   public void method_6033(float var1) {
      this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_1, class04995.N(var1, 0.0F, this.method_6063()));
   }

   public float method_49484() {
      return this.method_5642() instanceof class08036 ? this.method_6029() * 0.1F : 0.02F;
   }

   public void method_66281() {
      this.method_5729(7, true);
      this.method_5729(7, false);
   }

   public void method_6027() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).isEmpty()) {
         this.method_6069();
         this.method_5648(false);
      } else {
         this.method_5648(this.method_6059(class07047.m));
         this.method_58150();
      }
   }

   public boolean method_5679(class04782 var1, class07072 var2) {
      return this.method_64421(var2) || class07323.N(var1, this, var2);
   }

   private double method_66669(double var1) {
      return var1 + 1.0E-6 - this.method_45325(class05298.w);
   }

   public float method_49485(class08036 var1) {
      return this.method_6029();
   }

   @Nullable
   public class04891 method_6002() {
      return class04909.Ea;
   }

   public int method_6064(int var1) {
      return Math.min(var1 + 4, this.method_5748());
   }

   @Nullable
   public class07438 method_6065() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return class08372.y(this.fields_8212a028292fd3c078969e3ee4c71d9e8_0, this.method_73183());
   }

   private class06889 method_26318(class06889 var1, float var2) {
      this.method_5724(this.method_18802(var2), var1);
      this.method_18799(this.method_18801(this.method_18798()));
      this.method_5784(class07451.field_6308, this.method_18798());
      class06889 class06889 = this.method_18798();
      if ((this.field_5976 || this.redirect$dnd000$viafabricplus$disableJumpOnLadder(this))
         && (this.method_6101() || this.redirect$dmf000$viafabricplus$dontCheckLastTick(this) && class04819.N(this))) {
         class06889 = new class06889(class06889.M, 0.2, class06889.Z);
      }

      return class06889;
   }

   public boolean method_6082(double var1, double var3, double var5, boolean var7) {
      double d0 = this.method_23317();
      double d1 = this.method_23318();
      double d2 = this.method_23321();
      double d3 = var3;
      boolean flag = false;
      class07209 class07209x = class07209.method_49637(var1, var3, var5);
      class07299 class07299 = this.method_73183();
      if (class07299.E(class07209x)) {
         boolean flag1 = false;

         while (!flag1 && class07209x.method_10264() > class07299.method_31607()) {
            class07209 class07209x = class07209x.method_10074();
            if (class07299.method_8320(class07209x).M()) {
               flag1 = true;
            } else {
               d3--;
               class07209x = class07209x;
            }
         }

         if (flag1) {
            this.method_5859(var1, d3, var5);
            if (class07299.N(this) && !class07299.u(this.method_5829())) {
               flag = true;
            }
         }
      }

      if (!flag) {
         this.method_5859(d0, d1, d2);
         return false;
      } else {
         if (var7) {
            class07299.method_8421(this, (byte)46);
         }

         if (this instanceof class07475 class07475) {
            class07475.f().W();
         }

         return true;
      }
   }

   public double method_61426() {
      return this.method_18798().B <= 0.0 && this.method_6059(class07047.Y) ? Math.min(this.method_56989(), 0.01) : this.method_56989();
   }

   public int method_6003() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_9212a028292fd3c078969e3ee4c71d9e8_2;
   }

   public void method_6104(class07050 var1) {
      this.method_23667(var1, false);
   }

   public void method_66278(UUID var1, int var2) {
      this.method_29505(class08372.N(var1), var2);
   }

   public boolean method_35053() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_0212a028292fd3c078969e3ee4c71d9e8_5;
   }

   public void method_59928() {
   }

   public void method_6090(class04782 var1, class07438 var2) {
      var2.method_6060(this);
   }

   public float method_55693() {
      class05320 class05320 = this.method_6127();
      return class05320 == null ? 1.0F : this.method_56077((float)class05320.L(class05298.k));
   }

   private Optional getBaritone() {
      return class04453.class.isInstance(this) ? Optional.ofNullable(BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)this)) : Optional.empty();
   }

   public ImmutableList<class01312> method_24831() {
      return ImmutableList.of(class01312.field_18076);
   }

   public float method_6067() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_8212a028292fd3c078969e3ee4c71d9e8_6;
   }

   private void method_75126() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.fields_7212a028292fd3c078969e3ee4c71d9e8_6) {
         this.method_6027();
         this.method_36362();
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_6 = false;
      }
   }

   public void method_66282() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_7212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_7212a028292fd3c078969e3ee4c71d9e8_0 * 0.98F;
      this.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = this.fields_7212a028292fd3c078969e3ee4c71d9e8_2 * 0.98F;
   }

   public float method_6107() {
      return 1.0F;
   }

   public class00734 method_53510() {
      class00734 class00734 = this.method_5829();
      class07049 class07049 = this.method_5854();
      if (class07049 != null) {
         class06889 class06889 = class07049.method_52538(this);
         return class00734.y(Math.max(class06889.B, class00734.y));
      } else {
         return class00734;
      }
   }

   public void method_5673(class07085 var1, class06584 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.method_6116(var1, this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.N(var1, var2), var2);
   }

   public boolean method_6084(class07085 var1) {
      return !this.method_6118(var1).R();
   }

   private void method_18392(class07209 var1) {
      this.method_5814(var1.method_10263() + 0.5, var1.method_10264() + 0.6875, var1.method_10260() + 0.5);
   }

   public boolean method_75123(class07085 var1, class07049 var2, float var3, boolean var4, boolean var5, boolean var6) {
      if (!(this.method_73183() instanceof class04782 class04782)) {
         return false;
      } else {
         class06584 class06584 = this.method_6118(var1);
         class07072 class07072 = class06584.N(this, () -> this.method_48923().y(this));
         float f = class07323.N(class04782, class06584, var2, class07072, var3);
         class06889 class06889 = var2.method_18798();
         boolean flag1 = var4 && var2.method_64397(class04782, class07072, f);
         boolean flag = var5 | flag1;
         if (var5) {
            this.method_75122(var2, 0.4F + this.method_59924(var2, class07072), class06889);
         }

         if (var6 && var2.method_5765()) {
            flag = true;
            var2.method_5848();
         }

         if (var2 instanceof class07438 class07438) {
            class06584.N(class07438, this);
         }

         if (flag1) {
            class07323.N(class04782, var2, class07072);
         }

         if (!flag) {
            return false;
         } else {
            this.method_6114(var2);
            this.method_59928();
            return true;
         }
      }
   }

   public class01325 method_55694(class01312 var1) {
      return this.method_5864().E().N(this.method_17825());
   }

   public boolean method_52542(class01312 var1) {
      class00734 class00734 = this.method_18377(var1).N(this.method_73189());
      return this.method_73183().a_(this, class00734);
   }

   public void method_70671(class06889 var1, float var2, float var3, float var4) {
      if (this.method_5799()) {
         this.method_5724(var2, var1);
         this.method_5784(class07451.field_6308, this.method_18798());
         this.method_18799(this.method_18798().L(0.8F));
      } else if (this.method_5771()) {
         this.method_5724(var3, var1);
         this.method_5784(class07451.field_6308, this.method_18798());
         this.method_18799(this.method_18798().L(0.5));
      } else {
         this.method_5724(var4, var1);
         this.method_5784(class07451.field_6308, this.method_18798());
         this.method_18799(this.method_18798().L(0.91F));
      }
   }

   public int method_21753() {
      return this.field_6011.<Integer>N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_5);
   }

   public boolean method_75118(class07049 var1, int var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.fields_11212a028292fd3c078969e3ee4c71d9e8_0 == null) {
         return false;
      } else {
         return this.fields_11212a028292fd3c078969e3ee4c71d9e8_0.containsKey(var1)
            ? this.method_73183().N() - this.fields_11212a028292fd3c078969e3ee4c71d9e8_0.getLong(var1) < var2
            : false;
      }
   }

   @Nullable
   public class08036 method_65343(class07072 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      class07049 class07049 = var1.u();
      if (class07049 instanceof class08036 class08036) {
         this.method_66277(class08036, 100);
      } else if (class07049 instanceof class07894 class07894 && class07894.NQ()) {
         if (class07894.NI() != null) {
            this.method_66278(class07894.NI().L(), 100);
         } else {
            this.fields_5212a028292fd3c078969e3ee4c71d9e8_2 = null;
            this.fields_6212a028292fd3c078969e3ee4c71d9e8_0 = 0;
         }
      }

      return class08372.L(this.fields_5212a028292fd3c078969e3ee4c71d9e8_2, this.method_73183());
   }

   public class08599 method_67518() {
      return new class08599();
   }

   public void method_6050() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.method_73183() instanceof class04782 class04782) {
         Iterator iterator = ((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).keySet().iterator();

         try {
            while (iterator.hasNext()) {
               class03556 class03556 = (class03556)iterator.next();
               class07055 class07055x = (class07055)((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).get(class03556);
               if (!class07055x.N(class04782, this, () -> this.method_6009(class07055x, true, null))) {
                  this.m_handler$zek000$fabric_entity_events_v1$beforeExpireRemoveEffect_117(null, class07055x);
                  iterator.remove();
                  this.method_6129(List.of(class07055x));
               } else if (class07055x.u() % 600 == 0) {
                  this.method_6009(class07055x, false, null);
               }
            }
         } catch (ConcurrentModificationException concurrentmodificationexception) {
         }
      } else {
         for (class07055 class07055 : ((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).values()) {
            class07055.Z();
         }

         List list = this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_2);
         if (!list.isEmpty()) {
            boolean flag = this.field_6011.<Boolean>N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_3);
            int j = this.method_5767() ? 15 : this.modifyExpressionValue$dmm000$viafabricplus$changeParticleDensity(4);
            int i = flag ? 5 : 1;
            if (this.field_5974.y(j * i) == 0) {
               this.method_73183()
                  .method_8406(class07536.N_77(list, this.field_5974), this.method_23322(0.5), this.method_23319(), this.method_23325(0.5), 1.0, 1.0, 1.0);
            }
         }
      }
   }

   public boolean method_6123() {
      return (this.field_6011.<Byte>N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_0) & 4) != 0;
   }

   public boolean method_24520(Predicate<class06584> var1) {
      return var1.test(this.method_6047()) || var1.test(this.method_6079());
   }

   public void method_6114(class07049 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (var1 instanceof class07438) {
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_2 = (class07438)var1;
      } else {
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_2 = null;
      }

      this.fields_8212a028292fd3c078969e3ee4c71d9e8_3 = this.field_6012;
   }

   public void method_21755(int var1) {
      this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_5, var1);
   }

   public void method_48565(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      float f = Math.min(var1 * 4.0F, 1.0F);
      this.fields_3212a028292fd3c078969e3ee4c71d9e8_3.N(f, 0.4F, this.method_6109() ? 3.0F : 1.0F);
   }

   public void method_26082(class07055 var1, @Nullable class07049 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      boolean flag = this.method_6049(var1);
      this.m_handler$zek000$fabric_entity_events_v1$beforeForceAddEffect_118(var1, var2, null);
      if (flag) {
         class07055 class07055 = ((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).put(var1.L(), var1);
         if (class07055 == null) {
            this.method_6020(var1, var2);
         } else {
            var1.u(class07055);
            this.method_6009(var1, true, var2);
         }
      }
   }

   public void method_6000() {
   }

   public boolean method_27071(class04782 var1) {
      return !this.method_6109() && var1.method_64395().N(class07305.O);
   }

   public boolean method_6115() {
      return (this.field_6011.<Byte>N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_0) & 1) > 0;
   }

   public void method_32324() {
      class07469 class07469 = this.method_5996(class05298.l);
      if (class07469 != null) {
         if (class07469.N(staticFields_2212a028292fd3c078969e3ee4c71d9e8_2) != null) {
            class07469.L(staticFields_2212a028292fd3c078969e3ee4c71d9e8_2);
         }
      }
   }

   public boolean method_21754() {
      return this.method_5715();
   }

   @Nullable
   public class07055 method_6111(class03556<class07084> var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return (class07055)((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).remove(var1);
   }

   public void method_6085(int var1, boolean var2) {
      int i = this.field_6011.<Byte>N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_0);
      if (var2) {
         i |= var1;
      } else {
         i &= ~var1;
      }

      this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_0, (byte)i);
   }

   public boolean method_5999() {
      return this.method_5864().N(class01217.d);
   }

   public Optional<class07209> method_24832() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_9212a028292fd3c078969e3ee4c71d9e8_5;
   }

   public void method_23883(class04782 var1, @Nullable class07049 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.method_41330()
         && (this.method_6071() || this.fields_6212a028292fd3c078969e3ee4c71d9e8_0 > 0 && this.method_6054() && var1.method_64395().N(class07305.O))) {
         class07057.N(var1, this.method_73189(), this.method_59923(var1, var2));
      }
   }

   public class06584 method_61420(class07070 var1) {
      return this.method_6068() == var1 ? this.method_6047() : this.method_6079();
   }

   public void method_6007() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.handler$dnd000$viafabricplus$removeJumpDelay(null);
      if (this.fields_8212a028292fd3c078969e3ee4c71d9e8_5 > 0) {
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_5 = this.fields_8212a028292fd3c078969e3ee4c71d9e8_5 - 1;
      }

      if (this.method_66245()) {
         this.method_66233().method_66271();
      } else if (!this.method_66249()) {
         this.method_18799(this.method_18798().L(0.98));
      }

      if (this.fields_7212a028292fd3c078969e3ee4c71d9e8_5 > 0) {
         this.method_52539(this.fields_7212a028292fd3c078969e3ee4c71d9e8_5, this.fields_7212a028292fd3c078969e3ee4c71d9e8_4);
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_5 = this.fields_7212a028292fd3c078969e3ee4c71d9e8_5 - 1;
      }

      this.fields_13212a028292fd3c078969e3ee4c71d9e8_1.N((class07049)this);
      class06889 class06889x = this.method_18798();
      double d0 = class06889x.M;
      double d1 = class06889x.B;
      double d2 = class06889x.Z;
      class07078 class07078xx = this.method_5864();
      class07078<class08036> class07078x = class07078.Ly;
      class07078<?> class07078x = class07078xx;
      if (this.redirect$dnf000$viafabricplus$useEuclideanDistanceCalculation(class07078x, class07078x)) {
         if (class06889x.z() < 9.0E-6) {
            d0 = 0.0;
            d2 = 0.0;
         }
      } else {
         if (Math.abs(class06889x.M) < this.constant$dmm000$viafabricplus$modifyVelocityZero(0.003)) {
            d0 = 0.0;
         }

         if (Math.abs(class06889x.Z) < this.constant$dmm000$viafabricplus$modifyVelocityZero(0.003)) {
            d2 = 0.0;
         }
      }

      if (Math.abs(class06889x.B) < this.constant$dmm000$viafabricplus$modifyVelocityZero(0.003)) {
         d1 = 0.0;
      }

      this.method_18800(d0, d1, d2);
      class04643 class04643 = class08700.N();
      class04643.N("ai");
      this.method_66282();
      if (this.method_6062()) {
         this.fields_6212a028292fd3c078969e3ee4c71d9e8_4 = false;
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_0 = 0.0F;
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = 0.0F;
      } else if (this.method_6034() && !this.method_73183().method_8608()) {
         class04643.N("newAi");
         this.method_6023();
         class04643.L();
      }

      class04643.L();
      class04643.N("jump");
      if (this.fields_6212a028292fd3c078969e3ee4c71d9e8_4 && this.method_29920()) {
         double d3;
         if (this.method_5771()) {
            class03530<class04651> class03530 = class01231.y;
            d3 = this.redirect$dnn000$viafabricplus$redirectFluidHeight(this, class03530);
         } else {
            class03530<class04651> class03530 = class01231.N;
            d3 = this.redirect$dnn000$viafabricplus$redirectFluidHeight(this, class03530);
         }

         boolean flag = this.method_5799() && d3 > 0.0;
         double d4 = this.method_29241();
         if (!flag || this.method_24828() && !(d3 > d4)) {
            if (!this.method_5771() || this.method_24828() && !(d3 > d4)) {
               if ((this.method_24828() || flag && d3 <= d4) && this.fields_8212a028292fd3c078969e3ee4c71d9e8_5 == 0) {
                  this.method_6043();
                  this.fields_8212a028292fd3c078969e3ee4c71d9e8_5 = this.constant$cfe000$nursultan$onTickMovement(10);
               }
            } else {
               this.method_6010(class01231.y);
            }
         } else {
            this.method_6010(class01231.N);
         }
      } else {
         this.fields_8212a028292fd3c078969e3ee4c71d9e8_5 = 0;
      }

      class04643.L();
      class04643.N("travel");
      this.handler$dog000$viafabricplus$moveMovementSpeedFactors(null);
      if (this.method_6128()) {
         this.method_6053();
      }

      class00734 class00734 = this.method_5829();
      class06889 class06889x = new class06889(
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue(),
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_1.floatValue(),
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue()
      );
      if (this.method_6059(class07047.Y) || this.method_6059(class07047.d)) {
         this.redirect$dnf000$viafabricplus$dontResetLevitationFallDistance(this);
      }

      if (this.method_5642() instanceof class08036 class08036 && this.method_5805()) {
         this.method_49483(class08036, class06889x);
      } else if (this.method_66249() && this.method_6034()) {
         this.wrapOperation$cfe000$nursultan$wrapOperationTickMovement(this, class06889x, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_1309, net.minecraft.class_243]");
            ((class07438)var0[0]).method_6091((class06889)var0[1]);
            return (Void)null;
         });
      }

      if (!this.method_73183().method_8608() || this.method_66247()) {
         this.method_61409();
      }

      if (this.method_73183().method_8608()) {
         this.method_29242(this instanceof class07650);
      }

      class04643.L();
      if (this.method_73183() instanceof class04782 class04782x) {
         class04643.N("freezing");
         if (!this.field_27857 || !this.method_32316()) {
            this.method_32317(Math.max(0, this.method_32312() - 2));
         }

         this.method_32324();
         this.method_32325();
         if (this.field_6012 % 40 == 0 && this.method_32314() && this.method_32316()) {
            this.method_64397(class04782x, this.method_48923().t(), 1.0F);
         }

         class04643.L();
      }

      class04643.N("push");
      if (this.fields_10212a028292fd3c078969e3ee4c71d9e8_1 > 0) {
         this.fields_10212a028292fd3c078969e3ee4c71d9e8_1 = this.fields_10212a028292fd3c078969e3ee4c71d9e8_1 - 1;
         this.method_6035(class00734, this.method_5829());
      }

      this.method_6070();
      class04643.L();
      if (this.method_73183() instanceof class04782 class04782 && this.method_29503() && this.method_5721()) {
         this.method_64397(class04782, this.method_48923().Z(), 1.0F);
      }
   }

   public double method_45326(class03556<class07468> var1) {
      return this.method_6127().u(var1);
   }

   public boolean method_24518(class06581 var1) {
      return this.method_24520(var1x -> var1x.N(var1));
   }

   private class06889 method_18801(class06889 var1) {
      if (this.method_6101()) {
         this.method_38785();
         float f = 0.15F;
         double d0 = class04995.N(var1.M, -0.15F, 0.15F);
         double d1 = class04995.N(var1.Z, -0.15F, 0.15F);
         double d2 = Math.max(var1.B, -0.15F);
         if (d2 < 0.0 && !this.method_55667().N(class00869.Pa) && this.method_21754() && this instanceof class08036) {
            d2 = 0.0;
         }

         var1 = new class06889(d0, d2, d1);
      }

      return var1;
   }

   public boolean method_29504() {
      return this.method_6032() <= 0.0F;
   }

   private void method_58150() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      List list = ((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).values().stream().filter(class07055::M).map(class07055::N).toList();
      this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_2, list);
      this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_3, method_6089(((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).values()));
   }

   public void method_6125(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_8212a028292fd3c078969e3ee4c71d9e8_4 = var1;
   }

   public double method_18390(@Nullable class07049 var1) {
      double d0 = 1.0;
      if (this.method_21751()) {
         d0 *= 0.8;
      }

      if (this.method_5767()) {
         float f = this.method_18396();
         if (f < 0.1F) {
            f = 0.1F;
         }

         d0 *= 0.7 * f;
      }

      if (var1 != null) {
         class06584 class06584 = this.method_6118(class07085.field_6169);
         class07078<?> class07078 = var1.method_5864();
         if (class07078 == class07078.ym && class06584.N(class06570.Gl)
            || class07078 == class07078.yx && class06584.N(class06570.Gk)
            || class07078 == class07078.Nr && class06584.N(class06570.GO)
            || class07078 == class07078.yN && class06584.N(class06570.GO)
            || class07078 == class07078.q && class06584.N(class06570.GY)) {
            d0 *= 0.5;
         }
      }

      return d0;
   }

   public void method_29499(class00717 var1) {
      class07049 class07049 = var1.z();
      if (class07049 instanceof class04770) {
         class06912.A.N((class04770)class07049, var1.N(), this);
      }
   }

   private static class04803 method_32321(class07438 var0, class07085 var1) {
      return var1 != class07085.field_6169 && var1 != class07085.field_6173 && var1 != class07085.field_6171
         ? class04803.N(var0, var1, var2 -> var2.R() || var0.method_32326(var2) == var1)
         : class04803.N(var0, var1);
   }

   public float method_17825() {
      return this.method_6109() ? 0.5F : 1.0F;
   }

   public boolean method_64170(class04782 var1, class05946<class05074> var2, Function<class04160, class04162> var3, BiConsumer<class04782, class06584> var4) {
      class05074 class05074 = var1.method_8503().yd().N(var2);
      class04162 class04162 = (class04162)var3.apply(new class04160(var1));
      ObjectArrayList<class06584> objectarraylist = class05074.N(class04162);
      if (!objectarraylist.isEmpty()) {
         objectarraylist.forEach(var2x -> var4.accept(var1, var2x));
         return true;
      } else {
         return false;
      }
   }

   public float method_6036(class07072 var1, float var2) {
      if (var1.N(class03696.R)) {
         return var2;
      } else {
         if (this.method_6059(class07047.U) && !var1.N(class03696.M)) {
            int i = (this.method_6112(class07047.U).i() + 1) * 5;
            int j = 25 - i;
            float f = var2 * j;
            float f1 = var2;
            var2 = Math.max(f / 25.0F, 0.0F);
            float f2 = f1 - var2;
            if (f2 > 0.0F && f2 < 3.4028235E37F) {
               if (this instanceof class04770) {
                  ((class04770)this).method_7339(class01235.X, Math.round(f2 * 10.0F));
               } else if (var1.u() instanceof class04770) {
                  ((class04770)var1.u()).method_7339(class01235.V, Math.round(f2 * 10.0F));
               }
            }
         }

         if (var2 <= 0.0F) {
            return 0.0F;
         } else if (var1.N(class03696.B)) {
            return var2;
         } else {
            float f3;
            if (this.method_73183() instanceof class04782 class04782) {
               f3 = class07323.y(class04782, this, var1);
            } else {
               f3 = 0.0F;
            }

            if (f3 > 0.0F) {
               var2 = class07058.N(var2, f3);
            }

            return var2;
         }
      }
   }

   public void method_65344(class07072 var1) {
      if (var1.u() instanceof class07438 class07438 && !var1.N(class03696.T) && (!var1.N(class03683.K) || !this.method_5864().N(class01217.I))) {
         this.method_6015(class07438);
      }
   }

   public boolean method_18395(class07438 var1) {
      return var1 instanceof class08036 && this.method_73183().y() == class07086.field_5801 ? false : var1.method_33190();
   }

   public void method_6025(float var1) {
      float f = this.method_6032();
      if (f > 0.0F) {
         this.method_6033(f + var1);
      }
   }

   public void method_6100(boolean var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_6212a028292fd3c078969e3ee4c71d9e8_4 = var1;
   }

   @Nullable
   public class00717 method_7329(class06584 var1, boolean var2, boolean var3) {
      if (var1.R()) {
         return null;
      } else if (this.method_73183().method_8608()) {
         class07050 class07050 = class07050.field_5808;
         if (this.wrapWithCondition$ebi000$viafabricplus$dontSwingHand(this, class07050)) {
            this.method_6104(class07050);
         }

         return null;
      } else {
         class00717 class00717 = this.method_67517(var1, var2, var3);
         if (class00717 != null) {
            this.method_73183().method_8649(class00717);
         }

         return class00717;
      }
   }

   public void method_6043() {
      this.handler$zzl000$baritone$preMoveRelative(null);
      this.handler$cfe000$nursultan$injectJump(null);
      float f = this.method_6106();
      if (!(f <= 1.0E-5F)) {
         class06889 class06889 = this.method_18798();
         double d2 = f;
         double d1 = class06889.B;
         double d0 = d2;
         this.method_18800(class06889.M, this.redirect$dnd000$viafabricplus$dontLimitJumpVelocity(d0, d1), class06889.Z);
         if (this.method_5624()) {
            float f1 = this.redirect$zzl000$baritone$overrideYaw(this) * (float) (Math.PI / 180.0);
            this.method_45319(new class06889(-class04995.m(f1) * 0.2, 0.0, class04995.P(f1) * 0.2));
         }

         this.field_64356 = true;
      }
   }

   public boolean method_72394(
      class04782 var1, class05946<class05074> var2, @Nullable class07049 var3, class06584 var4, BiConsumer<class04782, class06584> var5
   ) {
      return this.method_64170(var1, var2, var3x -> var3x.N(class06551.L, this).y(class06551.y, var3).N(class06551.U, var4).N(class06925.n), var5);
   }

   public boolean method_44201(class07085 var1) {
      return true;
   }

   public int method_6130(int var1) {
      class07469 class07469 = this.method_5996(class05298.d);
      double d0;
      if (class07469 != null) {
         d0 = class07469.M();
      } else {
         d0 = 0.0;
      }

      return d0 > 0.0 && this.field_5974.U() >= 1.0 / (d0 + 1.0) ? var1 : var1 - 1;
   }

   public void method_48761(double var1, double var3) {
   }

   public boolean method_36608() {
      return !this.method_7325() && this.method_5805();
   }

   public boolean method_37222(class07055 var1, @Nullable class07049 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.method_6049(var1)) {
         return false;
      } else {
         Map map = (Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2;
         class03556 class03556 = var1.L();
         this.m_handler$zek000$fabric_entity_events_v1$beforeAddEffect_103(var1, var2, null);
         class07055 class07055 = (class07055)map.get(class03556);
         boolean flag = false;
         if (class07055 == null) {
            ((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).put(var1.L(), var1);
            this.method_6020(var1, var2);
            flag = true;
            var1.y(this);
         } else if (class07055.y(var1)) {
            this.method_6009(class07055, true, var2);
            flag = true;
         }

         var1.N(this);
         return flag;
      }
   }

   public class06584 method_76694() {
      return this.method_6115() ? this.method_6030() : this.method_6047();
   }

   public boolean method_6128() {
      return this.method_5795(7);
   }

   public boolean method_6054() {
      return !this.method_6109();
   }

   public class01289<?> method_18868() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_12212a028292fd3c078969e3ee4c71d9e8_1;
   }

   public boolean method_6086() {
      return !this.method_29504();
   }

   private class06889 method_61430(class06889 var1) {
      this.handler$zzl000$baritone$onPreElytraMove(var1, null);
      class06889 class06889 = this.method_5720();
      float f = this.method_36455() * (float) (Math.PI / 180.0);
      double d0 = Math.sqrt(class06889.M * class06889.M + class06889.Z * class06889.Z);
      double d1 = var1.Z();
      double d2 = this.method_61426();
      double d5 = f;
      double d3 = class04995.E(this.redirect$dna000$viafabricplus$fixCosTable(d5));
      var1 = var1.y(0.0, d2 * (-1.0 + d3 * 0.75), 0.0);
      if (var1.B < 0.0 && d0 > 0.0) {
         double d4 = var1.B * -0.1 * d3;
         var1 = var1.y(class06889.M * d4 / d0, d4, class06889.Z * d4 / d0);
      }

      if (f < 0.0F && d0 > 0.0) {
         double d6 = d1 * -class04995.m(f) * 0.04;
         var1 = var1.y(-class06889.M * d6 / d0, d6 * 3.2, -class06889.Z * d6 / d0);
      }

      if (d0 > 0.0) {
         var1 = var1.y((class06889.M / d0 * d1 - var1.M) * 0.1, 0.0, (class06889.Z / d0 * d1 - var1.Z) * 0.1);
      }

      return var1.u(0.99F, 0.98F, 0.99F);
   }

   public void method_6019(class07050 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      class06584 class06584 = this.method_5998(var1);
      if (!class06584.R() && !this.method_6115()) {
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_0 = class06584;
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_1 = class06584.N(this);
         if (!this.method_73183().method_8608()) {
            this.method_6085(1, true);
            this.method_6085(2, var1 == class07050.field_5810);
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.N(this, class01194.O);
            if (this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.L(class02484.X)) {
               this.fields_11212a028292fd3c078969e3ee4c71d9e8_0 = new Object2LongOpenHashMap();
            }
         }
      }
   }

   public boolean method_63623(class06584 var1, class07085 var2) {
      class08725 class08725 = var1.method_58694(class02484.o);
      return class08725 == null
         ? var2 == class07085.field_6173 && this.method_56991(class07085.field_6173)
         : var2 == class08725.y() && this.method_56991(class08725.y()) && class08725.N(this.method_5864());
   }

   @Nullable
   public class07211 method_18401() {
      class07209 class07209 = this.method_18398().orElse(null);
      class07211 class07211;
      if (class07209 != null) {
         class07299 class07299 = this.method_73183();
         class07211 = this.m_wrapOperation$zed000$fabric_entity_events_v1$onGetSleepingDirection_86(class07299, class07209, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_1922, net.minecraft.class_2338]");
            return class07789.N((class07290)var0[0], (class07209)var0[1]);
         });
      } else {
         class07211 = null;
      }

      return class07211;
   }

   public boolean method_6121(class04782 var1, class07049 var2) {
      this.method_6114(var2);
      return false;
   }

   private void method_61428(class06889 var1) {
      class07209 class07209 = this.method_23314();
      float f = this.method_24828() ? this.method_73183().method_8320(class07209).i().Z() : 1.0F;
      float f1 = f * 0.91F;
      class06889 class06889 = this.method_26318(var1, f);
      double d0 = class06889.B;
      class07055 class07055 = this.method_6112(class07047.d);
      if (class07055 != null) {
         d0 += (0.05 * (class07055.i() + 1) - class06889.B) * 0.2;
      } else {
         label31: {
            if (this.method_73183().method_8608()) {
               class07299 class07299 = this.method_73183();
               if (!this.redirect$dnf000$viafabricplus$modifyLoadedCheck(class07299, class07209)) {
                  if (this.method_23318() > this.method_73183().method_31607()) {
                     d0 = -0.1;
                  } else {
                     d0 = 0.0;
                  }
                  break label31;
               }
            }

            d0 -= this.method_61426();
         }
      }

      if (this.method_35053()) {
         this.method_18800(class06889.M, d0, class06889.Z);
      } else {
         float f2 = this instanceof class07650 ? f1 : 0.98F;
         this.method_18800(class06889.M * f1, d0 * f2, class06889.Z * f1);
      }
   }

   public void method_6116(class07085 var1, class06584 var2, class06584 var3) {
      if (!this.method_73183().method_8608() && !this.method_7325()) {
         if (!class06584.L(var2, var3) && !this.field_5953) {
            class08725 class08725 = var3.method_58694(class02484.o);
            if (!this.method_5701() && class08725 != null && var1 == class08725.y()) {
               this.method_73183()
                  .method_8465(
                     null,
                     this.method_23317(),
                     this.method_23318(),
                     this.method_23321(),
                     this.method_66667(var1, var3, class08725),
                     this.method_5634(),
                     1.0F,
                     1.0F,
                     this.field_5974.B()
                  );
            }

            if (this.method_44201(var1)) {
               this.method_32876(class08725 != null ? class01194.t : class01194.A);
            }
         }
      }
   }

   public class07443 method_39760() {
      return new class07443(class04909.ES, class04909.Ec);
   }

   public void method_6074(class04782 var1, class07072 var2, float var3) {
      if (!this.method_5679(var1, var2)) {
         var3 = this.method_6132(var2, var3);
         var3 = this.method_6036(var2, var3);
         float f1 = Math.max(var3 - this.method_6067(), 0.0F);
         this.method_6073(this.method_6067() - (var3 - f1));
         float f = var3 - f1;
         if (f > 0.0F && f < 3.4028235E37F) {
            class07049 class07049 = var2.u();
            if (class07049 instanceof class04770) {
               ((class04770)class07049).method_7339(class01235.K, Math.round(f * 10.0F));
            }
         }

         if (f1 != 0.0F) {
            this.method_6066().N(var2, f1);
            this.method_6033(this.method_6032() - f1);
            this.method_6073(this.method_6067() - f1);
            this.method_32876(class01194.P);
         }
      }
   }

   public void method_6091(class06889 var1) {
      if (this.method_76088(this.method_73183().method_8316(this.method_24515()))) {
         this.method_61429(var1);
      } else if (this.method_6128()) {
         this.method_61417(var1);
      } else {
         this.method_61428(var1);
      }
   }

   public boolean method_6094() {
      return this.method_5864().N(class01217.m);
   }

   public static boolean method_63624(class06584 var0, class07085 var1) {
      if (!var0.L(class02484.K)) {
         return false;
      } else {
         class08725 class08725 = var0.method_58694(class02484.o);
         return class08725 != null && var1 == class08725.y() && !var0.b();
      }
   }

   private class04891 method_6041(int var1) {
      return var1 > 4 ? this.method_39760().N() : this.method_39760().y();
   }

   public void method_16080(class04782 var1, class07072 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      boolean flag = this.fields_6212a028292fd3c078969e3ee4c71d9e8_0 > 0;
      if (this.method_27071(var1)) {
         this.method_16077(var1, var2, flag);
         this.method_6099(var1, var2, flag);
      }

      this.method_16078(var1);
      this.method_23883(var1, var2.u());
   }

   public boolean method_6012() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.method_73183().method_8608()) {
         return false;
      } else if (((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).isEmpty()) {
         return false;
      } else {
         Map map1 = (Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2;
         this.m_handler$zek000$fabric_entity_events_v1$beforeRemoveAllEffects_124(null);
         HashMap hashmap = Maps.newHashMap(map1);
         Map map = (Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2;
         this.m_wrapOperation$zek000$fabric_entity_events_v1$allowRemoveAllEffects_122(map, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 1, "[java.util.Map]");
            ((Map)var0[0]).clear();
            return (Void)null;
         });
         this.method_6129(hashmap.values());
         return true;
      }
   }

   @Nullable
   public class07438 method_6052() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_8212a028292fd3c078969e3ee4c71d9e8_2;
   }

   public void method_6020(class07055 var1, @Nullable class07049 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.method_73183().method_8608()) {
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_6 = true;
         var1.L().N().N(this.method_6127(), var1.i());
         this.method_52197(var1);
      }

      this.m_handler$zek000$fabric_entity_events_v1$afterAddEffect_109(var1, var2, null);
   }

   public void method_64399(class06584 var1) {
   }

   public void method_6129(Collection<class07055> var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.method_73183().method_8608()) {
         this.m_handler$zek000$fabric_entity_events_v1$afterRemoveEffect_110(var1, null);
      } else {
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_6 = true;

         for (class07055 class07055 : var1) {
            class07055.L().N().N(this.method_6127());

            for (class07049 class07049 : this.method_5685()) {
               if (class07049 instanceof class04770) {
                  ((class04770)class07049).field_13987.method_14364(new class06648(this.method_5628(), class07055.L()));
               }
            }
         }

         this.method_52543();
         this.m_handler$zek000$fabric_entity_events_v1$afterRemoveEffect_110(var1, null);
      }
   }

   public float method_67125() {
      class06584 class06584 = this.method_59958();
      class08609 class08609 = class06584.method_58694(class02484.g);
      return class08609 != null && class06584 == this.method_76694() ? class08609.y() : 0.0F;
   }

   public boolean method_6092(class07055 var1) {
      return this.method_37222(var1, null);
   }

   private void method_76773() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.method_73183().N() - this.fields_9212a028292fd3c078969e3ee4c71d9e8_3 > 10L) {
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_3 = this.method_73183().N();
         class08174 class08174 = this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.method_58694(class02484.X);
         if (class08174 != null) {
            class08174.L(this);
         }
      }
   }

   private void method_6038(class07049 var1) {
      class06889 class06889x;
      if (this.method_31481()) {
         class06889x = this.method_73189();
      } else if (!var1.method_31481() && !this.method_73183().method_8320(var1.method_24515()).N(class01210.ND)) {
         class06889x = var1.method_24829(this);
      } else {
         double d0 = Math.max(this.method_23318(), var1.method_23318());
         class06889x = new class06889(this.method_23317(), d0, this.method_23321());
         if (this.method_17681() <= 4.0F && this.method_17682() <= 4.0F) {
            double d1 = this.method_17682() / 2.0;
            class06889 class06889x = class06889x.y(0.0, d1, 0.0);
            class00494 class00494 = class00389.N(class00734.N(class06889x, this.method_17681(), this.method_17682(), this.method_17681()));
            class06889x = this.method_73183()
               .method_33594(this, class00494, class06889x, this.method_17681(), this.method_17682(), this.method_17681())
               .map(var2x -> var2x.y(0.0, -d1, 0.0))
               .orElse(class06889x);
         }
      }

      this.method_33567(class06889x.M, class06889x.B, class06889x.Z);
   }

   public int method_59923(class04782 var1, @Nullable class07049 var2) {
      return class07323.N(var1, var2, this, this.method_6110(var1));
   }

   public void method_18403(class07209 var1) {
      if (this.method_5765()) {
         this.method_5848();
      }

      class00500 class00500xx = this.method_73183().method_8320(var1);
      class00500xx = this.m_localvar$zed000$fabric_entity_events_v1$modifyBedForOccupiedState_123(class00500xx, var1);
      if (class00500xx.i() instanceof class07789) {
         class07299 class07299 = this.method_73183();
         class00500 class00500x = class00500xx.y(class07789.L, true);
         byte b0 = 3;
         class00500 class00500xx = class00500x;
         class07299 class07299x = class07299;
         this.m_redirect$zed000$fabric_entity_events_v1$setOccupiedState_108(class07299x, var1, class00500xx, b0);
      }

      this.method_18380(class01312.field_18078);
      this.method_18392(var1);
      this.method_18402(var1);
      this.method_18799(class06889.L);
      this.field_64356 = true;
      this.m_handler$zed000$fabric_entity_events_v1$onSleep_113(var1, null);
   }

   public void method_6044() {
   }

   public void method_6093() {
      this.method_18799(this.method_18798().y(0.0, -0.04F, 0.0));
   }

   public class06584 method_6030() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_9212a028292fd3c078969e3ee4c71d9e8_0;
   }

   public class07050 method_6058() {
      return (this.field_6011.<Byte>N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_0) & 2) > 0 ? class07050.field_5810 : class07050.field_5808;
   }

   private boolean method_6077(class07209 var1, class00500 var2) {
      CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
      this.handler$dmf000$viafabricplus$disableCrawling(callbackinforeturnable1);
      if (callbackinforeturnable1.isCancelled()) {
         return callbackinforeturnable1.getReturnValueZ();
      } else if (var2.L(class00624.y)) {
         class00500 class00500 = this.method_73183().method_8320(var1.method_10074());
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         this.m_handler$zbk000$fabric_block_api_v1$allowTaggedBlocksForTrapdoorClimbing_84(var1, var2, callbackinforeturnable, class00500);
         return callbackinforeturnable.isCancelled()
            ? callbackinforeturnable.getReturnValueZ()
            : class00500.N(class00869.uW) && class00500.L(class07123.y) == var2.L(class00624.R);
      } else {
         return false;
      }
   }

   public void method_6023() {
   }

   public float method_59924(class07049 var1, class07072 var2) {
      float f = (float)this.method_45325(class05298.i);
      class07299 class07299 = this.method_73183();
      return class07299 instanceof class04782 ? class07323.u((class04782)class07299, this.method_59958(), var1, var2, f) / 2.0F : f / 2.0F;
   }

   public void method_36549() {
      for (int i = 0; i < 20; i++) {
         double d0 = this.field_5974.E() * 0.02;
         double d1 = this.field_5974.E() * 0.02;
         double d2 = this.field_5974.E() * 0.02;
         double d3 = 10.0;
         this.method_73183()
            .method_8406(class07107.NR, this.method_23322(1.0) - d0 * 10.0, this.method_23319() - d1 * 10.0, this.method_23325(1.0) - d2 * 10.0, d0, d1, d2);
      }
   }

   public int method_6131() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_6212a028292fd3c078969e3ee4c71d9e8_2;
   }

   private void method_61422(class06584 var1, class07085 var2, class05320 var3) {
      var1.N(var2, (var1x, var2x) -> {
         class07469 class07469 = var3.N(var1x);
         if (class07469 != null) {
            class07469.i(var2x);
         }
      });
      class07323.N(var1, this, var2);
   }

   public void method_32325() {
      class00500 class00500 = this.redirect$bol000$lithium$delayGetBlockState(this);
      if (!this.redirect$bol000$lithium$delayAirTest(class00500) && this.method_32312() > 0) {
         class03556<class07468> class03556 = class05298.l;
         class07469 class07469 = this.redirect$bol000$lithium$doDelayedBlockStateAirTest(this, class03556);
         if (class07469 == null) {
            return;
         }

         float f = -0.05F * this.method_32313();
         class07469.y(new class07471(staticFields_2212a028292fd3c078969e3ee4c71d9e8_2, f, class07463.field_6328));
      }
   }

   public void method_6015(@Nullable class07438 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_8212a028292fd3c078969e3ee4c71d9e8_0 = class08372.N(var1);
      this.fields_8212a028292fd3c078969e3ee4c71d9e8_1 = this.field_6012;
   }

   public void method_6053() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.method_70983();
      if (!this.method_73183().method_8608()) {
         CallbackInfo callbackinfo = new CallbackInfo("", true);
         this.handler$boj000$lithium$skipStopFlying(callbackinfo);
         if (callbackinfo.isCancelled()) {
            return;
         }

         if (!this.method_63628()) {
            this.method_5729(7, false);
            return;
         }

         int i = this.fields_9212a028292fd3c078969e3ee4c71d9e8_2 + 1;
         if (i % 10 == 0) {
            if (i / 10 % 2 == 0) {
               class07085 class07085 = class07536.N_77(
                  class07085.field_54086.stream().filter(var1x -> method_63624(this.method_6118(var1x), var1x)).toList(), this.field_5974
               );
               this.method_6118(class07085).N(1, this, class07085);
            }

            this.method_32876(class01194.m);
         }
      }
   }

   public class07085 method_32326(class06584 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.m_handler$zge000$fabric_item_api_v1$onGetPreferredEquipmentSlot_121(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07085)callbackinforeturnable.getReturnValue();
      } else {
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
         this.handler$dii000$viafabricplus$removeShieldSlotPreference(var1, callbackinforeturnable1);
         if (callbackinforeturnable1.isCancelled()) {
            return (class07085)callbackinforeturnable1.getReturnValue();
         } else {
            class08725 class08725 = var1.method_58694(class02484.o);
            return class08725 != null && this.method_56991(class08725.y()) ? class08725.y() : class07085.field_6173;
         }
      }
   }

   public float method_7292() {
      return 0.0F;
   }

   public void method_6021() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.method_73183().method_8608()) {
         boolean flag = this.method_6115();
         this.fields_11212a028292fd3c078969e3ee4c71d9e8_0 = null;
         this.method_6085(1, false);
         if (flag) {
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.N(this, class01194.Q);
         }
      }

      this.fields_9212a028292fd3c078969e3ee4c71d9e8_0 = class06584.E;
      this.fields_9212a028292fd3c078969e3ee4c71d9e8_1 = 0;
   }

   public void method_6060(class07438 var1) {
      var1.method_6005(0.5, var1.method_23317() - this.method_23317(), var1.method_23321() - this.method_23321());
   }

   public float method_6032() {
      float f;
      float f1 = f = this.field_6011.<Float>N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_1);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, f);
      this.handler$cfe000$nursultan$injectGetHealth(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueF() : f1;
   }

   private void method_6072() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_12212a028292fd3c078969e3ee4c71d9e8_0 = this.fields_11212a028292fd3c078969e3ee4c71d9e8_1;
      if (this.method_20232()) {
         this.fields_11212a028292fd3c078969e3ee4c71d9e8_1 = Math.min(1.0F, this.fields_11212a028292fd3c078969e3ee4c71d9e8_1 + 0.09F);
      } else {
         this.fields_11212a028292fd3c078969e3ee4c71d9e8_1 = Math.max(0.0F, this.fields_11212a028292fd3c078969e3ee4c71d9e8_1 - 0.09F);
      }
   }

   public void method_16077(class04782 var1, class07072 var2, boolean var3) {
      Optional<class05946<class05074>> optional = this.method_5991();
      if (!optional.isEmpty()) {
         this.method_72395(var1, var2, var3, optional.get());
      }
   }

   public double method_45325(class03556<class07468> var1) {
      return this.method_6127().L(var1);
   }

   public void method_72395(class04782 var1, class07072 var2, boolean var3, class05946<class05074> var4) {
      this.method_72396(var1, var2, var3, var4, var2x -> this.method_5775(var1, var2x));
   }

   public boolean method_45324(class06584 var1, class06584 var2) {
      return !class06584.N(var2, var1);
   }

   public static boolean method_6089(Collection<class07055> var0) {
      for (class07055 class07055 : var0) {
         if (class07055.M() && !class07055.R()) {
            return false;
         }
      }

      return true;
   }

   public int method_6096() {
      return class04995.N(this.method_45325(class05298.y));
   }

   public void method_6013(class07072 var1) {
      this.method_56078(this.method_6011(var1));
   }

   public float method_53964() {
      return 50.0F;
   }

   public void method_23328() {
      if (!this.method_5701()) {
         int i = class04995.N(this.method_23317());
         int j = class04995.N(this.method_23318() - 0.2F);
         int k = class04995.N(this.method_23321());
         class00500 class00500 = this.method_73183().method_8320(new class07209(i, j, k));
         if (!class00500.P()) {
            class07752 class07752 = class00500.O();
            this.method_5783(class07752.M(), class07752.N() * 0.5F, class07752.y() * 0.75F);
         }
      }
   }

   public void method_75122(class07049 var1, float var2, class06889 var3) {
      if (var2 > 0.0F && var1 instanceof class07438) {
         ((class07438)var1)
            .method_6005(var2, class04995.m(this.method_36454() * (float) (Math.PI / 180.0)), -class04995.P(this.method_36454() * (float) (Math.PI / 180.0)));
         this.method_18799(this.method_18798().u(0.6, 1.0, 0.6));
      }
   }

   public void method_6073(float var1) {
      this.method_52544(class04995.N(var1, 0.0F, this.method_52541()));
   }

   public boolean method_6071() {
      return false;
   }

   public void method_6122(class07050 var1, class06584 var2) {
      if (var1 == class07050.field_5808) {
         this.method_5673(class07085.field_6173, var2);
      } else {
         if (var1 != class07050.field_5810) {
            throw new IllegalArgumentException("Invalid hand " + var1);
         }

         this.method_5673(class07085.field_6171, var2);
      }
   }

   private void method_30127() {
      class06584 class06584 = this.method_6118(class07085.field_6171);
      this.method_5673(class07085.field_6171, this.method_6118(class07085.field_6173));
      this.method_5673(class07085.field_6173, class06584);
   }

   public void method_56078(@Nullable class04891 var1) {
      if (var1 != null) {
         this.method_5783(var1, this.method_6107(), this.method_6017());
      }
   }

   private void method_30121(Map<class07085, class06584> var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      class06584 class06584x = (class06584)var1.get(class07085.field_6173);
      class06584 class06584x = (class06584)var1.get(class07085.field_6171);
      if (class06584x != null
         && class06584x != null
         && class06584.N(class06584x, (class06584)this.fields_0212a028292fd3c078969e3ee4c71d9e8_3.get(class07085.field_6171))
         && class06584.N(class06584x, (class06584)this.fields_0212a028292fd3c078969e3ee4c71d9e8_3.get(class07085.field_6173))) {
         ((class04782)this.method_73183()).method_14178().y(this, new class00509(this, (byte)55));
         var1.remove(class07085.field_6173);
         var1.remove(class07085.field_6171);
         this.fields_0212a028292fd3c078969e3ee4c71d9e8_3.put(class07085.field_6173, class06584x.t());
         this.fields_0212a028292fd3c078969e3ee4c71d9e8_3.put(class07085.field_6171, class06584x.t());
      }
   }

   public float method_18396() {
      int i = 0;
      int j = 0;

      for (class07085 class07085 : class02834.field_49224) {
         if (class07085.N() == class07043.field_6178) {
            if (!this.method_6118(class07085).R()) {
               j++;
            }

            i++;
         }
      }

      return i > 0 ? (float)j / i : 0.0F;
   }

   public int method_6117() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_8212a028292fd3c078969e3ee4c71d9e8_1;
   }

   public boolean method_6016(class03556<class07084> var1) {
      return this.m_wrapMethod$zek000$fabric_entity_events_v1$allowRemoveEffect_126(var1, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 1, "[net.minecraft.class_6880]");
         return this.method_6016$mixinextras$wrapped$486((class03556)var1x[0]);
      });
   }

   public void method_52540(class03556<class07468> var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (var1.N(class05298.n)) {
         float f = this.method_6063();
         if (this.method_6032() > f) {
            this.method_6033(f);
         }
      } else if (var1.N(class05298.v)) {
         float f1 = this.method_52541();
         if (this.method_6067() > f1) {
            this.method_6073(f1);
         }
      } else if (var1.N(class05298.k)) {
         this.method_18382();
      } else if (var1.N(class05298.q) && this.method_73183() instanceof class04782 class04782) {
         class00031 class00031 = class04782.method_70636();
         if (this.fields_0212a028292fd3c078969e3ee4c71d9e8_0.L(var1) > 0.0) {
            class00031.N((class00042)this);
         } else {
            class00031.L((class00042)this);
         }
      }
   }

   @Nullable
   public class07438 method_6124() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.fields_5212a028292fd3c078969e3ee4c71d9e8_2 != null) {
         return this.fields_5212a028292fd3c078969e3ee4c71d9e8_2.N(this.method_73183(), class08036.class);
      } else {
         return this.fields_8212a028292fd3c078969e3ee4c71d9e8_0 != null
            ? this.fields_8212a028292fd3c078969e3ee4c71d9e8_0.N(this.method_73183(), class07438.class)
            : null;
      }
   }

   public float method_52541() {
      return (float)this.method_45325(class05298.v);
   }

   public void method_49481(class08036 var1, class06889 var2) {
   }

   public boolean method_26319(class04688 var1) {
      return false;
   }

   public boolean method_29503() {
      return false;
   }

   public void method_75125() {
      class07299 class07299 = this.method_73183();
      if (class07299 instanceof class04782) {
         class07323.N((class04782)class07299, (class07049)this);
      }
   }

   public void method_6009(class07055 var1, boolean var2, @Nullable class07049 var3) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.method_73183().method_8608()) {
         this.fields_7212a028292fd3c078969e3ee4c71d9e8_6 = true;
         if (var2) {
            class07084 class07084 = var1.L().N();
            class07084.N(this.method_6127());
            class07084.N(this.method_6127(), var1.i());
            this.method_52543();
         }

         this.method_52197(var1);
      }
   }

   public float method_56994(float var1) {
      return (float)this.method_45325(class05298.T) * var1 * this.method_23313() + this.method_37416();
   }

   public void method_6040() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.method_73183().method_8608() || this.method_6115()) {
         class07050 class07050 = this.method_6058();
         if (!this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.equals(this.method_5998(class07050))) {
            this.method_6075();
         } else {
            if (!this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.R() && this.method_6115()) {
               class06584 class06584 = this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.N(this.method_73183(), this);
               if (class06584 != this.fields_9212a028292fd3c078969e3ee4c71d9e8_0) {
                  this.method_6122(class07050, class06584);
               }

               this.method_6021();
            }
         }
      }
   }

   public void method_6069() {
      this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_2, List.of());
   }

   public void method_75119(class07049 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.fields_11212a028292fd3c078969e3ee4c71d9e8_0 != null) {
         this.fields_11212a028292fd3c078969e3ee4c71d9e8_0.put(var1, this.method_73183().N());
      }
   }

   public float method_6029() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_8212a028292fd3c078969e3ee4c71d9e8_4;
   }

   public boolean method_63625(class06584 var1) {
      if (this.method_5805() && !this.method_7325()) {
         class08725 class08725 = var1.method_58694(class02484.o);
         if (class08725 != null && class08725.M()) {
            class07085 class07085 = class08725.y();
            return this.method_56991(class07085) && class08725.N(this.method_5864())
               ? this.method_6118(class07085).R() && this.method_63626(class07085)
               : false;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean method_63626(class07085 var1) {
      return true;
   }

   private void method_6045(class06584 var1) {
      if (!var1.R()) {
         class03556 class03556 = var1.method_58694(class02484.NY);
         if (class03556 != null && !this.method_5701()) {
            this.method_73183()
               .method_8486(
                  this.method_23317(),
                  this.method_23318(),
                  this.method_23321(),
                  (class04891)class03556.N(),
                  this.method_5634(),
                  0.8F,
                  0.8F + this.method_73183().field_9229.z() * 0.4F,
                  false
               );
         }

         this.method_6037(var1, 5);
      }
   }

   @class09956(
      N = "onClimbable"
   )
   public boolean method_6101() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.method_7325()) {
         boolean flag = false;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag);
         this.handler$dmf000$viafabricplus$allowGappedLadderClimb(callbackinforeturnable);
         return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : false;
      } else {
         class07209 class07209 = this.method_24515();
         class00500 class00500 = this.method_55667();
         if (this.method_6128() && class00500.N(class01210.ym)) {
            boolean flag1 = false;
            CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true, flag1);
            this.handler$dmf000$viafabricplus$allowGappedLadderClimb(callbackinforeturnable1);
            return callbackinforeturnable1.isCancelled() ? callbackinforeturnable1.getReturnValueZ() : false;
         } else if (class00500.N(class01210.yu)) {
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_5 = Optional.of(class07209);
            boolean flag2 = true;
            CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true, flag2);
            this.handler$dmf000$viafabricplus$allowGappedLadderClimb(callbackinforeturnable2);
            return callbackinforeturnable2.isCancelled() ? callbackinforeturnable2.getReturnValueZ() : true;
         } else if (class00500.i() instanceof class00624 && this.method_6077(class07209, class00500)) {
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_5 = Optional.of(class07209);
            boolean flag3 = true;
            CallbackInfoReturnable callbackinforeturnable3 = new CallbackInfoReturnable("", true, flag3);
            this.handler$dmf000$viafabricplus$allowGappedLadderClimb(callbackinforeturnable3);
            return callbackinforeturnable3.isCancelled() ? callbackinforeturnable3.getReturnValueZ() : true;
         } else {
            boolean flag4 = false;
            CallbackInfoReturnable callbackinforeturnable4 = new CallbackInfoReturnable("", true, flag4);
            this.handler$dmf000$viafabricplus$allowGappedLadderClimb(callbackinforeturnable4);
            return callbackinforeturnable4.isCancelled() ? callbackinforeturnable4.getReturnValueZ() : false;
         }
      }
   }

   public void method_52197(class07055 var1) {
      for (class07049 class07049 : this.method_5685()) {
         if (class07049 instanceof class04770) {
            ((class04770)class07049).field_13987.method_14364(new class08087(this.method_5628(), var1, false));
         }
      }
   }

   @Nullable
   public class07469 method_5996(class03556<class07468> var1) {
      return this.method_6127().N(var1);
   }

   public void method_6078(class07072 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.method_31481() && !this.fields_6212a028292fd3c078969e3ee4c71d9e8_1) {
         class07049 class07049 = var1.u();
         class07438 class07438 = this.method_6124();
         if (class07438 != null) {
            class07438.method_5716(this, var1);
         }

         if (this.method_6113()) {
            this.method_18400();
         }

         this.method_6021();
         if (!this.method_73183().method_8608() && this.method_16914()) {
            staticFields_0212a028292fd3c078969e3ee4c71d9e8_0.info("Named entity {} died: {}", this, this.method_6066().N().getString());
         }

         this.fields_6212a028292fd3c078969e3ee4c71d9e8_1 = true;
         this.method_6066().L();
         if (this.method_73183() instanceof class04782 class04782) {
            if (class07049 == null
               || this.m_wrapOperation$zed000$fabric_entity_events_v1$onEntityKilledOther_119(
                  class07049,
                  class04782,
                  this,
                  var1,
                  var0 -> {
                     WrapOperationRuntime.checkArgumentCount(
                        var0, 4, "[net.minecraft.class_1297, net.minecraft.class_3218, net.minecraft.class_1309, net.minecraft.class_1282]"
                     );
                     return ((class07049)var0[0]).method_5874((class04782)var0[1], (class07438)var0[2], (class07072)var0[3]);
                  }
               )) {
               this.method_32876(class01194.s);
               this.method_16080(class04782, var1);
               this.method_23733(class07438);
            }

            class07299 class07299 = this.method_73183();
            this.m_handler$zed000$fabric_entity_events_v1$notifyDeath_112(var1, null);
            class07299.method_8421(this, (byte)3);
         }

         this.method_18380(class01312.field_18082);
      }
   }

   public void method_66277(class08036 var1, int var2) {
      this.method_29505(class08372.N(var1), var2);
   }

   public void method_60699(class04782 var1, class07062 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      Iterator<class07055> iterator = this.method_6026().iterator();

      while (iterator.hasNext()) {
         iterator.next().N(var1, this, var2);
      }

      ((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).clear();
   }

   @Nullable
   public class04891 method_6011(class07072 var1) {
      return class04909.EC;
   }

   public float method_66279(class03556<class07084> var1, float var2) {
      class07055 class07055 = this.method_6112(var1);
      return class07055 != null ? class07055.N(this, var2) : 0.0F;
   }

   public void method_41329() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_12212a028292fd3c078969e3ee4c71d9e8_2 = true;
   }

   public boolean method_6059(class03556<class07084> var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return ((Map)this.fields_0212a028292fd3c078969e3ee4c71d9e8_2).containsKey(var1);
   }

   private void method_61424(double var1, double var3) {
      if (this.field_5976) {
         float f = (float)((var1 - var3) * 10.0 - 3.0);
         if (f > 0.0F) {
            this.method_5783(this.method_6041((int)f), 1.0F, 1.0F);
            this.method_64419(this.method_48923().m(), f);
         }
      }
   }

   public Optional<class07209> method_18398() {
      return this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_6);
   }

   private void method_76089(class06889 var1, double var2, boolean var4, double var5) {
      this.method_5724(0.02F, var1);
      this.method_5784(class07451.field_6308, this.method_18798());
      class03530<class04651> class03530 = class01231.y;
      if (this.redirect$dnn000$viafabricplus$dontApplyLavaMovement(this, class03530) <= this.method_29241()) {
         this.method_18799(this.method_18798().u(0.5, 0.8F, 0.5));
         class06889 class06889 = this.method_26317(var2, var4, this.method_18798());
         this.method_18799(class06889);
      } else {
         this.method_18799(this.method_18798().L(0.5));
      }

      if (var2 != 0.0) {
         this.method_18799(this.method_18798().y(0.0, -var2 / 4.0, 0.0));
      }

      this.method_76090(var5);
   }

   @Nullable
   private Map<class07085, class06584> method_30129() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$boi000$lithium$skipSentEquipmentComparison(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (Map<class07085, class06584>)callbackinforeturnable.getReturnValue();
      } else {
         EnumMap enummap = null;

         for (class07085 class07085x : class07085.field_54086) {
            class06584 class06584xx = (class06584)this.fields_0212a028292fd3c078969e3ee4c71d9e8_3.get(class07085x);
            class06584 class06584x = this.method_6118(class07085x);
            if (this.method_45324(class06584xx, class06584x)) {
               if (enummap == null) {
                  enummap = Maps.newEnumMap(class07085.class);
               }

               this.m_handler$zhc000$fabric_lifecycle_events_v1$getEquipmentChanges_120(null, class07085x, class06584xx, class06584x);
               enummap.put(class07085x, class06584x);
               class05320 class05320 = this.method_6127();
               if (!class06584xx.R()) {
                  this.method_61422(class06584xx, class07085x, class05320);
               }
            }
         }

         if (enummap != null) {
            for (Entry entry : enummap.entrySet()) {
               class07085 class07085x = (class07085)entry.getKey();
               class06584 class06584 = (class06584)entry.getValue();
               if (!class06584.R() && !class06584.T()) {
                  class06584.N(class07085x, (var1x, var2) -> {
                     this.fields212a028292fd3c078969e3ee4c71d9e8();
                     class07469 class07469 = this.fields_0212a028292fd3c078969e3ee4c71d9e8_0.N(var1x);
                     if (class07469 != null) {
                        class07469.L(var2.N());
                        class07469.y(var2);
                     }
                  });
                  if (this.method_73183() instanceof class04782 class04782) {
                     class07323.N(class04782, class06584, this, class07085x);
                  }
               }
            }
         }

         return enummap;
      }
   }

   public float method_67346(class04782 var1, class07072 var2, float var3) {
      if (var3 <= 0.0F) {
         return 0.0F;
      } else {
         class06584 class06584 = this.method_62821();
         if (class06584 == null) {
            return 0.0F;
         } else {
            class08576 class08576 = class06584.method_58694(class02484.H);
            if (class08576 != null && !class08576.R().map(var2::N).orElse(false)) {
               if (var2.L() instanceof class08007 class08007 && class08007.U() > 0) {
                  return 0.0F;
               } else {
                  class06889 class06889xx = var2.Z();
                  double d0;
                  if (class06889xx != null) {
                     class06889 class06889x = this.method_5631(0.0F, this.method_5791());
                     class06889 class06889xx = class06889xx.u(this.method_73189());
                     class06889xx = new class06889(class06889xx.M, 0.0, class06889xx.Z).u();
                     d0 = Math.acos(class06889xx.y(class06889x));
                  } else {
                     d0 = (float) Math.PI;
                  }

                  float f = class08576.N(var2, var3, d0);
                  class08576.N(this.method_73183(), class06584, this, this.method_6058(), f);
                  if (f > 0.0F && !var2.N(class03696.z) && var2.L() instanceof class07438 class07438) {
                     this.method_6090(var1, class07438);
                  }

                  return f;
               }
            } else {
               return 0.0F;
            }
         }
      }
   }

   public void method_18400() {
      this.m_handler$zed000$fabric_entity_events_v1$onWakeUp_115(null);
      this.method_18398()
         .filter(this.method_73183()::E)
         .ifPresent(
            var1x -> {
               class00500 class00500xx = this.method_73183().method_8320(var1x);
               class00500xx = this.m_localvar$zed000$fabric_entity_events_v1$modifyBedForOccupiedState_123(class00500xx, var1x);
               if (class00500xx.i() instanceof class07789) {
                  class07211 class07211 = class00500xx.L(class07789.R);
                  class07299 class07299 = this.method_73183();
                  class00500 class00500x = class00500xx.y(class07789.L, false);
                  byte b0 = 3;
                  class00500 class00500xx = class00500x;
                  class07299 class07299x = class07299;
                  this.m_redirect$zed000$fabric_entity_events_v1$setOccupiedState_108(class07299x, var1x, class00500xx, b0);
                  class07078 class07078 = this.method_5864();
                  float f1 = this.method_36454();
                  class07299 class07299xx = this.method_73183();
                  class07078<?> class07078x = class07078;
                  class06889 class06889x = this.m_redirect$zed000$fabric_entity_events_v1$modifyWakeUpPosition_125(
                        class07078x, class07299xx, var1x, class07211, f1
                     )
                     .orElseGet(() -> {
                        class07209 class07209 = var1x.method_10084();
                        return new class06889(class07209.method_10263() + 0.5, class07209.method_10264() + 0.1, class07209.method_10260() + 0.5);
                     });
                  class06889 class06889xx = class06889.L(var1x).u(class06889x).u();
                  float f = (float)class04995.i(class04995.u(class06889xx.Z, class06889xx.M) * 180.0F / (float)Math.PI - 90.0);
                  this.method_5814(class06889x.M, class06889x.B, class06889x.Z);
                  this.method_36456(f);
                  this.method_36457(0.0F);
               }
            }
         );
      class06889 class06889 = this.method_73189();
      this.method_18380(class01312.field_18076);
      this.method_5814(class06889.M, class06889.B, class06889.Z);
      this.method_18399();
   }

   public float method_75120(float var1) {
      return !this.method_6115() ? 0.0F : this.method_6048() + var1;
   }

   public int method_76444(Predicate<class07049> var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_11212a028292fd3c078969e3ee4c71d9e8_0 == null
         ? 0
         : (int)this.fields_11212a028292fd3c078969e3ee4c71d9e8_0.keySet().stream().filter(var1).count();
   }

   @Nullable
   public class06584 method_62821() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (!this.method_6115()) {
         return null;
      } else {
         class08576 class08576 = this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.method_58694(class02484.H);
         return class08576 != null
               && this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.B().N(this.fields_9212a028292fd3c078969e3ee4c71d9e8_0, this)
                     - this.fields_9212a028292fd3c078969e3ee4c71d9e8_1
                  >= class08576.N()
            ? this.fields_9212a028292fd3c078969e3ee4c71d9e8_0
            : null;
      }
   }

   public class01289<?> method_18867(Dynamic<?> var1) {
      return this.method_28306().N(var1);
   }

   private boolean method_18406() {
      return this.method_18398().map(var1 -> {
         Boolean obool;
         Boolean obool1 = obool = this.method_73183().method_8320(var1).i() instanceof class07789;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, obool);
         this.m_handler$zed000$fabric_entity_events_v1$onIsSleepingInBed_106(var1, callbackinforeturnable);
         return callbackinforeturnable.isCancelled() ? (Boolean)callbackinforeturnable.getReturnValue() : obool1;
      }).orElse(false);
   }

   private void method_30128() {
      Map<class07085, class06584> map = this.method_30129();
      if (map != null) {
         this.handler$boi000$lithium$resetEquipmentChanged(null);
         this.method_30121(map);
         if (!map.isEmpty()) {
            this.method_30123(map);
         }
      }
   }

   public void method_6103(class07049 var1, int var2) {
      if (!var1.method_31481()
         && !this.method_73183().method_8608()
         && (var1 instanceof class00717 || var1 instanceof class08007 || var1 instanceof class07057)) {
         ((class04782)this.method_73183()).method_14178().y(var1, new class08081(var1.method_5628(), this.method_5628(), var2));
      }
   }

   public void method_57292(class07072 var1, float var2, class07085... var3) {
      if (!(var2 <= 0.0F)) {
         int i = (int)Math.max(1.0F, var2 / 4.0F);

         for (class07085 class07085 : var3) {
            class06584 class06584 = this.method_6118(class07085);
            class08725 class08725 = class06584.method_58694(class02484.o);
            if (class08725 != null && class08725.Z() && class06584.W() && class06584.N(var1)) {
               class06584.N(i, this, class07085);
            }
         }
      }
   }

   public void method_6126(class04782 var1, class07209 var2) {
      class07323.N(var1, this);
   }

   public boolean method_6039() {
      return this.method_62821() != null;
   }

   public float method_6017() {
      return this.method_6109() ? (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.5F : (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F;
   }

   public boolean method_63628() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$cfe000$nursultan$injectCanGlide(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         if (!this.method_24828() && !this.redirect$dna000$viafabricplus$allowElytraInVehicle(this)) {
            class03556<class07084> class03556 = class07047.d;
            if (!this.redirect$dna000$viafabricplus$allowElytraWhenLevitating(this, class03556)) {
               for (class07085 class07085 : class07085.field_54086) {
                  if (method_63624(this.method_6118(class07085), class07085)) {
                     return true;
                  }
               }

               return false;
            }
         }

         return false;
      }
   }

   public void method_70670(class06889 var1, float var2) {
      this.method_70671(var1, 0.02F, 0.02F, var2);
   }

   public boolean method_33190() {
      return !this.method_5655() && this.method_36608();
   }

   private void method_49483(class08036 var1, class06889 var2) {
      class06889 class06889 = this.method_49482(var1, var2);
      this.method_49481(var1, class06889);
      if (this.method_66249()) {
         this.method_6125(this.method_49485(var1));
         this.method_6091(class06889);
      } else {
         this.method_18799(class06889.L);
      }
   }

   @Nullable
   private class00717 method_67517(class06584 var1, boolean var2, boolean var3) {
      if (var1.R()) {
         return null;
      } else {
         double d0 = this.method_23320() - 0.3F;
         class00717 class00717 = new class00717(this.method_73183(), this.method_23317(), d0, this.method_23321(), var1);
         class00717.N(40);
         if (var3) {
            class00717.N(this);
         }

         if (var2) {
            float f = this.field_5974.z() * 0.5F;
            float f1 = this.field_5974.z() * (float) (Math.PI * 2);
            class00717.method_18800(-class04995.m(f1) * f, 0.2F, class04995.P(f1) * f);
         } else {
            float f7 = 0.3F;
            float f8 = class04995.m(this.method_36455() * (float) (Math.PI / 180.0));
            float f2 = class04995.P(this.method_36455() * (float) (Math.PI / 180.0));
            float f3 = class04995.m(this.method_36454() * (float) (Math.PI / 180.0));
            float f4 = class04995.P(this.method_36454() * (float) (Math.PI / 180.0));
            float f5 = this.field_5974.z() * (float) (Math.PI * 2);
            float f6 = 0.02F * this.field_5974.z();
            class00717.method_18800(
               -f3 * f2 * 0.3F + Math.cos(f5) * f6, -f8 * 0.3F + 0.1F + (this.field_5974.z() - this.field_5974.z()) * 0.1F, f4 * f2 * 0.3F + Math.sin(f5) * f6
            );
         }

         return class00717;
      }
   }

   public Map<class07304, Set<class02548>> method_59926(class07085 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return (Map<class07304, Set<class02548>>)this.fields_13212a028292fd3c078969e3ee4c71d9e8_0.computeIfAbsent(var1, var0 -> new Reference2ObjectArrayMap());
   }

   public static class06889 method_31079(class06889 var0) {
      return new class06889(var0.M, var0.B, 0.0);
   }

   public void method_6037(class06584 var1, int var2) {
      for (int i = 0; i < var2; i++) {
         class06889 class06889x = new class06889((this.field_5974.z() - 0.5) * 0.1, this.field_5974.z() * 0.1 + 0.1, 0.0);
         class06889x = class06889x.N(-this.method_36455() * (float) (Math.PI / 180.0));
         class06889x = class06889x.y(-this.method_36454() * (float) (Math.PI / 180.0));
         double d0 = -this.field_5974.z() * 0.6 - 0.3;
         class06889 class06889x = new class06889((this.field_5974.z() - 0.5) * 0.3, d0, 0.6);
         class06889x = class06889x.N(-this.method_36455() * (float) (Math.PI / 180.0));
         class06889x = class06889x.y(-this.method_36454() * (float) (Math.PI / 180.0));
         class06889x = class06889x.y(this.method_23317(), this.method_23320(), this.method_23321());
         this.method_73183()
            .method_8406(new class07092(class07107.S, var1), class06889x.M, class06889x.B, class06889x.Z, class06889x.M, class06889x.B + 0.05, class06889x.Z);
      }
   }

   @Nullable
   public class07072 method_6081() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.method_73183().N() - this.fields_10212a028292fd3c078969e3ee4c71d9e8_0 > 40L) {
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_6 = null;
      }

      return this.fields_9212a028292fd3c078969e3ee4c71d9e8_6;
   }

   public void method_20235(class06581 var1, class07085 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.method_73183().method_8421(this, method_20237(var2));
      this.method_61422(this.method_6118(var2), var2, this.fields_0212a028292fd3c078969e3ee4c71d9e8_0);
   }

   public void method_16826(int var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = var1;
   }

   @Nullable
   private static class07085 method_32322(int var0) {
      if (var0 == 100 + class07085.field_6169.y()) {
         return class07085.field_6169;
      } else if (var0 == 100 + class07085.field_6174.y()) {
         return class07085.field_6174;
      } else if (var0 == 100 + class07085.field_6172.y()) {
         return class07085.field_6172;
      } else if (var0 == 100 + class07085.field_6166.y()) {
         return class07085.field_6166;
      } else if (var0 == 98) {
         return class07085.field_6173;
      } else if (var0 == 99) {
         return class07085.field_6171;
      } else if (var0 == 105) {
         return class07085.field_48824;
      } else {
         return var0 == 106 ? class07085.field_55946 : null;
      }
   }

   public boolean method_5973(class07078<?> var1) {
      return true;
   }

   public void method_75124() {
   }

   @Override
   public Optional<class00038> method_70672(class04770 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.field_5953 || var1 == this) {
         return Optional.empty();
      } else if (class00042.N(this, var1)) {
         return Optional.empty();
      } else {
         class00028 class00028 = this.fields_13212a028292fd3c078969e3ee4c71d9e8_2.N(this);
         if (class00042.y(this, var1)) {
            return Optional.of(new class11336(this, class00028, var1));
         } else {
            return !class00042.N(this.method_31476(), var1)
               ? Optional.of(new class11335(this, class00028, var1))
               : Optional.of(new class11342(this, class00028, var1));
         }
      }
   }

   private void method_36362() {
      boolean flag = this.method_5851();
      if (this.method_5795(6) != flag) {
         this.method_5729(6, flag);
      }
   }

   public int method_6048() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.method_6115() ? this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.N(this) - this.method_6014() : 0;
   }

   public float method_6120() {
      return 0.8F;
   }

   public class03556<class04891> method_66667(class07085 var1, class06584 var2, class08725 var3) {
      return var3.L();
   }

   private void method_61417(class06889 var1) {
      if (this.redirect$dna000$viafabricplus$dontStopGlidingWhenClimbing(this)) {
         this.method_61428(var1);
         this.method_66281();
      } else {
         class06889 class06889 = this.method_18798();
         double d0 = class06889.Z();
         this.method_18799(this.method_61430(class06889));
         this.method_5784(class07451.field_6308, this.method_18798());
         this.handler$zzl000$baritone$onPostElytraMove(null);
         if (!this.method_73183().method_8608()) {
            double d1 = this.method_18798().Z();
            this.method_61424(d0, d1);
         }
      }
   }

   public void method_5997(class07438 var1) {
   }

   public void method_6075() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      class06584 class06584 = this.method_5998(this.method_6058());
      if (!this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.R() && class06584.y(class06584, this.fields_9212a028292fd3c078969e3ee4c71d9e8_0)) {
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_0 = class06584;
         this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.N(this.method_73183(), this, this.method_6014());
         if (this.fields_9212a028292fd3c078969e3ee4c71d9e8_0.l()) {
            this.method_6076();
         }
      }

      this.method_6021();
   }

   public int method_6083() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_8212a028292fd3c078969e3ee4c71d9e8_3;
   }

   public void method_18399() {
      this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_6, Optional.empty());
   }

   public void method_6070() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.handler$dmf000$viafabricplus$preventEntityPush(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         List<class07049> list = this.method_73183().method_66349(this, this.method_5829());
         if (!list.isEmpty()) {
            if (this.method_73183() instanceof class04782 var2) {
               int j = var2.method_64395().N(class07305.k);
               if (j > 0 && list.size() > j - 1 && this.field_5974.y(4) == 0) {
                  int i = 0;
                  Iterator<class07049> iterator = list.iterator();

                  while (iterator.hasNext()) {
                     if (!iterator.next().method_5765()) {
                        i++;
                     }
                  }

                  if (i > j - 1) {
                     this.method_64397(var2, this.method_48923().B(), 6.0F);
                  }
               }
            }

            for (class07049 class07049 : list) {
               this.method_6087(class07049);
            }
         }
      }
   }

   private float method_18802(float var1) {
      return this.method_24828() ? this.method_6029() * (0.21600002F / (var1 * var1 * var1)) : this.method_49484();
   }

   public int method_6022() {
      return this.field_6011.<Integer>N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_4);
   }

   public boolean method_64618(class07049 var1, class05849 var2, class05835 var3, double var4) {
      if (var1.method_73183() != this.method_73183()) {
         return false;
      } else {
         class06889 class06889x = new class06889(this.method_23317(), this.method_23320(), this.method_23321());
         class06889 class06889x = new class06889(var1.method_23317(), var4, var1.method_23321());
         return class06889x.R(class06889x) > 128.0
            ? false
            : this.method_73183().N(new class05862(class06889x, class06889x, var2, var3, this)).N() == class07113.field_1333;
      }
   }

   private boolean method_6095(class07072 var1) {
      if (var1.N(class03696.u)) {
         return false;
      } else {
         class06584 class06584x = null;
         class08723 class08723 = null;

         for (class07050 class07050 : class07050.values()) {
            class06584 class06584x = this.method_5998(class07050);
            class08723 = class06584x.method_58694(class02484.e);
            if (class08723 != null) {
               class06584x = class06584x.t();
               class06584x.B(1);
               break;
            }
         }

         if (class06584x != null) {
            if (this instanceof class04770 class04770) {
               class04770.method_7259(class01235.L.y(class06584x.B()));
               class06912.Q.N(class04770, class06584x);
               class06584x.N(this, class01194.Q);
            }

            this.method_6033(1.0F);
            class08723.N(class06584x, this);
            this.method_73183().method_8421(this, (byte)35);
         }

         return class08723 != null;
      }
   }

   private void method_76090(double var1) {
      class06889 class06889 = this.method_18798();
      if (this.field_5976 && this.method_5654(class06889.M, class06889.B + 0.6F - this.method_23318() + var1, class06889.Z)) {
         this.method_18800(class06889.M, 0.3F, class06889.Z);
      }
   }

   public void method_6035(class00734 var1, class00734 var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      class00734 class00734 = var1.y(var2);
      List<class07049> list = this.method_73183().N_70(this, class00734);
      if (!list.isEmpty()) {
         for (class07049 class07049 : list) {
            if (class07049 instanceof class07438) {
               this.method_5997((class07438)class07049);
               this.fields_10212a028292fd3c078969e3ee4c71d9e8_1 = 0;
               this.method_18799(this.method_18798().L(-0.2));
               break;
            }
         }
      } else if (this.field_5976) {
         this.fields_10212a028292fd3c078969e3ee4c71d9e8_1 = 0;
      }

      if (!this.method_73183().method_8608() && this.fields_10212a028292fd3c078969e3ee4c71d9e8_1 <= 0) {
         this.method_6085(4, false);
         this.fields_10212a028292fd3c078969e3ee4c71d9e8_2 = 0.0F;
         this.fields_10212a028292fd3c078969e3ee4c71d9e8_3 = null;
      }
   }

   public void method_6105(class07072 var1, float var2) {
   }

   public void method_61419(class04782 var1, class05946<class05074> var2, class06584 var3, BiConsumer<class04782, class06584> var4) {
      this.method_64170(var1, var2, var2x -> var2x.N(class06551.B, this.method_73189()).N(class06551.N, this).N(class06551.U, var3).N(class06925.v), var4);
   }

   public boolean method_29920() {
      return true;
   }

   public class06889 method_49482(class08036 var1, class06889 var2) {
      return var2;
   }

   public void method_6108() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_2212a028292fd3c078969e3ee4c71d9e8_2 = this.fields_2212a028292fd3c078969e3ee4c71d9e8_2 + 1;
      if (this.fields_2212a028292fd3c078969e3ee4c71d9e8_2 >= 20 && !this.method_73183().method_8608() && !this.method_31481()) {
         this.method_73183().method_8421(this, (byte)60);
         this.method_5650(class07062.field_26998);
      }
   }

   public void method_6097(int var1) {
      this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_4, var1);
   }

   public void method_52539(int var1, double var2) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = (float)class04995.i(
         1.0 / var1, (double)this.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue(), var2
      );
   }

   public boolean method_41330() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_12212a028292fd3c078969e3ee4c71d9e8_2;
   }

   public void method_6010(class03530<class04651> var1) {
      this.method_18799(this.method_18798().y(0.0, 0.04F, 0.0));
   }

   @Override
   public class07438 method_49107() {
      return this.method_6065();
   }

   public void method_23733(@Nullable class07438 var1) {
      if (this.method_73183() instanceof class04782 class04782) {
         boolean flag = false;
         if (var1 instanceof class00680) {
            if (class04782.method_64395().N(class07305.I)) {
               class07209 class07209 = this.method_24515();
               class00500 class00500 = class00869.Lm.W();
               if (this.method_73183().method_8320(class07209).P() && class00500.N((class05487)this.method_73183(), class07209)) {
                  this.method_73183().method_8652(class07209, class00500, 3);
                  flag = true;
               }
            }

            if (!flag) {
               class00717 class00717 = new class00717(
                  this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321(), new class06584(class06570.uK)
               );
               this.method_73183().method_8649(class00717);
            }
         }
      }
   }

   public boolean method_56991(class07085 var1) {
      return true;
   }

   public class07076 method_6066() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_0212a028292fd3c078969e3ee4c71d9e8_1;
   }

   public void method_18402(class07209 var1) {
      this.field_6011.N(staticFields_6212a028292fd3c078969e3ee4c71d9e8_6, Optional.of(var1));
   }

   public float method_6024(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return class04995.B(var1, this.fields_12212a028292fd3c078969e3ee4c71d9e8_0, this.fields_11212a028292fd3c078969e3ee4c71d9e8_1);
   }

   private void method_6076() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      if (this.method_6115()) {
         class06584 class06584 = this.method_5998(this.method_6058());
         class06584 class06584x = this.fields_9212a028292fd3c078969e3ee4c71d9e8_0;
         class06584 class06584xx = class06584;
         if (this.redirect$dii000$viafabricplus$replaceItemStackEqualsCheck(class06584xx, class06584x)) {
            this.fields_9212a028292fd3c078969e3ee4c71d9e8_0 = this.method_5998(this.method_6058());
            this.method_37119(this.fields_9212a028292fd3c078969e3ee4c71d9e8_0);
         } else {
            this.method_6021();
         }
      }
   }

   public boolean method_6102() {
      return true;
   }

   public void method_37119(class06584 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      var1.y(this.method_73183(), this, this.method_6014());
      int i = this.fields_9212a028292fd3c078969e3ee4c71d9e8_1 - 1;
      this.fields_9212a028292fd3c078969e3ee4c71d9e8_1 = i;
      if (i == 0 && !this.method_73183().method_8608() && !var1.l()) {
         this.method_6040();
      }
   }

   public boolean method_6062() {
      return this.method_29504();
   }

   public float method_48157() {
      return 0.0F;
   }

   public void method_35054(boolean var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_0212a028292fd3c078969e3ee4c71d9e8_5 = var1;
   }

   public void method_52544(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      this.fields_8212a028292fd3c078969e3ee4c71d9e8_6 = var1;
   }

   public void method_76087(class06889 var1, double var2, boolean var4, double var5) {
      float f = this.redirect$dnn000$viafabricplus$modifySwimSprintSpeed(this)
         ? this.constant$dnn000$viafabricplus$modifySwimFriction(0.9F)
         : this.method_6120();
      float f1 = 0.02F;
      float f2 = (float)this.method_45325(class05298.o);
      if (!this.method_24828()) {
         f2 *= 0.5F;
      }

      if (f2 > 0.0F) {
         f += (0.54600006F - f) * f2;
         f1 += (this.method_6029() - f1) * f2;
      }

      if (this.method_6059(class07047.O)) {
         f = 0.96F;
      }

      this.method_5724(f1, var1);
      this.method_5784(class07451.field_6308, this.method_18798());
      class06889 class06889 = this.method_18798();
      if (this.redirect$dnn000$viafabricplus$disableClimbing(this) && this.method_6101()) {
         class06889 = new class06889(class06889.M, 0.2, class06889.Z);
      }

      class06889 = class06889.u(f, 0.8F, f);
      this.method_18799(this.method_26317(var2, var4, class06889));
      this.method_76090(var5);
   }

   public void method_6099(class04782 var1, class07072 var2, boolean var3) {
   }

   public class06889 method_26317(double var1, boolean var3, class06889 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dci000$viafabricplus$applyLevitationVelocity(var1, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class06889)callbackinforeturnable.getReturnValue();
      } else {
         var3 = this.localvar$dnn000$viafabricplus$modifyMovingDown(var3);
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
         this.handler$dnn000$viafabricplus$modifySwimSprintFallSpeed(var1, var3, var4, callbackinforeturnable1);
         if (callbackinforeturnable1.isCancelled()) {
            return (class06889)callbackinforeturnable1.getReturnValue();
         } else if (var1 != 0.0 && !this.redirect$dci000$viafabricplus$changeFluidGravityCondition(this)) {
            double d0;
            if (var3 && Math.abs(var4.B - 0.005) >= 0.003 && Math.abs(var4.B - var1 / 16.0) < 0.003) {
               d0 = -0.003;
            } else {
               d0 = var4.B - var1 / 16.0;
            }

            return new class06889(var4.M, d0, var4.Z);
         } else {
            return var4;
         }
      }
   }

   public void method_29242(boolean var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      float f = (float)class04995.M(
         this.method_23317() - this.field_6014, var1 ? this.method_23318() - this.field_6036 : 0.0, this.method_23321() - this.field_5969
      );
      if (!this.method_5765() && this.method_5805()) {
         this.method_48565(f);
      } else {
         this.fields_3212a028292fd3c078969e3ee4c71d9e8_3.N();
      }
   }

   public float method_6055(float var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      float f = this.fields_3212a028292fd3c078969e3ee4c71d9e8_0 - this.fields_2212a028292fd3c078969e3ee4c71d9e8_3;
      if (f < 0.0F) {
         f++;
      }

      return this.fields_2212a028292fd3c078969e3ee4c71d9e8_3 + f * var1;
   }

   @Override
   public class00028 method_70675() {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      return this.fields_13212a028292fd3c078969e3ee4c71d9e8_2;
   }

   public boolean method_59925() {
      return this.method_18798().y() < 1.0E-5F && this.method_52535();
   }

   public boolean method_5936() {
      return false;
   }

   private void updateClimbingMobCachingSection(class00500 var1) {
      this.fields212a028292fd3c078969e3ee4c71d9e8();
      class01129<class07049> class01129 = WorldHelper.getEntityCacheOrNull(this.method_73183());
      if (class01129 != null) {
         class01101<class07049> class01101 = class01129.u(class01296.L(this.method_24515()));
         if (class01101 != null) {
            class01101.lithium$onEntityModifiedCachedBlock(this, var1);
         } else {
            this.fields_13212a028292fd3c078969e3ee4c71d9e8_5 = false;
         }
      }
   }
}
