package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class class00307 implements class00299 {
   public static final class00307 L = new class00307();
   public static final MapCodec<class00307> u = MapCodec.unit(L);
   public static final class02362<class04247, class00307> i = class02362.N(L);
   public static final class00319<class00307> R = new class00319<>(u, i);

   private class00307() {
      super();
   }

   @Override
   public String toString() {
      return "<empty>";
   }

   @Override
   public <T> Stream<T> N(class00311 var1, class00308<T> var2) {
      return Stream.empty();
   }

   @Override
   public class00319<class00307> N() {
      return R;
   }
}
