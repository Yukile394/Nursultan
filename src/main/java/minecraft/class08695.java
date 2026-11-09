package minecraft;

import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogListeners;
import org.slf4j.event.Level;

public class class08695 {
   private static boolean N;

   public class08695() {
      super();
   }

   private static int N(Level var0) {
      return switch (var0) {
         case DEBUG -> 11184810;
         case WARN -> 16777130;
         case ERROR -> 16755370;
         default -> 16777215;
      };
   }

   public static void N() {
      if (!N) {
         TracyClient.load();
         if (TracyClient.isAvailable()) {
            LogListeners.addListener("Tracy", (var0, var1) -> TracyClient.message(var0, N(var1)));
            N = true;
         }
      }
   }
}
