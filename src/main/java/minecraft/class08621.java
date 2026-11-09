package minecraft;

import java.util.Optional;

public record class08621(class00392 status, Optional<class00753> size) implements class00381<class07280> {
   public static final class02362<class04247, class08621> N = class02362.N(
      class03748.y, class08621::N, class02389.N(class00753.field_56131), class08621::y, class08621::new
   );

   public class08621(class00392 status, Optional<class00753> size) {
      this.status = status;
      this.size = size;
   }

   public Optional<class00753> y() {
      return this.size;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public class00392 N() {
      return this.status;
   }

   @Override
   public class02897<class08621> method_65080() {
      return class04248.yz;
   }
}
