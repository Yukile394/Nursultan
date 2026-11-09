package minecraft;

class class07171 extends class07473 {
   private int y;

   @Override
   public void L() {
      this.y = this.N(10);
      this.N.i = class07142.field_7318;
      this.M();
   }

   private void M() {
      if (this.N.u != null) {
         this.N.u = this.N.T().method_24515().method_10086(20 + class07155.E(this.N).y(20));
         if (this.N.u.method_10264() < this.N.method_73183().method_8615()) {
            this.N.u = new class07209(this.N.u.method_10263(), this.N.method_73183().method_8615() + 1, this.N.u.method_10260());
         }
      }
   }

   class07171(class07155 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void i() {
      if (this.N.i == class07142.field_7318) {
         this.y--;
         if (this.y <= 0) {
            this.N.i = class07142.field_7317;
            this.M();
            this.y = this.N((8 + class07155.z(this.N).y(4)) * 20);
            this.N.method_5783(class04909.GE, 10.0F, 0.95F + class07155.U(this.N).z() * 0.1F);
         }
      }
   }

   @Override
   public void u() {
      if (this.N.u != null) {
         this.N.u = this.N.method_73183().N(class07830.field_13197, this.N.u).method_10086(10 + class07155.Z(this.N).y(20));
      }
   }

   @Override
   public boolean N() {
      class07438 class07438 = this.N.T();
      return class07438 != null ? this.N.N(N_18(this.N.method_73183()), class07438, class01328.N) : false;
   }
}
