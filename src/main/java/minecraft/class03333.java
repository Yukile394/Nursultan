package minecraft;

import org.jspecify.annotations.Nullable;

public class class03333 implements class03358<class07235, class00968> {
   private final class01781 N;

   public class03333(class04811 var1) {
      super();
      this.N = var1.i();
   }

   public static void N(class01421 var0, class01237 var1, class08800 var2, class01781 var3, float var4, float var5, class06959 var6) {
      var0.N();
      var0.N(0.5F, 0.4F, 0.5F);
      var0.N(class02058.u.N(var4));
      var0.N(0.0F, -0.2F, 0.0F);
      var0.N(class02058.y.N(-30.0F));
      var0.y(var5, var5, var5);
      var3.N(var2, var6, 0.0, 0.0, 0.0, var0, var1);
      var0.y();
   }

   public class00968 i() {
      return new class00968();
   }

   public void N(class00968 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.N != null) {
         N(var2, var3, var1.N, this.N, var1.y, var1.L, var4);
      }
   }

   public void N(class07235 var1, class00968 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      if (var1.G() != null) {
         class07308 class07308 = var1.L();
         class07049 class07049 = class07308.y(var1.G(), var1.d());
         class01761.N(var2, var3, class07049, this.N, class07308.y(), class07308.N());
      }
   }
}
