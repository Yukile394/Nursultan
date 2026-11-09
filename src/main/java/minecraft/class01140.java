package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class class01140 {
   public static final class01140 N = new class01140(Map.of());
   private final Map<class01134, class04806> y;

   public class01140(Map<class01134, class04806> var1) {
      super();
      this.y = var1;
   }

   public class01686 N(class01134 var1) {
      class04806 class04806 = this.y.get(var1);
      if (class04806 == null) {
         throw new IllegalArgumentException("No model for layer " + var1);
      } else {
         return class04806.N();
      }
   }

   public static class01140 N() {
      return new class01140(ImmutableMap.copyOf(class01125.N()));
   }
}
