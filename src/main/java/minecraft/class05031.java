package minecraft;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class05031<E extends Enum<E> & class05033> extends class04997<E> {
   private final Function<String, E> N;

   public class05031(E[] var1, Function<String, E> var2) {
      super((E[])var1, var2, var0 -> var0.ordinal());
      this.N = var2;
   }

   public E N(String var1, Supplier<? extends E> var2) {
      return Objects.requireNonNullElseGet(this.N(var1), var2);
   }

   public E N(String var1, E var2) {
      return Objects.requireNonNullElse(this.N(var1), (E)var2);
   }

   @Nullable
   public E N(String var1) {
      return this.N.apply(var1);
   }
}
