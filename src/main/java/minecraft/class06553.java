package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06553 extends class06581 {
   public class06553(class06573 var1) {
      super(var1);
   }

   private void N(class06501 var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) && var1.method_8045().method_8320(var1.method_8037()).N(class01210.A)
         )
       {
         var2.setReturnValue(class07082.N);
      }
   }

   public static class07082 N(class08036 var0, class07299 var1, class07209 var2) {
      class00700 class00700 = null;
      List<class02607> list = class02607.N(var1, class06889.y(var2), var1x -> var1x.yW() == var0);
      boolean flag = false;

      for (class02607 class02607 : list) {
         if (class00700 == null) {
            class00700 = class00700.N(var1, var2);
            class00700.L();
         }

         if (class02607.R(class00700)) {
            class02607.N(class00700, true);
            flag = true;
         }
      }

      if (flag) {
         var1.N(class01194.y, var2, class01164.N(var0));
         return class07082.y;
      } else {
         return class07082.i;
      }
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      if (class07299.method_8320(class07209).N(class01210.A)) {
         class08036 class08036 = var1.method_8036();
         if (!class07299.method_8608() && class08036 != null) {
            class07082 class07082x;
            class07082 class07082x = class07082x = N(class08036, class07299, class07209);
            CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class07082x);
            this.N(var1, callbackinforeturnable);
            if (callbackinforeturnable.isCancelled()) {
               return (class07082)callbackinforeturnable.getReturnValue();
            }

            return class07082x;
         }
      }

      class07051 class07051x;
      class07051 class07051x = class07051x = class07082.i;
      CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true, class07051x);
      this.N(var1, callbackinforeturnable1);
      return (class07082)(callbackinforeturnable1.isCancelled() ? (class07082)callbackinforeturnable1.getReturnValue() : class07051x);
   }
}
