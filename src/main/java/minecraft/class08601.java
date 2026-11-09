package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

@FunctionalInterface
interface class08601 extends Function<Typed<?>, Typed<?>> {
   default <T> Dynamic<T> N(Dynamic<T> var1) {
      return var1.get("minecraft:bucket_entity_data").result().map(var2 -> this.fixRemainder(var1, (Dynamic<T>)var2)).orElse(var1);
   }

   default Typed<?> apply(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::N);
   }

   <T> Dynamic<T> fixRemainder(Dynamic<T> var1, Dynamic<T> var2);
}
