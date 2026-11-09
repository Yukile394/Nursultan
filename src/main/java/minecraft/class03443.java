package minecraft;

import Nursultan.class09355;
import Nursultan.class10950;
import Nursultan.class11373;
import Nursultan.class11375;
import Nursultan.class11382;
import Nursultan.class11393;
import Nursultan.class11799;
import Nursultan.class11938;
import baritone.utils.accessor.IPlayerControllerMP;
import com.google.common.collect.Lists;
import com.google.common.primitives.Shorts;
import com.google.common.primitives.SignedBytes;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.features.interaction.r1_18_2_block_ack_emulation.ClientPlayerInteractionManager1_18_2;
import com.viaversion.viafabricplus.features.interaction.replace_block_placement_logic.ActionResultException1_12_2;
import com.viaversion.viafabricplus.injection.access.interaction.r1_18_2_block_ack_emulation.IMultiPlayerGameMode;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion.ViaFabricPlusHandItemProvider;
import com.viaversion.viafabricplus.protocoltranslator.translator.ItemTranslator;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.client.player.ClientPlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.client.player.ClientPlayerBlockBreakEvents.After;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import org.spongepowered.asm.synthetic.args.ArgsN5;

@Environment(EnvType.CLIENT)
public class class03443 implements class11799, IPlayerControllerMP, IMultiPlayerGameMode {
   private static final Logger u = LogUtils.getLogger();
   private final class06202 i;
   private final class01683 R;
   private class07209 M;
   private class06584 B;
   public float N;
   private float Z;
   public int y;
   public boolean L;
   private class07282 z;
   @Nullable
   private class07282 U;
   private int E;
   private int W;
   private class11375 m;
   private class06584 P;
   private List s;
   private final ClientPlayerInteractionManager1_18_2 T = new ClientPlayerInteractionManager1_18_2();

   private boolean L(class07209 var1, class07211 var2) {
      var1 = var1.method_10093(var2);
      if (((class03448)this.i.T_3).method_8320(var1).i() == class00869.Lc) {
         ((class03448)this.i.T_3).method_8444((class04453)this.i.T_4, 1009, var1, 0);
         ((class03448)this.i.T_3).method_8650(var1, false);
         return true;
      } else {
         return false;
      }
   }

   private void L(class04453 var1, class07050 var2, class06183 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         class06584 class06584 = var1.method_5998(var2);
         class06183 class06183 = var3;
         if (class06584.B() instanceof class06918) {
            class00500 class00500 = ((class03448)this.i.T_3).method_8320(var3.u());
            if (class00500.i().equals(class00869.is) && class00500.L(class06999.L) == 1) {
               class06183 = var3.N(class07211.field_11036);
            }

            class06501 class06501x = new class06501(var1, var2, class06183);
            class06942 class06942 = new class06942(class06501x);
            if (!class06942.N() || ((class06918)class06942.method_8041().B()).u(class06942) == null) {
               throw new ActionResultException1_12_2(class07082.i);
            }
         }

         this.R.N(new class07828(var2, var3, 0));
         if (class06584.R()) {
            throw new ActionResultException1_12_2(class07082.i);
         } else {
            class06501 class06501 = new class06501(var1, var2, class06183);
            Object object;
            if (this.z.R()) {
               int ix = class06584.c();
               object = class06584.N(class06501);
               class06584.i(ix);
            } else {
               object = class06584.N(class06501);
            }

            if (!((class07082)object).N()) {
               object = class07082.i;
            }

            throw new ActionResultException1_12_2((class07082)object);
         }
      }
   }

   private void L(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_17, ProtocolVersion.v1_20_5)) {
         this.R
            .N(
               new class00564(
                  var1.method_23317(), var1.method_23318(), var1.method_23321(), var1.method_36454(), var1.method_36455(), var1.method_24828(), var1.field_5976
               )
            );
      }
   }

   public void L() {
      if (this.N(this)) {
         class00500 class00500 = ((class03448)this.i.T_3).method_8320(this.M);
         this.i.yT().N((class03448)this.i.T_3, this.M, class00500, -1.0F);
         if (class07529.C) {
            u.info("Stop dest {} {}", this.M, class00500);
         }

         class01683 class01683 = this.R;
         class07364 class07364 = this.N(class07356.field_12971, this.M, class07211.field_11033);
         if (class07364 == null) {
            throw new NullPointerException(
               "@Redirect constructor handler net/minecraft/class_636::trackPlayerAction returned null for net.minecraft.class_2846"
            );
         }

         class07364 class07364x = class07364;
         class01683 class01683x = class01683;
         if (this.y(class01683x, class07364x)) {
            class01683x.N(class07364x);
         }

         this.L = false;
         this.N = 0.0F;
         ((class03448)this.i.T_3).method_8517(((class04453)this.i.T_4).method_5628(), this.M, -1);
         class04453 class04453 = (class04453)this.i.T_4;
         if (this.N(class04453)) {
            class04453.method_7350();
         }
      }
   }

   private void L(class07209 var1, class07211 var2, CallbackInfoReturnable var3) {
      class07082 class07082 = ((AttackBlockCallback)AttackBlockCallback.EVENT.invoker())
         .interact((class04453)this.i.T_4, (class03448)this.i.T_3, class07050.field_5808, var1, var2);
      if (class07082 != class07082.i) {
         var3.setReturnValue(class07082 == class07082.N);
         if (class07082.N()) {
            this.N((class03448)this.i.T_3, var2x -> new class07364(class07356.field_12968, var1, var2, var2x));
         }
      }
   }

   private void L(class08036 var1, class07049 var2, CallbackInfo var3) {
      class11373 class11373 = class11373.N(var2);
      class11938.L().L(class11373);
   }

   public boolean M() {
      return !this.z.R();
   }

   public class11375 P() {
      return this.m;
   }

   public class03443(class06202 var1, class01683 var2) {
      super();
      this.M = new class07209(-1, -1, -1);
      this.B = class06584.E;
      this.z = class07282.field_28045;
      this.i = var1;
      this.R = var2;
   }

   public boolean B() {
      return ((class04453)this.i.T_4).method_5765() && ((class04453)this.i.T_4).method_5854() instanceof class03969;
   }

   public boolean Z() {
      return this.z == class07282.field_9219;
   }

   private void i(class07209 var1, class07211 var2, CallbackInfoReturnable var3) {
      class09355 class09355 = class09355.N(var1, var2);
      class11938.L().L(class09355);
      if (class09355.y()) {
         var3.setReturnValue(false);
      }
   }

   public final void i() {
      int ix = ((class04453)this.i.T_4).method_31548().N();
      if (ix != this.E) {
         this.E = ix;
         this.R.N(new class07335(this.E));
      }
   }

   private class07041 s() {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) ? class07082.N : class07082.L;
   }

   public class06202 m() {
      return this.i;
   }

   public class07282 U() {
      return this.z;
   }

   @Nullable
   public class07282 z() {
      return this.U;
   }

   public void u() {
      this.N(null);
      this.i();
      if (this.R.M().method_10758()) {
         this.R.M().method_10754();
      } else {
         this.R.M().method_10768();
      }
   }

   private void u(class04453 var1, class07050 var2, class06183 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && !class07050.field_5808.equals(var2)) {
         var4.setReturnValue(class07082.i);
      }
   }

   private void u(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && !class07050.field_5808.equals(var2)) {
         var3.setReturnValue(class07082.i);
      }
   }

   private void u(class07209 var1, class07211 var2, CallbackInfoReturnable var3) {
      class09355 class09355 = class09355.N(var1, var2);
      class11938.L().L(class09355);
      if (class09355.y()) {
         var3.setReturnValue(false);
      }
   }

   private void y(CallbackInfoReturnable var1) {
      if (VisualSettings.INSTANCE.hideModernHUDElements.isEnabled()) {
         var1.setReturnValue(false);
      }
   }

   public boolean y(class07209 var1, class07211 var2) {
      CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
      this.i(var1, var2, callbackinforeturnable1);
      if (callbackinforeturnable1.isCancelled()) {
         return callbackinforeturnable1.getReturnValueZ();
      } else {
         this.i();
         if (this.y > 0) {
            this.y--;
            return true;
         } else {
            class04453 class04453 = (class04453)this.i.T_4;
            CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
            this.y(var1, var2, callbackinforeturnable);
            if (callbackinforeturnable.isCancelled()) {
               return callbackinforeturnable.getReturnValueZ();
            } else if (class04453.method_31549().u && ((class03448)this.i.T_3).method_8621().N(var1)) {
               this.y = 5;
               class00500 class00500 = ((class03448)this.i.T_3).method_8320(var1);
               this.i.yT().N((class03448)this.i.T_3, var1, class00500, 1.0F);
               if (class07529.C) {
                  u.info("Creative cont {} {}", var1, class00500);
               }

               this.N((class03448)this.i.T_3, var3x -> {
                  LocalRefImpl localrefimpl = new LocalRefImpl();
                  localrefimpl.init(var2);
                  this.N(this, var1, localrefimpl);
                  var2 = (class07211)localrefimpl.dispose();
                  return new class07364(class07356.field_12968, var1, var2, var3x);
               });
               return true;
            } else if (this.y(var1)) {
               class00500 class00500x = ((class03448)this.i.T_3).method_8320(var1);
               if (class00500x.P()) {
                  this.L = false;
                  return false;
               } else {
                  this.N = this.N + class00500x.N((class04453)this.i.T_4, ((class04453)this.i.T_4).method_73183(), var1);
                  if (this.Z % 4.0F == 0.0F) {
                     class07752 class07752 = class00500x.O();
                     this.i
                        .Nr()
                        .N(new class00040(class07752.R(), class04911.field_15245, (class07752.N() + 1.0F) / 8.0F, class07752.y() * 0.5F, class00044.v(), var1));
                  }

                  this.Z++;
                  this.i.yT().N((class03448)this.i.T_3, var1, class00500x, class04995.N(this.N, 0.0F, 1.0F));
                  if (this.N >= 1.0F) {
                     this.L = false;
                     if (class07529.C) {
                        u.info("Finished breaking {} {}", var1, class00500x);
                     }

                     this.N((class03448)this.i.T_3, var3x -> {
                        this.N(var1);
                        return new class07364(class07356.field_12973, var1, var2, var3x);
                     });
                     this.N = 0.0F;
                     this.Z = 0.0F;
                     this.y = 5;
                  }

                  ((class03448)this.i.T_3).method_8517(((class04453)this.i.T_4).method_5628(), this.M, this.W());
                  return true;
               }
            } else {
               return this.N(var1, var2);
            }
         }
      }
   }

   public boolean y() {
      return this.z.M();
   }

   private void y(class00539 var1) {
      class06584 class06584;
      if (this.N(var1.M(), var1.L())) {
         class06584 = class06584.E;
      } else if (var1.L() >= 0 && var1.L() < this.s.size()) {
         class06584 = (class06584)this.s.get(var1.L());
      } else {
         class06584 = this.P;
      }

      PacketWrapper packetwrapper = PacketWrapper.create(ServerboundPackets1_16_2.CONTAINER_CLICK, ProtocolTranslator.getPlayNetworkUserConnection());
      packetwrapper.write(Types.BYTE, (byte)var1.N());
      packetwrapper.write(Types.SHORT, var1.L());
      packetwrapper.write(Types.BYTE, var1.u());
      packetwrapper.write(
         Types.SHORT, ((class07482)((class04453)this.i.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).viaFabricPlus$incrementAndGetActionId()
      );
      packetwrapper.write(Types.VAR_INT, var1.M().ordinal());
      packetwrapper.write(Types.ITEM1_13_2, ItemTranslator.mcToVia(class06584, ProtocolVersion.v1_16_4));
      packetwrapper.scheduleSendToServer(Protocol1_16_4To1_17.class);
      this.P = null;
      this.s = null;
   }

   public void y(class07209 var1, class07211 var2, CallbackInfoReturnable var3) {
      if (((class04453)this.i.T_4).method_31549().u) {
         this.L(var1, var2, var3);
      }
   }

   public void y(class08036 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.i();
         this.R.N(new class07364(class07356.field_12974, class07209.field_10980, class07211.field_11033));
         var1.method_6075();
      }
   }

   private void y(class04453 var1, class07050 var2, class06183 var3, CallbackInfoReturnable var4) {
      class11393 class11393 = class11393.N(var2, var3);
      class11938.L().L(class11393);
      if (class11393.y()) {
         var4.setReturnValue(class07082.i);
      }
   }

   private boolean y(class01683 var1, class00381 var2) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6) || this.L;
   }

   private void y(class08036 var1, class07049 var2, CallbackInfo var3) {
      class11382 class11382 = class11382.y(var2);
      class11938.L().L(class11382);
      if (class11382.y()) {
         var3.cancel();
      } else {
         this.W = 0;
      }
   }

   private void y(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      this.m = class11375.N(var2, var1.method_36454(), var1.method_36455());
      class11938.L().L(this.m);
      if (this.m.y()) {
         var3.setReturnValue(class07082.i);
      }
   }

   private class07082 y(class04453 var1, class07050 var2, class06183 var3) {
      class07209 class07209 = var3.u();
      class06584 class06584 = var1.method_5998(var2);
      if (this.z == class07282.field_9219) {
         return this.s();
      } else {
         boolean flag = !var1.method_6047().R() || !var1.method_6079().R();
         if (!var1.method_21823() || !flag) {
            class00500 class00500 = ((class03448)this.i.T_3).method_8320(class07209);
            if (!this.R.N(class00500.i().method_45322())) {
               return class07082.u;
            }

            class07082 class07082xx = class00500.N(var1.method_5998(var2), (class03448)this.i.T_3, var1, var2, var3);
            if (class07082xx.N()) {
               return class07082xx;
            }

            if (class07082xx instanceof class07087 && var2 == class07050.field_5808) {
               class07082 class07082x = class00500.N((class03448)this.i.T_3, var1, var3);
               if (class07082x.N()) {
                  return class07082x;
               }
            }
         }

         this.L(var1, var2, var3, null);
         if (!class06584.R() && !var1.method_7357().N(class06584)) {
            class06501 class06501 = new class06501(var1, var2, var3);
            class07082 class07082x;
            if (var1.method_56992()) {
               int ix = class06584.c();
               class07082x = class06584.N(class06501);
               class06584.i(ix);
            } else {
               class07082x = class06584.N(class06501);
            }

            return class07082x;
         } else {
            return class07082.i;
         }
      }
   }

   private boolean y(class07209 var1) {
      class06584 class06584x = ((class04453)this.i.T_4).method_6047();
      if (var1.equals(this.M)) {
         class06584 class06584x = this.B;
         if (this.N(class06584x, class06584x)) {
            return true;
         }
      }

      return false;
   }

   public boolean E() {
      return this.L;
   }

   private void N(Args var1) {
      var1.set(2, this.m.L());
      var1.set(3, this.m.u());
   }

   private boolean N(class01683 var1, class00381 var2) {
      class00539 class00539 = (class00539)var2;
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
         this.y(class00539);
         return false;
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         this.N(class00539);
         return false;
      } else {
         return true;
      }
   }

   private boolean N(class03443 var1, class07209 var2, LocalRef var3) {
      return this.N(var1, var2, (class07211)var3.get());
   }

   private List N(List var1) {
      this.P = ((class07482)((class04453)this.i.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M().t();
      return this.s = var1;
   }

   @Override
   public int N() {
      return this.W;
   }

   private void N(class08036 var1, CallbackInfo var2) {
      class10950 class10950 = class10950.L();
      class11938.L().L(class10950);
      if (class10950.y()) {
         var2.cancel();
      }
   }

   private class07082 N(class06584 var1, class07299 var2, class08036 var3, class07050 var4, LocalRef var5) {
      return this.N(var1, var2, var3, var4, (class06584)var5.get());
   }

   private class07082 N(class06584 var1, class07299 var2, class08036 var3, class07050 var4, class06584 var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         int ix = var1.c();
         class07082 class07082 = var1.N(var2, var3, var4);
         class06584 class06584;
         if (class07082 instanceof class07041 class07041) {
            class06584 = Objects.requireNonNullElseGet(class07041.u(), () -> var3.method_5998(var4));
         } else {
            class06584 = var3.method_5998(var4);
         }

         boolean flag = !class06584.R() && (class06584 != var5 || class06584.c() != ix);
         if (class07082.N() == flag) {
            return class07082;
         } else {
            return (class07082)(flag ? class07082.N.N(class06584) : class07082.i);
         }
      } else {
         return var1.N(var2, var3, var4);
      }
   }

   private void N(class07209 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_3)) {
         this.M = new class07209(this.M.method_10263(), -1, this.M.method_10260());
      }
   }

   private boolean N(class03443 var1, class07209 var2, class07211 var3) {
      return !ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2) ? var1.N(var2) : !this.L(var2, var3) && var1.N(var2);
   }

   private boolean N(class03443 var1, class03448 var2, class01924 var3, class08036 var4, class07050 var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18_2)) {
         this.R.N(new class07843(var5, 0, var4.method_36454(), var4.method_36455()));
         var3.predict(0);
         return false;
      } else {
         return true;
      }
   }

   private boolean N(class03443 var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6) || var1.E();
   }

   private void N(class03443 var1, class03448 var2, class01924 var3) {
      try {
         this.N(var2, var3);
      } catch (ActionResultException1_12_2 actionresultexception1_12_2) {
      }
   }

   private class00381 N(MutableObject var1, class04453 var2, class07050 var3, class06183 var4, int var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         ViaFabricPlusHandItemProvider.lastUsedItem = var2.method_5998(var3).t();
      }

      try {
         var1.setValue(this.y(var2, var3, var4));
         return new class07828(var3, var4, var5);
      } catch (ActionResultException1_12_2 actionresultexception1_12_2) {
         var1.setValue(actionresultexception1_12_2.getActionResult());
         throw actionresultexception1_12_2;
      }
   }

   private void N(class07050 var1, class08036 var2, MutableObject var3, int var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         ViaFabricPlusHandItemProvider.lastUsedItem = var2.method_5998(var1).t();
      }
   }

   private void N(class03448 var1, class01924 var2, CallbackInfo var3) {
      if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_14_4, ProtocolVersion.v1_18_2) && var2 instanceof class07364 class07364) {
         this.T.trackPlayerAction(class07364.L(), class07364.N());
      }
   }

   private boolean N(class07510 var1, int var2) {
      if (var1 == class07510.field_7789) {
         return true;
      } else if (var1 == class07510.field_7795) {
         return true;
      } else {
         return var1 == class07510.field_7794 && ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_11_1)
            ? true
            : var1 == class07510.field_7790 && var2 == -999;
      }
   }

   private void N(class00539 var1) {
      PacketWrapper packetwrapper = PacketWrapper.create(ServerboundPackets1_21_4.CONTAINER_CLICK, ProtocolTranslator.getPlayNetworkUserConnection());
      packetwrapper.write(Types.VAR_INT, var1.N());
      packetwrapper.write(Types.VAR_INT, var1.y());
      packetwrapper.write(Types.SHORT, var1.L());
      packetwrapper.write(Types.BYTE, var1.u());
      packetwrapper.write(Types.VAR_INT, var1.M().N());
      Int2ObjectMap<class00176> int2objectmap = var1.B();
      packetwrapper.write(Types.VAR_INT, int2objectmap.size());
      ObjectIterator<Entry<class00176>> objectiterator = int2objectmap.int2ObjectEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         class06584 class06584x = ((class07482)((class04453)this.i.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).T.get(entry.getIntKey()).i();
         packetwrapper.write(Types.SHORT, (short)entry.getIntKey());
         packetwrapper.write(VersionedTypes.V1_21_4.item, ItemTranslator.mcToVia(class06584x, ProtocolVersion.v1_21_4));
      }

      class06584 class06584 = ((class07482)((class04453)this.i.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).M();
      packetwrapper.write(VersionedTypes.V1_21_4.item, ItemTranslator.mcToVia(class06584, ProtocolVersion.v1_21_4));
      packetwrapper.scheduleSendToServer(Protocol1_21_4To1_21_5.class);
   }

   private void N(int var1, int var2, int var3, class07510 var4, class08036 var5, CallbackInfo var6) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_5tob1_5_2) && !var4.equals(class07510.field_7790)) {
         var6.cancel();
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7)
         && !var4.equals(class07510.field_7790)
         && !var4.equals(class07510.field_7794)
         && !var4.equals(class07510.field_7791)
         && !var4.equals(class07510.field_7796)) {
         var6.cancel();
      }

      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2) && var4 == class07510.field_7791 && var3 == 40) {
         var6.cancel();
      }
   }

   private class07364 N(class07356 var1, class07209 var2, class07211 var3) {
      if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_14_4, ProtocolVersion.v1_18_2)) {
         this.T.trackPlayerAction(var1, var2);
      }

      return new class07364(var1, var2, var3);
   }

   private boolean N(class04453 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_7_6) || this.L;
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_4)) {
         var1.setReturnValue((int)(this.N * 10.0F) - 1);
      }
   }

   public void N(int var1, int var2, int var3, class07510 var4, class08036 var5) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class07482 class07482 = (class07482)var5.fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
         if (var1 != class07482.b) {
            u.warn("Ignoring click in mismatching container. Click in {}, player has {}.", var1, class07482.b);
         } else {
            class00743<class06937> class00743 = class07482.T;
            int ix = class00743.size();
            ArrayList arraylist = Lists.newArrayListWithCapacity(ix);
            List list = this.N(arraylist);

            for (class06937 class06937 : class00743) {
               list.add(class06937.i().t());
            }

            class07482.N(var2, var3, var4, var5);
            Int2ObjectOpenHashMap int2objectopenhashmap = new Int2ObjectOpenHashMap();

            for (int j = 0; j < ix; j++) {
               class06584 class06584x = (class06584)list.get(j);
               class06584 class06584x = class00743.get(j).i();
               if (!class06584.N(class06584x, class06584x)) {
                  int2objectopenhashmap.put(j, class00176.y(class06584x, this.R.Q()));
               }
            }

            class00176 class00176 = class00176.y(class07482.M(), this.R.Q());
            class01683 class01683x = this.R;
            class00539 class00539 = new class00539(
               var1, class07482.z(), Shorts.checkedCast(var2), SignedBytes.checkedCast(var3), var4, int2objectopenhashmap, class00176
            );
            class01683 class01683x = class01683x;
            if (this.N(class01683x, class00539)) {
               class01683x.N(class00539);
            }
         }
      }
   }

   public class07082 N(class08036 var1, class07049 var2, class06145 var3, class07050 var4) {
      this.i();
      class06889 class06889 = var3.y().N(var2.method_23317(), var2.method_23318(), var2.method_23321());
      this.R.N(class00556.N(var2, var1.method_5715(), var4, class06889));
      return (class07082)(this.z == class07282.field_9219 ? class07082.i : var2.method_5664(var1, class06889, var4));
   }

   public class07082 N(class08036 var1, class07049 var2, class07050 var3) {
      this.i();
      this.R.N(class00556.N(var2, var1.method_5715(), var3));
      return (class07082)(this.z == class07282.field_9219 ? class07082.i : var1.method_7287(var2, var3));
   }

   public void N(class08036 var1, class07049 var2) {
      CallbackInfo callbackinfo1 = new CallbackInfo("", true);
      this.y(var1, var2, callbackinfo1);
      if (!callbackinfo1.isCancelled()) {
         this.i();
         class01683 class01683 = this.R;
         class00556 class00556 = class00556.N(var2, var1.method_5715());
         CallbackInfo callbackinfo = new CallbackInfo("", true);
         this.N(var1, var2, callbackinfo);
         if (!callbackinfo.isCancelled()) {
            class01683.N(class00556);
            if (this.z != class07282.field_9219) {
               var1.method_5997(var2);
               var1.method_7350();
            }

            this.L(var1, var2, null);
         }
      }
   }

   public class04453 N(class03448 var1, class01205 var2, class01756 var3, class08687 var4, boolean var5) {
      return new class04453(this.i, var1, this.R, var2, var3, var4, var5);
   }

   public void N(class08172 var1) {
      this.i();
      this.R.N(new class07364(class07356.field_63165, class07209.field_10980, class07211.field_11033));
      ((class04453)this.i.T_4).method_75124();
      ((class04453)this.i.T_4).method_75125();
      var1.N((class04453)this.i.T_4);
   }

   public void N(class06584 var1) {
      boolean flag = (class05096)this.i.v_3 instanceof class01463 && !((class05096)this.i.v_3 instanceof class01488);
      if (((class04453)this.i.T_4).method_56992() && !flag && !var1.R() && this.R.N(var1.B().method_45322())) {
         this.R.N(new class07346(-1, var1));
         ((class04453)this.i.T_4).s().N();
      }
   }

   public void N(class06584 var1, int var2) {
      if (((class04453)this.i.T_4).method_56992() && this.R.N(var1.B().method_45322())) {
         this.R.N(new class07346(var2, var1));
      }
   }

   public void N(int var1, int var2) {
      this.R.N(new class00546(var1, var2));
   }

   public void N(int var1, class00329 var2, boolean var3) {
      this.R.N(new class07378(var1, var2, var3));
   }

   public boolean N(class07209 var1, class07211 var2) {
      CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
      this.u(var1, var2, callbackinforeturnable1);
      if (callbackinforeturnable1.isCancelled()) {
         return callbackinforeturnable1.getReturnValueZ();
      } else if (((class04453)this.i.T_4).method_21701((class03448)this.i.T_3, var1, this.z)) {
         return false;
      } else if (!((class03448)this.i.T_3).method_8621().N(var1)) {
         return false;
      } else {
         class04453 class04453 = (class04453)this.i.T_4;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         this.N(var1, var2, callbackinforeturnable);
         if (callbackinforeturnable.isCancelled()) {
            return callbackinforeturnable.getReturnValueZ();
         } else {
            if (class04453.method_31549().u) {
               class00500 class00500x = ((class03448)this.i.T_3).method_8320(var1);
               this.i.yT().N((class03448)this.i.T_3, var1, class00500x, 1.0F);
               if (class07529.C) {
                  u.info("Creative start {} {}", var1, class00500x);
               }

               this.N((class03448)this.i.T_3, var3x -> {
                  LocalRefImpl localrefimpl = new LocalRefImpl();
                  localrefimpl.init(var2);
                  this.N(this, var1, localrefimpl);
                  var2 = (class07211)localrefimpl.dispose();
                  return new class07364(class07356.field_12968, var1, var2, var3x);
               });
               this.y = 5;
            } else if (!this.L || !this.y(var1)) {
               if (this.L) {
                  if (class07529.C) {
                     u.info("Abort old break {} {}", var1, ((class03448)this.i.T_3).method_8320(var1));
                  }

                  class01683 class01683 = this.R;
                  class07364 class07364 = this.N(class07356.field_12971, this.M, var2);
                  if (class07364 == null) {
                     throw new NullPointerException(
                        "@Redirect constructor handler net/minecraft/class_636::trackPlayerAction returned null for net.minecraft.class_2846"
                     );
                  }

                  class01683.N(class07364);
               }

               class00500 class00500 = ((class03448)this.i.T_3).method_8320(var1);
               this.i.yT().N((class03448)this.i.T_3, var1, class00500, 0.0F);
               if (class07529.C) {
                  u.info("Start break {} {}", var1, class00500);
               }

               this.N((class03448)this.i.T_3, var4x -> {
                  boolean flag = !class00500.P();
                  if (flag && this.N == 0.0F) {
                     class00500.N((class03448)this.i.T_3, var1, (class04453)this.i.T_4);
                  }

                  if (flag && class00500.N((class04453)this.i.T_4, ((class04453)this.i.T_4).method_73183(), var1) >= 1.0F) {
                     this.N(var1);
                  } else {
                     this.L = true;
                     this.M = var1;
                     this.B = ((class04453)this.i.T_4).method_6047();
                     this.N = 0.0F;
                     this.Z = 0.0F;
                     ((class03448)this.i.T_3).method_8517(((class04453)this.i.T_4).method_5628(), this.M, this.W());
                  }

                  return new class07364(class07356.field_12968, var1, var2, var4x);
               });
            }

            return true;
         }
      }
   }

   public boolean N(class07209 var1) {
      if (((class04453)this.i.T_4).method_21701((class03448)this.i.T_3, var1, this.z)) {
         return false;
      } else {
         class03448 class03448 = (class03448)this.i.T_3;
         class00500 class00500 = class03448.method_8320(var1);
         if (!((class04453)this.i.T_4).method_6047().N(class00500, class03448, var1, (class04453)this.i.T_4)) {
            return false;
         } else {
            class00891 class00891 = class00500.i();
            if (class00891 instanceof class01137 && !((class04453)this.i.T_4).method_7338()) {
               return false;
            } else if (class00500.P()) {
               return false;
            } else {
               class00891.N(class03448, var1, class00500, (class08036)((class04453)this.i.T_4));
               class04688 class04688 = class03448.method_8316(var1);
               boolean flag = class03448.method_8652(var1, class04688.B(), 11);
               if (flag) {
                  this.N(var1, null, class00500);
                  class00891.N_7(class03448, var1, class00500);
               }

               if (class07529.C) {
                  u.error("client broke {} {} -> {}", new Object[]{var1, class00500, class03448.method_8320(var1)});
               }

               this.N(var1, null);
               return flag;
            }
         }
      }
   }

   public void N(class07282 var1) {
      if (var1 != this.z) {
         this.U = this.z;
      }

      this.z = var1;
      this.z.N(((class04453)this.i.T_4).method_31549());
   }

   public void N(class07282 var1, @Nullable class07282 var2) {
      this.z = var1;
      this.U = var2;
      this.z.N(((class04453)this.i.T_4).method_31549());
   }

   public void N(class08036 var1) {
      this.z.N(var1.method_31549());
   }

   public class04453 N(class03448 var1, class01205 var2, class01756 var3) {
      return this.N(var1, var2, var3, class08687.y, false);
   }

   public class07082 N(class08036 var1, class07050 var2) {
      CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
      this.y(var1, var2, callbackinforeturnable1);
      if (callbackinforeturnable1.isCancelled()) {
         return (class07082)callbackinforeturnable1.getReturnValue();
      } else {
         CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true);
         this.u(var1, var2, callbackinforeturnable2);
         if (callbackinforeturnable2.isCancelled()) {
            return (class07082)callbackinforeturnable2.getReturnValue();
         } else if (this.z == class07282.field_9219) {
            return class07082.i;
         } else {
            CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
            this.N(var1, var2, callbackinforeturnable);
            if (callbackinforeturnable.isCancelled()) {
               return (class07082)callbackinforeturnable.getReturnValue();
            } else {
               this.i();
               this.L(var1, var2, null);
               MutableObject mutableobject = new MutableObject();
               class03448 class03448x = (class03448)this.i.T_3;
               class01924 class01924 = var4x -> {
                  this.N(var2, var1, mutableobject, var4x, null);
                  ArgsN5 argsn5 = ArgsN5.of(var2, var4x, var1.method_36454(), var1.method_36455());
                  this.N(argsn5);
                  class07843 class07843 = new class07843(argsn5.$0(), argsn5.$1(), argsn5.$2(), argsn5.$3());
                  class06584 class06584x = var1.method_5998(var2);
                  if (var1.method_7357().N(class06584x)) {
                     mutableobject.setValue(class07082.i);
                     return class07843;
                  } else {
                     class03448 class03448xx = (class03448)this.i.T_3;
                     LocalRefImpl localrefimpl = new LocalRefImpl();
                     localrefimpl.init(class06584x);
                     class07082 class07082 = this.N(class06584x, class03448xx, var1, var2, localrefimpl);
                     class06584x = (class06584)localrefimpl.dispose();
                     class07082 class07082x = class07082;
                     class06584 class06584x;
                     if (class07082x instanceof class07041) {
                        class06584x = Objects.requireNonNullElseGet(((class07041)class07082x).u(), () -> var1.method_5998(var2));
                     } else {
                        class06584x = var1.method_5998(var2);
                     }

                     if (class06584x != class06584x) {
                        var1.method_6122(var2, class06584x);
                     }

                     mutableobject.setValue(class07082x);
                     return class07843;
                  }
               };
               class03448 class03448x = class03448x;
               if (this.N(this, class03448x, class01924, var1, var2)) {
                  this.N(class03448x, class01924);
               }

               return (class07082)mutableobject.get();
            }
         }
      }
   }

   public class07082 N(class04453 var1, class07050 var2, class06183 var3) {
      CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
      this.y(var1, var2, var3, callbackinforeturnable1);
      if (callbackinforeturnable1.isCancelled()) {
         return (class07082)callbackinforeturnable1.getReturnValue();
      } else {
         CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true);
         this.u(var1, var2, var3, callbackinforeturnable2);
         if (callbackinforeturnable2.isCancelled()) {
            return (class07082)callbackinforeturnable2.getReturnValue();
         } else {
            this.i();
            if (!((class03448)this.i.T_3).method_8621().N(var3.u())) {
               return class07082.u;
            } else {
               MutableObject mutableobject = new MutableObject();
               class03448 class03448x = (class03448)this.i.T_3;
               class01924 class01924x = this::N;
               CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
               this.N(var1, var2, var3, callbackinforeturnable);
               if (callbackinforeturnable.isCancelled()) {
                  return (class07082)callbackinforeturnable.getReturnValue();
               } else {
                  class01924 class01924x = class01924x;
                  class03448 class03448x = class03448x;
                  this.N(this, class03448x, class01924x);
                  return (class07082)mutableobject.get();
               }
            }
         }
      }
   }

   public final void N(class03448 var1, class01924 var2) {
      this.N(var1, var2, null);

      try (class01909 class01909 = var1.u().method_41937()) {
         int ix = class01909.method_41942();
         class00381<class08051> class00381 = var2.predict(ix);
         this.R.N(class00381);
      }
   }

   private boolean N(class06584 var1, class06584 var2) {
      boolean flag = class06584.L(var1, this.B);
      if (!flag) {
         class06584 class06584x = this.B;
         class06584 class06584x = ((class04453)this.i.T_4).method_6047();
         if (class06584x.N(class06584x.B()) && class06584x.B().allowContinuingBlockBreaking((class04453)this.i.T_4, class06584x, class06584x)) {
            flag = true;
         }
      }

      return flag;
   }

   private void N(class07209 var1, CallbackInfoReturnable var2, class00500 var3) {
      ((After)ClientPlayerBlockBreakEvents.AFTER.invoker()).afterBlockBreak((class03448)this.i.T_3, (class04453)this.i.T_4, var1, var3);
   }

   public void N(class07209 var1, class07211 var2, CallbackInfoReturnable var3) {
      this.L(var1, var2, var3);
   }

   public void N(class08036 var1, class07049 var2, CallbackInfo var3) {
      class07082 class07082 = ((AttackEntityCallback)AttackEntityCallback.EVENT.invoker())
         .interact(var1, var1.method_73183(), class07050.field_5808, var2, null);
      if (class07082 != class07082.i) {
         if (class07082 == class07082.N) {
            this.R.N(class00556.N(var2, var1.method_5715()));
         }

         var3.cancel();
      }
   }

   public void N(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      class07082 class07082 = ((UseItemCallback)UseItemCallback.EVENT.invoker()).interact(var1, var1.method_73183(), var2);
      if (class07082 != class07082.i) {
         if (class07082 == class07082.N) {
            this.N((class03448)var1.method_73183(), var2x -> new class07843(var2, var2x, var1.method_36454(), var1.method_36455()));
         }

         var3.setReturnValue(class07082);
      }
   }

   public void N(class07049 var1, boolean var2) {
      this.R.N(new class00285(var1.method_5628(), var2));
   }

   public void N(class07209 var1, boolean var2) {
      this.R.N(new class00328(var1, var2));
   }

   private void N(CallbackInfo var1) {
      this.W++;
   }

   public void N(class04453 var1, class07050 var2, class06183 var3, CallbackInfoReturnable var4) {
      if (!var1.method_7325()) {
         class07082 class07082 = ((UseBlockCallback)UseBlockCallback.EVENT.invoker()).interact(var1, var1.method_73183(), var2, var3);
         if (class07082 != class07082.i) {
            if (class07082.N()) {
               this.N((class03448)var1.method_73183(), var2x -> new class07828(var2, var3, var2x));
            }

            var4.setReturnValue(class07082);
         }
      }
   }

   public void N(int var1, int var2, boolean var3) {
      this.R.N(new class01735(var1, var2, var3));
   }

   public int W() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueI();
      } else {
         return this.N > 0.0F ? (int)(this.N * 10.0F) : -1;
      }
   }

   public boolean R() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : this.z.M();
   }

   public ClientPlayerInteractionManager1_18_2 viaFabricPlus$get1_18_2InteractionManager() {
      return this.T;
   }
}
