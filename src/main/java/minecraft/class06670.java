package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class06670 implements Predicate<class00500> {
   public static final Predicate<class00500> N = var0 -> true;
   private final class00507<class00891, class00500> y;
   private final Map<class08092<?>, Predicate<Object>> L = Maps.newHashMap();

   private class06670(class00507<class00891, class00500> var1) {
      super();
      this.y = var1;
   }

   public <V extends Comparable<V>> class06670 N(class08092<V> var1, Predicate<Object> var2) {
      if (!this.y.u().contains(var1)) {
         throw new IllegalArgumentException(this.y + " cannot support property " + var1);
      } else {
         this.L.put(var1, var2);
         return this;
      }
   }

   public boolean test(@Nullable class00500 var1) {
      if (var1 != null && var1.i().equals(this.y.L())) {
         if (this.L.isEmpty()) {
            return true;
         } else {
            for (Entry entry : this.L.entrySet()) {
               if (!this.N(var1, (class08092)entry.getKey(), (Predicate<Object>)entry.getValue())) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public static class06670 N(class00891 var0) {
      return new class06670(var0.E());
   }

   protected <T extends Comparable<T>> boolean N(class00500 var1, class08092<T> var2, Predicate<Object> var3) {
      Comparable comparable = var1.L(var2);
      return var3.test(comparable);
   }
}
