package minecraft;

import com.mojang.serialization.MapCodec;

public class class06888 extends class00891 {
   public static final MapCodec<class06888> N = y(class06888::new);
   public static final class06667 y = class06896.i;

   private static void L(class00500 var0, class07299 var1, class07209 var2) {
      N(var1, var2);
      if (!var0.L(y)) {
         var1.method_8652(var2, var0.y(y, true), 3);
      }
   }

   public class06888(class01362 var1) {
      super(var1);
      this.P(this.W().y(y, false));
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(y)) {
         var2.method_8652(var3, var1.y(y, false), 3);
      }
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var1.L(y)) {
         N(var2, var3);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06584 var4, boolean var5) {
      super.N(var1, var2, var3, var4, var5);
      if (var5) {
         this.N(var2, var3, var4, class02135.y(1, 5));
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   private static void N(class07299 var0, class07209 var1) {
      double d0 = 0.5625;
      class06069 class06069 = var0.field_9229;

      for (class07211 class07211 : class07211.values()) {
         class07209 class07209 = var1.method_10093(class07211);
         if (!var0.method_8320(class07209).t()) {
            class07185 class07185 = class07211.z();
            double d1 = class07185 == class07185.field_11048 ? 0.5 + 0.5625 * class07211.P() : class06069.z();
            double d2 = class07185 == class07185.field_11052 ? 0.5 + 0.5625 * class07211.s() : class06069.z();
            double d3 = class07185 == class07185.field_11051 ? 0.5 + 0.5625 * class07211.T() : class06069.z();
            var0.method_8406(class07138.y, var1.method_10263() + d1, var1.method_10264() + d2, var1.method_10260() + d3, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, class07049 var4) {
      if (!var4.method_21749()) {
         L(var3, var1, var2);
      }

      super.N(var1, var2, var3, var4);
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (var3.method_8608()) {
         N(var3, var4);
      } else {
         L(var2, var3, var4);
      }

      return (class07082)(var1.B() instanceof class06918 && new class06942(var5, var6, var1, var7).N() ? class07082.i : class07082.N);
   }

   @Override
   public MapCodec<class06888> N() {
      return N;
   }

   @Override
   protected void a_(class00500 var1, class07299 var2, class07209 var3, class08036 var4) {
      L(var1, var2, var3);
      super.a_(var1, var2, var3, var4);
   }

   @Override
   protected boolean e_(class00500 var1) {
      return var1.L(y);
   }
}
