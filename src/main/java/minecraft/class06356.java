package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.Codec.ResultFunction;
import java.util.function.Function;

class class06356<E> implements ResultFunction<E> {
   class06356(Function var1, Function var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public String toString() {
      return "WithLifecycle[" + this.N + " " + this.y + "]";
   }

   public <T> DataResult<Pair<E, T>> apply(DynamicOps<T> var1, T var2, DataResult<Pair<E, T>> var3) {
      return var3.result().map(var2x -> var3.setLifecycle((Lifecycle)var1x.apply(var2x.getFirst()))).orElse(var3);
   }

   public <T> DataResult<T> coApply(DynamicOps<T> var1, E var2, DataResult<T> var3) {
      return var3.setLifecycle((Lifecycle)this.y.apply(var2));
   }
}
