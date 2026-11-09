package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class class06339 {
   private static final Codec<class06378> B = class04206.J.T().dispatch(class06378::N, class06341::N);
   public static final Codec<class06378> N = Codec.lazyInitialized(
      () -> {
         Codec<class06378> codec = Codec.withAlternative(B, class06345.N.codec());
         return Codec.either(class04711.y, codec)
            .xmap(Either::unwrap, var0x -> var0x instanceof class04711 ? Either.left((class04711)var0x) : Either.right(var0x));
      }
   );
   public static final class06341 y = N("constant", class04711.N);
   public static final class06341 L = N("uniform", class06345.N);
   public static final class06341 u = N("binomial", class06142.N);
   public static final class06341 i = N("score", class06362.N);
   public static final class06341 R = N("storage", class02183.N);
   public static final class06341 M = N("enchantment_level", class02226.N);

   public class06339() {
      super();
   }

   private static class06341 N(String var0, MapCodec<? extends class06378> var1) {
      return class00751.N(class04206.J, class01894.y(var0), new class06341(var1));
   }
}
