package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03369 implements class03358<class07264, class00980> {
   public static final class05913 N = class05911.P.N("enchanting_table_book");
   private final class08097 y;
   private final class01127 L;

   public class03369(class04811 var1) {
      super();
      this.y = var1.B();
      this.L = new class01127(var1.N(class04802.J));
   }

   public void N(class00980 var1, class01421 var2, class01237 var3, class06959 var4, CallbackInfo var5) {
      if (!SodiumExtraClientMod.options().renderSettings.enchantingTableBook) {
         var5.cancel();
      }
   }

   public class00980 i() {
      return new class00980();
   }

   public void N(class07264 var1, class00980 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.L = class04995.B(var3, var1.L, var1.y);
      var2.u = class04995.B(var3, var1.M, var1.R);
      var2.N = var1.N + var3;
      float f = var1.B - var1.Z;

      while (f >= (float) Math.PI) {
         f -= (float) (Math.PI * 2);
      }

      while (f < (float) -Math.PI) {
         f += (float) (Math.PI * 2);
      }

      var2.y = var1.Z + f * var3;
   }

   public void N(class00980 var1, class01421 var2, class01237 var3, class06959 var4) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         var2.N();
         var2.N(0.5F, 0.75F, 0.5F);
         var2.N(0.0F, 0.1F + class04995.m(var1.N * 0.1F) * 0.01F, 0.0F);
         float f = var1.y;
         var2.N(class02058.u.rotation(-f));
         var2.N(class02058.R.N(80.0F));
         float f1 = class04995.M(var1.L + 0.25F) * 1.6F - 0.3F;
         float f2 = class04995.M(var1.L + 0.75F) * 1.6F - 0.3F;
         class01138 class01138 = new class01138(var1.N, class04995.N(f1, 0.0F, 1.0F), class04995.N(f2, 0.0F, 1.0F), var1.u);
         var3.N(this.L, class01138, var2, N.N(class06851::u), var1.Z, class01384.u, -1, this.y.N(N), 0, var1.z);
         var2.y();
      }
   }
}
