package minecraft;

class class07554 extends class07473 {
   private final class07541 N;
   private final double y;
   private final int L;
   private boolean u;

   @Override
   public void L() {
      this.N.N(true);
      this.u = false;
   }

   public class07554(class07541 var1, double var2, int var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var4;
   }

   @Override
   public void i() {
      if (this.N.method_23318() < this.L - 1 && (this.N.f().U() || this.N.n())) {
         class06889 class06889 = class05475.N(this.N, 4, 8, new class06889(this.N.method_23317(), this.L - 1, this.N.method_23321()), (float) (Math.PI / 2));
         if (class06889 == null) {
            this.u = true;
            return;
         }

         this.N.f().N(class06889.M, class06889.B, class06889.Z, this.y);
      }
   }

   @Override
   public void u() {
      this.N.N(false);
   }

   @Override
   public boolean y() {
      return this.N() && !this.u;
   }

   @Override
   public boolean N() {
      return !this.N.method_73183().method_8530() && this.N.method_5799() && this.N.method_23318() < this.L - 2;
   }
}
