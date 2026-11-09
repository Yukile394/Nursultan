package minecraft;

public class class06177 extends class07969 {
   private static final int Z = 40;
   protected int M;

   @Override
   public void L() {
      this.M = 0;
      this.B.N(false);
      super.L();
   }

   protected void P() {
      if (N_18(this.B.method_73183()).method_64395().N(class07305.I)) {
         class00500 class00500 = this.B.method_73183().method_8320(this.i);
         if (class00500.N(class00869.sM)) {
            this.y(class00500);
         } else if (class05568.j_(class00500)) {
            this.N(class00500);
         }
      }
   }

   public class06177(class06165 var1, double var2, int var4, int var5) {
      super(var1, var2, var4, var5);
      this.B = var1;
   }

   @Override
   public double Z() {
      return 2.0;
   }

   @Override
   public void i() {
      if (this.W()) {
         if (this.M >= 40) {
            this.P();
         } else {
            this.M++;
         }
      } else if (!this.W() && class06165.u(this.B).z() < 0.05F) {
         this.B.method_5783(class04909.Ey, 1.0F, 1.0F);
      }

      super.i();
   }

   private void y(class00500 var1) {
      int i = var1.L(class05253.L);
      var1.y(class05253.L, 1);
      int j = 1 + this.B.method_73183().field_9229.y(2) + (i == 3 ? 1 : 0);
      if (this.B.method_6118(class07085.field_6173).R()) {
         this.B.method_5673(class07085.field_6173, new class06584(class06570.wN));
         j--;
      }

      if (j > 0) {
         class00891.N_21(this.B.method_73183(), this.i, new class06584(class06570.wN, j));
      }

      this.B.method_5783(class04909.QV, 1.0F, 1.0F);
      this.B.method_73183().method_8652(this.i, var1.y(class05253.L, 1), 2);
      this.B.method_73183().N(class01194.L, this.i, class01164.N(this.B));
   }

   @Override
   public boolean E() {
      return this.u % 100 == 0;
   }

   @Override
   protected boolean N(class05487 var1, class07209 var2) {
      class00500 class00500 = var1.method_8320(var2);
      return class00500.N(class00869.sM) && class00500.L(class05253.L) >= 2 || class05568.j_(class00500);
   }

   @Override
   public boolean N() {
      return !this.B.method_6113() && super.N();
   }

   private void N(class00500 var1) {
      class05568.N(this.B, var1, this.B.method_73183(), this.i);
   }
}
