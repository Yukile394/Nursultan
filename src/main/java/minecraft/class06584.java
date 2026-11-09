package minecraft;

import Nursultan.class10623;
import Nursultan.class10625;
import Nursultan.class11383;
import Nursultan.class11938;
import baritone.api.utils.accessor.IItemStack;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.features.item.r1_14_4_enchantment_tooltip.Enchantments1_14_4;
import com.viaversion.viafabricplus.injection.access.item.attack_damage.IDisplayDefault;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.util.ItemUtil;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber.CountChangeSubscriber;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber.EnchantmentSubscriber;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber.Multi;
import net.caffeinemc.mods.lithium.mixin.util.accessors.ItemStackAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.event.player.ItemEvents;
import net.fabricmc.fabric.api.event.player.ItemEvents.UseCallback;
import net.fabricmc.fabric.api.event.player.ItemEvents.UseOnCallback;
import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.FabricItemStack;
import net.fabricmc.fabric.impl.item.ComponentTooltipAppenderRegistryImpl;
import net.fabricmc.fabric.impl.item.VanillaTooltipAppenderOrder;
import org.apache.commons.lang3.function.TriConsumer;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import squeek.appleskin.client.TooltipOverlayHandler;

@Environment(EnvType.CLIENT)
public final class class06584 implements class02700, IItemStack, ChangePublisher, ChangeSubscriber, ItemStackAccessor, FabricItemStack {
   private static final List<class00392> m = List.of(
      class00392.L("item.op_warning.line1").N(class06541.field_1061, class06541.field_1067),
      class00392.L("item.op_warning.line2").N(class06541.field_1061),
      class00392.L("item.op_warning.line3").N(class06541.field_1061)
   );
   private static final class00392 P = class00392.L("item.unbreakable").N(class06541.field_1078);
   private static final class00392 s = class00392.L("item.intangible").N(class06541.field_1080);
   public static final MapCodec<class06584> N = MapCodec.recursive(
      "ItemStack",
      var0 -> RecordCodecBuilder.mapCodec(
         var0x -> var0x.group(
               class06581.u.fieldOf("id").forGetter(class06584::Z),
               class06338.N(1, 99).fieldOf("count").orElse(1).forGetter(class06584::c),
               class02678.y.optionalFieldOf("components", class02678.N).forGetter(var0xx -> var0xx.W.M())
            )
            .apply(var0x, class06584::new)
      )
   );
   public static final Codec<class06584> y = Codec.lazyInitialized(N::codec);
   public static final Codec<class06584> L = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
         var0 -> var0.group(
               class06581.u.fieldOf("id").forGetter(class06584::Z), class02678.y.optionalFieldOf("components", class02678.N).forGetter(var0x -> var0x.W.M())
            )
            .apply(var0, (var0x, var1) -> new class06584(var0x, 1, var1))
      )
   );
   public static final Codec<class06584> u = y.validate(class06584::N);
   public static final Codec<class06584> i = L.validate(class06584::N);
   public static final Codec<class06584> R = class06338.M(y).xmap(var0 -> var0.orElse(class06584.E), var0 -> var0.R() ? Optional.empty() : Optional.of(var0));
   public static final Codec<class06584> M = class06581.u.xmap(class06584::new, class06584::Z);
   public static final class02362<class04247, class06584> B = y(class02678.L);
   public static final class02362<class04247, class06584> Z = y(class02678.u);
   public static final class02362<class04247, class06584> z = new class06557();
   public static final class02362<class04247, List<class06584>> U = B.N_33(class02389.N(class00743::method_37434));
   private static final Logger T = LogUtils.getLogger();
   public static final class06584 E = new class06584((Void)null);
   private static final class00392 b = class00392.L("item.disabled").N(class06541.field_1061);
   private int j;
   private int v;
   @Deprecated
   @Nullable
   private final class06581 n;
   public final class02509 W;
   @Nullable
   private class07049 t;
   private int G;
   private ChangeSubscriber l;
   private int d;

   @Nullable
   public class00392 w() {
      class00392 class00392 = this.method_58694(class02484.B);
      if (class00392 != null) {
         return class00392;
      } else {
         class02706 class02706 = this.method_58694(class02484.NL);
         if (class02706 != null) {
            String sx = class02706.u().N();
            if (!class05018.B(sx)) {
               return class00392.y(sx);
            }
         }

         return null;
      }
   }

   public static boolean L(class06584 var0, class06584 var1) {
      if (!var0.N(var1.B())) {
         return false;
      } else {
         return var0.R() && var1.R() ? true : Objects.equals(var0.W, var1.W);
      }
   }

   public class06584 L(int var1) {
      if (this.R()) {
         return E;
      } else {
         class06584 class06584 = this.t();
         class06584.i(var1);
         return class06584;
      }
   }

   public class02695 L() {
      return !this.R() ? this.B().R() : class02695.N;
   }

   public boolean L(class06584 var1) {
      class02764 class02764 = this.method_58694(class02484.q);
      return class02764 != null && class02764.N(var1);
   }

   public void M(int var1) {
      this.i(this.c() + var1);
   }

   public class06584 M() {
      if (this.R()) {
         return E;
      } else {
         class06584 class06584 = this.t();
         this.i(0);
         return class06584;
      }
   }

   public int P() {
      return class04995.N(this.a_(class02484.i, 0), 0, this.s());
   }

   @Nullable
   public class07049 K() {
      return !this.R() ? this.t : null;
   }

   public boolean T() {
      return this.W() && this.P() >= this.s();
   }

   public boolean Q() {
      Boolean obool = this.method_58694(class02484.G);
      return obool != null ? obool : this.B().L(this);
   }

   public class06584(class07310 var1) {
      this(var1, 1);
   }

   public class06584(class03556<class06581> var1, int var2, class02678 var3) {
      this((class07310)var1.N(), var2, class02509.N(((class06581)var1.N()).R(), var3));
   }

   public class06584(class03556<class06581> var1) {
      this(var1.N(), 1);
   }

   private class06584(@Nullable Void var1) {
      super();
      this.n = null;
      this.W = new class02509(class02695.N);
   }

   public class06584(class07310 var1, int var2) {
      this(var1, var2, new class02509(var1.B().R()));
   }

   public class06584(class03556<class06581> var1, int var2) {
      this((class07310)var1.N(), var2);
   }

   private class06584(class07310 var1, int var2, class02509 var3) {
      super();
      this.n = var1.B();
      this.j = var2;
      this.W = var3;
   }

   @Override
   public String toString() {
      return this.c() + " " + this.B();
   }

   public void B(int var1) {
      this.M(-var1);
   }

   public class06581 B() {
      return this.R() ? class06570.N : this.n;
   }

   private void F() {
      this.W.lithium$subscribe(this, 0);
   }

   public boolean I() {
      return !this.a_(class02484.P, class02710.N).u();
   }

   public class02710 J() {
      return this.a_(class02484.P, class02710.N);
   }

   public class03556<class06581> Z() {
      return this.B().i();
   }

   public class00392 V() {
      class05216 class05216x = class00392.i().y(this.d());
      if (this.L(class02484.B)) {
         class05216x.N(class06541.field_1056);
      }

      class05216 class05216x = class00390.N((class00392)class05216x);
      if (!this.R()) {
         class05216x.N(this.O().N()).N(var1x -> var1x.N(new class00380(this)));
      }

      return class05216x;
   }

   public class08186 e() {
      return this.a_(class02484.a, class08186.N);
   }

   public class02695 i() {
      return !this.R() ? this.W.Z() : class02695.N;
   }

   public void i(int var1) {
      this.N(var1, null);
      this.j = var1;
   }

   public boolean b() {
      return this.W() && this.P() >= this.s() - 1;
   }

   public int s() {
      return this.a_(class02484.u, 0);
   }

   public int c() {
      return this.R() ? 0 : this.j;
   }

   public int n() {
      return this.B().z(this);
   }

   public boolean l() {
      return this.B().M(this);
   }

   public class00392 d() {
      class00392 class00392 = this.w();
      return class00392 != null ? class00392 : this.k();
   }

   public boolean m() {
      return this.W() && this.P() > 0;
   }

   public boolean o() {
      return this.t instanceof class00679;
   }

   private void p() {
      this.G = this.n == null ? -1 : this.n.hashCode() + this.P();
   }

   public class00392 k() {
      return this.B().N(this);
   }

   public class06584 t() {
      if (this.R()) {
         return E;
      } else {
         class06584 class06584 = new class06584(this.B(), this.j, this.W.B());
         class06584.u(this.H());
         return class06584;
      }
   }

   public boolean g() {
      if (!this.L(class02484.J)) {
         return false;
      } else {
         class02710 class02710 = this.method_58694(class02484.P);
         return class02710 != null && class02710.u();
      }
   }

   public int v() {
      return this.B().Z(this);
   }

   public boolean j() {
      return this.B().B(this);
   }

   @Nullable
   public class00679 q() {
      return this.t instanceof class00679 ? (class00679)this.K() : null;
   }

   public int U() {
      return this.a_(class02484.L, 1);
   }

   public Stream<class03530<class06581>> z() {
      return this.B().i().L();
   }

   public class02678 u() {
      return !this.R() ? this.W.M() : class02678.N;
   }

   public void u(int var1) {
      this.v = var1;
   }

   private class02477 y(class02477 var1, class06591 var2, class08562 var3, class06497 var4, Consumer var5, LocalIntRef var6) {
      this.N(var1, var2, var3, var5, var4, var6);
      return var1;
   }

   public void y(class02678 var1) {
      this.W.N(var1);
   }

   @Nullable
   public <T> T y(class02477<? extends T> var1) {
      return this.W.L(var1);
   }

   public static int y(@Nullable class06584 var0) {
      if (var0 != null) {
         int ix = 31 + var0.B().hashCode();
         return 31 * ix + var0.y().hashCode();
      } else {
         return 0;
      }
   }

   private void y(class06591 var1, @Nullable class08036 var2, class06497 var3, CallbackInfoReturnable var4) {
      ((ItemTooltipCallback)ItemTooltipCallback.EVENT.invoker()).getTooltip(this, var1, var3, (List)var4.getReturnValue());
   }

   private static class02362<class04247, class06584> y(class02362<class04247, class02678> var0) {
      return new class10625(var0);
   }

   public class06584 y(int var1, @Nullable class07438 var2) {
      class06584 class06584 = this.L(var1);
      this.N(var1, var2);
      return class06584;
   }

   public void y(class07299 var1, class07438 var2, int var3) {
      class08209 class08209 = this.method_58694(class02484.w);
      if (class08209 != null && class08209.N(var3)) {
         class08209.N(var2.method_59922(), var2, this, 5);
      }

      class08174 class08174 = this.method_58694(class02484.X);
      if (class08174 != null && !var1.method_8608()) {
         class08174.N(this, var3, var2, var2.method_6058().N());
      } else {
         this.B().N(var1, var2, this, var3);
      }
   }

   public boolean y(class06646 var1) {
      class03220 class03220 = this.method_58694(class02484.T);
      return class03220 != null && class03220.N(var1);
   }

   public void lithium$notify(class02509 var1, int var2) {
      if (var1 != this.W) {
         throw new IllegalStateException("Invalid publisher, expected " + this.W + " but got " + var1);
      } else {
         if (this.l != null) {
            this.l.lithium$notify(this, this.d);
         }
      }
   }

   public void y(class02695 var1) {
      this.W.N(var1);
   }

   @Override
   public class02695 y() {
      return (class02695)(!this.R() ? this.W : class02695.N);
   }

   public static boolean y(class06584 var0, class06584 var1) {
      return var0.N(var1.B());
   }

   private void y(class06591 var1, class08562 var2, @Nullable class08036 var3, class06497 var4, Consumer var5, CallbackInfo var6, LocalIntRef var7) {
      this.N(null, var1, var2, var5, var4, var7);
   }

   private class06584 y(class07310 var1, int var2) {
      return new class06584(var1.B().i(), var2, this.W.M());
   }

   public void y(int var1) {
      this.N(class02484.i, Integer.valueOf(class04995.N(var1, 0, this.s())));
      this.N(null);
   }

   public void y(class07438 var1, class07438 var2) {
      this.B().y(this, var1, var2);
      class08609 class08609 = this.method_58694(class02484.g);
      if (class08609 != null) {
         this.N(class08609.N(), var2, class07085.field_6173);
      }
   }

   public boolean y(class00500 var1) {
      return this.B().y(this, var1);
   }

   public boolean E() {
      return this.U() > 1 && (!this.W() || !this.m());
   }

   private boolean N(class06581 var1, class06584 var2, class06591 var3, class08562 var4, Consumer var5, class06497 var6) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         class07001 class07001x = ItemUtil.getTagOrNull(this);
         class07001 class07001x = class07001x == null ? null : class07001x.m(ItemUtil.vvNbtName(Protocol1_21_4To1_21_5.class, "backup"));
         return class07001x == null || !class07001x.y("hide_additional_tooltip");
      } else {
         return true;
      }
   }

   public void N(class00717 var1) {
      this.B().N(var1);
   }

   private void N(CallbackInfo var1) {
      this.p();
   }

   public boolean N(class00500 var1, class07299 var2, class07209 var3, class08036 var4) {
      return this.B().N(this, var1, var2, var3, var4);
   }

   private void N(class02477 var1, Object var2, CallbackInfoReturnable var3) {
      if (var1 == class02484.P) {
         ChangeSubscriber changesubscriber = this.l;
         if (changesubscriber instanceof EnchantmentSubscriber) {
            ((EnchantmentSubscriber)changesubscriber).lithium$notifyAfterEnchantmentChange(this, this.d);
         }
      }
   }

   public boolean N(class07072 var1) {
      class08721 class08721 = this.method_58694(class02484.Q);
      return class08721 == null || !class08721.N(var1);
   }

   private void N(CallbackInfoReturnable var1) {
      class11383 class11383 = class11383.N(this);
      class11938.L().L(class11383);
   }

   private void N(Consumer var1, class08562 var2, class08036 var3, CallbackInfo var4) {
      ((IDisplayDefault)class02831.N()).viaFabricPlus$setItemEnchantments(class07323.y(this));
   }

   private void N(class06591 var1, class08562 var2, @Nullable class08036 var3, class06497 var4, Consumer var5, CallbackInfo var6, LocalIntRef var7) {
      this.N(class02484.b, var1, var2, var5, var4, var7);
   }

   private void N(class06584 var1, int var2, class04782 var3, class04770 var4, Consumer var5, Operation var6, class07438 var7, class07085 var8) {
      CustomDamageHandler customdamagehandler = this.B().fabric_getCustomDamageHandler();
      if (customdamagehandler != null && !var7.method_56992()) {
         MutableBoolean mutableboolean = new MutableBoolean(false);
         var2 = customdamagehandler.damage(this, var2, var7, var8, () -> {
            mutableboolean.setTrue();
            this.B(1);
            var5.accept(this.B());
         });
         if (mutableboolean.booleanValue()) {
            return;
         }
      }

      var6.call(new Object[]{var1, var2, var3, var4, var5});
   }

   private void N(class06584 var1, int var2, class04782 var3, class04770 var4, Consumer var5, Operation var6, LocalRef var7, LocalRef var8) {
      this.N(var1, var2, var3, var4, var5, var6, (class07438)var7.get(), (class07085)var8.get());
   }

   private class02477 N(class02477 var1, class06591 var2, class08562 var3, class06497 var4, Consumer var5, LocalIntRef var6) {
      this.N(var1, var2, var3, var5, var4, var6);
      return var1;
   }

   private void N(class02477 var1, class06591 var2, class08562 var3, Consumer var4, class06497 var5, CallbackInfo var6) {
      if (!ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_14_4)) {
         class07001 class07001 = ItemUtil.getTagOrNull(this);
         if (class07001 != null) {
            if (var1 == class02484.P) {
               this.N("Enchantments", class07001, var2, var4);
               var6.cancel();
            } else if (var1 == class02484.p) {
               this.N("StoredEnchantments", class07001, var2, var4);
               var6.cancel();
            }
         }
      }
   }

   private class07082 N(class06581 var1, class07299 var2, class08036 var3, class07050 var4, Operation var5) {
      class07082 class07082 = ((UseCallback)ItemEvents.USE.invoker()).use(var2, var3, var4);
      return class07082 != null ? class07082 : (class07082)var5.call(new Object[]{var1, var2, var3, var4});
   }

   private class07082 N(class06581 var1, class06501 var2, Operation var3) {
      class07082 class07082 = ((UseOnCallback)ItemEvents.USE_ON.invoker()).useOn(var2);
      return class07082 != null ? class07082 : (class07082)var3.call(new Object[]{var1, var2});
   }

   private void N(String var1, class07001 var2, class06591 var3, Consumer var4) {
      class01929 class01929 = var3.N();
      class07741 class07741 = var2.P(var1).orElse(null);
      if (class07741 != null) {
         for (class07001 class07001 : class07741) {
            Enchantments1_14_4.getOrEmpty(class07001.y("id", ""))
               .ifPresent(
                  var3x -> {
                     int ix = class07001.y("lvl", 0);
                     if (class01929 != null) {
                        class01929.y(class04227.yR)
                           .N((class05946<class07304>)var3x)
                           .ifPresent(var2xx -> var4.accept(class07304.N(var2xx, class04995.N(ix, -32768, 32767))));
                     }
                  }
               );
         }
      }
   }

   public void N(int var1, @Nullable class07438 var2) {
      if (var2 == null || !var2.method_56992()) {
         this.B(var1);
      }
   }

   private void N(int var1, CallbackInfo var2) {
      if (var1 != this.j) {
         ChangeSubscriber changesubscriber = this.l;
         if (changesubscriber instanceof CountChangeSubscriber) {
            ((CountChangeSubscriber)changesubscriber).lithium$notifyCount(this, this.d, var1);
         }

         if (var1 == 0) {
            this.W.lithium$unsubscribe(this);
            if (this.l != null) {
               this.l.lithium$forceUnsubscribe(this, this.d);
               this.l = null;
               this.d = 0;
            }
         }
      }
   }

   public void lithium$forceUnsubscribe(class02509 var1, int var2) {
      if (var1 != this.W) {
         throw new IllegalStateException("Invalid publisher, expected " + this.W + " but got " + var1);
      } else {
         this.l.lithium$forceUnsubscribe(this, this.d);
         this.l = null;
         this.d = 0;
      }
   }

   private void N(class06591 var1, class08036 var2, class06497 var3, CallbackInfoReturnable var4) {
      if (TooltipOverlayHandler.INSTANCE != null) {
         TooltipOverlayHandler.INSTANCE.onItemTooltip(this, var2, var1, var3, (List)var4.getReturnValue());
      }
   }

   public class07072 N(class07438 var1, Supplier<class07072> var2) {
      return Optional.ofNullable(this.method_58694(class02484.z))
         .flatMap(var1x -> var1x.N(var1.method_56673()))
         .map(var1x -> new class07072((class03556<class03689>)var1x, var1))
         .or(() -> Optional.ofNullable(this.B().N(var1)))
         .orElseGet(var2);
   }

   private void N(@Nullable class02477 var1, class06591 var2, class08562 var3, Consumer var4, class06497 var5, LocalIntRef var6) {
      if (ComponentTooltipAppenderRegistryImpl.hasModdedEntries()) {
         if (var6.get() == 0) {
            ComponentTooltipAppenderRegistryImpl.onFirst(this, var2, var3, var4, var5);
         }

         List list = VanillaTooltipAppenderOrder.getVanillaOrder();
         if (var6.get() <= list.size()) {
            class02477 class02477;
            do {
               if (var6.get() > 0) {
                  class02477 = (class02477)list.get(var6.get() - 1);
                  HashSet hashset = new HashSet();
                  hashset.add(class02477);
                  ComponentTooltipAppenderRegistryImpl.onAfter(this, class02477, var2, var3, var4, var5, hashset);
               }

               if (var6.get() == list.size()) {
                  var6.set(var6.get() + 1);
                  break;
               }

               class02477 = (class02477)list.get(var6.get());
               HashSet hashset1 = new HashSet();
               hashset1.add(class02477);
               ComponentTooltipAppenderRegistryImpl.onBefore(this, class02477, var2, var3, var4, var5, hashset1);
               var6.set(var6.get() + 1);
            } while (class02477 != var1);

            if (var1 == null) {
               ComponentTooltipAppenderRegistryImpl.onLast(this, var2, var3, var4, var5);
            }
         }
      }
   }

   private boolean N(boolean var1, class06591 var2, class08562 var3, @Nullable class08036 var4, class06497 var5, Consumer var6, LocalIntRef var7) {
      if (!var1) {
         this.N(null, var2, var3, var6, var5, var7);
      }

      return var1;
   }

   public static DataResult<class06584> N(class06584 var0) {
      DataResult dataresult = N(var0.y());
      if (dataresult.isError()) {
         return dataresult.map(var1x -> var0);
      } else {
         return var0.c() > var0.U()
            ? DataResult.error(() -> "Item stack with stack size of " + var0.c() + " was larger than maximum: " + var0.U())
            : DataResult.success(var0);
      }
   }

   public void N(int var1, class07438 var2, class07050 var3) {
      this.N(var1, var2, var3.N());
   }

   public void N(int var1, class07438 var2, class07085 var3) {
      if (var2.method_73183() instanceof class04782 class04782) {
         class04770 class04770 = var2 instanceof class04770 class04770x ? class04770x : null;
         Consumer consumer = var2x -> var2.method_20235(var2x, var3);
         class04770 class04770xx = class04770;
         Operation operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(
               var0, 5, "[net.minecraft.class_1799, int, net.minecraft.class_3218, net.minecraft.class_3222, java.util.function.Consumer]"
            );
            ((class06584)var0[0]).N((Integer)var0[1], (class04782)var0[2], (class04770)var0[3], (Consumer<class06581>)var0[4]);
            return (Void)null;
         };
         LocalRefImpl localrefimpl = new LocalRefImpl();
         LocalRefImpl localrefimpl1 = new LocalRefImpl();
         localrefimpl.init(var2);
         localrefimpl1.init(var3);
         this.N(this, var1, class04782, class04770xx, consumer, operation, localrefimpl, localrefimpl1);
         var3 = (class07085)localrefimpl1.dispose();
         var2 = (class07438)localrefimpl.dispose();
      }
   }

   public class06584 N(int var1, class07310 var2, class07438 var3, class07085 var4) {
      this.N(var1, var3, var4);
      if (this.R()) {
         class06584 class06584 = this.y(var2, 1);
         if (class06584.W()) {
            class06584.y(0);
         }

         return class06584;
      } else {
         return this;
      }
   }

   public boolean N(class06937 var1, class05442 var2, class08036 var3) {
      return this.B().N(this, var1, var2, var3);
   }

   public void N(int var1, class04782 var2, @Nullable class04770 var3, Consumer<class06581> var4) {
      int ix = this.N(var1, var2, var3);
      if (ix != 0) {
         this.N(this.P() + ix, var3, var4);
      }
   }

   private int N(int var1, class04782 var2, @Nullable class04770 var3) {
      if (!this.W()) {
         return 0;
      } else if (var3 != null && var3.method_56992()) {
         return 0;
      } else {
         return var1 > 0 ? class07323.N(var2, this, var1) : var1;
      }
   }

   private void N(int var1, @Nullable class04770 var2, Consumer<class06581> var3) {
      if (var2 != null) {
         class06912.n.N(var2, this, var1);
      }

      this.y(var1);
      if (this.T()) {
         class06581 class06581 = this.B();
         this.B(1);
         var3.accept(class06581);
      }
   }

   public void N(int var1, class08036 var2) {
      if (var2 instanceof class04770 class04770) {
         int ix = this.N(var1, class04770.method_51469(), class04770);
         if (ix == 0) {
            return;
         }

         int jx = Math.min(this.P() + ix, this.s() - 1);
         this.N(jx, class04770, var0 -> {});
      }
   }

   public class06584 N(class07310 var1) {
      return this.N(var1, this.c());
   }

   public class06584 N(class07310 var1, int var2) {
      return this.R() ? E : this.y(var1, var2);
   }

   public static boolean N(class06584 var0, class06584 var1) {
      if (var0 == var1) {
         return true;
      } else {
         return var0.c() != var1.c() ? false : L(var0, var1);
      }
   }

   @Deprecated
   public static boolean N(List<class06584> var0, List<class06584> var1) {
      if (var0.size() != var1.size()) {
         return false;
      } else {
         for (int ix = 0; ix < var0.size(); ix++) {
            if (!N((class06584)var0.get(ix), (class06584)var1.get(ix))) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean N(class06584 var1, class06937 var2, class05442 var3, class08036 var4, class04803 var5) {
      return this.B().N(this, var1, var2, var3, var4, var5);
   }

   public boolean N(class07438 var1, class07438 var2) {
      class06581 class06581 = this.B();
      class06581.N(this, var1, var2);
      if (this.L(class02484.g)) {
         if (var2 instanceof class08036) {
            ((class08036)var2).method_7259(class01235.L.y(class06581));
         }

         return true;
      } else {
         return false;
      }
   }

   public static class02362<class04247, class06584> N(class02362<class04247, class06584> var0) {
      return new class10623(var0);
   }

   public class07082 N(class08036 var1, class07438 var2, class07050 var3) {
      class08725 class08725 = this.method_58694(class02484.o);
      if (class08725 != null && class08725.z()) {
         class07082 class07082 = class08725.N(var1, var2, this);
         if (class07082 != class07082.i) {
            return class07082;
         }
      }

      return this.B().N(this, var1, var2, var3);
   }

   public class06584 N(int var1) {
      int ix = Math.min(var1, this.c());
      class06584 class06584 = this.L(ix);
      this.B(ix);
      return class06584;
   }

   public boolean N(class03530<class06581> var1) {
      return this.B().i().N(var1);
   }

   public boolean N(class06581 var1) {
      return this.B() == var1;
   }

   public boolean N(Predicate<class03556<class06581>> var1) {
      return var1.test(this.B().i());
   }

   public Optional<class04830> N() {
      return this.B().U(this);
   }

   public boolean N(class02477<?> var1) {
      return !this.R() && this.W.y(var1);
   }

   public static DataResult<class06244> N(class02695 var0) {
      if (var0.N(class02484.u) && var0.a_(class02484.L, 1) > 1) {
         return DataResult.error(() -> "Item cannot be both damageable and stackable");
      } else {
         for (class06584 class06584 : var0.a_(class02484.NG, class02854.N).u()) {
            int ix = class06584.c();
            int jx = class06584.U();
            if (ix > jx) {
               return DataResult.error(() -> "Item stack with count of " + ix + " was larger than maximum: " + jx);
            }
         }

         return DataResult.success(class06244.field_17274);
      }
   }

   public boolean N(class03767 var1) {
      return this.R() || this.B().N(var1);
   }

   public float N(class00500 var1) {
      return this.B().N(this, var1);
   }

   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = this.t();
      boolean flag = this.N((class07438)var2) <= 0;
      class06581 class06581 = this.B();
      class07082 class07082 = this.N(
         class06581,
         var1,
         var2,
         var3,
         var0 -> {
            WrapOperationRuntime.checkArgumentCount(
               var0, 4, "[net.minecraft.class_1792, net.minecraft.class_1937, net.minecraft.class_1657, net.minecraft.class_1268]"
            );
            return ((class06581)var0[0]).N((class07299)var0[1], (class08036)var0[2], (class07050)var0[3]);
         }
      );
      return (class07082)(flag && class07082 instanceof class07041 class07041
         ? class07041.N(class07041.u() == null ? this.N(var2, class06584) : class07041.u().N(var2, class06584))
         : class07082);
   }

   public class06584 N(class07299 var1, class07438 var2) {
      this.N(null);
      class06584 class06584 = this.t();
      return this.B().N(this, var1, var2).N(var2, class06584);
   }

   private class06584 N(class07438 var1, class06584 var2) {
      class08197 class08197 = var2.method_58694(class02484.k);
      class08208 class08208 = var2.method_58694(class02484.Y);
      int ix = var2.c();
      class06584 class06584 = this;
      if (class08197 != null) {
         class06584 = class08197.N(this, ix, var1.method_56992(), var1::method_64399);
      }

      if (class08208 != null) {
         class08208.N(var2, var1);
      }

      return class06584;
   }

   public class07082 N(class06501 var1) {
      class08036 class08036 = var1.method_8036();
      class07209 class07209 = var1.method_8037();
      if (class08036 != null && !class08036.method_31549().i && !this.N(new class06646(var1.method_8045(), class07209, false))) {
         return class07082.i;
      } else {
         class06581 class06581 = this.B();
         class07082 class07082 = this.N(class06581, var1, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_1792, net.minecraft.class_1838]");
            return ((class06581)var0[0]).N((class06501)var0[1]);
         });
         if (class08036 != null && class07082 instanceof class07041 && ((class07041)class07082).L()) {
            class08036.method_7259(class01235.L.y(class06581));
         }

         return class07082;
      }
   }

   public boolean N(class03543<class06581> var1) {
      return var1.N(this.Z());
   }

   public boolean N(class03556<class06581> var1) {
      return this.B().i() == var1;
   }

   @Nullable
   public <T> T N(class02477<T> var1, T var2, UnaryOperator<T> var3) {
      Object object = this.a_(var1, var2);
      return this.N(var1, (T)var3.apply(object));
   }

   public void N(class02678 var1) {
      class02678 class02678 = this.W.M();
      this.W.N(var1);
      Optional optional = N(this).error();
      if (optional.isPresent()) {
         T.error("Failed to apply component patch '{}' to item: '{}'", var1, ((Error)optional.get()).message());
         this.W.y(class02678);
      }
   }

   public void N(class07085 var1, BiConsumer<class03556<class07468>, class07471> var2) {
      this.a_(class02484.b, class02833.N).N(var1, var2);
      class07323.N(this, var1, var2);
   }

   public void N(class02834 var1, TriConsumer<class03556<class07468>, class07471, class02831> var2) {
      this.a_(class02484.b, class02833.N).N(var1, var2);
      class07323.N(this, var1, (var1x, var2x) -> var2.accept(var1x, var2x, class02831.N()));
   }

   @Nullable
   public <T, U> T N(class02477<T> var1, T var2, U var3, BiFunction<T, U, T> var4) {
      return this.N(var1, (T)var4.apply(this.a_(var1, var2), var3));
   }

   public <T> void N(class02477<T> var1, class02666 var2) {
      this.N(var1, var2.method_58694(var1));
   }

   @Nullable
   public <T> T N(class02480<T> var1) {
      return this.W.N(var1);
   }

   public <T extends class02694> void N(class02477<T> var1, class06591 var2, class08562 var3, Consumer<class00392> var4, class06497 var5) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class02694 class02694 = this.method_58694(var1);
         if (class02694 != null && var3.N(var1)) {
            class02694.N(var2, var4, var5, this.W);
         }
      }
   }

   public List<class00392> N(class06591 var1, @Nullable class08036 var2, class06497 var3) {
      class08562 class08562 = this.a_(class02484.v, class08562.L);
      if (!var3.y() && class08562.N()) {
         boolean flag = this.B().N(this, var2);
         List list;
         List list1 = list = flag ? m : List.of();
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", false, list);
         this.N(var1, var2, var3, callbackinforeturnable1);
         return list1;
      } else {
         ArrayList arraylist = Lists.newArrayList();
         arraylist.add(this.Y());
         this.N(var1, class08562, var2, var3, arraylist::add);
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, arraylist);
         this.N(var1, var2, var3, callbackinforeturnable);
         this.y(var1, var2, var3, new CallbackInfoReturnable("", false, arraylist));
         return arraylist;
      }
   }

   public void N(class06591 var1, class08562 var2, @Nullable class08036 var3, class06497 var4, Consumer<class00392> var5) {
      LocalIntRefImpl localintrefimpl = new LocalIntRefImpl();
      localintrefimpl.init(0);
      class06581 class06581 = this.B();
      if (this.N(class06581, this, var1, var2, var5, var4)) {
         class06581.N(this, var1, var2, var5, var4);
      }

      class02477 class02477xxxxxxxxxxxxxxxxxxxx = class02484.NK;
      this.N(this.N(class02477xxxxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477x = class02484.NZ;
      this.N(this.N(class02477x, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xx = class02484.f;
      this.N(this.N(class02477xx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxx = class02484.Nd;
      this.N(this.N(class02477xxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxx = class02484.Nk;
      this.N(this.N(class02477xxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxx = class02484.NG;
      this.N(this.N(class02477xxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxx = class02484.Nv;
      this.N(this.N(class02477xxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxx = class02484.Nt;
      this.N(this.N(class02477xxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxx = class02484.NL;
      this.N(this.N(class02477xxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxx = class02484.x;
      this.N(this.N(class02477xxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxx = class02484.NT;
      this.N(this.N(class02477xxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxx = class02484.Ns;
      this.N(this.N(class02477xxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxx = class02484.h;
      this.N(this.N(class02477xxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxxx = class02484.NE;
      this.N(this.N(class02477xxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxxxx = class02484.Nu;
      this.N(this.N(class02477xxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxxxxx = class02484.p;
      this.N(this.N(class02477xxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxxxxxx = class02484.P;
      this.N(this.N(class02477xxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxxxxxxx = class02484.F;
      this.N(this.N(class02477xxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxxxxxxxx = class02484.Nb;
      this.N(this.N(class02477xxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxxxxxxxxx = class02484.W;
      this.N(this.N(class02477xxxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      this.N(var1, var2, var3, var4, var5, null, localintrefimpl);
      this.N(var5, var2, var3);
      this.N(class02484.l, s, var2, var5);
      this.N(class02484.R, P, var2, var5);
      class02477 class02477xxxxxxxxxxxxxxxxxxxx = class02484.NU;
      this.N(this.N(class02477xxxxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxxxxxxxxxxx = class02484.NN;
      this.N(this.N(class02477xxxxxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxxxxxxxxxxxx = class02484.Nl;
      this.N(this.N(class02477xxxxxxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      class02477 class02477xxxxxxxxxxxxxxxxxxxxxxx = class02484.NR;
      this.N(this.N(class02477xxxxxxxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl), var1, var2, var5, var4);
      if (this.N(class06570.Rb) || this.N(class06570.Yl)) {
         class02477 class02477xxxxxxxxxxxxxxxxxxxxxxxx = class02484.NB;
         if (var2.N(this.y(class02477xxxxxxxxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl))) {
            class08983 class08983 = this.method_58694(class02484.NB);
            class04506.N(class08983, var5, "SpawnData");
         }
      }

      class03220 class03220x = this.method_58694(class02484.T);
      if (class03220x != null) {
         class02477 class02477xxxxxxxxxxxxxxxxxxxxxxxx = class02484.T;
         if (var2.N(this.y(class02477xxxxxxxxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl))) {
            var5.accept(class05220.N);
            var5.accept(class03220.L);
            class03220x.N(var5);
         }
      }

      class03220 class03220x = this.method_58694(class02484.s);
      if (class03220x != null) {
         class02477 class02477xxxxxxxxxxxxxxxxxxxxxxxx = class02484.s;
         if (var2.N(this.y(class02477xxxxxxxxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl))) {
            var5.accept(class05220.N);
            var5.accept(class03220.u);
            class03220x.N(var5);
         }
      }

      if (this.N(var4.N(), var1, var2, var3, var4, var5, localintrefimpl)) {
         if (this.m()) {
            class02477 class02477xxxxxxxxxxxxxxxxxxxxxxxx = class02484.i;
            if (var2.N(this.y(class02477xxxxxxxxxxxxxxxxxxxxxxxx, var1, var2, var4, var5, localintrefimpl))) {
               var5.accept(class00392.N("item.durability", this.s() - this.P(), this.s()));
            }
         }

         class04241 class04241 = class04206.B;
         class06581 class06581x = this.B();
         this.y(var1, var2, var3, var4, var5, null, localintrefimpl);
         var5.accept(class00392.y(class04241.y(class06581x).toString()).N(class06541.field_1063));
         int ix = this.W.u();
         if (ix > 0) {
            var5.accept(class00392.N("item.components", ix).N(class06541.field_1063));
         }
      }

      if (var3 != null && !this.B().N(var3.method_73183().method_45162())) {
         var5.accept(b);
      }

      boolean flag = this.B().N(this, var3);
      if (flag) {
         m.forEach(var5);
      }
   }

   private void N(class02477<?> var1, class00392 var2, class08562 var3, Consumer<class00392> var4) {
      if (this.L(var1) && var3.N(var1)) {
         var4.accept(var2);
      }
   }

   private void N(Consumer<class00392> var1, class08562 var2, @Nullable class08036 var3) {
      this.N(var1, var2, var3, null);
      if (var2.N(class02484.b)) {
         for (class02834 class02834 : class02834.values()) {
            MutableBoolean mutableboolean = new MutableBoolean(true);
            this.N(class02834, (var4, var5, var6) -> {
               if (var6 != class02831.y()) {
                  if (mutableboolean.isTrue()) {
                     var1.accept(class05220.N);
                     var1.accept(class00392.L("item.modifiers." + class02834.method_15434()).N(class06541.field_1080));
                     mutableboolean.setFalse();
                  }

                  var6.N(var1, var3, var4, var5);
               }
            });
         }
      }
   }

   public void N(class03556<class07304> var1, int var2) {
      class07323.N(this, var2x -> var2x.y(var1, var2));
   }

   public void N(@Nullable class07049 var1) {
      if (!this.R()) {
         this.t = var1;
      }
   }

   public void N(class07299 var1, class07049 var2, @Nullable class07085 var3) {
      if (this.v > 0) {
         this.v--;
      }

      if (var1 instanceof class04782 class04782) {
         this.B().N(this, class04782, var2, var3);
      }
   }

   public void N(class08036 var1, int var2) {
      var1.method_7342(class01235.y.y(this.B()), var2);
      this.B().L(this, var1);
   }

   public void N(class07299 var1, class00500 var2, class07209 var3, class08036 var4) {
      class06581 class06581 = this.B();
      if (class06581.N(this, var1, var2, var3, var4)) {
         var4.method_7259(class01235.L.y(class06581));
      }
   }

   public void N(class07299 var1) {
      this.B().N(this, var1);
   }

   @Deprecated
   public static int N(List<class06584> var0) {
      int ix = 0;

      for (class06584 class06584 : var0) {
         ix = ix * 31 + y(class06584);
      }

      return ix;
   }

   public static MapCodec<class06584> N(String var0) {
      return y.lenientOptionalFieldOf(var0).xmap(var0x -> var0x.orElse(E), var0x -> var0x.R() ? Optional.empty() : Optional.of(var0x));
   }

   public static boolean N(class06584 var0, class06584 var1, Predicate<class02477<?>> var2) {
      if (var0 == var1) {
         return true;
      } else if (var0.c() != var1.c()) {
         return false;
      } else if (!var0.N(var1.B())) {
         return false;
      } else if (var0.R() && var1.R()) {
         return true;
      } else if (var0.W.u() != var1.W.u()) {
         return false;
      } else {
         for (class02477 class02477 : var0.W.y()) {
            Object object = var0.W.method_58694(class02477);
            Object object1 = var1.W.method_58694(class02477);
            if (object == null || object1 == null) {
               return false;
            }

            if (!Objects.equals(object, object1) && !var2.test(class02477)) {
               return false;
            }
         }

         return true;
      }
   }

   public void N(class07049 var1, class03529<class01194> var2) {
      class08153 class08153 = this.method_58694(class02484.M);
      if (class08153 != null && class08153.y()) {
         var1.method_32876(var2);
      }
   }

   public void N(class07299 var1, class07438 var2, int var3) {
      class06584 class06584x = this.t();
      if (this.B().N(this, var1, var2, var3)) {
         class06584 class06584x = this.N(var2, class06584x);
         if (class06584x != this) {
            var2.method_6122(var2.method_6058(), class06584x);
         }
      }
   }

   @Nullable
   public <T> T N(class02477<T> var1, @Nullable T var2) {
      Object object = this.W.y(var1, var2);
      this.N(var1, var2, null);
      return (T)object;
   }

   public boolean N(class06646 var1) {
      class03220 class03220 = this.method_58694(class02484.s);
      return class03220 != null && class03220.N(var1);
   }

   public int N(class07438 var1) {
      return this.B().N(this, var1);
   }

   public boolean W() {
      return this.L(class02484.u) && !this.L(class02484.R) && this.L(class02484.i);
   }

   public boolean R() {
      return this == E || this.n == class06570.N || this.j <= 0;
   }

   public void R(int var1) {
      if (!this.R() && this.c() > var1) {
         this.i(var1);
      }
   }

   public class06495 O() {
      class06495 class06495 = this.a_(class02484.m, class06495.field_8906);
      if (!this.I()) {
         return class06495;
      } else {
         return switch (class06495) {
            case field_8906, field_8907 -> class06495.field_8903;
            case field_8903 -> class06495.field_8904;
            default -> class06495;
         };
      }
   }

   public int H() {
      return this.v;
   }

   public class06509 G() {
      return this.B().y(this);
   }

   public class00392 Y() {
      class05216 class05216 = class00392.i().y(this.d()).N(this.O().N());
      if (this.L(class02484.B)) {
         class05216.N(class06541.field_1056);
      }

      return class05216;
   }

   public int lithium$unsubscribe(ChangeSubscriber var1) {
      if (this.R()) {
         throw new IllegalStateException("Cannot unsubscribe from an empty ItemStack!");
      } else {
         int ix = ChangeSubscriber.dataOf(this.l, var1, this.d);
         this.d = ChangeSubscriber.dataWithout(this.l, var1, this.d);
         this.l = ChangeSubscriber.without(this.l, var1);
         if (this.l == null) {
            this.W.lithium$unsubscribe(this);
         }

         return ix;
      }
   }

   public void lithium$subscribe(ChangeSubscriber var1, int var2) {
      if (this.R()) {
         throw new IllegalStateException("Cannot subscribe to an empty ItemStack!");
      } else {
         if (this.l == null) {
            this.F();
         }

         this.l = ChangeSubscriber.combine(this.l, this.d, var1, var2);
         if (this.l instanceof Multi) {
            this.d = 0;
         } else {
            this.d = var2;
         }
      }
   }

   public int getBaritoneHash() {
      if (this.G == 0) {
         this.p();
      }

      return this.G;
   }

   public void lithium$unsubscribeWithData(ChangeSubscriber var1, int var2) {
      if (this.R()) {
         throw new IllegalStateException("Cannot unsubscribe from an empty ItemStack!");
      } else {
         this.d = ChangeSubscriber.dataWithout(this.l, var1, this.d, var2, true);
         this.l = ChangeSubscriber.without(this.l, var1, var2, true);
         if (this.l == null) {
            this.W.lithium$unsubscribe(this);
         }
      }
   }

   public boolean lithium$isSubscribedWithData(ChangeSubscriber var1, int var2) {
      if (this.R()) {
         throw new IllegalStateException("Cannot be subscribed to an empty ItemStack!");
      } else {
         return ChangeSubscriber.containsSubscriber(this.l, this.d, var1, var2);
      }
   }
}
