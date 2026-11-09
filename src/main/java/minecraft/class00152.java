package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

class class00152 implements class00171 {
   class00152() {
      super();
   }

   @Override
   public <T> T N(DynamicOps<T> var1, List<T> var2, class02325<StringReader> var3) {
      Boolean obool = N(var1, var2.getFirst());
      if (obool == null) {
         var3.y().N(var3.M(), class00174.y);
         return null;
      } else {
         return (T)var1.createBoolean(obool);
      }
   }

   @Nullable
   private static <T> Boolean N(DynamicOps<T> var0, T var1) {
      Optional<Boolean> optional = var0.getBooleanValue(var1).result();
      if (optional.isPresent()) {
         return optional.get();
      } else {
         Optional<Number> optional1 = var0.getNumberValue(var1).result();
         return optional1.isPresent() ? optional1.get().doubleValue() != 0.0 : null;
      }
   }
}
