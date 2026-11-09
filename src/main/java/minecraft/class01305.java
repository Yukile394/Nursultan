package minecraft;

class class01305 extends class07452 {
   private int L;

   @Override
   public void L() {
      this.y.Y();
      super.L();
   }

   public class01305(class06165 var1, double var2) {
      super(var1, var2);
      this.y = var1;
      this.L = y(100);
   }

   @Override
   public boolean N() {
      if (!this.y.method_6113() && this.N.T() == null) {
         if (this.y.method_73183().method_8546() && this.y.method_73183().N_17(this.N.method_24515())) {
            return this.M();
         } else if (this.L > 0) {
            this.L--;
            return false;
         } else {
            this.L = 100;
            class07209 class07209 = this.N.method_24515();
            return this.y.method_73183().method_8530()
               && this.y.method_73183().N_17(class07209)
               && !((class04782)this.y.method_73183()).method_19500(class07209)
               && this.M();
         }
      } else {
         return false;
      }
   }
}
