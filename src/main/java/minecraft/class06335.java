package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.stream.Stream;

class class06335<E> extends MapCodec<E> {
   class06335(MapCodec var1, MapCodec var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public String toString() {
      return this.y + " orCompressed " + this.N;
   }

   public <T> DataResult<E> decode(DynamicOps<T> var1, MapLike<T> var2) {
      return var1.compressMaps() ? this.N.decode(var1, var2) : this.y.decode(var1, var2);
   }

   public <T> RecordBuilder<T> encode(E var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      return var2.compressMaps() ? this.N.encode(var1, var2, var3) : this.y.encode(var1, var2, var3);
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return this.N.keys(var1);
   }
}
