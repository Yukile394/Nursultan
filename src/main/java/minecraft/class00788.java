package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Set;

public class class00788 implements class05957 {
   private static final class00788 i = new class00788();
   public static final MapCodec<class00788> N = MapCodec.unit(i);

   public static class05952 L() {
      return () -> i;
   }

   private class00788() {
      super();
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.E);
   }

   public boolean test(class05908 var1) {
      Float f = var1.L(class06551.E);
      if (f != null) {
         class06069 class06069 = var1.y();
         float f1 = 1.0F / f;
         return class06069.z() <= f1;
      } else {
         return true;
      }
   }

   @Override
   public class05955 N() {
      return class07693.E;
   }
}
