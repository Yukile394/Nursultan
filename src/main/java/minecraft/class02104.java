package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class02104 {
   private final Map<class02117<?>, Object> N = new Reference2ObjectOpenHashMap();

   class02104() {
      super();
   }

   public <T> class02104 y(class02117<T> var1, @Nullable T var2) {
      if (var2 != null) {
         this.N.put(var1, var2);
      }

      return this;
   }

   public <T> class02104 N(class02117<T> var1, T var2) {
      this.N.put(var1, var2);
      return this;
   }

   public class02104 N(class02108 var1) {
      this.N.putAll(var1.N);
      return this;
   }

   public class02108 N() {
      return new class02108(this.N);
   }
}
