package minecraft;

public record class01658(int batchSize) implements class00381<class07280> {
   public static final class02362<class00667, class01658> N = class00381.N(class01658::N, class01658::new);

   private class01658(class00667 var1) {
      this(var1.E());
   }

   public class01658(int batchSize) {
      super();
      this.batchSize = batchSize;
   }

   public int N() {
      return this.batchSize;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   private void N(class00667 var1) {
      var1.L(this.batchSize);
   }

   @Override
   public class02897<class01658> method_65080() {
      return class04248.W;
   }
}
