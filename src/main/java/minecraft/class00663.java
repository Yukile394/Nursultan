package minecraft;

import Nursultan.class09351;
import Nursultan.class11938;
import com.mojang.serialization.MapCodec;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00663 extends class00891 {
   public static final MapCodec<class00663> N = y(class00663::new);

   public class00663(class01362 var1) {
      super(var1);
   }

   private void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6, CallbackInfo var7) {
      if (var2.method_8608() && var4 == (class04453)class06202.Nq().T_4) {
         class09351 class09351 = class09351.N(var3);
         class11938.L().L(class09351);
         if (class09351.y()) {
            var7.cancel();
         }
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, var6, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         class06889 class06889 = new class06889(0.25, 0.05F, 0.25);
         if (var4 instanceof class07438 && ((class07438)var4).method_6059(class07047.V)) {
            class06889 = new class06889(0.5, 0.25, 0.5);
         }

         var4.method_5844(var1, class06889);
      }
   }

   @Override
   public MapCodec<class00663> N() {
      return N;
   }
}
