package minecraft;

import java.util.function.Predicate;

public class class01518 {
   public class01518() {
      super();
   }

   public static <E extends class07438> class04142<E> N(Predicate<E> var0, class05378<?> var1) {
      return class04137.N_42(var2 -> var2.group(var2.y(var1)).apply(var2, var1xx -> (var2x, var3, var4) -> {
         if (var0.test(var3)) {
            var1xx.y();
            return true;
         } else {
            return false;
         }
      }));
   }
}
