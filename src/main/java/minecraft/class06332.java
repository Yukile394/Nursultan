package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class class06332 {
   private static final Codec<class06348> u = class04206.q.T().dispatch(class06348::N, class06353::N);
   public static final Codec<class06348> N = Codec.lazyInitialized(
      () -> Codec.either(class06340.y, u).xmap(Either::unwrap, var0 -> var0 instanceof class06340 ? Either.left((class06340)var0) : Either.right(var0))
   );
   public static final class06353 y = N("fixed", class06329.N);
   public static final class06353 L = N("context", class06340.N);

   public class06332() {
      super();
   }

   private static class06353 N(String var0, MapCodec<? extends class06348> var1) {
      return class00751.N(class04206.q, class01894.y(var0), new class06353(var1));
   }
}
