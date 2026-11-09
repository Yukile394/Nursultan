package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07184 extends class07204 {
   public static final MapCodec<class07184> N = y(class07184::new);
   private static final class00494 y = class00891.y(14.0, 0.0, 16.0);

   private void L(class00500 var1, class07299 var2, class07209 var3) {
      class08057 class08057 = var2.method_8621();

      for (int i = 0; i < 1000; i++) {
         class07209 class07209 = var3.method_10069(
            var2.field_9229.y(16) - var2.field_9229.y(16), var2.field_9229.y(8) - var2.field_9229.y(8), var2.field_9229.y(16) - var2.field_9229.y(16)
         );
         if (var2.method_8320(class07209).P() && class08057.N(class07209) && !var2.method_31606(class07209)) {
            if (var2.method_8608()) {
               for (int j = 0; j < 128; j++) {
                  double d0 = var2.field_9229.U();
                  float f = (var2.field_9229.z() - 0.5F) * 0.2F;
                  float f1 = (var2.field_9229.z() - 0.5F) * 0.2F;
                  float f2 = (var2.field_9229.z() - 0.5F) * 0.2F;
                  double d1 = class04995.u(d0, (double)class07209.method_10263(), (double)var3.method_10263()) + (var2.field_9229.U() - 0.5) + 0.5;
                  double d2 = class04995.u(d0, (double)class07209.method_10264(), (double)var3.method_10264()) + var2.field_9229.U() - 0.5;
                  double d3 = class04995.u(d0, (double)class07209.method_10260(), (double)var3.method_10260()) + (var2.field_9229.U() - 0.5) + 0.5;
                  var2.method_8406(class07107.NM, d1, d2, d3, f, f1, f2);
               }
            } else {
               var2.method_8652(class07209, var1, 2);
               var2.method_8650(var3, false);
            }

            return;
         }
      }
   }

   public class07184(class01362 var1) {
      super(var1);
   }

   @Override
   public class00494 z(class00500 var1) {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? y : super.z(var1);
   }

   @Override
   protected int y() {
      return 5;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(class00389.y());
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      class00494 class00494x;
      class00494 class00494x = class00494x = y;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class00494x);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : class00494x;
   }

   @Override
   public MapCodec<class07184> N() {
      return N;
   }

   @Override
   public int N(class00500 var1, class07290 var2, class07209 var3) {
      return -16777216;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      this.L(var1, var2, var3);
      return class07082.N;
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected void a_(class00500 var1, class07299 var2, class07209 var3, class08036 var4) {
      this.L(var1, var2, var3);
   }
}
