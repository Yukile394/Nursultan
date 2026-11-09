package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.function.ToIntFunction;

public class class04531 {
   private class04531() {
      super();
   }

   public static <T> Optional<T> N(class06069 var0, List<T> var1, ToIntFunction<T> var2) {
      return N(var0, var1, N(var1, var2), var2);
   }

   public static <T> Optional<T> N(List<T> var0, int var1, ToIntFunction<T> var2) {
      for (Object object : var0) {
         var1 -= var2.applyAsInt(object);
         if (var1 < 0) {
            return Optional.of((T)object);
         }
      }

      return Optional.empty();
   }

   public static <T> Optional<T> N(class06069 var0, List<T> var1, int var2, ToIntFunction<T> var3) {
      if (var2 < 0) {
         throw (IllegalArgumentException)class07536.y(new IllegalArgumentException("Negative total weight in getRandomItem"));
      } else if (var2 == 0) {
         return Optional.empty();
      } else {
         int i = var0.y(var2);
         return N(var1, i, var3);
      }
   }

   public static <T> int N(List<T> var0, ToIntFunction<T> var1) {
      long i = 0L;

      for (Object object : var0) {
         i += var1.applyAsInt(object);
      }

      if (i > 2147483647L) {
         throw new IllegalArgumentException("Sum of weights must be <= 2147483647");
      } else {
         return (int)i;
      }
   }
}
