package minecraft;

import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class class08279 {
   static final int N = -1;
   private static final int y = 0;

   public class08279() {
      super();
   }

   public static Object2IntMap<class00500> N(class01587 var0, class02572 var1) {
      HashMap hashmap = new HashMap();
      HashMap hashmap1 = new HashMap();
      var1.N().forEach((var3x, var4x) -> {
         List list = hashmap.computeIfAbsent(var3x.i(), var1xx -> List.copyOf(var0.N(var1xx)));
         class08281 class08281 = class08281.N(var3x, var4x, list);
         hashmap1.computeIfAbsent(class08281, var0xx -> Sets.newIdentityHashSet()).add(var3x);
      });
      int i = 1;
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();
      object2intopenhashmap.defaultReturnValue(-1);

      for (Set set : hashmap1.values()) {
         Iterator iterator = set.iterator();

         while (iterator.hasNext()) {
            class00500 class00500 = (class00500)iterator.next();
            if (class00500.b() != class06898.field_11458) {
               iterator.remove();
               object2intopenhashmap.put(class00500, 0);
            }
         }

         if (set.size() > 1) {
            int j = i++;
            set.forEach(var2x -> object2intopenhashmap.put(var2x, j));
         }
      }

      return object2intopenhashmap;
   }
}
