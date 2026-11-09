package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;

public class class01039 extends class04297 {
   private static final class01039 L = new class01039();
   public static final MapCodec<class01039> N = MapCodec.unit(() -> L);

   public class01039() {
      super();
   }

   public static class01039 y() {
      return L;
   }

   @Override
   public Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3) {
      int i = var2.y(16) + var3.method_10263();
      int j = var2.y(16) + var3.method_10260();
      return Stream.of(new class07209(i, var3.method_10264(), j));
   }

   @Override
   public class04323<?> N() {
      return class04323.W;
   }
}
