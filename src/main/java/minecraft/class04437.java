package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class class04437<E extends class07079> extends class02152<E> {
   private final class03530<class00891> W;
   private final float m;
   private final List<class02146> P = new ArrayList<>();
   private boolean s;

   public class04437(
      class02135 var1, int var2, int var3, float var4, Function<E, class04891> var5, class03530<class00891> var6, float var7, BiPredicate<E, class07209> var8
   ) {
      super(var1, var2, var3, var4, var5, var8);
      this.W = var6;
      this.m = var7;
   }

   @Override
   protected void y(class04782 var1, E var2, long var3) {
      super.y(var1, (E)var2, var3);
      this.P.clear();
      this.s = var2.method_59922().z() < this.m;
   }

   @Override
   protected Optional<class02146> N(class04782 var1) {
      if (!this.s) {
         return super.N(var1);
      } else {
         class07218 class07218 = new class07218();

         while (!this.R.isEmpty()) {
            Optional<class02146> optional = super.N(var1);
            if (optional.isPresent()) {
               class02146 class02146 = optional.get();
               if (var1.method_8320(class07218.N(class02146.N(), class07211.field_11033)).N(this.W)) {
                  return optional;
               }

               this.P.add(class02146);
            }
         }

         return !this.P.isEmpty() ? Optional.of(this.P.remove(0)) : Optional.empty();
      }
   }
}
