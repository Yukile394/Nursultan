package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

interface class01426 {
   Codec<class01426> L = Codec.either(class01416.N, class01420.N).xmap(Either::unwrap, var0 -> {
      if (var0 instanceof class01416) {
         return Either.left((class01416)var0);
      } else if (var0 instanceof class01420) {
         return Either.right((class01420)var0);
      } else {
         throw new UnsupportedOperationException();
      }
   });
   class02362<ByteBuf, class01426> u = class02389.N(class01416.y, class01420.y).N_10(Either::unwrap, var0 -> {
      if (var0 instanceof class01416) {
         return Either.left(var0);
      } else if (var0 instanceof class01420) {
         return Either.right(var0);
      } else {
         throw new UnsupportedOperationException();
      }
   });

   <T extends Comparable<T>> boolean N(class00522<?, ?> var1, class08092<T> var2);
}
