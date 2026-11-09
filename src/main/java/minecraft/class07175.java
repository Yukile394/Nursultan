package minecraft;

class class07175 extends class07473 {
   private final class07147 N;
   private int y;

   public void M() {
      if (this.y == 0) {
         this.y = this.N(20);
      }
   }

   public class07175(class07147 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void i() {
      this.y--;
      if (this.y <= 0) {
         class07299 class07299 = this.N.method_73183();
         class06069 class06069 = this.N.method_59922();
         class07209 class07209x = this.N.method_24515();

         for (int i = 0; i <= 5 && i >= -5; i = (i <= 0 ? 1 : 0) - i) {
            for (int j = 0; j <= 10 && j >= -10; j = (j <= 0 ? 1 : 0) - j) {
               for (int k = 0; k <= 10 && k >= -10; k = (k <= 0 ? 1 : 0) - k) {
                  class07209 class07209x = class07209x.method_10069(j, i, k);
                  class00891 class00891 = class07299.method_8320(class07209x).i();
                  if (class00891 instanceof class07137) {
                     if (N_18(class07299).method_64395().N(class07305.I)) {
                        class07299.N(class07209x, true, this.N);
                     } else {
                        class07299.method_8652(class07209x, ((class07137)class00891).T(class07299.method_8320(class07209x)), 3);
                     }

                     if (class06069.Z()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean N() {
      return this.y > 0;
   }
}
