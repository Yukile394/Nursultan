package minecraft;

import java.util.Map;
import java.util.NoSuchElementException;
import org.jspecify.annotations.Nullable;

public class class00311 {
   private final Map<class07491<?>, Object> N;

   @Nullable
   public <T> T L(class07491<T> var1) {
      return (T)this.N.get(var1);
   }

   class00311(Map<class07491<?>, Object> var1) {
      super();
      this.N = var1;
   }

   public <T> T y(class07491<T> var1) {
      Object object = this.N.get(var1);
      if (object == null) {
         throw new NoSuchElementException(var1.N().toString());
      } else {
         return (T)object;
      }
   }

   public boolean N(class07491<?> var1) {
      return this.N.containsKey(var1);
   }

   @Nullable
   public <T> T N(class07491<T> var1, @Nullable T var2) {
      return (T)this.N.getOrDefault(var1, var2);
   }
}
