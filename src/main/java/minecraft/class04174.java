package minecraft;

import java.util.Optional;
import java.util.function.Consumer;

public class class04174 implements class04188 {
   public static final class04159 N = new class04159("server_resource_pack");
   private final class02794 y;

   public class04174(class02794 var1) {
      super();
      this.y = var1;
   }

   @Override
   public class04159 method_52375() {
      return N;
   }

   @Override
   public void method_52376(Consumer<class00381<?>> var1) {
      var1.accept(new class06666(this.y.N(), this.y.y(), this.y.L(), this.y.u(), Optional.ofNullable(this.y.i())));
   }
}
