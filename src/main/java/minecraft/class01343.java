package minecraft;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

@FunctionalInterface
public interface class01343 {
   class05428 get(class00891 var1);

   default class01343 N(Consumer<class05388> var1) {
      return var2 -> this.get(var2).N(var1);
   }

   default class01894 N(class00891 var1, String var2, BiConsumer<class01894, class08819> var3) {
      return this.get(var1).N(var1, var2, var3);
   }

   default class01894 N(class00891 var1, BiConsumer<class01894, class08819> var2) {
      return this.get(var1).N(var1, var2);
   }
}
