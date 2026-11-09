package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.function.Consumer;

public record class04780(class07209 position, Either<Consumer<class03291>, class03291> generator) {
   public Either<Consumer<class03291>, class03291> L() {
      return this.generator;
   }

   public class04780(class07209 var1, Consumer<class03291> var2) {
      this(var1, Either.left(var2));
   }

   public class04780(class07209 position, Either<Consumer<class03291>, class03291> generator) {
      super();
      this.position = position;
      this.generator = generator;
   }

   public class07209 y() {
      return this.position;
   }

   public class03291 N() {
      return (class03291)this.generator.map(var0 -> {
         class03291 class03291 = new class03291();
         var0.accept(class03291);
         return class03291;
      }, var0 -> var0);
   }
}
