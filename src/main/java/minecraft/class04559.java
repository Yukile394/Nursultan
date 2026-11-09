package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class class04559 extends class03534 {
   public static final MapCodec<class04559> N = N(class04559::new);
   public static final class04480 u = new class04586();

   class04559(List<class04129> var1, List<class05957> var2) {
      super(var1, var2);
   }

   public static <E> class04546 N(Collection<E> var0, Function<E, class04111<?>> var1) {
      return new class04546(var0.stream().map(var1::apply).toArray(class04111[]::new));
   }

   public static class04546 N(class04111<?>... var0) {
      return new class04546(var0);
   }

   @Override
   public class05950 N() {
      return class03942.B;
   }

   @Override
   public void N(class05561 var1) {
      super.N(var1);

      for (int i = 0; i < this.R.size() - 1; i++) {
         if (this.R.get(i).M.isEmpty()) {
            var1.N(u);
         }
      }
   }

   @Override
   protected class03449 N(List<? extends class03449> var1) {
      return switch (var1.size()) {
         case 0 -> y;
         case 1 -> (class03449)var1.get(0);
         case 2 -> ((class03449)var1.get(0)).y((class03449)var1.get(1));
         default -> (var1x, var2) -> {
            Iterator iterator = var1.iterator();

            while (iterator.hasNext()) {
               if (((class03449)iterator.next()).expand(var1x, var2)) {
                  return true;
               }
            }

            return false;
         };
      };
   }
}
