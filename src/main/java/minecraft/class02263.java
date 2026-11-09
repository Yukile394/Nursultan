package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class class02263 {
   private final Map<class02306, Boolean> L;
   public static final Codec<class02263> N = Codec.unboundedMap(class02306.field_49114, Codec.BOOL).xmap(class02263::new, var0 -> var0.L);
   public static final class02263 y = new class02263(Map.of());

   public class02263(Map<class02306, Boolean> var1) {
      super();
      this.L = var1;
   }

   public boolean N(Set<class02306> var1) {
      for (Entry entry : this.L.entrySet()) {
         if (var1.contains(entry.getKey()) != (Boolean)entry.getValue()) {
            return false;
         }
      }

      return true;
   }

   public class02263 N(class02263 var1) {
      HashMap hashmap = new HashMap<>(var1.L);
      hashmap.putAll(this.L);
      return new class02263(Map.copyOf(hashmap));
   }
}
