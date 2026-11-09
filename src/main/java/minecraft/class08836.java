package minecraft;

import java.util.Map;

public class class08836 {
   public static final class08836 N = new class08836(Map.of());
   private final Map<class00891, class00368<?>> y;

   public class08836(Map<class00891, class00368<?>> var1) {
      super();
      this.y = var1;
   }

   public static class08836 N(class00331 var0) {
      return new class08836(class00333.N(var0));
   }

   public void N(class00891 var1, class03662 var2, class01421 var3, class01237 var4, int var5, int var6, int var7) {
      class00368<?> class00368 = this.y.get(var1);
      if (class00368 != null) {
         class00368.N(null, var2, var3, var4, var5, var6, false, var7);
      }
   }
}
