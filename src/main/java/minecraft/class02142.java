package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public abstract class class02142 {
   private static final Codec<Either<Integer, class02142>> N = Codec.either(Codec.INT, class04206.V.T().dispatch(class02142::u, class02139::codec));
   public static final Codec<class02142> L = N.xmap(
      var0 -> (class02142)var0.map(class02151::N, var0x -> var0x), var0 -> var0.u() == class02139.N ? Either.left(((class02151)var0).N()) : Either.right(var0)
   );
   public static final Codec<class02142> u = N(0, Integer.MAX_VALUE);
   public static final Codec<class02142> i = N(1, Integer.MAX_VALUE);

   public abstract int L();

   public class02142() {
      super();
   }

   public abstract class02139<?> u();

   public abstract int y();

   public abstract int N(class06069 var1);

   private static <T extends class02142> DataResult<T> N(int var0, int var1, T var2) {
      if (var2.y() < var0) {
         return DataResult.error(() -> "Value provider too low: " + var0 + " [" + var2.y() + "-" + var2.L() + "]");
      } else {
         return var2.L() > var1
            ? DataResult.error(() -> "Value provider too high: " + var1 + " [" + var2.y() + "-" + var2.L() + "]")
            : DataResult.success(var2);
      }
   }

   public static <T extends class02142> Codec<T> N(int var0, int var1, Codec<T> var2) {
      return var2.validate(var2x -> N(var0, var1, var2x));
   }

   public static Codec<class02142> N(int var0, int var1) {
      return N(var0, var1, L);
   }
}
