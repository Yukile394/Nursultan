package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04873 extends class00891 implements class06084 {
   public static final MapCodec<class04873> y = y(class04873::new);
   public static final class06667 L = class06665.W;
   public static final class06667 u = class06665.q;
   private static final class00494 N = class00389.N(class00891.y(4.0, 7.0, 9.0), class00891.y(6.0, 0.0, 7.0));
   private static final class00494 i = N.method_1096(0.0, 0.0625, 0.0).method_1097();
   private static final class00494 R;
   private static final class00494 M;

   public class04873(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, false).y(u, false));
   }

   protected static class07211 U(class00500 var0) {
      return var0.L(L) ? class07211.field_11033 : class07211.field_11036;
   }

   @Override
   public class00494 z(class00500 var1) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         return var1.L(L) ? i : N;
      } else {
         return super.z(var1);
      }
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(u) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());

      for (class07211 class07211 : var1.i()) {
         if (class07211.z() == class07185.field_11052) {
            class00500 class00500 = this.W().y(L, class07211 == class07211.field_11036);
            if (class00500.N((class05487)var1.method_8045(), var1.method_8037())) {
               return class00500.y(u, class04688.N() == class04684.L);
            }
         }
      }

      return null;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(var1.L(L) ? M : R);
      }
   }

   @Override
   public MapCodec<? extends class04873> N() {
      return y;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      class00494 class00494x;
      class00494 class00494x = class00494x = var1.L(L) ? i : N;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class00494x);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : class00494x;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(u)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return U(var1).b() == var5 && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, u);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07211 class07211 = U(var1).b();
      return class00891.N_6(var2, var3.method_10093(class07211), class07211.b());
   }
}
