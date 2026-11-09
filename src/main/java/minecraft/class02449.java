package minecraft;

import com.google.common.base.Splitter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class02449 {
   private static final Splitter N = Splitter.on(',');
   private static final Splitter y = Splitter.on('=').limit(2);

   public class02449() {
      super();
   }

   public static <O, S extends class00522<O, S>> Predicate<class00522<O, S>> N(class00507<O, S> var0, String var1) {
      HashMap hashmap = new HashMap();

      for (String s : N.split(var1)) {
         Iterator<String> iterator = y.split(s).iterator();
         if (iterator.hasNext()) {
            String s1 = iterator.next();
            class08092<?> class08092 = var0.N(s1);
            if (class08092 != null && iterator.hasNext()) {
               String s2 = iterator.next();
               Comparable comparable = N((class08092<Comparable>)class08092, s2);
               if (comparable == null) {
                  throw new RuntimeException("Unknown value: '" + s2 + "' for blockstate property: '" + s1 + "' " + class08092.N());
               }

               hashmap.put(class08092, comparable);
            } else if (!s1.isEmpty()) {
               throw new RuntimeException("Unknown blockstate property: '" + s1 + "'");
            }
         }
      }

      return var1x -> {
         for (Entry entry : hashmap.entrySet()) {
            if (!Objects.equals(var1x.L((class08092)entry.getKey()), entry.getValue())) {
               return false;
            }
         }

         return true;
      };
   }

   @Nullable
   private static <T extends Comparable<T>> T N(class08092<T> var0, String var1) {
      return (T)var0.y(var1).orElse(null);
   }
}
