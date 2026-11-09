package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;

class class06358<E> implements Codec<E> {
   class06358(Codec var1, Codec var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public String toString() {
      return this.y + " orCompressed " + this.N;
   }

   public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> var1, T var2) {
      return var1.compressMaps() ? this.N.decode(var1, var2) : this.y.decode(var1, var2);
   }

   public <T> DataResult<T> encode(E var1, DynamicOps<T> var2, T var3) {
      return var2.compressMaps() ? this.N.encode(var1, var2, var3) : this.y.encode(var1, var2, var3);
   }
}
