package minecraft;

class class04196 implements class04214 {
   private final class04224 N;
   private final class04201 y;
   private final double L;
   private final double u;

   class04196(class04224 var1, class04201 var2, double var3, double var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var5;
   }

   @Override
   public void N() {
      this.N.y();
   }

   @Override
   public class01991 method_52853(class01640 var1) {
      try {
         class08280 class08280x = this.N.N();
         double d0 = class08280x.N() / this.L;
         double d1 = class08280x.y() / this.u;
         int i = class04995.N(this.y.y() * d0);
         int j = class04995.N(this.y.L() * d1);
         int k = class04995.N(this.y.u() * d0);
         int l = class04995.N(this.y.i() * d1);
         class08280 class08280x = new class08280(class08247.field_4997, k, l, false);
         class08280x.N(class08280x, i, j, 0, 0, k, l, false, false);
         return new class01991(this.y.N(), new class02002(k, l), class08280x);
      } catch (Exception exception) {
         class04234.y.error("Failed to unstitch region {}", this.y.N(), exception);
      } finally {
         this.N.y();
      }

      return class08923.y();
   }
}
