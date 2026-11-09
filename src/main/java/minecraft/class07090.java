package minecraft;

import com.mojang.serialization.MapCodec;

public class class07090 extends class00864 {
   public static final MapCodec<class07090> N = y(class07090::new);
   public static final int y = 3;
   public static final class08071 L = class06665.NG;
   private static final class00494[] u = class00891.N(3, var0 -> class00891.y(16.0, 0.0, 5 + var0 * 3));

   public class07090(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, 0));
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      int i = var1.L(L);
      if (i < 3 && var4.y(10) == 0) {
         var1 = var1.y(L, i + 1);
         var2.method_8652(var3, var1, 2);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u[var1.L(L)];
   }

   @Override
   public MapCodec<class07090> N() {
      return N;
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(class06570.nm);
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.N(class00869.iw);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   protected boolean e_(class00500 var1) {
      return var1.L(L) < 3;
   }
}
