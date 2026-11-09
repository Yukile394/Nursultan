package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00899 extends class06772 {
   public static final MapCodec<class00899> N = y(class00899::new);
   private static final class00494[] y = class00891.N(7, var0 -> class00891.y(16.0, 0.0, 2 + var0));
   private static final class00494 L;

   public class00899(class01362 var1) {
      super(var1);
   }

   @Override
   protected class07310 i() {
      return class06570.Gb;
   }

   private void N(CallbackInfoReturnable var1) {
      if (DebugSettings.INSTANCE.legacyCropOutlines.isEnabled()) {
         var1.setReturnValue(L);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : y[this.U(var1)];
   }

   @Override
   public MapCodec<class00899> N() {
      return N;
   }
}
