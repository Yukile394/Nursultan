package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07022 extends class00891 {
   public static final MapCodec<class07022> N = y(class07022::new);
   private static final class00494 y = class00891.y(16.0, 0.0, 14.0);
   private static final int L = 20;

   @Override
   protected class00494 L(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return class00389.y();
   }

   public class07022(class01362 var1) {
      super(var1);
   }

   @Override
   public float z() {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4) ? 1.0F : super.z();
   }

   @Override
   protected class00494 u(class00500 var1, class07290 var2, class07209 var3) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : class00389.y();
   }

   @Override
   protected float y(class00500 var1, class07290 var2, class07209 var3) {
      return 0.2F;
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }

   @Override
   public MapCodec<class07022> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
         var4.method_18799(var4.method_18798().u(0.4, 1.0, 0.4));
      }
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_13, ProtocolVersion.v1_15_2)) {
         var4.setReturnValue(class00389.N());
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class00884.y(var2, var3.method_10084(), var1);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == class07211.field_11036 && var7.N(class00869.K)) {
         var3.N(var4, this, 20);
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      var2.N(var3, this, 20);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }
}
