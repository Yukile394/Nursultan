package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class01802 extends class03137 implements class06084 {
   public static final MapCodec<class01802> L = y(class01802::new);
   public static final class06667 i = class06665.q;

   public class01802(class01362 var1) {
      super(var1);
      this.P(this.W().y(i, false));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(i) ? class04684.L.N(true) : super.u(var1);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(i);
   }

   @Override
   protected MapCodec<? extends class01802> N() {
      return L;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(i)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Nullable
   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return super.N(var1).y(i, class04688.y(class04684.L));
   }
}
