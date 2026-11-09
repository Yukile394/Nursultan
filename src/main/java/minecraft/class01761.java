package minecraft;

import org.jspecify.annotations.Nullable;

public class class01761 implements class03358<class04512, class00968> {
   private final class01781 N;

   public class01761(class04811 var1) {
      super();
      this.N = var1.i();
   }

   public void N(class00968 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.N != null) {
         class03333.N(var2, var3, var1.N, this.N, var1.y, var1.L, var4);
      }
   }

   public class00968 i() {
      return new class00968();
   }

   static void N(class00968 var0, float var1, @Nullable class07049 var2, class01781 var3, double var4, double var6) {
      if (var2 != null) {
         var0.N = var3.y(var2, var1);
         var0.N.G = var0.Z;
         var0.y = (float)class04995.u((double)var1, var4, var6) * 10.0F;
         var0.L = 0.53125F;
         float f = Math.max(var2.method_17681(), var2.method_17682());
         if (f > 1.0) {
            var0.L /= f;
         }
      }
   }

   public void N(class04512 var1, class00968 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      if (var1.G() != null) {
         class04485 class04485 = var1.L();
         class04479 class04479 = class04485.B();
         class07049 class07049 = class04479.N(class04485, var1.G(), class04485.M());
         N(var2, var3, class07049, this.N, class04479.R(), class04479.i());
      }
   }
}
