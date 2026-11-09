package minecraft;

import java.util.IllegalFormatException;
import java.util.Locale;

public class class08392 {
   private static volatile class07018 N = class07018.y();

   private class08392() {
      super();
   }

   static void N(class07018 var0) {
      N = var0;
   }

   public static boolean N(String var0) {
      return N.N(var0);
   }

   public static String N(String var0, Object... var1) {
      String s = N.y(var0);

      try {
         return String.format(Locale.ROOT, s, var1);
      } catch (IllegalFormatException illegalformatexception) {
         return "Format error: " + s;
      }
   }
}
