package minecraft;

public record class03910(class03876 offsetNoise) implements class03880 {
   static final class03979<class03910> N = class03865.N(class03876.N, class03910::new, class03910::u);

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   public class03910(class03876 offsetNoise) {
      super();
      this.offsetNoise = offsetNoise;
   }

   @Override
   public class03876 u() {
      return this.offsetNoise;
   }

   @Override
   public double N(class03875 var1) {
      return this.N(var1.y(), var1.L(), var1.u());
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03910(var1.N(this.offsetNoise)));
   }
}
