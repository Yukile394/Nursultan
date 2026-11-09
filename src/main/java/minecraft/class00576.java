package minecraft;

import java.util.HashMap;
import java.util.Map;

public class class00576 {
   private final Map<class00607<?>, class00599<?, ?>> N = new HashMap<>();

   class00576() {
      super();
   }

   public class00587 N() {
      return this.N.isEmpty() ? class00587.N : new class00587(Map.copyOf(this.N));
   }

   public <Value> class00576 N(class00607<Value> var1, Value var2) {
      return this.N(var1, class00619.N(), var2);
   }

   public <Value, Parameter> class00576 N(class00607<Value> var1, class00619<Value, Parameter> var2, Parameter var3) {
      var1.N().N(var2);
      this.N.put(var1, new class00599<>(var3, var2));
      return this;
   }

   public class00576 N(class00587 var1) {
      this.N.putAll(var1.i);
      return this;
   }
}
