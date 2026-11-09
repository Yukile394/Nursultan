package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class06768 extends class07796 {
   public static final MapCodec<class06768> N = y(class06768::new);
   public static final class08071 y = class06665.ND;
   public static final class06667 L = class06665.j;
   private static final class00494 u = class00891.y(16.0, 0.0, 6.0);

   private static void L(class00500 var0, class07299 var1, class07209 var2) {
      int i = var1.method_8314(class00772.field_9284, var2) - var1.method_8594();
      float f = var1.method_75728().N(class00608.W, var2) * (float) (Math.PI / 180.0);
      if (var0.L(L)) {
         i = 15 - i;
      } else if (i > 0) {
         float f1 = f < (float) Math.PI ? 0.0F : (float) (Math.PI * 2);
         f += (f1 - f) * 0.2F;
         i = Math.round(i * class04995.P(f));
      }

      i = class04995.N(i, 0, 15);
      if (var0.L(y) != i) {
         var1.method_8652(var2, var0.y(y, i), 3);
      }
   }

   public class06768(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, 0).y(L, false));
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return !var1.method_8608() && var1.method_8597().i() ? N(var3, class00404.field_11900, class06768::N) : null;
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07241(var1, var2);
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class07241 var3) {
      if (var0.N() % 20L == 0L) {
         L(var2, var0, var1);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   public MapCodec<class06768> N() {
      return N;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return u;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var4.method_7294()) {
         return super.N(var1, var2, var3, var4, var5);
      } else {
         if (!var2.method_8608()) {
            class00500 class00500 = var1.N(L);
            var2.method_8652(var3, class00500, 2);
            var2.N(class01194.L, var3, class01164.N(var4, class00500));
            L(class00500, var2, var3);
         }

         return class07082.N;
      }
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(y);
   }

   @Override
   protected boolean a_(class00500 var1) {
      return true;
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
