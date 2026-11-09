package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Codec.ResultFunction;
import org.apache.commons.lang3.mutable.MutableObject;

class class06349<A> implements ResultFunction<A> {
   class06349(Object var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return "OrElsePartial[" + this.N + "]";
   }

   public <T> DataResult<Pair<A, T>> apply(DynamicOps<T> var1, T var2, DataResult<Pair<A, T>> var3) {
      MutableObject mutableobject = new MutableObject();
      return var3.resultOrPartial(mutableobject::setValue).isPresent()
         ? var3
         : DataResult.error(() -> "(" + (String)mutableobject.get() + " -> using default)", Pair.of(this.N, var2));
   }

   public <T> DataResult<T> coApply(DynamicOps<T> var1, A var2, DataResult<T> var3) {
      return var3;
   }
}
