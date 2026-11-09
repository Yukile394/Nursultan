package minecraft;

import com.mojang.serialization.MapCodec;

public class class01947 extends class06772 {
   public static final MapCodec<class01947> N = y(class01947::new);
   public static final int y = 1;
   public static final class08071 L = class06665.Nn;
   private static final class00494[] M = class00891.N(1, var0 -> class00891.y(6.0, 0.0, 6 + var0 * 4));
   private static final int B = 1;

   @Override
   protected class08071 L() {
      return L;
   }

   public class01947(class01362 var1) {
      super(var1);
   }

   @Override
   protected class07310 i() {
      return class06570.ll;
   }

   @Override
   public int u() {
      return 2;
   }

   @Override
   public void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var4.y(3) != 0) {
         super.y_2(var1, var2, var3, var4);
      }
   }

   @Override
   public class00500 y(int var1) {
      return var1 == 2 ? class00869.LL.W() : super.y(var1);
   }

   @Override
   public MapCodec<class01947> N() {
      return N;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   protected int N(class07299 var1) {
      return 1;
   }

   @Override
   public class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return M[this.U(var1)];
   }
}
