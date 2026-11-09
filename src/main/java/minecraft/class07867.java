package minecraft;

class class07867 extends class07473 {
   private final class07872 N;
   private final double y;
   private boolean L;
   private int u;
   private static final int i = 600;

   @Override
   public void L() {
      this.N.i = true;
      this.L = false;
      this.u = 0;
   }

   class07867(class07872 var1, double var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void i() {
      class07209 class07209 = this.N.L;
      boolean flag = class07209.method_19769(this.N.method_73189(), 16.0);
      if (flag) {
         this.u++;
      }

      if (this.N.f().U()) {
         class06889 class06889x = class06889.L(class07209);
         class06889 class06889x = class05475.N(this.N, 16, 3, class06889x, (float) (Math.PI / 10));
         if (class06889x == null) {
            class06889x = class05475.N(this.N, 8, 7, class06889x, (float) (Math.PI / 2));
         }

         if (class06889x != null && !flag && !this.N.method_73183().method_8320(class07209.method_49638(class06889x)).N(class00869.K)) {
            class06889x = class05475.N(this.N, 16, 5, class06889x, (float) (Math.PI / 2));
         }

         if (class06889x == null) {
            this.L = true;
            return;
         }

         this.N.f().N(class06889x.M, class06889x.B, class06889x.Z, this.y);
      }
   }

   @Override
   public void u() {
      this.N.i = false;
   }

   @Override
   public boolean y() {
      return !this.N.L.method_19769(this.N.method_73189(), 7.0) && !this.L && this.u <= this.N(600);
   }

   @Override
   public boolean N() {
      if (this.N.method_6109()) {
         return false;
      } else if (this.N.B()) {
         return true;
      } else {
         return this.N.method_59922().y(y(700)) != 0 ? false : !this.N.L.method_19769(this.N.method_73189(), 64.0);
      }
   }
}
