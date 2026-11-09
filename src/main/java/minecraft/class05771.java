package minecraft;

import java.util.function.Function;
import java.util.function.Predicate;

public class class05771 {
   public class05771() {
      super();
   }

   public static class04119<class07438> N(Predicate<class07438> var0, Function<class07438, Float> var1, int var2) {
      return class04137.N_42(var3 -> var3.group(var3.L(class05378.m), var3.y(class05378.P)).apply(var3, (var4, var5) -> (var6, var7, var8) -> {
         if (!var0.test(var7)) {
            return false;
         } else {
            var4.N(new class05352(var3.y(var5), (Float)var1.apply(var7), var2));
            return true;
         }
      }));
   }

   public static class04119<class07438> N(float var0, int var1) {
      return N(var0x -> true, var1x -> var0, var1);
   }
}
