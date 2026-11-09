package minecraft;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public interface class04107 {
   class02692 L();

   static List<class04107> u() {
      return class04206.B.j().map(class04107::N).filter(Objects::nonNull).collect(Collectors.toList());
   }

   @Nullable
   static class04107 N(class07310 var0) {
      if (var0.B() instanceof class06918 class06918 && class06918.L() instanceof class04107 class04107) {
         return class04107;
      } else {
         return var0.B() instanceof class04107 class04107x ? class04107x : null;
      }
   }
}
