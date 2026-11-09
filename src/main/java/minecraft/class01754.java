package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

class class01754<T> extends MapCodec<T> {
   private final Collection<MapCodec<? extends T>> N;
   private final Function<T, ? extends MapEncoder<? extends T>> y;

   public class01754(Collection<MapCodec<? extends T>> var1, Function<T, ? extends MapEncoder<? extends T>> var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public String toString() {
      return "FuzzyCodec[" + this.N + "]";
   }

   public <S> DataResult<T> decode(DynamicOps<S> var1, MapLike<S> var2) {
      Iterator iterator = this.N.iterator();

      while (iterator.hasNext()) {
         DataResult dataresult = ((MapDecoder)iterator.next()).decode(var1, var2);
         if (dataresult.result().isPresent()) {
            return dataresult;
         }
      }

      return DataResult.error(() -> "No matching codec found");
   }

   public <S> RecordBuilder<S> encode(T var1, DynamicOps<S> var2, RecordBuilder<S> var3) {
      return this.y.apply((T)var1).encode(var1, var2, var3);
   }

   public <S> Stream<S> keys(DynamicOps<S> var1) {
      return this.N.stream().flatMap(var1x -> var1x.keys(var1)).distinct();
   }
}
