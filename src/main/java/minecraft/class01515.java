package minecraft;

import java.util.function.BiPredicate;

public class class01515 {
   public class01515() {
      super();
   }

   public static class04142<class07438> N(int var0, BiPredicate<class07438, class07438> var1) {
      return class04137.N_42(
         var2 -> var2.group(var2.y(class05378.s), var2.N(class05378.NW), var2.L(class05378.Nv), var2.N(class05378.Nn))
            .apply(var2, (var3, var4, var5, var6) -> (var7, var8, var9) -> {
               class07438 class07438 = var2.y(var3);
               if (!class07438.method_29504()) {
                  return false;
               } else {
                  if (var1.test(var8, class07438)) {
                     var6.N(true, var0);
                  }

                  var5.N(class07438.method_24515(), var0);
                  if (class07438.method_5864() != class07078.Ly || var7.method_64395().N(class07305.P)) {
                     var3.y();
                     var4.y();
                  }

                  return true;
               }
            })
      );
   }
}
