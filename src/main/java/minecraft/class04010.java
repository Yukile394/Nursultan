package minecraft;

import java.util.Optional;

public class class04010 {
   public class04010() {
      super();
   }

   public static class04142<class07438> N() {
      return class04137.N_42(
         var0 -> var0.group(var0.N(class05378.P), var0.N(class05378.NV), var0.N(class05378.NK), var0.L(class05378.s))
            .apply(var0, (var1, var2, var3, var4) -> (var4x, var5, var6) -> {
               Optional optional = var0.<class07438>N(var3).map(class07049::method_24515).or(() -> var0.N(var2));
               if (optional.isEmpty()) {
                  return false;
               } else {
                  var1.N(new class05744((class07209)optional.get()));
                  return true;
               }
            })
      );
   }
}
