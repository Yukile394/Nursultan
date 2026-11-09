package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00100 {
   private static final Logger N = LogUtils.getLogger();
   private static final Map<MapCodec<? extends class09015>, class00127<?>> y = new HashMap<>();

   public class00100() {
      super();
   }

   public static <T extends class09015> void N(T var0, class05096 var1, class00129 var2) {
      class00127 class00127 = N(var0);
      if (class00127 == null) {
         N.warn("Unrecognized input control {}", var0);
      } else {
         class00127.N(var0, var1, var2);
      }
   }

   public static void N() {
      N(class09035.N, new class00128());
      N(class08997.N, new class00115());
      N(class09020.N, new class00110());
      N(class09011.N, new class00098());
   }

   private static <T extends class09015> void N(MapCodec<T> var0, class00127<? super T> var1) {
      y.put(var0, var1);
   }

   @Nullable
   private static <T extends class09015> class00127<T> N(T var0) {
      return (class00127<T>)y.get(var0.N());
   }
}
