package minecraft;

import Nursultan.class10464;
import Nursultan.class10467;
import com.google.common.net.InetAddresses;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import net.fabricmc.fabric.api.entity.FakePlayer;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowNearbyMonsters;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowSettingSpawn;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.ModifySleepingDirection;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents.AfterKilledOtherEntity;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents.AfterPlayerChange;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.AfterDeath;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents.CopyFrom;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.fabricmc.fabric.impl.screenhandler.Networking;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import squeek.appleskin.network.SyncHandler;

public class class04770 extends class08036 {
   private static final Logger field_13975 = LogUtils.getLogger();
   private static final int field_29769 = 32;
   private static final int field_29770 = 10;
   private static final int field_46928 = 25;
   public static final double field_54046 = 1.0;
   public static final double field_54047 = 3.0;
   public static final int field_54207 = 2;
   public static final String field_54209 = "ender_pearls";
   public static final String field_54210 = "ender_pearl_dimension";
   public static final String field_60522 = "Dimension";
   private static final class07471 field_47709 = new class07471(class01894.y("creative_mode_block_range"), 0.5, class07463.field_6328);
   private static final class07471 field_47710 = new class07471(class01894.y("creative_mode_entity_range"), 2.0, class07463.field_6328);
   private static final class00392 field_56606 = class00392.L("block.minecraft.set_spawn");
   private static final class07471 field_59631 = new class07471(class01894.y("waypoint_transmit_range_crouch"), -1.0, class07463.field_6331);
   private static final boolean field_57112 = false;
   private static final boolean field_57113 = false;
   public class01615 field_13987;
   private final class02796 field_13995;
   public final class04787 field_13974;
   private final class03704 field_13970;
   private final class04895 field_13966;
   private float field_13963 = Float.MIN_VALUE;
   private int field_13983 = Integer.MIN_VALUE;
   private int field_13968 = Integer.MIN_VALUE;
   private int field_13982 = Integer.MIN_VALUE;
   private int field_13965 = Integer.MIN_VALUE;
   private int field_13980 = Integer.MIN_VALUE;
   private float field_13997 = -1.0E8F;
   private int field_13979 = -99999999;
   private boolean field_13972 = true;
   private int field_13978 = -99999999;
   private class08027 field_13993 = class08027.field_7538;
   private class01315 field_52358 = class01315.field_18197;
   private boolean field_13971 = true;
   private long field_13976 = class07536.L();
   @Nullable
   private class07049 field_13984;
   private boolean field_13985;
   public boolean field_13969 = false;
   private final class04912 field_13996;
   @Nullable
   private class06889 field_13992;
   private int field_13973;
   private boolean field_13964;
   private int field_44990 = 2;
   private String field_46156 = "en_us";
   @Nullable
   private class06889 field_35007;
   @Nullable
   private class06889 field_13994;
   @Nullable
   private class06889 field_35008;
   private class01296 field_13990 = class01296.N(0, 0, 0);
   private class04157 field_44991 = class04157.N;
   @Nullable
   private class04744 field_56607;
   private final class05477 field_26821;
   private boolean field_28860;
   private boolean field_35566;
   private boolean field_49776 = false;
   private class03982 field_39985 = new class03982();
   @Nullable
   private class07209 field_50088;
   private class06889 field_51875 = class06889.L;
   private class08687 field_54048 = class08687.y;
   private final Set<class07488> field_54208 = new HashSet<>();
   private long field_62503;
   private class07001 field_62504 = new class07001();
   private class07001 field_62505 = new class07001();
   private final class02723 field_29180 = new class04765(this);
   private final class07508 field_29181 = new class10467(this);
   @Nullable
   private class02027 field_39986;
   @Nullable
   public final Object field_49777;
   private final class07703 field_54402 = new class10464(this);
   private Set<class00455<?>> field_62842 = Set.of();
   private int field_13986;
   public boolean field_13989;

   @Override
   public boolean method_48105(class04782 var1, double var2, double var4, double var6, Set<class06681> var8, float var9, float var10, boolean var11) {
      if (this.method_6113()) {
         this.method_7358(true, true);
      }

      if (var11) {
         this.method_14224(this);
      }

      boolean flag = super.method_48105(var1, var2, var4, var6, var8, var9, var10, var11);
      if (flag) {
         this.method_5847(var8.contains(class06681.field_12401) ? this.method_5791() + var9 : var9);
         this.field_13987.method_75005();
      }

      return flag;
   }

   public void method_14224(@Nullable class07049 var1) {
      class07049 class07049 = this.method_14242();
      this.field_13984 = (class07049)(var1 == null ? this : var1);
      if (class07049 != this.field_13984) {
         if (this.field_13984.method_73183() instanceof class04782 class04782) {
            this.method_48105(
               class04782,
               this.field_13984.method_23317(),
               this.field_13984.method_23318(),
               this.field_13984.method_23321(),
               Set.of(),
               this.method_36454(),
               this.method_36455(),
               false
            );
         }

         if (var1 != null) {
            this.method_51469().method_14178().N(this);
         }

         this.field_13987.method_14364(new class06655(this.field_13984));
         this.field_13987.method_14372();
      }
   }

   @Override
   public void method_5859(double var1, double var3, double var5) {
      this.field_13987
         .method_14360(new class08716(new class06889(var1, var3, var5), class06889.L, 0.0F, 0.0F), class06681.N(class06681.field_54094, class06681.field_40711));
   }

   @Override
   public void method_64578(float var1, boolean var2, float var3, boolean var4) {
      super.method_64578(var1, var2, var3, var4);
      this.field_13987.method_14364(new class00261(var1, var2, var3, var4));
   }

   @Override
   public boolean method_5680(class04770 var1) {
      if (var1.method_7325()) {
         return this.method_14242() == this;
      } else {
         return this.method_7325() ? false : super.method_5680(var1);
      }
   }

   @Override
   public void method_45166(double var1, double var3, double var5) {
      this.field_13987.method_14360(new class08716(new class06889(var1, var3, var5), class06889.L, 0.0F, 0.0F), class06681.field_40710);
   }

   @Override
   public class06889 method_76333() {
      class07049 class07049 = this.method_5854();
      return class07049 != null && class07049.method_5642() != this ? class07049.method_76333() : this.field_51875;
   }

   @Override
   public boolean method_36971(class04782 var1, class07209 var2) {
      return super.method_36971(var1, var2) && var1.method_8505(this, var2);
   }

   @Override
   public void method_5702(class07664 var1, class06889 var2) {
      super.method_5702(var1, var2);
      this.field_13987.method_14364(new class06671(var1, var2.M, var2.B, var2.Z));
   }

   public boolean method_70637() {
      return this.method_45325(class05298.K) > 0.0;
   }

   @Override
   public void method_56918(@Nullable class07049 var1) {
      super.method_56918(var1);
      super.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 = this.method_73189();
      super.fields_57fa3311b0e9d3e9b883d09222919bf5a_5 = var1;
      this.method_60984(var1 != null && var1.method_5864() == class07078.ya);
   }

   @Override
   public class06889 method_60478() {
      class07049 class07049 = this.method_5854();
      return class07049 != null && class07049.method_5642() != this ? class07049.method_60478() : this.field_51875;
   }

   @Override
   public void method_5773() {
      this.handler$zza000$appleskin$onUpdate(null);
      this.field_13987.method_76686();
      this.field_13974.N();
      this.field_39985.N();
      if (this.field_6008 > 0) {
         this.field_6008--;
      }

      ((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
      if (!((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(this)) {
         this.method_7346();
         super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = super.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
      }

      class07049 class07049 = this.method_14242();
      if (class07049 != this) {
         if (class07049.method_5805()) {
            this.method_5641(
               class07049.method_23317(), class07049.method_23318(), class07049.method_23321(), class07049.method_36454(), class07049.method_36455()
            );
            this.method_51469().method_14178().N(this);
            if (this.method_21824()) {
               this.method_14224(this);
            }
         } else {
            this.method_14224(this);
         }
      }

      class06912.l.N(this);
      if (this.field_13992 != null) {
         class06912.t.N(this, this.field_13992, this.field_6012 - this.field_13973);
      }

      this.method_38786();
      this.method_38787();
      this.method_55633();
      this.field_13970.N(this, true);
   }

   @Override
   protected void method_5760() {
      if (!this.field_13985) {
         super.method_5760();
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_5679(var1, var2)) {
         return false;
      } else {
         class07049 class07049 = var2.u();
         if (class07049 instanceof class08036 class08036x && !this.method_7256(class08036x)) {
            return false;
         } else {
            return class07049 instanceof class08007 class08007 && class08007.z() instanceof class08036 class08036 && !this.method_7256(class08036)
               ? false
               : super.method_64397(var1, var2, var3);
         }
      }
   }

   @Override
   public void method_5623(double var1, boolean var3, class00500 var4, class07209 var5) {
      if (this.field_49776 && var3 && this.field_6017 > 0.0) {
         class06889 class06889 = var5.method_46558().y(0.0, 0.5, 0.0);
         int i = (int)class04995.N(50.0 * this.field_6017, 0.0, 200.0);
         this.method_51469()
            .method_65096(
               this.m_modifyExpressionValue$zlc001$fabric_particles_v1$modifyBlockStateParticleEffect_31(
                  new class07105(class07107.y, var4), var1, var3, var4, var5
               ),
               class06889.M,
               class06889.B,
               class06889.Z,
               i,
               0.3F,
               0.3F,
               0.3F,
               0.15F
            );
         this.field_49776 = false;
      }

      super.method_5623(var1, var3, var4, var5);
   }

   @Override
   public void method_38785() {
      if (this.method_6032() > 0.0F && this.field_35007 != null) {
         class06912.r.N(this, this.field_35007);
      }

      this.field_35007 = null;
      super.method_38785();
   }

   @Override
   public void method_5622(class00500 var1) {
      class06912.i.N(this, var1);
   }

   @Override
   public class07209 method_14245(class04782 var1, class07209 var2) {
      CompletableFuture<class06889> completablefuture = class05960.N(var1, var2);
      this.field_13995.y(completablefuture::isDone);
      return class07209.method_49638(completablefuture.join());
   }

   @Override
   public void method_24203(double var1, double var3, double var5) {
      super.method_24203(var1, var3, var5);
      this.field_13987.method_14372();
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("warden_spawn_tracker", class03982.N, this.field_39985);
      this.method_32749(var1);
      var1.N("seenCredits", this.field_13969);
      var1.y("entered_nether_pos", class06889.N, this.field_13994);
      this.method_64135(var1);
      var1.N("recipeBook", class04930.u, this.field_13996.N());
      var1.N("Dimension", this.method_51469().method_27983().N().toString());
      var1.y("respawn", class04744.L, this.field_56607);
      var1.N("spawn_extra_particles_on_fall", this.field_49776);
      var1.y("raid_omen_position", class07209.field_25064, this.field_50088);
      this.method_64136(var1);
      if (!this.method_74074().z()) {
         var1.N("ShoulderEntityLeft", class07001.N, this.method_74074());
      }

      if (!this.method_74075().z()) {
         var1.N("ShoulderEntityRight", class07001.N, this.method_74075());
      }
   }

   @Override
   public void method_5716(class07049 var1, class07072 var2) {
      if (var1 != this) {
         super.method_5716(var1, var2);
         class06394 class06394 = this.method_51469().method_14170();
         class06394.N(class06675.R, this, class01765::R);
         if (var1 instanceof class08036) {
            this.method_7281(class01235.A);
            class06394.N(class06675.i, this, class01765::R);
         } else {
            this.method_7281(class01235.p);
         }

         this.method_14227(this, var1, class06675.W);
         this.method_14227(var1, this, class06675.m);
         class06912.L.N(this, var1, var2);
      }
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.field_39985 = var1.<class03982>N("warden_spawn_tracker", class03982.N).orElseGet(class03982::new);
      this.field_13994 = var1.<class06889>N("entered_nether_pos", class06889.N).orElse(null);
      this.field_13969 = var1.N("seenCredits", false);
      var1.<class04930>N("recipeBook", class04930.u).ifPresent(var1x -> this.field_13996.N(var1x, var1xx -> this.field_13995.yM().y(var1xx).isPresent()));
      if (this.method_6113()) {
         this.method_18400();
      }

      this.field_56607 = var1.<class04744>N("respawn", class04744.L).orElse(null);
      this.field_49776 = var1.N("spawn_extra_particles_on_fall", false);
      this.field_50088 = var1.<class07209>N("raid_omen_position", class07209.field_25064).orElse(null);
      this.field_13974.N(this.method_32746(method_32745(var1, "playerGameType")), method_32745(var1, "previousPlayerGameType"));
      this.method_74076(var1.<class07001>N("ShoulderEntityLeft", class07001.N).orElseGet(class07001::new));
      this.method_74077(var1.<class07001>N("ShoulderEntityRight", class07001.N).orElseGet(class07001::new));
   }

   @Override
   public void method_29239() {
      class07049 class07049 = this.method_5854();
      super.method_29239();
      if (class07049 instanceof class07438) {
         for (class07055 class07055 : ((class07438)class07049).method_6026()) {
            this.field_13987.method_14364(new class06648(class07049.method_5628(), class07055.L()));
         }
      }

      if (class07049 != null) {
         this.field_13987.method_14364(new class08079(class07049));
      }
   }

   @Override
   public boolean method_5873(class07049 var1, boolean var2, boolean var3) {
      if (super.method_5873(var1, var2, var3)) {
         var1.method_24201(this);
         this.field_13987.method_14360(new class08716(this.method_73189(), class06889.L, 0.0F, 0.0F), class06681.field_40711);
         if (var1 instanceof class07438 class07438) {
            this.field_13995.Nm().N(class07438, this.field_13987);
         }

         this.field_13987.method_14364(new class08079(var1));
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method_5842() {
      double d0 = this.method_23317();
      double d1 = this.method_23318();
      double d2 = this.method_23321();
      super.method_5842();
      this.method_54721(this.method_23317() - d0, this.method_23318() - d1, this.method_23321() - d2);
   }

   public class07049 method_14242() {
      return (class07049)(this.field_13984 == null ? this : this.field_13984);
   }

   @Nullable
   public class04770 method_61275(class01032 var1) {
      if (this.method_31481()) {
         return null;
      } else {
         if (var1.M()) {
            this.field_13987.method_14364(new class00503(class00503.y, 0.0F));
         }

         class04782 class04782x = var1.y();
         class04782 class04782x = this.method_51469();
         class05946<class07299> class05946 = class04782x.method_27983();
         if (!var1.B()) {
            this.method_29239();
         }

         if (class04782x.method_27983() == class05946) {
            this.field_13987.method_14360(class08716.N(var1), var1.Z());
            this.field_13987.method_14372();
            var1.z().onTransition(this);
            return this;
         } else {
            this.field_13985 = true;
            class05087 class05087 = class04782x.method_8401();
            this.field_13987.method_14364(new class06643(this.method_52374(class04782x), (byte)3));
            this.field_13987.method_14364(new class07258(class05087.s(), class05087.T()));
            class01062 class01062 = this.field_13995.Nm();
            class01062.u(this);
            class04782x.method_18770(this, class07062.field_27002);
            this.method_31482();
            class04643 class04643 = class08700.N();
            class04643.N("moving");
            if (class05946 == class07299.field_25179 && class04782x.method_27983() == class07299.field_25180) {
               this.field_13994 = this.method_73189();
            }

            class04643.L();
            class04643.N("placing");
            this.method_51468(class04782x);
            this.field_13987.method_14360(class08716.N(var1), var1.Z());
            this.field_13987.method_14372();
            class04782x.method_18769(this);
            class04643.L();
            this.method_18783(class04782x);
            this.method_6021();
            this.field_13987.method_14364(new class06659(this.method_31549()));
            class01062.N(this, class04782x);
            class01062.i(this);
            class01062.L(this);
            var1.z().onTransition(this);
            this.field_13978 = -1;
            this.field_13997 = -1.0F;
            this.field_13979 = -1;
            this.method_70666(var1, class04782x);
            return this;
         }
      }
   }

   public class04770(class02796 var1, class04782 var2, GameProfile var3, class03737 var4) {
      super(var2, var3);
      this.field_13995 = var1;
      this.field_26821 = var1.N(this);
      this.field_13974 = var1.y(this);
      this.field_13974.N(this.method_32746(null), null);
      this.field_13996 = new class04912((var1x, var2x) -> var1.yM().N(var1x, var2x));
      this.field_13966 = var1.Nm().N((class08036)this);
      this.field_13970 = var1.Nm().R(this);
      this.method_14213(var4);
      this.field_49777 = null;
   }

   private Comparable m_wrapOperation$zeh000$fabric_entity_events_v1$redirectSleepDirection_22(
      class00500 var1, class08092 var2, Operation var3, class07209 var4, CallbackInfoReturnable var5
   ) {
      class07211 class07211x = (class07211)(var1.y(var2) ? (Comparable)var3.call(new Object[]{var1, var2}) : null);
      class07211 class07211x = ((ModifySleepingDirection)EntitySleepEvents.MODIFY_SLEEPING_DIRECTION.invoker()).modifySleepDirection(this, var4, class07211x);
      if (class07211x == null) {
         var5.setReturnValue(Either.left((class08035)class08035.y_2));
      }

      return class07211x;
   }

   private void m_handler$zeh000$fabric_entity_events_v1$afterWorldChanged_23(class04782 var1, CallbackInfo var2) {
      ((AfterPlayerChange)ServerEntityWorldChangeEvents.AFTER_PLAYER_CHANGE_WORLD.invoker()).afterChangeWorld(this, var1, this.method_51469());
   }

   private void m_handler$zeh000$fabric_entity_events_v1$callOnKillForPlayer_24(class07072 var1, CallbackInfo var2) {
      class07049 class07049 = var1.u();
      if (class07049 != null) {
         class07049.method_5874(this.method_51469(), this, var1);
         ((AfterKilledOtherEntity)ServerEntityCombatEvents.AFTER_KILLED_OTHER_ENTITY.invoker())
            .afterKilledOtherEntity(this.method_51469(), class07049, this, var1);
      }
   }

   @Override
   public void method_7353(class00392 var1, boolean var2) {
      this.method_43502(var1, var2);
   }

   public class04782 method_51469() {
      return (class04782)super.method_73183();
   }

   @Override
   public void method_7358(boolean var1, boolean var2) {
      if (this.method_6113()) {
         this.method_51469().method_14178().N(this, new class07268(this, 2));
      }

      super.method_7358(var1, var2);
      if (this.field_13987 != null) {
         this.field_13987.method_14363(this.method_23317(), this.method_23318(), this.method_23321(), this.method_36454(), this.method_36455());
      }
   }

   private boolean m_redirect$zeh000$fabric_entity_events_v1$hasNoMonstersNearby_25(List var1, class07209 var2) {
      boolean flag = var1.isEmpty();
      class07082 class07082 = ((AllowNearbyMonsters)EntitySleepEvents.ALLOW_NEARBY_MONSTERS.invoker()).allowNearbyMonsters(this, var2, flag);
      return class07082 != class07082.i ? class07082.N() : flag;
   }

   public void m_handler$zfa000$fabric_events_interaction_v0$fakePlayerGameMode_26(class07282 var1, CallbackInfoReturnable var2) {
      if (this instanceof FakePlayer) {
         var2.setReturnValue(class07282.field_9215);
      }
   }

   private void m_wrapOperation$zeh000$fabric_entity_events_v1$onSetSpawnPoint_27(class04770 var1, class04744 var2, boolean var3, Operation var4) {
      if (((AllowSettingSpawn)EntitySleepEvents.ALLOW_SETTING_SPAWN.invoker()).allowSettingSpawn(var1, var2.N().y())) {
         var4.call(new Object[]{var1, var2, var3});
      }
   }

   public void m_handler$zfa000$fabric_events_interaction_v0$onPlayerInteractEntity_28(class07049 var1, CallbackInfo var2) {
      if (((AttackEntityCallback)AttackEntityCallback.EVENT.invoker()).interact(this, this.method_51469(), class07050.field_5808, var1, null) != class07082.i) {
         var2.cancel();
      }
   }

   public class01032 method_60590(boolean var1, class01026 var2) {
      class04744 class04744 = this.method_67564();
      class04782 class04782 = this.field_13995.N(class04744.N(class04744));
      if (class04782 != null && class04744 != null) {
         Optional<class04746> optional = method_60588(class04782, class04744, var1);
         if (optional.isPresent()) {
            class04746 class04746 = optional.get();
            return new class01032(class04782, class04746.N(), class06889.L, class04746.y(), class04746.L(), var2);
         } else {
            return class01032.y(this, var2);
         }
      } else {
         return class01032.N(this, var2);
      }
   }

   @Nullable
   public class04744 method_67564() {
      return this.field_56607;
   }

   private static Optional<class04746> method_60588(class04782 var0, class04744 var1, boolean var2) {
      class05042 class05042 = var1.N();
      class07209 class07209 = class05042.y();
      float f = class05042.u();
      float f1 = class05042.i();
      boolean flag = var1.y();
      class00500 class00500x = var0.method_8320(class07209);
      class00891 class00891 = class00500x.i();
      if (class00891 instanceof class01338 && (flag || class00500x.L(class01338.u) > 0) && class01338.N(var0, class07209)) {
         Optional<class06889> optional = class01338.N(class07078.Ly, var0, class07209);
         if (!flag && var2 && optional.isPresent()) {
            var0.method_8652(class07209, class00500x.y(class01338.u, class00500x.L(class01338.u) - 1), 3);
         }

         return optional.map(var1x -> class04746.N(var1x, class07209, 0.0F));
      } else if (class00891 instanceof class07789 && var0.method_75728().N(class00608.Q, class07209).y(var0)) {
         return class07789.N(class07078.Ly, var0, class07209, class00500x.L(class07789.R), f).map(var1x -> class04746.N(var1x, class07209, 0.0F));
      } else if (!flag) {
         return Optional.empty();
      } else {
         boolean var10 = class00891.c_(class00500x);
         class00500 class00500x = var0.method_8320(class07209.method_10084());
         boolean flag2 = class00500x.i().c_(class00500x);
         return var10 && flag2
            ? Optional.of(
               new class04746(new class06889(class07209.method_10263() + 0.5, class07209.method_10264() + 0.1, class07209.method_10260() + 0.5), f, f1)
            )
            : Optional.empty();
      }
   }

   private void method_29779() {
      class00734 class00734 = new class00734(this.method_24515()).L(32.0, 10.0, 32.0);
      this.method_51469()
         .N(class07079.class, class00734, class07042.R)
         .stream()
         .filter(var0 -> var0 instanceof class01279)
         .forEach(var1x -> ((class01279)var1x).y(this.method_51469(), this));
   }

   private boolean method_26287(class07209 var1) {
      class06889 class06889 = class06889.L(var1);
      return Math.abs(this.method_23317() - class06889.N()) <= 3.0
         && Math.abs(this.method_23318() - class06889.y()) <= 2.0
         && Math.abs(this.method_23321() - class06889.L()) <= 3.0;
   }

   public boolean method_14208() {
      return this.field_13985;
   }

   private void method_18783(class04782 var1) {
      class05946<class07299> class05946 = var1.method_27983();
      class05946<class07299> class05946x = this.method_51469().method_27983();
      class06912.G.N(this, class05946, class05946x);
      if (class05946 == class07299.field_25180 && class05946x == class07299.field_25179 && this.field_13994 != null) {
         class06912.O.N(this, this.field_13994);
      }

      if (class05946x != class07299.field_25180) {
         this.field_13994 = null;
      }

      this.m_handler$zeh000$fabric_entity_events_v1$afterWorldChanged_23(var1, null);
   }

   @Override
   public Either<class08035, class06244> method_7269(class07209 var1) {
      class00500 class00500x = this.method_51469().method_8320(var1);
      class08064<class07211> class08064 = class07101.R;
      class00500 class00500x = class00500x;
      Operation operation = var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_2680, net.minecraft.class_2769]");
         return ((class00500)var0[0]).L((class08092<Comparable>)var0[1]);
      };
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      Comparable comparable = this.m_wrapOperation$zeh000$fabric_entity_events_v1$redirectSleepDirection_22(
         class00500x, class08064, operation, var1, callbackinforeturnable
      );
      if (callbackinforeturnable.isCancelled()) {
         return (Either<class08035, class06244>)callbackinforeturnable.getReturnValue();
      } else {
         class07211 class07211 = (class07211)comparable;
         if (!this.method_6113() && this.method_5805()) {
            class00586 class00586 = this.method_51469().method_75728().N(class00608.Q, var1);
            boolean flag = class00586.N(this.method_51469());
            boolean flag1 = class00586.y(this.method_51469());
            if (!flag1 && !flag) {
               return Either.left(class00586.N());
            } else if (!this.method_26285(var1, class07211)) {
               return Either.left((class08035)class08035.y_0);
            } else if (this.method_26286(var1, class07211)) {
               return Either.left((class08035)class08035.y_1);
            } else {
               if (flag1) {
                  class04744 class04744 = new class04744(
                     class05042.N(this.method_51469().method_27983(), var1, this.method_36454(), this.method_36455()), false
                  );
                  boolean flag2 = true;
                  class04744 class04744x = class04744;
                  this.m_wrapOperation$zeh000$fabric_entity_events_v1$onSetSpawnPoint_27(this, class04744x, flag2, var0 -> {
                     WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_3222, net.minecraft.class_3222$class_10766, boolean]");
                     ((class04770)var0[0]).method_26284((class04744)var0[1], (Boolean)var0[2]);
                     return (Void)null;
                  });
               }

               if (!flag) {
                  return Either.left(class00586.N());
               } else {
                  if (!this.method_68878()) {
                     double var6 = 8.0;
                     double d1 = 5.0;
                     class06889 class06889 = class06889.L(var1);
                     List<class07150> list = this.method_51469()
                        .N(
                           class07150.class,
                           new class00734(
                              class06889.N() - 8.0,
                              class06889.y() - 5.0,
                              class06889.L() - 8.0,
                              class06889.N() + 8.0,
                              class06889.y() + 5.0,
                              class06889.L() + 8.0
                           ),
                           var1x -> var1x.N(this.method_51469(), this)
                        );
                     if (!this.m_redirect$zeh000$fabric_entity_events_v1$hasNoMonstersNearby_25(list, var1)) {
                        return Either.left((class08035)class08035.y_3);
                     }
                  }

                  Either<class08035, class06244> either = super.method_7269(var1).ifRight(var1x -> {
                     this.method_7281(class01235.Nb);
                     class06912.b.N(this);
                  });
                  if (!this.method_51469().method_33144()) {
                     this.method_7353(class00392.L("sleep.not_possible"), true);
                  }

                  this.method_51469().method_8448();
                  return either;
               }
            }
         } else {
            return Either.left((class08035)class08035.y_2);
         }
      }
   }

   private boolean method_26285(class07209 var1, class07211 var2) {
      return this.method_26287(var1) || this.method_26287(var1.method_10093(var2.b()));
   }

   @Override
   public void method_7266(class04907<?> var1) {
      this.field_13966.N(this, var1, 0);
      this.method_51469().method_14170().N(var1, this, class01765::M);
   }

   @Override
   public boolean method_7256(class08036 var1) {
      return !this.method_14230() ? false : super.method_7256(var1);
   }

   private boolean method_14230() {
      return this.method_51469().method_74999();
   }

   public void method_60594() {
      this.method_18375();
      this.method_51469().method_18770(this, class07062.field_27002);
      if (!this.field_13989) {
         this.field_13989 = true;
         this.field_13987.method_14364(new class00503(class00503.R, 0.0F));
         this.field_13969 = true;
      }
   }

   public class04167 method_52374(class04782 var1) {
      return new class04167(
         var1.method_40134(),
         var1.method_27983(),
         class05517.N(var1.method_8412()),
         this.field_13974.y(),
         this.field_13974.L(),
         var1.method_27982(),
         var1.method_28125(),
         this.method_43122(),
         this.method_51848(),
         var1.method_8615()
      );
   }

   public void method_51468(class04782 var1) {
      this.method_51502(var1);
      this.field_13974.N(var1);
   }

   private boolean method_26286(class07209 var1, class07211 var2) {
      class07209 class07209 = var1.method_10084();
      return !this.method_7326(class07209) || !this.method_7326(class07209.method_10093(var2.b()));
   }

   private void method_14227(class01766 var1, class01766 var2, class06675[] var3) {
      class06394 class06394 = this.method_51469().method_14170();
      class00502 class00502 = class06394.i(var2.method_5820());
      if (class00502 != null) {
         int i = class00502.P().y();
         if (i >= 0 && i < var3.length) {
            class06394.N(var3[i], var1, class01765::R);
         }
      }
   }

   private void method_14237() {
      this.field_13986 = this.field_13986 % 100 + 1;
   }

   @Override
   public void method_76575(class08156 var1, class06695 var2) {
      if ((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != super.fields_07fa3311b0e9d3e9b883d09222919bf5a_2) {
         this.method_7346();
      }

      this.method_14237();
      int i = var1.k();
      this.field_13987.method_14364(new class00499(this.field_13986, i, var1.method_5628()));
      super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = new class07570(this.field_13986, this.method_31548(), var2, var1, i);
      this.method_14235((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3);
   }

   private void method_54721(double var1, double var3, double var5) {
      if (this.method_5765() && !method_54722(var1, var3, var5)) {
         int i = Math.round((float)Math.sqrt(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
         class07049 class07049 = this.method_5854();
         if (class07049 instanceof class07504) {
            this.method_7339(class01235.l, i);
         } else if (class07049 instanceof class00250) {
            this.method_7339(class01235.d, i);
         } else if (class07049 instanceof class07627) {
            this.method_7339(class01235.w, i);
         } else if (class07049 instanceof class07862) {
            this.method_7339(class01235.Y, i);
         } else if (class07049 instanceof class01377) {
            this.method_7339(class01235.g, i);
         } else if (class07049 instanceof class00032) {
            this.method_7339(class01235.k, i);
         } else if (class07049 instanceof class08156) {
            this.method_7339(class01235.I, i);
         }
      }
   }

   private static boolean method_54722(double var0, double var2, double var4) {
      return var0 == 0.0 && var2 == 0.0 && var4 == 0.0;
   }

   @Override
   public void method_7291(class07862 var1, class06695 var2) {
      if ((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != super.fields_07fa3311b0e9d3e9b883d09222919bf5a_2) {
         this.method_7346();
      }

      this.method_14237();
      int i = var1.N_();
      this.field_13987.method_14364(new class00499(this.field_13986, i, var1.method_5628()));
      super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = new class07479(this.field_13986, this.method_31548(), var2, var1, i);
      this.method_14235((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3);
   }

   @Override
   public OptionalInt method_17355(@Nullable class06237 var1) {
      if (var1 == null) {
         return OptionalInt.empty();
      } else {
         if ((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != super.fields_07fa3311b0e9d3e9b883d09222919bf5a_2) {
            this.m_redirect$bbh000$fabric_screen_handler_api_v1$fabric_closeHandledScreenIfAllowed_32(this, var1);
         }

         this.method_14237();
         class07482 class07482 = var1.createMenu(this.field_13986, this.method_31548(), this);
         if (class07482 == null) {
            if (this.method_7325()) {
               this.method_7353(class00392.L("container.spectatorCantOpen").N(class06541.field_1061), true);
            }

            return OptionalInt.empty();
         } else {
            class01615 class01615 = this.field_13987;
            class05873 class05873x = new class05873(class07482.b, class07482.N(), var1.method_5476());
            this.m_handler$bbh000$fabric_screen_handler_api_v1$fabric_storeOpenedScreenHandler_34(var1, null, class07482);
            class05873 class05873x = class05873x;
            class01615 class01615x = class01615;
            this.m_redirect$bbh000$fabric_screen_handler_api_v1$fabric_replaceVanillaScreenPacket_33(class01615x, class05873x, var1);
            this.method_14235(class07482);
            super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = class07482;
            return OptionalInt.of(this.field_13986);
         }
      }
   }

   @Override
   public int method_7254(Collection<class03729<?>> var1) {
      return this.field_13996.N(var1, this);
   }

   @Override
   public void method_7342(class04907<?> var1, int var2) {
      this.field_13966.y(this, var1, var2);
      this.method_51469().method_14170().N(var1, this, var1x -> var1x.y(var2));
   }

   @Override
   public void method_7335(List<class05946<class06521<?>>> var1) {
      List list = var1.stream().flatMap(var1x -> this.field_13995.yM().y((class05946<class06521<?>>)var1x).stream()).collect(Collectors.toList());
      this.method_7254(list);
   }

   @Override
   public int method_7333(Collection<class03729<?>> var1) {
      return this.field_13996.y(var1, this);
   }

   @Override
   public void method_51283(class03729<?> var1, List<class06584> var2) {
      class06912.Ni.N(this, var1.N(), var2);
   }

   @Override
   public void method_7255(int var1) {
      if (var1 != 0) {
         super.method_7255(var1);
         this.field_13978 = -1;
      }
   }

   public void method_14231() {
      this.field_13964 = true;
      this.method_5772();
      if (this.method_6113()) {
         this.method_7358(true, false);
      }
   }

   @Override
   public void method_7323(class00402 var1) {
      this.field_13987.method_14364(class07269.N(var1, class00394::u));
   }

   @Override
   public void method_71753(class03556<class09037> var1) {
      this.field_13987.method_14364(new class09030(var1));
   }

   public boolean method_14239() {
      return this.field_13964;
   }

   public void method_43502(class00392 var1, boolean var2) {
      if (this.method_44707(var2)) {
         this.field_13987.method_52391(new class04459(var1, var2), class03041.N(() -> {
            if (this.method_44707(false)) {
               short short1 = 256;
               class05216 class05216 = class00392.y(var1.N(256)).N(class06541.field_1054);
               return new class04459(class00392.N("multiplayer.message_not_delivered", class05216).N(class06541.field_1061), false);
            } else {
               return null;
            }
         }));
      }
   }

   public class07701 method_64396() {
      return new class07701(
         this.method_64401(),
         this.method_73189(),
         this.method_5802(),
         this.method_51469(),
         this.method_75004(),
         this.method_74861(),
         this.method_5476(),
         this.field_13995,
         this
      );
   }

   @Override
   public void method_17354(int var1, class07316 var2, int var3, int var4, boolean var5, boolean var6) {
      this.field_13987.method_14364(new class05871(var1, var2, var3, var4, var5, var6));
   }

   @Override
   public void method_14247() {
      ((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).y(this);
      super.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N_72((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3);
      super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = super.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
   }

   public void method_14217() {
      this.field_13997 = -1.0E8F;
   }

   @Override
   public void method_7311(class07267 var1, boolean var2) {
      this.field_13987.method_14364(new class07259(this.method_51469(), var1.d()));
      this.field_13987.method_14364(new class06651(var1.d(), var2));
   }

   public void method_14222(class07664 var1, class07049 var2, class07664 var3) {
      class06889 class06889 = var3.N(var2);
      super.method_5702(var1, class06889);
      this.field_13987.method_14364(new class06671(var1, var2, var3));
   }

   public void method_14203(class04770 var1, boolean var2) {
      this.field_39985 = var1.field_39985;
      this.field_39986 = var1.field_39986;
      this.field_13974.N(var1.field_13974.y(), var1.field_13974.L());
      this.method_7355();
      this.method_6127().y(var1.method_6127());
      if (var2) {
         this.method_6127().L(var1.method_6127());
         this.method_6033(var1.method_6032());
         super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0 = var1.fields_17fa3311b0e9d3e9b883d09222919bf5a_0;

         for (class07055 class07055 : var1.method_6026()) {
            this.method_6092(new class07055(class07055));
         }

         this.method_76789(var1);
         this.field_51994 = var1.field_51994;
      } else {
         this.method_6033(this.method_6063());
         if (this.method_51469().method_64395().N(class07305.j) || var1.method_7325()) {
            this.method_76789(var1);
         }
      }

      super.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = var1.fields_47fa3311b0e9d3e9b883d09222919bf5a_0;
      super.fields_07fa3311b0e9d3e9b883d09222919bf5a_1 = var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_1;
      this.method_5841().N(field_62514, var1.method_5841().N(field_62514));
      this.field_13978 = -1;
      this.field_13997 = -1.0F;
      this.field_13979 = -1;
      this.field_13996.N(var1.field_13996);
      this.field_13969 = var1.field_13969;
      this.field_13994 = var1.field_13994;
      this.field_44991 = var1.field_44991;
      this.field_62842 = var1.field_62842;
      this.method_74076(var1.method_74074());
      this.method_74077(var1.method_74075());
      this.method_43120(var1.method_43122());
      this.method_70675().N(var1.method_70675());
      this.m_handler$zeh000$fabric_entity_events_v1$onCopyFrom_30(var1, var2, null);
   }

   @Override
   public void method_7355() {
      if (this.field_13987 != null) {
         this.field_13987.method_14364(new class06659(this.method_31549()));
         this.method_6027();
      }
   }

   @Override
   public void method_7315(class06584 var1, class07050 var2) {
      if (var1.L(class02484.NL)) {
         if (class02706.N(var1, this.method_64396(), this)) {
            ((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
         }

         this.field_13987.method_14364(new class06272(var2));
      }
   }

   public void method_54720(double var1, double var3, double var5) {
      if (!this.method_5765() && !method_54722(var1, var3, var5)) {
         if (this.method_5681()) {
            int i = Math.round((float)Math.sqrt(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if (i > 0) {
               this.method_7339(class01235.O, i);
               this.method_7322(0.01F * i * 0.01F);
            }
         } else if (this.method_5777(class01231.N)) {
            int j = Math.round((float)Math.sqrt(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            if (j > 0) {
               this.method_7339(class01235.G, j);
               this.method_7322(0.01F * j * 0.01F);
            }
         } else if (this.method_5799()) {
            int k = Math.round((float)Math.sqrt(var1 * var1 + var5 * var5) * 100.0F);
            if (k > 0) {
               this.method_7339(class01235.j, k);
               this.method_7322(0.01F * k * 0.01F);
            }
         } else if (this.method_6101()) {
            if (var3 > 0.0) {
               this.method_7339(class01235.n, (int)Math.round(var3 * 100.0));
            }
         } else if (this.method_24828()) {
            int l = Math.round((float)Math.sqrt(var1 * var1 + var5 * var5) * 100.0F);
            if (l > 0) {
               if (this.method_5624()) {
                  this.method_7339(class01235.b, l);
                  this.method_7322(0.1F * l * 0.01F);
               } else if (this.method_18276()) {
                  this.method_7339(class01235.T, l);
                  this.method_7322(0.0F * l * 0.01F);
               } else {
                  this.method_7339(class01235.s, l);
                  this.method_7322(0.0F * l * 0.01F);
               }
            }
         } else if (this.method_6128()) {
            int i1 = Math.round((float)Math.sqrt(var1 * var1 + var3 * var3 + var5 * var5) * 100.0F);
            this.method_7339(class01235.Q, i1);
         } else {
            int j1 = Math.round((float)Math.sqrt(var1 * var1 + var5 * var5) * 100.0F);
            if (j1 > 25) {
               this.method_7339(class01235.t, j1);
            }
         }
      }
   }

   private void method_76789(class08036 var1) {
      this.method_31548().N(var1.method_31548());
      super.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = var1.fields_37fa3311b0e9d3e9b883d09222919bf5a_0;
      super.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = var1.fields_37fa3311b0e9d3e9b883d09222919bf5a_1;
      super.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = var1.fields_37fa3311b0e9d3e9b883d09222919bf5a_2;
      this.method_7320(var1.method_7272());
   }

   @Override
   public void method_6027() {
      if (this.method_7325()) {
         this.method_6069();
         this.method_5648(true);
      } else {
         super.method_6027();
      }
   }

   @Override
   public boolean method_5679(class04782 var1, class07072 var2) {
      return super.method_5679(var1, var2) || this.method_14208() && !var2.N(class03683.W) || !this.field_13987.method_76685();
   }

   @Override
   public void method_6104(class07050 var1) {
      super.method_6104(var1);
      this.method_7350();
   }

   @Override
   public void method_6000() {
      super.method_6000();
      this.field_13987.method_14364(class02807.N);
   }

   @Override
   public void method_29499(class00717 var1) {
      super.method_29499(var1);
      class07049 class07049 = var1.z();
      if (class07049 != null) {
         class06912.f.N(this, var1.N(), class07049);
      }
   }

   @Override
   public class00717 method_7329(class06584 var1, boolean var2, boolean var3) {
      class00717 class00717 = super.method_7329(var1, var2, var3);
      if (var3) {
         class06584 class06584 = class00717 != null ? class00717.N() : class06584.E;
         if (!class06584.R()) {
            this.method_7342(class01235.R.y(class06584.B()), var1.c());
            this.method_7281(class01235.o);
         }
      }

      return class00717;
   }

   @Override
   public void method_6043() {
      super.method_6043();
      this.method_7281(class01235.J);
      if (this.method_5624()) {
         this.method_7322(0.2F);
      } else {
         this.method_7322(0.05F);
      }
   }

   @Override
   public void method_48761(double var1, double var3) {
      super.fields_57fa3311b0e9d3e9b883d09222919bf5a_3 = (float)(class04995.u(var3, var1) * 180.0F / (float)Math.PI - this.method_36454());
      this.field_13987.method_14364(new class03277(this));
   }

   @Override
   public void method_6020(class07055 var1, @Nullable class07049 var2) {
      super.method_6020(var1, var2);
      this.field_13987.method_14364(new class08087(this.method_5628(), var1, true));
      if (var1.N(class07047.d)) {
         this.field_13973 = this.field_6012;
         this.field_13992 = this.method_73189();
      }

      class06912.Y.N(this, var2);
   }

   @Override
   public void method_64399(class06584 var1) {
      if (!this.method_31548().M(var1)) {
         this.method_7328(var1, false);
      }
   }

   @Override
   public void method_6129(Collection<class07055> var1) {
      super.method_6129(var1);

      for (class07055 class07055 : var1) {
         this.field_13987.method_14364(new class06648(this.method_5628(), class07055.L()));
         if (class07055.N(class07047.d)) {
            this.field_13992 = null;
         }
      }

      class06912.Y.N(this, null);
   }

   @Override
   public void method_18403(class07209 var1) {
      this.method_7266(class01235.Z.y(class01235.m));
      super.method_18403(var1);
   }

   @Override
   public void method_6044() {
      super.method_6044();
      this.field_13987.method_14364(new class02259(this.method_6066()));
   }

   @Override
   public void method_52540(class03556<class07468> var1) {
      if (var1.N(class05298.K)) {
         class00031 class00031 = this.method_51469().method_70636();
         if (this.method_6127().L(var1) > 0.0) {
            class00031.N(this);
         } else {
            class00031.L(this);
         }
      }

      super.method_52540(var1);
   }

   @Override
   public void method_6009(class07055 var1, boolean var2, @Nullable class07049 var3) {
      super.method_6009(var1, var2, var3);
      this.field_13987.method_14364(new class08087(this.method_5628(), var1, false));
      class06912.Y.N(this, var3);
   }

   @Override
   public void method_6040() {
      if (!super.fields_9212a028292fd3c078969e3ee4c71d9e8_0.R() && this.method_6115()) {
         this.field_13987.method_14364(new class00509(this, (byte)9));
         super.method_6040();
      }
   }

   @Override
   public void method_6078(class07072 var1) {
      this.method_32876(class01194.s);
      if (this.method_51469().method_64395().N(class07305.f)) {
         class00392 class00392 = this.method_6066().N();
         this.field_13987.method_52391(new class02675(this.method_5628(), class00392), class03041.N(() -> {
            short short1 = 256;
            String s = class00392.N(256);
            class05216 class05216x = class00392.N("death.attack.message_too_long", class00392.y(s).N(class06541.field_1054));
            class05216 class05216x = class00392.N("death.attack.even_more_magic", this.method_5476()).N(var1xx -> var1xx.N(new class00401(class05216x)));
            return new class02675(this.method_5628(), class05216x);
         }));
         class00502 class00502 = this.method_5781();
         if (class00502 == null || class00502.E() == class06672.field_1442) {
            this.field_13995.Nm().N(class00392, false);
         } else if (class00502.E() == class06672.field_1444) {
            this.field_13995.Nm().N(this, class00392);
         } else if (class00502.E() == class06672.field_1446) {
            this.field_13995.Nm().y(this, class00392);
         }
      } else {
         this.field_13987.method_14364(new class02675(this.method_5628(), class05220.N));
      }

      this.method_7262();
      if (this.method_51469().method_64395().N(class07305.P)) {
         this.method_29779();
      }

      if (!this.method_7325()) {
         this.method_16080(this.method_51469(), var1);
      }

      this.method_51469().method_14170().N(class06675.u, this, class01765::R);
      this.m_handler$zeh000$fabric_entity_events_v1$callOnKillForPlayer_24(var1, null);
      class07438 class07438 = this.method_6124();
      if (class07438 != null) {
         this.method_7259(class01235.B.y(class07438.method_5864()));
         class07438.method_5716(this, var1);
         this.method_23733(class07438);
      }

      this.method_51469().method_8421(this, (byte)3);
      this.method_7281(class01235.a);
      this.method_7266(class01235.Z.y(class01235.W));
      this.method_7266(class01235.Z.y(class01235.m));
      this.method_5646();
      this.method_32317(0);
      this.method_33572(false);
      this.method_6066().L();
      this.method_43120(Optional.of(class06289.N(this.method_51469().method_27983(), this.method_24515())));
      this.field_13987.method_76687();
      this.m_handler$zeh001$fabric_entity_events_v1$notifyDeath_29(var1, null);
   }

   @Override
   public void method_6103(class07049 var1, int var2) {
      super.method_6103(var1, var2);
      ((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
   }

   @Override
   public void method_6126(class04782 var1, class07209 var2) {
      if (!this.method_7325()) {
         super.method_6126(var1, var2);
      }
   }

   @Override
   public void method_20235(class06581 var1, class07085 var2) {
      super.method_20235(var1, var2);
      this.method_7259(class01235.u.y(var1));
   }

   @Override
   public void method_6070() {
      if (this.method_51469().method_54719().Z()) {
         super.method_6070();
      }
   }

   @Override
   public void method_37119(class06584 var1) {
      class06912.h.N(this, var1);
      super.method_37119(var1);
   }

   public class04157 method_52372() {
      return this.field_44991;
   }

   public static long method_64123(class04782 var0, class07321 var1) {
      var0.method_14178().y(class01624.m, var1, 2);
      return class01624.m.M();
   }

   protected void method_74077(class07001 var1) {
      this.field_62505 = var1;
      this.method_74134(method_74135(var1));
   }

   public void method_14252(int var1) {
      if (var1 != super.fields_37fa3311b0e9d3e9b883d09222919bf5a_0) {
         super.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = var1;
         this.field_13978 = -1;
      }
   }

   public void method_14228(int var1) {
      float f = this.method_7349();
      float f1 = (f - 1.0F) / f;
      float f2 = class04995.N(var1 / f, 0.0F, f1);
      if (f2 != super.fields_37fa3311b0e9d3e9b883d09222919bf5a_2) {
         super.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = f2;
         this.field_13978 = -1;
      }
   }

   public class07001 method_74075() {
      return this.field_62505;
   }

   protected void method_74076(class07001 var1) {
      this.field_62504 = var1;
      this.method_74133(method_74135(var1));
   }

   private void method_14235(class07482 var1) {
      var1.N(this.field_29181);
      var1.N(this.field_29180);
   }

   public void method_34225() {
      this.method_14235(super.fields_07fa3311b0e9d3e9b883d09222919bf5a_2);
   }

   private void method_68175(class08299 var1) {
      Optional<class05946<class07299>> optional = var1.N("ender_pearl_dimension", class07299.field_25178);
      if (!optional.isEmpty()) {
         class04782 class04782 = this.method_51469().method_8503().N(optional.get());
         if (class04782 != null) {
            class07049 class07049 = class07078.N(var1, class04782, class06113.field_52444, var1x -> !class04782.method_18768(var1x) ? null : var1x);
            if (class07049 != null) {
               method_64123(class04782, class07049.method_31476());
            } else {
               field_13975.warn("Failed to spawn player ender pearl in level ({}), skipping", optional.get());
            }
         } else {
            field_13975.warn("Trying to load ender pearl without level ({}) being loaded, skipping", optional.get());
         }
      }
   }

   @Override
   public class06556 method_7265() {
      return new class06529(this);
   }

   public void method_14213(class03737 var1) {
      this.field_46156 = var1.y();
      this.field_44990 = var1.L();
      this.field_13993 = var1.u();
      this.field_13971 = var1.i();
      this.field_28860 = var1.B();
      this.field_35566 = var1.Z();
      this.field_52358 = var1.z();
      this.method_5841().N(field_62514, (byte)var1.R());
      this.method_5841().N(field_62513, var1.M());
   }

   @Nullable
   private static class07282 method_32745(class08299 var0, String var1) {
      return var0.<class07282>N(var1, class07282.field_56668).orElse(null);
   }

   public void method_64131(class08299 var1) {
      var1.u("ender_pearls").forEach(this::method_68175);
   }

   private void method_64135(class08329 var1) {
      class07049 class07049x = this.method_5668();
      class07049 class07049x = this.method_5854();
      if (class07049x != null && class07049x != this && class07049x.method_5817()) {
         class08329 class08329 = var1.N("RootVehicle");
         class08329.N("Attach", class01487.N, class07049x.method_5667());
         class07049x.method_5662(class08329.N("Entity"));
      }
   }

   @Override
   public void method_7316(int var1) {
      if (var1 != 0) {
         super.method_7316(var1);
         this.field_13978 = -1;
      }
   }

   public void method_64125(class08299 var1) {
      Optional<class08299> optional = var1.N("RootVehicle");
      if (!optional.isEmpty()) {
         class04782 class04782 = this.method_51469();
         class07049 class07049xx = class07078.N(
            optional.get().y("Entity"), class04782, class06113.field_52444, var1x -> !class04782.method_18768(var1x) ? null : var1x
         );
         if (class07049xx != null) {
            UUID uuid = optional.get().<UUID>N("Attach", class01487.N).orElse(null);
            if (class07049xx.method_5667().equals(uuid)) {
               this.method_5873(class07049xx, true, false);
            } else {
               for (class07049 class07049x : class07049xx.method_5736()) {
                  if (class07049x.method_5667().equals(uuid)) {
                     this.method_5873(class07049x, true, false);
                     break;
                  }
               }
            }

            if (!this.method_5765()) {
               field_13975.warn("Couldn't reattach entity to player");
               class07049xx.method_31472();

               for (class07049 class07049xx : class07049xx.method_5736()) {
                  class07049xx.method_31472();
               }
            }
         }
      }
   }

   public class07001 method_74074() {
      return this.field_62504;
   }

   private class07282 method_32746(@Nullable class07282 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.m_handler$zfa000$fabric_events_interaction_v0$fakePlayerGameMode_26(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07282)callbackinforeturnable.getReturnValue();
      } else {
         class07282 class07282 = this.field_13995.v();
         if (class07282 != null) {
            return class07282;
         } else {
            return var1 != null ? var1 : this.field_13995.NT();
         }
      }
   }

   private void method_64136(class08329 var1) {
      if (!this.field_54208.isEmpty()) {
         class08289 class08289 = var1.y("ender_pearls");

         for (class07488 class07488 : this.field_54208) {
            if (class07488.method_31481()) {
               field_13975.warn("Trying to save removed ender pearl, skipping");
            } else {
               class08329 class08329 = class08289.N();
               class07488.method_5662(class08329);
               class08329.N("ender_pearl_dimension", class07299.field_25178, class07488.method_73183().method_27983());
            }
         }
      }
   }

   @Override
   public void method_7286(class06584 var1, int var2) {
      super.method_7286(var1, var2);
      this.field_13978 = -1;
   }

   private void method_32749(class08329 var1) {
      var1.N("playerGameType", class07282.field_56668, this.field_13974.y());
      class07282 class07282 = this.field_13974.L();
      var1.y("previousPlayerGameType", class07282.field_56668, class07282);
   }

   public void method_38787() {
      if (this.method_5854() != null && this.method_5854().method_5771()) {
         if (this.field_35008 == null) {
            this.field_35008 = this.method_73189();
         } else {
            class06912.NN.N(this, this.field_35008);
         }
      }

      if (this.field_35008 != null && (this.method_5854() == null || !this.method_5854().method_5771())) {
         this.field_35008 = null;
      }
   }

   private void method_74079(class07001 var1) {
      if (!var1.z() && !var1.y("Silent", false)) {
         if (this.field_5974.y(200) == 0 && (class07078)var1.N_15("id", class07078.N).orElse(null) == class07078.Nx && !class07654.N(this.method_51469(), this)
            )
          {
            this.method_51469()
               .method_43128(
                  null,
                  this.method_23317(),
                  this.method_23318(),
                  this.method_23321(),
                  class07654.N(this.method_51469(), this.field_5974),
                  this.method_5634(),
                  1.0F,
                  class07654.N(this.field_5974)
               );
         }
      }
   }

   public void method_38786() {
      if (this.field_6017 > 0.0 && this.field_35007 == null) {
         this.field_35007 = this.method_73189();
         if (super.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 != null && super.fields_57fa3311b0e9d3e9b883d09222919bf5a_4.B <= this.field_35007.B) {
            class06912.NM.N(this, super.fields_57fa3311b0e9d3e9b883d09222919bf5a_4, super.fields_57fa3311b0e9d3e9b883d09222919bf5a_5);
         }
      }
   }

   private void method_14212(class06675 var1, int var2) {
      this.method_51469().method_14170().N(var1, this, var1x -> var1x.N(var2));
   }

   private void method_64134(class06584 var1) {
      class02265 class02265 = var1.method_58694(class02484.f);
      class07769 class07769 = class06548.N(class02265, this.method_51469());
      if (class07769 != null) {
         class00381<?> class00381 = class07769.N(class02265, this);
         if (class00381 != null) {
            this.field_13987.method_14364(class00381);
         }
      }
   }

   public void method_14226() {
      try {
         if (!this.method_7325() || !this.method_33724()) {
            super.method_5773();
            if (!((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(this)) {
               this.method_7346();
               super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = super.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
            }

            super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N(this);
            this.method_7281(class01235.U);
            this.method_7281(class01235.E);
            if (this.method_5805()) {
               this.method_7281(class01235.W);
            }

            if (this.method_21751()) {
               this.method_7281(class01235.P);
            }

            if (!this.method_6113()) {
               this.method_7281(class01235.m);
            }
         }

         for (int i = 0; i < this.method_31548().method_5439(); i++) {
            class06584 class06584 = this.method_31548().method_5438(i);
            if (!class06584.R()) {
               this.method_64134(class06584);
            }
         }

         if (this.method_6032() != this.field_13997
            || this.field_13979 != super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N()
            || super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.u() == 0.0F != this.field_13972) {
            this.field_13987
               .method_14364(
                  new class08095(this.method_6032(), super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N(), super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.u())
               );
            this.field_13997 = this.method_6032();
            this.field_13979 = super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N();
            this.field_13972 = super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.u() == 0.0F;
         }

         if (this.method_6032() + this.method_6067() != this.field_13963) {
            this.field_13963 = this.method_6032() + this.method_6067();
            this.method_14212(class06675.M, class04995.u(this.field_13963));
         }

         if (super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N() != this.field_13983) {
            this.field_13983 = super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N();
            this.method_14212(class06675.B, class04995.u((float)this.field_13983));
         }

         if (this.method_5669() != this.field_13968) {
            this.field_13968 = this.method_5669();
            this.method_14212(class06675.Z, class04995.u((float)this.field_13968));
         }

         if (this.method_6096() != this.field_13982) {
            this.field_13982 = this.method_6096();
            this.method_14212(class06675.z, class04995.u((float)this.field_13982));
         }

         if (super.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 != this.field_13980) {
            this.field_13980 = super.fields_37fa3311b0e9d3e9b883d09222919bf5a_1;
            this.method_14212(class06675.U, class04995.u((float)this.field_13980));
         }

         if (super.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 != this.field_13965) {
            this.field_13965 = super.fields_37fa3311b0e9d3e9b883d09222919bf5a_0;
            this.method_14212(class06675.E, class04995.u((float)this.field_13965));
         }

         if (super.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 != this.field_13978) {
            this.field_13978 = super.fields_37fa3311b0e9d3e9b883d09222919bf5a_1;
            this.field_13987
               .method_14364(
                  new class08060(
                     super.fields_37fa3311b0e9d3e9b883d09222919bf5a_2,
                     super.fields_37fa3311b0e9d3e9b883d09222919bf5a_1,
                     super.fields_37fa3311b0e9d3e9b883d09222919bf5a_0
                  )
               );
         }

         if (this.field_6012 % 20 == 0) {
            class06912.T.N(this);
         }
      } catch (Throwable throwable) {
         class07080 class07080 = class07080.N(throwable, "Ticking player");
         class07074 class07074 = class07080.N("Player being ticked");
         this.method_5819(class07074);
         throw new class07878(class07080);
      }
   }

   @Override
   public void method_7262() {
      if (this.field_62503 + 20L < this.method_51469().N()) {
         this.method_74080(this.method_74074());
         this.method_74076(new class07001());
         this.method_74080(this.method_74075());
         this.method_74077(new class07001());
      }
   }

   public boolean method_74073(class07001 var1) {
      if (this.method_5765() || !this.method_24828() || this.method_5799() || this.field_27857) {
         return false;
      } else if (this.method_74074().z()) {
         this.method_74076(var1);
         this.field_62503 = this.method_51469().N();
         return true;
      } else if (this.method_74075().z()) {
         this.method_74077(var1);
         this.field_62503 = this.method_51469().N();
         return true;
      } else {
         return false;
      }
   }

   private void method_55633() {
      class07469 class07469xx = this.method_5996(class05298.B);
      if (class07469xx != null) {
         if (this.method_68878()) {
            class07469xx.N(field_47709);
         } else {
            class07469xx.i(field_47709);
         }
      }

      class07469 class07469x = this.method_5996(class05298.E);
      if (class07469x != null) {
         if (this.method_68878()) {
            class07469x.N(field_47710);
         } else {
            class07469x.i(field_47710);
         }
      }

      class07469 class07469xx = this.method_5996(class05298.q);
      if (class07469xx != null) {
         if (this.method_18276()) {
            class07469xx.N(field_59631);
         } else {
            class07469xx.i(field_59631);
         }
      }
   }

   @Override
   public void method_74082() {
      this.method_74079(this.method_74074());
      this.method_74079(this.method_74075());
      if (this.field_6017 > 0.5 || this.method_5799() || this.method_31549().y || this.method_6113() || this.field_27857) {
         this.method_7262();
      }
   }

   private void method_74080(class07001 var1) {
      class04782 class04782 = this.method_51469();
      if (class04782 instanceof class04782) {
         class04782 class04782x = class04782;
         if (!var1.z()) {
            try (class04495 class04495 = new class04495(this.method_71370(), field_13975)) {
               class07078.N(class08308.N(class04495.N_46(() -> ".shoulder"), class04782x.method_30349(), var1), class04782x, class06113.field_52444)
                  .ifPresent(var2x -> {
                     if (var2x instanceof class07453) {
                        ((class07453)var2x).u((class07438)this);
                     }

                     var2x.method_5814(this.method_23317(), this.method_23318() + 0.7F, this.method_23321());
                     class04782x.method_18768(var2x);
                  });
            }
         }
      }
   }

   @Override
   public void method_64400() {
      if (this.method_51469().y() == class07086.field_5801 && this.method_51469().method_64395().N(class07305.J)) {
         if (this.field_6012 % 20 == 0) {
            if (this.method_6032() < this.method_6063()) {
               this.method_6025(1.0F);
            }

            float f = super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.u();
            if (f < 20.0F) {
               super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.y(f + 1.0F);
            }
         }

         if (this.field_6012 % 10 == 0 && super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.L()) {
            super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N(super.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N() + 1);
         }
      }
   }

   @Override
   public void method_7346() {
      this.field_13987.method_14364(new class00486(((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b));
      this.method_14247();
   }

   private void m_handler$zeh001$fabric_entity_events_v1$notifyDeath_29(class07072 var1, CallbackInfo var2) {
      ((AfterDeath)ServerLivingEntityEvents.AFTER_DEATH.invoker()).afterDeath(this, var1);
   }

   private void m_handler$zeh000$fabric_entity_events_v1$onCopyFrom_30(class04770 var1, boolean var2, CallbackInfo var3) {
      ((CopyFrom)ServerPlayerEvents.COPY_FROM.invoker()).copyFromPlayer(var1, this, var2);
   }

   private boolean method_44706() {
      return this.field_13993 == class08027.field_7538;
   }

   public void method_43930(class07806 var1) {
      this.field_13987.method_14364(new class03953(var1.N(), var1.u().map(class07824::N)));
   }

   @Override
   public class07282 method_68876() {
      return this.field_13974.y();
   }

   public class07703 method_64401() {
      return this.field_54402;
   }

   public void method_14234() {
      this.field_13976 = class07536.L();
   }

   public void method_43505(class03059 var1, boolean var2, class00649 var3) {
      if (this.method_44706()) {
         var1.N(this, var2, var3);
      }
   }

   public class03737 method_53823() {
      byte b0 = this.method_5841().N(field_62514);
      return new class03737(
         this.field_46156, this.field_44990, this.field_13993, this.field_13971, b0, this.method_6068(), this.field_28860, this.field_35566, this.field_52358
      );
   }

   public class04895 method_14248() {
      return this.field_13966;
   }

   public class04912 method_14253() {
      return this.field_13996;
   }

   @Override
   public void method_7277(class07049 var1) {
      this.method_51469().method_14178().N(this, new class07268(var1, 4));
   }

   public boolean method_7336(class07282 var1) {
      boolean flag = this.method_7325();
      if (!this.field_13974.N(var1)) {
         return false;
      } else {
         this.field_13987.method_14364(new class00503(class00503.i, var1.N()));
         if (var1 == class07282.field_9219) {
            this.method_7262();
            this.method_5848();
            this.method_6021();
            class07323.N(this);
         } else {
            this.method_14224(this);
            if (flag) {
               class07323.N(this.method_51469(), (class07438)this);
            }
         }

         this.method_7355();
         this.method_6008();
         return true;
      }
   }

   public void method_64398(class00392 var1) {
      this.method_43502(var1, false);
   }

   public boolean method_34879() {
      return this.field_13971;
   }

   public long method_14219() {
      return this.field_13976;
   }

   public String method_14209() {
      SocketAddress socketaddress = this.field_13987.method_48107();
      return socketaddress instanceof InetSocketAddress ? InetAddresses.toAddrString(((InetSocketAddress)socketaddress).getAddress()) : "<unknown>";
   }

   private boolean method_44707(boolean var1) {
      return this.field_13993 == class08027.field_7536 ? var1 : true;
   }

   public int method_52371() {
      return this.field_44990;
   }

   @Nullable
   public class00392 method_14206() {
      return null;
   }

   @Override
   public class08152 method_75004() {
      return this.field_13995.y(this.method_72498());
   }

   @Override
   public void method_5997(class07049 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.m_handler$zfa000$fabric_events_interaction_v0$onPlayerInteractEntity_28(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (this.method_7325()) {
            this.method_14224(var1);
         } else {
            super.method_5997(var1);
         }
      }
   }

   @Override
   public void method_7304(class07049 var1) {
      this.method_51469().method_14178().N(this, new class07268(var1, 5));
   }

   public class08027 method_14238() {
      return this.field_13993;
   }

   public int method_61272() {
      return 0;
   }

   public void method_52373(class04157 var1) {
      this.field_44991 = var1;
   }

   public class05477 method_31273() {
      return this.field_26821;
   }

   public Set<class07488> method_64128() {
      return this.field_54208;
   }

   public class03704 method_14236() {
      return this.field_13970;
   }

   public void method_17668(class01296 var1) {
      this.field_13990 = var1;
   }

   public class01296 method_14232() {
      return this.field_13990;
   }

   public void method_46364(class02027 var1) {
      this.field_39986 = var1;
   }

   @Nullable
   public class02027 method_45163() {
      return this.field_39986 != null && this.field_39986.y() ? null : this.field_39986;
   }

   @Nullable
   public class07209 method_58585() {
      return this.field_50088;
   }

   public void method_52208(class06889 var1) {
      this.field_51875 = var1;
   }

   public void method_58584() {
      this.field_50088 = null;
   }

   @Override
   public float method_59903(class07049 var1, float var2, class07072 var3) {
      return class07323.N(this.method_51469(), this.method_59958(), var1, var3, var2);
   }

   public void method_26284(@Nullable class04744 var1, boolean var2) {
      if (var2 && var1 != null && !var1.y(this.field_56607)) {
         this.method_64398(field_56606);
      }

      this.field_56607 = var1;
   }

   public void method_63561(class08687 var1) {
      this.field_54048 = var1;
   }

   public boolean method_33795(class04770 var1) {
      return var1 == this ? false : this.field_28860 || var1.field_28860;
   }

   public boolean method_39426() {
      return this.field_35566;
   }

   @Override
   public Optional<class03982> method_42272() {
      return Optional.of(this.field_39985);
   }

   public class08687 method_63562() {
      return this.field_54048;
   }

   public void method_60592(class04770 var1) {
      this.method_26284(var1.field_56607, false);
   }

   public void method_58143(boolean var1) {
      this.field_49776 = var1;
   }

   public void method_37413(boolean var1) {
      class08044 class08044 = this.method_31548();
      class06584 class06584 = class08044.N(var1);
      ((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3)
         .y(class08044, class08044.N())
         .ifPresent(var2x -> ((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(var2x, class08044.y()));
      if (super.fields_9212a028292fd3c078969e3ee4c71d9e8_0.R()) {
         this.method_6021();
      }

      this.method_7329(class06584, false, true);
   }

   public class06889 method_63563() {
      float f = this.field_54048.L() == this.field_54048.u() ? 0.0F : (this.field_54048.L() ? 1.0F : -1.0F);
      float f1 = this.field_54048.N() == this.field_54048.y() ? 0.0F : (this.field_54048.N() ? 1.0F : -1.0F);
      return method_18795(new class06889(f, 0.0, f1), 1.0F, this.method_36454());
   }

   public void method_64124(class07488 var1) {
      this.field_54208.add(var1);
   }

   public void method_64130(class07488 var1) {
      this.field_54208.remove(var1);
   }

   public void method_58586(class07209 var1) {
      this.field_50088 = var1;
   }

   public long method_64133(class07488 var1) {
      if (var1.method_73183() instanceof class04782 class04782) {
         class07321 class07321 = var1.method_31476();
         this.method_64124(var1);
         class04782.method_14197();
         return method_64123(class04782, class07321) - 1L;
      } else {
         return 0L;
      }
   }

   public void method_74537(Set<class00455<?>> var1) {
      this.field_62842 = Set.copyOf(var1);
   }

   public Set<class00455<?>> method_74538() {
      return !this.field_13995.yV().N(this) ? Set.of() : this.field_62842;
   }

   public void method_14240() {
      this.field_13985 = false;
   }

   @Override
   public boolean method_33793() {
      return this.field_28860;
   }

   public void handler$zza000$appleskin$onUpdate(CallbackInfo var1) {
      SyncHandler.onPlayerUpdate(this);
   }

   private class07105 m_modifyExpressionValue$zlc001$fabric_particles_v1$modifyBlockStateParticleEffect_31(
      class07105 var1, double var2, boolean var4, class00500 var5, class07209 var6
   ) {
      var1.fabric_setBlockPos(var6);
      return var1;
   }

   private void m_redirect$bbh000$fabric_screen_handler_api_v1$fabric_closeHandledScreenIfAllowed_32(class04770 var1, class06237 var2) {
      if (var2.shouldCloseCurrentScreen()) {
         this.method_7346();
      } else {
         this.method_14247();
      }
   }

   private void m_redirect$bbh000$fabric_screen_handler_api_v1$fabric_replaceVanillaScreenPacket_33(class01615 var1, class00381 var2, class06237 var3) {
      if (var3 instanceof class03965 class03965 && class03965.N instanceof ExtendedScreenHandlerFactory extendedscreenhandlerfactory) {
         var3 = extendedscreenhandlerfactory;
      }

      if (var3 instanceof ExtendedScreenHandlerFactory extendedscreenhandlerfactory1) {
         class07482 class07482 = Objects.requireNonNull((class07482)super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3);
         if (!(class07482.N() instanceof ExtendedScreenHandlerType)) {
            class01894 class01894 = class04206.T.y(class07482.N());
            throw new IllegalArgumentException(
               "[Fabric] Non-extended screen handler " + class01894 + " must not be opened with an ExtendedScreenHandlerFactory!"
            );
         }

         Networking.sendOpenPacket(this, extendedscreenhandlerfactory1, class07482, this.field_13986);
      } else {
         var1.method_14364(var2);
      }
   }

   private void m_handler$bbh000$fabric_screen_handler_api_v1$fabric_storeOpenedScreenHandler_34(class06237 var1, CallbackInfoReturnable var2, class07482 var3) {
      if (!(var1 instanceof ExtendedScreenHandlerFactory) && (!(var1 instanceof class03965) || !(((class03965)var1).N instanceof ExtendedScreenHandlerFactory))
         )
       {
         if (var3.N() instanceof ExtendedScreenHandlerType) {
            class01894 class01894 = class04206.T.y(var3.N());
            throw new IllegalArgumentException("[Fabric] Extended screen handler " + class01894 + " must be opened with an ExtendedScreenHandlerFactory!");
         }
      } else {
         super.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = var3;
      }
   }
}
