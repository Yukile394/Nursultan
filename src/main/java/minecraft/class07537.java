package minecraft;

class class07537 extends class07969 {
   private final class07541 M;

   @Override
   public void L() {
      this.M.N(false);
      super.L();
   }

   public class07537(class07541 var1, double var2) {
      super(var1, var2, 8, 2);
      this.M = var1;
   }

   @Override
   public void u() {
      super.u();
   }

   @Override
   public boolean y() {
      return super.y();
   }

   @Override
   public boolean N() {
      return super.N() && !this.M.method_73183().method_8530() && this.M.method_5799() && this.M.method_23318() >= this.M.method_73183().method_8615() - 3;
   }

   @Override
   protected boolean N(class05487 var1, class07209 var2) {
      class07209 class07209 = var2.method_10084();
      return var1.R(class07209) && var1.R(class07209.method_10084()) ? var1.method_8320(var2).y(var1, var2, this.M) : false;
   }
}
