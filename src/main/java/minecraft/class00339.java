package minecraft;

import com.mojang.serialization.MapCodec;

public record class00339() implements class00335 {
   public static final MapCodec<class00339> N = MapCodec.unit(new class00339());

   public class00339() {
      super();
   }

   @Override
   public MapCodec<class00339> N() {
      return N;
   }

   @Override
   public class00368<?> N(class00331 var1) {
      return new class00338(var1.L(), var1.y().N(class04802.NE));
   }
}
