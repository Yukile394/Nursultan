package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06550 extends class06581 {
   public class06550(class06573 var1) {
      super(var1);
   }

   @Override
   public class07082 N(class06584 var1, class08036 var2, class07438 var3, class07050 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class00392 class00392 = var1.method_58694(class02484.B);
         if (class00392 != null && var3.method_5864().N()) {
            if (!var2.method_73183().method_8608() && var3.method_5805()) {
               var3.method_5665(class00392);
               if (var3 instanceof class07079) {
                  ((class07079)var3).NW();
               }

               var1.B(1);
            }

            return class07082.N;
         } else {
            return class07082.i;
         }
      }
   }

   private void N(class06584 var1, class08036 var2, class07438 var3, class07050 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4) && var3 instanceof class00245) {
         var5.setReturnValue(class07082.i);
      }
   }
}
