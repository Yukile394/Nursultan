package minecraft;

import java.util.Objects;

@FunctionalInterface
public interface class01036 {
   boolean test(char var1);

   default class01036 y(class01036 var1) {
      Objects.requireNonNull(var1);
      return var2 -> this.test(var2) || var1.test(var2);
   }

   default class01036 N(class01036 var1) {
      Objects.requireNonNull(var1);
      return var2 -> this.test(var2) && var1.test(var2);
   }

   default class01036 N() {
      return var1 -> !this.test(var1);
   }
}
