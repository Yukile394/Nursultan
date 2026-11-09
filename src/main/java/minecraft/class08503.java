package minecraft;

import java.util.function.UnaryOperator;

@FunctionalInterface
public interface class08503 extends UnaryOperator<class03674> {
   class08536<class08511> N = class03674::N;
   class08536<class08511> y = class03674::y;
   class08536<class08511> L = class03674::L;
   class08536<class01894> u = class03674::N;
   class08536<Boolean> i = class03674::N;

   default class08503 N(class08503 var1) {
      return var2 -> var1.apply(this.apply(var2));
   }
}
