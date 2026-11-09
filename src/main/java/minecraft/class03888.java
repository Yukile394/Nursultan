package minecraft;

public record class03888(class03876 offsetNoise) implements class03880 {
   static final class03979<class03888> N = class03865.N(class03876.N, class03888::new, class03888::u);

   @Override
   public class03979<? extends class03877> L() {
      return N;
   }

   public class03888(class03876 offsetNoise) {
      super();
      this.offsetNoise = offsetNoise;
   }

   @Override
   public class03876 u() {
      return this.offsetNoise;
   }

   @Override
   public double N(class03875 var1) {
      return this.N(var1.u(), var1.y(), 0.0);
   }

   @Override
   public class03877 N(class03881 var1) {
      return var1.apply(new class03888(var1.N(this.offsetNoise)));
   }
}
