package minecraft;

import java.util.function.Predicate;

public class class05750 {
   public class05750() {
      super();
   }

   public static <E extends class07438, T extends class07438> class04142<E> N(
      class07078<? extends T> var0, int var1, Predicate<E> var2, Predicate<T> var3, class05378<T> var4, float var5, int var6
   ) {
      int i = var1 * var1;
      Predicate predicate = var2x -> var0.equals(var2x.method_5864()) && var3.test(var2x);
      return class04137.N_42(
         var6x -> var6x.group(var6x.N(var4), var6x.N(class05378.P), var6x.L(class05378.m), var6x.y(class05378.B))
            .apply(var6x, (var6xx, var7x, var8x, var9) -> (var10, var11, var12) -> {
               class04051 class04051 = var6x.y(var9);
               if (var2.test(var11) && class04051.u(predicate)) {
                  class04051.N(var3xxxx -> var3xxxx.method_5858(var11) <= i && predicate.test(var3xxxx)).ifPresent(var5xxxx -> {
                     var6xx.N(var5xxxx);
                     var7x.N(new class05751(var5xxxx, true));
                     var8x.N(new class05352(new class05751(var5xxxx, false), var5, var6));
                  });
                  return true;
               } else {
                  return false;
               }
            })
      );
   }

   public static <T extends class07438> class04142<class07438> N(class07078<? extends T> var0, int var1, class05378<T> var2, float var3, int var4) {
      return N(var0, var1, var0x -> true, var0x -> true, var2, var3, var4);
   }
}
