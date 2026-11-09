package minecraft;

import Nursultan.class09824;
import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class class02709 extends class03534 {
   public static final MapCodec<class02709> N = N(class02709::new);

   public class02709(List<class04129> var1, List<class05957> var2) {
      super(var1, var2);
   }

   public static class09824 N(class04111<?>... var0) {
      return new class09824(var0);
   }

   @Override
   public class05950 N() {
      return class03942.z;
   }

   @Override
   protected class03449 N(List<? extends class03449> var1) {
      return switch (var1.size()) {
         case 0 -> L;
         case 1 -> (class03449)var1.get(0);
         case 2 -> {
            class03449 class03449x = (class03449)var1.get(0);
            class03449 class03449 = (class03449)var1.get(1);
            yield (var2x, var3x) -> {
               class03449x.expand(var2x, var3x);
               class03449.expand(var2x, var3x);
               return true;
            };
         }
         default -> (var1x, var2x) -> {
            Iterator iterator = var1.iterator();

            while (iterator.hasNext()) {
               ((class03449)iterator.next()).expand(var1x, var2x);
            }

            return true;
         };
      };
   }
}
