package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class class08143 {
   final Map<class07311, List<class05536>> N = new HashMap<>();
   private final Set<class07311> y = new ObjectOpenHashSet();

   public class08143() {
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

   public void N(class01421 var1, class07311 var2, class00999 var3) {
      this.N.computeIfAbsent(var2, var0 -> new ArrayList<>()).add(new class05536(var1.L().u(), var3));
   }
}
