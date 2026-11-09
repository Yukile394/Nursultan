package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

class class01770 {
   private final Reference2ObjectOpenHashMap<class00518, class00490> N = new Reference2ObjectOpenHashMap(16, 0.5F);

   Map<class00518, class00490> L() {
      return Collections.unmodifiableMap(this.N);
   }

   class01770() {
      super();
   }

   public boolean y(class00518 var1) {
      return this.N.remove(var1) != null;
   }

   public Object2IntMap<class00518> y() {
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();
      this.N.forEach((var1x, var2) -> object2intopenhashmap.put(var1x, var2.y()));
      return object2intopenhashmap;
   }

   @Nullable
   public class00490 N(class00518 var1) {
      return (class00490)this.N.get(var1);
   }

   void N(class00518 var1, class00490 var2) {
      this.N.put(var1, var2);
   }

   public class00490 N(class00518 var1, Consumer<class00490> var2) {
      return (class00490)this.N.computeIfAbsent(var1, var1x -> {
         class00490 class00490 = new class00490();
         var2.accept(class00490);
         return class00490;
      });
   }

   public boolean N() {
      return !this.N.isEmpty();
   }
}
