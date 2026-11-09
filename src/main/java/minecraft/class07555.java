package minecraft;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

class class07555<T, R> implements Function<T, R> {
   private final Map<T, R> y;

   class07555(Function var1) {
      super();
      this.N = var1;
      this.y = new ConcurrentHashMap<>();
   }

   @Override
   public String toString() {
      return "memoize/1[function=" + this.N + ", size=" + this.y.size() + "]";
   }

   @Override
   public R apply(T var1) {
      return this.y.computeIfAbsent((T)var1, this.N);
   }
}
