package minecraft;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class class08860 implements class02028 {
   private final class02601 y;
   private final class02012 L;
   private final class08881 u;
   private final Map<class02006<Object>, Object> i;
   private final Function<class02006<Object>, Object> R;

   @Override
   public class02012 L() {
      return this.L;
   }

   class08860(class08874 var1, class02601 var2, class02012 var3, class08881 var4) {
      super();
      this.N = var1;
      this.i = new ConcurrentHashMap<>();
      this.R = var1x -> var1x.y(this);
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public class02601 y() {
      return this.y;
   }

   @Override
   public class08529 N(class01894 var1) {
      class08529 class08529 = this.N.s.get(var1);
      if (class08529 == null) {
         class08874.P.warn("Requested a model that was not discovered previously: {}", var1);
         return this.N.T;
      } else {
         return class08529;
      }
   }

   @Override
   public <T> T N(class02006<T> var1) {
      return (T)this.i.computeIfAbsent(var1, this.R);
   }

   @Override
   public class08877 N() {
      return this.u.N();
   }
}
