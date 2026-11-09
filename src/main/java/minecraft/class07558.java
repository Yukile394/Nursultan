package minecraft;

class class07558 extends class07473 {
   private final class07525 N;

   public class07558(class07525 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void i() {
      class06069 class06069 = this.N.method_59922();
      class07299 class07299 = this.N.method_73183();
      int i = class04995.N(this.N.method_23317() - 2.0 + class06069.U() * 4.0);
      int j = class04995.N(this.N.method_23318() + class06069.U() * 3.0);
      int k = class04995.N(this.N.method_23321() - 2.0 + class06069.U() * 4.0);
      class07209 class07209 = new class07209(i, j, k);
      class00500 class00500 = class07299.method_8320(class07209);
      class06889 class06889x = new class06889(this.N.method_31477() + 0.5, j + 0.5, this.N.method_31479() + 0.5);
      class06889 class06889x = new class06889(i + 0.5, j + 0.5, k + 0.5);
      boolean flag = class07299.N(new class05862(class06889x, class06889x, class05849.field_17559, class05835.field_1348, this.N)).u().equals(class07209);
      if (class00500.N(class01210.NY) && flag) {
         class07299.method_8650(class07209, false);
         class07299.N(class01194.R, class07209, class01164.N(this.N, class00500));
         this.N.N(class00500.i().W());
      }
   }

   @Override
   public boolean N() {
      if (this.N.n() != null) {
         return false;
      } else {
         return !N(this.N).method_64395().N(class07305.I) ? false : this.N.method_59922().y(y(20)) == 0;
      }
   }
}
