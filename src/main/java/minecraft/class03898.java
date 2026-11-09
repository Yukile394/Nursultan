package minecraft;

public record class03898(class03876 offsetNoise) implements class03880 {
   static final class03979<class03898> N = class03865.N(class03876.N, class03898::new, class03898::u);

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   public class03898(class03876 offsetNoise) {
      super();
      this.offsetNoise = offsetNoise;
   }

   @Override
   public class03876 u() {
      return this.offsetNoise;
   }

   @Override
   public double N(class03875 var1) {
      return this.N(var1.y(), 0.0, var1.u());
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03898(var1.N(this.offsetNoise)));
   }
}
