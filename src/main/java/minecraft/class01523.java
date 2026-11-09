package minecraft;

import java.util.Optional;

public class class01523 {
   private static final int N = 200;

   public class01523() {
      super();
   }

   public static <E extends class07079> class04142<E> N_28(class01494<E> var0) {
      return N((var0x, var1) -> false, var0, true);
   }

   public static <E extends class07079> class04142<E> N() {
      return N((var0, var1) -> false, (var0, var1, var2) -> {}, true);
   }

   public static <E extends class07079> class04142<E> N(class01525 var0, class01494<E> var1, boolean var2) {
      return class04137.N_42(
         var3 -> var3.group(var3.y(class05378.s), var3.N(class05378.I))
            .apply(
               var3,
               (var4, var5) -> (var6, var7, var8) -> {
                  class07438 class07438 = var3.y(var4);
                  if (var7.method_18395(class07438)
                     && (!var2 || !N(var7, var3.N(var5)))
                     && class07438.method_5805()
                     && class07438.method_73183() == var7.method_73183()
                     && !var0.test(var6, class07438)) {
                     return true;
                  } else {
                     var1.accept(var6, var7, class07438);
                     var4.y();
                     return true;
                  }
               }
            )
      );
   }

   private static boolean N(class07438 var0, Optional<Long> var1) {
      return var1.isPresent() && var0.method_73183().N() - (Long)var1.get() > 200L;
   }

   public static <E extends class07079> class04142<E> N(class01525 var0) {
      return N(var0, (var0x, var1, var2) -> {}, true);
   }
}
