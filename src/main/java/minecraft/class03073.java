package minecraft;

import java.util.UUID;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface class03073 {
   class03926 unpack(@Nullable class04469 var1, class03079 var2) throws class03083;

   default void N() {
   }

   static class03073 N(UUID var0, BooleanSupplier var1) {
      return (var2, var3) -> {
         if (var1.getAsBoolean()) {
            throw new class03083(class03083.N);
         } else {
            return class03926.N(var0, var3.N());
         }
      };
   }
}
