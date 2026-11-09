package minecraft;

import org.joml.Matrix4f;

class class01605 implements class01609 {
   class01605(class01407 var1, class01583 var2, Matrix4f var3, int var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   private void y(class00941 var1) {
      class01391 class01391 = this.N.method_73477(var1.N(this.y));
      var1.N(this.L, class01391, this.u, false);
   }

   @Override
   public void N(class00941 var1) {
      this.y(var1);
   }
}
