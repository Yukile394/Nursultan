package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public abstract class class03855 {
   private static final Codec<Either<class06055, class03855>> N = Codec.either(class06055.N, class04206.e.T().dispatch(class03855::N, class03862::codec));
   public static final Codec<class03855> L = N.xmap(
      var0 -> (class03855)var0.map(class03850::N, var0x -> var0x), var0 -> var0.N() == class03862.N ? Either.left(((class03850)var0).y()) : Either.right(var0)
   );

   public class03855() {
      super();
   }

   public abstract int N(class06069 var1, class06057 var2);

   public abstract class03862<?> N();
}
