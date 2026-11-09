package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.codecs.BaseMapCodec;
import java.util.Map;
import java.util.Optional;

public record class06330<K, V>(Codec<K> keyCodec, Codec<V> elementCodec) implements Codec<Map<K, V>>, BaseMapCodec<K, V> {
   public class06330(Codec<K> keyCodec, Codec<V> elementCodec) {
      this.keyCodec = keyCodec;
      this.elementCodec = elementCodec;
   }

   @Override
   public String toString() {
      return "StrictUnboundedMapCodec[" + this.keyCodec + " -> " + this.elementCodec + "]";
   }

   public <T> DataResult<Map<K, V>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      Builder builder = ImmutableMap.builder();

      for (Pair pair : var2.entries().toList()) {
         DataResult dataresult = this.keyCodec().parse(var1, pair.getFirst());
         DataResult dataresult1 = this.elementCodec().parse(var1, pair.getSecond());
         DataResult dataresult2 = dataresult.apply2stable(Pair::of, dataresult1);
         Optional optional = dataresult2.error();
         if (optional.isPresent()) {
            String s = ((Error)optional.get()).message();
            return DataResult.error(() -> dataresult.result().isPresent() ? "Map entry '" + dataresult.result().get() + "' : " + s : s);
         }

         if (!dataresult2.result().isPresent()) {
            return DataResult.error(() -> "Empty or invalid map contents are not allowed");
         }

         Pair pair1 = (Pair)dataresult2.result().get();
         builder.put(pair1.getFirst(), pair1.getSecond());
      }

      ImmutableMap immutablemap = builder.build();
      return DataResult.success(immutablemap);
   }

   public <T> DataResult<Pair<Map<K, V>, T>> decode(DynamicOps<T> var1, T var2) {
      return var1.getMap(var2).setLifecycle(Lifecycle.stable()).flatMap(var2x -> this.decode(var1, var2x)).map(var1x -> Pair.of(var1x, var2));
   }

   public <T> DataResult<T> encode(Map<K, V> var1, DynamicOps<T> var2, T var3) {
      return this.encode(var1, var2, var2.mapBuilder()).build(var3);
   }
}
