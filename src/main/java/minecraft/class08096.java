package minecraft;

public record class08096(class05042 respawnData) implements class00381<class07280> {
   public static final class02362<class00667, class08096> N = class02362.N(class05042.u, class08096::N, class08096::new);

   public class08096(class05042 respawnData) {
      this.respawnData = respawnData;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class05042 N() {
      return this.respawnData;
   }

   @Override
   public class02897<class08096> method_65080() {
      return class04248.Nq;
   }
}
