package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class01249 extends class01219 {
   public static final MapCodec<class01249> N = MapCodec.unit(() -> class01249.y);
   public static final class01249 y = new class01249();

   public class01249() {
      super();
   }

   @Nullable
   @Override
   public class01228 N(class05487 var1, class07209 var2, class07209 var3, class01228 var4, class01228 var5, class01233 var6) {
      class07209 class07209 = var5.N();
      return var1.method_8320(class07209).N(class00869.V) && !class00891.N(var5.y().R(var1, class07209))
         ? new class01228(class07209, class00869.V.W(), var5.L())
         : var5;
   }

   @Override
   protected class05235<?> N() {
      return class05235.W;
   }
}
