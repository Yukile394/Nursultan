package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00483 extends class06760 {
   public static final MapCodec<class00483> N = y(class00483::new);
   public static final class08064<class08083> L = class06665.yE;
   public static final class06667 u = class06665.Y;
   public static final int i = 4;
   private static final class00494 R = class00891.L(16.0, 0.0, 4.0);
   private static final Map<class07211, class00494> M = class00389.u(class00389.N(R, class00891.L(4.0, 4.0, 16.0)));
   private static final Map<class07211, class00494> B = class00389.u(class00389.N(R, class00891.L(4.0, 4.0, 20.0)));
   private static final class00494 Z;
   private static final class00494 O;
   private static final class00494 F;
   private static final class00494 A;
   private static final class00494 f;
   private static final class00494 C;
   private static final class00494 S;
   private static final class00494 x;
   private static final class00494 D;
   private static final class00494 h;
   private static final class00494 r;
   private static final class00494 NN;
   private boolean Ny = false;

   public class00483(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, class08083.field_12637).y(u, false));
   }

   @Override
   public class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         return switch ((class07211)var1.L(y)) {
            case field_11033 -> class00389.N(C, x);
            case field_11036 -> class00389.N(f, S);
            case field_11043 -> class00389.N(A, h);
            case field_11035 -> class00389.N(F, D);
            case field_11039 -> class00389.N(O, NN);
            case field_11034 -> class00389.N(Z, r);
         };
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         this.Ny = true;
         return this.N(var1, var2, var3, var4);
      } else {
         return super.y_4(var1, var2, var3, var4);
      }
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L, u);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(var3.L(L) == class08083.field_12634 ? class00869.yd : class00869.yq);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (this.Ny) {
         this.Ny = false;
      } else {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            var5.setReturnValue(switch ((class07211)var1.L(y)) {
               case field_11033 -> C;
               case field_11036 -> f;
               case field_11043 -> A;
               case field_11035 -> F;
               case field_11039 -> O;
               case field_11034 -> Z;
            });
         }
      }
   }

   @Override
   protected MapCodec<class00483> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class07209 class07209 = var3.method_10093(var1.L(y).b());
      if (this.N(var1, var2.method_8320(class07209))) {
         var2.N(class07209, true);
      }
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      if (!var1.method_8608() && var4.method_66324()) {
         class07209 class07209 = var2.method_10093(var3.L(y).b());
         if (this.N(var3, var1.method_8320(class07209))) {
            var1.N(class07209, false);
         }
      }

      return super.N(var1, var2, var3, var4);
   }

   private boolean N(class00500 var1, class00500 var2) {
      class00891 class00891 = var1.L(L) == class08083.field_12637 ? class00869.yq : class00869.yd;
      return var2.N(class00891) && var2.L(class00513.L) && var2.L(y) == var1.L(y);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : (var1.L(u) ? M : B).get(var1.L(y));
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (var1.N((class05487)var2, var3)) {
         var2.method_8492(var3.method_10093(var1.L(y).b()), var4, class02752.N(var5, var1.L(y).b()));
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5.b() == var1.L(y) && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class00500 class00500 = var2.method_8320(var3.method_10093(var1.L(y).b()));
      return this.N(var1, class00500) || class00500.N(class00869.LN) && class00500.L(y) == var1.L(y);
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }
}
