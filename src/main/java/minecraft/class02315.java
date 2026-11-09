package minecraft;

import java.util.List;

public interface class02315<S> {
   static <S> class02315<S> L() {
      return new class02310<>();
   }

   static <S> class02315<S> L(class02315<S> var0) {
      return new class02327<>(var0, false);
   }

   static <S> class02315<S> u() {
      return new class02340<>();
   }

   static <S> class02315<S> y(class02315<S> var0) {
      return new class02327<>(var0, true);
   }

   static <S, T> class02315<S> y(class08501<S, T> var0, class02353<List<T>> var1, class02315<S> var2, int var3) {
      return new class02313<>(var0, var1, var2, var3, false);
   }

   static <S, T> class02315<S> y(class08501<S, T> var0, class02353<List<T>> var1, class02315<S> var2) {
      return y(var0, var1, var2, 0);
   }

   @SafeVarargs
   static <S> class02315<S> y(class02315<S>... var0) {
      return new class02342<>(var0);
   }

   static <S, T> class02315<S> N(class08501<S, T> var0, class02353<List<T>> var1, class02315<S> var2, int var3) {
      return new class02313<>(var0, var1, var2, var3, true);
   }

   static <S> class02315<S> N(Object var0) {
      return new class02312<>(var0);
   }

   static <S> class02315<S> N(class02315<S> var0) {
      return new class02171<>(var0);
   }

   @SafeVarargs
   static <S> class02315<S> N(class02315<S>... var0) {
      return new class02200<>(var0);
   }

   static <S, T> class02315<S> N(class02353<T> var0, T var1) {
      return new class02352<>(var0, var1);
   }

   boolean N(class02325<S> var1, class02332 var2, class02328 var3);

   static <S, T> class02315<S> N(class08501<S, T> var0, class02353<List<T>> var1) {
      return N(var0, var1, 0);
   }

   static <S, T> class02315<S> N(class08501<S, T> var0, class02353<List<T>> var1, int var2) {
      return new class02358<>(var0, var1, var2);
   }

   static <S, T> class02315<S> N(class08501<S, T> var0, class02353<List<T>> var1, class02315<S> var2) {
      return N(var0, var1, var2, 0);
   }
}
