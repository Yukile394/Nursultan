package minecraft;

class class01302 extends class06135 {
   @Override
   public void L() {
      this.N.Y();
      super.L();
   }

   private boolean M() {
      return !this.N.method_6113() && !this.N.v() && !this.N.t() && this.N.T() == null;
   }

   public class01302(class06165 var1, int var2, int var3) {
      super(var1, var3);
      this.N = var1;
   }

   @Override
   public boolean y() {
      return super.y() && this.M();
   }

   @Override
   public boolean N() {
      return super.N() && this.M();
   }
}
