package minecraft;

import java.util.List;
import java.util.Optional;

public class class05940 {
   public class05940() {
      super();
   }

   public static class04142<class08041> N() {
      return class04137.N_42(
         var0 -> var0.group(var0.y(class05378.L), var0.y(class05378.M))
            .apply(
               var0,
               (var1, var2) -> (var3, var4, var5) -> {
                  class06289 class06289 = var0.y(var1);
                  var3.method_19494()
                     .L(class06289.y())
                     .ifPresent(
                        var4x -> var0.<List<class07438>>y(var2)
                           .stream()
                           .filter(var1xxx -> var1xxx instanceof class08041 && var1xxx != var4)
                           .map(var0xxxx -> (class08041)var0xxxx)
                           .filter(class07438::method_5805)
                           .filter(var2xxx -> N(class06289, var4x, var2xxx))
                           .reduce(var4, class05940::N)
                     );
                  return true;
               }
            )
      );
   }

   private static class08041 N(class08041 var0, class08041 var1) {
      class08041 class08041x;
      class08041 class08041x;
      if (var0.u() > var1.u()) {
         class08041x = var0;
         class08041x = var1;
      } else {
         class08041x = var1;
         class08041x = var0;
      }

      class08041x.method_18868().y(class05378.L);
      return class08041x;
   }

   private static boolean N(class06289 var0, class03556<class05369> var1, class08041 var2) {
      Optional<class06289> optional = var2.method_18868().L(class05378.L);
      return optional.isPresent() && var0.equals(optional.get()) && N(var1, var2.t().y());
   }

   private static boolean N(class03556<class05369> var0, class03556<class05672> var1) {
      return ((class05672)var1.N()).y().test(var0);
   }
}
