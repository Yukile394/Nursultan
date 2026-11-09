package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class class08541 {
   private static final class00507<class00891, class00500> N = y();
   private static final class00507<class00891, class00500> y = y();
   private static final class01894 L = class01894.y("glow_item_frame");
   private static final class01894 u = class01894.y("item_frame");
   private static final Map<class01894, class00507<class00891, class00500>> i = Map.of(u, N, L, y);

   public class08541() {
      super();
   }

   private static class00507<class00891, class00500> y() {
      return new class00517<class00891, class00500>(class00869.N).N(class06665.yq).N(class00891::W, class00500::new);
   }

   static Function<class01894, class00507<class00891, class00500>> N() {
      HashMap hashmap = new HashMap<>(i);

      for (class00891 class00891 : class04206.i) {
         hashmap.put(class00891.s().B().N(), class00891.E());
      }

      return hashmap::get;
   }

   public static class00500 N(boolean var0, boolean var1) {
      return (var0 ? y : N).y().y(class06665.yq, var1);
   }
}
