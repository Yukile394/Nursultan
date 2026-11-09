package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03587 extends class06761 implements class00873 {
   public static final MapCodec<class03587> L = y(class03587::new);
   public static final int u = 4;
   public static final class08071 i = class06665.Nl;
   public static final class08064<class08059> R = class06761.y;
   private static final int M = 3;
   private static final int B = 1;
   private static final class00494 Z = class00891.y(6.0, -1.0, 3.0);
   private static final class00494 O = class00891.y(10.0, -1.0, 5.0);
   private final Function<class00500, class00494> F = this.L();
   private static final class00494 A;
   private static final class00494 f;
   private static final class00494[] C;
   private static final class00494[] S;

   @Nullable
   private class03566 L(class05487 var1, class07209 var2, class00500 var3) {
      if (U(var3)) {
         return new class03566(var2, var3);
      } else {
         class07209 class07209 = var2.method_10074();
         class00500 class00500 = var1.method_8320(class07209);
         return U(class00500) ? new class03566(class07209, class00500) : null;
      }
   }

   private Function<class00500, class00494> L() {
      int[] aint = new int[]{0, 9, 11, 22, 26};
      return this.N(var1x -> {
         int ix = (var1x.L(i) == 0 ? 4 : 6) + aint[var1x.L(i)];
         int j = var1x.L(i) == 0 ? 6 : 10;

         return switch ((class08059)var1x.L(R)) {
            case field_12607 -> class00891.y(j, -1.0, Math.min(16, -1 + ix));
            case field_12609 -> class00891.y(j, 0.0, Math.max(0, -1 + ix - 16));
         };
      });
   }

   private boolean T(class00500 var1) {
      return var1.L(i) >= 4;
   }

   public class03587(class01362 var1) {
      super(var1);
   }

   private static boolean U(class00500 var0) {
      return var0.N(class00869.El) && var0.L(R) == class08059.field_12607;
   }

   private static boolean y(class05487 var0, class07209 var1) {
      return class06772.N(var0, var1);
   }

   @Override
   public void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      float fx = class06772.N(this, var2, var3);
      if (var4.y((int)(25.0F / fx) + 1) == 0) {
         this.N(var2, var1, var3, 1);
      }
   }

   private static boolean y(int var0) {
      return var0 >= 3;
   }

   private void y(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         if (var1.L(i) == 0) {
            var5.setReturnValue(Z);
         } else {
            var5.setReturnValue(var1.L(R) == class08059.field_12607 ? O : super.y_4(var1, var2, var3, var4));
         }
      }
   }

   @Override
   public class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.y(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class00494)callbackinforeturnable.getReturnValue();
      } else if (var1.L(R) == class08059.field_12607) {
         return var1.L(i) == 0 ? Z : O;
      } else {
         return class00389.N();
      }
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         int ix = var1.L(i);
         if (var1.L(R) == class08059.field_12609) {
            var5.setReturnValue(C[Math.min(Math.abs(4 - (ix + 1)), C.length - 1)]);
         } else {
            var5.setReturnValue(S[ix]);
         }
      }
   }

   @Override
   public MapCodec<class03587> N() {
      return L;
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class03566 class03566 = this.L(var1, var3, var4);
      if (class03566 != null) {
         this.N(var1, class03566.y(), class03566.N(), 1);
      }
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      class03566 class03566 = this.L(var1, var2, var3);
      return class03566 == null ? false : this.N(var1, class03566.N(), class03566.y(), class03566.y().L(i) + 1);
   }

   private boolean N(class05487 var1, class07209 var2, class00500 var3, int var4) {
      return !this.T(var3) && y(var1, var2) && (!y(var4) || N(var1, var2.method_10084()));
   }

   @Override
   public void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var2 instanceof class04782 class04782 && var4 instanceof class07153 && class04782.method_64395().N(class07305.I)) {
         class04782.N(var3, true, var4);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(i);
      super.N(var1);
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class00869.Lr);
   }

   @Override
   public class00500 N(class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8) {
      if (y(var1.L(i))) {
         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         return var1.N(var2, var4) ? var1 : class00869.N.W();
      }
   }

   @Override
   public class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : this.F.apply(var1);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      return this.W();
   }

   private void N(class04782 var1, class00500 var2, class07209 var3, int var4) {
      int ix = Math.min(var2.L(i) + var4, 4);
      if (this.N(var1, var3, var2, ix)) {
         class00500 class00500 = var2.y(i, ix);
         var1.method_8652(var3, class00500, 2);
         if (y(ix)) {
            var1.method_8652(var3.method_10084(), class00500.y(R, class08059.field_12609), 3);
         }
      }
   }

   private static boolean N(class05487 var0, class07209 var1) {
      class00500 class00500 = var0.method_8320(var1);
      return class00500.P() || class00500.N(class00869.El);
   }

   @Override
   public boolean N(class00500 var1, class06942 var2) {
      return false;
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
   }

   @Override
   public boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return U(var1) && !y(var2, var3) ? false : super.a_(var1, var2, var3);
   }

   @Override
   public boolean e_(class00500 var1) {
      return var1.L(R) == class08059.field_12607 && !this.T(var1);
   }
}
