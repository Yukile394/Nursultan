package minecraft;

import com.mojang.serialization.MapCodec;

public class class00288 extends class00891 implements class00873 {
   public static final MapCodec<class00288> N = y(class00288::new);
   private static final class00494 L = class00891.y(14.0, 0.0, 16.0);
   private static final class00494 u = class00891.y(14.0, 2.0, 16.0);
   public static final class06667 y = class06665.I;

   public class00288(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, true));
   }

   private boolean U(class00500 var1) {
      return var1.P();
   }

   private boolean y(class07290 var1, class07209 var2) {
      class07209 class07209 = var2.method_10093(class07211.field_11036);
      class00500 class00500 = var1.method_8320(class07209);
      return class05543.N(var1, class07211.field_11036, class07209, class00500) || class00500.N(class00869.nS);
   }

   @Override
   protected boolean y(class00500 var1) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return this.U(var1.method_8320(this.N(var1, var2).method_10074()));
   }

   public class07209 N(class07290 var1, class07209 var2) {
      class07218 class07218 = var2.method_25503();

      do {
         class07218.N(class07211.field_11033);
      } while (var1.method_8320(class07218).N(this));

      return class07218.method_10093(class07211.field_11036).method_10062();
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class07209 class07209 = this.N(var1, var3).method_10074();
      if (this.U(var1.method_8320(class07209))) {
         var1.method_8501(class07209, var4.y(y, true));
      }
   }

   @Override
   public MapCodec<class00288> N() {
      return N;
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      if (var4.y(500) == 0) {
         class00500 class00500 = var2.method_8320(var3.method_10084());
         if (class00500.N(class01210.v) || class00500.N(class00869.NF)) {
            var2.method_8486(var3.method_10263(), var3.method_10264(), var3.method_10260(), class04909.nx, class04911.field_15256, 1.0F, 1.0F, false);
         }
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return var1.L(y) ? u : L;
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (!this.y(var2, var4)) {
         var3.N(var4, this, 1);
      }

      return var1.y(y, !var2.method_8320(var4.method_10074()).N(this));
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!this.y(var2, var3)) {
         var2.N(var3, true);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return this.y(var2, var3);
   }
}
