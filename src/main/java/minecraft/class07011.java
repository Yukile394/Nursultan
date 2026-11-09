package minecraft;

import java.util.Objects;

public class class07011 implements class08292<class00891, class00891> {
   private final class08292<class06581, class06581> N;

   private static class03530<class06581> L(class03530<class00891> var0) {
      return class03530.N(class04227.F, var0.y());
   }

   public class07011(class08292<class06581, class06581> var1) {
      super();
      this.N = var1;
   }

   @Override
   public class08292<class00891, class00891> y(class03530<class00891> var1) {
      this.N.y(L(var1));
      return this;
   }

   public class08292<class00891, class00891> y(class00891 var1) {
      this.N.y(Objects.requireNonNull(var1.B()));
      return this;
   }

   @Override
   public class08292<class00891, class00891> N(class03530<class00891> var1) {
      this.N.N(L(var1));
      return this;
   }

   public class08292<class00891, class00891> N(class00891 var1) {
      this.N.N(Objects.requireNonNull(var1.B()));
      return this;
   }
}
