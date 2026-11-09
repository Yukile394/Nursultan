package minecraft;

class class07863 extends class07458 {
   private final class07879 N;
   private double W;

   public class07863(class07879 var1) {
      super(var1);
      this.N = var1;
   }

   @Override
   public void N() {
      if (this.N.method_24828() && !class07879.N(this.N) && !((class07873)class07879.y(this.N)).L()) {
         this.N.L(0.0);
      } else if (this.y() || this.E == class07435.field_6379) {
         this.N.L(this.W);
      }

      super.N();
   }

   @Override
   public void N(double var1, double var3, double var5, double var7) {
      if (this.N.method_5799()) {
         var7 = 1.5;
      }

      super.N(var1, var3, var5, var7);
      if (var7 > 0.0) {
         this.W = var7;
      }
   }
}
