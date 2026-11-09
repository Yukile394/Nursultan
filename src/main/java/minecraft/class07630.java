package minecraft;

class class07630 extends class07473 {
   private final class07637 N;

   @Override
   public void L() {
      this.N.Z(true);
   }

   public class07630(class07637 var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean y() {
      return false;
   }

   @Override
   public boolean N() {
      if (this.N.method_6109() && this.N.No()) {
         return this.N.NO() && class07637.L(this.N).y(y(500)) == 1 ? true : class07637.u(this.N).y(y(6000)) == 1;
      } else {
         return false;
      }
   }
}
