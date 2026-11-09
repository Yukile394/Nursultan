package minecraft;

import java.net.Proxy;
import org.jspecify.annotations.Nullable;

public class class05133 {
   @Nullable
   private static Proxy N;

   public class05133() {
      super();
   }

   @Nullable
   public static Proxy N() {
      return N;
   }

   public static void N(Proxy var0) {
      if (N == null) {
         N = var0;
      }
   }
}
