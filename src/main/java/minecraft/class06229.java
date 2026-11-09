package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06229 {
   public static final class03202 N = class00780::N;
   public static final class03202 y = (var0, var1, var3) -> var0.u();
   public static final class03202 L = (var0, var1, var3) -> var0.u();
   public static final class03202 u = (var0, var1, var3) -> var0.B();

   public static int L(class07295 var0, class07209 var1) {
      return N(var0, var1, L);
   }

   private static void L(CallbackInfoReturnable var0) {
      if (!SodiumExtraClientMod.options().detailSettings.biomeColors) {
         var0.setReturnValue(5877296);
      }
   }

   public class06229() {
      super();
   }

   public static int u(class07295 var0, class07209 var1) {
      int i;
      int j = i = N(var0, var1, u);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, i);
      y(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueI() : j;
   }

   private static void y(CallbackInfoReturnable var0) {
      if (!SodiumExtraClientMod.options().detailSettings.biomeColors) {
         var0.setReturnValue(4159204);
      }
   }

   public static int y(class07295 var0, class07209 var1) {
      int i;
      int j = i = N(var0, var1, y);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, i);
      L(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueI() : j;
   }

   private static void N(CallbackInfoReturnable var0) {
      if (!SodiumExtraClientMod.options().detailSettings.biomeColors) {
         var0.setReturnValue(9551193);
      }
   }

   private static int N(class07295 var0, class07209 var1, class03202 var2) {
      return var0.method_23752(var1, var2);
   }

   public static int N(class07295 var0, class07209 var1) {
      int i;
      int j = i = N(var0, var1, N);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, i);
      N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueI() : j;
   }
}
