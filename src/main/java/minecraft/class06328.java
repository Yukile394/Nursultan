package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.function.Function;
import java.util.stream.Stream;

class class06328<E> extends MapCodec<E> {
   class06328(Function var1) {
      super();
      this.N = var1;
   }

   public String toString() {
      return "ContextRetrievalCodec[" + this.N + "]";
   }

   public <T> DataResult<E> decode(DynamicOps<T> var1, MapLike<T> var2) {
      return (DataResult<E>)this.N.apply(var1);
   }

   public <T> RecordBuilder<T> encode(E var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      return var3;
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Stream.empty();
   }
}
