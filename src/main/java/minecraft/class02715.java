package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Set;
import java.util.function.Predicate;

public class class02715 {
   private final Object2IntOpenHashMap<class03556<class07304>> N = new Object2IntOpenHashMap();

   public class02715(class02710 var1) {
      super();
      this.N.putAll(var1.u);
   }

   public class02710 y() {
      return new class02710(this.N);
   }

   public void y(class03556<class07304> var1, int var2) {
      if (var2 > 0) {
         this.N.merge(var1, Math.min(var2, 255), Integer::max);
      }
   }

   public void N(Predicate<class03556<class07304>> var1) {
      this.N.keySet().removeIf(var1);
   }

   public Set<class03556<class07304>> N() {
      return this.N.keySet();
   }

   public int N(class03556<class07304> var1) {
      return this.N.getOrDefault(var1, 0);
   }

   public void N(class03556<class07304> var1, int var2) {
      if (var2 <= 0) {
         this.N.removeInt(var1);
      } else {
         this.N.put(var1, Math.min(var2, 255));
      }
   }
}
