package minecraft;

record class03868(class03877 input) implements class03895 {
   static final class03979<class03868> N = class03865.N(class03868::new, class03868::u);

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   class03868(class03877 input) {
      this.input = input;
   }

   @Override
   public class03877 u() {
      return this.input;
   }

   @Override
   public double y() {
      return Double.POSITIVE_INFINITY;
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03868(this.input.N(var1)));
   }

   @Override
   public double N() {
      return Double.NEGATIVE_INFINITY;
   }

   @Override
   public double N(class03875 var1, double var2) {
      return var1.i().N(var1, var2);
   }
}
