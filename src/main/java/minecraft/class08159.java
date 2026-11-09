package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public interface class08159 {
   Codec<class08159> N = class04206.Ne.T().dispatch(class08159::N, var0 -> var0);
   Codec<class08159> y = Codec.either(N, class01894.N)
      .xmap(
         var0 -> (class08159)var0.map(var0x -> var0x, class08190::N),
         var0 -> var0 instanceof class08190 ? Either.right(((class08190)var0).y()) : Either.left(var0)
      );

   MapCodec<? extends class08159> N();
}
