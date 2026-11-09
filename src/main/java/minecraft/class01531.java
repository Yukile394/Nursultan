package minecraft;

import java.util.Optional;
import java.util.function.Function;

public class class01531 {
   private static final int N = 1;

   public class01531() {
      super();
   }

   public static class04142<class07079> N(Function<class07438, Float> var0) {
      return class04137.N_42(
         var1 -> var1.group(var1.N(class05378.m), var1.N(class05378.P), var1.y(class05378.s), var1.N(class05378.B))
            .apply(var1, (var2, var3, var4, var5) -> (var6, var7, var8) -> {
               class07438 class07438 = var1.y(var4);
               Optional optional = var1.N(var5);
               if (optional.isPresent() && ((class04051)optional.get()).N(class07438) && class06293.N(var7, class07438, 1)) {
                  var2.y();
               } else {
                  var3.N(new class05751(class07438, true));
                  var2.N(new class05352(new class05751(class07438, false), (Float)var0.apply(var7), 0));
               }

               return true;
            })
      );
   }

   public static class04142<class07079> N(float var0) {
      return N(var1 -> var0);
   }
}
