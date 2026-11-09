package minecraft;

public record class02675(int playerId, class00392 message) implements class00381<class07280> {
   public static final class02362<class04247, class02675> N = class02362.N(class02389.B, class02675::N, class03748.u, class02675::y, class02675::new);

   public class02675(int playerId, class00392 message) {
      super();
      this.playerId = playerId;
      this.message = message;
   }

   @Override
   public boolean i() {
      return true;
   }

   public class00392 y() {
      return this.message;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.playerId;
   }

   @Override
   public class02897<class02675> method_65080() {
      return class04248.Nz;
   }
}
