package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;

public class class01461 extends class01471 {
   public static final MapCodec<class01461> y = class04540.y(class00500.N).comapFlatMap(class01461::N, var0 -> var0.L).fieldOf("entries");
   private final class04540<class00500> L;

   public class01461(class02136<class00500> var1) {
      this(var1.N());
   }

   public class01461(class04540<class00500> var1) {
      super();
      this.L = var1;
   }

   private static DataResult<class01461> N(class04540<class00500> var0) {
      return var0.L() ? DataResult.error(() -> "WeightedStateProvider with no states") : DataResult.success(new class01461(var0));
   }

   @Override
   public class00500 N(class06069 var1, class07209 var2) {
      return this.L.y(var1);
   }

   @Override
   protected class01473<?> N() {
      return class01473.y;
   }
}
