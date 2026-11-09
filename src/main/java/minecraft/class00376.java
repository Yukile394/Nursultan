package minecraft;

import com.mojang.serialization.MapCodec;

public record class00376() implements class00335 {
   public static final MapCodec<class00376> N = MapCodec.unit(new class00376());

   public class00376() {
   }

   @Override
   public MapCodec<class00376> N() {
      return N;
   }

   @Override
   public class00368<?> N(class00331 var1) {
      return new class00348(new class03852(var1.y().N(class04802.ue)));
   }
}
