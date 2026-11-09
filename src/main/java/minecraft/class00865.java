package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.ViaFabricPlusMixinPlugin;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class00865 extends class00891 {
   protected static final int N = 4;
   private static final class00494 u = class00891.y(12.0, 4.0, 16.0);
   public static final class00494 y = class07536.N(
      () -> {
         byte b0 = 4;
         byte b1 = 3;
         byte b2 = 2;
         return class00389.N(
            class00389.y(), class00389.N(class00891.N(16.0, 8.0, 0.0, 3.0), class00891.N(8.0, 16.0, 0.0, 3.0), class00891.y(12.0, 0.0, 3.0), u), class07003.i
         );
      }
   );
   protected final class04835 L;
   private static final class00494 i;
   private boolean R;

   public class00865(class01362 var1, class04835 var2) {
      super(var1);
      this.L = var2;
   }

   protected double U(class00500 var1) {
      return 0.0;
   }

   @Override
   public class00494 z(class00500 var1) {
      this.R = true;
      return super.z(var1);
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return !ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)
            && !ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)
         ? super.y_4(var1, var2, var3, var4)
         : i;
   }

   public abstract boolean E(class00500 var1);

   protected void N(class00500 var1, class07299 var2, class07209 var3, class04651 var4) {
   }

   @Override
   protected abstract MapCodec<? extends class00865> N();

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : y;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ViaFabricPlusMixinPlugin.MORE_CULLING_PRESENT && this.R) {
         this.R = false;
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var5.setReturnValue(class00389.y());
      } else if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(i);
      }
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      return this.L.y().get(var1.B()).interact(var2, var3, var4, var5, var6, var1);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class07209 class07209 = class06342.N((class07299)var2, var3);
      if (class07209 != null) {
         class04651 class04651 = class06342.N(var2, class07209);
         if (class04651 != class04684.N && this.N(class04651)) {
            this.N(var1, var2, var3, class04651);
         }
      }
   }

   protected boolean N(class04651 var1) {
      return false;
   }

   @Override
   protected class00494 b_(class00500 var1, class07290 var2, class07209 var3) {
      return u;
   }
}
