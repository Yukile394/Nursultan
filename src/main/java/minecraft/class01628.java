package minecraft;

import java.util.function.Function;

public class class01628<T> implements class04298<T> {
   private final Function<class07209, class04327<T>> N;

   public class01628(Function<class07209, class04327<T>> var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean y(class07209 var1, T var2) {
      return false;
   }

   @Override
   public int N() {
      return 0;
   }

   @Override
   public void N(class04309<T> var1) {
      this.N.apply(var1.y()).N(var1);
   }

   @Override
   public boolean N(class07209 var1, T var2) {
      return this.N.apply(var1).N(var1, (T)var2);
   }
}
