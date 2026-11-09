package minecraft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public record class00146(Map<class02477<?>, Integer> addedComponents, Set<class02477<?>> removedComponents) {
   public static final class02362<class04247, class00146> N = class02362.N(
      class02389.N(HashMap::new, class02389.N(class04227.b), class02389.M, 256),
      class00146::N,
      class02389.N(HashSet::new, class02389.N(class04227.b), 256),
      class00146::y,
      class00146::new
   );

   public class00146(Map<class02477<?>, Integer> addedComponents, Set<class02477<?>> removedComponents) {
      this.addedComponents = addedComponents;
      this.removedComponents = removedComponents;
   }

   public Set<class02477<?>> y() {
      return this.removedComponents;
   }

   public boolean y(class02678 var1, class00147 var2) {
      class02508 class02508 = var1.i();
      if (!class02508.y().equals(this.removedComponents)) {
         return false;
      } else if (this.addedComponents.size() != class02508.N().u()) {
         return false;
      } else {
         for (class02480<?> class02480 : class02508.N()) {
            Integer integer = this.addedComponents.get(class02480.N());
            if (integer == null) {
               return false;
            }

            if (!var2.apply(class02480).equals(integer)) {
               return false;
            }
         }

         return true;
      }
   }

   public static class00146 N(class02678 var0, class00147 var1) {
      class02508 class02508 = var0.i();
      IdentityHashMap identityhashmap = new IdentityHashMap(class02508.N().u());
      class02508.N().forEach(var2x -> identityhashmap.put(var2x.N(), var1.apply((class02480<?>)var2x)));
      return new class00146(identityhashmap, class02508.y());
   }

   public Map<class02477<?>, Integer> N() {
      return this.addedComponents;
   }
}
