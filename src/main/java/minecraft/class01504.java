package minecraft;

import java.util.function.Predicate;

public class class01504 {
   public class01504() {
      super();
   }

   public static <E extends class07438, T> class04142<E> N(Predicate<E> var0, class05378<? extends T> var1, class05378<T> var2, class02135 var3) {
      return class04137.N_42(var4 -> var4.group(var4.y(var1), var4.L(var2)).apply(var4, (var3xx, var4x) -> (var5, var6, var7) -> {
         if (!var0.test(var6)) {
            return false;
         } else {
            var4x.N(var4.y(var3xx), var3.N(var5.field_9229));
            return true;
         }
      }));
   }
}
