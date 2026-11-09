package minecraft;

import java.util.Optional;
import java.util.function.Predicate;

public class class05745 {
   public class05745() {
      super();
   }

   public static class04142<class07438> N(class07428 var0, float var1) {
      return N(var1x -> var0.equals(var1x.method_5864().i()), var1);
   }

   public static class04119<class07438> N(class07078<?> var0, float var1) {
      return N(var1x -> var0.equals(var1x.method_5864()), var1);
   }

   public static class04119<class07438> N(float var0) {
      return N(var0x -> true, var0);
   }

   public static class04119<class07438> N(Predicate<class07438> var0, float var1) {
      float f = var1 * var1;
      return class04137.N_42(var2x -> var2x.group(var2x.L(class05378.P), var2x.y(class05378.B)).apply(var2x, (var3, var4) -> (var5, var6, var7) -> {
         Optional<class07438> optional = var2x.<class04051>y(var4).N(var0.and(var2xxxx -> var2xxxx.method_5858(var6) <= f && !var6.method_5626(var2xxxx)));
         if (optional.isEmpty()) {
            return false;
         } else {
            var3.N(new class05751(optional.get(), true));
            return true;
         }
      }));
   }
}
