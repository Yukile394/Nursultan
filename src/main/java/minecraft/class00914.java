package minecraft;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class class00914 implements class04188 {
   public static final class04159 N = new class04159("server_code_of_conduct");
   private final Supplier<String> y;

   public class00914(Supplier<String> var1) {
      super();
      this.y = var1;
   }

   @Override
   public class04159 method_52375() {
      return N;
   }

   @Override
   public void method_52376(Consumer<class00381<?>> var1) {
      var1.accept(new class00927(this.y.get()));
   }
}
