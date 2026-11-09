package minecraft;

import com.mojang.serialization.MapCodec;

public class class00868 extends class00891 {
   public static final MapCodec<class00868> N = y(class00868::new);
   public static final int y = 6;
   public static final class08071 L = class06665.NQ;
   public static final int u = y(0);
   private static final class00494[] i = class00891.N(6, var0 -> class00891.N(1 + var0 * 2, 0.0, 1.0, 15.0, 8.0, 15.0));

   public class00868(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, 0));
   }

   public static int y(int var0) {
      return (7 - var0) * 2;
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return y(var1.L(L));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return i[var1.L(L)];
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      class06581 class06581 = var1.B();
      if (var1.N(class01226.C) && var2.L(L) == 0 && class00891.N(class06581) instanceof class05440 class05440) {
         var1.N(1, var5);
         var3.method_8396(null, var4, class04909.uo, class04911.field_15245, 1.0F, 1.0F);
         var3.method_8501(var4, class05467.N(class05440));
         var3.N(var5, class01194.L, var4);
         var5.method_7259(class01235.L.y(class06581));
         return class07082.N;
      } else {
         return class07082.R;
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2.method_8608()) {
         if (N(var2, var3, var1, var4).N()) {
            return class07082.N;
         }

         if (var4.method_5998(class07050.field_5808).R()) {
            return class07082.L;
         }
      }

      return N(var2, var3, var1, var4);
   }

   @Override
   public MapCodec<class00868> N() {
      return N;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return var5 == class07211.field_11033 && !var1.N(var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   protected static class07082 N(class07284 var0, class07209 var1, class00500 var2, class08036 var3) {
      if (!var3.method_7332(false)) {
         return class07082.i;
      } else {
         var3.method_7281(class01235.x);
         var3.method_7344().N(2, 0.1F);
         int ix = var2.L(L);
         var0.N(var3, class01194.W, var1);
         if (ix < 6) {
            var0.method_8652(var1, var2.y(L, ix + 1), 3);
         } else {
            var0.method_8650(var1, false);
            var0.N(var3, class01194.R, var1);
         }

         return class07082.N;
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return var2.method_8320(var3.method_10074()).B();
   }
}
