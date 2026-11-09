package minecraft;

public record class00251(class01263 bookSettings) implements class00381<class07280> {
   public static final class02362<class00667, class00251> N = class02362.N(class01263.N, class00251::N, class00251::new);

   public class00251(class01263 bookSettings) {
      this.bookSettings = bookSettings;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class01263 N() {
      return this.bookSettings;
   }

   @Override
   public class02897<class00251> method_65080() {
      return class04248.Nb;
   }
}
