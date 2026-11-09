package minecraft;

import java.util.Optional;

public interface class02063 {
   default <T> class02055<T> L(class05946<? extends class00751<? extends T>> var1) {
      return (class02055<T>)this.<T>method_46759(var1).orElseThrow(() -> new IllegalStateException("Registry " + var1.N() + " not found"));
   }

   default <T> class03529<T> i(class05946<T> var1) {
      return this.method_46759(var1.L()).flatMap(var1x -> var1x.N(var1)).orElseThrow(() -> new IllegalStateException("Missing element " + var1));
   }

   default <T> Optional<class03529<T>> u(class05946<T> var1) {
      return this.method_46759(var1.L()).flatMap(var1x -> var1x.N(var1));
   }

   <T> Optional<? extends class02055<T>> method_46759(class05946<? extends class00751<? extends T>> var1);
}
