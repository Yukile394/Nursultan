package minecraft;

import com.mojang.serialization.MapCodec;

public abstract class class04983 extends class04985 implements class00873 {
   public static final class08071 i = class06665.NY;
   public static final int R = 25;
   private final double N;

   @Override
   protected class04983 L() {
      return this;
   }

   public class00500 T(class00500 var1) {
      return var1.y(i, 25);
   }

   public class04983(class01362 var1, class07211 var2, class00494 var3, boolean var4, double var5) {
      super(var1, var2, var3, var4);
      this.N = var5;
      this.P(this.Q.y().y(i, 0));
   }

   public boolean b(class00500 var1) {
      return var1.L(i) == 25;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(i) < 25 && var4.U() < this.N) {
         class07209 class07209 = var3.method_10093(this.y);
         if (this.E(var2.method_8320(class07209))) {
            var2.method_8501(class07209, this.N(var1, var2.field_9229));
         }
      }
   }

   @Override
   public class00500 y(class06069 var1) {
      return this.W().y(i, var1.y(25));
   }

   protected abstract boolean E(class00500 var1);

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class07209 class07209 = var3.method_10093(this.y);
      int ix = Math.min(var4.L(i) + 1, 25);
      int j = this.N(var2);

      for (int k = 0; k < j && this.E(var1.method_8320(class07209)); k++) {
         var1.method_8501(class07209, var4.y(i, ix));
         class07209 = class07209.method_10093(this.y);
         ix = Math.min(ix + 1, 25);
      }
   }

   protected abstract int N(class06069 var1);

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      if (var5 == this.y.b()) {
         if (!var1.N(var2, var4)) {
            var3.N(var4, this, 1);
         } else {
            class00500 class00500 = var2.method_8320(var4.method_10093(this.y));
            if (class00500.N(this) || class00500.N(this.u())) {
               return this.N(var1, this.u().W());
            }
         }
      }

      if (var5 != this.y || !var7.N(this) && !var7.N(this.u())) {
         if (this.L) {
            var3.N(var4, class04684.L, class04684.L.N(var2));
         }

         return super.N(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         return this.N(var1, this.u().W());
      }
   }

   @Override
   protected abstract MapCodec<? extends class04983> N();

   public class00500 N(class00500 var1, class06069 var2) {
      return var1.N(i);
   }

   protected class00500 N(class00500 var1, class00500 var2) {
      return var2;
   }

   @Override
   public void N(class00517<class00891, class00500> var1) {
      var1.N(i);
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return this.E(var1.method_8320(var2.method_10093(this.y)));
   }

   @Override
   protected boolean e_(class00500 var1) {
      return var1.L(i) < 25;
   }
}
