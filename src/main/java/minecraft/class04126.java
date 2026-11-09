package minecraft;

import java.util.Optional;
import java.util.function.Predicate;

@Deprecated
public class class04126 {
   public class04126() {
      super();
   }

   public static class04142<class07438> N(float var0, class02135 var1) {
      return N(var0, var1, var0x -> true);
   }

   public static class04142<class07438> N(class07078<?> var0, float var1, class02135 var2) {
      return N(var1, var2, var1x -> var0.equals(var1x.method_5864()));
   }

   private static class04142<class07438> N(float var0, class02135 var1, Predicate<class07438> var2) {
      float f = var0 * var0;
      class04133 class04133 = new class04133(var1);
      return class04137.N_42(var3x -> var3x.group(var3x.L(class05378.P), var3x.y(class05378.B)).apply(var3x, (var4x, var5) -> (var6, var7, var8) -> {
         Optional<class07438> optional = var3x.<class04051>y(var5).N(var2.and(var2xxxx -> var2xxxx.method_5858(var7) <= f));
         if (optional.isEmpty()) {
            return false;
         } else if (!class04133.N(var6.field_9229)) {
            return false;
         } else {
            var4x.N(new class05751(optional.get(), true));
            return true;
         }
      }));
   }
}
