package minecraft;

import com.mojang.serialization.MapCodec;

public class class05253 extends class00864 implements class00873 {
   public static final MapCodec<class05253> N = y(class05253::new);
   private static final float u = 0.003F;
   public static final int y = 3;
   public static final class08071 L = class06665.NG;
   private static final class00494 i = class00891.y(10.0, 0.0, 8.0);
   private static final class00494 R = class00891.y(14.0, 0.0, 16.0);

   public class05253(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, 0));
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      int ix = var1.L(L);
      if (ix < 3 && var4.y(5) == 0 && var2.method_22335(var3.method_10084(), 0) >= 9) {
         class00500 class00500 = var1.y(L, ix + 1);
         var2.method_8652(var3, class00500, 2);
         var2.N(class01194.L, var3, class01164.N(class00500));
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var3.L(L) < 3;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      int ix = Math.min(3, var4.L(L) + 1);
      var1.method_8652(var3, var4.y(L, ix), 2);
   }

   @Override
   public MapCodec<class05253> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return switch (var1.L(L)) {
         case 0 -> i;
         case 3 -> class00389.y();
         default -> R;
      };
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return new class06584(class06570.wN);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var4 instanceof class07438 && var4.method_5864() != class07078.Ni && var4.method_5864() != class07078.m) {
         var4.method_5844(var1, new class06889(0.8F, 0.75, 0.8F));
         if (var2 instanceof class04782 class04782 && var1.L(L) != 0) {
            class06889 class06889 = var4.method_65038() ? var4.method_60478() : var4.method_61411().u(var4.method_73189());
            if (class06889.z() > 0.0) {
               double d0 = Math.abs(class06889.N());
               double d1 = Math.abs(class06889.L());
               if (d0 >= 0.003F || d1 >= 0.003F) {
                  var4.method_64397(class04782, var2.method_48963().n(), 1.0F);
               }
            }
         }
      }
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      return (class07082)(var2.L(L) != 3 && var1.N(class06570.vQ) ? class07082.i : super.N(var1, var2, var3, var4, var5, var6, var7));
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var1.L(L) > 1) {
         if (var2 instanceof class04782 class04782) {
            class00891.N(class04782, class06273.NH, var1, var2.method_8321(var3), null, var4, (var1x, var2x) -> class00891.N_21(var1x, var3, var2x));
            class04782.method_8396(null, var3, class04909.QV, class04911.field_15245, 1.0F, 0.8F + class04782.field_9229.z() * 0.4F);
            class00500 class00500 = var1.y(L, 1);
            class04782.method_8652(var3, class00500, 2);
            class04782.N(class01194.L, var3, class01164.N(var4, class00500));
         }

         return class07082.N;
      } else {
         return super.N(var1, var2, var3, var4, var5);
      }
   }

   @Override
   protected boolean e_(class00500 var1) {
      return var1.L(L) < 3;
   }
}
