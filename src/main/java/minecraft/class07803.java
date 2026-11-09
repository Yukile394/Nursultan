package minecraft;

import com.mojang.serialization.MapCodec;

public class class07803 extends class06772 {
   public static final MapCodec<class07803> N = y(class07803::new);
   public static final int y = 3;
   public static final class08071 L = class06665.NG;
   private static final class00494[] M = class00891.N(3, var0 -> class00891.y(16.0, 0.0, 2 + var0 * 2));

   @Override
   protected class08071 L() {
      return L;
   }

   public class07803(class01362 var1) {
      super(var1);
   }

   @Override
   protected class07310 i() {
      return class06570.lk;
   }

   @Override
   public int u() {
      return 3;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var4.y(3) != 0) {
         super.y_2(var1, var2, var3, var4);
      }
   }

   @Override
   public MapCodec<class07803> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return M[this.U(var1)];
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   protected int N(class07299 var1) {
      return super.N(var1) / 3;
   }
}
