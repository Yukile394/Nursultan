package minecraft;

import java.util.Optional;
import java.util.function.Function;

public class class04005 {
   public class04005() {
      super();
   }

   public static <E extends class04003> class04142<E> N(Function<E, Optional<? extends class07438>> var0) {
      return class04137.N_42(
         var1 -> var1.group(var1.L(class05378.NK), var1.L(class05378.s), var1.N(class05378.I)).apply(var1, (var1x, var2, var3) -> (var3x, var4, var5) -> {
            Optional optional = (Optional)var0.apply(var4);
            if (optional.filter(var4::L).isEmpty()) {
               return false;
            } else {
               var1x.N((class07438)optional.get());
               var3.y();
               return true;
            }
         })
      );
   }
}
