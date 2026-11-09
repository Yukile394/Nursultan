package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.OptionalInt;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07131 extends class00891 implements class06084 {
   public static final int L = 7;
   public static final class08071 u = class06665.NJ;
   public static final class06667 i = class06665.w;
   public static final class06667 R = class06665.q;
   protected final float M;
   private static final int N = 1;
   private static boolean y = true;

   public static OptionalInt T(class00500 var0) {
      if (var0.N(class01210.g)) {
         return OptionalInt.of(0);
      } else {
         return var0.y(u) ? OptionalInt.of(var0.L(u)) : OptionalInt.empty();
      }
   }

   public class07131(float var1, class01362 var2) {
      super(var2);
      this.M = var1;
      this.P(this.Q.y().y(u, 7).y(i, false).y(R, false));
   }

   private static int b(class00500 var0) {
      return T(var0).orElse(7);
   }

   protected boolean U(class00500 var1) {
      return !var1.L(i) && var1.L(u) == 7;
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(R) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected class00494 u(class00500 var1, class07290 var2, class07209 var3) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : class00389.N();
   }

   private void y(class07299 var1, class07209 var2, class06069 var3, class00500 var4, class07209 var5) {
      if (!(var3.z() >= this.M)) {
         if (!N(var4.M(var1, var5), class07211.field_11036)) {
            this.N(var1, var2, var3);
         }
      }
   }

   private static class00500 y(class00500 var0, class07284 var1, class07209 var2) {
      int ix = 7;
      class07218 class07218 = new class07218();

      for (class07211 class07211 : class07211.values()) {
         class07218.N(var2, class07211);
         ix = Math.min(ix, b(var1.method_8320(class07218)) + 1);
         if (ix == 1) {
            break;
         }
      }

      return var0.y(u, ix);
   }

   @Override
   protected boolean y(class00500 var1, class00500 var2, class07211 var3) {
      return !y && var2.i() instanceof class07131 ? true : super.y(var1, var2, var3);
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (this.U(var1)) {
         y(var1, var2, var3);
         var2.method_8650(var3, false);
      }
   }

   private static void N(class07299 var0, class07209 var1, class06069 var2, class00500 var3, class07209 var4) {
      if (var0.method_8520(var1.method_10084())) {
         if (var2.y(15) == 1) {
            if (!var3.G() || !var3.L(var0, var4, class07211.field_11036)) {
               class02615.N(var0, var1, var2, class07107.W);
            }
         }
      }
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().betweenInclusive(ProtocolVersion.v1_14, ProtocolVersion.v1_15_2)) {
         var4.setReturnValue(super.u(var1, var2, var3));
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return y(this.W().y(i, true).y(R, class04688.N() == class04684.L), var1.method_8045(), var1.method_8037());
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(u, i, R);
   }

   protected abstract void N(class07299 var1, class07209 var2, class06069 var3);

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      var2.method_8652(var3, y(var1, var2, var3), 3);
   }

   public static void N(boolean var0) {
      y = var0;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(R)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      int ix = b(var7) + 1;
      if (ix != 1 || var1.L(u) != ix) {
         var3.N(var4, this, 1);
      }

      return var1;
   }

   @Override
   public abstract MapCodec<? extends class07131> N();

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      super.N_20(var1, var2, var3, var4);
      class07209 class07209 = var3.method_10074();
      class00500 class00500 = var2.method_8320(class07209);
      N(var2, var3, var4, class00500, class07209);
      this.y(var2, var3, var4, class00500, class07209);
   }

   @Override
   protected int b_(class00500 var1) {
      return 1;
   }

   @Override
   protected boolean e_(class00500 var1) {
      return var1.L(u) == 7 && !var1.L(i);
   }
}
