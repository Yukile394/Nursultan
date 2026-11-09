package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class class06500 implements Consumer<class06521<?>> {
   final class05946<class00263> N;
   private final class06528 y;
   private final List<class06510> L = new ArrayList<>();

   protected class06500(class05946<class00263> var1, class06528 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public void accept(class06521<?> var1) {
      this.y.apply(var1).ifPresent(this.L::add);
   }

   public class00263 N(class03767 var1) {
      return class00263.N(class06482.N(var1, this.L));
   }
}
