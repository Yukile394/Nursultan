package minecraft;

interface class03895 extends class03877 {
   class03877 u();

   double N(class03875 var1, double var2);

   @Override
   default void N(double[] var1, class03912 var2) {
      this.u().N(var1, var2);

      for (int i = 0; i < var1.length; i++) {
         var1[i] = this.N(var2.L(i), var1[i]);
      }
   }

   @Override
   default double N(class03875 var1) {
      return this.N(var1, this.u().N(var1));
   }
}
