package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06566 extends class06581 {
   public static float N = 1.5F;

   public class06566(class06573 var1) {
      super(var1);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class06584 class06584 = var2.method_5998(var3);
         var1.method_43128(
            null,
            var2.method_23317(),
            var2.method_23318(),
            var2.method_23321(),
            class04909.Uy,
            class04911.field_15254,
            0.5F,
            0.4F / (var1.method_8409().z() * 0.4F + 0.8F)
         );
         if (var1 instanceof class04782 class04782) {
            class08005.N(class07488::new, class04782, class06584, var2, 0.0F, N, 1.0F);
         }

         var2.method_7259(class01235.L.y(this));
         class06584.N(1, var2);
         return class07082.N;
      }
   }

   private void N(class07299 var1, class08036 var2, class07050 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) && var2.method_31549().u) {
         var4.setReturnValue(class07082.i);
      }
   }
}
