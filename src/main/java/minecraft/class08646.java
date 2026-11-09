package minecraft;

import org.joml.Matrix3x2fc;

class class08646 implements class01609 {
   class08646(class08659 var1, Matrix3x2fc var2, class03255 var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   private void y(class00941 var1) {
      this.L.R.y(new class08654(this.N, var1, this.y));
   }

   @Override
   public void N(class00941 var1) {
      this.y(var1);
   }
}
