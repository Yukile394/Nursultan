package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06996 extends class00864 implements class00873, class06084 {
   public static final MapCodec<class06996> N = y(class06996::new);
   public static final int y = 4;
   public static final class08071 L = class06665.Nx;
   public static final class06667 u = class06665.q;
   private static final class00494 i = class00891.y(4.0, 0.0, 6.0);
   private static final class00494 R = class00891.y(10.0, 0.0, 6.0);
   private static final class00494 M = class00891.y(12.0, 0.0, 6.0);
   private static final class00494 B = class00891.y(12.0, 0.0, 7.0);
   private static final class00494 Z;

   public class06996(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, 1).y(u, true));
   }

   public static boolean U(class00500 var0) {
      return !var0.L(u);
   }

   @Override
   public class00494 z(class00500 var1) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         return switch (var1.L(L)) {
            case 2 -> R;
            case 3 -> M;
            case 4 -> B;
            default -> i;
         };
      } else {
         return super.z(var1);
      }
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(u) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   public class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) ? class00389.N() : super.y_4(var1, var2, var3, var4);
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      byte b0 = 5;
      byte b1 = 1;
      byte b2 = 2;
      int ix = 0;
      int j = var3.method_10263() - 2;
      int k = 0;

      for (int l = 0; l < 5; l++) {
         for (int i1 = 0; i1 < b1; i1++) {
            int j1 = 2 + var3.method_10264() - 1;

            for (int k1 = j1 - 2; k1 < j1; k1++) {
               class07209 class07209 = new class07209(j + l, k1, var3.method_10260() - k + i1);
               if (!class07209.equals(var3)
                  && var2.y(6) == 0
                  && var1.method_8320(class07209).N(class00869.K)
                  && var1.method_8320(class07209.method_10074()).N(class01210.NJ)) {
                  var1.method_8652(class07209, class00869.mA.W().y(L, var2.y(4) + 1), 3);
               }
            }
         }

         if (ix < 2) {
            b1 += 2;
            k++;
         } else {
            b1 -= 2;
            k--;
         }

         ix++;
      }

      var1.method_8652(var3, var4.y(L, 4), 2);
   }

   @Override
   public MapCodec<class06996> N() {
      return N;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return !U(var3) && var1.method_8320(var2.method_10074()).N(class01210.NJ);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class00500 class00500 = var1.method_8045().method_8320(var1.method_8037());
      if (class00500.N(this)) {
         return class00500.y(L, Math.min(4, class00500.L(L) + 1));
      } else {
         boolean flag = var1.method_8045().method_8316(var1.method_8037()).N() == class04684.L;
         return super.N(var1).y(u, flag);
      }
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(Z);
      }
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (!var1.N(var2, var4)) {
         return class00869.N.W();
      } else {
         if (var1.L(u)) {
            var3.N(var4, class04684.L, class04684.L.N(var2));
         }

         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @Override
   protected boolean N(class00500 var1, class06942 var2) {
      return !var2.method_8046() && var2.method_8041().N(this.B()) && var1.L(L) < 4 ? true : super.N(var1, var2);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, u);
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return !var1.M(var2, var3).method_20538(class07211.field_11036).method_1110() || var1.L(var2, var3, class07211.field_11036);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class00494)callbackinforeturnable.getReturnValue();
      } else {
         return switch (var1.L(L)) {
            case 2 -> R;
            case 3 -> M;
            case 4 -> B;
            default -> i;
         };
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      return this.N(var2.method_8320(class07209), var2, class07209);
   }
}
