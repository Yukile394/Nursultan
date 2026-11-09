package minecraft;

import org.jspecify.annotations.Nullable;

public class class05842 implements class03358<class06119, class00973> {
   private final class08097 N;
   private final class01127 y;
   private final class01138 L = new class01138(0.0F, 0.1F, 0.9F, 1.2F);

   public class05842(class04811 var1) {
      super();
      this.N = var1.B();
      this.y = new class01127(var1.N(class04802.J));
   }

   public void N(class00973 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.N) {
         var2.N();
         var2.N(0.5F, 1.0625F, 0.5F);
         var2.N(class02058.u.N(-var1.y));
         var2.N(class02058.R.N(67.5F));
         var2.N(0.0F, -0.125F, 0.0F);
         var3.N(this.y, this.L, var2, class03369.N.N(class06851::u), var1.Z, class01384.u, -1, this.N.N(class03369.N), 0, var1.z);
         var2.y();
      }
   }

   public class00973 i() {
      return new class00973();
   }

   public void N(class06119 var1, class00973 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      var2.N = var1.w().L(class06127.u);
      var2.y = var1.w().L(class06127.y).R().U();
   }
}
