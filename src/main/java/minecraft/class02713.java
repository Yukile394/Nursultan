package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.Optional;

public class class02713 {
   private final Reference2ObjectMap<class02477<?>, Optional<?>> N = new Reference2ObjectArrayMap();

   class02713() {
      super();
   }

   public class02678 N() {
      return this.N.isEmpty() ? class02678.N : new class02678(this.N);
   }

   public <T> class02713 N(class02480<T> var1) {
      return this.N(var1.N(), var1.y());
   }

   public <T> class02713 N(class02477<T> var1) {
      this.N.put(var1, Optional.empty());
      return this;
   }

   public <T> class02713 N(class02477<T> var1, T var2) {
      this.N.put(var1, Optional.of(var2));
      return this;
   }
}
