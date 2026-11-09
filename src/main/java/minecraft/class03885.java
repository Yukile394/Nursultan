package minecraft;

import Nursultan.class10213;

public record class03885(class03556<class03877> function) implements class03877 {
   @Override
   public class03979<? extends class03877> L() {
      throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
   }

   public class03885(class03556<class03877> function) {
      this.function = function;
   }

   public class03556<class03877> u() {
      return this.function;
   }

   @Override
   public double y() {
      return this.function.y() ? this.function.N().y() : Double.POSITIVE_INFINITY;
   }

   @Override
   public double N() {
      return this.function.y() ? this.function.N().N() : Double.NEGATIVE_INFINITY;
   }

   @Override
   public double N(class03875 var1) {
      return this.function.N().N(var1);
   }

   @Override
   public void N(double[] var1, class03912 var2) {
      this.function.N().N(var1, var2);
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03885(new class10213<>(this.function.N().N(var1))));
   }
}
