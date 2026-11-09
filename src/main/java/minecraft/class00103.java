package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00103 {
   private static final Logger N = LogUtils.getLogger();
   private static final Map<MapCodec<? extends class09034>, class00105<?>> y = new HashMap<>();

   public class00103() {
      super();
   }

   @Nullable
   public static <B extends class09034> class02102 N(class00134<?> var0, B var1) {
      class00105 class00105 = N(var1);
      if (class00105 == null) {
         N.warn("Unrecognized dialog body {}", var1);
         return null;
      } else {
         return class00105.N(var0, var1);
      }
   }

   static void N(class00134<?> var0, @Nullable class00405 var1) {
      if (var1 != null) {
         class00647 class00647 = var1.Z();
         if (class00647 != null) {
            var0.N(Optional.of(class00647));
         }
      }
   }

   public static void N() {
      N(class09022.u, new class00099());
      N(class09013.L, new class00120());
   }

   private static <B extends class09034> void N(MapCodec<B> var0, class00105<? super B> var1) {
      y.put(var0, var1);
   }

   @Nullable
   private static <B extends class09034> class00105<B> N(B var0) {
      return (class00105<B>)y.get(var0.N());
   }
}
