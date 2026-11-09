package minecraft;

import java.util.List;
import java.util.function.Predicate;

public interface class04488 {
   class04488 N = new class04496();

   List<? extends class08036> N(class04782 var1, Predicate<? super class08036> var2);

   static class04488 N(List<class08036> var0) {
      return new class04504(var0);
   }

   static class04488 N(class08036 var0) {
      return N(List.of(var0));
   }

   <T extends class07049> List<T> N(class04782 var1, class01128<class07049, T> var2, class00734 var3, Predicate<? super T> var4);
}
