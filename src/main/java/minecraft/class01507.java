package minecraft;

import java.util.Optional;

public class class01507 {
   public class01507() {
      super();
   }

   public static <E extends class07079> class04142<E> N(class01500<E> var0, class01498<E> var1) {
      return class04137.N_42(var2 -> var2.group(var2.L(class05378.s), var2.N(class05378.I)).apply(var2, (var2x, var3) -> (var4, var5, var6) -> {
         if (!var0.test(var4, var5)) {
            return false;
         } else {
            Optional<? extends class07438> optional = var1.get(var4, var5);
            if (optional.isEmpty()) {
               return false;
            } else {
               class07438 class07438 = optional.get();
               if (!var5.method_18395(class07438)) {
                  return false;
               } else {
                  var2x.N(class07438);
                  var3.y();
                  return true;
               }
            }
         }
      }));
   }

   public static <E extends class07079> class04142<E> N(class01498<E> var0) {
      return N((var0x, var1) -> true, var0);
   }
}
