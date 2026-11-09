package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

class class06976<K, V> {
   private final Map<K, class06986<V>> N = new HashMap<>();

   class06976() {
      super();
   }

   @Nullable
   public V y(K var1) {
      class06986 class06986 = this.N.get(var1);
      return (V)(class06986 != null ? class06986.N() : null);
   }

   public void y(Predicate<K> var1) {
      this.N.keySet().removeIf(var1);
   }

   public void N(BiConsumer<K, V> var1) {
      this.N.forEach((var1x, var2) -> var1.accept(var1x, var2.N()));
   }

   public void N(long var1, K var3, class00442<V> var4) {
      if (var4.y().isPresent()) {
         this.N.put((K)var3, new class06986<>((V)var4.y().get(), var1 + var4.N().L()));
      } else {
         this.N.remove(var3);
      }
   }

   public void N(Predicate<class06986<V>> var1) {
      this.N.values().removeIf(var1);
   }

   public void N(K var1) {
      this.N.remove(var1);
   }
}
