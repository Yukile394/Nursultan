package minecraft;

import com.google.common.net.HostAndPort;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IServerAddress;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import dev.kastle.netty.channel.nethernet.config.NetherNetAddress;
import java.net.IDN;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class03420 implements IServerAddress {
   private static final Logger N = LogUtils.getLogger();
   private final HostAndPort y;
   private static final class03420 L = new class03420(HostAndPort.fromParts("server.invalid", 25565));
   private NetherNetAddress u;

   static int L(String var0) {
      try {
         return Integer.parseInt(var0.trim());
      } catch (Exception exception) {
         return 25565;
      }
   }

   public class03420(String var1, int var2) {
      this(HostAndPort.fromParts(var1, var2));
   }

   private class03420(HostAndPort var1) {
      super();
      this.y = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof class03420 ? this.y.equals(((class03420)var1).y) : false;
      }
   }

   @Override
   public String toString() {
      return this.y.toString();
   }

   @Override
   public int hashCode() {
      return this.y.hashCode();
   }

   public int y() {
      return this.y.getPort();
   }

   public static boolean y(String var0) {
      try {
         String s = HostAndPort.fromString(var0).getHost();
         if (!s.isEmpty()) {
            IDN.toASCII(s);
            return true;
         }
      } catch (IllegalArgumentException illegalargumentexception) {
      }

      return false;
   }

   private static void N(String var0, CallbackInfoReturnable var1) {
      if (!((class03420)var1.getReturnValue()).equals(L) && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
         var1.setReturnValue(class03459.N.y.lookupRedirect((class03420)var1.getReturnValue()).orElse((class03420)var1.getReturnValue()));
      }
   }

   public String N() {
      try {
         return IDN.toASCII(this.y.getHost());
      } catch (IllegalArgumentException illegalargumentexception) {
         return "";
      }
   }

   public static class03420 N(@Nullable String var0) {
      if (var0 == null) {
         class03420 class03420xxxxx;
         class03420 class03420x = class03420xxxxx = L;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class03420xxxxx);
         N(var0, callbackinforeturnable);
         return callbackinforeturnable.isCancelled() ? (class03420)callbackinforeturnable.getReturnValue() : class03420x;
      } else {
         class03420 class03420x;
         label44: {
            try {
               HostAndPort hostandport = HostAndPort.fromString(var0).withDefaultPort(25565);
               if (hostandport.getHost().isEmpty()) {
                  class03420x = L;
                  break label44;
               }

               class03420x = new class03420(hostandport);
            } catch (IllegalArgumentException illegalargumentexception) {
               N.info("Failed to parse URL {}", var0, illegalargumentexception);
               class03420 class03420x;
               class03420x = class03420x = L;
               CallbackInfoReturnable callbackinforeturnable3 = new CallbackInfoReturnable("", true, class03420x);
               N(var0, callbackinforeturnable3);
               if (callbackinforeturnable3.isCancelled()) {
                  return (class03420)callbackinforeturnable3.getReturnValue();
               }

               return class03420x;
            }

            class03420 class03420x = class03420x;
            CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true, class03420x);
            N(var0, callbackinforeturnable2);
            if (callbackinforeturnable2.isCancelled()) {
               return (class03420)callbackinforeturnable2.getReturnValue();
            }

            return class03420x;
         }

         class03420 class03420x = class03420x;
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true, class03420x);
         N(var0, callbackinforeturnable1);
         return callbackinforeturnable1.isCancelled() ? (class03420)callbackinforeturnable1.getReturnValue() : class03420x;
      }
   }

   public void viaFabricPlus$setNetherNetAddress(NetherNetAddress var1) {
      this.u = var1;
   }

   public NetherNetAddress viaFabricPlus$getNetherNetAddress() {
      return this.u;
   }
}
