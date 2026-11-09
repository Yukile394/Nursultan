package minecraft;

import java.util.List;

public class class01492 {
   public class01492() {
      super();
   }

   public static class04119<class01489> N() {
      return class04137.N_42(
         var0 -> var0.group(var0.y(class05378.Nt), var0.L(class05378.NW), var0.L(class05378.Nj), var0.N(class05378.Nw))
            .apply(var0, (var1, var2, var3, var4) -> (var3x, var4x, var5) -> {
               if (!var4x.method_6109() && !var0.<List>N(var4).map(var0xxx -> var0xxx.stream().anyMatch(class01492::N)).isPresent()) {
                  class06018 class06018 = var0.y(var1);
                  class01514.L(var3x, var4x, class06018);
                  class01514.y((class01238)var4x);
                  class01514.y(var3x, var4x, class06018);
                  var0.<List>N(var4).ifPresent(var0xxx -> var0xxx.forEach(class01514::y));
                  return true;
               } else {
                  return false;
               }
            })
      );
   }

   private static boolean N(class01238 var0) {
      return var0.method_18868().N(class05378.Nj);
   }
}
