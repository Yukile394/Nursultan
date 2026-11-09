package minecraft;

public class class07514 extends class07477 implements class07252 {
   private static final boolean y = true;
   private boolean u = true;
   private boolean B = false;

   public void L(boolean var1) {
      this.u = var1;
   }

   @Override
   public double T() {
      return this.method_23317();
   }

   @Override
   public class06584 method_31480() {
      return new class06584(class06570.sW);
   }

   @Override
   public void method_5773() {
      this.B = false;
      super.method_5773();
      this.d();
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Enabled", this.u);
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.u = var1.N("Enabled", true);
   }

   public class07514(class07078<? extends class07514> var1, class07299 var2) {
      super(var1, var2);
   }

   @Override
   public int B() {
      return 1;
   }

   @Override
   public double b() {
      return this.method_23318() + 0.5;
   }

   public boolean s() {
      return this.u;
   }

   public boolean n() {
      if (class07234.N(this.method_73183(), this)) {
         return true;
      } else {
         for (class00717 class00717 : this.method_73183().N(class00717.class, this.method_5829().L(0.25, 0.0, 0.25), class07042.N)) {
            if (class07234.N(this, class00717)) {
               return true;
            }
         }

         return false;
      }
   }

   private void d() {
      if (!this.method_73183().method_8608() && this.method_5805() && this.s() && !this.B && this.n()) {
         this.B = true;
         this.method_5431();
      }
   }

   @Override
   public boolean v() {
      return false;
   }

   @Override
   public double j() {
      return this.method_23321();
   }

   @Override
   protected class06581 z() {
      return class06570.sW;
   }

   @Override
   public void N(class04782 var1, int var2, int var3, int var4, boolean var5) {
      boolean flag = !var5;
      if (flag != this.s()) {
         this.L(flag);
      }
   }

   @Override
   public class07482 N(int var1, class08044 var2) {
      return new class07478(var1, var2, this);
   }

   @Override
   protected double N(class07209 var1, class08080 var2, double var3) {
      double d0 = super.N(var1, var2, var3);
      this.d();
      return d0;
   }

   @Override
   public class00500 R() {
      return class00869.Bf.W();
   }

   @Override
   public int method_5439() {
      return 5;
   }
}
