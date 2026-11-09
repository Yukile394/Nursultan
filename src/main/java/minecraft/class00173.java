package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.ListBuilder;
import java.util.function.UnaryOperator;

abstract class class00173<T, B> implements ListBuilder<T> {
   private final DynamicOps<T> y;
   protected DataResult<B> N = DataResult.success(this.N(), Lifecycle.stable());

   protected class00173(DynamicOps<T> var1) {
      super();
      this.y = var1;
   }

   public ListBuilder<T> add(DataResult<T> var1) {
      this.N = this.N.apply2stable(this::N, var1);
      return this;
   }

   public ListBuilder<T> add(T var1) {
      this.N = this.N.map(var2 -> this.N((B)var2, (T)var1));
      return this;
   }

   protected abstract DataResult<T> y(B var1, T var2);

   public DataResult<T> build(T var1) {
      DataResult dataresult = this.N.flatMap(var2x -> this.y((B)var2x, (T)var1));
      this.N = DataResult.success(this.N(), Lifecycle.stable());
      return dataresult;
   }

   protected abstract B N(B var1, T var2);

   protected abstract B N();

   public DynamicOps<T> ops() {
      return this.y;
   }

   public ListBuilder<T> withErrorsFrom(DataResult<?> var1) {
      this.N = this.N.flatMap(var1x -> var1.map(var1xx -> var1x));
      return this;
   }

   public ListBuilder<T> mapError(UnaryOperator<String> var1) {
      this.N = this.N.mapError(var1);
      return this;
   }
}
