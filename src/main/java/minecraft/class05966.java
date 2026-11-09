package minecraft;

import java.util.Map;
import java.util.Optional;

public interface class05966 {
   Map<Optional<class05946<class04382>>, class05966> N = Map.of(
      Optional.of(class05964.y),
      (var0, var1) -> {
         class08088 class08088 = var1.i().N();
         class01022 class01022 = var1.N();
         class00751 class00751xx = class01022.L(class04227.NA);
         class00751 class00751x = class01022.L(class04227.yb);
         class00751 class00751xx = class01022.L(class04227.ys);
         return new class05737(
            var0,
            var1x -> var0.N().N(N(var1x)),
            class08088 instanceof class07850 ? ((class07850)class08088).B() : class01584.N(class00751xx, class00751x, class00751xx)
         );
      },
      Optional.of(class05964.i),
      (var0, var1) -> new class05357(var0, var1, var1x -> var0.N().N(N(var1x)))
   );

   static class01935 N(class01584 var0) {
      return (var1, var2) -> {
         class07850 class07850 = new class07850(var0);
         return var2.N(var1, class07850);
      };
   }

   private static class01935 N(class03556<class00780> var0) {
      return (var1, var2) -> {
         class03529 class03529 = var1.L(class04227.yE).y(class05943.L);
         class00782 class00782 = new class00782(var0);
         class04865 class04865 = new class04865(class00782, class03529);
         return var2.N(var1, class04865);
      };
   }

   class05096 createEditScreen(class05213 var1, class01896 var2);
}
