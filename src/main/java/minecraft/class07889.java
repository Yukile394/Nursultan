package minecraft;

class class07889 extends class07473 {
   private final class07883 N;

   public class07889(class07883 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void i() {
      if (this.N.method_6131() > 100) {
         this.N.Z = class06889.L;
      } else if (this.N.method_59922().y(y(50)) == 0 || !class07883.N(this.N) || !this.N.m()) {
         float f = this.N.method_59922().z() * (float) (Math.PI * 2);
         this.N.Z = new class06889(class04995.P(f) * 0.2F, -0.1F + this.N.method_59922().z() * 0.2F, class04995.m(f) * 0.2F);
      }
   }

   @Override
   public boolean N() {
      return true;
   }
}
