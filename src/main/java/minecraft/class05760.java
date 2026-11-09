package minecraft;

import java.util.Optional;

public class class05760 {
   public class05760() {
      super();
   }

   public static class04142<class08041> N() {
      return class04137.N_42(
         var0 -> var0.group(var0.y(class05378.u), var0.N(class05378.L))
            .apply(
               var0,
               (var1, var2) -> (var3, var4, var5) -> {
                  class06289 class06289 = var0.y(var1);
                  if (!class06289.y().method_19769(var4.method_73189(), 2.0) && !var4.E()) {
                     return false;
                  } else {
                     var1.y();
                     var2.N(class06289);
                     var3.method_8421(var4, (byte)14);
                     if (!var4.t().y().N(class05672.y)) {
                        return true;
                     } else {
                        Optional.ofNullable(var3.method_8503().N(class06289.N()))
                           .flatMap(var1xx -> var1xx.method_19494().L(class06289.y()))
                           .flatMap(var0xxx -> class04206.d.z().filter(var1xx -> var1xx.N().y().test((class03556<class05369>)var0xxx)).findFirst())
                           .ifPresent(var2xx -> {
                              var4.N(var4.t().y(var2xx));
                              var4.L(var3);
                           });
                        return true;
                     }
                  }
               }
            )
      );
   }
}
