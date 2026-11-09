package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;

class class02931<A> implements Codec<A> {
   class02931(class02911 var1, Codec var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
      return this.N.decode(var1, var2);
   }

   public <T> DataResult<T> encode(A var1, DynamicOps<T> var2, T var3) {
      return ((DataResult)this.y.N.getUnchecked(new class02908<>(this.N, var1, var2))).map(var0 -> var0 instanceof class07709 ? ((class07709)var0).N() : var0);
   }
}
