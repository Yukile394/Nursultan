package minecraft;

public interface class04383<T> {
   default class02131<T> N(int var1) {
      return new class02131<>(var1, this);
   }

   static <T> class04383<T> N(class02362<? super class04247, T> var0) {
      return () -> var0;
   }

   T method_12714(T var1);

   class02362<? super class04247, T> codec();
}
