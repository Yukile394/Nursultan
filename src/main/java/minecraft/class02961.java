package minecraft;

public class class02961 extends class07473 {
   private final class07862 N;
   private int y;

   @Override
   public void L() {
      this.N.Nf();
      this.M();
   }

   private void M() {
      class04891 class04891 = this.N.NA();
      if (class04891 != null) {
         this.N.method_43077(class04891);
      }
   }

   public class02961(class07862 var1) {
      super();
      this.N = var1;
      this.N(var1);
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public boolean y() {
      return false;
   }

   private void N(class07862 var1) {
      this.y = -var1.Nx();
   }

   @Override
   public boolean N() {
      this.y++;
      if (this.y > 0 && this.N.method_59922().y(1000) < this.y) {
         this.N(this.N);
         return !this.N.method_6062() && this.N.method_59922().y(10) == 0;
      } else {
         return false;
      }
   }
}
