package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public interface class06084 extends class00886, class07132 {
   private void N(class07438 var1, class07290 var2, class07209 var3, class00500 var4, class04651 var5, CallbackInfoReturnable var6) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var6.setReturnValue(false);
      }
   }

   private void N(class07284 var1, class07209 var2, class00500 var3, class04688 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var5.setReturnValue(false);
      }
   }

   @Override
   default class06584 N(@Nullable class07438 var1, class07284 var2, class07209 var3, class00500 var4) {
      if (var4.L(class06665.q)) {
         var2.method_8652(var3, var4.y(class06665.q, false), 3);
         if (!var4.N(var2, var3)) {
            var2.N(var3, true);
         }

         return new class06584(class06570.jE);
      } else {
         return class06584.E;
      }
   }

   @Override
   default boolean N(class07284 var1, class07209 var2, class00500 var3, class04688 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else if (!var3.L(class06665.q) && var4.N() == class04684.L) {
         if (!var1.method_8608()) {
            var1.method_8652(var2, var3.y(class06665.q, true), 3);
            var1.N(var2, var4.N(), var4.N().N(var1));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default boolean N(@Nullable class07438 var1, class07290 var2, class07209 var3, class00500 var4, class04651 var5) {
      boolean flag;
      boolean flag1 = flag = var5 == class04684.L;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag);
      this.N(var1, var2, var3, var4, var5, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : flag1;
   }

   @Override
   default Optional<class04891> s_() {
      return class04684.L.z();
   }
}
