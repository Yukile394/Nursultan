package minecraft;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public final class class01073 {
   private final class01089 N;
   private final Map<class01092<?>, Object> y = new IdentityHashMap<>();

   public class01073(class01089 var1) {
      super();
      this.N = var1;
   }

   public <T> T N(class01092<T> var1) {
      return Objects.requireNonNull((T)this.y.get(var1));
   }

   public <T> void N(class01092<T> var1, T var2) {
      this.y.put(var1, var2);
   }

   public class01089 N() {
      return this.N;
   }
}
