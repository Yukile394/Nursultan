package minecraft;

public record class03124(int tickSteps) implements class00381<class07280> {
   public static final class02362<class00667, class03124> N = class00381.N(class03124::N, class03124::new);

   private class03124(class00667 var1) {
      this(var1.E());
   }

   public class03124(int tickSteps) {
      this.tickSteps = tickSteps;
   }

   private void N(class00667 var1) {
      var1.L(this.tickSteps);
   }

   public int N() {
      return this.tickSteps;
   }

   public static class03124 N(class03106 var0) {
      return new class03124(var0.U());
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class03124> method_65080() {
      return class04248.Ld;
   }
}
