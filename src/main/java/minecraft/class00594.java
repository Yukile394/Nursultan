package minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.LongSupplier;

public class class00594 {
   private final Map<class00607<?>, List<class07603<?>>> N = new HashMap<>();

   class00594() {
      super();
   }

   public class00594 N(class03556<class07587> var1, LongSupplier var2) {
      for (class00607<?> class00607 : ((class07587)var1.N()).L()) {
         this.N(var1, class00607, var2);
      }

      return this;
   }

   private <Value> class00594 N(class00607<Value> var1, class07603<Value> var2) {
      this.N.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(var2);
      return this;
   }

   private <Value> void N(class03556<class07587> var1, class00607<Value> var2, LongSupplier var3) {
      this.N(var2, ((class07587)var1.N()).N(var2, var3));
   }

   public class00616 N() {
      return new class00616(this.N);
   }

   public class00594 N(class07299 var1) {
      class00616.N(this, var1);
      return this;
   }

   public class00594 N(class00587 var1) {
      for (class00607<?> class00607 : var1.y()) {
         this.N(class00607, var1);
      }

      return this;
   }

   private <Value> class00594 N(class00607<Value> var1, class00587 var2) {
      class00599 class00599 = var2.N(var1);
      if (class00599 == null) {
         throw new IllegalArgumentException("Missing attribute " + var1);
      } else {
         return this.N(var1, class00599::N);
      }
   }
}
