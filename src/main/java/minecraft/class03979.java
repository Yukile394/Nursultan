package minecraft;

import com.mojang.serialization.MapCodec;

public record class03979<A>(MapCodec<A> codec) {
   public class03979(MapCodec<A> codec) {
      this.codec = codec;
   }

   public static <A> class03979<A> N(MapCodec<A> var0) {
      return new class03979<>(var0);
   }

   public MapCodec<A> N() {
      return this.codec;
   }
}
