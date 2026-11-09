package minecraft;

import java.util.Optional;

public class class05778 {
   public class05778() {
      super();
   }

   public static class04142<class07438> N(class07078<?> var0, int var1) {
      return class04137.N_42(
         var2 -> var2.group(var2.N(class05378.P), var2.L(class05378.b), var2.y(class05378.B)).apply(var2, (var3, var4, var5) -> (var6, var7, var8) -> {
            Optional<class07438> optional = var2.<class04051>y(var5).N(var3xx -> var3xx.method_5858(var7) <= var0x && var0.equals(var3xx.method_5864()));
            if (optional.isEmpty()) {
               return false;
            } else {
               class07438 class07438 = optional.get();
               var4.N(class07438);
               var3.N(new class05751(class07438, true));
               return true;
            }
         })
      );
   }
}
