package minecraft;

class class07521 extends class07473 {
   private final class07523 y;
   public int N;

   @Override
   public void L() {
      this.N = 0;
   }

   public class07521(class07523 var1) {
      super();
      this.y = var1;
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void i() {
      class07438 class07438 = this.y.T();
      if (class07438 != null) {
         double d0 = 64.0;
         if (class07438.method_5858(this.y) < 4096.0 && this.y.method_6057(class07438)) {
            class07299 class07299 = this.y.method_73183();
            this.N++;
            if (this.N == 10 && !this.y.method_5701()) {
               class07299.method_8444(null, 1015, this.y.method_24515(), 0);
            }

            if (this.N == 20) {
               double d1 = 4.0;
               class06889 class06889x = this.y.method_5828(1.0F);
               double d2 = class07438.method_23317() - (this.y.method_23317() + class06889x.M * 4.0);
               double d3 = class07438.method_23323(0.5) - (0.5 + this.y.method_23323(0.5));
               double d4 = class07438.method_23321() - (this.y.method_23321() + class06889x.Z * 4.0);
               class06889 class06889x = new class06889(d2, d3, d4);
               if (!this.y.method_5701()) {
                  class07299.method_8444(null, 1016, this.y.method_24515(), 0);
               }

               class08024 class08024 = new class08024(class07299, this.y, class06889x.u(), this.y.B());
               class08024.method_5814(
                  this.y.method_23317() + class06889x.M * 4.0, this.y.method_23323(0.5) + 0.5, class08024.method_23321() + class06889x.Z * 4.0
               );
               class07299.method_8649(class08024);
               this.N = -40;
            }
         } else if (this.N > 0) {
            this.N--;
         }

         this.y.N(this.N > 10);
      }
   }

   @Override
   public void u() {
      this.y.N(false);
   }

   @Override
   public boolean N() {
      return this.y.T() != null;
   }
}
