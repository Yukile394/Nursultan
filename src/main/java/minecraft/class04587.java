package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.Pair;

public class class04587 {
   private final Set<String> N = new ObjectOpenHashSet();

   public class04587() {
      super();
   }

   private static class04530 N(Supplier<class04657> var0, String var1, class02253 var2) {
      return class04530.N(var1, var2, () -> {
         class05025 class05025 = ((class04657)var0.get()).u(var1);
         return class05025 == null ? 0.0 : (double)class05025.y() / class01517.y;
      });
   }

   public Set<class04530> N(Supplier<class04657> var1) {
      Set set = ((class04657)var1.get())
         .i()
         .stream()
         .filter(var1x -> !this.N.contains(var1x.getLeft()))
         .map(var1x -> N(var1, (String)var1x.getLeft(), (class02253)var1x.getRight()))
         .collect(Collectors.toSet());

      for (class04530 class04530 : set) {
         this.N.add(class04530.u());
      }

      return set;
   }
}
