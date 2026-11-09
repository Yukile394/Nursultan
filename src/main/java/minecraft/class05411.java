package minecraft;

import com.mojang.datafixers.util.Function4;
import java.util.List;

public class class05411<V, T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends class05415<V> {
   private final class08092<T1> N;
   private final class08092<T2> y;
   private final class08092<T3> L;
   private final class08092<T4> u;

   class05411(class08092<T1> var1, class08092<T2> var2, class08092<T3> var3, class08092<T4> var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public List<class08092<?>> y() {
      return List.of(this.N, this.y, this.L, this.u);
   }

   public class05415<V> N(Function4<T1, T2, T3, T4, V> var1) {
      this.N
         .N()
         .forEach(
            var2 -> this.y
               .N()
               .forEach(
                  var3 -> this.L
                     .N()
                     .forEach(var4 -> this.u.N().forEach(var5 -> this.N((T1)var2, (T2)var3, (T3)var4, (T4)var5, (V)var1.apply(var2, var3, var4, var5))))
               )
         );
      return this;
   }

   public class05411<V, T1, T2, T3, T4> N(T1 var1, T2 var2, T3 var3, T4 var4, V var5) {
      class05390 class05390 = class05390.N(this.N.L((T1)var1), this.y.L((T2)var2), this.L.L((T3)var3), this.u.L((T4)var4));
      this.N(class05390, (V)var5);
      return this;
   }
}
