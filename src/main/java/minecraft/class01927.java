package minecraft;

import Nursultan.class09544;
import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class class01927 extends class03534 {
   public static final MapCodec<class01927> N = N(class01927::new);

   public class01927(List<class04129> var1, List<class05957> var2) {
      super(var1, var2);
   }

   public static class09544 N(class04111<?>... var0) {
      return new class09544(var0);
   }

   @Override
   public class05950 N() {
      return class03942.Z;
   }

   @Override
   protected class03449 N(List<? extends class03449> var1) {
      return switch (var1.size()) {
         case 0 -> L;
         case 1 -> (class03449)var1.get(0);
         case 2 -> ((class03449)var1.get(0)).N((class03449)var1.get(1));
         default -> (var1x, var2) -> {
            Iterator iterator = var1.iterator();

            while (iterator.hasNext()) {
               if (!((class03449)iterator.next()).expand(var1x, var2)) {
                  return false;
               }
            }

            return true;
         };
      };
   }
}
