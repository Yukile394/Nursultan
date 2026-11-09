package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class class04821 {
   private static final Codec<class04794> u = class04206.o.T().dispatch(class04794::N, class04837::N);
   public static final Codec<class04794> N = Codec.lazyInitialized(
      () -> Codec.either(class04791.y, u).xmap(Either::unwrap, var0 -> var0 instanceof class04791 ? Either.left((class04791)var0) : Either.right(var0))
   );
   public static final class04837 y = N("storage", class04831.N);
   public static final class04837 L = N("context", class04791.N);

   public class04821() {
      super();
   }

   private static class04837 N(String var0, MapCodec<? extends class04794> var1) {
      return class00751.N(class04206.o, class01894.y(var0), new class04837(var1));
   }
}
