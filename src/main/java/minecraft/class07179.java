package minecraft;

class class07179 extends class07145 {
   private int i;

   @Override
   public void L() {
      super.L();
      class07438 class07438 = this.N.T();
      if (class07438 != null) {
         this.i = class07438.method_5628();
      }
   }

   @Override
   protected int M() {
      return 20;
   }

   class07179(class07149 var1) {
      super(var1);
      this.N = var1;
   }

   @Override
   protected int Z() {
      return 180;
   }

   @Override
   protected void U() {
      this.N.T().method_37222(new class07055(class07047.P, 400), this.N);
   }

   @Override
   protected class04891 E() {
      return class04909.sZ;
   }

   @Override
   public boolean N() {
      if (!super.N()) {
         return false;
      } else if (this.N.T() == null) {
         return false;
      } else {
         return this.N.T().method_5628() == this.i ? false : N(this.N).method_8404(this.N.method_24515()).N(class07086.field_5802.ordinal());
      }
   }

   @Override
   protected class07156 W() {
      return class07156.field_7378;
   }
}
