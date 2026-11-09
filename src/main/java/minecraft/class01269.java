package minecraft;

import java.util.function.Function;

public class class01269 {
   public class01269() {
      super();
   }

   public static class04119<class07438> N(class02135 var0, Function<class07438, Float> var1, class05378<? extends class07438> var2, boolean var3) {
      return class04137.N_42(
         var4 -> var4.group(var4.y(var2), var4.N(class05378.P), var4.L(class05378.m)).apply(var4, (var4x, var5, var6) -> (var7, var8, var9) -> {
            if (!var8.method_6109()) {
               return false;
            } else {
               class07438 class07438 = var4.y(var4x);
               if (var8.method_24516(class07438, var0.L() + 1) && !var8.method_24516(class07438, var0.y())) {
                  class05352 class05352 = new class05352(new class05751(class07438, var3, var3), (Float)var1.apply(var8), var0.y() - 1);
                  var5.N(new class05751(class07438, true, var3));
                  var6.N(class05352);
                  return true;
               } else {
                  return false;
               }
            }
         })
      );
   }

   public static class04119<class07438> N(class02135 var0, float var1) {
      return N(var0, var1x -> var1, class05378.e, false);
   }
}
