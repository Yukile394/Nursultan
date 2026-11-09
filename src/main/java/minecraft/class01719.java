package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.stream.Stream;

class class01719<T> extends MapCodec<T> {
   private final String N;
   private final MapCodec<T> y;
   private final MapCodec<T> L;

   public class01719(String var1, MapCodec<T> var2, MapCodec<T> var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public <O> DataResult<T> decode(DynamicOps<O> var1, MapLike<O> var2) {
      return var2.get(this.N) != null ? this.y.decode(var1, var2) : this.L.decode(var1, var2);
   }

   public <O> RecordBuilder<O> encode(T var1, DynamicOps<O> var2, RecordBuilder<O> var3) {
      return this.L.encode(var1, var2, var3);
   }

   public <T1> Stream<T1> keys(DynamicOps<T1> var1) {
      return Stream.concat(this.y.keys(var1), this.L.keys(var1)).distinct();
   }
}
