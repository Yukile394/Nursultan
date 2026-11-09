package minecraft;

import com.mojang.serialization.MapCodec;

public class class06089 extends class00891 implements class06084 {
   public static final MapCodec<class06089> N = y(class06089::new);
   private static final int R = 1;
   private static final class00494 M = class00389.N(
      class00891.y(16.0, 14.0, 16.0), class00389.L(class00891.N(0.0, 0.0, 0.0, 2.0, 16.0, 2.0)).values().stream().reduce(class00389.N(), class00389::N)
   );
   private static final class00494 B = class00891.y(16.0, 0.0, 2.0);
   private static final class00494 Z = class00389.N(
      M, B, class00389.L(class00891.N(16.0, 0.0, 2.0, 0.0, 2.0)).values().stream().reduce(class00389.N(), class00389::N)
   );
   private static final class00494 O = class00389.y().method_1096(0.0, -1.0, 0.0).method_1097();
   public static final int y = 7;
   public static final class08071 L = class06665.yN;
   public static final class06667 u = class06665.q;
   public static final class06667 i = class06665.u;

   public class06089(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, 7).y(u, false).y(i, false));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(u) ? class04684.L.N(false) : super.u(var1);
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      if (var4.i()) {
         return class00389.N();
      } else if (var4.N(class00389.y(), var3, true) && !var4.L()) {
         return M;
      } else {
         return var1.L(L) != 0 && var1.L(i) && var4.N(O, var3, true) ? B : class00389.N();
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(u)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      if (!var2.method_8608()) {
         var3.N(var4, this, 1);
      }

      return var1;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      int ix = N(var2, var3);
      class00500 class00500 = var1.y(L, ix).y(i, this.N(var2, var3, ix));
      if (class00500.L(L) == 7) {
         if (var1.L(L) == 7) {
            class00701.N(var2, var3, class00500);
         } else {
            var2.N(var3, true);
         }
      } else if (var1 != class00500) {
         var2.method_8652(var3, class00500, 3);
      }
   }

   private boolean N(class07290 var1, class07209 var2, int var3) {
      return var3 > 0 && !var1.method_8320(var2.method_10074()).N(this);
   }

   public static int N(class07290 var0, class07209 var1) {
      class07218 class07218 = var1.method_25503().N(class07211.field_11033);
      class00500 class00500x = var0.method_8320(class07218);
      int ix = 7;
      if (class00500x.N(class00869.Pa)) {
         ix = class00500x.L(L);
      } else if (class00500x.L(var0, class07218, class07211.field_11036)) {
         return 0;
      }

      for (class07211 class07211 : class07221.field_11062) {
         class00500 class00500x = var0.method_8320(class07218.N(var1, class07211));
         if (class00500x.N(class00869.Pa)) {
            ix = Math.min(ix, class00500x.L(L) + 1);
            if (ix == 1) {
               break;
            }
         }
      }

      return ix;
   }

   @Override
   public MapCodec<class06089> N() {
      return N;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, u, i);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      if (!var4.N(var1.i().B())) {
         return var1.L(i) ? Z : M;
      } else {
         return class00389.y();
      }
   }

   @Override
   protected boolean N(class00500 var1, class06942 var2) {
      return var2.method_8041().N(this.B());
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var2.method_8608()) {
         var2.N(var3, this, 1);
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      class07209 class07209 = var1.method_8037();
      class07299 class07299 = var1.method_8045();
      int ix = N(class07299, class07209);
      return this.W().y(u, class07299.method_8316(class07209).N() == class04684.L).y(L, ix).y(i, this.N(class07299, class07209, ix));
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return N(var2, var3) < 7;
   }

   @Override
   protected class00494 b_(class00500 var1, class07290 var2, class07209 var3) {
      return class00389.y();
   }
}
