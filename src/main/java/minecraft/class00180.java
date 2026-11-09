package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.IntStream;

class class00180 implements class00171 {
   class00180() {
      super();
   }

   @Override
   public <T> T N(DynamicOps<T> var1, List<T> var2, class02325<StringReader> var3) {
      Optional<String> optional = var1.getStringValue(var2.getFirst()).result();
      if (optional.isEmpty()) {
         var3.y().N(var3.M(), class00174.N);
         return null;
      } else {
         UUID uuid;
         try {
            uuid = UUID.fromString(optional.get());
         } catch (IllegalArgumentException illegalargumentexception) {
            var3.y().N(var3.M(), class00174.N);
            return null;
         }

         return (T)var1.createIntList(IntStream.of(class01487.N(uuid)));
      }
   }
}
