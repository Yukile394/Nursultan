package minecraft;

import com.mojang.serialization.MapCodec;

public class class01473<P extends class01471> {
   public static final class01473<class01452> N = N("simple_state_provider", class01452.y);
   public static final class01473<class01461> y = N("weighted_state_provider", class01461.y);
   public static final class01473<class01814> L = N("noise_threshold_provider", class01814.y);
   public static final class01473<class01840> u = N("noise_provider", class01840.M);
   public static final class01473<class01813> i = N("dual_noise_provider", class01813.y);
   public static final class01473<class01443> R = N("rotated_block_provider", class01443.y);
   public static final class01473<class02771> M = N("randomized_int_state_provider", class02771.y);
   private final MapCodec<P> B;

   public class01473(MapCodec<P> var1) {
      super();
      this.B = var1;
   }

   private static <P extends class01471> class01473<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.f, var0, new class01473<>(var1));
   }

   public MapCodec<P> N() {
      return this.B;
   }
}
