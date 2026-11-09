package minecraft;

import java.util.List;
import java.util.function.BiFunction;

public class class05413<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends class05415<V> {
   private final class08092<T1> N;
   private final class08092<T2> y;

   class05413(class08092<T1> var1, class08092<T2> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public List<class08092<?>> y() {
      return List.of(this.N, this.y);
   }

   public class05415<V> N(BiFunction<T1, T2, V> var1) {
      this.N.N().forEach(var2 -> this.y.N().forEach(var3 -> this.N((T1)var2, (T2)var3, (V)var1.apply(var2, var3))));
      return this;
   }

   public class05413<V, T1, T2> N(T1 var1, T2 var2, V var3) {
      class05390 class05390 = class05390.N(this.N.L((T1)var1), this.y.L((T2)var2));
      this.N(class05390, (V)var3);
      return this;
   }
}
