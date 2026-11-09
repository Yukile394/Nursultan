package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Set;

public class class07776 implements class05957 {
   private static final class07776 i = new class07776();
   public static final MapCodec<class07776> N = MapCodec.unit(i);

   public static class05952 L() {
      return () -> i;
   }

   private class07776() {
      super();
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.u);
   }

   public boolean test(class05908 var1) {
      return var1.N(class06551.u);
   }

   @Override
   public class05955 N() {
      return class07693.M;
   }
}
