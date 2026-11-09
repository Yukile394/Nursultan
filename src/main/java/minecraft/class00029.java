package minecraft;

class class00029 extends class07442 {
   class00029(class00032 var1) {
      super(var1);
      this.N = var1;
   }

   @Override
   public void N() {
      if (this.N.v()) {
         float f = N(this.N.method_36454());
         this.N.method_36456(this.N.method_36454() - f);
         this.N.method_5847(this.N.method_36454());
      } else if (this.i > 0) {
         this.i--;
         double d0 = this.R - this.N.method_23317();
         double d1 = this.B - this.N.method_23321();
         this.N.method_36456(-((float)class04995.u(d0, d1)) * (180.0F / (float)Math.PI));
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0;
      } else {
         class07523.N(this.y);
      }
   }

   public static float N(float var0) {
      float f = var0 % 90.0F;
      if (f >= 45.0F) {
         f -= 90.0F;
      }

      if (f < -45.0F) {
         f += 90.0F;
      }

      return f;
   }
}
