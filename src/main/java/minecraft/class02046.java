package minecraft;

public record class02046(class00392 message, class00649 chatType) implements class00381<class07280> {
   public static final class02362<class04247, class02046> N = class02362.N(class03748.u, class02046::N, class00649.N, class02046::y, class02046::new);

   public class02046(class00392 message, class00649 chatType) {
      this.message = message;
      this.chatType = chatType;
   }

   @Override
   public boolean i() {
      return true;
   }

   public class00649 y() {
      return this.chatType;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class00392 N() {
      return this.message;
   }

   @Override
   public class02897<class02046> method_65080() {
      return class04248.I;
   }
}
