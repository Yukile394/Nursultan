package minecraft;

import java.util.Optional;

class class05204 implements class05936 {
   final String N;
   final class00405 y;

   public class05204(String var1, class00405 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public <T> Optional<T> N_8(class05977<T> var1) {
      return var1.accept(this.N);
   }

   @Override
   public <T> Optional<T> N(class05935<T> var1, class00405 var2) {
      return var1.accept(this.y.N(var2), this.N);
   }
}
