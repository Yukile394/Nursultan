package minecraft;

import java.util.Optional;
import java.util.function.LongSupplier;
import org.jspecify.annotations.Nullable;

public class class07576<Value, Argument> implements class07601<Value> {
   private final class00619<Value, Argument> N;
   private final class07592<Argument> y;
   private final LongSupplier L;
   private int u;
   @Nullable
   private Argument i;

   public class07576(Optional<Integer> var1, class00619<Value, Argument> var2, class07606<Argument> var3, class00610<Argument> var4, LongSupplier var5) {
      super();
      this.N = var2;
      this.L = var5;
      this.y = var3.N(var1, var4);
   }

   @Override
   public Value applyTimeBased(Value var1, int var2) {
      if (this.i == null || var2 != this.u) {
         this.u = var2;
         this.i = this.y.N(this.L.getAsLong());
      }

      return this.N.apply((Value)var1, this.i);
   }
}
