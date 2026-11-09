package minecraft;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public class class02344<S> {
   private final Map<class02353<?>, class02356<S, ?>> N = new IdentityHashMap<>();

   public <T> class02315<S> L(class02353<T> var1) {
      return new class02348<>(this.y(var1), var1);
   }

   public class02344() {
      super();
   }

   private <T> class02356<S, T> y(class02353<T> var1) {
      return (class02356<S, T>)this.N.computeIfAbsent(var1, class02356::new);
   }

   public <T> class08501<S, T> N(class02353<T> var1, class02315<S> var2, class02341<S, T> var3) {
      return this.N(var1, class02324.N(var2, var3));
   }

   public <T> class02315<S> N(class02353<T> var1, class02353<T> var2) {
      return new class02348<>(this.y(var1), var2);
   }

   public <T> class08501<S, T> N(class02353<T> var1, class02324<S, T> var2) {
      class02356 class02356 = this.N.computeIfAbsent(var1, class02356::new);
      if (class02356.N != null) {
         throw new IllegalArgumentException("Trying to override rule: " + var1);
      } else {
         class02356.N = var2;
         return class02356;
      }
   }

   public <T> class08501<S, T> N(class02353<T> var1, class02315<S> var2, class02318<S, T> var3) {
      return this.N(var1, class02324.N(var2, var3));
   }

   public void N() {
      List list = this.N.entrySet().stream().filter(var0 -> var0.getValue().N == null).map(Entry::getKey).toList();
      if (!list.isEmpty()) {
         throw new IllegalStateException("Unbound names: " + list);
      }
   }

   public <T> class08501<S, T> N(class02353<T> var1) {
      return (class08501<S, T>)Objects.requireNonNull(this.N.get(var1), () -> "No rule called " + var1);
   }
}
