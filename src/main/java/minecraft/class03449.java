package minecraft;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface class03449 {
   class03449 y = (var0, var1) -> false;
   class03449 L = (var0, var1) -> true;

   boolean expand(class05908 var1, Consumer<class03599> var2);

   default class03449 y(class03449 var1) {
      Objects.requireNonNull(var1);
      return (var2, var3) -> this.expand(var2, var3) || var1.expand(var2, var3);
   }

   default class03449 N(class03449 var1) {
      Objects.requireNonNull(var1);
      return (var2, var3) -> this.expand(var2, var3) && var1.expand(var2, var3);
   }
}
