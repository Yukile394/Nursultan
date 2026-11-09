package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public interface class02477<T> {
   Codec<class02477<?>> N = Codec.lazyInitialized(() -> class04206.NW.T());
   class02362<class04247, class02477<?>> y = class02362.N_32(var0 -> class02389.N(class04227.b));
   Codec<class02477<?>> L = N.validate(
      var0 -> var0.u() ? DataResult.error(() -> "Encountered transient component " + class04206.NW.y(var0)) : DataResult.success(var0)
   );
   Codec<Map<class02477<?>, Object>> u = Codec.dispatchedMap(L, class02477::L);

   default Codec<T> L() {
      Codec codec = this.y();
      if (codec == null) {
         throw new IllegalStateException(this + " is not a persistent component");
      } else {
         return codec;
      }
   }

   boolean i();

   default boolean u() {
      return this.y() == null;
   }

   @Nullable
   Codec<T> y();

   static <T> class02472<T> N() {
      return new class02472<>();
   }

   class02362<? super class04247, T> R();
}
