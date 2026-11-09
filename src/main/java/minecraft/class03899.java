package minecraft;

interface class03899 extends class03877 {
   double N(double var1);

   @Override
   default double N(class03875 var1) {
      return this.N(this.az_().N(var1));
   }

   @Override
   default void N(double[] var1, class03912 var2) {
      this.az_().N(var1, var2);

      for (int i = 0; i < var1.length; i++) {
         var1[i] = this.N(var1[i]);
      }
   }

   class03877 az_();
}
