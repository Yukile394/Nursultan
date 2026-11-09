package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.features.block.interaction.Block1_14;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class03710 extends class00891 {
   private static final class00494 N = class00891.y(4.0, 0.0, 10.0);

   public class03710(class01362 var1) {
      super(var1);
   }

   private void N(class00500 var1, class05487 var2, class07209 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14)
         && Block1_14.isExceptBlockForAttachWithPiston(var2.method_8320(var3).i())) {
         var4.setReturnValue(false);
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == class07211.field_11033 && !this.a_(var1, var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return N;
   }

   @Override
   protected abstract MapCodec<? extends class03710> N();

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      boolean flag;
      boolean flag1 = flag = N_6(var2, var3.method_10074(), class07211.field_11036);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag);
      this.N(var1, var2, var3, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : flag1;
   }
}
