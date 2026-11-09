package minecraft;

import Nursultan.class11651;
import Nursultan.class11652;
import Nursultan.class11654;
import java.util.HashMap;
import java.util.Map;

public class class08823 {
   private final Map<String, class11652> N = new HashMap<>();

   public class08823() {
      super();
   }

   public class08814 N() {
      return this.N.isEmpty() ? class08814.y : new class08814(Map.copyOf(this.N));
   }

   public class08823 N(String var1, class05913 var2) {
      this.N.put(var1, new class11651(var2));
      return this;
   }

   public class08823 N(String var1, String var2) {
      this.N.put(var1, new class11654(var2));
      return this;
   }
}
