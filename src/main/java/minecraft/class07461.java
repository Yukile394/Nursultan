package minecraft;

public class class07461 extends class07468 {
   private final double L;
   private final double u;

   public class07461(String var1, double var2, double var4, double var6) {
      super(var1, var2);
      this.L = var4;
      this.u = var6;
      if (var4 > var6) {
         throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
      } else if (var2 < var4) {
         throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
      } else if (var2 > var6) {
         throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
      }
   }

   public double i() {
      return this.u;
   }

   public double u() {
      return this.L;
   }

   @Override
   public double N(double var1) {
      return Double.isNaN(var1) ? this.L : class04995.N(var1, this.L, this.u);
   }
}
