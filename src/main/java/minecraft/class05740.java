package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.injection.access.base.IServerData;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy.ViaFabricPlusClassicMPPassProvider;
import com.viaversion.viafabricplus.protocoltranslator.util.ProtocolVersionDetector;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.settings.impl.AuthenticationSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.ProfileKey;
import com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_0;
import com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_1;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianreuth.classic4j.model.classicube.account.CCAccount;
import io.netty.channel.ChannelFuture;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.util.Optional;
import java.util.UUID;
import net.raphimc.minecraftauth.bedrock.BedrockAuthManager;
import net.raphimc.minecraftauth.bedrock.model.MinecraftMultiplayerToken;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.viabedrock.protocol.storage.AuthData;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

class class05740 extends Thread {
   private boolean R;

   class05740(class05763 var1, String var2, class03420 var3, class06202 var4, class04568 var5, class04254 var6) {
      super(var2);
      this.i = var1;
      this.N = var3;
      this.y = var4;
      this.L = var5;
      this.u = var6;
   }

   @Override
   public void run() {
      InetSocketAddress inetsocketaddress = null;

      try {
         if (this.i.R) {
            return;
         }

         Optional optional = class03459.N.N(this.N).map(class03437::u);
         if (this.i.R) {
            return;
         }

         if (optional.isEmpty()) {
            this.y.execute(() -> var1x.N(new class05364(this.i.M, this.i.B, class05763.L)));
            return;
         }

         inetsocketaddress = (InetSocketAddress)this.N(optional, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 1, "[java.util.Optional]");
            return ((Optional)var0[0]).get();
         });
         class00642 class00642x;
         synchronized (this.i) {
            if (this.i.R) {
               return;
            }

            class00642x = new class00642(class00423.field_11942);
            class00642x.method_53505(this.y.ND().U());
            class05763 class05763 = this.i;
            boolean flag = ((class05630)this.y.i_7).NC();
            class00606 class00606 = this.N(flag);
            class05763.i = this.N(inetsocketaddress, class00606, class00642x, var0 -> {
               WrapOperationRuntime.checkArgumentCount(var0, 3, "[java.net.InetSocketAddress, net.minecraft.class_12239, net.minecraft.class_2535]");
               return class00642.method_52271((InetSocketAddress)var0[0], (class00606)var0[1], (class00642)var0[2]);
            });
         }

         this.i.i.syncUninterruptibly();
         this.N(null, class00642x);
         this.y(null, class00642x);
         synchronized (this.i) {
            if (this.i.R) {
               class00642x.method_10747(class05763.y);
               return;
            }

            this.i.u = class00642x;
            this.y.yL().N(class00642x, N(this.L.y()));
         }

         this.i
            .u
            .method_56326(
               this.N(inetsocketaddress),
               this.y(inetsocketaddress),
               class04279.y,
               class04279.u,
               new class03464(this.i.u, this.y, this.L, this.i.M, false, null, this.i::N, new class05384(), this.u),
               this.u != null
            );
         class00642 class00642 = this.i.u;
         class04771 class04771 = this.y.Ny();
         class00642.method_10743(new class07816(this.N(class04771), this.y.Ny().y()));
      } catch (Exception exception2) {
         if (this.i.R) {
            return;
         }

         Exception exception;
         if (exception2.getCause() instanceof Exception exception1) {
            exception = exception1;
         } else {
            exception = exception2;
         }

         class05763.N.error("Couldn't connect to server", exception2);
         String s = inetsocketaddress == null ? this.N(exception, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 1, "[java.lang.Exception]");
            return ((Exception)var0[0]).getMessage();
         }) : this.N(exception, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 1, "[java.lang.Exception]");
            return ((Exception)var0[0]).getMessage();
         }).replaceAll(this.N(inetsocketaddress) + ":" + this.y(inetsocketaddress), "").replaceAll(inetsocketaddress.toString(), "");
         this.y.execute(() -> var1x.N(new class05364(this.i.M, this.i.B, class00392.N("disconnect.genericReason", s))));
      }
   }

   private int y(InetSocketAddress var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17) ? this.N.y() : var1.getPort();
   }

   private void y(CallbackInfo var1, class00642 var2) {
      UserConnection userconnection = var2.viaFabricPlus$getUserConnection();
      if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_19, ProtocolVersion.v1_19_1)) {
         class04450 class04450 = class06202.Nq().c().N().join().orElse(null);
         if (class04450 != null) {
            class04454 class04454 = class04450.L().y();
            PrivateKey privatekey = class04450.y();
            long ix = class04454.y().toEpochMilli();
            byte[] abyte = class04454.L().getEncoded();
            UUID uuid = this.y.Ny().y();
            userconnection.put(new ChatSession1_19_1(uuid, privatekey, new ProfileKey(ix, abyte, class04454.u())));
            if (ProtocolTranslator.getTargetVersion() == ProtocolVersion.v1_19) {
               byte[] abyte1 = class04454.viafabricplus$getLegacyPublicKeySignature();
               if (abyte1 != null) {
                  userconnection.put(new ChatSession1_19_0(uuid, privatekey, new ProfileKey(ix, abyte, abyte1)));
               }
            }
         } else {
            ViaFabricPlusImpl.INSTANCE
               .getLogger()
               .error("Could not get public key signature. Joining servers with enforce-secure-profiles enabled will not work!");
         }
      }
   }

   private String N(InetSocketAddress var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17) ? this.N.N() : var1.getHostName();
   }

   private static class03826 N(class04575 var0) {
      return switch (var0) {
         case field_3768 -> class03826.field_47648;
         case field_3764 -> class03826.field_47649;
         case field_3767 -> class03826.field_47647;
      };
   }

   private String N(class04771 var1) {
      if (this.R) {
         CCAccount ccaccount = SaveManager.INSTANCE.getAccountsSave().getClassicubeAccount();
         if (ccaccount != null) {
            return ccaccount.username();
         }
      }

      return var1.L();
   }

   private String N(Exception var1, Operation var2) {
      return var1.getMessage() == null ? "" : (String)var2.call(new Object[]{var1});
   }

   private class00606 N(boolean var1) {
      class00606 class00606 = class00606.N(var1);
      class00606.viaFabricPlus$setConnecting(true);
      return class00606;
   }

   private Object N(Optional var1, Operation var2) throws Exception {
      InetSocketAddress inetsocketaddress = (InetSocketAddress)var2.call(new Object[]{var1});
      IServerData iserverdata = this.L;
      ProtocolVersion protocolversion = ProtocolTranslator.getTargetVersion();
      if (iserverdata.viaFabricPlus$forcedVersion() != null && !iserverdata.viaFabricPlus$passedDirectConnectScreen()) {
         protocolversion = iserverdata.viaFabricPlus$forcedVersion();
         iserverdata.viaFabricPlus$passDirectConnectScreen(false);
      }

      if (protocolversion == ProtocolTranslator.AUTO_DETECT_PROTOCOL) {
         boolean flag = this.L.B() == class04579.field_47884 || this.L.B() == class04579.field_47883;
         if (flag) {
            protocolversion = ProtocolVersion.getProtocol(this.L.M);
         }

         if (!flag || !protocolversion.isKnown()) {
            this.i.N(class00392.L("base.viafabricplus.detecting_server_version"));

            try {
               protocolversion = ProtocolVersionDetector.get(this.N, inetsocketaddress, ProtocolTranslator.NATIVE_VERSION);
            } catch (ConnectException connectexception) {
            }
         }
      }

      ProtocolTranslator.setTargetVersion(protocolversion, true);
      this.R = (Boolean)AuthenticationSettings.INSTANCE.setSessionNameToClassiCubeNameInServerList.getValue()
         && ViaFabricPlusClassicMPPassProvider.classicubeMPPass != null;
      return inetsocketaddress;
   }

   private ChannelFuture N(InetSocketAddress var1, class00606 var2, class00642 var3, Operation var4) {
      ChannelFuture channelfuture = (ChannelFuture)var4.call(new Object[]{var1, var2, var3});
      ProtocolTranslator.injectPreviousVersionReset(channelfuture.channel());
      return channelfuture;
   }

   private void N(CallbackInfo var1, class00642 var2) throws IOException {
      UserConnection userconnection = var2.viaFabricPlus$getUserConnection();
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         BedrockAuthManager bedrockauthmanager = SaveManager.INSTANCE.getAccountsSave().getBedrockAccount();
         if (bedrockauthmanager != null) {
            MinecraftMultiplayerToken minecraftmultiplayertoken = (MinecraftMultiplayerToken)bedrockauthmanager.getMinecraftMultiplayerToken().refresh();
            KeyPair keypair = bedrockauthmanager.getSessionKeyPair();
            UUID uuid = bedrockauthmanager.getDeviceId();
            userconnection.put(new AuthData(minecraftmultiplayertoken.getToken(), keypair, uuid));
         } else {
            ViaFabricPlusImpl.INSTANCE.getLogger().warn("Could not get Bedrock account. Joining online mode servers will not work!");
         }
      }
   }
}
