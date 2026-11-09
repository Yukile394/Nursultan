package minecraft;

public class class01530 {
   public class01530() {
      super();
   }

   public static <E extends class07079> class04119<E> N(class05378<class07209> var0, int var1, float var2) {
      return class04137.N_42(
         var3 -> var3.group(var3.y(var0), var3.L(class05378.s), var3.L(class05378.m), var3.N(class05378.P))
            .apply(var3, (var3x, var4, var5, var6) -> (var4x, var5x, var6x) -> {
               class07209 class07209 = var3.y(var3x);
               if (!class07209.method_19771(var5x.method_24515(), var1)) {
                  class06293.N(var5x, N(var5x, class07209), var2, var1);
               }

               return true;
            })
      );
   }

   private static int N(class06069 var0) {
      return var0.y(3) - 1;
   }

   private static class07209 N(class07079 var0, class07209 var1) {
      class06069 class06069 = var0.method_73183().field_9229;
      return var1.method_10069(N(class06069), 0, N(class06069));
   }
}
