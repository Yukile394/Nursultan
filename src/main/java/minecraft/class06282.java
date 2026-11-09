package minecraft;

public class class06282 extends class07449 {
   private final boolean N;
   private int y;

   @Override
   public void L() {
      this.y = 20;
      this.N(true);
   }

   public class06282(class07079 var1, boolean var2) {
      super(var1);
      this.u = var1;
      this.N = var2;
   }

   @Override
   public void i() {
      this.y--;
      super.i();
   }

   @Override
   public void u() {
      this.N(false);
   }

   @Override
   public boolean y() {
      return this.N && this.y > 0 && super.y();
   }
}
