package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

class class06980<V> {
   final class06976<class07321, V> N = new class06976<>();
   final class06976<class07209, V> y = new class06976<>();
   final class06976<UUID, V> L = new class06976<>();
   final List<class06986<V>> u = new ArrayList<>();

   class06980() {
      super();
   }

   public void N(class07321 var1) {
      this.N.N(var1);
      this.y.y(var1::y);
   }

   public void N(long var1) {
      Predicate predicate = var2 -> var2.N(var1);
      this.N.N(predicate);
      this.y.N(predicate);
      this.L.N(predicate);
      this.u.removeIf(predicate);
   }
}
