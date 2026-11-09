package minecraft;

import net.irisshaders.iris.Iris;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03363 extends class03334<class00491, class00957> {
   private static final class01894 L = class01894.y("textures/entity/end_gateway_beam.png");

   @Override
   protected class07311 M() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class07311)callbackinforeturnable.getReturnValue() : class06851.T();
   }

   public class03363() {
      super();
   }

   @Override
   protected float u() {
      return 1.0F;
   }

   public class00957 i() {
      return new class00957();
   }

   public void N(class00491 var1, class00957 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      super.N((class00491)var1, (class00957)var2, var3, var4, var5);
      class07299 class07299 = var1.G();
      if (var1.N() || var1.L() && class07299 != null) {
         var2.y = var1.N() ? var1.N(var3) : var1.y(var3);
         double d0 = var1.N() ? var1.G().method_31600() : 50.0;
         var2.y = class04995.m(var2.y * (float) Math.PI);
         var2.N = class04995.N(var2.y * d0);
         var2.L = var1.N() ? class06563.field_7958.L() : class06563.field_7945.L();
         var2.u = var1.G() != null ? Math.floorMod(var1.G().N(), 40) + var3 : 0.0F;
      } else {
         var2.N = 0;
      }
   }

   public void N(class00957 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.N > 0) {
         class03575.N(var2, var3, L, var1.y, var1.u, -var1.N, var1.N * 2, var1.L, 0.15F, 0.175F);
      }

      super.N(var1, var2, var3, var4);
   }

   private static void N(CallbackInfoReturnable var0) {
      if (Iris.getCurrentPack().isPresent()) {
         var0.setReturnValue(class06851.u(class00995.y));
      }
   }

   @Override
   protected float R() {
      return 0.0F;
   }

   @Override
   public int u_() {
      return 256;
   }
}
