package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface class02487<T extends class02500> {
   Codec<class02487<?>> N = Codec.either(class04206.Ns.T(), class04206.NW.T()).xmap(class02487::N, class02487::N);
   class02362<class04247, class02487<?>> y = class02389.N(class02389.N(class04227.T), class02389.N(class04227.b)).N_10(class02487::N, class02487::N);

   Codec<T> L();

   class02362<class04247, class02470<T>> i();

   MapCodec<class02470<T>> u();

   private static class02487<?> N(Either<class02487<?>, class02477<?>> var0) {
      return (class02487<?>)var0.map(var0x -> var0x, class02481::N);
   }

   private static <T extends class02487<?>> Either<T, class02477<?>> N(T var0) {
      return var0 instanceof class02481 ? Either.right(((class02481)var0).y()) : Either.left(var0);
   }
}
