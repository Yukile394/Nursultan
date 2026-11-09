package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.ForcedUsernameChangeException;
import com.mojang.authlib.exceptions.InsufficientPrivilegesException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.exceptions.UserBannedException;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.math.BigInteger;
import java.security.PublicKey;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon;
import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryRequestPayload;
import net.fabricmc.fabric.mixin.networking.client.accessor.ClientHandshakePacketListenerImplAccessor;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ProtocolMetadataStorage;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class03464 implements class07844, NetworkHandlerExtensions, ClientHandshakePacketListenerImplAccessor {
   private static final Logger N = LogUtils.getLogger();
   private final class06202 y;
   @Nullable
   private final class04568 L;
   @Nullable
   private final class05096 u;
   private final Consumer<class00392> i;
   private final class00642 R;
   private final boolean M;
   @Nullable
   private final Duration B;
   @Nullable
   private String Z;
   private final class05384 z;
   private final Map<class01894, byte[]> U;
   private final boolean E;
   private final Map<UUID, class03458> W;
   private final boolean m;
   private final AtomicReference<class03429> P = new AtomicReference<>(class03429.field_46193);
   private ClientLoginNetworkAddon s;

   public ClientLoginNetworkAddon getAddon() {
      return this.s;
   }

   public class03464(
      class00642 var1,
      class06202 var2,
      @Nullable class04568 var3,
      @Nullable class05096 var4,
      boolean var5,
      @Nullable Duration var6,
      Consumer<class00392> var7,
      class05384 var8,
      @Nullable class04254 var9
   ) {
      super();
      this.R = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var7;
      this.M = var5;
      this.B = var6;
      this.z = var8;
      this.U = var9 != null ? new HashMap<>(var9.N()) : new HashMap<>();
      this.W = var9 != null ? var9.y() : Map.of();
      this.m = var9 != null ? var9.L() : false;
      this.E = var9 != null;
      this.N(null);
   }

   @Nullable
   private class00392 y(String var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class00392)callbackinforeturnable.getReturnValue();
      } else {
         try {
            this.y.n().L().joinServer(this.y.Ny().y(), this.y.Ny().u(), var1);
            return null;
         } catch (AuthenticationUnavailableException authenticationunavailableexception) {
            return class00392.N("disconnect.loginFailedInfo", class00392.L("disconnect.loginFailedInfo.serversUnavailable"));
         } catch (InvalidCredentialsException invalidcredentialsexception) {
            return class00392.N("disconnect.loginFailedInfo", class00392.L("disconnect.loginFailedInfo.invalidSession"));
         } catch (InsufficientPrivilegesException insufficientprivilegesexception) {
            return class00392.N("disconnect.loginFailedInfo", class00392.L("disconnect.loginFailedInfo.insufficientPrivileges"));
         } catch (ForcedUsernameChangeException | UserBannedException userbannedexception) {
            return class00392.N("disconnect.loginFailedInfo", class00392.L("disconnect.loginFailedInfo.userBanned"));
         } catch (AuthenticationException authenticationexception) {
            return class00392.N("disconnect.loginFailedInfo", authenticationexception.getMessage());
         }
      }
   }

   private void N(class00642 var1, int var2, boolean var3) {
      var1.method_10760(var2, ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_17));
   }

   private void N(class07827 var1, Cipher var2, Cipher var3) {
      this.N(class03429.field_46195);
      this.R.method_10752(var1, class03041.N(() -> this.R.method_10746(var2, var3)));
   }

   @Override
   public void N(class07853 var1) {
      this.N(class03429.field_46196);
      GameProfile gameprofile = var1.N();
      this.R
         .method_56330(
            class02868.u,
            new class01874(
               this.y,
               this.R,
               new class01892(
                  this.z,
                  gameprofile,
                  this.y.NI().N(this.M, this.B, this.Z),
                  class03785.N().N(),
                  class03794.B,
                  null,
                  this.L,
                  this.u,
                  this.U,
                  null,
                  Map.of(),
                  class02243.N,
                  this.W,
                  false
               )
            )
         );
      this.R.method_10743(class04187.N);
      this.R.method_56329(class02868.y);
      this.R.method_10743(new class00559(new class01644(class02798.N())));
      this.R.method_10743(new class00541(((class05630)this.y.i_7).NF()));
   }

   private void N(String var1, CallbackInfoReturnable var2) {
      IConnection iconnection = this.R;
      if (iconnection.viaFabricPlus$getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_6_4)
         && !((ProtocolMetadataStorage)iconnection.viaFabricPlus$getUserConnection().get(ProtocolMetadataStorage.class)).authenticate) {
         var2.setReturnValue(null);
      }
   }

   private void N(class03429 var1) {
      class03429 class03429 = this.P.updateAndGet(var1x -> {
         if (!var1.field_46198.contains(var1x)) {
            throw new IllegalStateException("Tried to switch to " + var1 + " from " + var1x + ", but expected one of " + var1.field_46198);
         } else {
            return var1;
         }
      });
      this.i.accept(class03429.field_46197);
   }

   private void N(class07812 var1, CallbackInfo var2) {
      if (var1.y() instanceof PacketByteBufLoginQueryRequestPayload packetbytebufloginqueryrequestpayload) {
         if (this.s.handlePacket(var1)) {
            var2.cancel();
         } else {
            packetbytebufloginqueryrequestpayload.data().skipBytes(packetbytebufloginqueryrequestpayload.data().readableBytes());
         }
      }
   }

   private void N(CallbackInfo var1) {
      this.s = new ClientLoginNetworkAddon(this, this.y);
      this.s.lateInit();
   }

   public void N(@Nullable String var1) {
      this.Z = var1;
   }

   @Override
   public void N(class07812 var1) {
      this.i.accept(class00392.L("connect.negotiating"));
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.R.method_10743(new class07847(var1.N(), null));
      }
   }

   @Override
   public void N(class07814 var1) {
      this.R.method_10747(var1.N());
   }

   @Override
   public void N(class07838 var1) {
      if (!this.R.method_10756()) {
         class00642 class00642 = this.R;
         int j = var1.N();
         boolean flag = false;
         int ix = j;
         class00642 class00642x = class00642;
         this.N(class00642x, ix, flag);
      }
   }

   @Override
   public void N(class07820 var1) {
      this.N(class03429.field_46194);

      Cipher cipher;
      Cipher cipher1;
      String sx;
      class07827 class07827;
      try {
         SecretKey secretkey = class01222.N();
         PublicKey publickey = var1.y();
         sx = new BigInteger(class01222.N(var1.N(), publickey, secretkey)).toString(16);
         cipher = class01222.N(2, secretkey);
         cipher1 = class01222.N(1, secretkey);
         byte[] abyte = var1.L();
         class07827 = new class07827(secretkey, publickey, abyte);
      } catch (Exception exception) {
         throw new IllegalStateException("Protocol error", exception);
      }

      if (var1.u()) {
         class07536.Z().execute(() -> {
            class00392 class00392 = this.y(sx);
            if (class00392 != null) {
               if (this.L == null || !this.L.u()) {
                  this.R.method_10747(class00392);
                  return;
               }

               N.warn(class00392.getString());
            }

            this.N(class07827, cipher, cipher1);
         });
      } else {
         this.N(class07827, cipher, cipher1);
      }
   }

   @Override
   public void N(class07080 var1, class07074 var2) {
      var2.N("Server type", () -> this.L != null ? this.L.R().toString() : "<unknown>");
      var2.N("Login phase", () -> this.P.get().toString());
      var2.N("Is Local", () -> String.valueOf(this.R.method_10756()));
   }

   @Override
   public void N(class04278 var1) {
      this.R.method_10743(new class04269(var1.N(), this.U.get(var1.N())));
   }

   @Override
   public boolean method_48106() {
      return this.R.method_10758();
   }

   @Override
   public void method_10839(class02570 var1) {
      class00392 class00392 = this.E ? class05220.j : class05220.v;
      if (this.L != null && this.L.i()) {
         this.y.N(new class05364(this.u, class00392, var1.N(), class05220.U));
      } else {
         this.y.N(new class05364(this.u, class00392, var1));
      }
   }
}
