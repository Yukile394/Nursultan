package minecraft;

class class07866 extends class07473 {
   private final class07872 N;
   private final double y;
   private boolean L;

   @Override
   public void L() {
      short short1 = 512;
      byte b0 = 4;
      class06069 class06069 = class07872.N(this.N);
      int i = class06069.y(1025) - 512;
      int j = class06069.y(9) - 4;
      int k = class06069.y(1025) - 512;
      if (j + this.N.method_23318() > this.N.method_73183().method_8615() - 1) {
         j = 0;
      }

      this.N.u = class07209.method_49637(i + this.N.method_23317(), j + this.N.method_23318(), k + this.N.method_23321());
      this.L = false;
   }

   class07866(class07872 var1, double var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void i() {
      if (this.N.u == null) {
         this.L = true;
      } else {
         if (this.N.f().U()) {
            class06889 class06889x = class06889.L(this.N.u);
            class06889 class06889x = class05475.N(this.N, 16, 3, class06889x, (float) (Math.PI / 10));
            if (class06889x == null) {
               class06889x = class05475.N(this.N, 8, 7, class06889x, (float) (Math.PI / 2));
            }

            if (class06889x != null) {
               int i = class04995.N(class06889x.M);
               int j = class04995.N(class06889x.Z);
               byte b0 = 34;
               if (!this.N.method_73183().N(i - 34, j - 34, i + 34, j + 34)) {
                  class06889x = null;
               }
            }

            if (class06889x == null) {
               this.L = true;
               return;
            }

            this.N.f().N(class06889x.M, class06889x.B, class06889x.Z, this.y);
         }
      }
   }

   @Override
   public void u() {
      this.N.u = null;
      super.u();
   }

   @Override
   public boolean y() {
      return !this.N.f().U() && !this.L && !this.N.i && !this.N.NX() && !this.N.B();
   }

   @Override
   public boolean N() {
      return !this.N.i && !this.N.B() && this.N.method_5799();
   }
}
