package minecraft;

interface class03880 extends class03877 {
   class03876 u();

   @Override
   default double y() {
      return this.u().N() * 4.0;
   }

   @Override
   default double N() {
      return -this.y();
   }

   default double N(double var1, double var3, double var5) {
      return this.u().N(var1 * 0.25, var3 * 0.25, var5 * 0.25) * 4.0;
   }

   @Override
   default void N(double[] var1, class03912 var2) {
      var2.N(var1, this);
   }
}
