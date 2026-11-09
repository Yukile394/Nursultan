package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03370 implements class03358<class00510, class00976> {
   public class03370() {
      super();
   }

   public void N(class00976 var1, class01421 var2, class01237 var3, class06959 var4, CallbackInfo var5) {
      if (!SodiumExtraClientMod.options().renderSettings.piston) {
         var5.cancel();
      }
   }

   public class00976 i() {
      return new class00976();
   }

   public void N(class00510 var1, class00976 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.L = var1.y(var3);
      var2.u = var1.L(var3);
      var2.i = var1.u(var3);
      var2.N = null;
      var2.y = null;
      class00500 class00500x = var1.M();
      class07299 class07299 = var1.G();
      if (class07299 != null && !class00500x.P()) {
         class07209 class07209x = var1.d().method_10093(var1.R().b());
         class03556<class00780> class03556 = class07299.i(class07209x);
         if (class00500x.N(class00869.yK) && var1.N(var3) <= 4.0F) {
            class00500x = class00500x.y(class00483.u, var1.N(var3) <= 0.5F);
            var2.N = N(class07209x, class00500x, class03556, class07299);
         } else if (var1.u() && !var1.N()) {
            class08083 class08083 = class00500x.N(class00869.yd) ? class08083.field_12634 : class08083.field_12637;
            class00500 class00500x = class00869.yK.W().y(class00483.L, class08083).y(class00483.y, class00500x.L(class00513.y));
            class00500x = class00500x.y(class00483.u, var1.N(var3) >= 0.5F);
            var2.N = N(class07209x, class00500x, class03556, class07299);
            class07209 class07209x = class07209x.method_10093(var1.R());
            class00500x = class00500x.y(class00513.L, true);
            var2.y = N(class07209x, class00500x, class03556, class07299);
         } else {
            var2.N = N(class07209x, class00500x, class03556, class07299);
         }
      }
   }

   public void N(class00976 var1, class01421 var2, class01237 var3, class06959 var4) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (var1.N != null) {
            var2.N();
            var2.N(var1.L, var1.u, var1.i);
            var3.N(var2, var1.N);
            var2.y();
            if (var1.y != null) {
               var3.N(var2, var1.y);
            }
         }
      }
   }

   private static class07942 N(class07209 var0, class00500 var1, class03556<class00780> var2, class07299 var3) {
      class07942 class07942 = new class07942();
      class07942.N = var0;
      class07942.y = var0;
      class07942.L = var1;
      class07942.u = var2;
      class07942.i = var3;
      return class07942;
   }

   @Override
   public int u_() {
      return 68;
   }
}
