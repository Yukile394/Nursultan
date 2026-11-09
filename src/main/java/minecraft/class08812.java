package minecraft;

import Nursultan.class11651;
import Nursultan.class11652;
import Nursultan.class11654;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap.Entry;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class class08812 {
   private static final Logger N = LogUtils.getLogger();
   private final List<class08814> y = new ArrayList<>();

   public class08812() {
      super();
   }

   public class08812 y(class08814 var1) {
      this.y.addFirst(var1);
      return this;
   }

   public class08838 N(class08512 var1) {
      if (this.y.isEmpty()) {
         return class08838.N;
      } else {
         Object2ObjectArrayMap object2objectarraymap = new Object2ObjectArrayMap();
         Object2ObjectArrayMap object2objectarraymap1 = new Object2ObjectArrayMap();

         for (class08814 class08814 : Lists.reverse(this.y)) {
            class08814.N().forEach((var2x, var3x) -> {
               switch (var3x) {
                  case class11651 class11651:
                     object2objectarraymap1.remove(var2x);
                     object2objectarraymap.put(var2x, class11651.N());
                     break;
                  case class11654 class11654:
                     object2objectarraymap.remove(var2x);
                     object2objectarraymap1.put(var2x, class11654);
                     break;
                  default:
                     throw new MatchException(null, null);
               }
            });
         }

         if (object2objectarraymap1.isEmpty()) {
            return new class08838(object2objectarraymap);
         } else {
            boolean flag = true;

            while (flag) {
               flag = false;
               ObjectIterator objectiterator = Object2ObjectMaps.fastIterator(object2objectarraymap1);

               while (objectiterator.hasNext()) {
                  Entry entry = (Entry)objectiterator.next();
                  class05913 class05913 = (class05913)object2objectarraymap.get(((class11654)entry.getValue()).N());
                  if (class05913 != null) {
                     object2objectarraymap.put((String)entry.getKey(), class05913);
                     objectiterator.remove();
                     flag = true;
                  }
               }
            }

            if (!object2objectarraymap1.isEmpty()) {
               N.warn(
                  "Unresolved texture references in {}:\n{}",
                  var1.L(),
                  object2objectarraymap1.entrySet()
                     .stream()
                     .map(var0 -> "\t#" + (String)var0.getKey() + "-> #" + ((class11654)var0.getValue()).N() + "\n")
                     .collect(Collectors.joining())
               );
            }

            return new class08838(object2objectarraymap);
         }
      }
   }

   public class08812 N(class08814 var1) {
      this.y.addLast(var1);
      return this;
   }
}
