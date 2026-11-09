package minecraft;

import org.jspecify.annotations.Nullable;

public class class02305 implements class03358<class02261, class00953> {
   private final class08943 N;
   private final class06069 y = class06069.u();

   public class02305(class04811 var1) {
      super();
      this.N = var1.L();
   }

   public void N(class00953 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.N != null) {
         var2.N();
         var2.N(0.5F, 0.4F, 0.5F);
         var2.N(class02058.u.N(var1.y));
         class02893.y(var2, var3, var1.Z, var1.N, this.y);
         var2.y();
      }
   }

   public class00953 i() {
      return new class00953();
   }

   public void N(class02261 var1, class00953 var2, float var3, class06889 var4, @Nullable class08141 var5) {
      class03358.super.N(var1, var2, var3, var4, var5);
      class06584 class06584 = var1.L().N();
      if (class02284.N(var1.L()) && !class06584.R() && var1.G() != null) {
         var2.N = new class08810();
         this.N.N(var2.N.y, class06584, class03662.field_4318, var1.G(), null, 0);
         var2.N.L = class08810.N(class06584.c());
         var2.N.u = class08810.N(class06584);
         class02264 class02264 = var1.u();
         var2.y = class04995.Z(var3, class02264.y(), class02264.N());
      }
   }
}
