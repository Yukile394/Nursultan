package minecraft;

import Nursultan.class09350;
import Nursultan.class09503;
import Nursultan.class10401;
import Nursultan.class10406;
import Nursultan.class10511;
import Nursultan.class10626;
import Nursultan.class10958;
import Nursultan.class10963;
import Nursultan.class11387;
import Nursultan.class11938;
import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.BlockChangeEvent;
import baritone.api.event.events.ChatEvent;
import baritone.api.event.events.ChunkEvent;
import baritone.api.event.events.ChunkEvent.Type;
import baritone.api.event.events.type.EventState;
import baritone.api.utils.Pair;
import baritone.cache.CachedChunk;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.hash.HashCode;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.features.block.connections.BlockConnectionsEmulation1_12_2;
import com.viaversion.viafabricplus.injection.access.networking.downloading_terrain.ILevelLoadingScreen;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.visuals.features.r1_7_tab_list_style.LegacyTabList;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.connection.ConnectionDetails;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.lang.ref.WeakReference;
import java.time.Instant;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents.Unload;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.AllowChat;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.AllowCommand;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.Chat;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.ChatCanceled;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.Command;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.CommandCanceled;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.ModifyChat;
import net.fabricmc.fabric.api.client.message.v1.ClientSendMessageEvents.ModifyCommand;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents.TagsLoaded;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.command.client.ClientCommandInternals;
import net.fabricmc.fabric.impl.command.client.ClientCommandInternals.LastReceivedCommandsPacketAccessor;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class01683 extends class01866 implements class03077, class07280, LastReceivedCommandsPacketAccessor, NetworkHandlerExtensions {
   private static final Logger m = LogUtils.getLogger();
   private static final class00392 P = class00392.L("multiplayer.unsecureserver.toast.title");
   private static final class00392 s = class00392.L("multiplayer.unsecureserver.toast");
   private static final class00392 T = class00392.L("multiplayer.disconnect.invalid_packet");
   private static final class00392 b = class00392.L("connect.reconfiguring");
   private static final class00392 j = class00392.L("multiplayer.disconnect.bad_chat_index");
   private static final class00392 v = class00392.L("multiplayer.confirm_command.title");
   private static final class00392 n = class00392.L("multiplayer.confirm_command.run_command");
   private static final class00392 t = class00392.L("multiplayer.confirm_command.suggest_command");
   private static final int G = 64;
   public static final int N = 64;
   private static final class08159 l = class08190.N("client/commands/restricted");
   static final class08164 y = new class08149(l);
   private static final class08152 d = var0 -> var0.equals(l);
   private static final class07263<class03461> w = new class01679();
   private final GameProfile k;
   private class03448 Y;
   private class03427 Q;
   private final Map<UUID, class03458> O;
   private Set<class03458> g;
   private final class01707 I;
   private final class03461 J;
   private final class03461 o;
   private final class06429 q;
   private int K;
   private int V;
   private final class06069 e;
   private CommandDispatcher<class03461> H;
   private class00290 c;
   private final UUID X;
   private Set<class05946<class07299>> a;
   private final class01022 p;
   private final class03767 F;
   private final class06511 A;
   private class02755 f;
   private final class00147 C;
   private OptionalInt S;
   @Nullable
   private class02018 x;
   private class03065 D;
   private int h;
   private class03046 r;
   private class03397 NN;
   @Nullable
   private CompletableFuture<Optional<class04450>> Ny;
   @Nullable
   private class03737 NL;
   private final class03722 Nu;
   private final class03717 Ni;
   private final class06963 NR;
   @Nullable
   private class05384 NM;
   private boolean NB;
   private volatile boolean NZ;
   private final class06683 Nz;
   private final class00057 NU;
   private final class08666 NE;
   private final List<WeakReference<class08546<?, ?>>> NW;
   private boolean Nm;
   private ClientPlayNetworkAddon NP;
   @Nullable
   private class07233 Ns = null;
   private class00381 NT;

   public class02755 w() {
      return this.f;
   }

   private void L(String var1, CallbackInfo var2) {
      StringReader stringreader = new StringReader(var1);
      if (stringreader.canRead() && stringreader.peek() == (Character)class10626.N_1) {
         stringreader.skip();
         class11938.Y().N(stringreader);
         var2.cancel();
      }
   }

   public void L(String var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(var1);
      this.N(var1, callbackinfo, localrefimpl);
      var1 = (String)localrefimpl.dispose();
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.N(var1, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            var1 = this.i(var1);
            CallbackInfo callbackinfo2 = new CallbackInfo("", true);
            this.L(var1, callbackinfo2);
            if (!callbackinfo2.isCancelled()) {
               Instant instant = Instant.now();
               long i = class05036.N();
               class03064 class03064 = this.r.y();
               class04469 class04469 = this.D.pack(new class03079(var1, instant, i, class03064.N()));
               this.N(new class00573(var1, instant, i, class04469, class03064.y()));
            }
         }
      }
   }

   private void L(class00481 var1, CallbackInfo var2) {
      ChunkTrackerHolder.get(this.Y).onChunkStatusRemoved(var1.N().B, var1.N().Z, 3);
   }

   private void L(CallbackInfo var1) {
      if (this.Y != null) {
         for (class07049 class07049 : this.Y.M()) {
            ((Unload)ClientEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(class07049, this.Y);
         }

         for (class00570 class00570 : this.Y.fabric_getLoadedChunks()) {
            for (class00394 class00394 : class00570.o().values()) {
               ((net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker())
                  .onUnload(class00394, this.Y);
            }
         }
      }
   }

   public class03461 L() {
      return this.J;
   }

   private void L(class00482 var1, CallbackInfo var2) {
      CommandDispatcher commanddispatcher = new CommandDispatcher();
      ClientCommandInternals.setActiveDispatcher(commanddispatcher);
      ((ClientCommandRegistrationCallback)ClientCommandRegistrationCallback.EVENT.invoker()).register(commanddispatcher, class04348.N(this.p, this.F));
      ClientCommandInternals.finalizeInit();
   }

   public class00642 M() {
      return this.u;
   }

   private class01690 M(String var1) {
      ParseResults<class03461> parseresults = this.H.parse(var1, this.J);
      if (!N(parseresults)) {
         return class01690.field_60787;
      } else if (class03039.N(parseresults)) {
         return class01690.field_60788;
      } else {
         return !N(this.H.parse(var1, this.o)) ? class01690.field_60789 : class01690.field_60786;
      }
   }

   public class03448 P() {
      return this.Y;
   }

   private void X() {
      if (!this.I()) {
         this.u.method_10743(new class08816());
         this.N(true);
      }
   }

   public UUID T() {
      return this.X;
   }

   public class00147 Q() {
      return this.C;
   }

   public class01683(class06202 var1, class00642 var2, class01892 var3) {
      super(var1, var2, var3);
      this.O = Maps.newHashMap();
      this.g = new ReferenceOpenHashSet();
      this.q = new class06429(this);
      this.K = 3;
      this.V = 3;
      this.e = class06069.i();
      this.H = new CommandDispatcher();
      this.c = new class00290(Map.of(), class00279.N());
      this.X = UUID.randomUUID();
      this.S = OptionalInt.empty();
      this.D = class03065.N;
      this.r = new class03046(20);
      this.NN = class03397.N();
      this.Nu = new class03722();
      this.Nz = new class06683();
      this.NU = new class00057();
      this.NE = new class08666();
      this.NW = new ArrayList<>();
      this.k = var3.y();
      this.p = var3.u();
      class03519 class03519 = this.p.N(class00166.L);
      this.C = var1x -> ((HashCode)var1x.N(class03519).getOrThrow(var1xx -> new IllegalArgumentException("Failed to hash " + var1x + ": " + var1xx))).asInt();
      this.F = var3.i();
      this.I = new class01707(var1, this.M);
      class08152 class08152 = var1x -> {
         class04453 class04453 = (class04453)var1.T_4;
         return class04453 != null && class04453.method_75004().hasPermission(var1x);
      };
      this.J = new class03461(this, var1, class08152.N(d));
      this.o = new class03461(this, var1, class08152.M);
      this.Ni = new class03717(this, var1.ND().z());
      this.NR = new class06963(this, var1.ND());
      if (var3.z() != null) {
         ((class01056)var1.i_6).i().N(var3.z());
      }

      this.A = class06511.N(this.F);
      this.f = class02755.N(var3.u(), this.F);
      this.NM = var3.N();
      this.y(null);
      this.N(var1, var2, var3, null);
   }

   public Collection<class03458> B() {
      return this.g;
   }

   public boolean I() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : this.Nm;
   }

   public ClientPlayNetworkAddon getAddon() {
      return this.NP;
   }

   public Collection<class03458> Z() {
      return this.O.values();
   }

   private void e() {
      Iterator<WeakReference<class08546<?, ?>>> iterator = this.NW.iterator();

      while (iterator.hasNext()) {
         class08546<?, ?> class08546 = iterator.next().get();
         if (class08546 != null) {
            class08546.N();
         }
      }

      this.NW.clear();
   }

   private void i(class00482 var1, CallbackInfo var2) {
      if ((class04453)class06202.Nq().T_4 != null) {
         Iris.getUpdateChecker().getUpdateMessage().ifPresent(var0 -> ((class04453)class06202.Nq().T_4).method_7353(var0, false));
         Iris.getStoredError()
            .ifPresent(
               var0 -> ((class04453)class06202.Nq().T_4)
                  .method_7353(
                     class00392.L(var0 instanceof ShaderCompileException ? "iris.load.failure.shader" : "iris.load.failure.generic")
                        .y(
                           class00392.y("Copy Info")
                              .N(
                                 var1x -> var1x.L(true)
                                    .N(class06541.field_1078)
                                    .N(new class00627(var0.getMessage()))
                                    .N(new class00401(class00392.L("chat.copy.click")))
                              )
                        ),
                     false
                  )
            );
         if (Iris.loadedIncompatiblePack()) {
            ((class01056)class06202.Nq().i_6).N(10, 70, 140);
            Iris.logger.warn("Incompatible pack for DH!");
            ((class04453)class06202.Nq().T_4)
               .method_7353(class00392.y("This pack doesn't have DH support.").N(class06541.field_1067, class06541.field_1061), false);
            ((class04453)class06202.Nq().T_4)
               .method_7353(class00392.y("Distant Horizons (DH) chunks won't show up. This isn't a bug, get another shader.").N(class06541.field_1061), false);
         }
      }
   }

   public String i(String var1) {
      class10958 class10958 = class10958.N(var1);
      class11938.L().L(class10958);
      return class10958.N();
   }

   public void i() {
      this.L(null);
      this.e();
      this.Y = null;
      this.NM = null;
   }

   public Set<class05946<class07299>> b() {
      return this.a;
   }

   public class06429 s() {
      return this.q;
   }

   private void c() {
      int i = this.r.N();
      if (i > 0) {
         this.N(new class03076(i));
      }
   }

   @Override
   protected class08781 n() {
      return new class09503(this);
   }

   public class06683 l() {
      return this.Nz;
   }

   public class06511 d() {
      return this.A;
   }

   public CommandDispatcher<class03461> m() {
      return this.H;
   }

   public void k() {
      this.NE.N();
   }

   @Nullable
   public class04568 t() {
      return this.i;
   }

   public class00457 g() {
      return this.NR.N(this.Y);
   }

   public void v() {
      this.Ny = this.L.c().N();
   }

   public class01022 j() {
      return this.p;
   }

   public Map<UUID, class03458> U() {
      return this.E;
   }

   public Collection<UUID> z() {
      return this.O.keySet();
   }

   public void u(String var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(var1);
      this.y(var1, callbackinfo, localrefimpl);
      var1 = (String)localrefimpl.dispose();
      if (!callbackinfo.isCancelled()) {
         CallbackInfo callbackinfo1 = new CallbackInfo("", true);
         this.y(var1, callbackinfo1);
         if (!callbackinfo1.isCancelled()) {
            var1 = this.R(var1);
            class03039<class03461> class03039 = class03039.y(this.H.parse(var1, this.J));
            List<class03067<class03461>> list = class03039.N();
            if (this.N(list)) {
               this.N(new class03961(var1));
            } else {
               Instant instant = Instant.now();
               long i = class05036.N();
               class03064 class03064 = this.r.y();
               class04455 class04455 = class04455.N(class03039, var5 -> {
                  class03079 class03079 = new class03079(var5, instant, i, class03064.N());
                  return this.D.pack(class03079);
               });
               this.N(new class02177(var1, instant, i, class04455, class03064.y()));
            }
         }
      }
   }

   public void u() {
      this.NZ = true;
      this.i();
      this.M.L();
   }

   private void u(class00482 var1, CallbackInfo var2) {
      if (this.Y != null) {
         for (class07049 class07049 : this.Y.M()) {
            ((Unload)ClientEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(class07049, this.Y);
         }

         for (class00570 class00570 : this.Y.fabric_getLoadedChunks()) {
            for (class00394 class00394 : class00570.o().values()) {
               ((net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker())
                  .onUnload(class00394, this.Y);
            }
         }
      }
   }

   private void y(CallbackInfo var1) {
      this.NP = new ClientPlayNetworkAddon(this, this.L);
      ClientNetworkingImpl.setClientPlayAddon(this.NP);
      this.NP.lateInit();
   }

   private void y(class00482 var1, CallbackInfo var2) {
      this.NP.onServerReady();
   }

   @Nullable
   public class03458 y(String var1) {
      for (class03458 class03458 : this.O.values()) {
         if (class03458.N().name().equalsIgnoreCase(var1)) {
            return class03458;
         }
      }

      return null;
   }

   private void y(String var1, CallbackInfo var2, LocalRef var3) {
      if (((AllowCommand)ClientSendMessageEvents.ALLOW_COMMAND.invoker()).allowSendCommandMessage((String)var3.get())) {
         var3.set(((ModifyCommand)ClientSendMessageEvents.MODIFY_COMMAND.invoker()).modifySendCommandMessage((String)var3.get()));
         ((Command)ClientSendMessageEvents.COMMAND.invoker()).onSendCommandMessage((String)var3.get());
      } else {
         ((CommandCanceled)ClientSendMessageEvents.COMMAND_CANCELED.invoker()).onSendCommandMessageCanceled((String)var3.get());
         var2.cancel();
      }
   }

   private void y(class01659 var1) {
      m.warn("Unknown custom packet payload: {}", var1.method_56479().N());
   }

   private void y(String var1, CallbackInfo var2) {
      if (ClientCommandInternals.executeCommand(var1)) {
         var2.cancel();
      }
   }

   private void y(class07233 var1, CallbackInfo var2) {
      this.Ns = var1;
   }

   private void y(class00481 var1, CallbackInfo var2) {
      for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
         class04453 class04453 = ibaritone.getPlayerContext().player();
         if (class04453 != null && (class01683)class04453.y_0 == this) {
            ibaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.POST, Type.UNLOAD, var1.N().B, var1.N().Z));
         }
      }
   }

   private void y(class04190 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
         this.u.field_11651.config().setAutoRead(true);
      }
   }

   private boolean y(class07049 var1) {
      if (!ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_3)
         && !ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         return var1.method_66247();
      } else {
         class07438 class07438 = var1.method_5642();
         return class07438 instanceof class08036 ? ((class08036)class07438).method_7340() : !var1.method_73183().method_8608();
      }
   }

   private boolean y(Logger var1, String var2, Object var3) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19_4);
   }

   private void y(String var1, String var2, @Nullable class05096 var3) {
      boolean flag = var3 == null && this.L.b().N(this.L.q());
      this.N(var1, var2, flag ? t : class05220.P, () -> {
         if (flag) {
            this.L.N(class06468.field_62005);
            class05096 class05096 = (class05096)this.L.v_3;
            if (class05096 instanceof class01311) {
               ((class01311)class05096).method_25415(var1, false);
            }
         } else {
            ((class06197)this.L.L_3).N("/" + var1);
            this.L.N(var3);
         }
      });
   }

   private void y(class06663 var1, CallbackInfo var2) {
      if (this.NT != null) {
         this.u.method_10743(this.NT);
         this.NT = null;
      }
   }

   private boolean y(class01683 var1) {
      return this.H() || VisualSettings.INSTANCE.disableSecureChatWarning.isEnabled();
   }

   private void y(String var1, class05096 var2, CallbackInfo var3) {
      StringReader stringreader = new StringReader(var1);
      if (stringreader.canRead() && stringreader.peek() == (Character)class10626.N_1) {
         stringreader.skip();
         class11938.Y().N(stringreader);
         var3.cancel();
         class06202.Nq().N(var2);
      }
   }

   private void y(class07259 var1, CallbackInfo var2) {
      BlockConnectionsEmulation1_12_2.updateChunkNeighborConnections(this.Y, var1.y());
   }

   @Nullable
   private class07049 y(class07276 var1) {
      class07078<?> class07078 = var1.L();
      if (class07078 == class07078.Ly) {
         class03458 class03458 = this.N(var1.y());
         if (class03458 == null) {
            m.warn("Server attempted to add player prior to sending player info (Player id {})", var1.y());
            return null;
         } else {
            return new class10401(this.Y, class03458.N());
         }
      } else {
         return class07078.N(this.Y, class06113.field_52444);
      }
   }

   private void y(class00481 var1) {
      class07321 class07321 = var1.N();
      this.Y.N((Runnable)(() -> {
         class05795 class05795 = this.Y.method_22336();
         class05795.N(class07321, false);

         for (int i = class05795.u(); i < class05795.i(); i++) {
            class01296 class01296 = class01296.N(class07321, i);
            class05795.N(class00772.field_9282, class01296, null);
            class05795.N(class00772.field_9284, class01296, null);
         }

         for (int jx = this.Y.method_32891(); jx <= this.Y.method_31597(); jx++) {
            class05795.N(class01296.N(class07321, jx), true);
         }
      }));
   }

   public GameProfile E() {
      return this.k;
   }

   @Override
   public void N(class03598 var1) {
      class00417.N(var1, this, this.L.B());

      for (class03590 class03590xx : var1.N()) {
         this.Y.method_8398().N(class03590xx.y().B, class03590xx.y().Z, class03590xx.N());
      }

      for (class03590 class03590x : var1.N()) {
         this.Y.N(new class07321(class03590x.y().B, class03590x.y().Z));
      }

      for (class03590 class03590 : var1.N()) {
         for (int i = -1; i <= 1; i++) {
            for (int jx = -1; jx <= 1; jx++) {
               for (int kx = this.Y.method_32891(); kx <= this.Y.method_31597(); kx++) {
                  ((class03063)this.L.B_2).N(class03590.y().B + i, kx, class03590.y().Z + jx);
               }
            }
         }
      }
   }

   private void N(String var1, CallbackInfo var2, LocalRef var3) {
      if (((AllowChat)ClientSendMessageEvents.ALLOW_CHAT.invoker()).allowSendChatMessage((String)var3.get())) {
         var3.set(((ModifyChat)ClientSendMessageEvents.MODIFY_CHAT.invoker()).modifySendChatMessage((String)var3.get()));
         ((Chat)ClientSendMessageEvents.CHAT.invoker()).onSendChatMessage((String)var3.get());
      } else {
         ((ChatCanceled)ClientSendMessageEvents.CHAT_CANCELED.invoker()).onSendChatMessageCanceled((String)var3.get());
         var2.cancel();
      }
   }

   @Override
   public void N(class00514 var1) {
      class00417.N(var1, this, this.L.B());
      int i = var1.N();
      int jx = var1.y();
      this.N(i, jx, var1.L());
      class01832 class01832 = var1.u();
      this.Y.N((Runnable)(() -> {
         this.N(i, jx, class01832, false);
         class00570 class00570 = this.Y.method_8398().N(i, jx, false);
         if (class00570 != null) {
            this.N(class00570, i, jx);
            ((class03063)this.L.B_2).N(class00570.R());
         }
      }));
      this.N_30(var1, null);
   }

   @Override
   public void N(class02582 var1) {
      class00417.N(var1, this, this.L.B());
      if (var1.N(this.Y) instanceof class07504 class07504) {
         class02736 class02736 = class07504.N();
         if (class02736 instanceof class02726) {
            ((class02726)class02736).i.addAll(var1.y());
         }
      }
   }

   @Override
   public void N(class07261 var1) {
      class00417.N(var1, this, this.L.B());
      var1.N((var1x, var2) -> this.Y.N(var1x, var2, 19));
      this.N_31(var1, null);
   }

   private void N(int var1, int var2, class01839 var3) {
      this.Y.method_8398().N(var1, var2, var3.N(), var3.y(), var3.N(var1, var2));
      this.N(var1, var2, var3, null);
   }

   @Override
   public void N(class06658 var1) {
      class00417.N(var1, this, this.L.B());
      var1.N().forEach(var1x -> {
         class07049 class07049 = this.Y.method_8469(var1x);
         if (class07049 != null) {
            if (class07049.method_5821((class04453)this.L.T_4)) {
               m.debug("Remove entity {}:{} that has player as passenger", class07049.method_5864(), var1x);
               this.S = OptionalInt.of(var1x);
            }

            this.Y.N(var1x, class07062.field_26999);
            this.NR.N(class07049);
         }
      });
   }

   private void N(class02675 var1, CallbackInfo var2) {
      for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
         class04453 class04453 = ibaritone.getPlayerContext().player();
         if (class04453 != null && (class01683)class04453.y_0 == this) {
            ibaritone.getGameEventHandler().onPlayerDeath();
         }
      }
   }

   private void N_31(class07261 var1, CallbackInfo var2) {
      IBaritone ibaritone = BaritoneAPI.getProvider().getBaritoneForConnection(this);
      if (ibaritone != null) {
         ArrayList arraylist = new ArrayList();
         var1.N((var1x, var2x) -> arraylist.add(new Pair(var1x.method_10062(), var2x)));
         if (!arraylist.isEmpty()) {
            ibaritone.getGameEventHandler().onBlockChange(new BlockChangeEvent(new class07321((class07209)((Pair)arraylist.get(0)).first()), arraylist));
         }
      }
   }

   private void N(class07233 var1, CallbackInfo var2) {
      ClientCommandInternals.addCommands(this.H, this.J);
   }

   @Override
   public void N(class06644 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = var1.N(this.Y);
      if (class07049 != null) {
         class07049.method_5683(var1.N(), 3);
      }
   }

   private void N(String var1, class05096 var2, CallbackInfo var3) {
      if (ClientCommandInternals.executeCommand(var1)) {
         var3.cancel();
      }
   }

   private void N_30(class00514 var1, CallbackInfo var2) {
      for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
         class04453 class04453 = ibaritone.getPlayerContext().player();
         if (class04453 != null && (class01683)class04453.y_0 == this) {
            ibaritone.getGameEventHandler()
               .onChunkEvent(new ChunkEvent(EventState.POST, !var1.i() ? Type.POPULATE_FULL : Type.POPULATE_PARTIAL, var1.N(), var1.y()));
         }
      }
   }

   private void N(String var1, CallbackInfo var2) {
      ChatEvent chatevent = new ChatEvent(var1);
      IBaritone ibaritone = BaritoneAPI.getProvider().getBaritoneForPlayer((class04453)this.L.T_4);
      if (ibaritone != null) {
         ibaritone.getGameEventHandler().onSendChatMessage(chatevent);
         if (chatevent.isCancelled()) {
            var2.cancel();
         }
      }
   }

   public static boolean N(class08716 var0, Set<class06681> var1, class07049 var2, boolean var3) {
      class08716 class08716xx = class08716.N(var2);
      class08716 class08716x = class08716.N(class08716xx, var0, var1);
      boolean flag = class08716xx.N().M(class08716x.N()) > 4096.0;
      if (var3 && !flag) {
         N(var2, class08716x.N(), class08716x.L(), class08716x.u());
         var2.method_18799(class08716x.y());
         return true;
      } else {
         var2.method_33574(class08716x.N());
         var2.method_18799(class08716x.y());
         var2.method_36456(class08716x.L());
         var2.method_36457(class08716x.u());
         class08716 class08716xx = class08716.N(new class08716(var2.method_61411(), class06889.L, var2.field_5982, var2.field_6004), var0, var1);
         var2.method_63615(class08716xx.N(), class08716xx.L(), class08716xx.u());
         return false;
      }
   }

   @Override
   public void N(class00261 var1) {
      class00417.N(var1, this, this.L.B());
      class04453 class04453 = (class04453)this.L.T_4;
      Set<class06681> set = class06681.N(var1.y(), var1.u());
      class08716 class08716x = class08716.N(class04453);
      class08716 class08716x = class08716.N(class08716x, class08716x.N(var1.N(), var1.L()), set);
      class04453.method_36456(class08716x.L());
      class04453.method_36457(class08716x.u());
      class04453.method_63614();
      this.u.method_10743(new class00530(class04453.method_36454(), class04453.method_36455(), false, false));
   }

   private void N(class00481 var1, CallbackInfo var2) {
      for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
         class04453 class04453 = ibaritone.getPlayerContext().player();
         if (class04453 != null && (class01683)class04453.y_0 == this) {
            ibaritone.getGameEventHandler().onChunkEvent(new ChunkEvent(EventState.PRE, Type.UNLOAD, var1.N().B, var1.N().Z));
         }
      }
   }

   @Override
   public void N(class06663 var1) {
      class00417.N(var1, this, this.L.B());
      class04453 class04453 = (class04453)this.L.T_4;
      if (!class04453.method_5765()) {
         N(var1.y(), var1.L(), class04453, false);
      }

      class00642 class00642 = this.u;
      class08078 class08078 = new class08078(var1.N());
      class00642 class00642x = class00642;
      if (this.N(class00642x, class08078)) {
         class00642x.method_10743(class08078);
      }

      this.u
         .method_10743(
            new class00564(
               class04453.method_23317(),
               class04453.method_23318(),
               class04453.method_23321(),
               class04453.method_36454(),
               class04453.method_36455(),
               false,
               false
            )
         );
      this.N(var1, null);
      this.y(var1, null);
   }

   private void N(class07259 var1, CallbackInfo var2) {
      if ((Boolean)Baritone.settings().repackOnAnyBlockChange.value) {
         if (CachedChunk.BLOCKS_TO_KEEP_TRACK_OF.contains(var1.N().i())) {
            for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
               class04453 class04453 = ibaritone.getPlayerContext().player();
               if (class04453 != null && (class01683)class04453.y_0 == this) {
                  ibaritone.getGameEventHandler()
                     .onChunkEvent(new ChunkEvent(EventState.POST, Type.POPULATE_FULL, var1.y().method_10263() >> 4, var1.y().method_10260() >> 4));
               }
            }
         }
      }
   }

   @Override
   public void N(class04464 var1) {
      class00417.N(var1, this, this.L.B());
      int i = this.h++;
      if (var1.N() != i) {
         m.error("Missing or out-of-order chat message from server, expected index {} but got {}", i, var1.N());
         this.u.method_10747(j);
      } else {
         Optional<class03079> optional = var1.M().N(this.NN);
         if (optional.isEmpty()) {
            Logger logger2 = m;
            UUID uuid1 = var1.y();
            String s1 = "Message from player with ID {} referenced unrecognized signature id";
            Logger logger1 = logger2;
            if (this.N(logger1, s1, uuid1)) {
               logger1.error(s1, uuid1);
            }

            this.u.method_10747(T);
         } else {
            this.NN.N(optional.get(), var1.u());
            UUID uuid = var1.y();
            class03458 class03458 = this.N(uuid);
            if (class03458 == null) {
               String sx = "Received player chat packet for unknown player with ID: {}";
               Logger logger = m;
               if (this.N(logger, sx, uuid)) {
                  logger.error(sx, uuid);
               }

               this.L.N().N(uuid, var1.u(), var1.z());
            } else {
               class02027 class02027 = class03458.y();
               class02083 class02083;
               if (class02027 != null) {
                  class02083 = new class02083(var1.L(), uuid, class02027.L());
               } else {
                  class02083 = class02083.N(uuid);
               }

               class03926 class03926 = new class03926(class02083, var1.u(), optional.get(), var1.B(), var1.Z());
               class03926 = class03458.L().method_45048(class03926);
               if (class03926 != null) {
                  this.L.N().N(class03926, class03458.N(), var1.z());
               } else {
                  this.L.N().N(uuid, var1.u(), var1.z());
               }
            }
         }
      }
   }

   @Override
   public void N(class02046 var1) {
      class00417.N(var1, this, this.L.B());
      this.L.N().N(var1.N(), var1.y());
   }

   public boolean N(class03767 var1) {
      return var1.N(this.G());
   }

   @Override
   public void N(class03053 var1) {
      class00417.N(var1, this, this.L.B());
      Optional<class04469> optional = var1.N().N(this.NN);
      if (optional.isEmpty()) {
         this.u.method_10747(T);
      } else {
         this.r.N(optional.get());
         if (!this.L.N().N(optional.get())) {
            ((class01056)this.L.i_6).i().N(optional.get());
         }
      }
   }

   @Override
   public void N(class04459 var1) {
      class00417.N(var1, this, this.L.B());
      this.L.N().N(var1.N(), var1.y());
   }

   @Override
   public void N(class08081 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      Object object = (class07438)this.Y.method_8469(var1.y());
      if (object == null) {
         object = (class04453)this.L.T_4;
      }

      if (class07049 != null) {
         if (class07049 instanceof class07057) {
            this.Y
               .method_8486(
                  class07049.method_23317(),
                  class07049.method_23318(),
                  class07049.method_23321(),
                  class04909.Us,
                  class04911.field_15248,
                  0.1F,
                  (this.e.z() - this.e.z()) * 0.35F + 0.9F,
                  false
               );
         } else {
            this.Y
               .method_8486(
                  class07049.method_23317(),
                  class07049.method_23318(),
                  class07049.method_23321(),
                  class04909.sJ,
                  class04911.field_15248,
                  0.2F,
                  (this.e.z() - this.e.z()) * 1.4F + 2.0F,
                  false
               );
         }

         class08800 class08800 = this.L.Ng().y(class07049, 1.0F);
         ((class04410)this.L.i_0).N(new class03869(this.Y, class08800, (class07049)object, class07049.method_18798()));
         if (class07049 instanceof class00717) {
            class06584 class06584 = ((class00717)class07049).N();
            if (!class06584.R()) {
               class06584.B(var1.L());
            }

            if (class06584.R()) {
               this.Y.N(var1.N(), class07062.field_26999);
            }
         } else if (!(class07049 instanceof class07057)) {
            this.Y.N(var1.N(), class07062.field_26999);
         }
      }
   }

   public void N(class08546<?, ?> var1) {
      this.NW.add(new WeakReference<>(var1));
   }

   @Override
   public void N(class08068 var1) {
      class00417.N(var1, this, this.L.B());
      this.Y.N(var1.N(), var1.y(), var1.L());
      this.M.N(var1.N());
   }

   public void N(class03737 var1) {
      if (!var1.equals(this.NL)) {
         this.N(new class00541(var1));
         this.NL = var1;
      }
   }

   @Override
   public void N(class08096 var1) {
      class00417.N(var1, this, this.L.B());
      ((class03448)this.L.T_3).method_27873(var1.N());
      this.N(var1, null);
   }

   private void N(String var1, String var2, @Nullable class05096 var3) {
      this.N(var1, var2, n, () -> {
         class03961 class03961 = new class03961(var1);
         CallbackInfo callbackinfo = new CallbackInfo("", true);
         this.y(var1, var3, callbackinfo);
         if (!callbackinfo.isCancelled()) {
            this.N(class03961);
            this.L.N(var3);
         }
      });
   }

   @Override
   public void N(class03277 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 != null) {
         class07049.method_5879(var1.y());
      }
   }

   private void N(class04450 var1) {
      if (this.L.y(this.k.id())) {
         if (this.x == null || !this.x.L().equals(var1)) {
            this.x = class02018.N(var1);
            this.D = this.x.N(this.k.id());
            this.N(new class02075(this.x.N().N()));
         }
      }
   }

   @Override
   public void N(class07268 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 != null) {
         if (var1.y() == 0) {
            class07438 class07438x = (class07438)class07049;
            class07438x.method_6104(class07050.field_5808);
         } else if (var1.y() == 3) {
            class07438 class07438 = (class07438)class07049;
            class07438.method_6104(class07050.field_5810);
         } else if (var1.y() == 2) {
            class08036 class08036 = (class08036)class07049;
            class08036.method_7358(false, false);
         } else if (var1.y() == 4) {
            ((class04410)this.L.i_0).N(class07049, class07107.M);
         } else if (var1.y() == 5) {
            ((class04410)this.L.i_0).N(class07049, class07107.j);
         }
      }
   }

   private void N(class00570 var1, int var2, int var3) {
      class05795 class05795 = this.Y.method_8398().L();
      class00554[] aclass00554 = var1.u();
      class07321 class07321 = var1.R();

      for (int i = 0; i < aclass00554.length; i++) {
         class00554 class00554 = aclass00554[i];
         int jx = this.Y.method_31604(i);
         class05795.N(class01296.N(class07321, jx), class00554.L());
      }

      this.Y.y(var2 - 1, this.Y.method_32891(), var3 - 1, var2 + 1, this.Y.method_31597(), var3 + 1);
   }

   @Override
   public void N(class04190 var1) {
      this.N(var1, null);
      class00417.N(var1, this, this.L.B());
      this.L.N().u();
      if (this.N(this)) {
         this.c();
      }

      class06467 class06467 = ((class01056)this.L.i_6).i().U();
      this.L.L(new class01871(b, this.u));
      this.u
         .method_56330(
            class02868.u,
            new class01874(
               this.L,
               this.u,
               new class01892(new class05384(), this.k, this.M, this.p, this.F, this.R, this.i, this.B, this.z, class06467, this.U, this.o(), this.E, this.W)
            )
         );
      this.N(class04183.N);
      this.u.method_56329(class02868.y);
      this.y(var1, null);
   }

   @Override
   public void N(class07259 var1) {
      class00417.N(var1, this, this.L.B());
      this.Y.N(var1.y(), var1.N(), 19);
      this.N(var1, null);
      this.y(var1, null);
   }

   private void N(boolean var1) {
      this.Nm = var1;
   }

   @Override
   public void N(class00481 var1) {
      this.N(var1, null);
      class00417.N(var1, this, this.L.B());
      this.Y.method_8398().N(var1.N());
      this.NR.N(var1.N());
      this.y(var1);
      this.y(var1, null);
      this.L(var1, null);
   }

   private boolean N(Logger var1, String var2, Object var3) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_2);
   }

   private boolean N(class01683 var1, class04453 var2, class03448 var3, class05858 var4, class05946 var5) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_3)
         || var5 != ((class04453)this.L.T_4).method_73183().method_27983();
   }

   private class06241 N(class06584 var1) {
      return !ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_5) && !var1.N(class06570.GE) ? null : class06241.N(var1);
   }

   private boolean N(class01683 var1) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20_5);
   }

   private void N(class04453 var1, class07282 var2) {
      if (ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_20)) {
         var1.N(var2);
      }
   }

   @Override
   public void N(class07276 var1) {
      class00417.N(var1, this, this.L.B());
      if (this.S.isPresent() && this.S.getAsInt() == var1.N()) {
         this.S = OptionalInt.empty();
      }

      class07049 class07049 = this.y(var1);
      if (class07049 != null) {
         class07049.method_31471(var1);
         this.Y.u(class07049);
         this.N(class07049);
      } else {
         m.warn("Skipping Entity with id {}", var1.L());
      }

      if (class07049 instanceof class08036) {
         UUID uuid = ((class08036)class07049).method_5667();
         class03458 class03458 = this.O.get(uuid);
         if (class03458 != null) {
            this.E.put(uuid, class03458);
         }
      }
   }

   private boolean N(Logger var1, String var2, Object var3, Object var4) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_19_3);
   }

   private boolean N(OptionalInt var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21) && var1.isPresent();
   }

   private boolean N(class04465 var1, class06889 var2) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_2);
   }

   private boolean N(class00642 var1, class00381 var2) {
      boolean flag = ProtocolTranslator.getTargetVersion().equalTo(ProtocolVersion.v1_21_2);
      if (flag) {
         this.NT = var2;
      }

      return !flag;
   }

   private double N(class06889 var1, class06889 var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2) ? 2.147483647E9 : var1.R(var2);
   }

   private void N(Logger var1, String var2, Object var3, Object var4, class06651 var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
         class07209 class07209 = var5.N();
         class07267 class07267 = new class07267(class07209, this.Y.method_8320(class07209));
         class07267.N(this.Y);
         ((class04453)this.L.T_4).method_7311(class07267, var5.y());
      } else {
         var1.warn(var2, var3, var4);
      }
   }

   private boolean N(class05320 var1, class05320 var2) {
      return ProtocolTranslator.getTargetVersion().newerThanOrEqualTo(ProtocolVersion.v1_21);
   }

   private void N(class06202 var1, class05096 var2, int var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
         if (var3 == 0) {
            ((class01683)((class04453)this.L.T_4).y_0).N(new class00535(class00569.field_12774));
            this.L.N(new class05850(this.NM, class05858.field_51488));
         } else if (var3 == 1) {
            var1.N(var2);
         }
      } else {
         var1.N(var2);
      }
   }

   private void N(class06202 var1, class05096 var2, LocalIntRef var3) {
      this.N(var1, var2, var3.get());
   }

   private void N(Logger var1, String var2, Object var3, Object var4, LocalRef var5) {
      this.N(var1, var2, var3, var4, (class06651)var5.get());
   }

   private void N(class06202 var1, class04453 var2, Operation var3, class06643 var4, LocalRef var5) {
      this.N(var1, var2, var3, var4, (class04453)var5.get());
   }

   private class01690 N(class01683 var1, String var2) {
      if (!ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5)) {
         return this.M(var2);
      } else {
         class01690 class01690 = this.M(var2);
         return class01690 != class01690.field_60787 && class01690 != class01690.field_60789 ? class01690 : class01690.field_60786;
      }
   }

   private void N(class01683 var1, class00381 var2, LocalRef var3) {
      this.N(var1, var2, (String)var3.get());
   }

   private void N(int var1, int var2, class05795 var3, class00772 var4, BitSet var5, BitSet var6, Iterator<byte[]> var7, boolean var8) {
      for (int i = 0; i < var3.L(); i++) {
         int jx = var3.u() + i;
         boolean flag = var5.get(i);
         boolean flag1 = var6.get(i);
         if (flag || flag1) {
            var3.N(var4, class01296.N(var1, jx, var2), flag ? new class00536((byte[])((byte[])var7.next()).clone()) : new class00536());
            if (var8) {
               this.Y.y(var1, jx, var2);
            }
         }
      }
   }

   private void N(class05705 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17_1)) {
         this.N(new class04022(var1.N()));
      }
   }

   private boolean N_29(Object var1, Class var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18) ? false : var2.isInstance(var1);
   }

   private void N(class06202 var1, class00642 var2, class01892 var3, CallbackInfo var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_1)) {
         this.g = new LinkedHashSet<>();
      }
   }

   @Override
   public void N(class00482 var1) {
      class00417.N(var1, this, this.L.B());
      this.L.T_2 = new class03443(this.L, this);
      class04167 class04167 = var1.E();
      ArrayList arraylist = Lists.newArrayList(var1.L());
      Collections.shuffle(arraylist);
      this.a = Sets.newLinkedHashSet(arraylist);
      class05946<class07299> class05946 = class04167.y();
      class03556<class07376> class03556 = class04167.N();
      this.K = var1.M();
      this.V = var1.B();
      boolean flag = class04167.R();
      boolean flag1 = class04167.M();
      int i = class04167.z();
      class03427 class03427 = new class03427(class07086.field_5802, var1.y(), flag1);
      this.Q = class03427;
      this.u(var1, null);
      this.Y = new class03448(this, class03427, class05946, class03556, this.K, this.V, (class03063)this.L.B_2, flag, class04167.L(), i);
      this.L.N(this.Y);
      if ((class04453)this.L.T_4 == null) {
         this.L.T_4 = ((class03443)this.L.T_2).N(this.Y, new class01205(), new class01756());
         ((class04453)this.L.T_4).method_36456(-180.0F);
         if (this.L.Na() != null) {
            this.L.Na().N(((class04453)this.L.T_4).method_5667());
         }
      }

      this.N(false);
      this.NR.N();
      ((class03063)this.L.B_2).i.N();
      ((class04453)this.L.T_4).w();
      ((class04453)this.L.T_4).method_5838(var1.N());
      this.Y.u((class04453)this.L.T_4);
      ((class04453)this.L.T_4).L_1 = new class04462((class05630)this.L.i_7);
      ((class03443)this.L.T_2).N((class04453)this.L.T_4);
      this.L.N((class04453)this.L.T_4);
      this.N((class04453)this.L.T_4, this.Y, class05858.field_51489);
      ((class04453)this.L.T_4).method_7268(var1.Z());
      ((class04453)this.L.T_4).L(var1.z());
      ((class04453)this.L.T_4).u(var1.U());
      ((class04453)this.L.T_4).method_43120(class04167.B());
      ((class04453)this.L.T_4).method_51850(class04167.Z());
      ((class03443)this.L.T_2).N(class04167.u(), class04167.i());
      ((class05630)this.L.i_7).y(var1.M());
      this.x = null;
      this.D = class03065.N;
      this.h = 0;
      this.r = new class03046(20);
      this.NN = class03397.N();
      if (this.u.method_10771()) {
         this.v();
      }

      this.M.N(class04167.u(), var1.y());
      this.L.Nl().N(this.L);
      this.NB = var1.W();
      if (this.i != null && !this.W && !this.y(this)) {
         class06132 class06132 = class06132.N(this.L, class06095.U, P, s);
         this.L.m().N(class06132);
         this.W = true;
      }

      this.y(var1, null);
      this.L(var1, null);
      this.i(var1, null);
      this.N(var1, null);
      this.R(var1, null);
   }

   private static void N(class07049 var0, class06889 var1, float var2, float var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_1)
         && Math.abs(var0.method_23317() - var1.M) < 0.03125
         && Math.abs(var0.method_23318() - var1.B) < 0.015625
         && Math.abs(var0.method_23321() - var1.Z) < 0.03125) {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2) && var0.method_66233() != null) {
            var0.method_66233().method_66266(0);
         }

         var0.method_66246(var0.method_73189(), var2, var3);
      } else {
         var0.method_66246(var1, var2, var3);
      }
   }

   private boolean N(List var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_3) && var1.isEmpty();
   }

   private void N(class01683 var1, class00381 var2, String var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
         this.N(new class02177(var3, Instant.now(), 0L, (class04455)class04455.y_0, this.r.y().y()));
      } else {
         var1.N(var2);
      }
   }

   @Override
   public void N(class03132 var1) {
      class00417.N(var1, this, this.L.B());
      if ((class03448)this.L.T_3 != null) {
         class03106 class03106 = ((class03448)this.L.T_3).method_54719();
         class03106.N(var1.N());
         class03106.N(var1.y());
      }
   }

   public void N(CallbackInfo var1) {
      class09350 class09350 = (class09350)class09350.y_0;
      class11938.L().L(class09350);
      if (class09350.y()) {
         var1.cancel();
      }
   }

   @Override
   public void N(class08063 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 == null) {
         OptionalInt optionalint = this.S;
         if (this.N(optionalint) && this.S.getAsInt() == var1.N()) {
            m.debug("Trying to teleport entity with id {}, that was formerly player vehicle, applying teleport to player instead", var1.N());
            N(var1.y(), var1.L(), (class04453)this.L.T_4, false);
            this.u
               .method_10743(
                  new class00564(
                     ((class04453)this.L.T_4).method_23317(),
                     ((class04453)this.L.T_4).method_23318(),
                     ((class04453)this.L.T_4).method_23321(),
                     ((class04453)this.L.T_4).method_36454(),
                     ((class04453)this.L.T_4).method_36455(),
                     false,
                     false
                  )
               );
         }
      } else {
         boolean flag = var1.L().contains(class06681.field_12400) || var1.L().contains(class06681.field_12398) || var1.L().contains(class06681.field_12403);
         boolean flag1 = this.Y.y(class07049) || !class07049.method_66247() || flag;
         boolean flag2 = N(var1.y(), var1.L(), class07049, flag1);
         class07049.method_24830(var1.u());
         if (!flag2 && class07049.method_5821((class04453)this.L.T_4)) {
            class07049.method_24201((class04453)this.L.T_4);
            ((class04453)this.L.T_4).method_22862();
            if (class07049.method_66247()) {
               this.u.method_10743(class00557.N(class07049));
            }
         }
      }
   }

   private void N(class06652 var1, CallbackInfo var2) {
      class11938.L().L(class11387.N(var1));
   }

   @Override
   public void N(class06664 var1) {
      class00417.N(var1, this, this.L.B());
      if (class08044.L(var1.N())) {
         ((class04453)this.L.T_4).method_31548().N(var1.N());
      }
   }

   @Override
   public void N(class00475 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = var1.N(this.Y);
      if (class07049 != null) {
         if (this.y(class07049)) {
            class04465 class04465 = class07049.method_43389();
            class06889 class06889 = class04465.N(var1.N(), var1.y(), var1.L());
            if (this.N(class04465, class06889)) {
               class04465.i(class06889);
            }
         } else {
            if (var1.Z()) {
               class04465 class04465x = class07049.method_43389();
               class06889 class06889x = class04465x.N(var1.N(), var1.y(), var1.L());
               class04465x.i(class06889x);
               if (var1.B()) {
                  class07049.method_66246(class06889x, var1.u(), var1.M());
               } else {
                  class07049.method_73095(class06889x);
               }
            } else if (var1.B()) {
               class07049.method_73094(var1.u(), var1.M());
            }

            class07049.method_24830(var1.z());
         }
      }
   }

   private void N(class06643 var1, CallbackInfo var2) {
      if (this.Y != null) {
         for (class07049 class07049 : this.Y.M()) {
            ((Unload)ClientEntityEvents.ENTITY_UNLOAD.invoker()).onUnload(class07049, this.Y);
         }

         for (class00570 class00570 : this.Y.fabric_getLoadedChunks()) {
            for (class00394 class00394 : class00570.o().values()) {
               ((net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker())
                  .onUnload(class00394, this.Y);
            }
         }
      }
   }

   private void N(class06202 var1, class04453 var2, Operation var3, class06643 var4, class04453 var5) {
      AttachmentTargetImpl.transfer(var5, var2, !var4.N((byte)1));
      var3.call(new Object[]{var1, var2});
   }

   private void N(class08076 var1, CallbackInfo var2) {
      ((TagsLoaded)CommonLifecycleEvents.TAGS_LOADED.invoker()).onTagsLoaded(this.p, true);
   }

   private void N(class01683 var1, class00290 var2, Operation var3) {
      var2.fabric_setSynchronizedClientRecipes(this.c.getSynchronizedRecipes());
      var3.call(new Object[]{var1, var2});
   }

   @Override
   public void N(class03124 var1) {
      class00417.N(var1, this, this.L.B());
      if ((class03448)this.L.T_3 != null) {
         ((class03448)this.L.T_3).method_54719().L(var1.N());
      }
   }

   private void N(class07049 var1) {
      if (var1 instanceof class07504 class07504) {
         this.L.Nr().N((class00044)(new class00011(class07504)));
      } else if (var1 instanceof class04626 class04626) {
         Object object;
         if (class04626.P_()) {
            object = new class05499(class04626);
         } else {
            object = new class05528(class04626);
         }

         this.L.Nr().N((class00034)object);
      }
   }

   private void N(class04190 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
         this.u.field_11651.config().setAutoRead(false);
      }
   }

   private void N(class07265 var1, CallbackInfo var2) {
      BlockConnectionsEmulation1_12_2.updateChunkNeighborConnections(this.Y, var1.y());
   }

   private void N(class07275 var1, CallbackInfo var2) {
      BlockConnectionsEmulation1_12_2.updateChunkNeighborConnections(this.Y, var1.N());
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
         var1.setReturnValue(true);
      }
   }

   private void N(class08096 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_18_2, ProtocolVersion.v1_20_2)) {
         class05096 class05096 = (class05096)this.L.v_3;
         if (class05096 instanceof ILevelLoadingScreen) {
            ((ILevelLoadingScreen)class05096).viaFabricPlus$setReady();
         }
      }
   }

   private void N(class06663 var1, CallbackInfo var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18)) {
         class05096 class05096 = (class05096)this.L.v_3;
         if (class05096 instanceof ILevelLoadingScreen) {
            ((ILevelLoadingScreen)class05096).viaFabricPlus$setReady();
         }
      }
   }

   @Override
   public void N(class06660 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 != null) {
         class07049.method_5841().N(var1.y());
      }
   }

   private void N(int var1, int var2, class01832 var3, boolean var4, CallbackInfo var5) {
      ChunkTrackerHolder.get(this.Y).onChunkStatusAdded(var1, var2, 2);
   }

   @Override
   public void N(class00269 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 != null) {
         class06889 class06889 = var1.y().N();
         class07049.method_43389().i(class06889);
         if (!this.y(class07049)) {
            float fx = var1.y().L();
            float f1 = var1.y().u();
            boolean flag = class07049.method_73189().M(class06889) > 4096.0;
            if (this.Y.y(class07049) && !flag) {
               class07049.method_66246(class06889, fx, f1);
            } else {
               class07049.method_60949(class06889, fx, f1);
            }

            if (!class07049.method_66245() && class07049.method_5821((class04453)this.L.T_4)) {
               class07049.method_24201((class04453)this.L.T_4);
               ((class04453)this.L.T_4).method_22862();
            }

            class07049.method_24830(var1.L());
         }
      }
   }

   public void N(class06661 var1, CallbackInfo var2) {
      var2.cancel();
   }

   public void N(class00482 var1, CallbackInfo var2) {
      UserConnection userconnection = this.M().viaFabricPlus$getUserConnection();
      if (userconnection != null) {
         ConnectionDetails.sendConnectionDetails(userconnection, "vv:mod_details");
      }
   }

   private void N(int var1, int var2, class01839 var3, CallbackInfo var4) {
      BlockConnectionsEmulation1_12_2.updateChunkNeighborConnections(this.Y, var1, var2);
   }

   @Override
   public void N(class06652 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 != null) {
         class07049.method_5750(var1.y());
         this.N(var1, null);
      }
   }

   @Override
   public void N(class02511 var1) {
      class00417.N(var1, this, this.L.B());
      ((class01056)this.L.i_6).L(var1.N());
   }

   @Override
   public void N(class02459 var1) {
      class00417.N(var1, this, this.L.B());
      ((class01056)this.L.i_6).N(var1.N(), false);
   }

   @Override
   public void N(class03057 var1) {
      class00417.N(var1, this, this.L.B());
      this.J.N(var1.N(), var1.y());
   }

   @Override
   public void N(class03953 var1) {
      class00417.N(var1, this, this.L.B());
      if (this.i != null) {
         this.i.u = var1.N();
         var1.y().map(class04568::y).ifPresent(this.i::N);
         class04563.y(this.i);
      }
   }

   @Override
   public void N(class06648 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = var1.N(this.Y);
      if (class07049 instanceof class07438) {
         ((class07438)class07049).method_6111(var1.y());
      }
   }

   @Override
   public void N(class08082 var1) {
      class00417.N(var1, this, this.L.B());
      ((class01056)this.L.i_6).Z().y(var1.N().getString().isEmpty() ? null : var1.N());
      ((class01056)this.L.i_6).Z().N(var1.y().getString().isEmpty() ? null : var1.y());
   }

   @Override
   public void N(class02668 var1) {
      class00417.N(var1, this, this.L.B());
      ((class01056)this.L.i_6).N(var1.N(), var1.y(), var1.L());
   }

   @Override
   public void N(class02775 var1) {
      class00417.N(var1, this, this.L.B());
      ((class01056)this.L.i_6).y(var1.N());
   }

   @Override
   public void N(class02617 var1) {
      class00417.N(var1, this, this.L.B());
      this.Y.method_8621().N(var1.N());
   }

   @Override
   public void N(class02160 var1) {
      class00417.N(var1, this, this.L.B());
      this.Y.method_8621().N(var1.N(), var1.y(), var1.L(), this.Y.N());
   }

   @Override
   public void N(class02309 var1) {
      class00417.N(var1, this, this.L.B());
      this.Y.method_8621().L(var1.y(), var1.N());
   }

   @Override
   public void N(class02860 var1) {
      class00417.N(var1, this, this.L.B());
      class08057 class08057 = this.Y.method_8621();
      class08057.L(var1.N(), var1.y());
      long i = var1.M();
      if (i > 0L) {
         class08057.N(var1.u(), var1.L(), i, this.Y.N());
      } else {
         class08057.N(var1.L());
      }

      class08057.N(var1.B());
      class08057.L(var1.z());
      class08057.y(var1.Z());
   }

   @Override
   public void N(class02512 var1) {
      class00417.N(var1, this, this.L.B());
      this.Y.method_8621().L(var1.N());
   }

   @Override
   public void N(class02900 var1) {
      class00417.N(var1, this, this.L.B());
      this.Y.method_8621().y(var1.N());
   }

   @Override
   public void N(class02361 var1) {
      class00417.N(var1, this, this.L.B());
      ((class01056)this.L.i_6).u();
      if (var1.N()) {
         ((class01056)this.L.i_6).N();
      }
   }

   @Override
   public void N(class06272 var1) {
      class00417.N(var1, this, this.L.B());
      class06584 class06584 = ((class04453)this.L.T_4).method_5998(var1.N());
      class06241 class06241 = this.N(class06584);
      if (class06241 != null) {
         this.L.N(new class05671(class06241));
      }
   }

   @Override
   public void N(class06668 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = ((class04453)this.L.T_4).method_5668();
      if (class07049 != (class04453)this.L.T_4 && class07049.method_66247()) {
         class06889 class06889x = var1.N();
         class06889 class06889x;
         if (class07049.method_66245()) {
            class06889x = class07049.method_66233().method_66265();
         } else {
            class06889x = class07049.method_73189();
         }

         if (this.N(class06889x, class06889x) > 1.0E-5F) {
            if (class07049.method_66245()) {
               class07049.method_66233().method_66272();
            }

            class07049.method_5641(class06889x.N(), class06889x.y(), class06889x.L(), var1.y(), var1.L());
         }

         this.u.method_10743(class00557.N(class07049));
      }
   }

   @Override
   public void N(class00512 var1) {
      class00417.N(var1, this, this.L.B());
      if (var1.y() == 0) {
         ((class04453)this.L.T_4).method_7357().N(var1.N());
      } else {
         ((class04453)this.L.T_4).method_7357().N(var1.N(), var1.y());
      }
   }

   @Override
   public void N(class07254 var1) {
      class00417.N(var1, this, this.L.B());
      ((class01056)this.L.i_6).U().N(var1);
   }

   @Override
   public void N(class00479 var1) {
      class00417.N(var1, this, this.L.B());
      class04453 class04453 = (class04453)this.L.T_4;
      if (((class07482)class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b == var1.N()) {
         ((class07482)class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).y(var1.y(), var1.L());
      }
   }

   @Override
   public void N(class01659 var1) {
      this.y(var1);
   }

   @Override
   public void N(class07269 var1) {
      class00417.N(var1, this, this.L.B());
      class07209 class07209 = var1.N();
      ((class03448)this.L.T_3).N(class07209, var1.y()).ifPresent(var2x -> {
         class04495 class04495 = new class04495(var2x.J(), m);

         try {
            var2x.y_1(class08308.N(class04495, this.p, var1.L()));
         } catch (Throwable throwable1) {
            try {
               class04495.close();
            } catch (Throwable throwable) {
               throwable1.addSuppressed(throwable);
            }

            throw throwable1;
         }

         class04495.close();
         if (var2x instanceof class00402 && (class05096)this.L.v_3 instanceof class05995) {
            ((class05995)((class05096)this.L.v_3)).R();
         }
      });
   }

   private void N(class06669 var1, class03458 var2) {
      GameProfile gameprofile = var2.N();
      class03962 class03962 = this.L.n().N();
      if (class03962 == null) {
         Logger logger1 = m;
         String s1 = gameprofile.name();
         String sx = "Ignoring chat session from {} due to missing Services public key";
         Logger logger = logger1;
         if (this.y(logger, sx, s1)) {
            logger.warn(sx, s1);
         }

         var2.N(this.H());
      } else {
         class02048 class02048 = var1.Z();
         if (class02048 != null) {
            try {
               class02027 class02027 = class02048.N(gameprofile, class03962);
               var2.N(class02027);
            } catch (class10406 class10406) {
               m.error("Failed to validate profile key for player: '{}'", gameprofile.name(), class10406);
               var2.N(this.H());
            }
         } else {
            var2.N(this.H());
         }
      }
   }

   private void N(class06680 var1, class06669 var2, class03458 var3) {
      switch (var1) {
         case field_40699:
            this.N(var2, var3);
            break;
         case field_29137:
            if (var3.i() != var2.i() && (class04453)this.L.T_4 != null && ((class04453)this.L.T_4).method_5667().equals(var2.N())) {
               class04453 class04453 = (class04453)this.L.T_4;
               class07282 class07282 = var2.i();
               class04453 class04453x = class04453;
               this.N(class04453x, class07282);
            }

            var3.N(var2.i());
            break;
         case field_40700:
            if (var2.L()) {
               this.g.add(var3);
            } else {
               this.g.remove(var3);
            }
            break;
         case field_29138:
            var3.N(var2.u());
            break;
         case field_29139:
            var3.N(var2.R());
            break;
         case field_54981:
            var3.y(var2.M());
            break;
         case field_52324:
            var3.y(var2.B());
      }
   }

   @Override
   public void N(class06661 var1) {
      class00417.N(var1, this, this.L.B());

      for (class06669 class06669x : var1.L()) {
         class03458 class03458x = new class03458(Objects.requireNonNull(class06669x.y()), this.H());
         if (this.O.putIfAbsent(class06669x.N(), class03458x) == null) {
            this.L.yv().N(class03458x);
         }
      }

      for (class06669 class06669x : var1.y()) {
         class03458 class03458 = this.O.get(class06669x.N());
         if (class03458 == null) {
            Logger logger1 = m;
            UUID uuid1 = class06669x.N();
            EnumSet enumset1 = var1.N();
            CallbackInfo callbackinfo = new CallbackInfo("", true);
            this.N(var1, callbackinfo);
            if (callbackinfo.isCancelled()) {
               return;
            }

            EnumSet<class06680> enumset = enumset1;
            UUID uuid = uuid1;
            String sx = "Ignoring player info update for unknown player {} ({})";
            Logger logger = logger1;
            if (this.N(logger, sx, uuid, enumset)) {
               logger.warn(sx, uuid, enumset);
            }
         } else {
            for (class06680 class06680 : var1.N()) {
               this.N(class06680, class06669x, class03458);
            }
         }
      }
   }

   @Override
   public void N(class02079 var1) {
      class00417.N(var1, this, this.L.B());

      for (UUID uuid : var1.N()) {
         this.L.yv().R(uuid);
         class03458 class03458 = this.O.remove(uuid);
         if (class03458 != null) {
            this.g.remove(class03458);
         }
      }
   }

   @Override
   public void N(class06659 var1) {
      class00417.N(var1, this, this.L.B());
      class04453 class04453 = (class04453)this.L.T_4;
      class04453.method_31549().y = var1.y();
      class04453.method_31549().u = var1.u();
      class04453.method_31549().N = var1.N();
      class04453.method_31549().L = var1.L();
      class04453.method_31549().N(var1.M());
      class04453.method_31549().y(var1.B());
   }

   @Override
   public void N(class08073 var1) {
      class00417.N(var1, this, this.L.B());
      ((class03448)this.L.T_3).method_8465((class04453)this.L.T_4, var1.L(), var1.u(), var1.M(), var1.N(), var1.y(), var1.B(), var1.Z(), var1.z());
   }

   @Override
   public void N(class08062 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.L());
      if (class07049 != null) {
         ((class03448)this.L.T_3).method_8449((class04453)this.L.T_4, class07049, var1.N(), var1.y(), var1.u(), var1.M(), var1.B());
      }
   }

   @Override
   public void N(class07233 var1) {
      class00417.N(var1, this, this.L.B());
      this.y(var1, null);
      this.H = new CommandDispatcher(var1.N(class04348.N(this.p, this.F), w));
      this.N(var1, null);
   }

   @Override
   public void N(class06674 var1) {
      class00417.N(var1, this, this.L.B());
      class01894 class01894 = var1.N();
      if (class01894 == null) {
         this.I.N(null, false);
      } else {
         class03711 class03711 = this.I.N(class01894);
         this.I.N(class03711, false);
      }
   }

   @Override
   public void N(class08077 var1) {
      class00417.N(var1, this, this.L.B());
      this.I.N(var1);
   }

   @Override
   public void N(class00516 var1) {
      class00417.N(var1, this, this.L.B());
      if (var1.N()) {
         ((class03448)this.L.T_3).method_8474(var1.y(), var1.u(), var1.L());
      } else {
         ((class03448)this.L.T_3).N(var1.y(), var1.u(), var1.L());
      }
   }

   @Override
   public void N(class06671 var1) {
      class00417.N(var1, this, this.L.B());
      class06889 class06889 = var1.N(this.Y);
      if (class06889 != null) {
         ((class04453)this.L.T_4).method_5702(var1.N(), class06889);
      }
   }

   @Override
   public void N(class08069 var1) {
      class00417.N(var1, this, this.L.B());
      class00290 class00290 = new class00290(var1.N(), var1.y());
      this.N(this, class00290, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_634, net.minecraft.class_10333]");
         ((class01683)var0[0]).c = (class00290)var0[1];
         return (Void)null;
      });
   }

   @Override
   public void N(class07232 var1) {
      class00417.N(var1, this, this.L.B());
      this.J.N(var1.y(), var1.N());
   }

   @Override
   public void N(class08090 var1) {
      class00417.N(var1, this, this.L.B());
      this.L.Nr().N(var1.N(), var1.y());
   }

   @Override
   public void N(class07265 var1) {
      class00417.N(var1, this, this.L.B());
      ((class03448)this.L.T_3).method_8517(var1.N(), var1.y(), var1.L());
      this.N(var1, null);
   }

   @Override
   public void N(class07275 var1) {
      class00417.N(var1, this, this.L.B());
      ((class03448)this.L.T_3).method_8427(var1.N(), var1.u(), var1.y(), var1.L());
      this.N(var1, null);
   }

   @Override
   public void N(class00486 var1) {
      class00417.N(var1, this, this.L.B());
      ((class04453)this.L.T_4).t();
   }

   @Override
   public void N(class06682 var1) {
      class00417.N(var1, this, this.L.B());
      if (this.Y.method_8469(var1.N()) instanceof class07438 class07438) {
         var1.y().forEach(var1x -> class07438.method_5673((class07085)var1x.getFirst(), (class06584)var1x.getSecond()));
      }
   }

   @Override
   public void N(class00503 var1) {
      class00417.N(var1, this, this.L.B());
      class04453 class04453 = (class04453)this.L.T_4;
      class00521 class00521 = var1.N();
      float fx = var1.y();
      int i = class04995.y(fx + 0.5F);
      if (class00521 == class00503.y) {
         class04453.method_7353(class00392.L("block.minecraft.spawn.not_valid"), false);
      } else if (class00521 == class00503.L) {
         this.Y.method_8401().y(true);
         this.Y.method_8519(0.0F);
      } else if (class00521 == class00503.u) {
         this.Y.method_8401().y(false);
         this.Y.method_8519(1.0F);
      } else if (class00521 == class00503.i) {
         ((class03443)this.L.T_2).N(class07282.N(i));
      } else if (class00521 == class00503.R) {
         class06202 class06202 = this.L;
         class04606 class04606 = new class04606(true, () -> {
            ((class01683)((class04453)this.L.T_4).y_0).N(new class00535(class00569.field_12774));
            this.L.N(null);
         });
         class06202 class06202x = class06202;
         LocalIntRefImpl localintrefimpl = new LocalIntRefImpl();
         localintrefimpl.init(i);
         this.N(class06202x, class04606, localintrefimpl);
         i = localintrefimpl.dispose();
      } else if (class00521 == class00503.M) {
         class05630 class05630 = (class05630)this.L.i_7;
         class05216 class05216 = null;
         if (fx == 0.0F) {
            this.L.N(new class05351());
         } else if (fx == 101.0F) {
            class05216 = class00392.N("demo.help.movement", class05630.n.m(), class05630.t.m(), class05630.G.m(), class05630.l.m());
         } else if (fx == 102.0F) {
            class05216 = class00392.N("demo.help.jump", class05630.d.m());
         } else if (fx == 103.0F) {
            class05216 = class00392.N("demo.help.inventory", class05630.Y.m());
         } else if (fx == 104.0F) {
            class05216 = class00392.N("demo.day.6", class05630.e.m());
         }

         if (class05216 != null) {
            ((class01056)this.L.i_6).i().N(class05216);
            this.L.NT().L(class05216);
         }
      } else if (class00521 == class00503.B) {
         this.Y
            .method_43128(
               class04453, class04453.method_23317(), class04453.method_23320(), class04453.method_23321(), class04909.Nq, class04911.field_15248, 0.18F, 0.45F
            );
      } else if (class00521 == class00503.Z) {
         this.Y.method_8519(fx);
      } else if (class00521 == class00503.z) {
         this.Y.method_8496(fx);
      } else if (class00521 == class00503.U) {
         this.Y
            .method_43128(
               class04453, class04453.method_23317(), class04453.method_23318(), class04453.method_23321(), class04909.lJ, class04911.field_15254, 1.0F, 1.0F
            );
      } else if (class00521 == class00503.E) {
         this.Y.method_8406(class07107.b, class04453.method_23317(), class04453.method_23318(), class04453.method_23321(), 0.0, 0.0, 0.0);
         if (i == 1) {
            this.Y
               .method_43128(
                  class04453,
                  class04453.method_23317(),
                  class04453.method_23318(),
                  class04453.method_23321(),
                  class04909.zd,
                  class04911.field_15251,
                  1.0F,
                  1.0F
               );
         }
      } else if (class00521 == class00503.W) {
         ((class04453)this.L.T_4).L(fx == 0.0F);
      } else if (class00521 == class00503.m) {
         ((class04453)this.L.T_4).u(fx == 1.0F);
      } else if (class00521 == class00503.P && this.NM != null) {
         this.NM.L();
      }
   }

   private void N(class04453 var1, class03448 var2, class05858 var3) {
      if (this.NM == null) {
         this.NM = new class05384();
      }

      this.NM.N(var1, var2, (class03063)this.L.B_2);
      class05096 class05096 = (class05096)this.L.v_3;
      if (class05096 instanceof class05850) {
         ((class05850)class05096).N(this.NM, var3);
      } else {
         ((class01056)this.L.i_6).i().Z();
         this.L.y(new class05850(this.NM, var3));
      }
   }

   @Override
   public void N(class00480 var1) {
      class00417.N(var1, this, this.L.B());
      class02265 class02265 = var1.N();
      class07769 class07769 = ((class03448)this.L.T_3).method_17891(class02265);
      if (class07769 == null) {
         class07769 = class07769.N(var1.y(), var1.L(), ((class03448)this.L.T_3).method_27983());
         ((class03448)this.L.T_3).N(class02265, class07769);
      }

      var1.N(class07769);
      this.L.NV().N(class02265, class07769);
   }

   @Override
   public void N(class02807 var1) {
   }

   @Override
   public void N(class02259 var1) {
   }

   @Override
   public void N(class08076 var1) {
      class00417.N(var1, this, this.L.B());
      ArrayList arraylist = new ArrayList(var1.N().size());
      boolean flag = this.u.method_10756();
      var1.N().forEach((var3x, var4x) -> {
         if (!flag || class02001.N((class05946<? extends class00751<?>>)var3x)) {
            arraylist.add(this.N((class05946<? extends class00751<?>>)var3x, var4x));
         }
      });
      arraylist.forEach(class00720::u);
      class01022 class01022 = this.p;
      class03767 class03767 = this.F;
      this.N(var1, null);
      this.f = class02755.N(class01022, class03767);
      List list = List.copyOf(class03771.i().E());
      this.NE.N(list);
   }

   private <T> class00720<T> N(class05946<? extends class00751<? extends T>> var1, class03516 var2) {
      class00751 class00751 = this.p.L(var1);
      return class00751.N(var2.N(class00751));
   }

   @Override
   public void N(class02675 var1) {
      class00417.N(var1, this, this.L.B());
      if (this.Y.method_8469(var1.N()) == (class04453)this.L.T_4) {
         class04453 class04453 = (class04453)this.L.T_4;
         this.N(var1, null);
         if (class04453.Q()) {
            this.L.N(new class05345(var1.y(), this.Y.method_8401().U(), (class04453)this.L.T_4));
         } else {
            ((class04453)this.L.T_4).K();
         }
      }
   }

   @Override
   public void N(class07258 var1) {
      class00417.N(var1, this, this.L.B());
      this.Q.N(var1.N());
      this.Q.N(var1.y());
   }

   @Override
   public void N(class06655 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = var1.N(this.Y);
      if (class07049 != null) {
         this.L.N(class07049);
      }
   }

   @Override
   public void N(class00257 var1) {
      class00417.N(var1, this, this.L.B());
      class01756 class01756 = ((class04453)this.L.T_4).q();

      for (class00329 class00329 : var1.N()) {
         class01756.N(class00329);
      }

      this.N(class01756);
   }

   @Override
   public void N(class00278 var1) {
      class00417.N(var1, this, this.L.B());
      class01756 class01756 = ((class04453)this.L.T_4).q();
      if (var1.y()) {
         class01756.N();
      }

      for (class00268 class00268 : var1.N()) {
         class01756.N(class00268.L());
         if (class00268.y()) {
            class01756.u(class00268.L().N());
         }

         if (class00268.N()) {
            class04658.N(this.L.m(), class00268.L().y());
         }
      }

      this.N(class01756);
   }

   @Override
   public void N(class07245 var1) {
      class00417.N(var1, this, this.L.B());
      ObjectIterator<Entry<class04907<?>>> objectiterator = var1.N().object2IntEntrySet().iterator();

      while (objectiterator.hasNext()) {
         Entry entry = (Entry)objectiterator.next();
         class04907<?> class04907 = (class04907<?>)entry.getKey();
         int i = entry.getIntValue();
         ((class04453)this.L.T_4).O().N((class04453)this.L.T_4, class04907, i);
      }

      class05096 class05096 = (class05096)this.L.v_3;
      if (class05096 instanceof class04610 class04610) {
         class04610.N();
      }
   }

   @Override
   public void N(class08093 var1) {
      class00417.N(var1, this, this.L.B());
      if (!this.q.N(var1.N(), var1.y())) {
         m.debug("Got unhandled response to tag query {}", var1.N());
      }
   }

   @Override
   public void N(class00251 var1) {
      class00417.N(var1, this, this.L.B());
      class01756 class01756 = ((class04453)this.L.T_4).q();
      class01756.N(var1.N());
      this.N(class01756);
   }

   private void N(class01756 var1) {
      var1.y();
      this.NE.N(var1, this.Y);
      class05096 class05096 = (class05096)this.L.v_3;
      if (class05096 instanceof class05043) {
         ((class05043)class05096).i();
      }
   }

   @Override
   public void N(class08087 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 instanceof class07438) {
         class03556<class07084> class03556 = var1.y();
         class07055 class07055 = new class07055(class03556, var1.u(), var1.L(), var1.B(), var1.M(), var1.Z(), null);
         if (!var1.z()) {
            class07055.U();
         }

         ((class07438)class07049).method_26082(class07055, null);
      }
   }

   @Nullable
   public class03458 N(String var1) {
      for (class03458 class03458 : this.O.values()) {
         if (class03458.N().name().equals(var1)) {
            return class03458;
         }
      }

      return null;
   }

   @Nullable
   public class03458 N(UUID var1) {
      return this.O.get(var1);
   }

   @Override
   public void N(class00496 var1) {
      class00417.N(var1, this, this.L.B());
      class04453 class04453 = (class04453)this.L.T_4;
      class06584 class06584x = var1.L();
      int i = var1.y();
      this.L.yT().N(class06584x);
      class05096 class05096 = (class05096)this.L.v_3;
      boolean flag;
      if (class05096 instanceof class01488 class01488) {
         flag = !class01488.N();
      } else {
         flag = false;
      }

      if (var1.N() == 0) {
         if (class07492.N(i) && !class06584x.R()) {
            class06584 class06584x = class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.L(i).i();
            if (class06584x.R() || class06584x.c() < class06584x.c()) {
               class06584x.u(5);
            }
         }

         class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N(i, var1.u(), class06584x);
      } else if (var1.N() == ((class07482)class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b && (var1.N() != 0 || !flag)) {
         ((class07482)class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(i, var1.u(), class06584x);
      }

      if ((class05096)this.L.v_3 instanceof class01488) {
         class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N(i, class06584x);
         class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
      }
   }

   @Override
   public void N(class02580 var1) {
      class00417.N(var1, this, this.L.B());
      this.L.yT().N(var1.N());
      if (!((class05096)this.L.v_3 instanceof class01488)) {
         ((class07482)((class04453)this.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(var1.N());
      }
   }

   @Override
   public void N(class05873 var1) {
      class00417.N(var1, this, this.L.B());
      class05866.N(var1.y(), this.L, var1.N(), var1.L());
   }

   @Override
   public void N(class00499 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.L());
      class04453 class04453 = (class04453)this.L.T_4;
      int i = var1.y();
      class07075 class07075 = new class07075(class07610.N(i));
      if (class07049 instanceof class07862 class07862) {
         class07479 class07479 = new class07479(var1.N(), class04453.method_31548(), class07075, class07862, i);
         class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = class07479;
         this.L.N(new class05429(class07479, class04453.method_31548(), class07862, i));
      } else if (class07049 instanceof class08156 class08156) {
         class07570 class07570 = new class07570(var1.N(), class04453.method_31548(), class07075, class08156, i);
         class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = class07570;
         this.L.N(new class06533(class07570, class04453.method_31548(), class08156, i));
      }
   }

   @Override
   public void N(class00520 var1) {
      class00417.N(var1, this, this.L.B());
      class06889 class06889 = var1.N();
      ((class03448)this.L.T_3)
         .method_8486(
            class06889.N(),
            class06889.y(),
            class06889.L(),
            var1.B().N(),
            class04911.field_15245,
            4.0F,
            (1.0F + (((class03448)this.L.T_3).field_9229.z() - ((class03448)this.L.T_3).field_9229.z()) * 0.2F) * 0.7F,
            false
         );
      ((class03448)this.L.T_3).method_8406(var1.M(), class06889.N(), class06889.y(), class06889.L(), 1.0, 0.0, 0.0);
      ((class03448)this.L.T_3).N(class06889, var1.y(), var1.L(), var1.Z());
      var1.u().ifPresent(((class04453)this.L.T_4)::method_45319);
   }

   @Override
   public void N(class00444 var1) {
      class00417.N(var1, this, this.L.B());
      ((class03063)this.L.B_2).R.N(var1.N(), var1.y());
   }

   @Override
   public void N(class00474 var1) {
      class00417.N(var1, this, this.L.B());
      this.NR.N(this.Y.N(), var1.N());
   }

   @Override
   public void N(class00449 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 != null) {
         this.NR.N(this.Y.N(), class07049, var1.y());
      }
   }

   @Override
   public void N(class00437 var1) {
      class00417.N(var1, this, this.L.B());
      this.NR.N(this.Y.N(), var1.N(), var1.y());
   }

   @Override
   public void N(class06651 var1) {
      class00417.N(var1, this, this.L.B());
      class07209 class07209 = var1.N();
      if (this.Y.method_8321(class07209) instanceof class07267 class07267) {
         ((class04453)this.L.T_4).method_7311(class07267, var1.y());
      } else {
         Logger logger1 = m;
         class00394 class00394 = this.Y.method_8321(class07209);
         String sx = "Ignoring openTextEdit on an invalid entity: {} at pos {}";
         Logger logger = logger1;
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(var1);
         this.N(logger, sx, class00394, class07209, localrefimpl);
         var1 = (class06651)localrefimpl.dispose();
      }
   }

   @Override
   public void N(class00524 var1) {
      class00417.N(var1, this, this.L.B());
      class04453 class04453 = (class04453)this.L.T_4;
      if (var1.N() == 0) {
         class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.N(var1.y(), var1.L(), var1.u());
      } else if (var1.N() == ((class07482)class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b) {
         ((class07482)class04453.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).N(var1.y(), var1.L(), var1.u());
      }
   }

   @Override
   public void N(class02596 var1) {
      class00417.N(var1, this, this.L.B());
      this.L.yT().N(var1.y());
      ((class04453)this.L.T_4).method_31548().method_5447(var1.N(), var1.y());
   }

   public void N(String var1, @Nullable class05096 var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         switch (this.N(this, var1)) {
            case field_60786:
               class03961 class03961 = new class03961(var1);
               LocalRefImpl localrefimpl = new LocalRefImpl();
               localrefimpl.init(var1);
               this.N(this, class03961, localrefimpl);
               var1 = (String)localrefimpl.dispose();
               this.L.N(var2);
               break;
            case field_60787:
               this.N(var1, "multiplayer.confirm_command.parse_errors", var2);
               break;
            case field_60788:
               this.y(var1, "multiplayer.confirm_command.signature_required", var2);
               break;
            case field_60789:
               this.N(var1, "multiplayer.confirm_command.permissions_required", var2);
         }
      }
   }

   @Override
   public void N(class06635 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 instanceof class02607) {
         ((class02607)class07049).W(var1.y());
      }
   }

   private static class06584 N(class08036 var0) {
      for (class07050 class07050 : class07050.values()) {
         class06584 class06584 = var0.method_5998(class07050);
         if (class06584.L(class02484.e)) {
            return class06584;
         }
      }

      return new class06584(class06570.la);
   }

   @Override
   public void N(class00509 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = var1.N(this.Y);
      if (class07049 != null) {
         switch (var1.N()) {
            case 21:
               this.L.Nr().N((class00044)(new class00179((class07549)class07049)));
               break;
            case 35:
               byte b0 = 40;
               ((class04410)this.L.i_0).N(class07049, class07107.NP, 30);
               this.Y
                  .method_8486(
                     class07049.method_23317(),
                     class07049.method_23318(),
                     class07049.method_23321(),
                     class04909.QF,
                     class07049.method_5634(),
                     1.0F,
                     1.0F,
                     false
                  );
               if (class07049 == (class04453)this.L.T_4) {
                  class03386 class03386 = (class03386)this.L.i_5;
                  class06584 class06584 = N((class08036)((class04453)this.L.T_4));
                  CallbackInfo callbackinfo = new CallbackInfo("", true);
                  this.N(callbackinfo);
                  if (callbackinfo.isCancelled()) {
                     return;
                  }

                  class03386.N(class06584);
               }
               break;
            case 63:
               this.L.Nr().N((class00044)(new class03578((class01964)class07049)));
               break;
            default:
               class07049.method_5711(var1.N());
         }
      }
   }

   @Override
   public void N(class08079 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049x = this.Y.method_8469(var1.y());
      if (class07049x == null) {
         m.warn("Received passengers for unknown entity");
      } else {
         boolean flag = class07049x.method_5821((class04453)this.L.T_4);
         class07049x.method_5772();

         for (int i : var1.N()) {
            class07049 class07049x = this.Y.method_8469(i);
            if (class07049x != null) {
               class07049x.method_5873(class07049x, true, false);
               if (class07049x == (class04453)this.L.T_4) {
                  this.S = OptionalInt.empty();
                  if (!flag) {
                     if (this.N_29(class07049x, class00250.class)) {
                        ((class04453)this.L.T_4).field_5982 = class07049x.method_36454();
                        ((class04453)this.L.T_4).method_36456(class07049x.method_36454());
                        ((class04453)this.L.T_4).method_5847(class07049x.method_36454());
                     }

                     class05216 class05216 = class00392.N("mount.onboard", ((class05630)this.L.i_7).w.m());
                     ((class01056)this.L.i_6).N(class05216, false);
                     this.L.NT().u(class05216);
                  }
               }
            }
         }
      }
   }

   private static boolean N(ParseResults<?> var0) {
      return !var0.getReader().canRead() && var0.getExceptions().isEmpty() && var0.getContext().getLastChild().getCommand() != null;
   }

   private void N(String var1, String var2, class00392 var3, Runnable var4) {
      class05096 class05096 = (class05096)this.L.v_3;
      this.L.N(new class05733(var3x -> {
         if (var3x) {
            var4.run();
         } else {
            this.L.N(class05096);
         }
      }, v, class00392.N(var2, class00392.y(var1).N(class06541.field_1054)), var3, class05096 != null ? class05220.U : class05220.i));
   }

   private class05858 N(boolean var1, class05946<class07299> var2, class05946<class07299> var3) {
      class05858 class05858 = class05858.field_51489;
      if (!var1) {
         if (var2 == class07299.field_25180 || var3 == class07299.field_25180) {
            class05858 = class05858.field_51487;
         } else if (var2 == class07299.field_25181 || var3 == class07299.field_25181) {
            class05858 = class05858.field_51488;
         }
      }

      return class05858;
   }

   @Override
   public void N(class06643 var1) {
      class00417.N(var1, this, this.L.B());
      class04167 class04167 = var1.N();
      class05946<class07299> class05946 = class04167.y();
      class03556<class07376> class03556 = class04167.N();
      class04453 class04453x = (class04453)this.L.T_4;
      class05946<class07299> class05946x = class04453x.method_73183().method_27983();
      boolean flag = class05946 != class05946x;
      class05858 class05858 = this.N(class04453x.method_29504(), class05946, class05946x);
      if (flag) {
         Map<class02265, class07769> map = this.Y.m();
         boolean var10 = class04167.R();
         boolean flag2 = class04167.M();
         int i = class04167.z();
         class03427 class03427 = new class03427(this.Q.s(), this.Q.U(), flag2);
         this.Q = class03427;
         this.N(var1, null);
         this.Y = new class03448(this, class03427, class05946, class03556, this.K, this.V, (class03063)this.L.B_2, var10, class04167.L(), i);
         this.Y.N(map);
         this.L.N(this.Y);
         this.NR.y();
      }

      this.L.N(null);
      if (class04453x.method_45015()) {
         class04453x.method_7346();
      }

      class04453 class04453x;
      if (var1.N((byte)2)) {
         class04453x = ((class03443)this.L.T_2).N(this.Y, class04453x.O(), class04453x.q(), class04453x.l(), class04453x.method_5624());
      } else {
         class04453x = ((class03443)this.L.T_2).N(this.Y, class04453x.O(), class04453x.q());
      }

      this.N(false);
      class03448 class03448 = this.Y;
      if (this.N(this, class04453x, class03448, class05858, class05946)) {
         this.N(class04453x, class03448, class05858);
      }

      class04453x.method_5838(class04453x.method_5628());
      class06202 class06202 = this.L;
      Operation operation = var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_310, net.minecraft.class_746]");
         ((class06202)var0[0]).T_4 = (class04453)var0[1];
         return (Void)null;
      };
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(class04453x);
      this.N(class06202, class04453x, operation, var1, localrefimpl);
      class04453x = (class04453)localrefimpl.dispose();
      if (flag) {
         this.L.A().L();
      }

      this.L.N(class04453x);
      if (var1.N((byte)2)) {
         List<class02998<?>> list = class04453x.method_5841().L();
         if (list != null) {
            class04453x.method_5841().N(list);
         }

         class04453x.method_18799(class04453x.method_18798());
         class04453x.method_36456(class04453x.method_36454());
         class04453x.method_36457(class04453x.method_36455());
      } else {
         class04453x.w();
         class04453x.method_36456(-180.0F);
      }

      if (var1.N((byte)1)) {
         class04453x.method_6127().N(class04453x.method_6127());
      } else {
         class05320 class05320xx = class04453x.method_6127();
         class05320 class05320x = class04453x.method_6127();
         class05320 class05320xx = class05320xx;
         if (this.N(class05320xx, class05320x)) {
            class05320xx.y(class05320x);
         }
      }

      this.Y.u(class04453x);
      class04453x.L_1 = new class04462((class05630)this.L.i_7);
      ((class03443)this.L.T_2).N(class04453x);
      class04453x.method_7268(class04453x.method_7302());
      class04453x.L(class04453x.Q());
      class04453x.method_43120(class04167.B());
      class04453x.method_51850(class04167.Z());
      class04453x.B_3 = (Float)class04453x.B_3;
      class04453x.i_0 = (Float)class04453x.i_0;
      if ((class05096)this.L.v_3 instanceof class05345 || (class05096)this.L.v_3 instanceof class10511) {
         this.L.N(null);
      }

      ((class03443)this.L.T_2).N(class04167.u(), class04167.i());
   }

   @Override
   public void N(class08060 var1) {
      class00417.N(var1, this, this.L.B());
      ((class04453)this.L.T_4).N(var1.N(), var1.y(), var1.L());
   }

   @Override
   public void N(class08095 var1) {
      class00417.N(var1, this, this.L.B());
      ((class04453)this.L.T_4).y(var1.N());
      ((class04453)this.L.T_4).method_7344().N(var1.y());
      ((class04453)this.L.T_4).method_7344().y(var1.L());
   }

   @Override
   public void N(class01938 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 != null) {
         class07049.method_48922(var1.N(this.Y));
      }
   }

   public void N(class04469 var1, boolean var2) {
      if (this.r.N(var1, var2) && this.r.L() > 64) {
         this.c();
      }
   }

   @Override
   public void N(class05871 var1) {
      class00417.N(var1, this, this.L.B());
      class07482 class07482 = (class07482)((class04453)this.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
      if (var1.N() == class07482.b && class07482 instanceof class06952 class06952) {
         class06952.N(var1.y());
         class06952.R(var1.u());
         class06952.M(var1.L());
         class06952.N(var1.M());
         class06952.y(var1.B());
      }
   }

   private void N(int var1, int var2, class01832 var3, boolean var4) {
      class05795 class05795 = this.Y.method_8398().L();
      BitSet bitset = var3.N();
      BitSet bitset1 = var3.y();
      Iterator<byte[]> iterator = var3.L().iterator();
      this.N(var1, var2, class05795, class00772.field_9284, bitset, bitset1, iterator, var4);
      BitSet bitset2 = var3.u();
      BitSet bitset3 = var3.i();
      Iterator<byte[]> iterator1 = var3.R().iterator();
      this.N(var1, var2, class05795, class00772.field_9282, bitset2, bitset3, iterator1, var4);
      class05795.N(new class07321(var1, var2), true);
      this.N(var1, var2, var3, var4, null);
   }

   @Override
   public void N(class00504 var1) {
      class00417.N(var1, this, this.L.B());
      int i = var1.N();
      int jx = var1.y();
      class01832 class01832 = var1.L();
      this.Y.N((Runnable)(() -> this.N(i, jx, class01832, true)));
   }

   @Override
   public void N(class06636 var1) {
      class00417.N(var1, this, this.L.B());
      if (((class07482)((class04453)this.L.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b == var1.N()) {
         class05096 class05096 = (class05096)this.L.v_3;
         if (class05096 instanceof class05043) {
            ((class05043)class05096).N(var1.y());
         }
      }
   }

   @Override
   public void N(class08091 var1) {
      class00417.N(var1, this, this.L.B());
      String sx = var1.N();
      if (var1.L() == 0) {
         this.Nz.N(sx, class06675.y, var1.y(), var1.u(), false, var1.M().orElse(null));
      } else {
         class00518 class00518 = this.Nz.N(sx);
         if (class00518 != null) {
            if (var1.L() == 1) {
               this.Nz.y(class00518);
            } else if (var1.L() == 2) {
               class00518.N(var1.u());
               class00518.N(var1.y());
               class00518.y(var1.M().orElse(null));
            }
         }
      }
   }

   @Override
   public void N(class05705 var1) {
      class00417.N(var1, this, this.L.B());
      this.K = var1.N();
      ((class05630)this.L.i_7).y(this.K);
      this.Y.method_8398().N(var1.N());
      this.N(var1, null);
   }

   @Override
   public void N(class04022 var1) {
      class00417.N(var1, this, this.L.B());
      this.V = var1.N();
      this.Y.y(this.V);
   }

   @Override
   public void N(class01785 var1) {
      class00417.N(var1, this, this.L.B());
      String sx = var1.y();
      class01766 class01766 = class01766.N(var1.N());
      if (sx == null) {
         this.Nz.N(class01766);
      } else {
         class00518 class00518 = this.Nz.N(sx);
         if (class00518 != null) {
            this.Nz.L(class01766, class00518);
         } else {
            m.warn("Received packet for unknown scoreboard objective: {}", sx);
         }
      }
   }

   @Override
   public void N(class08049 var1) {
      class00417.N(var1, this, this.L.B());
      String sx = var1.y();
      class01766 class01766 = class01766.N(var1.N());
      class00518 class00518 = this.Nz.N(sx);
      if (class00518 != null) {
         class01765 class01765 = this.Nz.N(class01766, class00518, true);
         class01765.N(var1.L());
         class01765.N(var1.u().orElse(null));
         class01765.N(var1.M().orElse(null));
      } else {
         m.warn("Received packet for unknown scoreboard objective: {}", sx);
      }
   }

   @Override
   public void N(class06642 var1) {
      class00417.N(var1, this, this.L.B());
      String sx = var1.y();
      class00518 class00518 = sx == null ? null : this.Nz.N(sx);
      this.Nz.N(var1.N(), class00518);
   }

   @Override
   public void N(class02565 var1) {
      class00417.N(var1, this, this.L.B());
      class02724 class02724x = var1.y();
      class00502 class00502;
      if (class02724x == class02724.field_29155) {
         class00502 = this.Nz.L(var1.L());
      } else {
         class00502 = this.Nz.y(var1.L());
         if (class00502 == null) {
            m.warn("Received packet for unknown team {}: team action: {}, player action: {}", new Object[]{var1.L(), var1.y(), var1.N()});
            return;
         }
      }

      var1.M().ifPresent(var1x -> {
         class00502.N(var1x.N());
         class00502.N(var1x.L());
         class00502.N(var1x.y());
         class00502.N(var1x.u());
         class00502.N(var1x.i());
         class00502.y(var1x.R());
         class00502.L(var1x.M());
      });
      class02724 class02724x = var1.N();
      if (class02724x == class02724.field_29155) {
         for (String sx : var1.u()) {
            this.Nz.N(sx, class00502);
         }
      } else if (class02724x == class02724.field_29156) {
         for (String s1 : var1.u()) {
            this.Nz.y(s1, class00502);
         }
      }

      if (class02724x == class02724.field_29156) {
         this.Nz.N(class00502);
      }
   }

   @Override
   public void N(class00495 var1) {
      class00417.N(var1, this, this.L.B());
      if (var1.E() == 0) {
         double d0 = var1.U() * var1.B();
         double d2 = var1.U() * var1.Z();
         double d4 = var1.U() * var1.z();

         try {
            this.Y.method_8466(var1.W(), var1.N(), var1.y(), var1.L(), var1.u(), var1.M(), d0, d2, d4);
         } catch (Throwable throwable1) {
            m.warn("Could not spawn particle effect {}", var1.W());
         }
      } else {
         for (int i = 0; i < var1.E(); i++) {
            double d1 = this.e.E() * var1.B();
            double d3 = this.e.E() * var1.Z();
            double d5 = this.e.E() * var1.z();
            double d6 = this.e.E() * var1.U();
            double d7 = this.e.E() * var1.U();
            double d8 = this.e.E() * var1.U();

            try {
               this.Y.method_8466(var1.W(), var1.N(), var1.y(), var1.L() + d1, var1.u() + d3, var1.M() + d5, d6, d7, d8);
            } catch (Throwable throwable) {
               m.warn("Could not spawn particle effect {}", var1.W());
               return;
            }
         }
      }
   }

   @Override
   public void N(class08056 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 != null) {
         if (!(class07049 instanceof class07438)) {
            throw new IllegalStateException("Server tried to update attributes of a non-living entity (actually: " + class07049 + ")");
         } else {
            class05320 class05320 = ((class07438)class07049).method_6127();

            for (class08085 class08085 : var1.y()) {
               class07469 class07469 = class05320.N(class08085.N());
               if (class07469 == null) {
                  m.warn("Entity {} does not have attribute {}", class07049, class08085.N().M());
               } else {
                  class07469.N(class08085.y());
                  class07469.R();

                  for (class07471 class07471 : class08085.L()) {
                     class07469.y(class07471);
                  }
               }
            }
         }
      }
   }

   @Override
   public void N(class01658 var1) {
      this.Nu.N(var1.N());
      this.N(new class04175(this.Nu.y()));
   }

   @Override
   public void N(class00427 var1) {
      class00417.N(var1, this, this.L.B());
      this.NR.N(this.Y.N(), var1.N(), var1.y());
   }

   @Override
   public void N(class01632 var1) {
      this.Nu.N();
   }

   @Override
   public void N(class02655 var1) {
      class00417.N(var1, this, this.L.B());
      class07049 class07049 = this.Y.method_8469(var1.N());
      if (class07049 instanceof class08039) {
         ((class08039)class07049).L = var1.y();
      }
   }

   @Override
   public void N(class00014 var1) {
      class00417.N(var1, this, this.L.B());
      var1.N(this.NU);
   }

   @Override
   public void N(class08621 var1) {
      class00417.N(var1, this, this.L.B());
      class05096 class05096 = (class05096)this.L.v_3;
      if (class05096 instanceof class00231) {
         ((class00231)class05096).N(var1.N(), var1.y());
      }
   }

   @Override
   public void N(class07832 var1) {
      this.Ni.N(var1);
   }

   @Override
   public void N(class02861 var1) {
      this.L.ND().N(var1.N(), var1.y());
   }

   @Override
   public void N(class03284 var1) {
      class00417.N(var1, this, this.L.B());
      Iterator<class00381<? super class07280>> iterator = var1.N().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_65081(this);
      }
   }

   @Override
   public void N(class04622 var1) {
      class00417.N(var1, this, this.L.B());
      this.Y.N(var1.N());
   }

   @Override
   public void N(class05707 var1) {
      class00417.N(var1, this, this.L.B());
      this.Y.method_8398().u(var1.N(), var1.y());
   }

   @Override
   public boolean method_48106() {
      return this.u.method_10758() && !this.NZ;
   }

   public class01707 W() {
      return this.I;
   }

   public class00272 R() {
      return this.c;
   }

   private void R(class00482 var1, CallbackInfo var2) {
      LegacyTabList.globalTablistIndex = 0;
      ((class01056)class06202.Nq().i_6).Z().viaFabricPlusVisuals$setMaxPlayers(var1.u());
   }

   public String R(String var1) {
      class10963 class10963 = class10963.y(var1);
      class11938.L().L(class10963);
      return class10963.N();
   }

   public class00057 O() {
      return this.NU;
   }

   private boolean H() {
      return this.L.n().y() && this.NB;
   }

   public class03767 G() {
      return this.F;
   }

   public class08666 Y() {
      return this.NE;
   }

   @Override
   public void method_18784() {
      if (this.x != null && this.L.c().y()) {
         this.v();
      }

      if (this.Ny != null && this.Ny.isDone()) {
         this.Ny.join().ifPresent(this::N);
         this.Ny = null;
      }

      this.K();
      if (this.L.ND().u()) {
         this.Ni.N();
      }

      if (this.Y != null) {
         this.NR.N(this.Y.N());
      }

      this.M.N();
      if (this.NM != null) {
         this.NM.N();
         if (this.NM.y()) {
            this.X();
            this.NM = null;
         }
      }
   }

   @Nullable
   public class07233 fabric_api$getLastReceivedCommandsPacket() {
      return this.Ns;
   }
}
