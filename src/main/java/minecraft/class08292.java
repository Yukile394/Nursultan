package minecraft;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricProvidedTagBuilder;
import net.fabricmc.fabric.mixin.datagen.TagAppenderMixin;

public interface class08292<E, T> extends FabricProvidedTagBuilder, TagAppenderMixin {
   class08292<E, T> y(E var1);

   class08292<E, T> y(class03530<T> var1);

   class08292<E, T> N(class03530<T> var1);

   static <T> class08292<class05946<T>, T> N(class01225 var0) {
      return new class08322<>(var0);
   }

   default <U> class08292<U, T> N(Function<U, E> var1) {
      return new class08331<>(this, this, var1);
   }

   default class08292<E, T> N(E... var1) {
      return this.N((Stream<E>)Arrays.stream(var1));
   }

   default class08292<E, T> N(Collection<E> var1) {
      var1.forEach(this::N);
      return this;
   }

   default class08292<E, T> N(Stream<E> var1) {
      var1.forEach(this::N);
      return this;
   }

   class08292<E, T> N(E var1);
}
