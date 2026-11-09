package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00902 extends class07796 {
   public static final MapCodec<class00902> N = y(class00902::new);
   public static final class06667[] y = new class06667[]{class06665.m, class06665.P, class06665.s};
   private static final class00494 L = class00389.N(class00891.y(2.0, 2.0, 14.0), class00891.y(14.0, 0.0, 2.0));
   private static final class00494 u;

   public class00902(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y[0], false).y(y[1], false).y(y[2], false));
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return class07482.N(var2.method_8321(var3));
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y[0], y[1], y[2]);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         var5.setReturnValue(u);
      }
   }

   @Override
   public MapCodec<class00902> N() {
      return N;
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class00415(var1, var2);
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1.method_8608() ? null : N(var3, class00404.field_11894, class00415::N);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : L;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608() && var2.method_8321(var3) instanceof class00415 class00415) {
         var4.method_17355(class00415);
         var4.method_7281(class01235.NL);
      }

      return class07082.N;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      double d0 = var3.method_10263() + 0.4 + var4.z() * 0.2;
      double d1 = var3.method_10264() + 0.7 + var4.z() * 0.3;
      double d2 = var3.method_10260() + 0.4 + var4.z() * 0.2;
      var2.method_8406(class07107.NZ, d0, d1, d2, 0.0, 0.0, 0.0);
   }
}
