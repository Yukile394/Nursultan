package minecraft;

class class07646 extends class07962 {
   private final class07637 B;

   public class07646(class07637 var1, Class<? extends class07438> var2, float var3) {
      super(var1, var2, var3);
      this.B = var1;
   }

   @Override
   public void i() {
      if (this.L != null) {
         super.i();
      }
   }

   @Override
   public boolean y() {
      return this.L != null && super.y();
   }

   public void N(class07438 var1) {
      this.L = var1;
   }

   @Override
   public boolean N() {
      if (this.y.method_59922().z() >= this.i) {
         return false;
      } else {
         if (this.L == null) {
            class04782 class04782 = N(this.y);
            if (this.R == class08036.class) {
               this.L = class04782.N(this.M, this.y, this.y.method_23317(), this.y.method_23320(), this.y.method_23321());
            } else {
               this.L = class04782.N(
                  this.y.method_73183().N(this.R, this.y.method_5829().L(this.u, 3.0, this.u), var0 -> true),
                  this.M,
                  this.y,
                  this.y.method_23317(),
                  this.y.method_23320(),
                  this.y.method_23321()
               );
            }
         }

         return this.B.No() && this.L != null;
      }
   }
}
