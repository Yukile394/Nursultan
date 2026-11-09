package minecraft;

import java.util.function.Supplier;
import javax.management.MBeanAttributeInfo;

final class class05072 {
   final String N;
   final Supplier<Object> y;
   private final String L;
   private final Class<?> u;

   class05072(String var1, Supplier<Object> var2, String var3, Class<?> var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public MBeanAttributeInfo N() {
      return new MBeanAttributeInfo(this.N, this.u.getSimpleName(), this.L, true, false, false);
   }
}
