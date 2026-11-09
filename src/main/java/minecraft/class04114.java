package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

class class04114 extends class02053<Object> {
   final Map<class05946<Object>, class03529<Object>> N = new HashMap<>();

   <T> class03529<T> L(class05946<T> var1) {
      return (class03529<T>)this.N.computeIfAbsent(var1, var1x -> class03529.N_40(this.u, (class05946<Object>)var1x));
   }

   public class04114(class02042<Object> var1) {
      super(var1);
   }

   @Override
   public Optional<class03529<Object>> N(class05946<Object> var1) {
      return Optional.of(this.L(var1));
   }
}
