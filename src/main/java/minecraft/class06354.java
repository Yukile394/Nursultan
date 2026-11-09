package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

class class06354<V> extends MapCodec<V> {
   class06354(String var1, String var2, Codec var3, Function var4, Function var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }

   public <T> DataResult<V> decode(DynamicOps<T> var1, MapLike<T> var2) {
      Object object = var2.get(this.N);
      return object == null ? DataResult.error(() -> "Missing \"" + var0 + "\" in: " + var2) : this.L.decode(var1, object).flatMap(var4 -> {
         Object object1 = Objects.requireNonNullElseGet(var2.get(var1x), var1::emptyMap);
         return ((Codec)var3x.apply(var4.getFirst())).decode(var1, object1).map(Pair::getFirst);
      });
   }

   public <T> RecordBuilder<T> encode(V var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      Object object = this.i.apply(var1);
      var3.add(this.N, this.L.encodeStart(var2, object));
      DataResult dataresult = this.N((Codec)this.u.apply(object), (V)var1, var2);
      if (dataresult.result().isEmpty() || !Objects.equals(dataresult.result().get(), var2.emptyMap())) {
         var3.add(this.y, dataresult);
      }

      return var3;
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Stream.of((T[])(new Object[]{var1.createString(this.N), var1.createString(this.y)}));
   }

   private <T, V2 extends V> DataResult<T> N(Codec<V2> var1, V var2, DynamicOps<T> var3) {
      return var1.encodeStart(var3, var2);
   }
}
