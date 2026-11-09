package minecraft;

import java.util.function.Consumer;

@FunctionalInterface
public interface class04197<T> {
   class04218 accept(T var1);

   static <T> class04197<T> N(Consumer<T> var0) {
      return var1 -> {
         var0.accept(var1);
         return class04218.field_41283;
      };
   }
}
