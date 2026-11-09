package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class class07928 {
   final Map<class07311, List<class08098>> N = new HashMap<>();
   private final Set<class07311> y = new ObjectOpenHashSet();

   public class07928() {
      super();
   }

   public void y() {
      this.N.keySet().removeIf(var1 -> !this.y.contains(var1));
      this.y.clear();
   }

   public void N() {
      for (Entry entry : this.N.entrySet()) {
         if (!((List)entry.getValue()).isEmpty()) {
            this.y.add((class07311)entry.getKey());
            ((List)entry.getValue()).clear();
         }
      }
   }

   public void N(class07311 var1, class08098 var2) {
      this.N.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(var2);
   }
}
