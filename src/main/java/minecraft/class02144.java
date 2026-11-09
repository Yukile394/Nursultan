package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

class class02144<E> implements Codec<class02134<E>> {
   class02144(Codec var1) {
      super();
      this.N = var1;
   }

   public <T> DataResult<Pair<class02134<E>, T>> decode(DynamicOps<T> var1, T var2) {
      Dynamic dynamic = new Dynamic(var1, var2);
      return dynamic.get("data")
         .flatMap(this.N::parse)
         .map(var1x -> new class02134<>(var1x, dynamic.get("weight").asInt(1)))
         .map(var1x -> Pair.of(var1x, var1.empty()));
   }

   public <T> DataResult<T> encode(class02134<E> var1, DynamicOps<T> var2, T var3) {
      return var2.mapBuilder().add("weight", var2.createInt(var1.y)).add("data", this.N.encodeStart(var2, var1.N)).build(var3);
   }
}
