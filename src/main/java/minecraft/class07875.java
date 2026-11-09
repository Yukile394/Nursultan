package minecraft;

class class07875 extends class07999 {
   public class07875(class07869 var1) {
      super(var1, 1.25, true);
      this.y = var1;
   }

   @Override
   public void u() {
      this.y.N(false);
      super.u();
   }

   @Override
   protected void N(class07438 var1) {
      if (this.y(var1)) {
         this.M();
         this.N.method_6121(N(this.N), var1);
         this.y.N(false);
      } else if (this.N.method_5858(var1) < (var1.method_17681() + 3.0F) * (var1.method_17681() + 3.0F)) {
         if (this.Z()) {
            this.y.N(false);
            this.M();
         }

         if (this.U() <= 10) {
            this.y.N(true);
            this.y.v();
         }
      } else {
         this.M();
         this.y.N(false);
      }
   }
}
