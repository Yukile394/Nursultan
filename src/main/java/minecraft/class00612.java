package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

@FunctionalInterface
public interface class00612 extends class00589<Integer> {
   @Override
   default Codec<Integer> argumentCodec(class00607<Integer> var1) {
      return Codec.either(class06338.P, class06338.E).xmap(Either::unwrap, var0 -> class02566.y(var0) == 255 ? Either.right(var0) : Either.left(var0));
   }

   @Override
   default class00610<Integer> argumentKeyframeLerp(class00607<Integer> var1) {
      return class00610.L();
   }
}
