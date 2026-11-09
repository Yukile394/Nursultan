package minecraft;

public class class05684 implements class00169 {
   private final class04453 N;
   private boolean y;
   private boolean L = true;

   public class05684(class04453 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void N() {
      class00500 class00500 = this.N
         .method_73183()
         .L(this.N.method_5829().L(0.0, -0.4F, 0.0).B(1.0E-6))
         .filter(var0 -> var0.N(class00869.PN))
         .findFirst()
         .orElse(null);
      if (class00500 != null) {
         if (!this.y && !this.L && class00500.N(class00869.PN) && !this.N.method_7325()) {
            if (class00500.L(class00884.y)) {
               this.N.method_5783(class04909.um, 1.0F, 1.0F);
            } else {
               this.N.method_5783(class04909.uE, 1.0F, 1.0F);
            }
         }

         this.y = true;
      } else {
         this.y = false;
      }

      this.L = false;
   }
}
