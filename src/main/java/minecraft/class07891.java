package minecraft;

class class07891 extends class07969 {
   private final class07879 M;
   private boolean B;
   private boolean Z;

   public class07891(class07879 var1) {
      super(var1, 0.7F, 16);
      this.M = var1;
   }

   @Override
   public void i() {
      super.i();
      this.M.p().N(this.i.method_10263() + 0.5, this.i.method_10264() + 1, this.i.method_10260() + 0.5, 10.0F, this.M.Ni());
      if (this.W()) {
         class07299 class07299 = this.M.method_73183();
         class07209 class07209 = this.i.method_10084();
         class00500 class00500 = class07299.method_8320(class07209);
         class00891 class00891 = class00500.i();
         if (this.Z && class00891 instanceof class00899) {
            int i = class00500.L(class00899.R);
            if (i == 0) {
               class07299.method_8652(class07209, class00869.N.W(), 2);
               class07299.N(class07209, true, this.M);
            } else {
               class07299.method_8652(class07209, class00500.y(class00899.R, i - 1), 2);
               class07299.N(class01194.L, class07209, class01164.N(this.M));
               class07299.N(2001, class07209, class00891.W(class00500));
            }

            this.M.R = 40;
         }

         this.Z = false;
         this.L = 10;
      }
   }

   @Override
   public boolean y() {
      return this.Z && super.y();
   }

   @Override
   public boolean N() {
      if (this.L <= 0) {
         if (!N(this.M).method_64395().N(class07305.I)) {
            return false;
         }

         this.Z = false;
         this.B = this.M.n();
      }

      return super.N();
   }

   @Override
   protected boolean N(class05487 var1, class07209 var2) {
      class00500 class00500 = var1.method_8320(var2);
      if (class00500.N(class00869.Lr) && this.B && !this.Z) {
         class00500 = var1.method_8320(var2.method_10084());
         if (class00500.i() instanceof class00899 && ((class00899)class00500.i()).E(class00500)) {
            this.Z = true;
            return true;
         }
      }

      return false;
   }
}
