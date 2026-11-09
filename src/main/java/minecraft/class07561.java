package minecraft;

import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

class class07561<T, U, R> implements BiFunction<T, U, R> {
   private final Map<Pair<T, U>, R> y;

   class07561(BiFunction var1) {
      super();
      this.N = var1;
      this.y = new ConcurrentHashMap<>();
   }

   @Override
   public String toString() {
      return "memoize/2[function=" + this.N + ", size=" + this.y.size() + "]";
   }

   @Override
   public R apply(T var1, U var2) {
      return this.y.computeIfAbsent(Pair.of(var1, var2), var1x -> (R)var0.apply(var1x.getFirst(), var1x.getSecond()));
   }
}
