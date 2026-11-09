package minecraft;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class class03655 {
   public class03655() {
      super();
   }

   public static class04142<class07438> N(Function<class07438, Optional<class05779>> var0, Predicate<class07438> var1, int var2, int var3, float var4) {
      return class04137.N_42(var5 -> var5.group(var5.N(class05378.P), var5.N(class05378.m)).apply(var5, (var5x, var6) -> (var7, var8, var9) -> {
         Optional optional = (Optional)var0.apply(var8);
         if (!optional.isEmpty() && var1.test(var8)) {
            class05779 class05779x = (class05779)optional.get();
            if (var8.method_73189().N((class00737)class05779x.N(), (double)var3)) {
               return false;
            } else {
               class05779 class05779x = (class05779)optional.get();
               var5x.N(class05779x);
               var6.N(new class05352(class05779x, var4, var2));
               return true;
            }
         } else {
            return false;
         }
      }));
   }
}
