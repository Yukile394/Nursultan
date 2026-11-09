package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.List;
import java.util.Objects;

@FunctionalInterface
public interface class03098 {
   class03098 N = var0 -> var0;

   class05946<class05281> lookup(class05946<class05281> var1);

   static class03098 N(List<class03129> var0, class07209 var1, long var2) {
      if (var0.isEmpty()) {
         return N;
      } else {
         class06069 class06069 = class06069.y(var2).L().N(var1);
         Builder builder = ImmutableMap.builder();
         var0.forEach(var2x -> var2x.N(class06069, builder::put));
         return var1x -> Objects.requireNonNull(var0x.getOrDefault(var1x, var1x), () -> "alias " + var1x.N() + " was mapped to null value");
      }
   }
}
