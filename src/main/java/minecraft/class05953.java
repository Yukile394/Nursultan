package minecraft;

import java.util.Map;

class class05953 {
   private final class04116<class04382> N;
   private final class02055<class05943> y;
   private final class02055<class00780> L;
   private final class02055<class04336> u;
   private final class02055<class04412> i;
   private final class02055<class03573> R;
   private final class03556<class07376> M;
   private final class01255 B;
   private final class01255 Z;

   class05953(class04116<class04382> var1) {
      super();
      this.N = var1;
      class02055 class02055 = var1.N(class04227.yu);
      this.y = var1.N(class04227.yE);
      this.L = var1.N(class04227.NA);
      this.u = var1.N(class04227.ys);
      this.i = var1.N(class04227.yb);
      this.R = var1.N(class04227.yU);
      this.M = class02055.y(class04057.N);
      class03529 class03529xxxx = class02055.y(class04057.y);
      class03529<class05943> class03529x = this.y.y(class05943.R);
      class03529<class03573> class03529x = this.R.y(class03565.N);
      this.B = new class01255(class03529xxxx, new class04865(class05997.N(class03529x), class03529x));
      class03529 class03529xx = class02055.y(class04057.L);
      class03529<class05943> class03529xxx = this.y.y(class05943.M);
      this.Z = new class01255(class03529xx, new class04865(class07663.N(this.L), class03529xxx));
   }

   private void N(class05946<class04382> var1, class01255 var2) {
      this.N.N(var1, this.N(var2));
   }

   private void N(class00765 var1) {
      class03529<class05943> class03529 = this.y.y(class05943.L);
      this.N(class05964.N, this.N(var1, class03529));
      class03529<class05943> class03529x = this.y.y(class05943.u);
      this.N(class05964.L, this.N(var1, class03529x));
      class03529<class05943> class03529xx = this.y.y(class05943.i);
      this.N(class05964.u, this.N(var1, class03529xx));
   }

   public void N() {
      class03529<class03573> class03529 = this.R.y(class03565.y);
      this.N(class05997.N(class03529));
      class03529<class05943> class03529x = this.y.y(class05943.L);
      class03529<class00780> class03529xx = this.L.y(class00795.y);
      this.N(class05964.i, this.N(new class00782(class03529xx), class03529x));
      this.N(class05964.y, this.N(new class07850(class01584.N(this.L, this.i, this.u))));
      this.N(class05964.R, this.N(new class07833(class03529xx)));
   }

   private class04382 N(class01255 var1) {
      return new class04382(Map.of(class01255.y, var1, class01255.L, this.B, class01255.u, this.Z));
   }

   private class01255 N(class00765 var1, class03556<class05943> var2) {
      return this.N(new class04865(var1, var2));
   }

   private class01255 N(class08088 var1) {
      return new class01255(this.M, var1);
   }
}
