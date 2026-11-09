package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Optional;

record class01428(String name, class01426 valueMatcher) {
   public static final class02362<ByteBuf, class01428> N = class02362.N(class02389.s, class01428::N, class01426.u, class01428::y, class01428::new);

   class01428(String name, class01426 valueMatcher) {
      super();
      this.name = name;
      this.valueMatcher = valueMatcher;
   }

   public class01426 y() {
      return this.valueMatcher;
   }

   public Optional<String> N(class00507<?, ?> var1) {
      return var1.N(this.name) != null ? Optional.empty() : Optional.of(this.name);
   }

   public <S extends class00522<?, S>> boolean N(class00507<?, S> var1, S var2) {
      class08092<?> class08092 = var1.N(this.name);
      return class08092 != null && this.valueMatcher.N(var2, class08092);
   }

   public String N() {
      return this.name;
   }
}
