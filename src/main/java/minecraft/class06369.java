package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import java.util.Optional;

class class06369<A> implements Codec<Optional<A>> {
   class06369(Codec var1) {
      super();
      this.N = var1;
   }

   public <T> DataResult<Pair<Optional<A>, T>> decode(DynamicOps<T> var1, T var2) {
      return N(var1, var2) ? DataResult.success(Pair.of(Optional.empty(), var2)) : this.N.decode(var1, var2).map(var0 -> var0.mapFirst(Optional::of));
   }

   public <T> DataResult<T> encode(Optional<A> var1, DynamicOps<T> var2, T var3) {
      return var1.isEmpty() ? DataResult.success(var2.emptyMap()) : this.N.encode(var1.get(), var2, var3);
   }

   private static <T> boolean N(DynamicOps<T> var0, T var1) {
      Optional optional = var0.getMap(var1).result();
      return optional.isPresent() && ((MapLike)optional.get()).entries().findAny().isEmpty();
   }
}
