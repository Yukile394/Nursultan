package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03137 extends class00741 {
   public static final MapCodec<class03137> y = y(class03137::new);

   @Override
   protected class00494 L(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : class00389.N();
   }

   public class03137(class01362 var1) {
      super(var1);
   }

   @Override
   protected boolean y(class00500 var1) {
      return true;
   }

   @Override
   protected float y(class00500 var1, class07290 var2, class07209 var3) {
      return 1.0F;
   }

   @Override
   protected MapCodec<? extends class03137> N() {
      return y;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
         var5.setReturnValue(this.y_4(var1, var2, var3, var4));
      }
   }
}
