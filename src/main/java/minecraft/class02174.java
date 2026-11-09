package minecraft;

import java.util.function.ToIntFunction;

public class class02174 extends class07084 {
   private static final int u = 2;
   public static final int L = 2;
   private final ToIntFunction<class06069> i;

   public class02174(class01286 var1, int var2, ToIntFunction<class06069> var3) {
      super(var1, var2, class07107.h);
      this.i = var3;
   }

   private void N(class07299 var1, double var2, double var4, double var6) {
      class07162 class07162 = class07078.ys.N(var1, class06113.field_16461);
      if (class07162 != null) {
         class07162.N(2, true);
         class07162.method_5808(var2, var4, var6, var1.method_8409().z() * 360.0F, 0.0F);
         var1.method_8649(class07162);
      }
   }

   @Override
   public void N(class04782 var1, class07438 var2, int var3, class07062 var4) {
      if (var4 == class07062.field_26998) {
         int ix = this.i.applyAsInt(var2.method_59922());
         int j = N(var1.method_64395().N(class07305.k), class02199.N(var2), ix);

         for (int k = 0; k < j; k++) {
            this.N(var2.method_73183(), var2.method_23317(), var2.method_23318() + 0.5, var2.method_23321());
         }
      }
   }

   protected static int N(int var0, class02199 var1, int var2) {
      return var0 < 1 ? var2 : class04995.N(0, var0 - var1.count(var0), var2);
   }
}
