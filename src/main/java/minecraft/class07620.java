package minecraft;

class class07620 extends class07434 {
   private final class07637 u;
   private int i;

   private boolean M() {
      class07209 class07209 = this.u.method_24515();
      class07218 class07218 = new class07218();

      for (int ix = 0; ix < 3; ix++) {
         for (int j = 0; j < 8; j++) {
            for (int k = 0; k <= j; k = k > 0 ? -k : 1 - k) {
               for (int l = k < j && k > -j ? j : 0; l <= j; l = l > 0 ? -l : 1 - l) {
                  class07218.N(class07209, k, ix, l);
                  if (this.y.method_8320(class07218).N(class00869.mx)) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public class07620(class07637 var1, double var2) {
      super(var1, var2);
      this.u = var1;
   }

   @Override
   public boolean N() {
      if (!super.N() || this.u.B() != 0) {
         return false;
      } else if (!this.M()) {
         if (this.i <= this.u.field_6012) {
            this.u.N(32);
            this.i = this.u.field_6012 + 600;
            if (this.u.method_6034()) {
               class08036 class08036 = this.y.N(class07637.N, this.u);
               this.u.R.N(class08036);
            }
         }

         return false;
      } else {
         return true;
      }
   }
}
