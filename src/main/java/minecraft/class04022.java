package minecraft;

public record class04022(int simulationDistance) implements class00381<class07280> {
   public static final class02362<class00667, class04022> N = class00381.N(class04022::N, class04022::new);

   private class04022(class00667 var1) {
      this(var1.E());
   }

   public class04022(int simulationDistance) {
      super();
      this.simulationDistance = simulationDistance;
   }

   public int N() {
      return this.simulationDistance;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      var1.L(this.simulationDistance);
   }

   @Override
   public class02897<class04022> method_65080() {
      return class04248.NS;
   }
}
