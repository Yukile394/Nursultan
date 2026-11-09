package minecraft;

import java.util.function.Consumer;

class class00575 implements class01609 {
   class00575(float var1, float var2, Consumer var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   private void N(class00620 var1) {
      if (class00580.N(this.N, this.y, var1.P(), var1.s(), var1.T(), var1.b())) {
         this.L.accept(var1.z());
      }
   }
}
