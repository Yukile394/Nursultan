package minecraft;

import com.mojang.serialization.MapCodec;

public class class04294 extends class04050 {
   private static final class04294 L = new class04294();
   public static MapCodec<class04294> N = MapCodec.unit(() -> L);

   private class04294() {
      super();
   }

   @Override
   protected boolean y(class01034 var1, class06069 var2, class07209 var3) {
      class04336 class04336 = var1.L()
         .orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome"));
      class03556<class00780> class03556 = var1.y().i(var3);
      return var1.u().N(class03556).N(class04336);
   }

   public static class04294 y() {
      return L;
   }

   @Override
   public class04323<?> N() {
      return class04323.i;
   }
}
