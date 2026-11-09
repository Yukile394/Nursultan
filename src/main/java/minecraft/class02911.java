package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;

public class class02911 {
   final LoadingCache<class02908<?, ?>, DataResult<?>> N;

   public class02911(int var1) {
      super();
      this.N = CacheBuilder.newBuilder().maximumSize(var1).concurrencyLevel(1).softValues().build(new class02922(this));
   }

   public <A> Codec<A> N(Codec<A> var1) {
      return new class02931<>(this, var1);
   }
}
