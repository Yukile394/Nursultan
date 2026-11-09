package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07208 extends class00891 {
   public static final MapCodec<class07208> N = y(class07208::new);
   public static final class08071 y = class06665.NC;
   private static final class00494 u = class00891.y(16.0, 0.0, 15.0);
   public static final int L = 7;

   public class07208(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, 0));
   }

   @Override
   public class00494 z(class00500 var1) {
      if (class06202.Nq() != null && class06202.Nq().q()) {
         return super.z(var1);
      } else {
         return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_9_3) ? u : super.z(var1);
      }
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      int i = var1.L(y);
      if (!N((class05487)var2, var3) && !var2.method_8520(var3.method_10084())) {
         if (i > 0) {
            var2.method_8652(var3, var1.y(y, i - 1), 2);
         } else if (!N((class07290)var2, var3)) {
            N(null, var1, var2, var3);
         }
      } else if (i < 7) {
         var2.method_8652(var3, var1.y(y, 7), 2);
      }
   }

   private static boolean N(class05487 var0, class07209 var1) {
      for (class07209 class07209 : class07209.method_10097(var1.method_10069(-4, 0, -4), var1.method_10069(4, 1, 4))) {
         if (var0.method_8316(class07209).N(class01231.N)) {
            return true;
         }
      }

      return false;
   }

   private static boolean N(class07290 var0, class07209 var1) {
      return var0.method_8320(var1.method_10084()).N(class01210.La);
   }

   public static void N(@Nullable class07049 var0, class00500 var1, class07299 var2, class07209 var3) {
      class00500 class00500 = N_19(var1, class00869.z.W(), var2, var3);
      var2.method_8501(var3, class00500);
      var2.N(class01194.L, var3, class01164.N(var0, class00500));
   }

   @Override
   public MapCodec<class07208> N() {
      return N;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (class06202.Nq() == null || !class06202.Nq().q()) {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_9_3)) {
            var5.setReturnValue(class00389.y());
         }
      }
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   public class00500 N(class06942 var1) {
      return !this.W().N((class05487)var1.method_8045(), var1.method_8037()) ? class00869.z.W() : super.N(var1);
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == class07211.field_11036 && !var1.N(var2, var4)) {
         var3.N(var4, this, 1);
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class00494)callbackinforeturnable.getReturnValue() : u;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!var1.N(var2, var3)) {
         N(null, var1, var2, var3);
      }
   }

   @Override
   public void N(class07299 var1, class00500 var2, class07209 var3, class07049 var4, double var5) {
      if (var1 instanceof class04782 class04782
         && var1.field_9229.z() < var5 - 0.5
         && var4 instanceof class07438
         && (var4 instanceof class08036 || class04782.method_64395().N(class07305.I))
         && var4.method_17681() * var4.method_17681() * var4.method_17682() > 0.512F) {
         N(var4, var2, var1, var3);
      }

      super.N(var1, var2, var3, var4, var5);
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class00500 class00500 = var2.method_8320(var3.method_10084());
      return !class00500.B() || class00500.i() instanceof class07188 || class00500.i() instanceof class00511;
   }
}
