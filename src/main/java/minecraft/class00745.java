package minecraft;

import java.util.Optional;

class class00745<T> implements class02055<T> {
   class00745(class00731 var1) {
      super();
      this.N = var1;
   }

   @Override
   public class03552<T> y(class03530<T> var1) {
      return this.N.L(var1);
   }

   @Override
   public class03529<T> y(class05946<T> var1) {
      return this.N.u(var1);
   }

   @Override
   public Optional<class03552<T>> N(class03530<T> var1) {
      return Optional.of(this.y(var1));
   }

   @Override
   public Optional<class03529<T>> N(class05946<T> var1) {
      return Optional.of(this.y(var1));
   }
}
