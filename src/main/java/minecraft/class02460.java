package minecraft;

import com.mojang.serialization.MapCodec;

public class class02460 extends class00891 implements class06084 {
   public static final MapCodec<class02460> N = y(class02460::new);
   public static final class06667 y = class06665.q;
   private static final class00494 L = class00891.y(8.0, 0.0, 8.0);

   public class02460(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, false));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(y) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return L;
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   public class00500 N(class06942 var1) {
      class04688 class04688 = var1.method_8045().method_8316(var1.method_8037());
      return this.W().y(y, class04688.y(class04684.L));
   }

   @Override
   public MapCodec<class02460> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(y)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
