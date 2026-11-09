package minecraft;

import Nursultan.class10783;
import java.util.Optional;

public class class07681<T> implements class01903<T> {
   public class07681(class10783 var1, class01921 var2) {
      super();
      this.N = var2;
   }

   @Override
   public class03552<T> y(class03530<T> var1) {
      return this.N().N(var1).orElseGet(() -> class03543.N(this.N(), var1));
   }

   @Override
   public class01921<T> N() {
      return this.N;
   }

   @Override
   public Optional<class03552<T>> N(class03530<T> var1) {
      return Optional.of(this.y(var1));
   }
}
