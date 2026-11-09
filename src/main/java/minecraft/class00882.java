package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00882 extends class00891 {
   public static final MapCodec<class00882> N = y(class00882::new);
   public static final class08071 y = class06665.Nk;
   public static final int L = 15;
   private static final class00494 u = class00891.y(14.0, 0.0, 16.0);
   private static final class00494 i = class00891.y(14.0, 0.0, 15.0);
   private static final int R = 3;
   private static final int M = 8;
   private static final double B = 0.1;
   private static final double Z = 0.25;
   private static final class00494 O;

   public class00882(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, 0));
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      class07209 class07209 = var3.method_10084();
      if (var2.R(class07209)) {
         int ix = 1;
         int j = var1.L(y);

         while (var2.method_8320(var3.method_10087(ix)).N(this)) {
            if (++ix == 3 && j == 15) {
               return;
            }
         }

         if (j == 8 && this.a_(this.W(), var2, var3.method_10084())) {
            double d0 = ix >= 3 ? 0.25 : 0.1;
            if (var4.U() <= d0) {
               var2.method_8501(class07209, class00869.iv.W());
            }
         } else if (j == 15 && ix < 3) {
            var2.method_8501(class07209, this.W());
            class00500 class00500 = var1.y(y, 0);
            var2.method_8652(var3, class00500, 260);
            var2.method_41410(class00500, class07209, this, null, false);
         }

         if (j < 15) {
            var2.method_8652(var3, var1.y(y, j + 1), 260);
         }
      }
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      class00494 class00494x;
      class00494 class00494x = class00494x = i;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class00494x);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : class00494x;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      var4.method_64419(var2.method_48963().U(), 1.0F);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         var5.setReturnValue(O);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!var1.N(var2, var3)) {
         var2.N(var3, true);
      }
   }

   @Override
   public MapCodec<class00882> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (!var1.N(var2, var4)) {
         var3.N(var4, this, 1);
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      for (class07211 class07211 : class07221.field_11062) {
         if (var2.method_8320(var3.method_10093(class07211)).B() || var2.method_8316(var3.method_10093(class07211)).N(class01231.y)) {
            return false;
         }
      }

      class00500 class00500 = var2.method_8320(var3.method_10074());
      return (class00500.N(class00869.ij) || class00500.N(class01210.I)) && !var2.method_8320(var3.method_10084()).T();
   }
}
