package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class class06052 implements class03621 {
   private static final Codec<Either<Float, class06052>> N = Codec.either(Codec.FLOAT, class04206.K.T().dispatch(class06052::L, class06061::codec));
   public static final Codec<class06052> L = N.xmap(
      var0 -> (class06052)var0.map(class06042::N, var0x -> var0x), var0 -> var0.L() == class06061.N ? Either.left(((class06042)var0).u()) : Either.right(var0)
   );

   public abstract class06061<?> L();

   public class06052() {
      super();
   }

   public abstract float y();

   public abstract float N();

   public static Codec<class06052> N(float var0, float var1) {
      return L.validate(
         var2 -> {
            if (var2.N() < var0) {
               return DataResult.error(() -> "Value provider too low: " + var0 + " [" + var2.N() + "-" + var2.y() + "]");
            } else {
               return var2.y() > var1
                  ? DataResult.error(() -> "Value provider too high: " + var1 + " [" + var2.N() + "-" + var2.y() + "]")
                  : DataResult.success(var2);
            }
         }
      );
   }
}
