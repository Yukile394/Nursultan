package minecraft;

public class class07972 extends class07999 {
   private final class08004 y;
   private int L;

   @Override
   public void L() {
      super.L();
      this.L = 0;
   }

   public class07972(class08004 var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.y = var1;
   }

   @Override
   public void i() {
      super.i();
      this.L++;
      if (this.L >= 5 && this.U() < this.E() / 2) {
         this.y.R(true);
      } else {
         this.y.R(false);
      }
   }

   @Override
   public void u() {
      super.u();
      this.y.R(false);
   }
}
