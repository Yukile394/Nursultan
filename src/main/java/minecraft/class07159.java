package minecraft;

class class07159 extends class07473 {
   private int y;

   @Override
   public void L() {
      this.y = this.N(20 * (1 + class07144.y(this.N).y(3)));
      this.N.N(30);
   }

   class07159(class07144 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void i() {
      this.y--;
   }

   @Override
   public void u() {
      if (this.N.T() == null) {
         this.N.N(0);
      }
   }

   @Override
   public boolean y() {
      return this.N.T() == null && this.y > 0;
   }

   @Override
   public boolean N() {
      return this.N.T() == null && class07144.N(this.N).y(y(40)) == 0 && this.N.N(this.N.method_24515(), this.N.E());
   }
}
