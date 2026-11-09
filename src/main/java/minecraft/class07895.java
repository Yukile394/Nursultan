package minecraft;

class class07895 extends class07458 {
   private final class07872 N;

   class07895(class07872 var1) {
      super(var1);
      this.N = var1;
   }

   private void B() {
      if (this.N.method_5799()) {
         this.N.method_18799(this.N.method_18798().y(0.0, 0.005, 0.0));
         if (!this.N.L.method_19769(this.N.method_73189(), 16.0)) {
            this.N.method_6125(Math.max(this.N.method_6029() / 2.0F, 0.08F));
         }

         if (this.N.method_6109()) {
            this.N.method_6125(Math.max(this.N.method_6029() / 3.0F, 0.06F));
         }
      } else if (this.N.method_24828()) {
         this.N.method_6125(Math.max(this.N.method_6029() / 2.0F, 0.06F));
      }
   }

   @Override
   public void N() {
      this.B();
      if (this.E == class07435.field_6378 && !this.N.f().U()) {
         double d0 = this.R - this.N.method_23317();
         double d1 = this.M - this.N.method_23318();
         double d2 = this.B - this.N.method_23321();
         double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
         if (d3 < 1.0E-5F) {
            this.i.method_6125(0.0F);
         } else {
            d1 /= d3;
            float f = (float)(class04995.u(d2, d0) * 180.0F / (float)Math.PI) - 90.0F;
            this.N.method_36456(this.y(this.N.method_36454(), f, 90.0F));
            this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
            float f1 = (float)(this.Z * this.N.method_45325(class05298.l));
            this.N.method_6125(class04995.B(0.125F, this.N.method_6029(), f1));
            this.N.method_18799(this.N.method_18798().y(0.0, this.N.method_6029() * d1 * 0.1, 0.0));
         }
      } else {
         this.N.method_6125(0.0F);
      }
   }
}
