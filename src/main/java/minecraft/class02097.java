package minecraft;

import java.util.function.Consumer;

@FunctionalInterface
public interface class02097 {
   class02097 N = (var0, var1) -> {};

   default class02097 N(Consumer<class02104> var1) {
      return (var2, var3) -> this.send(var2, var2x -> {
         var3.accept(var2x);
         var1.accept(var2x);
      });
   }

   void send(class02129 var1, Consumer<class02104> var2);
}
