package minecraft;

import java.util.List;
import java.util.function.Function;

public class class05392<V, T1 extends Comparable<T1>> extends class05415<V> {
   private final class08092<T1> N;

   class05392(class08092<T1> var1) {
      super();
      this.N = var1;
   }

   @Override
   public List<class08092<?>> y() {
      return List.of(this.N);
   }

   public class05415<V> N(Function<T1, V> var1) {
      this.N.N().forEach(var2 -> this.N((T1)var2, (V)var1.apply(var2)));
      return this;
   }

   public class05392<V, T1> N(T1 var1, V var2) {
      class05390 class05390 = class05390.N(this.N.L((T1)var1));
      this.N(class05390, (V)var2);
      return this;
   }
}
