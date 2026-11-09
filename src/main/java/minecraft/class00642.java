package minecraft;

import Nursultan.class09175;
import Nursultan.class09379;
import Nursultan.class09380;
import Nursultan.class09381;
import Nursultan.class09700;
import Nursultan.class10961;
import Nursultan.class10965;
import Nursultan.class10990;
import Nursultan.class11797;
import Nursultan.class11938;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.PacketEvent;
import baritone.api.event.events.type.EventState;
import com.google.common.collect.Queues;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.base.bedrock.NetherNetInetSocketAddress;
import com.viaversion.viafabricplus.base.bedrock.NetherNetJsonRpcAddress;
import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.injection.access.base.ILocalSampleLogger;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.netty.RakNetPingEncapsulationCodec;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.platform.ViaChannelInitializer;
import de.maxhenkel.voicechat.mixin.ConnectionAccessor;
import dev.kastle.netty.channel.nethernet.NetherNetChannelFactory;
import dev.kastle.netty.channel.nethernet.signaling.NetherNetXboxRpcSignaling;
import dev.kastle.netty.channel.nethernet.signaling.NetherNetXboxSignaling;
import dev.kastle.webrtc.PeerConnectionFactory;
import io.netty.bootstrap.AbstractBootstrap;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.EpollDatagramChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.kqueue.KQueueSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.flow.FlowControlHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.ClosedChannelException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import net.fabricmc.fabric.impl.attachment.sync.SupportedAttachmentsClientConnection;
import net.fabricmc.fabric.impl.networking.ChannelInfoHolder;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.PacketCallbackListener;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;
import net.fabricmc.fabric.impl.networking.VanillaPacketTypes;
import net.fabricmc.fabric.impl.networking.splitter.FabricPacketMerger;
import net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter;
import net.fabricmc.fabric.impl.recipe.ingredient.SupportedIngredientsClientConnection;
import net.fabricmc.fabric.impl.recipe.sync.SyncedSerializerAwareClientConnection;
import net.raphimc.minecraftauth.bedrock.model.MinecraftSession;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.viabedrock.protocol.RakNetStatusProtocol;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.cloudburstmc.netty.channel.raknet.RakChannelFactory;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00642
   extends SimpleChannelInboundHandler<class00381<?>>
   implements class11797,
   IConnection,
   ConnectionAccessor,
   SupportedAttachmentsClientConnection,
   ChannelInfoHolder,
   SupportedIngredientsClientConnection,
   SyncedSerializerAwareClientConnection {
   private static final float field_33280 = 0.75F;
   private static final Logger field_11642 = LogUtils.getLogger();
   public static final Marker field_11641 = MarkerFactory.getMarker("NETWORK");
   public static final Marker field_11639 = class07536.N(MarkerFactory.getMarker("NETWORK_PACKETS"), var0 -> var0.add(field_11641));
   public static final Marker field_36379 = class07536.N(MarkerFactory.getMarker("PACKET_RECEIVED"), var0 -> var0.add(field_11639));
   public static final Marker field_36380 = class07536.N(MarkerFactory.getMarker("PACKET_SENT"), var0 -> var0.add(field_11639));
   private static final class04275<class07825> field_48514 = class04263.y;
   public final class00423 field_11643;
   private volatile boolean field_48515;
   public final Queue<Consumer<class00642>> field_45668;
   public Channel field_11651;
   private SocketAddress field_11645;
   @Nullable
   private volatile class00638 field_45669;
   @Nullable
   private volatile class00638 field_11652;
   @Nullable
   private class02570 field_52180;
   private boolean field_11647;
   private boolean field_11646;
   private int field_11658;
   private int field_11656;
   private float field_11654;
   private float field_11653;
   private int field_11655;
   private boolean field_11640;
   @Nullable
   private volatile class02570 field_44972;
   @Nullable
   public class03706 field_45955;
   private Set supportedAttachments = new HashSet();
   private Map playChannels;
   private Set fabric_supportedCustomIngredients = Set.of();
   private Set syncedRecipeSerializers = Set.of();
   private UserConnection viaFabricPlus$userConnection;
   private ProtocolVersion viaFabricPlus$serverVersion;
   private Cipher viaFabricPlus$decryptionCipher;

   public class00642(class00423 var1) {
      super();
      this.field_48515 = true;
      this.field_45668 = Queues.newConcurrentLinkedQueue();
      this.field_11643 = var1;
      this.m_handler$zil000$fabric_networking_api_v1$initAddedFields_7(var1, null);
   }

   public void method_10747(class00392 var1) {
      this.method_60924(new class02570(var1));
   }

   public UserConnection viaFabricPlus$getUserConnection() {
      return this.viaFabricPlus$userConnection;
   }

   public void viaFabricPlus$setUserConnection(UserConnection var1) {
      this.viaFabricPlus$userConnection = var1;
   }

   public ProtocolVersion viaFabricPlus$getTargetVersion() {
      return this.viaFabricPlus$serverVersion;
   }

   public void exceptionCaught(ChannelHandlerContext var1, Throwable var2) {
      this.handler$daa000$viafabricplus$printNetworkingErrors(var1, var2, null);
      if (var2 instanceof class09175) {
         field_11642.debug("Skipping packet due to errors", var2.getCause());
      } else {
         boolean flag = !this.field_11640;
         this.field_11640 = true;
         if (this.field_11651.isOpen()) {
            if (var2 instanceof TimeoutException) {
               field_11642.debug("Timeout", var2);
               this.method_10747(class00392.L("disconnect.timeout"));
            } else {
               class05216 class05216 = class00392.N("disconnect.genericReason", "Internal Exception: " + var2);
               class00638 class00638 = this.field_11652;
               class02570 class02570;
               if (class00638 != null) {
                  class02570 = class00638.N(class05216, var2);
               } else {
                  class02570 = new class02570(class05216);
               }

               if (flag) {
                  field_11642.debug("Failed to sent packet", var2);
                  if (this.method_36122() == class00423.field_11942) {
                     Object object = this.field_48515 ? new class07814(class05216) : new class00501(class05216);
                     this.method_10752((class00381<?>)object, class03041.N(() -> this.method_60924(class02570)));
                  } else {
                     this.method_60924(class02570);
                  }

                  this.method_10757();
               } else {
                  field_11642.debug("Double fault", var2);
                  this.method_60924(class02570);
               }
            }
         }
      }
   }

   public void userEventTriggered(ChannelHandlerContext var1, Object var2) throws Exception {
      if (var2.getClass().getName().equals("me.steinborn.krypton.mod.shared.misc.KryptonPipelineEvent") && var2.toString().equals("COMPRESSION_ENABLED")) {
         ViaChannelInitializer.reorderPipeline(var1.pipeline(), "compress", "decompress");
         ViaFabricPlusImpl.INSTANCE
            .getLogger()
            .warn(
               "ViaFabricPlus has detected that the Krypton mod is installed. Please note that Krypton is mostly snake oil on the client side, and it is not recommended to use it."
            );
      } else {
         super.userEventTriggered(var1, var2);
      }
   }

   public void channelActive(ChannelHandlerContext var1) throws Exception {
      if (this.wrapWithCondition$cpl000$viafabricplus$dontCallChannelActiveTwice(this, var1)) {
         super.channelActive(var1);
      }

      this.field_11651 = var1.channel();
      this.field_11645 = this.field_11651.remoteAddress();
      if (this.field_44972 != null) {
         this.method_60924(this.field_44972);
      }
   }

   public void channelInactive(ChannelHandlerContext var1) {
      this.m_handler$zil000$fabric_networking_api_v1$disconnectAddon_9(var1, null);
      this.method_10747(class00392.L("disconnect.endOfStream"));
   }

   public void channelRegistered(ChannelHandlerContext var1) throws Exception {
      super.channelRegistered(var1);
      if (BedrockProtocolVersion.bedrockLatest.equals(this.viaFabricPlus$getTargetVersion())) {
         this.channelActive(var1);
      }
   }

   public Set fabric_getSupportedAttachments() {
      return this.supportedAttachments;
   }

   private void handler$cem000$nursultan$onSend(class00381 var1, ChannelFutureListener var2, boolean var3, CallbackInfo var4) {
      if (var1.method_65080().N() != class00423.field_11942) {
         class10965 class10965 = new class10965(var1);
         class11938.L().L(class10965);
         if (class10965.y()) {
            var4.cancel();
         }
      }
   }

   public void viaFabricPlus$setTargetVersion(ProtocolVersion var1) {
      this.viaFabricPlus$serverVersion = var1;
   }

   private static void handler$cph000$viafabricplus$setTargetVersion(
      InetSocketAddress var0, class00606 var1, class00642 var2, CallbackInfoReturnable var3, LocalRef var4
   ) {
      ProtocolVersion protocolversion = var2.viaFabricPlus$getTargetVersion();
      if (protocolversion == null) {
         protocolversion = ProtocolTranslator.getTargetVersion();
      }

      if (protocolversion == ProtocolTranslator.AUTO_DETECT_PROTOCOL) {
         protocolversion = ProtocolTranslator.NATIVE_VERSION;
      }

      var2.viaFabricPlus$setTargetVersion(protocolversion);
   }

   private static void handler$cph000$viafabricplus$setTargetVersion(
      InetSocketAddress var0, class00606 var1, class02270 var2, CallbackInfoReturnable var3, class00642 var4
   ) {
      if (var2 instanceof ILocalSampleLogger ilocalsamplelogger && ilocalsamplelogger.viaFabricPlus$getForcedVersion() != null) {
         var4.viaFabricPlus$setTargetVersion(ilocalsamplelogger.viaFabricPlus$getForcedVersion());
      }
   }

   private void handler$daa000$viafabricplus$printNetworkingErrors(ChannelHandlerContext var1, Throwable var2, CallbackInfo var3) {
      if ((Boolean)DebugSettings.INSTANCE.printNetworkingErrorsToLogs.getValue()) {
         if (var2 instanceof SocketException || var2 instanceof ConnectException) {
            return;
         }

         ViaFabricPlusImpl.INSTANCE.getLogger().error("An exception occurred while handling a packet", var2);
      }
   }

   private static void handler$cpl001$viafabricplus$setTargetVersion(
      InetSocketAddress var0, class00606 var1, class00642 var2, CallbackInfoReturnable var3, LocalRef var4
   ) {
      ProtocolVersion protocolversion = var2.viaFabricPlus$getTargetVersion();
      if (BedrockProtocolVersion.bedrockLatest.equals(protocolversion) && (var1.u() == KQueueSocketChannel.class || var0 instanceof NetherNetInetSocketAddress)
         )
       {
         class00606 class00606 = class00606.N(false);
         class00606.viaFabricPlus$setConnecting(var1.viaFabricPlus$isConnecting());
         var4.set(class00606);
      }
   }

   private void handler$cph000$viafabricplus$reorderCompression(int var1, boolean var2, CallbackInfo var3) {
      ViaChannelInitializer.reorderPipeline(this.field_11651.pipeline(), "compress", "decompress");
   }

   private void handler$cem000$nursultan$onChannelRead0Post(ChannelHandlerContext var1, class00381 var2, CallbackInfo var3) {
      if (this.field_11643 != class00423.field_11941) {
         if (var2 instanceof class03260) {
            for (class00381 class00381 : ((class03260)var2).N()) {
               class11938.L().L(new class10961(class00381));
            }
         } else {
            class11938.L().L(new class10961(var2));
         }
      }
   }

   private void handler$cph000$viafabricplus$storeDecryptionCipher(Cipher var1, Cipher var2, CallbackInfo var3) {
      if (this.viaFabricPlus$serverVersion != null && this.viaFabricPlus$serverVersion.olderThanOrEqualTo(LegacyProtocolVersion.r1_6_4)) {
         var3.cancel();
         this.viaFabricPlus$decryptionCipher = var1;
         if (var2 == null) {
            throw new IllegalStateException("Encryption cipher is null");
         }

         this.field_11647 = true;
         this.field_11651.pipeline().addBefore("vialegacy-pre-netty-length-remover", "encrypt", new class00666(var2));
      }
   }

   public void method_56329(class04275<?> var1) {
      if (var1.y() != this.method_36122()) {
         throw new IllegalStateException("Invalid outbound protocol: " + var1.N());
      } else {
         class02400 class02400x = class04285.y(var1);
         class03276 class03276 = var1.u();
         if (class03276 != null) {
            class03258 class03258 = new class03258(class03276);
            class02400x = class02400x.N(var1x -> var1x.pipeline().addAfter("encoder", "unbundler", class03258));
         }

         boolean flag = var1.N() == class00648.field_20593;
         Channel channel = this.field_11651;
         class02400 class02400x = class02400x.N(var2x -> this.field_48515 = flag);
         method_59851(channel.writeAndFlush(this.m_modify$zil000$fabric_networking_api_v1$injectFabricPacketSlitterHandlerOutbound_4(class02400x, var1)));
      }
   }

   public boolean method_10758() {
      return this.field_11651 != null && this.field_11651.isOpen();
   }

   public SocketAddress method_10755() {
      return this.field_11645;
   }

   public void method_52915() {
      if (this.method_10758()) {
         this.method_52918();
      } else {
         this.field_45668.add(class00642::method_52918);
      }
   }

   public void method_52906(class00381<?> var1, @Nullable ChannelFutureListener var2, boolean var3) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.handler$cem000$nursultan$onSend(var1, var2, var3, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (this.method_10758()) {
            this.method_10751();
            this.method_10764(var1, var2, var3);
         } else {
            this.field_45668.add(var3x -> var3x.method_10764(var1, var2, var3));
         }
      }
   }

   public void method_10757() {
      if (this.field_11651 != null) {
         this.field_11651.config().setAutoRead(false);
      }
   }

   public void method_10752(class00381<?> var1, @Nullable ChannelFutureListener var2) {
      this.method_52906(var1, var2, true);
   }

   public void method_60924(class02570 var1) {
      if (this.field_11651 == null) {
         this.field_44972 = var1;
      }

      if (this.method_10758()) {
         this.field_11651.close().awaitUninterruptibly();
         this.field_52180 = var1;
      }
   }

   public void method_10768() {
      if (this.field_11651 != null && !this.field_11651.isOpen()) {
         if (this.field_11646) {
            field_11642.warn("handleDisconnection() called twice");
         } else {
            this.field_11646 = true;
            class00638 class00638x = this.method_10744();
            class00638 class00638x = class00638x != null ? class00638x : this.field_45669;
            if (class00638x != null) {
               class02570 class02570 = Objects.requireNonNullElseGet(this.method_60926(), () -> new class02570(class00392.L("multiplayer.disconnect.generic")));
               this.m_handler$zil000$fabric_networking_api_v1$disconnectAddon_9(null);
               class00638x.method_10839(class02570);
            }
         }
      }
   }

   private boolean wrapWithCondition$cpl000$viafabricplus$dontCallChannelActiveTwice(SimpleChannelInboundHandler var1, ChannelHandlerContext var2) {
      return !BedrockProtocolVersion.bedrockLatest.equals(this.viaFabricPlus$getTargetVersion());
   }

   private static boolean wrapWithCondition$cph000$viafabricplus$dontSetPerformanceLog(class00642 var0, class02270 var1) {
      return !(var1 instanceof ILocalSampleLogger) || var1.viaFabricPlus$getForcedVersion() == null;
   }

   public Set fabric_getSyncedRecipeSerializers() {
      return this.syncedRecipeSerializers;
   }

   public Collection fabric_getPendingChannelsNames(class00648 var1) {
      return this.playChannels.computeIfAbsent(var1, var0 -> Collections.newSetFromMap(new ConcurrentHashMap()));
   }

   public void fabric_setSyncedRecipeSerializers(Set var1) {
      this.syncedRecipeSerializers = var1;
   }

   public class00423 method_36122() {
      return this.field_11643.N();
   }

   public void channelRead0(ChannelHandlerContext var1, class00381<?> var2) {
      if (!this.field_11651.isOpen()) {
         this.handler$zzo000$baritone$postProcessPacket(var1, var2, null);
      } else {
         class00638 class00638 = this.field_11652;
         if (class00638 == null) {
            throw new IllegalStateException("Received a packet before the packet listener was initialized");
         } else {
            if (class00638.method_52413(var2)) {
               try {
                  this.handler$zzo000$baritone$preProcessPacket(var1, var2, null);
                  CallbackInfo callbackinfo = new CallbackInfo("", true);
                  this.handler$cem000$nursultan$onChannelRead0(var1, var2, callbackinfo);
                  if (callbackinfo.isCancelled()) {
                     return;
                  }

                  method_10759(var2, class00638);
               } catch (class03096 class03096) {
               } catch (RejectedExecutionException rejectedexecutionexception) {
                  this.method_10747(class00392.L("multiplayer.disconnect.server_shutdown"));
               } catch (ClassCastException classcastexception) {
                  field_11642.error("Received {} that couldn't be processed", var2.getClass(), classcastexception);
                  this.method_10747(class00392.L("multiplayer.disconnect.invalid_packet"));
               }

               this.field_11658++;
               this.handler$cem000$nursultan$onChannelRead0Post(var1, var2, null);
            }

            this.handler$zzo000$baritone$postProcessPacket(var1, var2, null);
         }
      }
   }

   public void method_10746(Cipher var1, Cipher var2) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.handler$cph000$viafabricplus$storeDecryptionCipher(var1, var2, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.field_11647 = true;
         this.field_11651.pipeline().addBefore("splitter", "decrypt", new class00633(var1));
         this.field_11651.pipeline().addBefore("prepender", "encrypt", new class00666(var2));
      }
   }

   public boolean method_10771() {
      return this.field_11647;
   }

   public boolean method_10756() {
      return this.field_11651 instanceof LocalChannel || this.field_11651 instanceof LocalServerChannel;
   }

   public void viaFabricPlus$setupPreNettyDecryption() {
      if (this.viaFabricPlus$decryptionCipher == null) {
         throw new IllegalStateException("Decryption cipher is null");
      } else {
         this.field_11647 = true;
         this.field_11651.pipeline().addBefore("vialegacy-pre-netty-length-prepender", "decrypt", new class00633(this.viaFabricPlus$decryptionCipher));
      }
   }

   public void method_10760(int var1, boolean var2) {
      if (var1 >= 0) {
         if (this.field_11651.pipeline().get("decompress") instanceof class00634 class00634) {
            class00634.N(var1, var2);
         } else {
            this.field_11651.pipeline().addAfter("splitter", "decompress", new class00634(var1, var2));
         }

         if (this.field_11651.pipeline().get("compress") instanceof class00671 class00671) {
            class00671.N(var1);
         } else {
            this.field_11651.pipeline().addAfter("prepender", "compress", new class00671(var1));
         }
      } else {
         if (this.field_11651.pipeline().get("decompress") instanceof class00634) {
            this.field_11651.pipeline().remove("decompress");
         }

         if (this.field_11651.pipeline().get("compress") instanceof class00671) {
            this.field_11651.pipeline().remove("compress");
         }
      }

      this.handler$cph000$viafabricplus$reorderCompression(var1, var2, null);
   }

   public float method_10745() {
      return this.field_11653;
   }

   public float method_10762() {
      return this.field_11654;
   }

   public void fabric_setSupportedCustomIngredients(Set var1) {
      this.fabric_supportedCustomIngredients = var1;
   }

   private Object m_modify$zil000$fabric_networking_api_v1$injectFabricPacketSlitterHandlerOutbound_4(Object var1, class04275 var2) {
      PayloadTypeRegistryImpl<?> payloadtyperegistryimpl = PayloadTypeRegistryImpl.get(var2);
      return payloadtyperegistryimpl == null ? var1 : ((class02400)var1).N(var1x -> {
         FabricPacketSplitter fabricpacketsplitter = new FabricPacketSplitter((class00657)var1x.pipeline().get(class00657.class), payloadtyperegistryimpl);
         var1x.pipeline().addAfter("encoder", "fabric:splitter", fabricpacketsplitter);
      });
   }

   private static AbstractBootstrap wrapOperation$cpl000$viafabricplus$useRakNetChannelFactory$mixinextras$bridge$114(
      Bootstrap var0, Class var1, Operation var2, LocalRef var3, LocalRef var4
   ) {
      return wrapOperation$cpl000$viafabricplus$useRakNetChannelFactory(var0, var1, var2, (InetSocketAddress)var3.get(), (class00642)var4.get());
   }

   private Object m_modify$zil000$fabric_networking_api_v1$injectFabricPacketSlitterHandlerInbound_6(Object var1, class04275 var2) {
      PayloadTypeRegistryImpl<?> payloadtyperegistryimpl = PayloadTypeRegistryImpl.get(var2);
      return payloadtyperegistryimpl == null
         ? var1
         : ((class02403)var1)
            .N(
               var2x -> {
                  FabricPacketMerger fabricpacketmerger = new FabricPacketMerger(
                     (class00658)var2x.pipeline().get(class00658.class), payloadtyperegistryimpl, VanillaPacketTypes.get(var2)
                  );
                  var2x.pipeline().addAfter("decoder", "fabric:merger", fabricpacketmerger);
               }
            );
   }

   private static ChannelFuture wrapOperation$cpl000$viafabricplus$useRakNetPingHandlers$mixinextras$bridge$115(
      Bootstrap var0, InetAddress var1, int var2, Operation var3, LocalRef var4, LocalRef var5, LocalRef var6
   ) {
      return wrapOperation$cpl000$viafabricplus$useRakNetPingHandlers(
         var0, var1, var2, var3, (InetSocketAddress)var4.get(), (class00642)var5.get(), (class00606)var6.get()
      );
   }

   public void fabric_setSupportedAttachments(Set var1) {
      this.supportedAttachments = var1;
   }

   public void method_10743(class00381<?> var1) {
      this.method_10752(var1, null);
   }

   private void handler$zzo000$baritone$preDispatchPacket(class00381 var1, ChannelFutureListener var2, boolean var3, CallbackInfo var4) {
      if (this.field_11643 == class00423.field_11942) {
         for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (ibaritone.getPlayerContext().player() != null && ((class01683)ibaritone.getPlayerContext().player().y_0).M() == this) {
               ibaritone.getGameEventHandler().onSendPacket(new PacketEvent(this, EventState.PRE, var1));
            }
         }
      }
   }

   private void handler$zzo000$baritone$postProcessPacket(ChannelHandlerContext var1, class00381 var2, CallbackInfo var3) {
      if (this.field_11651.isOpen() && this.field_11643 == class00423.field_11942) {
         for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (ibaritone.getPlayerContext().player() != null && ((class01683)ibaritone.getPlayerContext().player().y_0).M() == this) {
               ibaritone.getGameEventHandler().onReceivePacket(new PacketEvent(this, EventState.POST, var2));
            }
         }
      }
   }

   private void handler$cem000$nursultan$onChannelRead0(ChannelHandlerContext var1, class00381 var2, CallbackInfo var3) {
      class00642 class00642 = this;
      if (this.field_11643 != class00423.field_11941) {
         if (var2 instanceof class03260) {
            Iterator iterator = ((class03260)var2).N().iterator();

            while (iterator.hasNext()) {
               class00381 class00381 = (class00381)iterator.next();
               class10990 class10990x = new class10990(class00381, class00642);
               class11938.L().L(class10990x);
               if (class10990x.y()) {
                  iterator.remove();
               }
            }
         } else {
            class10990 class10990 = new class10990(var2, this);
            class11938.L().L(class10990);
            if (class10990.y()) {
               var3.cancel();
            }
         }
      }
   }

   private void handler$zzo000$baritone$postDispatchPacket(class00381 var1, ChannelFutureListener var2, boolean var3, CallbackInfo var4) {
      if (this.field_11643 == class00423.field_11942) {
         for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (ibaritone.getPlayerContext().player() != null && ((class01683)ibaritone.getPlayerContext().player().y_0).M() == this) {
               ibaritone.getGameEventHandler().onSendPacket(new PacketEvent(this, EventState.POST, var1));
            }
         }
      }
   }

   private void handler$zzo000$baritone$preProcessPacket(ChannelHandlerContext var1, class00381 var2, CallbackInfo var3) {
      if (this.field_11643 == class00423.field_11942) {
         for (IBaritone ibaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (ibaritone.getPlayerContext().player() != null && ((class01683)ibaritone.getPlayerContext().player().y_0).M() == this) {
               ibaritone.getGameEventHandler().onReceivePacket(new PacketEvent(this, EventState.PRE, var2));
            }
         }
      }
   }

   public Set fabric_getSupportedCustomIngredients() {
      return this.fabric_supportedCustomIngredients;
   }

   private static ChannelOutboundHandler method_59853(boolean var0) {
      return (ChannelOutboundHandler)(var0 ? new class08355() : new class00632());
   }

   public void method_52903(String var1, int var2, class07834 var3) {
      this.method_52904(var1, var2, class04290.y, class04290.u, var3, class04193.field_44974);
   }

   private static String method_56333(boolean var0) {
      return var0 ? "encoder" : "outbound_config";
   }

   public static class00642 method_10769(SocketAddress var0) {
      class00642 class00642 = new class00642(class00423.field_11942);
      ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(class00606.N().L())).handler(new class09381(class00642))).channel(class00606.N().u()))
         .connect(var0)
         .syncUninterruptibly();
      return class00642;
   }

   public void method_52902(String var1, int var2, class07844 var3) {
      this.method_52904(var1, var2, class04279.y, class04279.u, var3, class04193.field_44975);
   }

   public static ChannelFuture method_52271(InetSocketAddress var0, class00606 var1, class00642 var2) {
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(var1);
      handler$cph000$viafabricplus$setTargetVersion(var0, var1, var2, null, localrefimpl);
      var1 = (class00606)localrefimpl.dispose();
      LocalRefImpl localrefimpl1 = new LocalRefImpl();
      localrefimpl1.init(var1);
      handler$cpl001$viafabricplus$setTargetVersion(var0, var1, var2, null, localrefimpl1);
      var1 = (class00606)localrefimpl1.dispose();
      Bootstrap bootstrap1 = (Bootstrap)((Bootstrap)new Bootstrap().group(var1.L())).handler(new class09379(var2));
      Class<? extends Channel> oclass = var1.u();
      Bootstrap bootstrap = bootstrap1;
      Operation operation = var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 2, "[io.netty.bootstrap.Bootstrap, java.lang.Class]");
         return ((Bootstrap)var0x[0]).channel((Class)var0x[1]);
      };
      LocalRefImpl localrefimpl2 = new LocalRefImpl();
      LocalRefImpl localrefimpl3 = new LocalRefImpl();
      localrefimpl2.init(var0);
      localrefimpl3.init(var2);
      AbstractBootstrap abstractbootstrap = wrapOperation$cpl000$viafabricplus$useRakNetChannelFactory$mixinextras$bridge$114(
         bootstrap, oclass, operation, localrefimpl2, localrefimpl3
      );
      var2 = (class00642)localrefimpl3.dispose();
      var0 = (InetSocketAddress)localrefimpl2.dispose();
      bootstrap1 = (Bootstrap)abstractbootstrap;
      int i = var0.getPort();
      InetAddress inetaddress = var0.getAddress();
      bootstrap = bootstrap1;
      Operation operation1 = var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 3, "[io.netty.bootstrap.Bootstrap, java.net.InetAddress, int]");
         return ((Bootstrap)var0x[0]).connect((InetAddress)var0x[1], (Integer)var0x[2]);
      };
      LocalRefImpl localrefimpl4 = new LocalRefImpl();
      LocalRefImpl localrefimpl5 = new LocalRefImpl();
      LocalRefImpl localrefimpl6 = new LocalRefImpl();
      localrefimpl4.init(var0);
      localrefimpl5.init(var2);
      localrefimpl6.init(var1);
      ChannelFuture channelfuture = wrapOperation$cpl000$viafabricplus$useRakNetPingHandlers$mixinextras$bridge$115(
         bootstrap, inetaddress, i, operation1, localrefimpl4, localrefimpl5, localrefimpl6
      );
      var1 = (class00606)localrefimpl6.dispose();
      var2 = (class00642)localrefimpl5.dispose();
      var0 = (InetSocketAddress)localrefimpl4.dispose();
      return channelfuture;
   }

   private void method_36942(class00381<?> var1, @Nullable ChannelFutureListener var2, boolean var3) {
      if (var2 != null) {
         (var3 ? this.field_11651.writeAndFlush(var1) : this.field_11651.write(var1)).addListener(var2);
      } else if (var3) {
         this.field_11651.writeAndFlush(var1, this.field_11651.voidPromise());
      } else {
         this.field_11651.write(var1, this.field_11651.voidPromise());
      }
   }

   public static void method_48311(ChannelPipeline var0, class00423 var1, boolean var2, @Nullable class03706 var3) {
      class00423 class00423 = var1.N();
      boolean flag = var1 == class00423.field_11941;
      boolean flag1 = class00423 == class00423.field_11941;
      var0.addLast("splitter", method_59852(var3, var2))
         .addLast(new ChannelHandler[]{new FlowControlHandler()})
         .addLast(method_56334(flag), (ChannelHandler)(flag ? new class00658<class07825>(field_48514) : new class02372()))
         .addLast("prepender", method_59853(var2))
         .addLast(method_56333(flag1), (ChannelHandler)(flag1 ? new class00657<class07825>(field_48514) : new class09700()));
   }

   private void method_56332(class04275<?> var1, class00638 var2) {
      this.m_handler$zil000$fabric_networking_api_v1$unwatchAddon_8(var1, var2, null);
      Objects.requireNonNull(var2, "packetListener");
      class00423 class00423 = var2.N();
      if (class00423 != this.field_11643) {
         throw new IllegalStateException("Trying to set listener for wrong side: connection is " + this.field_11643 + ", but listener is " + class00423);
      } else {
         class00648 class00648 = var2.y();
         if (var1.N() != class00648) {
            throw new IllegalStateException("Listener protocol (" + class00648 + ") does not match requested one " + var1);
         }
      }
   }

   private static ChannelInboundHandler method_59852(@Nullable class03706 var0, boolean var1) {
      if (!var1) {
         return new class00660(var0);
      } else {
         return (ChannelInboundHandler)(var0 != null ? new class02943(var0) : new class08363());
      }
   }

   public final void method_10751() {
      if (this.field_11651 != null && this.field_11651.isOpen()) {
         synchronized (this.field_45668) {
            Consumer<class00642> consumer;
            while ((consumer = this.field_45668.poll()) != null) {
               consumer.accept(this);
            }
         }
      }
   }

   private <S extends class01636, C extends class01673> void method_52904(
      String var1, int var2, class04275<S> var3, class04275<C> var4, C var5, class04193 var6
   ) {
      if (var3.N() != var4.N()) {
         throw new IllegalStateException("Mismatched initial protocols");
      } else {
         this.field_45669 = var5;
         this.method_52905(var7 -> {
            this.method_56330(var4, var5);
            var7.method_10764(new class07821(class07529.y().comp_4027(), var1, var2, var6), null, true);
            this.method_56329(var3);
         });
      }
   }

   public void method_10754() {
      this.method_10751();
      class00638 class00638 = this.field_11652;
      if (class00638 instanceof class03077) {
         ((class03077)class00638).method_18784();
      }

      if (!this.method_10758() && !this.field_11646) {
         this.method_10768();
      }

      if (this.field_11651 != null) {
         this.field_11651.flush();
      }

      if (this.field_11655++ % 20 == 0) {
         this.method_30615();
      }

      if (this.field_45955 != null) {
         this.field_45955.N();
      }
   }

   private static <T extends class00638> void method_10759(class00381<T> var0, class00638 var1) {
      var0.method_65081(var1);
   }

   private void method_52918() {
      if (this.field_11651.eventLoop().inEventLoop()) {
         this.field_11651.flush();
      } else {
         this.field_11651.eventLoop().execute(() -> this.field_11651.flush());
      }
   }

   public static void method_52911(ChannelPipeline var0, class00423 var1) {
      method_48311(var0, var1, true, null);
   }

   private static void method_59851(ChannelFuture var0) {
      try {
         var0.syncUninterruptibly();
      } catch (Exception exception) {
         if (exception instanceof ClosedChannelException) {
            field_11642.info("Connection closed during protocol change");
         } else {
            throw exception;
         }
      }
   }

   public <S extends class01636, C extends class01673> void method_56326(String var1, int var2, class04275<S> var3, class04275<C> var4, C var5, boolean var6) {
      this.method_52904(var1, var2, var3, var4, var5, var6 ? class04193.field_48227 : class04193.field_44975);
   }

   public String method_52909(boolean var1) {
      if (this.field_11645 == null) {
         return "local";
      } else {
         return var1 ? this.field_11645.toString() : "IP hidden";
      }
   }

   public void method_53859(ChannelPipeline var1) {
      var1.addLast("hackfix", new class09380(this)).addLast("packet_handler", this);
   }

   public static class00642 method_10753(InetSocketAddress var0, class00606 var1, @Nullable class02270 var2) {
      class00642 class00642 = new class00642(class00423.field_11942);
      if (var2 != null && wrapWithCondition$cph000$viafabricplus$dontSetPerformanceLog(class00642, var2)) {
         class00642.method_53505(var2);
      }

      handler$cph000$viafabricplus$setTargetVersion(var0, var1, var2, null, class00642);
      method_52271(var0, var1, class00642).syncUninterruptibly();
      return class00642;
   }

   public final void method_10764(class00381<?> var1, @Nullable ChannelFutureListener var2, boolean var3) {
      this.handler$zzo000$baritone$preDispatchPacket(var1, var2, var3, null);
      this.m_handler$zil000$fabric_networking_api_v1$checkPacket_11(var1, var2, var3, null);
      int i = this.field_11656 + 1;
      this.m_handler$zil000$fabric_networking_api_v1$checkPacket_11(var1, var2, var3, null);
      this.field_11656 = i;
      if (this.field_11651.eventLoop().inEventLoop()) {
         this.method_36942(var1, var2, var3);
      } else {
         this.field_11651.eventLoop().execute(() -> this.method_36942(var1, var2, var3));
      }

      this.handler$zzo000$baritone$postDispatchPacket(var1, var2, var3, null);
   }

   public class00423 method_36121() {
      return this.field_11643;
   }

   private static String method_56334(boolean var0) {
      return var0 ? "decoder" : "inbound_config";
   }

   public void method_52905(Consumer<class00642> var1) {
      if (this.method_10758()) {
         this.method_10751();
         var1.accept(this);
      } else {
         this.field_45668.add(var1);
      }
   }

   public void method_52912(class00638 var1) {
      if (this.field_11652 != null) {
         throw new IllegalStateException("Listener already set");
      } else if (this.field_11643 == class00423.field_11941 && var1.N() == class00423.field_11941 && var1.y() == field_48514.N()) {
         this.field_11652 = var1;
      } else {
         throw new IllegalStateException("Invalid initial listener");
      }
   }

   protected void method_30615() {
      this.field_11653 = class04995.B(0.75F, this.field_11656, this.field_11653);
      this.field_11654 = class04995.B(0.75F, this.field_11658, this.field_11654);
      this.field_11656 = 0;
      this.field_11658 = 0;
   }

   public void method_53505(class02270 var1) {
      this.field_45955 = new class03706(var1);
   }

   public boolean method_10772() {
      return this.field_11651 == null;
   }

   @Override
   public void sendPacketSilent(class00381 var1) {
      if (this.method_10758()) {
         this.method_10751();
         this.method_10764(var1, null, true);
      } else {
         this.field_45668.add(var1x -> var1x.method_10764(var1, null, true));
      }
   }

   @Nullable
   public class02570 method_60926() {
      return this.field_52180;
   }

   @Nullable
   public class00638 method_10744() {
      return this.field_11652;
   }

   private void m_handler$zil000$fabric_networking_api_v1$initAddedFields_7(class00423 var1, CallbackInfo var2) {
      this.playChannels = new ConcurrentHashMap();
   }

   private void m_handler$zil000$fabric_networking_api_v1$unwatchAddon_8(class04275 var1, class00638 var2, CallbackInfo var3) {
      class00638 class00638 = this.field_11652;
      if (class00638 instanceof NetworkHandlerExtensions) {
         ((NetworkHandlerExtensions)class00638).getAddon().endSession();
      }
   }

   private void m_handler$zil000$fabric_networking_api_v1$disconnectAddon_9(ChannelHandlerContext var1, CallbackInfo var2) {
      class00638 class00638 = this.field_11652;
      if (class00638 instanceof NetworkHandlerExtensions) {
         ((NetworkHandlerExtensions)class00638).getAddon().handleDisconnect();
      }
   }

   private void m_handler$zil000$fabric_networking_api_v1$disconnectAddon_9(CallbackInfo var1) {
      class00638 class00638 = this.field_11652;
      if (class00638 instanceof NetworkHandlerExtensions) {
         ((NetworkHandlerExtensions)class00638).getAddon().handleDisconnect();
      }
   }

   private void m_handler$zil000$fabric_networking_api_v1$checkPacket_11(class00381 var1, ChannelFutureListener var2, boolean var3, CallbackInfo var4) {
      if (this.field_11652 instanceof PacketCallbackListener) {
         ((PacketCallbackListener)this.field_11652).sent(var1);
      }
   }

   private static ChannelFuture wrapOperation$cpl000$viafabricplus$useRakNetPingHandlers(
      Bootstrap var0, InetAddress var1, int var2, Operation var3, InetSocketAddress var4, class00642 var5, class00606 var6
   ) {
      if (BedrockProtocolVersion.bedrockLatest.equals(var5.viaFabricPlus$getTargetVersion())) {
         if (var4 instanceof NetherNetInetSocketAddress nethernetinetsocketaddress) {
            return var0.connect(nethernetinetsocketaddress.getNetherNetAddress())
               .addListeners(new GenericFutureListener[]{ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE, (ChannelFutureListener)var0x -> {
                  if (var0x.isSuccess()) {
                     var0x.channel().pipeline().remove("viabedrock-raknet-message-codec");
                  }
               }});
         }

         if (!var6.viaFabricPlus$isConnecting()) {
            return var0.register()
               .syncUninterruptibly()
               .channel()
               .bind(new InetSocketAddress(0))
               .addListeners(
                  new GenericFutureListener[]{
                     ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE,
                     (ChannelFutureListener)var3x -> {
                        if (var3x.isSuccess()) {
                           var3x.channel()
                              .pipeline()
                              .replace(
                                 "viabedrock-raknet-message-codec",
                                 "viabedrock-ping-encapsulation",
                                 new RakNetPingEncapsulationCodec(new InetSocketAddress(var1, var2))
                              );
                           var3x.channel().pipeline().remove("viabedrock-packet-codec");
                           var3x.channel().pipeline().remove("splitter");
                           var5.viaFabricPlus$getUserConnection().getProtocolInfo().getPipeline().add(RakNetStatusProtocol.INSTANCE);
                        }
                     }
                  }
               );
         }
      }

      return (ChannelFuture)var3.call(new Object[]{var0, var1, var2});
   }

   private static AbstractBootstrap wrapOperation$cpl000$viafabricplus$useRakNetChannelFactory(
      Bootstrap var0, Class var1, Operation var2, InetSocketAddress var3, class00642 var4
   ) {
      if (BedrockProtocolVersion.bedrockLatest.equals(var4.viaFabricPlus$getTargetVersion())) {
         if (var3 instanceof NetherNetInetSocketAddress nethernetinetsocketaddress) {
            String s = ((MinecraftSession)SaveManager.INSTANCE.getAccountsSave().getBedrockAccount().getMinecraftSession().getUpToDateUnchecked())
               .getAuthorizationHeader();
            return nethernetinetsocketaddress.getNetherNetAddress() instanceof NetherNetJsonRpcAddress
               ? var0.channelFactory(NetherNetChannelFactory.client(new PeerConnectionFactory(), new NetherNetXboxRpcSignaling(s)))
               : var0.channelFactory(NetherNetChannelFactory.client(new PeerConnectionFactory(), new NetherNetXboxSignaling(s)));
         } else {
            if (var1 == NioSocketChannel.class) {
               var1 = NioDatagramChannel.class;
            } else {
               if (var1 != EpollSocketChannel.class) {
                  throw new IllegalStateException("Unsupported channel type for RakNet: " + var1);
               }

               var1 = EpollDatagramChannel.class;
            }

            return var0.channelFactory(RakChannelFactory.client(var1));
         }
      } else {
         return (AbstractBootstrap)var2.call(new Object[]{var0, var1});
      }
   }

   public <T extends class00638> void method_56330(class04275<T> var1, T var2) {
      this.method_56332(var1, var2);
      if (var1.y() != this.method_36121()) {
         throw new IllegalStateException("Invalid inbound protocol: " + var1.N());
      } else {
         this.field_11652 = var2;
         this.field_45669 = null;
         class02403 class02403 = class04285.N(var1);
         class03276 class03276 = var1.u();
         if (class03276 != null) {
            class03288 class03288 = new class03288(class03276);
            class02403 = class02403.N(var1x -> var1x.pipeline().addAfter("decoder", "bundler", class03288));
         }

         method_59851(this.field_11651.writeAndFlush(this.m_modify$zil000$fabric_networking_api_v1$injectFabricPacketSlitterHandlerInbound_6(class02403, var1)));
      }
   }
}
