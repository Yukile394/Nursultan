package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;

class class06351<A> implements Decoder<A> {
   class06351(Codec var1) {
      super();
      this.N = var1;
   }

   public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
      try {
         return this.N.decode(var1, var2);
      } catch (Exception exception) {
         return DataResult.error(() -> "Caught exception decoding " + var2 + ": " + exception.getMessage());
      }
   }
}
