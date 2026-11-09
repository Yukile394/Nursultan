package minecraft;

import java.io.File;
import java.time.Duration;

public class class02727 {
   private static final Duration N = Duration.ofSeconds(15L);

   public class02727() {
      super();
   }

   public static void N(File var0, long var1) {
      Thread thread = new Thread(() -> {
         try {
            Thread.sleep(N);
         } catch (InterruptedException interruptedexception) {
            return;
         }

         class07080 class07080 = class05615.N("Client shutdown", var1);
         class06202.N(var0, class07080);
      });
      thread.setDaemon(true);
      thread.setName("Client shutdown watchdog");
      thread.start();
   }
}
