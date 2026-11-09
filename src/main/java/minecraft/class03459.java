package minecraft;

import Nursultan.class10199;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IServerAddress;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import dev.kastle.netty.channel.nethernet.config.NetherNetAddress;
import java.util.Optional;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03459 {
   public static final class03459 N = new class03459(class03450.y, class03452.N(), class03422.N());
   private final class03450 L;
   public final class03452 y;
   private final class03422 u;

   private void L(class03420 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
         var2.setReturnValue(this.L.resolve(var1));
      }
   }

   class03459(class03450 var1, class03452 var2, class03422 var3) {
      super();
      this.L = var1;
      this.y = var2;
      this.u = var3;
   }

   private void y(class03420 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var2.setReturnValue(this.L.resolve(var1));
      }
   }

   public Optional<class03437> N(class03420 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (Optional<class03437>)callbackinforeturnable.getReturnValue();
      } else {
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true);
         this.y(var1, callbackinforeturnable1);
         if (callbackinforeturnable1.isCancelled()) {
            return (Optional<class03437>)callbackinforeturnable1.getReturnValue();
         } else {
            CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true);
            this.L(var1, callbackinforeturnable2);
            if (callbackinforeturnable2.isCancelled()) {
               return (Optional<class03437>)callbackinforeturnable2.getReturnValue();
            } else {
               Optional<class03437> optional = this.L.resolve(var1);
               if ((!optional.isPresent() || this.u.N(optional.get())) && this.u.N(var1)) {
                  Optional<class03420> optional1 = this.y.lookupRedirect(var1);
                  if (optional1.isPresent()) {
                     optional = this.L.resolve(optional1.get()).filter(this.u::N);
                  }

                  return optional;
               } else {
                  return Optional.empty();
               }
            }
         }
      }
   }

   private void N(class03420 var1, CallbackInfoReturnable var2) {
      if (var1 instanceof IServerAddress iserveraddress && iserveraddress.viaFabricPlus$getNetherNetAddress() != null) {
         NetherNetAddress nethernetaddress = iserveraddress.viaFabricPlus$getNetherNetAddress();
         var2.setReturnValue(Optional.of(new class10199(this, nethernetaddress)));
      }
   }
}
