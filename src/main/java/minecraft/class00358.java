package minecraft;

import com.mojang.serialization.MapCodec;

public record class00358() implements class00335 {
   public static final class00358 N = new class00358();
   public static final MapCodec<class00358> y = MapCodec.unit(N);

   public class00358() {
      super();
   }

   @Override
   public MapCodec<class00358> N() {
      return y;
   }

   @Override
   public class00368<?> N(class00331 var1) {
      return new class00351(var1.L(), new class04534(var1.y().N(class04802.uu)));
   }
}
