package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06579 extends class06581 {
   public class06579(class06573 var1) {
      super(var1);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      if (var2.fields_57fa3311b0e9d3e9b883d09222919bf5a_2 != null) {
         if (!var1.method_8608()) {
            int i = var2.fields_57fa3311b0e9d3e9b883d09222919bf5a_2.N(class06584);
            class06584.N(i, var2, var3.N());
         }

         var1.method_43128(
            null,
            var2.method_23317(),
            var2.method_23318(),
            var2.method_23321(),
            class04909.UV,
            class04911.field_15254,
            1.0F,
            0.4F / (var1.method_8409().z() * 0.4F + 0.8F)
         );
         class06584.N(var2, class01194.Q);
      } else {
         var1.method_43128(
            null,
            var2.method_23317(),
            var2.method_23318(),
            var2.method_23321(),
            class04909.UH,
            class04911.field_15254,
            0.5F,
            0.4F / (var1.method_8409().z() * 0.4F + 0.8F)
         );
         if (var1 instanceof class04782 class04782) {
            int j = (int)(class07323.y(class04782, class06584, var2) * 20.0F);
            int k = class07323.N(class04782, class06584, var2);
            class08005.N(new class00696(var2, var1, k, j), class04782, class06584);
         }

         var2.method_7259(class01235.L.y(this));
         class06584.N(var2, class01194.O);
      }

      class07041 class07041 = class07082.N;
      this.N(var1, var2, var3, null);
      return class07041;
   }

   private void N(class07299 var1, class08036 var2, class07050 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
         var2.method_6104(var3);
      }
   }
}
