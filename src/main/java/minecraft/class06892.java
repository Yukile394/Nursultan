package minecraft;

import com.mojang.serialization.MapCodec;

public class class06892 extends class07760 {
   public static final MapCodec<class06892> y = y(class06892::new);
   public static final class08064<class08080> L = class06665.NU;

   @Override
   public class08092<class08080> L() {
      return L;
   }

   public class06892(class01362 var1) {
      super(false, var1);
      this.P(this.Q.y().y(L, class08080.field_12665).y(N, false));
   }

   @Override
   public MapCodec<class06892> N() {
      return y;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, N);
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      class08080 class08080x = var1.L(L);
      class08080 class08080x = this.N(class08080x, var2);
      return var1.y(L, class08080x);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      class08080 class08080x = var1.L(L);
      class08080 class08080x = this.N(class08080x, var2);
      return var1.y(L, class08080x);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4) {
      if (var4.W().j() && new class06897(var2, var3, var1).y() == 3) {
         this.N(var2, var3, var1, false);
      }
   }
}
