package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.joml.Vector3f;

public class class08103 {
   final Map<class07311, List<class08107<?>>> N = new HashMap<>();
   final List<class08108<?>> y = new ArrayList<>();
   private final Set<class07311> L = new ObjectOpenHashSet();

   public class08103() {
      super();
   }

   public void y() {
      this.N.keySet().removeIf(var1 -> !this.L.contains(var1));
      this.L.clear();
   }

   public void N() {
      this.y.clear();

      for (Entry entry : this.N.entrySet()) {
         List<class08107<?>> list = (List<class08107<?>>)entry.getValue();
         if (!list.isEmpty()) {
            this.L.add((class07311)entry.getKey());
            list.clear();
         }
      }
   }

   public void N(class07311 var1, class08107<?> var2) {
      if (var1.method_73243().getBlendFunction().isEmpty()) {
         this.N.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(var2);
      } else {
         Vector3f vector3f = var2.N().N().transformPosition(new Vector3f());
         this.y.add(new class08108(var2, var1, vector3f));
      }
   }
}
