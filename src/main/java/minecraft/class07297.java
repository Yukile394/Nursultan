package minecraft;

import java.util.function.Function;

public interface class07297<T extends class07297<T>> {
   T M();

   T y(class05952 var1);

   default <E> T a_(Iterable<E> var1, Function<E, class05952> var2) {
      class07297 class07297 = this.M();

      for (Object object : var1) {
         class07297 = class07297.y((class05952)var2.apply(object));
      }

      return (T)class07297;
   }
}
