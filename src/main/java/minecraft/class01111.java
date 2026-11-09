package minecraft;

import com.mojang.serialization.MapCodec;

public class class01111 extends class07215 implements class06084 {
   public static final MapCodec<class01111> L = y(class01111::new);
   public static final class06667 u = class06665.q;
   public static final class06667 i = class06665.k;
   private static final int N = 8;
   public static final int R = 128;
   private static final int M = 200;

   public void L(class00500 var1, class07299 var2, class07209 var3) {
      var2.method_8652(var3, var1.y(i, true), 3);
      this.u(var1, var2, var3);
      var2.N(var3, this, 8);
      var2.N(3002, var3, var1.L(y).z().ordinal());
   }

   public class01111(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class07211.field_11036).y(u, false).y(i, false));
   }

   @Override
   protected class04688 u(class00500 var1) {
      return var1.L(u) ? class04684.L.N(false) : super.u(var1);
   }

   private void u(class00500 var1, class07299 var2, class07209 var3) {
      class07211 class07211 = var1.L(y).b();
      var2.method_8452(var3.method_10093(class07211), this, class02752.N(var2, class07211, null));
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(i) && var1.L(y) == var4 ? 15 : 0;
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var1.N(var4.i())) {
         if (var1.L(i) && !var2.method_8397().N(var3, this)) {
            var2.N(var3, this, 8);
         }
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (var1.L(i)) {
         this.u(var1, var2, var3);
      }
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var2.method_8546()
         && var2.field_9229.y(200) <= var2.N() % 200L
         && var3.method_10264() == var2.method_8624(class07830.field_13202, var3.method_10263(), var3.method_10260()) - 1) {
         class02615.N(var1.L(y).z(), var2, var3, 0.125, class07107.ND, class02135.y(1, 2));
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, i, u);
   }

   @Override
   public MapCodec<? extends class01111> N() {
      return L;
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.L(i) ? 15 : 0;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var1.L(u)) {
         var3.N(var4, class04684.L, class04684.L.N(var2));
      }

      return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public class00500 N(class06942 var1) {
      boolean flag = var1.method_8045().method_8316(var1.method_8037()).N() == class04684.L;
      return this.W().y(y, var1.method_8038()).y(u, flag);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      var2.method_8652(var3, var1.y(i, false), 3);
      this.u(var1, var2, var3);
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
