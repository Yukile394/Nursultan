package minecraft;

import java.util.stream.Stream;

public class class00443 implements class07380 {
   private final class05623 N;
   private final class07305 y;
   private final class07932 L;

   public class00443(class05623 var1, class07932 var2) {
      super();
      this.N = var1;
      this.y = var1.yn().m();
      this.L = var2;
   }

   @Override
   public <T> T N(class06839<T> var1) {
      return this.y.N(var1);
   }

   @Override
   public Stream<class06839<?>> N() {
      return this.y.N();
   }

   @Override
   public <T> class07423<T> N(class06839<T> var1, T var2) {
      return new class07423<>(var1, (T)var2);
   }

   @Override
   public <T> class07423<T> N(class07423<T> var1, class07403 var2) {
      class06839 class06839 = var1.N();
      Object object = this.y.N(class06839);
      Object object1 = var1.y();
      this.y.N(class06839, object1, this.N);
      this.L.N(var2, "Game rule '{}' updated from '{}' to '{}'", class06839.N(), class06839.N(object), class06839.N(object1));
      return var1;
   }
}
