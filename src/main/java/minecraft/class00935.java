package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class class00935 {
   static final class05247 N = class05247.N(8.0F);
   final class08626 y;
   final class03504 L;
   private final class08985 u;
   private final Map<class01894, class08985> i = new HashMap<>();
   private final Function<class01894, class08985> R;

   public class00935(class08626 var1) {
      super();
      this.y = var1;
      this.L = class03504.y(var1.i());
      class08388 class08388 = var1.L();
      this.u = this.N(class08388);
      this.R = var3 -> {
         class08388 class08388x = var1.N(var3);
         return class08388x == class08388 ? this.u : this.N(class08388x);
      };
   }

   public class08985 N(class01894 var1) {
      return this.i.computeIfAbsent(var1, this.R);
   }

   private class08985 N(class08388 var1) {
      return new class00910(new class00924(this, var1));
   }
}
