package minecraft;

import com.google.common.primitives.Ints;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.PacketCallbackListener;
import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryResponse;
import net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon;
import net.fabricmc.fabric.mixin.networking.accessor.ServerLoginPacketListenerImplAccessor;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01610 implements class03077, class07845, NetworkHandlerExtensions, PacketCallbackListener, ServerLoginPacketListenerImplAccessor {
   private static final AtomicInteger M = new AtomicInteger(0);
   static final Logger N = LogUtils.getLogger();
   private static final int B = 600;
   private final byte[] Z;
   final class02796 y;
   public final class00642 L;
   final class06975 u;
   private volatile class01616 z = class01616.field_14170;
   private int U;
   @Nullable
   String i;
   @Nullable
   private GameProfile E;
   private final String W = "";
   private final boolean m;
   private ServerLoginNetworkAddon P;

   @Override
   public String L() {
      String s = this.L.method_52909(this.y.NN());
      return this.i != null ? this.i + " (" + s + ")" : s;
   }

   private void L(GameProfile var1) {
      class01062 class01062 = this.y.Nm();
      class00392 class00392 = class01062.N(this.L.method_10755(), new class08774(var1));
      if (class00392 != null) {
         this.N(class00392);
      } else {
         class02796 class02796 = this.y;
         if (this.N(class02796) >= 0 && !this.L.method_10756()) {
            this.L.method_10752(new class07838(this.y.h()), class03041.N(() -> this.L.method_10760(this.y.h(), true)));
         }

         if (class01062.N(var1.id())) {
            this.z = class01616.field_45031;
         } else {
            this.u(var1);
         }
      }
   }

   public class01610(class02796 var1, class00642 var2, boolean var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = this.y.Nl();
      this.Z = Ints.toByteArray(class06069.u().M());
      this.m = var3;
      this.N(null);
   }

   public ServerLoginNetworkAddon getAddon() {
      return this.P;
   }

   private void u(GameProfile var1) {
      this.z = class01616.field_45032;
      this.L.method_10743(new class07853(var1));
   }

   private boolean y(GameProfile var1) {
      return this.y.Nm().y(var1.id()) != null;
   }

   @Override
   public void N(class07816 var1) {
      Validate.validState(this.z == class01616.field_14170, "Unexpected hello packet", new Object[0]);
      Validate.validState(class05018.R(var1.N()), "Invalid characters in username", new Object[0]);
      this.i = var1.N();
      GameProfile gameprofile = this.y.NJ();
      if (gameprofile != null && this.i.equalsIgnoreCase(gameprofile.name())) {
         this.N(gameprofile);
      } else {
         if (this.y.NH() && !this.L.method_10756()) {
            this.z = class01616.field_14175;
            this.L.method_10743(new class07820("", this.y.NI().getPublic().getEncoded(), this.Z, true));
         } else {
            this.N(class01487.y(this.i));
         }
      }
   }

   @Override
   public void N(class07080 var1, class07074 var2) {
      var2.N("Login phase", () -> this.z.toString());
   }

   private void N(CallbackInfo var1) {
      this.P = new ServerLoginNetworkAddon(this);
      this.P.lateInit();
   }

   private void N(class01610 var1, GameProfile var2) {
      if (this.P.queryTick()) {
         this.L(var2);
      }
   }

   private void N(class07847 var1, CallbackInfo var2) {
      if (this.P.handle(var1)) {
         var2.cancel();
      } else if (var1.y() instanceof PacketByteBufLoginQueryResponse packetbytebufloginqueryresponse) {
         packetbytebufloginqueryresponse.data().skipBytes(packetbytebufloginqueryresponse.data().readableBytes());
      }
   }

   private int N(class02796 var1) {
      return -1;
   }

   @Override
   public void N(class07827 var1) {
      Validate.validState(this.z == class01616.field_14175, "Unexpected key packet", new Object[0]);

      String s;
      try {
         PrivateKey privatekey = this.y.NI().getPrivate();
         if (!var1.N(this.Z, privatekey)) {
            throw new IllegalStateException("Protocol error");
         }

         SecretKey secretkey = var1.N(privatekey);
         Cipher cipher = class01222.N(2, secretkey);
         Cipher cipher1 = class01222.N(1, secretkey);
         s = new BigInteger(class01222.N("", this.y.NI().getPublic(), secretkey)).toString(16);
         this.z = class01616.field_14169;
         this.L.method_10746(cipher, cipher1);
      } catch (class05449 class05449) {
         throw new IllegalStateException("Protocol error", class05449);
      }

      class01625 class01625 = new class01625(this, "User Authenticator #" + M.incrementAndGet(), s);
      class01625.setUncaughtExceptionHandler(new class07980(N));
      class01625.start();
   }

   @Override
   public void N(class07847 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.N(class04156.field_48273);
      }
   }

   @Override
   public void N(class04187 var1) {
      Validate.validState(this.z == class01616.field_45032, "Unexpected login acknowledgement packet", new Object[0]);
      this.L.method_56329(class02868.u);
      class03713 class03713 = class03713.N(Objects.requireNonNull(this.E), this.m);
      class04176 class04176 = new class04176(this.y, this.L, class03713);
      this.L.method_56330(class02868.y, class04176);
      class04176.L();
      this.z = class01616.field_14172;
   }

   public void N(class00392 var1) {
      try {
         N.info("Disconnecting {}: {}", this.L(), var1.getString());
         this.L.method_10743(new class07814(var1));
         this.L.method_10747(var1);
      } catch (Exception exception) {
         N.error("Error whilst disconnecting player", exception);
      }
   }

   void N(GameProfile var1) {
      this.E = var1;
      this.z = class01616.field_45030;
   }

   @Override
   public boolean method_48106() {
      return this.L.method_10758();
   }

   public void sent(class00381 var1) {
      if (var1 instanceof class07812) {
         this.P.registerOutgoingPacket((class07812)var1);
      }
   }

   @Override
   public void method_10839(class02570 var1) {
      N.info("{} lost connection: {}", this.L(), var1.N().getString());
   }

   @Override
   public void method_18784() {
      if (this.z == class01616.field_45030) {
         GameProfile gameprofile = Objects.requireNonNull(this.E);
         this.N(this, gameprofile);
      }

      if (this.z == class01616.field_45031 && !this.y(Objects.requireNonNull(this.E))) {
         this.u(this.E);
      }

      if (this.U++ == 600) {
         this.N(class00392.L("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public void method_55851(class04269 var1) {
      this.N(class04156.field_48273);
   }
}
