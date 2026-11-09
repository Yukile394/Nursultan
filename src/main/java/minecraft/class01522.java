package minecraft;

import java.util.function.Predicate;

public class class01522 {
   public class01522() {
      super();
   }

   public static <E extends class07438> class04142<E> N(Predicate<E> var0, float var1, boolean var2, int var3) {
      return class04137.N_42(
         var4 -> {
            class04137 class04137 = var2 ? var4.N(class05378.m) : var4.L(class05378.m);
            return var4.group(var4.N(class05378.P), class04137, var4.y(class05378.H), var4.N(class05378.yN))
               .apply(
                  var4,
                  (var4x, var5x, var6, var7) -> (var8, var9, var10) -> {
                     class00717 class00717 = var4.y(var6);
                     if (var4.N(var7).isEmpty()
                        && var0.test(var9)
                        && class00717.method_24516(var9, var3)
                        && var9.method_73183().method_8621().N(class00717.method_24515())
                        && var9.method_5936()) {
                        class05352 class05352 = new class05352(new class05751(class00717, false), var1, 0);
                        var4x.N(new class05751(class00717, true));
                        var5x.N(class05352);
                        return true;
                     } else {
                        return false;
                     }
                  }
               );
         }
      );
   }

   public static class04142<class07438> N(float var0, boolean var1, int var2) {
      return N(var0x -> true, var0, var1, var2);
   }
}
