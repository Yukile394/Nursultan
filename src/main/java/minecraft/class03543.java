package minecraft;

import Nursultan.class10210;
import com.mojang.datafixers.util.Either;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public interface class03543<T> extends Iterable<class03556<T>> {
   boolean L();

   Optional<class03530<T>> i();

   Either<class03530<T>, List<class03556<T>>> u();

   int y();

   @SafeVarargs
   static <T> class03522<T> N(class03556<T>... var0) {
      return new class03522<>(List.of(var0));
   }

   @Deprecated
   static <T> class03552<T> N(class02042<T> var0, class03530<T> var1) {
      return new class10210<>(var0, var1);
   }

   static <E, T> class03522<T> N(Function<E, class03556<T>> var0, Collection<E> var1) {
      return N(var1.stream().map(var0).toList());
   }

   static <T> class03522<T> N(List<? extends class03556<T>> var0) {
      return new class03522<>(List.copyOf(var0));
   }

   @SafeVarargs
   static <E, T> class03522<T> N(Function<E, class03556<T>> var0, E... var1) {
      return N(Stream.of(var1).map(var0).toList());
   }

   Stream<class03556<T>> N();

   Optional<class03556<T>> N(class06069 var1);

   class03556<T> N(int var1);

   boolean N(class03556<T> var1);

   boolean N(class02042<T> var1);

   static <T> class03543<T> R() {
      return (class03543<T>)class03522.N;
   }
}
