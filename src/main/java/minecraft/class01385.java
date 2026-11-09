package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Predicate;

interface class01385 extends Predicate<class08019> {
   Codec<class01385> y = Codec.either(class01401.N, class01432.N).xmap(Either::unwrap, var0 -> {
      if (var0 instanceof class01401) {
         return Either.left((class01401)var0);
      } else if (var0 instanceof class01432) {
         return Either.right((class01432)var0);
      } else {
         throw new UnsupportedOperationException();
      }
   });
}
