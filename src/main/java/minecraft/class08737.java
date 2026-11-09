package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Supplier;

public interface class08737 {
   class07709 y();

   static class08737 N(Supplier<String> var0) {
      return new class08769(var0);
   }

   static class08737 N(String var0) {
      return new class08754(var0);
   }

   static Map<String, String> N(Map<String, class08737> var0) {
      return Maps.transformValues(var0, class08737::N);
   }

   String N();
}
