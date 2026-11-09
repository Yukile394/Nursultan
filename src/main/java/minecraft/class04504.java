package minecraft;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

class class04504 implements class04488 {
   class04504(List var1) {
      super();
      this.y = var1;
   }

   @Override
   public List<class08036> N(class04782 var1, Predicate<? super class08036> var2) {
      return this.y.stream().filter(var2).toList();
   }

   @Override
   public <T extends class07049> List<T> N(class04782 var1, class01128<class07049, T> var2, class00734 var3, Predicate<? super T> var4) {
      return this.y.stream().map(var2::N).filter(Objects::nonNull).filter(var4).toList();
   }
}
