package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class class04997<S extends class05033> implements Codec<S> {
   private final Codec<S> N;

   public class04997(S[] var1, Function<String, S> var2, ToIntFunction<S> var3) {
      super();
      this.N = class06338.N(
         Codec.stringResolver(class05033::method_15434, var2), class06338.N(var3, var1x -> (S)(var1x >= 0 && var1x < var1.length ? var1[var1x] : null), -1)
      );
   }

   public <T> DataResult<Pair<S, T>> decode(DynamicOps<T> var1, T var2) {
      return this.N.decode(var1, var2);
   }

   public <T> DataResult<T> encode(S var1, DynamicOps<T> var2, T var3) {
      return this.N.encode(var1, var2, var3);
   }
}
