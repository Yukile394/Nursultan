package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00643 extends class00864 {
   public static final MapCodec<class00643> N = y(class00643::new);
   private static final class00494 y = class00891.y(14.0, 0.0, 1.5);
   private static final class00494 L;

   public class00643(class01362 var1) {
      super(var1);
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      class04688 class04688x = var2.method_8316(var3);
      class04688 class04688x = var2.method_8316(var3.method_10084());
      return (class04688x.N() == class04684.L || var1.i() instanceof class07133) && class04688x.N() == class04684.N;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var5.setReturnValue(L);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : y;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      super.N(var1, var2, var3, var4, var5, var6);
      if (var2 instanceof class04782 && var4 instanceof class00250) {
         var2.N(new class07209(var3), true, var4);
      }
   }

   @Override
   public MapCodec<class00643> N() {
      return N;
   }
}
