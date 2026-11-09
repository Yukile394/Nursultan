package minecraft;

import java.util.Objects;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class03682<K, V> {
   private final Function<K, V> N;
   @Nullable
   private K y = (K)null;
   @Nullable
   private V L;

   public class03682(Function<K, V> var1) {
      super();
      this.N = var1;
   }

   public V N(K var1) {
      if (this.L == null || !Objects.equals(this.y, var1)) {
         this.L = this.N.apply((K)var1);
         this.y = (K)var1;
      }

      return this.L;
   }
}
