package minecraft;

import Nursultan.class10213;
import com.mojang.datafixers.util.Either;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface class03556<T> {
   Stream<class03530<T>> L();

   default String M() {
      return this.i().map(var0 -> var0.N().toString()).orElse("[unregistered]");
   }

   Optional<class05946<T>> i();

   Either<class05946<T>, T> u();

   boolean y();

   boolean N(class01894 var1);

   T N();

   boolean N(class02042<T> var1);

   static <T> class03556<T> N(T var0) {
      return new class10213<>((T)var0);
   }

   boolean N(class03530<T> var1);

   @Deprecated
   boolean N(class03556<T> var1);

   boolean N(Predicate<class05946<T>> var1);

   boolean N(class05946<T> var1);

   class03535 R();
}
