package minecraft;

import java.util.List;
import java.util.Optional;

public class class05968 {
   public class05968() {
      super();
   }

   public static class04142<class08041> N(float var0) {
      return class04137.N_42(
         var1 -> var1.group(var1.y(class05378.u), var1.L(class05378.L), var1.y(class05378.M), var1.N(class05378.m), var1.N(class05378.P))
            .apply(
               var1,
               (var2, var3, var4, var5, var6) -> (var6x, var7, var8) -> {
                  if (var7.method_6109()) {
                     return false;
                  } else if (!var7.t().y().N(class05672.y)) {
                     return false;
                  } else {
                     class07209 class07209 = var1.<class06289>y(var2).y();
                     Optional<class03556<class05369>> optional = var6x.method_19494().L(class07209);
                     if (optional.isEmpty()) {
                        return true;
                     } else {
                        var1.<List<class07438>>y(var4)
                           .stream()
                           .filter(var1xxx -> var1xxx instanceof class08041 && var1xxx != var7)
                           .map(var0xxxx -> (class08041)var0xxxx)
                           .filter(class07438::method_5805)
                           .filter(var2xx -> N(optional.get(), var2xx, class07209))
                           .findFirst()
                           .ifPresent(var6xx -> {
                              var5.y();
                              var6.y();
                              var2.y();
                              if (var6xx.method_18868().L(class05378.L).isEmpty()) {
                                 class06293.N(var6xx, class07209, var0, 1);
                                 var6xx.method_18868().N(class05378.u, class06289.N(var6x.method_27983(), class07209));
                                 var6x.method_74535().y(class07209);
                              }
                           });
                        return true;
                     }
                  }
               }
            )
      );
   }

   private static boolean N(class03556<class05369> var0, class08041 var1, class07209 var2) {
      if (var1.method_18868().L(class05378.u).isPresent()) {
         return false;
      } else {
         Optional<class06289> optional = var1.method_18868().L(class05378.L);
         if (var1.t().y().N().y().test(var0)) {
            return optional.isEmpty() ? N(var1, var2, (class05369)var0.N()) : optional.get().y().equals(var2);
         } else {
            return false;
         }
      }
   }

   private static boolean N(class07475 var0, class07209 var1, class05369 var2) {
      class00143 class00143 = var0.f().N(var1, var2.L());
      return class00143 != null && class00143.z();
   }
}
