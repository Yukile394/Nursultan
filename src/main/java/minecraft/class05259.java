package minecraft;

import java.util.Properties;
import java.util.function.Function;
import java.util.function.Supplier;

public class class05259 implements Supplier {
   private final String y;
   private final Object L;
   private final Function u;

   class05259(class05269 var1, String var2, Object var3, Function var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public Object get() {
      return this.L;
   }

   public class05269 N(class01042 var1, Object var2) {
      Properties properties = this.N.N();
      properties.put(this.y, this.u.apply(var2));
      return this.N.y(var1, properties);
   }
}
