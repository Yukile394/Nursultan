package minecraft;

import java.util.function.Supplier;

final class class04110<E extends class07438, A> extends class04137<E, A> {
   class04110(A var1) {
      this((A)var1, () -> "C[" + var1 + "]");
   }

   class04110(A var1, Supplier<String> var2) {
      super(new class04135<>(var1, var2));
   }
}
