package minecraft;

@FunctionalInterface
public interface class08536<T> {
   class03674 apply(class03674 var1, T var2);

   default class08503 N(T var1) {
      return var2 -> this.apply(var2, (T)var1);
   }
}
