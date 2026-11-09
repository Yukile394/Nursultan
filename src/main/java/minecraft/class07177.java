package minecraft;

class class07177 extends class07168 {
   private float L;
   private float u;
   private float i;
   private float R;

   @Override
   public void L() {
      this.u = 5.0F + class07155.N(this.N).z() * 10.0F;
      this.i = -4.0F + class07155.y(this.N).z() * 9.0F;
      this.R = class07155.L(this.N).Z() ? 1.0F : -1.0F;
      this.Z();
   }

   class07177(class07155 var1) {
      super(var1);
      this.N = var1;
   }

   private void Z() {
      if (this.N.u == null) {
         this.N.u = this.N.method_24515();
      }

      this.L = this.L + this.R * 15.0F * (float) (Math.PI / 180.0);
      this.N.L = class06889.N(this.N.u).y(this.u * class04995.P(this.L), -4.0F + this.i, this.u * class04995.m(this.L));
   }

   @Override
   public void i() {
      if (class07155.u(this.N).y(this.N(350)) == 0) {
         this.i = -4.0F + class07155.i(this.N).z() * 9.0F;
      }

      if (class07155.R(this.N).y(this.N(250)) == 0) {
         this.u++;
         if (this.u > 15.0F) {
            this.u = 5.0F;
            this.R = -this.R;
         }
      }

      if (class07155.M(this.N).y(this.N(450)) == 0) {
         this.L = class07155.B(this.N).z() * 2.0F * (float) Math.PI;
         this.Z();
      }

      if (this.M()) {
         this.Z();
      }

      if (this.N.L.B < this.N.method_23318() && !this.N.method_73183().R(this.N.method_24515().method_10087(1))) {
         this.i = Math.max(1.0F, this.i);
         this.Z();
      }

      if (this.N.L.B > this.N.method_23318() && !this.N.method_73183().R(this.N.method_24515().method_10086(1))) {
         this.i = Math.min(-1.0F, this.i);
         this.Z();
      }
   }

   @Override
   public boolean N() {
      return this.N.T() == null || this.N.i == class07142.field_7318;
   }
}
