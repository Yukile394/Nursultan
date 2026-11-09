package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class class00294 implements class00299 {
   public static final class00294 L = new class00294();
   public static final MapCodec<class00294> u = MapCodec.unit(L);
   public static final class02362<class04247, class00294> i = class02362.N(L);
   public static final class00319<class00294> R = new class00319<>(u, i);

   private class00294() {
      super();
   }

   @Override
   public String toString() {
      return "<any fuel>";
   }

   @Override
   public <T> Stream<T> N(class00311 var1, class00308<T> var2) {
      if (var2 instanceof class00287 class00287) {
         class02755 class02755 = var1.L(class00282.N);
         if (class02755 != null) {
            return class02755.N().stream().map(class00287::N);
         }
      }

      return Stream.empty();
   }

   @Override
   public class00319<class00294> N() {
      return R;
   }
}
