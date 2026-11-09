package minecraft;

public class class07987 extends class07969 {
   private final class07617 M;

   @Override
   public void L() {
      super.L();
      this.M.B(false);
   }

   public class07987(class07617 var1, double var2) {
      super(var1, var2, 8);
      this.M = var1;
   }

   @Override
   public void i() {
      super.i();
      this.M.B(this.W());
   }

   @Override
   public void u() {
      super.u();
      this.M.B(false);
   }

   @Override
   protected boolean N(class05487 var1, class07209 var2) {
      if (!var1.R(var2.method_10084())) {
         return false;
      } else {
         class00500 class00500 = var1.method_8320(var2);
         if (class00500.N(class00869.LA)) {
            return class00379.N(var1, var2) < 1;
         } else {
            return class00500.N(class00869.uN) && class00500.L(class05659.y)
               ? true
               : class00500.N(class01210.F, var0 -> var0.u(class07789.y).map(var0x -> var0x != class06637.field_12560).orElse(true));
         }
      }
   }

   @Override
   public boolean N() {
      return this.M.NQ() && !this.M.NJ() && super.N();
   }
}
