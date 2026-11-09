package minecraft;

import com.mojang.serialization.MapCodec;

public class class04094 extends class06858 implements class04065 {
   public static final MapCodec<class04094> y = y(class04094::new);

   public class04094(class01362 var1) {
      super(class02151.N(1), var1);
   }

   @Override
   public boolean u() {
      return false;
   }

   private static boolean N(class07284 var0, class07209 var1) {
      class00500 class00500x = var0.method_8320(var1.method_10084());
      if (class00500x.P() || class00500x.N(class00869.K) && class00500x.Y().y(class04684.L)) {
         int i = 0;

         for (class07209 class07209 : class07209.method_10097(var1.method_10069(-4, 0, -4), var1.method_10069(4, 2, 4))) {
            class00500 class00500x = var0.method_8320(class07209);
            if (class00500x.N(class00869.bp) || class00500x.N(class00869.bS)) {
               i++;
            }

            if (i > 2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public MapCodec<class04094> N() {
      return y;
   }

   private class00500 N(class07284 var1, class07209 var2, class06069 var3, boolean var4) {
      class00500 class00500;
      if (var3.y(11) == 0) {
         class00500 = class00869.bS.W().y(class04007.u, var4);
      } else {
         class00500 = class00869.bp.W();
      }

      return class00500.y(class06665.q) && !var1.method_8316(var2).W() ? class00500.y(class06665.q, true) : class00500;
   }

   private static int N(class04076 var0, class07209 var1, class07209 var2, int var3) {
      int i = var0.i();
      float f = class04995.z((float)Math.sqrt(var1.method_10262(var2)) - i);
      int j = class04995.Z(24 - i);
      float f1 = Math.min(1.0F, f / j);
      return Math.max(1, (int)(var3 * f1 * 0.5F));
   }

   @Override
   public int N(class04083 var1, class07284 var2, class07209 var3, class06069 var4, class04076 var5, boolean var6) {
      int i = var1.y();
      if (i != 0 && var4.y(var5.R()) == 0) {
         class07209 class07209x = var1.N();
         boolean flag = class07209x.method_19771(var3, var5.i());
         if (!flag && N(var2, class07209x)) {
            int j = var5.u();
            if (var4.y(j) < i) {
               class07209 class07209x = class07209x.method_10084();
               class00500 class00500 = this.N(var2, class07209x, var4, var5.B());
               var2.method_8652(class07209x, class00500, 3);
               var2.method_8396(null, class07209x, class00500.O().i(), class04911.field_15245, 1.0F, 1.0F);
            }

            return Math.max(0, i - j);
         } else {
            return var4.y(var5.M()) != 0 ? i : i - (flag ? 1 : N(var5, class07209x, var3, i));
         }
      } else {
         return i;
      }
   }
}
