package minecraft;

class class01326 extends class07999 {
   @Override
   public void L() {
      this.y.E(false);
      super.L();
   }

   public class01326(class06165 var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.y = var1;
   }

   @Override
   protected void N(class07438 var1) {
      if (this.y(var1)) {
         this.M();
         this.N.method_6121(N(this.N), var1);
         this.y.method_5783(class04909.US, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean N() {
      return !this.y.v() && !this.y.method_6113() && !this.y.method_18276() && !this.y.n() && super.N();
   }
}
