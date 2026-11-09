package minecraft;

public class class06930 extends class06937 {
   private final class03507 N;
   private final class08036 y;
   private int M;

   public class06930(class08036 var1, class03507 var2, class06695 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.y = var1;
      this.N = var2;
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   protected void y(int var1) {
      this.M += var1;
   }

   private class00743<class06584> N(class02903 var1, class07299 var2) {
      return var2 instanceof class04782 class04782
         ? class04782.method_64577().N(class05838.N, var1, class04782).map(var1x -> var1x.y().N(var1)).orElseGet(() -> N(var1))
         : class05857.y(var1);
   }

   @Override
   public void N(class08036 var1, class06584 var2) {
      this.c_(var2);
      class02919 class02919 = this.N.aD_();
      class02903 class02903 = class02919.N();
      int i = class02919.y();
      int j = class02919.L();
      class00743<class06584> class00743 = this.N(class02903, var1.method_73183());

      for (int k = 0; k < class02903.M(); k++) {
         for (int l = 0; l < class02903.R(); l++) {
            int i1 = l + i + (k + j) * this.N.y();
            class06584 class06584x = this.N.method_5438(i1);
            class06584 class06584x = class00743.get(l + k * class02903.R());
            if (!class06584x.R()) {
               this.N.method_5434(i1, 1);
               class06584x = this.N.method_5438(i1);
            }

            if (!class06584x.R()) {
               if (class06584x.R()) {
                  this.N.method_5447(i1, class06584x);
               } else if (class06584.L(class06584x, class06584x)) {
                  class06584x.M(class06584x.c());
                  this.N.method_5447(i1, class06584x);
               } else if (!this.y.method_31548().M(class06584x)) {
                  this.y.method_7328(class06584x, false);
               }
            }
         }
      }
   }

   @Override
   public boolean N(class06584 var1) {
      return false;
   }

   @Override
   public class06584 N(int var1) {
      if (this.R()) {
         this.M = this.M + Math.min(var1, this.i().c());
      }

      return super.N(var1);
   }

   @Override
   protected void N(class06584 var1, int var2) {
      this.M += var2;
      this.c_(var1);
   }

   private static class00743<class06584> N(class02903 var0) {
      class00743 class00743 = class00743.method_10213(var0.N(), class06584.E);

      for (int i = 0; i < class00743.size(); i++) {
         class00743.set(i, var0.N(i));
      }

      return class00743;
   }

   @Override
   protected void c_(class06584 var1) {
      if (this.M > 0) {
         var1.N(this.y, this.M);
      }

      class06695 class06695 = this.L;
      if (class06695 instanceof class06946) {
         ((class06946)class06695).N(this.y, this.N.aC_());
      }

      this.M = 0;
   }
}
