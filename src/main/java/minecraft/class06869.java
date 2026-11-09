package minecraft;

import com.mojang.serialization.MapCodec;

public class class06869 extends class06760 {
   public static final MapCodec<class06869> N = y(class06869::new);
   public static final class06667 L = class06665.k;

   public class06869(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11035).y(L, false));
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.N(var2, var3, var4);
   }

   protected void N(class07299 var1, class07209 var2, class00500 var3) {
      class07211 class07211 = var3.L(y);
      class07209 class07209 = var2.method_10093(class07211.b());
      class02733 class02733 = class02752.N(var1, class07211.b(), null);
      var1.method_8492(class07209, this, class02733);
      var1.method_8508(class07209, this, class07211, class02733);
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(L) && var1.L(y) == var4 ? 15 : 0;
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var1.N(var4.i())) {
         if (!var2.method_8608() && var1.L(L) && !var2.method_8397().N(var3, this)) {
            class00500 class00500 = var1.y(L, false);
            var2.method_8652(var3, class00500, 18);
            this.N(var2, var3, class00500);
         }
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (var1.L(L) && var2.method_14196().N(var3, this)) {
         this.N(var2, var3, var1.y(L, false));
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.L().b().b());
   }

   @Override
   public MapCodec<class06869> N() {
      return N;
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(L)) {
         var2.method_8652(var3, var1.y(L, false), 2);
      } else {
         var2.method_8652(var3, var1.y(L, true), 2);
         var2.N(var3, this, 2);
      }

      this.N(var2, var3, var1);
   }

   private void N(class05487 var1, class08713 var2, class07209 var3) {
      if (!var1.method_8608() && !var2.method_8397().N(var3, this)) {
         var2.N(var3, this, 2);
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(y) == var5 && !var1.L(L)) {
         this.N(var2, var3, var4);
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
